/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.openejb.jee;

import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class Adapters {

    public static final CollapsedStringAdapter collapsedStringAdapterAdapter = new CollapsedStringAdapter();
    public static final StringAdapter stringAdapterAdapter = new StringAdapter();
    public static final HandlerChainsStringQNameAdapter handlerChainsStringQNameAdapterAdapter = new HandlerChainsStringQNameAdapter();
    public static final TimeUnitAdapter timeUnitAdapterAdapter = new TimeUnitAdapter();
    public static final BooleanAdapter booleanAdapterAdapter = new BooleanAdapter();
    public static final TrimStringAdapter trimStringAdapterAdapter = new TrimStringAdapter();
    public static final LoadOnStartupAdapter loadOnStartupAdapterAdapter = new LoadOnStartupAdapter();

}
