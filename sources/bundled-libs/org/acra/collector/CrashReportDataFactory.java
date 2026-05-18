package org.acra.collector;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.text.format.Time;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.util.Installation;
import org.acra.util.PackageManagerWrapper;
import org.acra.util.ReportUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class CrashReportDataFactory {
    private final Time appStartDate;
    private final Context context;
    private final Map<String, String> customParameters = new LinkedHashMap();
    private final String initialConfiguration;
    private final SharedPreferences prefs;

    public CrashReportDataFactory(Context context, SharedPreferences sharedPreferences, Time time, String str) {
        this.context = context;
        this.prefs = sharedPreferences;
        this.appStartDate = time;
        this.initialConfiguration = str;
    }

    public String putCustomData(String str, String str2) {
        return this.customParameters.put(str, str2);
    }

    public String removeCustomData(String str) {
        return this.customParameters.remove(str);
    }

    public void clearCustomData() {
        this.customParameters.clear();
    }

    public String getCustomData(String str) {
        return this.customParameters.get(str);
    }

    public CrashReportData createCrashData(String str, Throwable th, Map<String, String> map, boolean z, Thread thread) {
        String deviceId;
        boolean z2 = true;
        CrashReportData crashReportData = new CrashReportData();
        try {
            List<ReportField> reportFields = ACRA.getConfig().getReportFields();
            crashReportData.put(ReportField.STACK_TRACE, getStackTrace(str, th));
            crashReportData.put(ReportField.USER_APP_START_DATE, ReportUtils.getTimeString(this.appStartDate));
            if (z) {
                crashReportData.put(ReportField.IS_SILENT, "true");
            }
            if (reportFields.contains(ReportField.STACK_TRACE_HASH)) {
                crashReportData.put(ReportField.STACK_TRACE_HASH, getStackTraceHash(th));
            }
            if (reportFields.contains(ReportField.REPORT_ID)) {
                crashReportData.put(ReportField.REPORT_ID, UUID.randomUUID().toString());
            }
            if (reportFields.contains(ReportField.INSTALLATION_ID)) {
                crashReportData.put(ReportField.INSTALLATION_ID, Installation.id(this.context));
            }
            if (reportFields.contains(ReportField.INITIAL_CONFIGURATION)) {
                crashReportData.put(ReportField.INITIAL_CONFIGURATION, this.initialConfiguration);
            }
            if (reportFields.contains(ReportField.CRASH_CONFIGURATION)) {
                crashReportData.put(ReportField.CRASH_CONFIGURATION, ConfigurationCollector.collectConfiguration(this.context));
            }
            if (!(th instanceof OutOfMemoryError) && reportFields.contains(ReportField.DUMPSYS_MEMINFO)) {
                crashReportData.put(ReportField.DUMPSYS_MEMINFO, DumpSysCollector.collectMemInfo());
            }
            if (reportFields.contains(ReportField.PACKAGE_NAME)) {
                crashReportData.put(ReportField.PACKAGE_NAME, this.context.getPackageName());
            }
            if (reportFields.contains(ReportField.BUILD)) {
                crashReportData.put(ReportField.BUILD, String.valueOf(ReflectionCollector.collectConstants(Build.class)) + ReflectionCollector.collectConstants(Build.VERSION.class, "VERSION"));
            }
            if (reportFields.contains(ReportField.PHONE_MODEL)) {
                crashReportData.put(ReportField.PHONE_MODEL, Build.MODEL);
            }
            if (reportFields.contains(ReportField.ANDROID_VERSION)) {
                crashReportData.put(ReportField.ANDROID_VERSION, Build.VERSION.RELEASE);
            }
            if (reportFields.contains(ReportField.BRAND)) {
                crashReportData.put(ReportField.BRAND, Build.BRAND);
            }
            if (reportFields.contains(ReportField.PRODUCT)) {
                crashReportData.put(ReportField.PRODUCT, Build.PRODUCT);
            }
            if (reportFields.contains(ReportField.TOTAL_MEM_SIZE)) {
                crashReportData.put(ReportField.TOTAL_MEM_SIZE, Long.toString(ReportUtils.getTotalInternalMemorySize()));
            }
            if (reportFields.contains(ReportField.AVAILABLE_MEM_SIZE)) {
                crashReportData.put(ReportField.AVAILABLE_MEM_SIZE, Long.toString(ReportUtils.getAvailableInternalMemorySize()));
            }
            if (reportFields.contains(ReportField.FILE_PATH)) {
                crashReportData.put(ReportField.FILE_PATH, ReportUtils.getApplicationFilePath(this.context));
            }
            if (reportFields.contains(ReportField.DISPLAY)) {
                crashReportData.put(ReportField.DISPLAY, DisplayManagerCollector.collectDisplays(this.context));
            }
            if (reportFields.contains(ReportField.USER_CRASH_DATE)) {
                Time time = new Time();
                time.setToNow();
                crashReportData.put(ReportField.USER_CRASH_DATE, ReportUtils.getTimeString(time));
            }
            if (reportFields.contains(ReportField.CUSTOM_DATA)) {
                crashReportData.put(ReportField.CUSTOM_DATA, createCustomInfoString(map));
            }
            if (reportFields.contains(ReportField.BUILD_CONFIG)) {
                try {
                    crashReportData.put(ReportField.BUILD_CONFIG, ReflectionCollector.collectConstants(getBuildConfigClass()));
                } catch (ClassNotFoundException e) {
                }
            }
            if (reportFields.contains(ReportField.USER_EMAIL)) {
                crashReportData.put(ReportField.USER_EMAIL, this.prefs.getString(ACRA.PREF_USER_EMAIL_ADDRESS, "N/A"));
            }
            if (reportFields.contains(ReportField.DEVICE_FEATURES)) {
                crashReportData.put(ReportField.DEVICE_FEATURES, DeviceFeaturesCollector.getFeatures(this.context));
            }
            if (reportFields.contains(ReportField.ENVIRONMENT)) {
                crashReportData.put(ReportField.ENVIRONMENT, ReflectionCollector.collectStaticGettersResults(Environment.class));
            }
            if (reportFields.contains(ReportField.SETTINGS_SYSTEM)) {
                crashReportData.put(ReportField.SETTINGS_SYSTEM, SettingsCollector.collectSystemSettings(this.context));
            }
            if (reportFields.contains(ReportField.SETTINGS_SECURE)) {
                crashReportData.put(ReportField.SETTINGS_SECURE, SettingsCollector.collectSecureSettings(this.context));
            }
            if (reportFields.contains(ReportField.SETTINGS_GLOBAL)) {
                crashReportData.put(ReportField.SETTINGS_GLOBAL, SettingsCollector.collectGlobalSettings(this.context));
            }
            if (reportFields.contains(ReportField.SHARED_PREFERENCES)) {
                crashReportData.put(ReportField.SHARED_PREFERENCES, SharedPreferencesCollector.collect(this.context));
            }
            PackageManagerWrapper packageManagerWrapper = new PackageManagerWrapper(this.context);
            PackageInfo packageInfo = packageManagerWrapper.getPackageInfo();
            if (packageInfo != null) {
                if (reportFields.contains(ReportField.APP_VERSION_CODE)) {
                    crashReportData.put(ReportField.APP_VERSION_CODE, Integer.toString(packageInfo.versionCode));
                }
                if (reportFields.contains(ReportField.APP_VERSION_NAME)) {
                    crashReportData.put(ReportField.APP_VERSION_NAME, packageInfo.versionName != null ? packageInfo.versionName : "not set");
                }
            } else {
                crashReportData.put(ReportField.APP_VERSION_NAME, "Package info unavailable");
            }
            if (reportFields.contains(ReportField.DEVICE_ID) && this.prefs.getBoolean(ACRA.PREF_ENABLE_DEVICE_ID, true) && packageManagerWrapper.hasPermission("android.permission.READ_PHONE_STATE") && (deviceId = ReportUtils.getDeviceId(this.context)) != null) {
                crashReportData.put(ReportField.DEVICE_ID, deviceId);
            }
            if (!packageManagerWrapper.hasPermission("android.permission.READ_LOGS") && Compatibility.getAPILevel() < 16) {
                z2 = false;
            }
            if (this.prefs.getBoolean(ACRA.PREF_ENABLE_SYSTEM_LOGS, true) && z2) {
                ACRA.log.i(ACRA.LOG_TAG, "READ_LOGS granted! ACRA can include LogCat and DropBox data.");
                if (reportFields.contains(ReportField.LOGCAT)) {
                    crashReportData.put(ReportField.LOGCAT, LogCatCollector.collectLogCat(null));
                }
                if (reportFields.contains(ReportField.EVENTSLOG)) {
                    crashReportData.put(ReportField.EVENTSLOG, LogCatCollector.collectLogCat("events"));
                }
                if (reportFields.contains(ReportField.RADIOLOG)) {
                    crashReportData.put(ReportField.RADIOLOG, LogCatCollector.collectLogCat("radio"));
                }
                if (reportFields.contains(ReportField.DROPBOX)) {
                    crashReportData.put(ReportField.DROPBOX, DropBoxCollector.read(this.context, ACRA.getConfig().additionalDropBoxTags()));
                }
            } else {
                ACRA.log.i(ACRA.LOG_TAG, "READ_LOGS not allowed. ACRA will not include LogCat and DropBox data.");
            }
            if (reportFields.contains(ReportField.APPLICATION_LOG)) {
                try {
                    crashReportData.put(ReportField.APPLICATION_LOG, LogFileCollector.collectLogFile(this.context, ACRA.getConfig().applicationLogFile(), ACRA.getConfig().applicationLogFileLines()));
                } catch (IOException e2) {
                    ACRA.log.e(ACRA.LOG_TAG, "Error while reading application log file " + ACRA.getConfig().applicationLogFile(), e2);
                }
            }
            if (reportFields.contains(ReportField.MEDIA_CODEC_LIST)) {
                crashReportData.put(ReportField.MEDIA_CODEC_LIST, MediaCodecListCollector.collecMediaCodecList());
            }
            if (reportFields.contains(ReportField.THREAD_DETAILS)) {
                crashReportData.put(ReportField.THREAD_DETAILS, ThreadCollector.collect(thread));
            }
            if (reportFields.contains(ReportField.USER_IP)) {
                crashReportData.put(ReportField.USER_IP, ReportUtils.getLocalIpAddress());
            }
        } catch (RuntimeException e3) {
            ACRA.log.e(ACRA.LOG_TAG, "Error while retrieving crash data", e3);
        }
        return crashReportData;
    }

    private String createCustomInfoString(Map<String, String> map) {
        Map<String, String> map2;
        Map<String, String> map3 = this.customParameters;
        if (map != null) {
            HashMap map4 = new HashMap(map3);
            map4.putAll(map);
            map2 = map4;
        } else {
            map2 = map3;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map2.keySet()) {
            String strReplaceAll = map2.get(str);
            sb.append(str);
            sb.append(" = ");
            if (strReplaceAll != null) {
                strReplaceAll = strReplaceAll.replaceAll("\n", "\\\\n");
            }
            sb.append(strReplaceAll);
            sb.append("\n");
        }
        return sb.toString();
    }

    private String getStackTrace(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        if (str != null && !TextUtils.isEmpty(str)) {
            printWriter.println(str);
        }
        while (th != null) {
            th.printStackTrace(printWriter);
            th = th.getCause();
        }
        String string = stringWriter.toString();
        printWriter.close();
        return string;
    }

    private String getStackTraceHash(Throwable th) {
        StringBuilder sb = new StringBuilder();
        while (th != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append(stackTraceElement.getClassName());
                sb.append(stackTraceElement.getMethodName());
            }
            th = th.getCause();
        }
        return Integer.toHexString(sb.toString().hashCode());
    }

    private Class<?> getBuildConfigClass() throws ClassNotFoundException {
        Class<?> clsBuildConfigClass = ACRA.getConfig().buildConfigClass();
        if (clsBuildConfigClass == null || clsBuildConfigClass.equals(Object.class)) {
            String str = String.valueOf(this.context.getClass().getPackage().getName()) + ".BuildConfig";
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException e) {
                ACRA.log.e(ACRA.LOG_TAG, "Not adding buildConfig to log. Class Not found : " + str + ". Please configure 'buildConfigClass' in your ACRA config");
                throw e;
            }
        }
        return clsBuildConfigClass;
    }
}
