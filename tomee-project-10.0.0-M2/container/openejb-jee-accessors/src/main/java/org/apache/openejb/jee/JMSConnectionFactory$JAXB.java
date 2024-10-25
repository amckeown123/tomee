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
package org.apache.openejb.jee;

import org.metatype.sxc.jaxb.JAXBObject;
import org.metatype.sxc.jaxb.LifecycleCallback;
import org.metatype.sxc.jaxb.RuntimeContext;
import org.metatype.sxc.util.Attribute;
import org.metatype.sxc.util.XoXMLStreamReader;
import org.metatype.sxc.util.XoXMLStreamWriter;

import javax.xml.XMLConstants;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

import static org.apache.openejb.jee.Property$JAXB.readProperty;
import static org.apache.openejb.jee.Text$JAXB.readText;

@SuppressWarnings({
    "StringEquality"
})
public class JMSConnectionFactory$JAXB
    extends JAXBObject<JMSConnectionFactory> {


    public JMSConnectionFactory$JAXB() {
        super(JMSConnectionFactory.class, null, new QName("http://java.sun.com/xml/ns/javaee".intern(), "jms-connection-factoryType".intern()), Text$JAXB.class, Property$JAXB.class);
    }

    public static JMSConnectionFactory readJMSConnectionFactory(final XoXMLStreamReader reader, final RuntimeContext context)
        throws Exception {
        return _read(reader, context);
    }

    public void write(final XoXMLStreamWriter writer, final JMSConnectionFactory JMSConnectionFactory, final RuntimeContext context)
        throws Exception {
        _write(writer, JMSConnectionFactory, context);
    }

    public final static JMSConnectionFactory _read(final XoXMLStreamReader reader, RuntimeContext context)
        throws Exception {

        // Check for xsi:nil
        if (reader.isXsiNil()) {
            return null;
        }

        if (context == null) {
            context = new RuntimeContext();
        }

        final JMSConnectionFactory JMSConnectionFactory = new JMSConnectionFactory();
        context.beforeUnmarshal(JMSConnectionFactory, LifecycleCallback.NONE);

        ArrayList<Text> descriptions = null;
        List<Property> property = null;

        // Check xsi:type
        final QName xsiType = reader.getXsiType();
        if (xsiType != null) {
            if (("jms-connection-factoryType" != xsiType.getLocalPart()) || ("http://java.sun.com/xml/ns/javaee" != xsiType.getNamespaceURI())) {
                return context.unexpectedXsiType(reader, JMSConnectionFactory.class);
            }
        }

        // Read attributes
        for (final Attribute attribute : reader.getAttributes()) {
            if (("id" == attribute.getLocalName()) && (("" == attribute.getNamespace()) || (attribute.getNamespace() == null))) {
                // ATTRIBUTE: id
                final String id = Adapters.collapsedStringAdapterAdapter.unmarshal(attribute.getValue());
                context.addXmlId(reader, id, JMSConnectionFactory);
                JMSConnectionFactory.id = id;
            } else if (XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI != attribute.getNamespace()) {
                context.unexpectedAttribute(attribute, new QName("", "id"));
            }
        }

        // Read elements
        for (final XoXMLStreamReader elementReader : reader.getChildElements()) {
            if (("description" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: descriptions
                final Text descriptionsItem = readText(elementReader, context);
                if (descriptions == null) {
                    descriptions = new ArrayList<Text>();
                }
                descriptions.add(descriptionsItem);
            } else if (("name" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: name
                final String nameRaw = elementReader.getElementAsString();

                final String name;
                try {
                    name = Adapters.collapsedStringAdapterAdapter.unmarshal(nameRaw);
                } catch (final Exception e) {
                    context.xmlAdapterError(elementReader, CollapsedStringAdapter.class, String.class, String.class, e);
                    continue;
                }

                JMSConnectionFactory.name = name;
            } else if (("class-name" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: name
                final String nameRaw = elementReader.getElementAsString();

                final String name;
                try {
                    name = Adapters.collapsedStringAdapterAdapter.unmarshal(nameRaw);
                } catch (final Exception e) {
                    context.xmlAdapterError(elementReader, CollapsedStringAdapter.class, String.class, String.class, e);
                    continue;
                }

                JMSConnectionFactory.className = name;
            } else if (("interface-name" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: name
                final String nameRaw = elementReader.getElementAsString();

                final String name;
                try {
                    name = Adapters.collapsedStringAdapterAdapter.unmarshal(nameRaw);
                } catch (final Exception e) {
                    context.xmlAdapterError(elementReader, CollapsedStringAdapter.class, String.class, String.class, e);
                    continue;
                }

                JMSConnectionFactory.className = name;
            } else if (("resource-adapter" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: name
                final String nameRaw = elementReader.getElementAsString();

                final String name;
                try {
                    name = Adapters.collapsedStringAdapterAdapter.unmarshal(nameRaw);
                } catch (final Exception e) {
                    context.xmlAdapterError(elementReader, CollapsedStringAdapter.class, String.class, String.class, e);
                    continue;
                }

                JMSConnectionFactory.resourceAdapter = name;
            } else if (("user" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: name
                final String nameRaw = elementReader.getElementAsString();

                final String name;
                try {
                    name = Adapters.collapsedStringAdapterAdapter.unmarshal(nameRaw);
                } catch (final Exception e) {
                    context.xmlAdapterError(elementReader, CollapsedStringAdapter.class, String.class, String.class, e);
                    continue;
                }

                JMSConnectionFactory.user = name;
            } else if (("password" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: name
                final String nameRaw = elementReader.getElementAsString();

                final String name;
                try {
                    name = Adapters.collapsedStringAdapterAdapter.unmarshal(nameRaw);
                } catch (final Exception e) {
                    context.xmlAdapterError(elementReader, CollapsedStringAdapter.class, String.class, String.class, e);
                    continue;
                }

                JMSConnectionFactory.password = name;
            } else if (("client-id" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: name
                final String nameRaw = elementReader.getElementAsString();

                final String name;
                try {
                    name = Adapters.collapsedStringAdapterAdapter.unmarshal(nameRaw);
                } catch (final Exception e) {
                    context.xmlAdapterError(elementReader, CollapsedStringAdapter.class, String.class, String.class, e);
                    continue;
                }

                JMSConnectionFactory.clientId = name;
            } else if (("max-pool-size" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                final Integer portNumber = Integer.valueOf(elementReader.getElementAsString());
                JMSConnectionFactory.maxPoolSize = portNumber;
            } else if (("min-pool-size" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                final Integer portNumber = Integer.valueOf(elementReader.getElementAsString());
                JMSConnectionFactory.minPoolSize = portNumber;
            } else if (("transactional" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                JMSConnectionFactory.transactional = Boolean.parseBoolean(elementReader.getElementAsString());
            } else if (("property" == elementReader.getLocalName()) && ("http://java.sun.com/xml/ns/javaee" == elementReader.getNamespaceURI())) {
                // ELEMENT: property
                final Property propertyItem = readProperty(elementReader, context);
                if (property == null) {
                    property = JMSConnectionFactory.property;
                    if (property != null) {
                        property.clear();
                    } else {
                        property = new ArrayList<>();
                    }
                }
                property.add(propertyItem);
            } else if (!Boolean.getBoolean("tomee.xml.passthrough")) { // so to pass if not important
                context.unexpectedElement(elementReader, new QName("http://java.sun.com/xml/ns/javaee", "description"), new QName("http://java.sun.com/xml/ns/javaee", "name"), new QName("http://java.sun.com/xml/ns/javaee", "class-name"), new QName("http://java.sun.com/xml/ns/javaee", "server-name"), new QName("http://java.sun.com/xml/ns/javaee", "port-number"), new QName("http://java.sun.com/xml/ns/javaee", "database-name"), new QName("http://java.sun.com/xml/ns/javaee", "url"), new QName("http://java.sun.com/xml/ns/javaee", "user"), new QName("http://java.sun.com/xml/ns/javaee", "password"), new QName("http://java.sun.com/xml/ns/javaee", "property"), new QName("http://java.sun.com/xml/ns/javaee", "login-timeout"), new QName("http://java.sun.com/xml/ns/javaee", "transactional"), new QName("http://java.sun.com/xml/ns/javaee", "isolation-level"), new QName("http://java.sun.com/xml/ns/javaee", "initial-pool-size"), new QName("http://java.sun.com/xml/ns/javaee", "max-pool-size"), new QName("http://java.sun.com/xml/ns/javaee", "min-pool-size"), new QName("http://java.sun.com/xml/ns/javaee", "max-idle-time"), new QName("http://java.sun.com/xml/ns/javaee", "max-statements"));
            }
        }
        if (descriptions != null) {
            try {
                JMSConnectionFactory.description.set(descriptions.toArray(new Text[descriptions.size()]));
            } catch (final Exception e) {
                context.setterError(reader, JMSConnectionFactory.class, "setDescriptions", Text[].class, e);
            }
        }
        if (property != null) {
            JMSConnectionFactory.property = property;
        }

        context.afterUnmarshal(JMSConnectionFactory, LifecycleCallback.NONE);

        return JMSConnectionFactory;
    }

    public final JMSConnectionFactory read(final XoXMLStreamReader reader, final RuntimeContext context)
        throws Exception {
        return _read(reader, context);
    }

    public final static void _write(final XoXMLStreamWriter writer, final JMSConnectionFactory JMSConnectionFactory, RuntimeContext context)
        throws Exception {
        // no-op while not useful
    }

}
