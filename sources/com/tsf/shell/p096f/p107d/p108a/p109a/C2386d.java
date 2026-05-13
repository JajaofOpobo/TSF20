package com.tsf.shell.p096f.p107d.p108a.p109a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p107d.p108a.AbstractC2374a;
import com.tsf.shell.p096f.p107d.p108a.C2401b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
/* renamed from: com.tsf.shell.f.d.a.a.d */
/* loaded from: classes.dex */
public class C2386d extends AbstractC2374a {

    /* renamed from: a */
    private static C0962a f7879a = C3566b.f11839a.m2010b();

    /* renamed from: b */
    private C2401b f7880b;

    public C2386d(int i, boolean z) {
        super(i, z);
        f7879a = C3566b.f11839a.m2010b();
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5652a(C0975i c0975i, Number3d number3d, Number3d number3d2, Runnable runnable) {
        m5664a((C0962a) c0975i, runnable);
    }

    /* renamed from: a */
    public void m5664a(final C0962a c0962a, final Runnable runnable) {
        final float m5657f;
        final float f;
        final float m5657f2;
        final float f2;
        final boolean m3155aK = ((AbstractC3208b) c0962a.parent()).m3155aK();
        final float pxX = c0962a.points().pxX(C3566b.f11839a.f11775c);
        final float pxY = c0962a.points().pxY(C3566b.f11839a.f11775c);
        final float pxX2 = c0962a.points().pxX(C3566b.f11839a.f11776d);
        final float pxY2 = c0962a.points().pxY(C3566b.f11839a.f11776d);
        float f3 = C3566b.f11839a.f11762T * 0.7f;
        if (c0962a.rotation().f2528z != 0.0f) {
            float f4 = -c0962a.rotation().f2528z;
            Number3d number3d = Number3d.TEMPNUMBER3D;
            number3d.reset();
            number3d.f2526x = f3;
            number3d.f2527y = C3566b.f11839a.f11795w * m5657f();
            number3d.rotateDegressZ(f4);
            f2 = number3d.f2526x;
            m5657f = number3d.f2527y;
            number3d.f2526x = -f3;
            number3d.f2527y = C3566b.f11839a.f11792t * m5657f();
            number3d.rotateDegressZ(f4);
            f = number3d.f2526x;
            m5657f2 = number3d.f2527y;
        } else {
            m5657f = C3566b.f11839a.f11791s * m5657f();
            f = -f3;
            m5657f2 = C3566b.f11839a.f11792t * m5657f();
            f2 = f3;
        }
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.d.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2386d.this.m5663a(c0962a, runnable, m3155aK);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: c */
            public void mo4322c() {
                C2386d.this.m5662a(c0962a, m3155aK);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f5) {
                c0962a.points().setPX(C3566b.f11839a.f11775c, pxX + ((f2 - pxX) * f5), pxY + ((m5657f - pxY) * f5), 0.0f);
                c0962a.points().setPX(C3566b.f11839a.f11776d, pxX2 + ((f - pxX2) * f5), pxY2 + ((m5657f2 - pxY2) * f5), 0.0f);
                c0962a.updatePointsVBO();
            }
        };
        c1017d.m10313a((InterfaceC1011b) new C0986a.C1001e.C1002a());
        C1014c.m10326a(c0962a);
        C1014c.m10325a(c0962a, 250, c1017d);
    }

