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
/* renamed from: com.tsf.shell.f.d.a.a.a */
/* loaded from: classes.dex */
public class C2375a extends AbstractC2374a {

    /* renamed from: a */
    private static C0962a f7778a = C3566b.f11839a.m2010b();

    /* renamed from: b */
    private C2401b f7779b;

    public C2375a(int i, boolean z) {
        super(i, z);
        f7778a = C3566b.f11839a.m2010b();
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5652a(C0975i c0975i, Number3d number3d, Number3d number3d2, Runnable runnable) {
        m5677a((C0962a) c0975i, runnable);
    }

    /* renamed from: a */
    public void m5677a(final C0962a c0962a, final Runnable runnable) {
        final float f;
        final float f2;
        final float f3;
        final float f4;
        final float f5;
        final float f6;
        final float f7;
        final float f8;
        final float f9;
        final float f10;
        final float f11;
        final float f12;
        final float f13;
        final float f14;
        final float f15;
        final float f16;
        final boolean m3155aK = ((AbstractC3208b) c0962a.parent()).m3155aK();
        final float pxX = c0962a.points().pxX(C3566b.f11839a.f11769a);
        final float pxY = c0962a.points().pxY(C3566b.f11839a.f11769a);
        final float pxX2 = c0962a.points().pxX(C3566b.f11839a.f11774b);
        final float pxY2 = c0962a.points().pxY(C3566b.f11839a.f11774b);
        final float pxX3 = c0962a.points().pxX(C3566b.f11839a.f11775c);
        final float pxY3 = c0962a.points().pxY(C3566b.f11839a.f11775c);
        final float pxX4 = c0962a.points().pxX(C3566b.f11839a.f11776d);
        final float pxY4 = c0962a.points().pxY(C3566b.f11839a.f11776d);
        final float pxX5 = c0962a.points().pxX(C3566b.f11839a.f11777e);
        final float pxY5 = c0962a.points().pxY(C3566b.f11839a.f11777e);
        final float pxX6 = c0962a.points().pxX(C3566b.f11839a.f11778f);
        final float pxY6 = c0962a.points().pxY(C3566b.f11839a.f11778f);
        final float pxX7 = c0962a.points().pxX(C3566b.f11839a.f11779g);
        final float pxY7 = c0962a.points().pxY(C3566b.f11839a.f11779g);
        final float pxX8 = c0962a.points().pxX(C3566b.f11839a.f11780h);
        final float pxY8 = c0962a.points().pxY(C3566b.f11839a.f11780h);
        float f17 = C3566b.f11839a.f11762T * 0.7f;
        if (c0962a.rotation().f2528z != 0.0f) {
            float f18 = -c0962a.rotation().f2528z;
            Number3d number3d = Number3d.TEMPNUMBER3D;
            number3d.reset();
            number3d.f2526x = f17;
            number3d.f2527y = C3566b.f11839a.f11793u * m5671f();
            number3d.rotateDegressZ(f18);
            f16 = number3d.f2526x;
            f = number3d.f2527y;
            number3d.f2526x = f17;
            number3d.f2527y = C3566b.f11839a.f11795w * m5671f();
            number3d.rotateDegressZ(f18);
            f15 = number3d.f2526x;
            f2 = number3d.f2527y;
            number3d.f2526x = f17;
            number3d.f2527y = C3566b.f11839a.f11793u * m5671f();
            number3d.rotateDegressZ(f18);
            f14 = number3d.f2526x;
            f3 = number3d.f2527y;
            number3d.f2526x = f17;
            number3d.f2527y = C3566b.f11839a.f11793u * m5671f();
            number3d.rotateDegressZ(f18);
            f13 = number3d.f2526x;
            f4 = number3d.f2527y;
            number3d.f2526x = -f17;
            number3d.f2527y = C3566b.f11839a.f11790r * m5671f();
            number3d.rotateDegressZ(f18);
            f5 = number3d.f2526x;
            f7 = number3d.f2527y;
            number3d.f2526x = -f17;
            number3d.f2527y = C3566b.f11839a.f11792t * m5671f();
            number3d.rotateDegressZ(f18);
            f6 = number3d.f2526x;
            f8 = number3d.f2527y;
            number3d.f2526x = -f17;
            number3d.f2527y = C3566b.f11839a.f11790r * m5671f();
            number3d.rotateDegressZ(f18);
            f9 = number3d.f2526x;
            f11 = number3d.f2527y;
            number3d.f2526x = -f17;
            number3d.f2527y = C3566b.f11839a.f11792t * m5671f();
            number3d.rotateDegressZ(f18);
            f10 = number3d.f2526x;
            f12 = number3d.f2527y;
        } else {
            float m5671f = m5671f();
            f = C3566b.f11839a.f11789q * m5671f;
            f2 = C3566b.f11839a.f11791s * m5671f;
            float m5671f2 = m5671f();
            f3 = C3566b.f11839a.f11793u * m5671f2;
            f4 = C3566b.f11839a.f11795w * m5671f2;
            float m5671f3 = m5671f();
            f5 = -f17;
            f6 = -f17;
            f7 = C3566b.f11839a.f11790r * m5671f3;
            f8 = C3566b.f11839a.f11792t * m5671f3;
            float m5671f4 = m5671f();
            f9 = -f17;
            f10 = -f17;
            f11 = C3566b.f11839a.f11794v * m5671f4;
            f12 = C3566b.f11839a.f11796x * m5671f4;
            f13 = f17;
            f14 = f17;
            f15 = f17;
            f16 = f17;
        }
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2375a.this.m5676a(c0962a, runnable, m3155aK);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: c */
            public void mo4322c() {
                C2375a.this.m5678a(c0962a);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f19) {
                if (!m3155aK) {
                    c0962a.points().setPX(C3566b.f11839a.f11777e, pxX5 + ((f14 - pxX5) * f19), pxY5 + ((f3 - pxY5) * f19), 0.0f);
                    c0962a.points().setPX(C3566b.f11839a.f11779g, pxX7 + ((f13 - pxX7) * f19), pxY7 + ((f4 - pxY7) * f19), 0.0f);
                    c0962a.points().setPX(C3566b.f11839a.f11778f, pxX6 + ((f9 - pxX6) * f19), pxY6 + ((f11 - pxY6) * f19), 0.0f);
                    c0962a.points().setPX(C3566b.f11839a.f11780h, pxX8 + ((f10 - pxX8) * f19), pxY8 + ((f12 - pxY8) * f19), 0.0f);
                }
                c0962a.points().setPX(C3566b.f11839a.f11769a, pxX + ((f16 - pxX) * f19), pxY + ((f - pxY) * f19), 0.0f);
                c0962a.points().setPX(C3566b.f11839a.f11775c, pxX3 + ((f15 - pxX3) * f19), pxY3 + ((f2 - pxY3) * f19), 0.0f);
                c0962a.points().setPX(C3566b.f11839a.f11774b, pxX2 + ((f5 - pxX2) * f19), pxY2 + ((f7 - pxY2) * f19), 0.0f);
                c0962a.points().setPX(C3566b.f11839a.f11776d, pxX4 + ((f6 - pxX4) * f19), pxY4 + ((f8 - pxY4) * f19), 0.0f);
                c0962a.updatePointsVBO();
            }
        };
        c1017d.m10313a((InterfaceC1011b) new C0986a.C1001e.C1002a());
        C1014c.m10326a(c0962a);
        C1014c.m10325a(c0962a, 250, c1017d);
    }

