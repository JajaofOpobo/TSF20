package org.acra.collector;

import android.content.Context;
import android.text.format.Time;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import org.acra.ACRA;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DropBoxCollector {
    private static final String NO_RESULT = "N/A";
    private static final String[] SYSTEM_TAGS = {"system_app_anr", "system_app_wtf", "system_app_crash", "system_server_anr", "system_server_wtf", "system_server_crash", "BATTERY_DISCHARGE_INFO", "SYSTEM_RECOVERY_LOG", "SYSTEM_BOOT", "SYSTEM_LAST_KMSG", "APANIC_CONSOLE", "APANIC_THREADS", "SYSTEM_RESTART", "SYSTEM_TOMBSTONE", "data_app_strictmode"};

    DropBoxCollector() {
    }

    public static String read(Context context, String[] strArr) {
        try {
            String dropBoxServiceName = Compatibility.getDropBoxServiceName();
            if (dropBoxServiceName == null) {
                return NO_RESULT;
            }
            Object systemService = context.getSystemService(dropBoxServiceName);
            Method method = systemService.getClass().getMethod("getNextEntry", String.class, Long.TYPE);
            if (method == null) {
                return "";
            }
            Time time = new Time();
            time.setToNow();
            time.minute -= ACRA.getConfig().dropboxCollectionMinutes();
            time.normalize(false);
            long millis = time.toMillis(false);
            ArrayList<String> arrayList = new ArrayList();
            if (ACRA.getConfig().includeDropBoxSystemTags()) {
                arrayList.addAll(Arrays.asList(SYSTEM_TAGS));
            }
            if (strArr != null && strArr.length > 0) {
                arrayList.addAll(Arrays.asList(strArr));
            }
            if (arrayList.isEmpty()) {
                return "No tag configured for collection.";
            }
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                sb.append("Tag: ").append(str).append('\n');
                Object invoke = method.invoke(systemService, str, Long.valueOf(millis));
                if (invoke == null) {
                    sb.append("Nothing.").append('\n');
                } else {
                    Method method2 = invoke.getClass().getMethod("getText", Integer.TYPE);
                    Method method3 = invoke.getClass().getMethod("getTimeMillis", null);
                    Method method4 = invoke.getClass().getMethod("close", null);
                    Object obj = invoke;
                    while (obj != null) {
                        long longValue = ((Long) method3.invoke(obj, null)).longValue();
                        time.set(longValue);
                        sb.append("@").append(time.format2445()).append('\n');
                        String str2 = (String) method2.invoke(obj, 500);
                        if (str2 != null) {
                            sb.append("Text: ").append(str2).append('\n');
                        } else {
                            sb.append("Not Text!").append('\n');
                        }
                        method4.invoke(obj, null);
                        obj = method.invoke(systemService, str, Long.valueOf(longValue));
                    }
                }
            }
            return sb.toString();
        } catch (IllegalAccessException e) {
            ACRA.log.mo7i(ACRA.LOG_TAG, "DropBoxManager not available.");
            return NO_RESULT;
        } catch (IllegalArgumentException e2) {
            ACRA.log.mo7i(ACRA.LOG_TAG, "DropBoxManager not available.");
            return NO_RESULT;
        } catch (NoSuchFieldException e3) {
            ACRA.log.mo7i(ACRA.LOG_TAG, "DropBoxManager not available.");
            return NO_RESULT;
        } catch (NoSuchMethodException e4) {
            ACRA.log.mo7i(ACRA.LOG_TAG, "DropBoxManager not available.");
            return NO_RESULT;
        } catch (SecurityException e5) {
            ACRA.log.mo7i(ACRA.LOG_TAG, "DropBoxManager not available.");
            return NO_RESULT;
        } catch (InvocationTargetException e6) {
            ACRA.log.mo7i(ACRA.LOG_TAG, "DropBoxManager not available.");
            return NO_RESULT;
        }
    }
}