    /* renamed from: f */
    private float m5657f() {
        return (float) ((Math.random() * 1.0d) + 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5663a(final C0962a c0962a, final Runnable runnable, final boolean z) {
        final float pxX = c0962a.points().pxX(C3566b.f11839a.f11775c);
        final float pxY = c0962a.points().pxY(C3566b.f11839a.f11775c);
        final float pxX2 = c0962a.points().pxX(C3566b.f11839a.f11776d);
        final float pxY2 = c0962a.points().pxY(C3566b.f11839a.f11776d);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.d.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: c */
            public void mo4322c() {
                C2386d.this.m5662a(c0962a, z);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                c0962a.points().setPX(C3566b.f11839a.f11775c, pxX + ((C3566b.f11839a.f11783k - pxX) * f), pxY + ((C3566b.f11839a.f11791s - pxY) * f), 0.0f);
                c0962a.points().setPX(C3566b.f11839a.f11776d, pxX2 + ((C3566b.f11839a.f11784l - pxX2) * f), pxY2 + ((C3566b.f11839a.f11792t - pxY2) * f), 0.0f);
                c0962a.updatePointsVBO();
            }
        };
        c1017d.m10313a((InterfaceC1011b) new C0986a.C0995c.C0996a());
        C1014c.m10326a(c0962a);
        C1014c.m10325a(c0962a, 1000, c1017d);
    }

    /* renamed from: a */
    public void m5662a(C0962a c0962a, boolean z) {
        C1014c.m10326a(c0962a);
        c0962a.points().setPX(C3566b.f11839a.f11769a, C3566b.f11839a.f11781i, C3566b.f11839a.f11789q, 0.0f);
        c0962a.points().setPX(C3566b.f11839a.f11775c, C3566b.f11839a.f11783k, C3566b.f11839a.f11791s, 0.0f);
        c0962a.points().setPX(C3566b.f11839a.f11774b, C3566b.f11839a.f11782j, C3566b.f11839a.f11790r, 0.0f);
        c0962a.points().setPX(C3566b.f11839a.f11776d, C3566b.f11839a.f11784l, C3566b.f11839a.f11792t, 0.0f);
        if (!z) {
            c0962a.points().setPX(C3566b.f11839a.f11777e, C3566b.f11839a.f11785m, C3566b.f11839a.f11793u, 0.0f);
            c0962a.points().setPX(C3566b.f11839a.f11779g, C3566b.f11839a.f11787o, C3566b.f11839a.f11795w, 0.0f);
            c0962a.points().setPX(C3566b.f11839a.f11778f, C3566b.f11839a.f11786n, C3566b.f11839a.f11794v, 0.0f);
            c0962a.points().setPX(C3566b.f11839a.f11780h, C3566b.f11839a.f11788p, C3566b.f11839a.f11796x, 0.0f);
        }
        c0962a.updatePointsVBO();
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: e */
    public C0975i mo5650e() {
        if (this.f7880b == null) {
            this.f7880b = new C2401b(this, true);
        }
        return this.f7880b;
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5651a(C0981k c0981k, Runnable runnable) {
        m5659b(c0981k, runnable);
    }

    /* renamed from: b */
    private void m5659b(final C0981k c0981k, final Runnable runnable) {
        final float mo10366b = c0981k.mo10366b();
        final float pxX = c0981k.points().pxX(2);
        final float pxX2 = c0981k.points().pxX(3);
        final float pxY = c0981k.points().pxY(2);
        final float pxY2 = c0981k.points().pxY(3);
        final float m5657f = pxY * m5657f();
        final float f = -mo10366b;
        final float m5657f2 = pxY2 * m5657f();
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.d.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2386d.this.m5658c(c0981k, runnable);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
                c0981k.points().setPX(2, pxX + ((mo10366b - pxX) * f2), pxY + ((m5657f - pxY) * f2), 0.0f);
                c0981k.points().setPX(3, pxX2 + ((f - pxX2) * f2), pxY2 + ((m5657f2 - pxY2) * f2), 0.0f);
            }
        };
        c1017d.m10313a((InterfaceC1011b) new C0986a.C1001e.C1002a());
        C1014c.m10325a(c0981k, 250, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5658c(final C0981k c0981k, final Runnable runnable) {
        final C0981k c0981k2 = C2401b.f7938b;
        final float pxX = c0981k.points().pxX(2);
        final float pxX2 = c0981k.points().pxX(3);
        final float pxY = c0981k.points().pxY(2);
        final float pxY2 = c0981k.points().pxY(3);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.d.4
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                c0981k.points().setPX(2, pxX + ((c0981k2.points().pxX(2) - pxX) * f), pxY + ((c0981k2.points().pxY(2) - pxY) * f), 0.0f);
                c0981k.points().setPX(3, pxX2 + ((c0981k2.points().pxX(3) - pxX2) * f), pxY2 + ((c0981k2.points().pxY(3) - pxY2) * f), 0.0f);
                c0981k.updatePointsVBO();
            }
        };
        c1017d.m10313a((InterfaceC1011b) new C0986a.C0995c.C0996a());
        C1014c.m10325a(c0981k, 1000, c1017d);
    }
}