    /* renamed from: f */
    private float m5671f() {
        return (float) (0.3d + (Math.random() * 1.5d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5676a(final C0962a c0962a, final Runnable runnable, final boolean z) {
        final float pxX = c0962a.points().pxX(C3566b.f11839a.f11769a);
        final float pxY = c0962a.points().pxY(C3566b.f11839a.f11769a);
        final float pxX2 = c0962a.points().pxX(C3566b.f11839a.f11774b);
        final float pxY2 = c0962a.points().pxY(C3566b.f11839a.f11774b);
        final float pxX3 = c0962a.points().pxX(C3566b.f11839a.f11775c);
        final float pxY3 = c0962a.points().pxY(C3566b.f11839a.f11775c);
        final float pxX4 = c0962a.points().pxX(C3566b.f11839a.f11776d);
        final float pxY4 = c0962a.points().pxY(C3566b.f11839a.f11776d);
        final float pxX5 = c0962a.points().pxX(C3566b.f11839a.f11777e);
        final float pxY5 = c0962a.points().pxY(C3566b.f11839a.f11777e);
        final float pxX6 = c0962a.points().pxX(C3566b.f11839a.f11778f);
        final float pxY6 = c0962a.points().pxY(C3566b.f11839a.f11778f);
        final float pxX7 = c0962a.points().pxX(C3566b.f11839a.f11779g);
        final float pxY7 = c0962a.points().pxY(C3566b.f11839a.f11779g);
        final float pxX8 = c0962a.points().pxX(C3566b.f11839a.f11780h);
        final float pxY8 = c0962a.points().pxY(C3566b.f11839a.f11780h);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.a.2
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
                C2375a.this.m5678a(c0962a);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                c0962a.points().setPX(C3566b.f11839a.f11769a, pxX + ((C3566b.f11839a.f11781i - pxX) * f), pxY + ((C3566b.f11839a.f11789q - pxY) * f), 0.0f);
                c0962a.points().setPX(C3566b.f11839a.f11775c, pxX3 + ((C3566b.f11839a.f11783k - pxX3) * f), pxY3 + ((C3566b.f11839a.f11791s - pxY3) * f), 0.0f);
                c0962a.points().setPX(C3566b.f11839a.f11774b, pxX2 + ((C3566b.f11839a.f11782j - pxX2) * f), pxY2 + ((C3566b.f11839a.f11790r - pxY2) * f), 0.0f);
                c0962a.points().setPX(C3566b.f11839a.f11776d, pxX4 + ((C3566b.f11839a.f11784l - pxX4) * f), pxY4 + ((C3566b.f11839a.f11792t - pxY4) * f), 0.0f);
                if (!z) {
                    c0962a.points().setPX(C3566b.f11839a.f11777e, pxX5 + ((C3566b.f11839a.f11785m - pxX5) * f), pxY5 + ((C3566b.f11839a.f11793u - pxY5) * f), 0.0f);
                    c0962a.points().setPX(C3566b.f11839a.f11779g, pxX7 + ((C3566b.f11839a.f11787o - pxX7) * f), pxY7 + ((C3566b.f11839a.f11795w - pxY7) * f), 0.0f);
                    c0962a.points().setPX(C3566b.f11839a.f11778f, pxX6 + ((C3566b.f11839a.f11786n - pxX6) * f), pxY6 + ((C3566b.f11839a.f11794v - pxY6) * f), 0.0f);
                    c0962a.points().setPX(C3566b.f11839a.f11780h, pxX8 + ((C3566b.f11839a.f11788p - pxX8) * f), pxY8 + ((C3566b.f11839a.f11796x - pxY8) * f), 0.0f);
                }
                c0962a.updatePointsVBO();
            }
        };
        c1017d.m10313a((InterfaceC1011b) new C0986a.C0995c.C0996a());
        C1014c.m10326a(c0962a);
        C1014c.m10325a(c0962a, 1000, c1017d);
    }

    /* renamed from: a */
    public void m5678a(C0962a c0962a) {
        C1014c.m10326a(c0962a);
        c0962a.points().setPX(C3566b.f11839a.f11769a, C3566b.f11839a.f11781i, C3566b.f11839a.f11789q, 0.0f);
        c0962a.points().setPX(C3566b.f11839a.f11775c, C3566b.f11839a.f11783k, C3566b.f11839a.f11791s, 0.0f);
        c0962a.points().setPX(C3566b.f11839a.f11774b, C3566b.f11839a.f11782j, C3566b.f11839a.f11790r, 0.0f);
        c0962a.points().setPX(C3566b.f11839a.f11776d, C3566b.f11839a.f11784l, C3566b.f11839a.f11792t, 0.0f);
        if (!((AbstractC3208b) c0962a.parent()).m3155aK()) {
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
        if (this.f7779b == null) {
            this.f7779b = new C2401b(this, true);
        }
        return this.f7779b;
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5651a(C0981k c0981k, Runnable runnable) {
        m5673b(c0981k, runnable);
    }

    /* renamed from: b */
    private void m5673b(final C0981k c0981k, final Runnable runnable) {
        final float mo10366b = c0981k.mo10366b();
        final float pxX = c0981k.points().pxX(0);
        final float pxX2 = c0981k.points().pxX(1);
        final float pxX3 = c0981k.points().pxX(2);
        final float pxX4 = c0981k.points().pxX(3);
        final float pxY = c0981k.points().pxY(0);
        final float pxY2 = c0981k.points().pxY(1);
        final float pxY3 = c0981k.points().pxY(2);
        final float pxY4 = c0981k.points().pxY(3);
        final float m5671f = pxY * m5671f();
        final float m5671f2 = pxY3 * m5671f();
        final float f = -mo10366b;
        final float f2 = -mo10366b;
        final float m5671f3 = pxY2 * m5671f();
        final float m5671f4 = pxY4 * m5671f();
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.a.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2375a.this.m5672c(c0981k, runnable);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f3) {
                c0981k.points().setPX(0, pxX + ((mo10366b - pxX) * f3), pxY + ((m5671f - pxY) * f3), 0.0f);
                c0981k.points().setPX(2, pxX3 + ((mo10366b - pxX3) * f3), pxY3 + ((m5671f2 - pxY3) * f3), 0.0f);
                c0981k.points().setPX(1, pxX2 + ((f - pxX2) * f3), pxY2 + ((m5671f3 - pxY2) * f3), 0.0f);
                c0981k.points().setPX(3, pxX4 + ((f2 - pxX4) * f3), pxY4 + ((m5671f4 - pxY4) * f3), 0.0f);
            }
        };
        c1017d.m10313a((InterfaceC1011b) new C0986a.C1001e.C1002a());
        C1014c.m10325a(c0981k, 250, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5672c(final C0981k c0981k, final Runnable runnable) {
        final C0981k c0981k2 = C2401b.f7938b;
        final float pxX = c0981k.points().pxX(0);
        final float pxX2 = c0981k.points().pxX(1);
        final float pxX3 = c0981k.points().pxX(2);
        final float pxX4 = c0981k.points().pxX(3);
        final float pxY = c0981k.points().pxY(0);
        final float pxY2 = c0981k.points().pxY(1);
        final float pxY3 = c0981k.points().pxY(2);
        final float pxY4 = c0981k.points().pxY(3);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.a.4
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
                c0981k.points().setPX(0, pxX + ((c0981k2.points().pxX(0) - pxX) * f), pxY + ((c0981k2.points().pxY(0) - pxY) * f), 0.0f);
                c0981k.points().setPX(2, pxX3 + ((c0981k2.points().pxX(2) - pxX3) * f), pxY3 + ((c0981k2.points().pxY(2) - pxY3) * f), 0.0f);
                c0981k.points().setPX(1, pxX2 + ((c0981k2.points().pxX(1) - pxX2) * f), pxY2 + ((c0981k2.points().pxY(1) - pxY2) * f), 0.0f);
                c0981k.points().setPX(3, pxX4 + ((c0981k2.points().pxX(3) - pxX4) * f), pxY4 + ((c0981k2.points().pxY(3) - pxY4) * f), 0.0f);
                c0981k.updatePointsVBO();
            }
        };
        c1017d.m10313a((InterfaceC1011b) new C0986a.C0995c.C0996a());
        C1014c.m10325a(c0981k, 1000, c1017d);
    }
}
