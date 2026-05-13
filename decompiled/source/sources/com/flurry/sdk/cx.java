package com.flurry.sdk;

import com.flurry.android.FlurryAgent;
import com.flurry.sdk.dq;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class cx implements dq.a, Thread.UncaughtExceptionHandler {
    private static final String a = cx.class.getSimpleName();
    private static cx b;
    private final HashMap<String, Map<String, String>> c = new HashMap<>();
    private boolean d;

    /* loaded from: classes.dex */
    public static class a {
        public int a;
    }

    private cx() {
        ec.a().a(this);
        d();
    }

    private void d() {
        dq a2 = dp.a();
        this.d = ((Boolean) a2.a("CaptureUncaughtExceptions")).booleanValue();
        a2.a("CaptureUncaughtExceptions", (dq.a) this);
        eo.a(4, a, "initSettings, CrashReportingEnabled = " + this.d);
        String str = (String) a2.a("VersionName");
        a2.a("VersionName", (dq.a) this);
        eb.a(str);
        eo.a(4, a, "initSettings, VersionName = " + str);
    }

    @Override // com.flurry.sdk.dq.a
    public void a(String str, Object obj) {
        if (str.equals("CaptureUncaughtExceptions")) {
            this.d = ((Boolean) obj).booleanValue();
            eo.a(4, a, "onSettingUpdate, CrashReportingEnabled = " + this.d);
        } else if (str.equals("VersionName")) {
            String str2 = (String) obj;
            eb.a(str2);
            eo.a(4, a, "onSettingUpdate, VersionName = " + str2);
        } else {
            eo.a(6, a, "onSettingUpdate internal error!");
        }
    }

    public static synchronized cx a() {
        cx cxVar;
        synchronized (cx.class) {
            if (b == null) {
                b = new cx();
            }
            cxVar = b;
        }
        return cxVar;
    }

    public void a(String str, String str2, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map.size() >= 10) {
            eo.d(a, "MaxOriginParams exceeded: " + map.size());
            return;
        }
        map.put("flurryOriginVersion", str2);
        synchronized (this.c) {
            if (this.c.size() >= 10 && !this.c.containsKey(str)) {
                eo.d(a, "MaxOrigins exceeded: " + this.c.size());
            } else {
                this.c.put(str, map);
            }
        }
    }

    public HashMap<String, Map<String, String>> b() {
        HashMap<String, Map<String, String>> hashMap;
        synchronized (this.c) {
            hashMap = new HashMap<>(this.c);
        }
        return hashMap;
    }

    public void a(String str) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, null, false);
        }
    }

    public void a(String str, Map<String, String> map) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, map, false);
        }
    }

    public void a(String str, boolean z) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, null, z);
        }
    }

    public void a(String str, Map<String, String> map, boolean z) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, map, z);
        }
    }

    public void b(String str) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, (Map<String, String>) null);
        }
    }

    public void b(String str, Map<String, String> map) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, map);
        }
    }

    @Deprecated
    public void a(String str, String str2, String str3) {
        StackTraceElement[] stackTraceElementArr;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length <= 2) {
            stackTraceElementArr = stackTrace;
        } else {
            stackTraceElementArr = new StackTraceElement[stackTrace.length - 2];
            System.arraycopy(stackTrace, 2, stackTraceElementArr, 0, stackTraceElementArr.length);
        }
        Throwable th = new Throwable(str2);
        th.setStackTrace(stackTraceElementArr);
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, str2, str3, th);
        }
    }

    public void a(String str, String str2, Throwable th) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, str2, th.getClass().getName(), th);
        }
    }

    public void c(String str) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, null, false);
        }
    }

    public void c(String str, Map<String, String> map) {
        dj c = dl.a().c();
        if (c != null) {
            c.a(str, map, false);
        }
    }

    public void c() {
        dj c = dl.a().c();
        if (c != null) {
            c.e();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        th.printStackTrace();
        if (this.d) {
            String str = "";
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                StringBuilder sb = new StringBuilder();
                if (th.getMessage() != null) {
                    sb.append(" (" + th.getMessage() + ")\n");
                }
                str = sb.toString();
            } else if (th.getMessage() != null) {
                str = th.getMessage();
            }
            FlurryAgent.onError("uncaught", str, th);
        }
        dl.a().d();
        dz.a().g();
    }

    public void a(boolean z) {
        eo.a(z);
    }
}
