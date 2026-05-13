package com.flurry.sdk;

import android.location.Criteria;
/* renamed from: com.flurry.sdk.dp */
/* loaded from: classes.dex */
public class C1212dp {

    /* renamed from: a */
    public static final Integer f3891a = 171;

    /* renamed from: b */
    public static final Integer f3892b = 4;

    /* renamed from: c */
    public static final Integer f3893c = 1;

    /* renamed from: d */
    public static final Integer f3894d = 0;

    /* renamed from: e */
    public static final String f3895e = null;

    /* renamed from: f */
    public static final Boolean f3896f = true;

    /* renamed from: g */
    public static final Boolean f3897g = true;

    /* renamed from: h */
    public static final String f3898h = null;

    /* renamed from: i */
    public static final Boolean f3899i = true;

    /* renamed from: j */
    public static final Criteria f3900j = null;

    /* renamed from: k */
    public static final Long f3901k = 10000L;

    /* renamed from: l */
    public static final Boolean f3902l = true;

    /* renamed from: m */
    public static final Long f3903m = 0L;

    /* renamed from: n */
    public static final Byte f3904n = (byte) -1;

    /* renamed from: o */
    private static C1213dq f3905o;

    /* renamed from: a */
    public static synchronized C1213dq m9380a() {
        C1213dq c1213dq;
        synchronized (C1212dp.class) {
            if (f3905o == null) {
                f3905o = new C1213dq();
                m9379b();
            }
            c1213dq = f3905o;
        }
        return c1213dq;
    }

    /* renamed from: b */
    private static void m9379b() {
        if (f3905o == null) {
            f3905o = new C1213dq();
        }
        f3905o.m9375a("AgentVersion", (Object) f3891a);
        f3905o.m9375a("ReleaseMajorVersion", (Object) f3892b);
        f3905o.m9375a("ReleaseMinorVersion", (Object) f3893c);
        f3905o.m9375a("ReleasePatchVersion", (Object) f3894d);
        f3905o.m9375a("ReleaseBetaVersion", (Object) "");
        f3905o.m9375a("VersionName", (Object) f3895e);
        f3905o.m9375a("CaptureUncaughtExceptions", (Object) f3896f);
        f3905o.m9375a("UseHttps", (Object) f3897g);
        f3905o.m9375a("ReportUrl", (Object) f3898h);
        f3905o.m9375a("ReportLocation", (Object) f3899i);
        f3905o.m9375a("LocationCriteria", (Object) f3900j);
        f3905o.m9375a("ContinueSessionMillis", (Object) f3901k);
        f3905o.m9375a("LogEvents", (Object) f3902l);
        f3905o.m9375a("Age", (Object) f3903m);
        f3905o.m9375a("Gender", (Object) f3904n);
        f3905o.m9375a("UserId", (Object) "");
    }
}
