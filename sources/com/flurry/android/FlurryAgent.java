package com.flurry.android;

import android.content.Context;
import android.location.Criteria;
import android.os.Build;
import com.flurry.sdk.C1173cx;
import com.flurry.sdk.C1206dl;
import com.flurry.sdk.C1210dn;
import com.flurry.sdk.C1212dp;
import com.flurry.sdk.C1225dz;
import com.flurry.sdk.C1258eo;
import com.flurry.sdk.C1277fe;
import java.util.Date;
import java.util.Map;
/* loaded from: classes.dex */
public final class FlurryAgent {

    /* renamed from: a */
    private static final String f3726a = FlurryAgent.class.getSimpleName();

    private FlurryAgent() {
    }

    public static void setVersionName(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String versionName passed to setVersionName was null.");
        } else {
            C1212dp.m9380a().m9375a("VersionName", (Object) str);
        }
    }

    public static int getAgentVersion() {
        return C1210dn.m9402a().m9401b();
    }

    public static String getReleaseVersion() {
        return C1210dn.m9402a().m9396g();
    }

    public static void setReportLocation(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1212dp.m9380a().m9375a("ReportLocation", (Object) Boolean.valueOf(z));
        }
    }

    public static void setLocation(float f, float f2) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1225dz.m9343a().m9342a(f, f2);
        }
    }

    public static void clearLocation() {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1225dz.m9343a().m9332e();
        }
    }

    public static void setLogEnabled(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (z) {
            C1258eo.m9229b();
        } else {
            C1258eo.m9236a();
        }
    }

    public static void setLogLevel(int i) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1258eo.m9235a(i);
        }
    }

    public static void setContinueSessionMillis(long j) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (j < 5000) {
            C1258eo.m9226b(f3726a, "Invalid time set for session resumption: " + j);
        } else {
            C1212dp.m9380a().m9375a("ContinueSessionMillis", (Object) Long.valueOf(j));
        }
    }

    public static void setLogEvents(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1212dp.m9380a().m9375a("LogEvents", (Object) Boolean.valueOf(z));
        }
    }

    public static void setUseHttps(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1212dp.m9380a().m9375a("UseHttps", (Object) Boolean.valueOf(z));
        }
    }

    public static boolean getUseHttps() {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
            return false;
        }
        return ((Boolean) C1212dp.m9380a().m9377a("UseHttps")).booleanValue();
    }

    public static void setCaptureUncaughtExceptions(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1212dp.m9380a().m9375a("CaptureUncaughtExceptions", (Object) Boolean.valueOf(z));
        }
    }

    public static void addOrigin(String str, String str2) {
        addOrigin(str, str2, null);
    }

    public static void addOrigin(String str, String str2, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("originName not specified");
        } else {
            if (str2 == null || str2.length() == 0) {
                throw new IllegalArgumentException("originVersion not specified");
            }
            try {
                C1173cx.m9587a().m9583a(str, str2, map);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "", th);
            }
        }
    }

    public static void onStartSession(Context context, String str) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (context == null) {
            throw new NullPointerException("Null context");
        } else {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Api key not specified");
            }
            try {
                C1206dl.m9414a().m9412a(context, str);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "", th);
            }
        }
    }

    public static void onEndSession(Context context) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (context == null) {
            throw new NullPointerException("Null context");
        } else {
            try {
                C1206dl.m9414a().m9413a(context);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "", th);
            }
        }
    }

    public static void logEvent(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to logEvent was null.");
        } else {
            try {
                C1173cx.m9587a().m9586a(str);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "Failed to log event: " + str, th);
            }
        }
    }

    public static void logEvent(String str, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to logEvent was null.");
        } else if (map == null) {
            C1258eo.m9226b(f3726a, "String parameters passed to logEvent was null.");
        } else {
            try {
                C1173cx.m9587a().m9582a(str, map);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "Failed to log event: " + str, th);
            }
        }
    }

    public static void logEvent(String str, boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to logEvent was null.");
        } else {
            try {
                C1173cx.m9587a().m9580a(str, z);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "Failed to log event: " + str, th);
            }
        }
    }

    public static void logEvent(String str, Map<String, String> map, boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to logEvent was null.");
        } else if (map == null) {
            C1258eo.m9226b(f3726a, "String parameters passed to logEvent was null.");
        } else {
            try {
                C1173cx.m9587a().m9581a(str, map, z);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "Failed to log event: " + str, th);
            }
        }
    }

    public static void endTimedEvent(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to endTimedEvent was null.");
        } else {
            try {
                C1173cx.m9587a().m9577b(str);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "Failed to signify the end of event: " + str, th);
            }
        }
    }

    public static void endTimedEvent(String str, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to endTimedEvent was null.");
        } else if (map == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to endTimedEvent was null.");
        } else {
            try {
                C1173cx.m9587a().m9576b(str, map);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "Failed to signify the end of event: " + str, th);
            }
        }
    }

    @Deprecated
    public static void onError(String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String errorId passed to onError was null.");
        } else if (str2 == null) {
            C1258eo.m9226b(f3726a, "String message passed to onError was null.");
        } else if (str3 == null) {
            C1258eo.m9226b(f3726a, "String errorClass passed to onError was null.");
        } else {
            try {
                C1173cx.m9587a().m9585a(str, str2, str3);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "", th);
            }
        }
    }

    public static void onError(String str, String str2, Throwable th) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String errorId passed to onError was null.");
        } else if (str2 == null) {
            C1258eo.m9226b(f3726a, "String message passed to onError was null.");
        } else if (th == null) {
            C1258eo.m9226b(f3726a, "Throwable passed to onError was null.");
        } else {
            try {
                C1173cx.m9587a().m9584a(str, str2, th);
            } catch (Throwable th2) {
                C1258eo.m9231a(f3726a, "", th2);
            }
        }
    }

    @Deprecated
    public static void onEvent(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to onEvent was null.");
        } else {
            try {
                C1173cx.m9587a().m9574c(str);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "", th);
            }
        }
    }

    @Deprecated
    public static void onEvent(String str, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String eventId passed to onEvent was null.");
        } else if (map == null) {
            C1258eo.m9226b(f3726a, "Parameters Map passed to onEvent was null.");
        } else {
            try {
                C1173cx.m9587a().m9573c(str, map);
            } catch (Throwable th) {
                C1258eo.m9231a(f3726a, "", th);
            }
        }
    }

    public static void onPageView() {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
            return;
        }
        try {
            C1173cx.m9587a().m9575c();
        } catch (Throwable th) {
            C1258eo.m9231a(f3726a, "", th);
        }
    }

    public static void setReportUrl(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1212dp.m9380a().m9375a("ReportUrl", (Object) str);
        }
    }

    public static void setLocationCriteria(Criteria criteria) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else {
            C1212dp.m9380a().m9375a("LocationCriteria", (Object) criteria);
        }
    }

    public static void setAge(int i) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (i > 0 && i < 110) {
            C1212dp.m9380a().m9375a("Age", (Object) Long.valueOf(new Date(new Date(System.currentTimeMillis() - (i * 31449600000L)).getYear(), 1, 1).getTime()));
        }
    }

    public static void setGender(byte b) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
            return;
        }
        switch (b) {
            case 0:
            case 1:
                C1212dp.m9380a().m9375a("Gender", (Object) Byte.valueOf(b));
                return;
            default:
                C1212dp.m9380a().m9375a("Gender", (Object) (byte) -1);
                return;
        }
    }

    public static void setUserId(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            C1258eo.m9226b(f3726a, "Device SDK Version older than 10");
        } else if (str == null) {
            C1258eo.m9226b(f3726a, "String userId passed to setUserId was null.");
        } else {
            C1212dp.m9380a().m9375a("UserId", (Object) C1277fe.m9150a(str));
        }
    }
}
