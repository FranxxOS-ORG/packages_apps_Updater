/*
 * Copyright (C) 2017-2023 The LineageOS Project
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
package org.voidui.updater.misc;

public final class Constants {

    private Constants() {
    }

    public static final String AB_PAYLOAD_BIN_PATH = "payload.bin";
    public static final String AB_PAYLOAD_PROPERTIES_PATH = "payload_properties.txt";

    public static final int AUTO_UPDATES_CHECK_INTERVAL_NEVER = 0;
    public static final int AUTO_UPDATES_CHECK_INTERVAL_DAILY = 1;
    public static final int AUTO_UPDATES_CHECK_INTERVAL_WEEKLY = 2;
    public static final int AUTO_UPDATES_CHECK_INTERVAL_MONTHLY = 3;

    public static final String PREF_LAST_UPDATE_CHECK = "last_update_check";
    public static final String PREF_AUTO_UPDATES_CHECK_INTERVAL = "auto_updates_check_interval";
    public static final String PREF_AUTO_DELETE_UPDATES = "auto_delete_updates";
    public static final String PREF_METERED_NETWORK_WARNING = "pref_metered_network_warning";
    public static final String PREF_MOBILE_DATA_WARNING = "pref_mobile_data_warning";
    public static final String PREF_NEEDS_REBOOT_ID = "needs_reboot_id";

    public static final String UNCRYPT_FILE_EXT = ".uncrypt";

    public static final String PROP_BUILD_DATE = "ro.build.date.utc";
    public static final String PROP_BUILD_VERSION = "org.voidui.version";
    public static final String PROP_DEVICE = "org.voidui.device";
    public static final String PROP_NEXT_DEVICE = "ro.updater.next_device";
    public static final String PROP_UPDATER_ALLOW_DOWNGRADING = "voidui.updater.allow_downgrading";

    public static final String PREF_INSTALL_OLD_TIMESTAMP = "install_old_timestamp";
    public static final String PREF_INSTALL_NEW_TIMESTAMP = "install_new_timestamp";
    public static final String PREF_INSTALL_PACKAGE_PATH = "install_package_path";
    public static final String PREF_INSTALL_AGAIN = "install_again";
    public static final String PREF_INSTALL_NOTIFIED = "install_notified";

    public static final String UPDATE_RECOVERY_EXEC = "/vendor/bin/install-recovery.sh";
    public static final String UPDATE_RECOVERY_PROPERTY = "persist.vendor.recovery_update";

    public static final String HAS_SEEN_INFO_DIALOG = "has_seen_info_dialog";
}