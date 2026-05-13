package com.flurry.sdk;

import com.flurry.android.FlurryAgent;
import com.flurry.sdk.C1213dq;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.flurry.sdk.cx */
/* loaded from: classes.dex */
public class C1173cx implements C1213dq.InterfaceC1214a, Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final String f3730a = C1173cx.class.getSimpleName();

    /* renamed from: b */
    private static C1173cx f3731b;

    /* renamed from: c */
    private final HashMap<String, Map<String, String>> f3732c = new HashMap<>();

    /* renamed from: d */
    private boolean f3733d;

    /* renamed from: com.flurry.sdk.cx$a */
    /* loaded from: classes.dex */
    public static class C1174a {

        /* renamed from: a */
        public int f3734a;
    }

    private C1173cx() {
        C1230ec.m9304a().m9302a(this);
        m9572d();
    }

    /* renamed from: d */
    private void m9572d() {
        C1213dq m9380a = C1212dp.m9380a();
        this.f3733d = ((Boolean) m9380a.m9377a("CaptureUncaughtExceptions")).booleanValue();
        m9380a.m9376a("CaptureUncaughtExceptions", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3730a, "initSettings, CrashReportingEnabled = " + this.f3733d);
        String str = (String) m9380a.m9377a("VersionName");
        m9380a.m9376a("VersionName", (C1213dq.InterfaceC1214a) this);
        C1229eb.m9306a(str);
        C1258eo.m9234a(4, f3730a, "initSettings, VersionName = " + str);
    }

    @Override // com.flurry.sdk.C1213dq.InterfaceC1214a
    /* renamed from: a */
    public void mo9338a(String str, Object obj) {
        if (str.equals("CaptureUncaughtExceptions")) {
            this.f3733d = ((Boolean) obj).booleanValue();
            C1258eo.m9234a(4, f3730a, "onSettingUpdate, CrashReportingEnabled = " + this.f3733d);
        } else if (str.equals("VersionName")) {
            String str2 = (String) obj;
            C1229eb.m9306a(str2);
            C1258eo.m9234a(4, f3730a, "onSettingUpdate, VersionName = " + str2);
        } else {
            C1258eo.m9234a(6, f3730a, "onSettingUpdate internal error!");
        }
    }

    /* renamed from: a */
    public static synchronized C1173cx m9587a() {
        C1173cx c1173cx;
        synchronized (C1173cx.class) {
            if (f3731b == null) {
                f3731b = new C1173cx();
            }
            c1173cx = f3731b;
        }
        return c1173cx;
    }

    /* renamed from: a */
    public void m9583a(String str, String str2, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map.size() >= 10) {
            C1258eo.m9218d(f3730a, "MaxOriginParams exceeded: " + map.size());
            return;
        }
        map.put("flurryOriginVersion", str2);
        synchronized (this.f3732c) {
            if (this.f3732c.size() >= 10 && !this.f3732c.containsKey(str)) {
                C1258eo.m9218d(f3730a, "MaxOrigins exceeded: " + this.f3732c.size());
            } else {
                this.f3732c.put(str, map);
            }
        }
    }

    /* renamed from: b */
    public HashMap<String, Map<String, String>> m9578b() {
        HashMap<String, Map<String, String>> hashMap;
        synchronized (this.f3732c) {
            hashMap = new HashMap<>(this.f3732c);
        }
        return hashMap;
    }

    /* renamed from: a */
    public void m9586a(String str) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9457a(str, null, false);
        }
    }

    /* renamed from: a */
    public void m9582a(String str, Map<String, String> map) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9457a(str, map, false);
        }
    }

    /* renamed from: a */
    public void m9580a(String str, boolean z) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9457a(str, null, z);
        }
    }

    /* renamed from: a */
    public void m9581a(String str, Map<String, String> map, boolean z) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9457a(str, map, z);
        }
    }

    /* renamed from: b */
    public void m9577b(String str) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9458a(str, (Map<String, String>) null);
        }
    }

    /* renamed from: b */
    public void m9576b(String str, Map<String, String> map) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9458a(str, map);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m9585a(String str, String str2, String str3) {
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
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9459a(str, str2, str3, th);
        }
    }

    /* renamed from: a */
    public void m9584a(String str, String str2, Throwable th) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9459a(str, str2, th.getClass().getName(), th);
        }
    }

    /* renamed from: c */
    public void m9574c(String str) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9457a(str, null, false);
        }
    }

    /* renamed from: c */
    public void m9573c(String str, Map<String, String> map) {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9457a(str, map, false);
        }
    }

    /* renamed from: c */
    public void m9575c() {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            m9408c.m9446e();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        th.printStackTrace();
        if (this.f3733d) {
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
        C1206dl.m9414a().m9407d();
        C1225dz.m9343a().m9330g();
    }

    /* renamed from: a */
    public void m9579a(boolean z) {
        C1258eo.m9230a(z);
    }
}
