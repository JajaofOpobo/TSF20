package org.acra.collector;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.acra.ACRA;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SettingsCollector {
    SettingsCollector() {
    }

    public static String collectSystemSettings(Context context) {
        Field[] fields;
        StringBuilder sb = new StringBuilder();
        for (Field field : Settings.System.class.getFields()) {
            if (!field.isAnnotationPresent(Deprecated.class) && field.getType() == String.class) {
                try {
                    String string = Settings.System.getString(context.getContentResolver(), (String) field.get(null));
                    if (string != null) {
                        sb.append(field.getName()).append("=").append((Object) string).append("\n");
                    }
                } catch (IllegalAccessException e) {
                    ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e);
                } catch (IllegalArgumentException e2) {
                    ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e2);
                }
            }
        }
        return sb.toString();
    }

    public static String collectSecureSettings(Context context) {
        Field[] fields;
        StringBuilder sb = new StringBuilder();
        for (Field field : Settings.Secure.class.getFields()) {
            if (!field.isAnnotationPresent(Deprecated.class) && field.getType() == String.class && isAuthorized(field)) {
                try {
                    String string = Settings.Secure.getString(context.getContentResolver(), (String) field.get(null));
                    if (string != null) {
                        sb.append(field.getName()).append("=").append((Object) string).append("\n");
                    }
                } catch (IllegalAccessException e) {
                    ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e);
                } catch (IllegalArgumentException e2) {
                    ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e2);
                }
            }
        }
        return sb.toString();
    }

    public static String collectGlobalSettings(Context context) {
        Object invoke;
        if (Compatibility.getAPILevel() < 17) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Class<?> cls = Class.forName("android.provider.Settings$Global");
            Field[] fields = cls.getFields();
            Method method = cls.getMethod("getString", ContentResolver.class, String.class);
            for (Field field : fields) {
                if (!field.isAnnotationPresent(Deprecated.class) && field.getType() == String.class && isAuthorized(field) && (invoke = method.invoke(null, context.getContentResolver(), (String) field.get(null))) != null) {
                    sb.append(field.getName()).append("=").append(invoke).append("\n");
                }
            }
        } catch (ClassNotFoundException e) {
            ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e);
        } catch (IllegalAccessException e2) {
            ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e2);
        } catch (IllegalArgumentException e3) {
            ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e3);
        } catch (NoSuchMethodException e4) {
            ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e4);
        } catch (SecurityException e5) {
            ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e5);
        } catch (InvocationTargetException e6) {
            ACRA.log.mo2w(ACRA.LOG_TAG, "Error : ", e6);
        }
        return sb.toString();
    }

    private static boolean isAuthorized(Field field) {
        if (field == null || field.getName().startsWith("WIFI_AP")) {
            return false;
        }
        for (String str : ACRA.getConfig().excludeMatchingSettingsKeys()) {
            if (field.getName().matches(str)) {
                return false;
            }
        }
        return true;
    }
}
