package com.tsf.shell.f.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends com.tsf.shell.f.d.a.a {
    private static com.censivn.C3DEngine.b.f.a.a a = com.tsf.shell.manager.o.b.a.b();
    private com.tsf.shell.f.d.a.b b;

    public a(int i, boolean z) {
        super(i, z);
        a = com.tsf.shell.manager.o.b.a.b();
    }

    @Override // com.tsf.shell.f.d.a.a
    public void a(i iVar, Number3d number3d, Number3d number3d2, Runnable runnable) {
        a((com.censivn.C3DEngine.b.f.a.a) iVar, runnable);
    }

    public void a(final com.censivn.C3DEngine.b.f.a.a aVar, final Runnable runnable) {
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
        final boolean zAK = ((com.tsf.shell.f.i.b.e.b) aVar.parent()).aK();
        final float fPxX = aVar.points().pxX(com.tsf.shell.manager.o.b.a.a);
        final float fPxY = aVar.points().pxY(com.tsf.shell.manager.o.b.a.a);
        final float fPxX2 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.b);
        final float fPxY2 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.b);
        final float fPxX3 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.c);
        final float fPxY3 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.c);
        final float fPxX4 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.d);
        final float fPxY4 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.d);
        final float fPxX5 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.e);
        final float fPxY5 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.e);
        final float fPxX6 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.f);
        final float fPxY6 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.f);
        final float fPxX7 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.g);
        final float fPxY7 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.g);
        final float fPxX8 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.h);
        final float fPxY8 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.h);
        float f17 = com.tsf.shell.manager.o.b.a.T * 0.7f;
        if (aVar.rotation().z != 0.0f) {
            float f18 = -aVar.rotation().z;
            Number3d number3d = Number3d.TEMPNUMBER3D;
            number3d.reset();
            number3d.x = f17;
            number3d.y = com.tsf.shell.manager.o.b.a.u * f();
            number3d.rotateDegressZ(f18);
            f16 = number3d.x;
            f = number3d.y;
            number3d.x = f17;
            number3d.y = com.tsf.shell.manager.o.b.a.w * f();
            number3d.rotateDegressZ(f18);
            f15 = number3d.x;
            f2 = number3d.y;
            number3d.x = f17;
            number3d.y = com.tsf.shell.manager.o.b.a.u * f();
            number3d.rotateDegressZ(f18);
            f14 = number3d.x;
            f3 = number3d.y;
            number3d.x = f17;
            number3d.y = com.tsf.shell.manager.o.b.a.u * f();
            number3d.rotateDegressZ(f18);
            f13 = number3d.x;
            f4 = number3d.y;
            number3d.x = -f17;
            number3d.y = com.tsf.shell.manager.o.b.a.r * f();
            number3d.rotateDegressZ(f18);
            f5 = number3d.x;
            f7 = number3d.y;
            number3d.x = -f17;
            number3d.y = com.tsf.shell.manager.o.b.a.t * f();
            number3d.rotateDegressZ(f18);
            f6 = number3d.x;
            f8 = number3d.y;
            number3d.x = -f17;
            number3d.y = com.tsf.shell.manager.o.b.a.r * f();
            number3d.rotateDegressZ(f18);
            f9 = number3d.x;
            f11 = number3d.y;
            number3d.x = -f17;
            number3d.y = com.tsf.shell.manager.o.b.a.t * f();
            number3d.rotateDegressZ(f18);
            f10 = number3d.x;
            f12 = number3d.y;
        } else {
            float f19 = f();
            f = com.tsf.shell.manager.o.b.a.q * f19;
            f2 = com.tsf.shell.manager.o.b.a.s * f19;
            float f20 = f();
            f3 = com.tsf.shell.manager.o.b.a.u * f20;
            f4 = com.tsf.shell.manager.o.b.a.w * f20;
            float f21 = f();
            f5 = -f17;
            f6 = -f17;
            f7 = com.tsf.shell.manager.o.b.a.r * f21;
            f8 = com.tsf.shell.manager.o.b.a.t * f21;
            float f22 = f();
            f9 = -f17;
            f10 = -f17;
            f11 = com.tsf.shell.manager.o.b.a.v * f22;
            f12 = com.tsf.shell.manager.o.b.a.x * f22;
            f13 = f17;
            f14 = f17;
            f15 = f17;
            f16 = f17;
        }
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.a.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.a(aVar, runnable, zAK);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                a.this.a(aVar);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f23) {
                if (!zAK) {
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.e, fPxX5 + ((f14 - fPxX5) * f23), fPxY5 + ((f3 - fPxY5) * f23), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.g, fPxX7 + ((f13 - fPxX7) * f23), fPxY7 + ((f4 - fPxY7) * f23), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.f, fPxX6 + ((f9 - fPxX6) * f23), fPxY6 + ((f11 - fPxY6) * f23), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.h, fPxX8 + ((f10 - fPxX8) * f23), fPxY8 + ((f12 - fPxY8) * f23), 0.0f);
                }
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.a, fPxX + ((f16 - fPxX) * f23), fPxY + ((f - fPxY) * f23), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, fPxX3 + ((f15 - fPxX3) * f23), fPxY3 + ((f2 - fPxY3) * f23), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.b, fPxX2 + ((f5 - fPxX2) * f23), fPxY2 + ((f7 - fPxY2) * f23), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, fPxX4 + ((f6 - fPxX4) * f23), fPxY4 + ((f8 - fPxY4) * f23), 0.0f);
                aVar.updatePointsVBO();
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.e.C0036a());
        com.censivn.C3DEngine.b.g.c.a(aVar);
        com.censivn.C3DEngine.b.g.c.a(aVar, 250, dVar);
    }

    private float f() {
        return (float) (0.3d + (Math.random() * 1.5d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.censivn.C3DEngine.b.f.a.a aVar, final Runnable runnable, final boolean z) {
        final float fPxX = aVar.points().pxX(com.tsf.shell.manager.o.b.a.a);
        final float fPxY = aVar.points().pxY(com.tsf.shell.manager.o.b.a.a);
        final float fPxX2 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.b);
        final float fPxY2 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.b);
        final float fPxX3 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.c);
        final float fPxY3 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.c);
        final float fPxX4 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.d);
        final float fPxY4 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.d);
        final float fPxX5 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.e);
        final float fPxY5 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.e);
        final float fPxX6 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.f);
        final float fPxY6 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.f);
        final float fPxX7 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.g);
        final float fPxY7 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.g);
        final float fPxX8 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.h);
        final float fPxY8 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.h);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                a.this.a(aVar);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.a, fPxX + ((com.tsf.shell.manager.o.b.a.i - fPxX) * f), fPxY + ((com.tsf.shell.manager.o.b.a.q - fPxY) * f), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, fPxX3 + ((com.tsf.shell.manager.o.b.a.k - fPxX3) * f), fPxY3 + ((com.tsf.shell.manager.o.b.a.s - fPxY3) * f), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.b, fPxX2 + ((com.tsf.shell.manager.o.b.a.j - fPxX2) * f), fPxY2 + ((com.tsf.shell.manager.o.b.a.r - fPxY2) * f), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, fPxX4 + ((com.tsf.shell.manager.o.b.a.l - fPxX4) * f), fPxY4 + ((com.tsf.shell.manager.o.b.a.t - fPxY4) * f), 0.0f);
                if (!z) {
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.e, fPxX5 + ((com.tsf.shell.manager.o.b.a.m - fPxX5) * f), fPxY5 + ((com.tsf.shell.manager.o.b.a.u - fPxY5) * f), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.g, fPxX7 + ((com.tsf.shell.manager.o.b.a.o - fPxX7) * f), fPxY7 + ((com.tsf.shell.manager.o.b.a.w - fPxY7) * f), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.f, fPxX6 + ((com.tsf.shell.manager.o.b.a.n - fPxX6) * f), fPxY6 + ((com.tsf.shell.manager.o.b.a.v - fPxY6) * f), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.h, fPxX8 + ((com.tsf.shell.manager.o.b.a.p - fPxX8) * f), fPxY8 + ((com.tsf.shell.manager.o.b.a.x - fPxY8) * f), 0.0f);
                }
                aVar.updatePointsVBO();
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.c.C0034a());
        com.censivn.C3DEngine.b.g.c.a(aVar);
        com.censivn.C3DEngine.b.g.c.a(aVar, 1000, dVar);
    }

    public void a(com.censivn.C3DEngine.b.f.a.a aVar) {
        com.censivn.C3DEngine.b.g.c.a(aVar);
        aVar.points().setPX(com.tsf.shell.manager.o.b.a.a, com.tsf.shell.manager.o.b.a.i, com.tsf.shell.manager.o.b.a.q, 0.0f);
        aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, com.tsf.shell.manager.o.b.a.k, com.tsf.shell.manager.o.b.a.s, 0.0f);
        aVar.points().setPX(com.tsf.shell.manager.o.b.a.b, com.tsf.shell.manager.o.b.a.j, com.tsf.shell.manager.o.b.a.r, 0.0f);
        aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, com.tsf.shell.manager.o.b.a.l, com.tsf.shell.manager.o.b.a.t, 0.0f);
        if (!((com.tsf.shell.f.i.b.e.b) aVar.parent()).aK()) {
            aVar.points().setPX(com.tsf.shell.manager.o.b.a.e, com.tsf.shell.manager.o.b.a.m, com.tsf.shell.manager.o.b.a.u, 0.0f);
            aVar.points().setPX(com.tsf.shell.manager.o.b.a.g, com.tsf.shell.manager.o.b.a.o, com.tsf.shell.manager.o.b.a.w, 0.0f);
            aVar.points().setPX(com.tsf.shell.manager.o.b.a.f, com.tsf.shell.manager.o.b.a.n, com.tsf.shell.manager.o.b.a.v, 0.0f);
            aVar.points().setPX(com.tsf.shell.manager.o.b.a.h, com.tsf.shell.manager.o.b.a.p, com.tsf.shell.manager.o.b.a.x, 0.0f);
        }
        aVar.updatePointsVBO();
    }

    @Override // com.tsf.shell.f.d.a.a
    public i e() {
        if (this.b == null) {
            this.b = new com.tsf.shell.f.d.a.b(this, true);
        }
        return this.b;
    }

    @Override // com.tsf.shell.f.d.a.a
    public void a(k kVar, Runnable runnable) {
        b(kVar, runnable);
    }

    private void b(final k kVar, final Runnable runnable) {
        final float fB = kVar.b();
        final float fPxX = kVar.points().pxX(0);
        final float fPxX2 = kVar.points().pxX(1);
        final float fPxX3 = kVar.points().pxX(2);
        final float fPxX4 = kVar.points().pxX(3);
        final float fPxY = kVar.points().pxY(0);
        final float fPxY2 = kVar.points().pxY(1);
        final float fPxY3 = kVar.points().pxY(2);
        final float fPxY4 = kVar.points().pxY(3);
        final float f = fPxY * f();
        final float f2 = fPxY3 * f();
        final float f3 = -fB;
        final float f4 = -fB;
        final float f5 = fPxY2 * f();
        final float f6 = fPxY4 * f();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.a.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.c(kVar, runnable);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
                kVar.points().setPX(0, fPxX + ((fB - fPxX) * f7), fPxY + ((f - fPxY) * f7), 0.0f);
                kVar.points().setPX(2, fPxX3 + ((fB - fPxX3) * f7), fPxY3 + ((f2 - fPxY3) * f7), 0.0f);
                kVar.points().setPX(1, fPxX2 + ((f3 - fPxX2) * f7), fPxY2 + ((f5 - fPxY2) * f7), 0.0f);
                kVar.points().setPX(3, fPxX4 + ((f4 - fPxX4) * f7), fPxY4 + ((f6 - fPxY4) * f7), 0.0f);
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.e.C0036a());
        com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final k kVar, final Runnable runnable) {
        final k kVar2 = com.tsf.shell.f.d.a.b.b;
        final float fPxX = kVar.points().pxX(0);
        final float fPxX2 = kVar.points().pxX(1);
        final float fPxX3 = kVar.points().pxX(2);
        final float fPxX4 = kVar.points().pxX(3);
        final float fPxY = kVar.points().pxY(0);
        final float fPxY2 = kVar.points().pxY(1);
        final float fPxY3 = kVar.points().pxY(2);
        final float fPxY4 = kVar.points().pxY(3);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.a.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                kVar.points().setPX(0, fPxX + ((kVar2.points().pxX(0) - fPxX) * f), fPxY + ((kVar2.points().pxY(0) - fPxY) * f), 0.0f);
                kVar.points().setPX(2, fPxX3 + ((kVar2.points().pxX(2) - fPxX3) * f), fPxY3 + ((kVar2.points().pxY(2) - fPxY3) * f), 0.0f);
                kVar.points().setPX(1, fPxX2 + ((kVar2.points().pxX(1) - fPxX2) * f), fPxY2 + ((kVar2.points().pxY(1) - fPxY2) * f), 0.0f);
                kVar.points().setPX(3, fPxX4 + ((kVar2.points().pxX(3) - fPxX4) * f), fPxY4 + ((kVar2.points().pxY(3) - fPxY4) * f), 0.0f);
                kVar.updatePointsVBO();
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.c.C0034a());
        com.censivn.C3DEngine.b.g.c.a(kVar, 1000, dVar);
    }
}
