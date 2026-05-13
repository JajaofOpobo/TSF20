package com.tsf.shell.f.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.a;
/* loaded from: classes.dex */
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
        final boolean aK = ((com.tsf.shell.f.i.b.e.b) aVar.parent()).aK();
        final float pxX = aVar.points().pxX(com.tsf.shell.manager.o.b.a.a);
        final float pxY = aVar.points().pxY(com.tsf.shell.manager.o.b.a.a);
        final float pxX2 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.b);
        final float pxY2 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.b);
        final float pxX3 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.c);
        final float pxY3 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.c);
        final float pxX4 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.d);
        final float pxY4 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.d);
        final float pxX5 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.e);
        final float pxY5 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.e);
        final float pxX6 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.f);
        final float pxY6 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.f);
        final float pxX7 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.g);
        final float pxY7 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.g);
        final float pxX8 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.h);
        final float pxY8 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.h);
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
                a.this.a(aVar, runnable, aK);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                a.this.a(aVar);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f23) {
                if (!aK) {
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.e, pxX5 + ((f14 - pxX5) * f23), pxY5 + ((f3 - pxY5) * f23), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.g, pxX7 + ((f13 - pxX7) * f23), pxY7 + ((f4 - pxY7) * f23), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.f, pxX6 + ((f9 - pxX6) * f23), pxY6 + ((f11 - pxY6) * f23), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.h, pxX8 + ((f10 - pxX8) * f23), pxY8 + ((f12 - pxY8) * f23), 0.0f);
                }
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.a, pxX + ((f16 - pxX) * f23), pxY + ((f - pxY) * f23), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, pxX3 + ((f15 - pxX3) * f23), pxY3 + ((f2 - pxY3) * f23), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.b, pxX2 + ((f5 - pxX2) * f23), pxY2 + ((f7 - pxY2) * f23), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, pxX4 + ((f6 - pxX4) * f23), pxY4 + ((f8 - pxY4) * f23), 0.0f);
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
        final float pxX = aVar.points().pxX(com.tsf.shell.manager.o.b.a.a);
        final float pxY = aVar.points().pxY(com.tsf.shell.manager.o.b.a.a);
        final float pxX2 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.b);
        final float pxY2 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.b);
        final float pxX3 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.c);
        final float pxY3 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.c);
        final float pxX4 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.d);
        final float pxY4 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.d);
        final float pxX5 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.e);
        final float pxY5 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.e);
        final float pxX6 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.f);
        final float pxY6 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.f);
        final float pxX7 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.g);
        final float pxY7 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.g);
        final float pxX8 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.h);
        final float pxY8 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.h);
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
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.a, pxX + ((com.tsf.shell.manager.o.b.a.i - pxX) * f), pxY + ((com.tsf.shell.manager.o.b.a.q - pxY) * f), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, pxX3 + ((com.tsf.shell.manager.o.b.a.k - pxX3) * f), pxY3 + ((com.tsf.shell.manager.o.b.a.s - pxY3) * f), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.b, pxX2 + ((com.tsf.shell.manager.o.b.a.j - pxX2) * f), pxY2 + ((com.tsf.shell.manager.o.b.a.r - pxY2) * f), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, pxX4 + ((com.tsf.shell.manager.o.b.a.l - pxX4) * f), pxY4 + ((com.tsf.shell.manager.o.b.a.t - pxY4) * f), 0.0f);
                if (!z) {
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.e, pxX5 + ((com.tsf.shell.manager.o.b.a.m - pxX5) * f), pxY5 + ((com.tsf.shell.manager.o.b.a.u - pxY5) * f), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.g, pxX7 + ((com.tsf.shell.manager.o.b.a.o - pxX7) * f), pxY7 + ((com.tsf.shell.manager.o.b.a.w - pxY7) * f), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.f, pxX6 + ((com.tsf.shell.manager.o.b.a.n - pxX6) * f), pxY6 + ((com.tsf.shell.manager.o.b.a.v - pxY6) * f), 0.0f);
                    aVar.points().setPX(com.tsf.shell.manager.o.b.a.h, pxX8 + ((com.tsf.shell.manager.o.b.a.p - pxX8) * f), pxY8 + ((com.tsf.shell.manager.o.b.a.x - pxY8) * f), 0.0f);
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
        final float b = kVar.b();
        final float pxX = kVar.points().pxX(0);
        final float pxX2 = kVar.points().pxX(1);
        final float pxX3 = kVar.points().pxX(2);
        final float pxX4 = kVar.points().pxX(3);
        final float pxY = kVar.points().pxY(0);
        final float pxY2 = kVar.points().pxY(1);
        final float pxY3 = kVar.points().pxY(2);
        final float pxY4 = kVar.points().pxY(3);
        final float f = pxY * f();
        final float f2 = pxY3 * f();
        final float f3 = -b;
        final float f4 = -b;
        final float f5 = pxY2 * f();
        final float f6 = pxY4 * f();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.a.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.c(kVar, runnable);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
                kVar.points().setPX(0, pxX + ((b - pxX) * f7), pxY + ((f - pxY) * f7), 0.0f);
                kVar.points().setPX(2, pxX3 + ((b - pxX3) * f7), pxY3 + ((f2 - pxY3) * f7), 0.0f);
                kVar.points().setPX(1, pxX2 + ((f3 - pxX2) * f7), pxY2 + ((f5 - pxY2) * f7), 0.0f);
                kVar.points().setPX(3, pxX4 + ((f4 - pxX4) * f7), pxY4 + ((f6 - pxY4) * f7), 0.0f);
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.e.C0036a());
        com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final k kVar, final Runnable runnable) {
        final k kVar2 = com.tsf.shell.f.d.a.b.b;
        final float pxX = kVar.points().pxX(0);
        final float pxX2 = kVar.points().pxX(1);
        final float pxX3 = kVar.points().pxX(2);
        final float pxX4 = kVar.points().pxX(3);
        final float pxY = kVar.points().pxY(0);
        final float pxY2 = kVar.points().pxY(1);
        final float pxY3 = kVar.points().pxY(2);
        final float pxY4 = kVar.points().pxY(3);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.a.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                kVar.points().setPX(0, pxX + ((kVar2.points().pxX(0) - pxX) * f), pxY + ((kVar2.points().pxY(0) - pxY) * f), 0.0f);
                kVar.points().setPX(2, pxX3 + ((kVar2.points().pxX(2) - pxX3) * f), pxY3 + ((kVar2.points().pxY(2) - pxY3) * f), 0.0f);
                kVar.points().setPX(1, pxX2 + ((kVar2.points().pxX(1) - pxX2) * f), pxY2 + ((kVar2.points().pxY(1) - pxY2) * f), 0.0f);
                kVar.points().setPX(3, pxX4 + ((kVar2.points().pxX(3) - pxX4) * f), pxY4 + ((kVar2.points().pxY(3) - pxY4) * f), 0.0f);
                kVar.updatePointsVBO();
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.c.C0034a());
        com.censivn.C3DEngine.b.g.c.a(kVar, 1000, dVar);
    }
}
