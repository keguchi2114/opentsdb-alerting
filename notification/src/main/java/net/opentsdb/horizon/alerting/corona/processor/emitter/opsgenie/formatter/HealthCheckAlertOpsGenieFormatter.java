/*
 *  This file is part of OpenTSDB.
 *  Copyright (C) 2021 Yahoo.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.opentsdb.horizon.alerting.corona.processor.emitter.opsgenie.formatter;

import net.opentsdb.horizon.alerting.corona.model.alert.impl.HealthCheckAlert;
import net.opentsdb.horizon.alerting.corona.processor.emitter.view.impl.HealthCheckAlertView;
import net.opentsdb.horizon.alerting.corona.processor.emitter.view.impl.HealthCheckMessageKitView;

public class HealthCheckAlertOpsGenieFormatter
        extends AbstractOpsGenieFormatter<
        HealthCheckAlert,
        HealthCheckAlertView,
        HealthCheckMessageKitView
        >
{
    /* ------------ Constructors ------------ */

    public HealthCheckAlertOpsGenieFormatter(final String user,
                                             final String source)
    {
        super(user, source, "templates/opsgenie-health-check-alert.html");
    }
}
