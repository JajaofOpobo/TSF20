package com.tsf.shell.e.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.k;
import com.censivn.C3DEngine.b.g.q;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class d extends com.tsf.shell.e.d.a.a {
    private static com.censivn.C3DEngine.b.f.a.a a = com.tsf.shell.manager.o.b.a.b();
    private com.tsf.shell.e.d.a.b b;

    public d(int i, boolean z) {
        super(i, z);
        a = com.tsf.shell.manager.o.b.a.b();
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(j jVar, Number3d number3d, Number3d number3d2, Runnable runnable) {
        a((com.censivn.C3DEngine.b.f.a.a) jVar, runnable);
    }

    public void a(final com.censivn.C3DEngine.b.f.a.a aVar, final Runnable runnable) {
        final float f;
        final float f2;
        final float f3;
        final float f4;
        final boolean aK = ((com.tsf.shell.e.i.b.e.b) aVar.parent()).aK();
        final float pxX = aVar.points().pxX(com.tsf.shell.manager.o.b.a.c);
        final float pxY = aVar.points().pxY(com.tsf.shell.manager.o.b.a.c);
        final float pxX2 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.d);
        final float pxY2 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.d);
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
        x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.d.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                d.this.a(aVar, runnable, aK);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void c() {
                d.this.a(aVar, aK);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f7) {
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, pxX + ((f4 - pxX) * f7), pxY + ((f - pxY) * f7), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, pxX2 + ((f2 - pxX2) * f7), pxY2 + ((f3 - pxY2) * f7), 0.0f);
                aVar.updatePointsVBO();
            }
        };
        xVar.a((v) new q());
        w.a(aVar);
        w.a(aVar, 250, xVar);
    }

    private float f() {
        return (float) ((Math.random() * 1.0d) + 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.censivn.C3DEngine.b.f.a.a aVar, final Runnable runnable, final boolean z) {
        final float pxX = aVar.points().pxX(com.tsf.shell.manager.o.b.a.c);
        final float pxY = aVar.points().pxY(com.tsf.shell.manager.o.b.a.c);
        final float pxX2 = aVar.points().pxX(com.tsf.shell.manager.o.b.a.d);
        final float pxY2 = aVar.points().pxY(com.tsf.shell.manager.o.b.a.d);
        x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.d.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void c() {
                d.this.a(aVar, z);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.c, pxX + ((com.tsf.shell.manager.o.b.a.k - pxX) * f), pxY + ((com.tsf.shell.manager.o.b.a.s - pxY) * f), 0.0f);
                aVar.points().setPX(com.tsf.shell.manager.o.b.a.d, pxX2 + ((com.tsf.shell.manager.o.b.a.l - pxX2) * f), pxY2 + ((com.tsf.shell.manager.o.b.a.t - pxY2) * f), 0.0f);
                aVar.updatePointsVBO();
            }
        };
        xVar.a((v) new k());
        w.a(aVar);
        w.a(aVar, 1000, xVar);
    }

    public void a(com.censivn.C3DEngine.b.f.a.a aVar, boolean z) {
        w.a(aVar);
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

    @Override // com.tsf.shell.e.d.a.a
    public j e() {
        if (this.b == null) {
            this.b = new com.tsf.shell.e.d.a.b(this, true);
        }
        return this.b;
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(m mVar, Runnable runnable) {
        b(mVar, runnable);
    }

    private void b(final m mVar, final Runnable runnable) {
        final float b = mVar.b();
        final float pxX = mVar.points().pxX(2);
        final float pxX2 = mVar.points().pxX(3);
        final float pxY = mVar.points().pxY(2);
        final float pxY2 = mVar.points().pxY(3);
        final float f = pxY * f();
        final float f2 = -b;
        final float f3 = pxY2 * f();
        x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.d.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                d.this.c(mVar, runnable);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f4) {
                mVar.points().setPX(2, pxX + ((b - pxX) * f4), pxY + ((f - pxY) * f4), 0.0f);
                mVar.points().setPX(3, pxX2 + ((f2 - pxX2) * f4), pxY2 + ((f3 - pxY2) * f4), 0.0f);
            }
        };
        xVar.a((v) new q());
        w.a(mVar, 250, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final m mVar, final Runnable runnable) {
        final m mVar2 = com.tsf.shell.e.d.a.b.b;
        final float pxX = mVar.points().pxX(2);
        final float pxX2 = mVar.points().pxX(3);
        final float pxY = mVar.points().pxY(2);
        final float pxY2 = mVar.points().pxY(3);
        x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.d.4
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                mVar.points().setPX(2, pxX + ((mVar2.points().pxX(2) - pxX) * f), pxY + ((mVar2.points().pxY(2) - pxY) * f), 0.0f);
                mVar.points().setPX(3, pxX2 + ((mVar2.points().pxX(3) - pxX2) * f), pxY2 + ((mVar2.points().pxY(3) - pxY2) * f), 0.0f);
                mVar.updatePointsVBO();
            }
        };
        xVar.a((v) new k());
        w.a(mVar, 1000, xVar);
    }
}
