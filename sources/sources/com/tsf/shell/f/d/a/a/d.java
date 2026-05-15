package com.tsf.shell.f.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends com.tsf.shell.f.d.a.a {
    private static com.censivn.C3DEngine.b.f.a.a a = com.tsf.shell.manager.o.b.a.b();
    private com.tsf.shell.f.d.a.b b;

    public d(int i, boolean z) {
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
        final boolean zAK = ((com.tsf.shell.f.i.b.e.b) aVar.parent()).aK();
        final float fPxX = aVar.points().pxX(com.tsf.shell.manager.o.b.a.c);
        final float fPxY = aVar.points().pxY(com.tsf.shell.manager.o.b.a.c);
        final float fPxX2 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.d);
        final float fPxY2 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.d);
        float f5 = com.tsf.shell.manager.o.b.a.T * 0.7f;
        if (aVar.rotation().z != 0.0f) {
            float f6 = -aVar.rotation().z;
            Number3d number3d = Number3d.TEMPNUMBER3D;
            number3d.reset();
            number3d.x = f5;
            number3d.y = com.tsf.shell.manager.o.b.a.w * f();
            number3d.rotateDegressZ(f6);
            f4 = number3d.x;
            f = number3d.y;
            number3d.x = -f5;
            number3d.y = com.tsf.shell.manager.o.b.a.t * f();
            number3d.rotateDegressZ(f6);
            f2 = number3d.x;
            f3 = number3d.y;
        } else {
            f = com.tsf.shell.manager.o.b.a.s * f();
            f2 = -f5;
            f3 = com.tsf.shell.manager.o.b.a.t * f();
            f4 = f5;
        }
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.d.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                d.this.a(aVar, runnable, zAK);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                d.this.a(aVar, zAK);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, fPxX + ((f4 - fPxX) * f7), fPxY + ((f - fPxY) * f7), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, fPxX2 + ((f2 - fPxX2) * f7), fPxY2 + ((f3 - fPxY2) * f7), 0.0f);
                aVar.updatePointsVBO();
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.e.C0036a());
        com.censivn.C3DEngine.b.g.c.a(aVar);
        com.censivn.C3DEngine.b.g.c.a(aVar, 250, dVar);
    }

    private float f() {
        return (float) ((Math.random() * 1.0d) + 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.censivn.C3DEngine.b.f.a.a aVar, final Runnable runnable, final boolean z) {
        final float fPxX = aVar.points().pxX(com.tsf.shell.manager.o.b.a.c);
        final float fPxY = aVar.points().pxY(com.tsf.shell.manager.o.b.a.c);
        final float fPxX2 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.d);
        final float fPxY2 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.d);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.d.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                d.this.a(aVar, z);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, fPxX + ((com.tsf.shell.manager.o.b.a.k - fPxX) * f), fPxY + ((com.tsf.shell.manager.o.b.a.s - fPxY) * f), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, fPxX2 + ((com.tsf.shell.manager.o.b.a.l - fPxX2) * f), fPxY2 + ((com.tsf.shell.manager.o.b.a.t - fPxY2) * f), 0.0f);
                aVar.updatePointsVBO();
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.c.C0034a());
        com.censivn.C3DEngine.b.g.c.a(aVar);
        com.censivn.C3DEngine.b.g.c.a(aVar, 1000, dVar);
    }

    public void a(com.censivn.C3DEngine.b.f.a.a aVar, boolean z) {
        com.censivn.C3DEngine.b.g.c.a(aVar);
        aVar.points().setPX(com.tsf.shell.manager.o.b.a.a, com.tsf.shell.manager.o.b.a.i, com.tsf.shell.manager.o.b.a.q, 0.0f);
        aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, com.tsf.shell.manager.o.b.a.k, com.tsf.shell.manager.o.b.a.s, 0.0f);
        aVar.points().setPX(com.tsf.shell.manager.o.b.a.b, com.tsf.shell.manager.o.b.a.j, com.tsf.shell.manager.o.b.a.r, 0.0f);
        aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, com.tsf.shell.manager.o.b.a.l, com.tsf.shell.manager.o.b.a.t, 0.0f);
        if (!z) {
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
        final float fPxX = kVar.points().pxX(2);
        final float fPxX2 = kVar.points().pxX(3);
        final float fPxY = kVar.points().pxY(2);
        final float fPxY2 = kVar.points().pxY(3);
        final float f = fPxY * f();
        final float f2 = -fB;
        final float f3 = fPxY2 * f();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.d.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                d.this.c(kVar, runnable);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f4) {
                kVar.points().setPX(2, fPxX + ((fB - fPxX) * f4), fPxY + ((f - fPxY) * f4), 0.0f);
                kVar.points().setPX(3, fPxX2 + ((f2 - fPxX2) * f4), fPxY2 + ((f3 - fPxY2) * f4), 0.0f);
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.e.C0036a());
        com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final k kVar, final Runnable runnable) {
        final k kVar2 = com.tsf.shell.f.d.a.b.b;
        final float fPxX = kVar.points().pxX(2);
        final float fPxX2 = kVar.points().pxX(3);
        final float fPxY = kVar.points().pxY(2);
        final float fPxY2 = kVar.points().pxY(3);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.d.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                kVar.points().setPX(2, fPxX + ((kVar2.points().pxX(2) - fPxX) * f), fPxY + ((kVar2.points().pxY(2) - fPxY) * f), 0.0f);
                kVar.points().setPX(3, fPxX2 + ((kVar2.points().pxX(3) - fPxX2) * f), fPxY2 + ((kVar2.points().pxY(3) - fPxY2) * f), 0.0f);
                kVar.updatePointsVBO();
            }
        };
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.c.C0034a());
        com.censivn.C3DEngine.b.g.c.a(kVar, 1000, dVar);
    }
}
