/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.powermodel.component;

import com.android.powermodel.ActivityReport;
import com.android.powermodel.AttributionKey;
import com.android.powermodel.ComponentActivity;

/**
 * Encapsulates total work done by the modem for the device.
 */
public class ModemGlobalActivity extends ComponentActivity {
    /**
     * Construct a new ModemGlobalActivity.
     */
    public ModemGlobalActivity(AttributionKey attribution) {
        super(attribution);
    }

    /**
     * Returns the total number of packets received in the whole device.
     */
    public long rxPacketCount;

    /**
     * Returns the total number of packets sent in the whole device.
     */
    public long txPacketCount;

    /**
     * Returns the total time the radio was active in the whole device.
     */
    public long totalActiveTimeMs;
}

