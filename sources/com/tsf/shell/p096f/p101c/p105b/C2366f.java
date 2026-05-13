package com.tsf.shell.p096f.p101c.p105b;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a;
/* renamed from: com.tsf.shell.f.c.b.f */
/* loaded from: classes.dex */
public class C2366f extends AbstractC2356c {

    /* renamed from: a */
    private C2359e f7758a;

    /* renamed from: b */
    private C0980j f7759b;

    public C2366f(C2359e c2359e, C0980j c0980j) {
        this.f7758a = c2359e;
        this.f7759b = c0980j;
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.AbstractC2356c
    /* renamed from: a */
    public C0980j mo5698a() {
        return this.f7759b;
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.AbstractC2356c
    /* renamed from: b */
    public void mo5696b() {
        InterfaceC2351a.C2352a m5707l = this.f7758a.m5707l();
        if (this.f7758a.m5709j()) {
            m5748a(0.0f, m5707l.f7697h);
            m5746c().rotation().f2528z = 45.0f;
        } else {
            m5748a(0.0f, m5707l.f7701l);
            m5746c().rotation().f2528z = 135.0f;
        }
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.b.f.1
            @Override // java.lang.Runnable
            public void run() {
                C2366f.this.m5694m();
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m5694m() {
        m5747a(false);
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.b.f.2
            @Override // java.lang.Runnable
            public void run() {
                C2366f.this.f7758a.m5708k();
                C2366f.this.m5743f();
            }
        }, 500L);
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.b.f.3
            @Override // java.lang.Runnable
            public void run() {
                C2366f.this.m5738k();
                C2366f.this.m5737l();
            }
        }, 2500L);
    }
}
