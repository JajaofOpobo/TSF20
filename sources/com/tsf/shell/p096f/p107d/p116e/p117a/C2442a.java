package com.tsf.shell.p096f.p107d.p116e.p117a;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.C2932g;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.d.e.a.a */
/* loaded from: classes.dex */
public class C2442a extends AbstractC2446b {

    /* renamed from: a */
    private C2932g f8044a;

    public C2442a(int i) {
        super(i);
    }

    @Override // com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b
    /* renamed from: a */
    public boolean mo5548a() {
        return true;
    }

    @Override // com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b
    /* renamed from: b */
    public boolean mo5543b() {
        return false;
    }

    @Override // com.tsf.shell.p096f.p107d.p116e.C2437a.InterfaceC2441a
    /* renamed from: a */
    public void mo4360a(final C0962a c0962a, Runnable runnable) {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.e.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                c0962a.rotation().f2526x = (1.0f - (Math.abs(f - 0.5f) * 2.0f)) * (-30.0f);
            }
        };
        c1017d.m10314a(50);
        c1017d.m10294l(0.5f);
        c1017d.m10293m(0.5f);
        c1017d.m10311a(runnable);
        c1017d.m10308b(runnable);
        C1014c.m10326a(c0962a);
        C1014c.m10325a(c0962a, m5541e(), c1017d);
    }

    @Override // com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b, com.tsf.shell.p096f.p107d.p116e.C2437a.InterfaceC2441a
    /* renamed from: b */
    public void mo4363b(final C0962a c0962a, Runnable runnable) {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.e.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                c0962a.rotation().f2526x = (1.0f - (Math.abs(f - 0.5f) * 2.0f)) * (-30.0f);
            }
        };
        c1017d.m10314a(255);
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.m10311a(runnable);
        c1017d.m10308b(runnable);
        C1014c.m10326a(c0962a);
        C1014c.m10325a(c0962a, m5541e(), c1017d);
    }

    @Override // com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b
    /* renamed from: a */
    public void mo5546a(C2932g c2932g, float f, ArrayList<C0975i> arrayList, Runnable runnable) {
        this.f8044a = c2932g;
        C3359a.f11091e.m2273a(c2932g.m4227a((AbstractC2446b) this, (C0975i) C3359a.f11091e.m2277a(), true).f9574b, f, runnable);
    }

    @Override // com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b
    /* renamed from: a */
    public void mo5547a(C2932g c2932g) {
        m5549c();
    }

    /* renamed from: c */
    public void m5549c() {
        C3359a.f11091e.m2277a().m5508a(this.f8044a.m4218a(true, true).f9574b);
        C3359a.f11091e.m2277a().m5510a(1.0f);
    }

    @Override // com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b
    /* renamed from: a */
    public void mo5545a(final C2932g c2932g, ArrayList<C0975i> arrayList, final Runnable runnable, boolean z) {
        if (z) {
            C3359a.f11091e.m2276a(500, new Runnable() { // from class: com.tsf.shell.f.d.e.a.a.3
                @Override // java.lang.Runnable
                public void run() {
                    c2932g.m4193h();
                    runnable.run();
                    C2442a.this.f8044a = null;
                }
            });
            return;
        }
        c2932g.m4193h();
        C3359a.f11091e.m2276a(0, runnable);
        this.f8044a = null;
    }

    @Override // com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b
    /* renamed from: d */
    public int mo5542d() {
        return 600;
    }
}
