/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.launcher3.config;

import com.android.launcher3.LauncherState;
import com.android.launcher3.states.OverviewState;

/**
 * Defines a set of flags used to control various launcher behaviors.
 *
 * All the flags should be defined here with appropriate default values. To override a value,
 * redefine it in {@link FeatureFlags}.
 *
 * This class is kept package-private to prevent direct access.
 */
abstract class BaseFlags {

    BaseFlags() {}

    public static final boolean IS_DOGFOOD_BUILD = false;

    // Custom flags go below this
    public static boolean LAUNCHER3_DISABLE_ICON_NORMALIZATION = false;
    public static boolean LAUNCHER3_DISABLE_PINCH_TO_OVERVIEW = false;
    // When enabled allows to use any point on the fast scrollbar to start dragging.
    public static final boolean LAUNCHER3_DIRECT_SCROLL = true;
    // When enabled the promise icon is visible in all apps while installation an app.
    public static final boolean LAUNCHER3_PROMISE_APPS_IN_ALL_APPS = false;
    // When enabled allows use of physics based motions in the Launcher.
    public static final boolean LAUNCHER3_PHYSICS = true;
    // When enabled allows use of spring motions on the icons.
    public static final boolean LAUNCHER3_SPRING_ICONS = true;

    // Feature flag to enable moving the QSB on the 0th screen of the workspace.
    public static final boolean QSB_ON_FIRST_SCREEN = true;
    // When enabled the all-apps icon is not added to the hotseat.
    public static final boolean NO_ALL_APPS_ICON = true;
    // When enabled, icons not supporting {@link AdaptiveIconDrawable} will be wrapped in {@link FixedScaleDrawable}.
    public static final boolean LEGACY_ICON_TREATMENT = true;
    // When enabled, adaptive icons would have shadows baked when being stored to icon cache.
    public static final boolean ADAPTIVE_ICON_SHADOW = true;
    // When enabled, app discovery will be enabled if service is implemented
    public static final boolean DISCOVERY_ENABLED = false;

    // When true, custom widgets are loaded using CustomWidgetParser.
    public static final boolean ENABLE_CUSTOM_WIDGETS = false;

    // Features to control Launcher3Go behavior
    public static final boolean GO_DISABLE_WIDGETS = false;

    public static LauncherState createOverviewState(int id) {
        return new OverviewState(id);
    }
}
