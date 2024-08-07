/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
    * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.junit5;

import org.apache.openejb.api.LocalClient;
import org.apache.openejb.junit.ContextConfig;
import org.apache.openejb.junit.Property;
import org.apache.openejb.junit.RunTestAs;
import org.apache.openejb.junit5.ejbs.BasicEjbLocal;
import org.apache.openejb.junit5.ejbs.SecuredEjbLocal;
import org.junit.jupiter.api.Test;

import jakarta.ejb.EJB;
import jakarta.ejb.EJBAccessException;

import static org.junit.jupiter.api.Assertions.*;


@ContextConfig(properties = {
    @Property("openejb.deployments.classpath.include=.*openejb-junit5-backward.*"),
    @Property("java.naming.factory.initial=org.apache.openejb.core.LocalInitialContextFactory")
})
@RunWithOpenEjb
@RunTestAs("RoleA")
@LocalClient
public class TestEjbSecurityRunTestAs {
    @EJB
    private BasicEjbLocal basicEjb;

    @EJB
    private SecuredEjbLocal securedEjb;

    public TestEjbSecurityRunTestAs() {
    }

    @Test
    public void testEjbInjection() {
        assertNotNull(basicEjb);
        assertNotNull(securedEjb);
    }

    @Test
    public void testClassLevelSecurity() {
        assertNotNull(securedEjb);

        assertEquals("Unsecured Works", basicEjb.concat("Unsecured", "Works"));
        assertEquals("Dual Role Works", securedEjb.dualRole());
        assertEquals("RoleA Works", securedEjb.roleA());

        try {
            securedEjb.roleB();
            fail("Able to execute a method for which we shouldn't have access.");
        } catch (final EJBAccessException e) {
        }
    }

    @Test
    @RunTestAs("RoleB")
    public void testMethodLevelSecurity() {
        assertNotNull(securedEjb);

        assertEquals("Unsecured Works", basicEjb.concat("Unsecured", "Works"));
        assertEquals("Dual Role Works", securedEjb.dualRole());
        assertEquals("RoleB Works", securedEjb.roleB());

        try {
            securedEjb.roleA();
            fail("Able to execute a method for which we shouldn't have access.");
        } catch (final EJBAccessException e) {
        }
    }
}
