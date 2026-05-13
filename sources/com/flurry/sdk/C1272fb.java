package com.flurry.sdk;

import java.util.List;
/* renamed from: com.flurry.sdk.fb */
/* loaded from: classes.dex */
public class C1272fb {

    /* renamed from: a */
    private static final String f4041a = C1272fb.class.getSimpleName();

    /* renamed from: b */
    private final C1217dt<InterfaceC1274a> f4042b = new C1217dt<>();

    /* renamed from: c */
    private long f4043c = 1000;

    /* renamed from: d */
    private boolean f4044d = true;

    /* renamed from: e */
    private boolean f4045e = false;

    /* renamed from: f */
    private AbstractRunnableC1278ff f4046f = new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.fb.1
        @Override // com.flurry.sdk.AbstractRunnableC1278ff
        /* renamed from: a */
        public void mo9140a() {
            try {
                for (InterfaceC1274a interfaceC1274a : C1272fb.this.m9175f()) {
                    interfaceC1274a.mo9174a(C1272fb.this);
                }
            } catch (Throwable th) {
                C1258eo.m9233a(6, C1272fb.f4041a, "", th);
            }
            if (C1272fb.this.f4044d && C1272fb.this.f4045e) {
                C1211do.m9390a().m9387a(C1272fb.this.f4046f, C1272fb.this.f4043c);
            }
        }
    };

    /* renamed from: com.flurry.sdk.fb$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1274a {
        /* renamed from: a */
        void mo9174a(C1272fb c1272fb);
    }

    /* renamed from: a */
    public void m9188a(long j) {
        this.f4043c = j;
    }

    /* renamed from: a */
    public void m9185a(boolean z) {
        this.f4044d = z;
    }

    /* renamed from: a */
    public synchronized void m9189a() {
        if (!this.f4045e) {
            C1211do.m9390a().m9387a(this.f4046f, this.f4043c);
            this.f4045e = true;
        }
    }

    /* renamed from: b */
    public synchronized void m9184b() {
        if (this.f4045e) {
            C1211do.m9390a().m9385b(this.f4046f);
            this.f4045e = false;
        }
    }

    /* renamed from: c */
    public synchronized boolean m9181c() {
        return this.f4045e;
    }

    /* renamed from: a */
    public synchronized void m9187a(InterfaceC1274a interfaceC1274a) {
        this.f4042b.m9362a(interfaceC1274a);
    }

    /* renamed from: b */
    public synchronized boolean m9183b(InterfaceC1274a interfaceC1274a) {
        return this.f4042b.m9360b(interfaceC1274a);
    }

    /* renamed from: d */
    public synchronized int m9179d() {
        return this.f4042b.m9361b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public synchronized List<InterfaceC1274a> m9175f() {
        return this.f4042b.m9363a();
    }
}
