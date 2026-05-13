package com.flurry.sdk;

import com.flurry.sdk.C1272fb;
/* renamed from: com.flurry.sdk.fa */
/* loaded from: classes.dex */
public class C1271fa {

    /* renamed from: a */
    private static long f4038a = 1000;

    /* renamed from: b */
    private static C1271fa f4039b = null;

    /* renamed from: c */
    private final C1272fb f4040c = new C1272fb();

    /* renamed from: a */
    public static synchronized C1271fa m9192a() {
        C1271fa c1271fa;
        synchronized (C1271fa.class) {
            if (f4039b == null) {
                f4039b = new C1271fa();
            }
            c1271fa = f4039b;
        }
        return c1271fa;
    }

    public C1271fa() {
        this.f4040c.m9188a(f4038a);
        this.f4040c.m9185a(true);
    }

    /* renamed from: a */
    public synchronized void m9191a(C1272fb.InterfaceC1274a interfaceC1274a) {
        this.f4040c.m9187a(interfaceC1274a);
        if (!this.f4040c.m9181c() && this.f4040c.m9179d() > 0) {
            this.f4040c.m9189a();
        }
    }

    /* renamed from: b */
    public synchronized boolean m9190b(C1272fb.InterfaceC1274a interfaceC1274a) {
        boolean m9183b;
        m9183b = this.f4040c.m9183b(interfaceC1274a);
        if (this.f4040c.m9179d() == 0) {
            this.f4040c.m9184b();
        }
        return m9183b;
    }
}
