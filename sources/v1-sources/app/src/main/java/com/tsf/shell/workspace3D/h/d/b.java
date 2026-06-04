package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;
import com.tsf.shell.workspace3D.k.ab;
import com.tsf.shell.workspace3D.k.b.ap;
import com.tsf.shell.workspace3D.k.c.b.ac;

/* loaded from: classes.dex */
public final class b implements a {
    private int a = 1;

    @Override // com.tsf.shell.workspace3D.h.d.a
    public final int a() {
        return this.a;
    }

    @Override // com.tsf.shell.workspace3D.h.d.a
    public final void a(com.censivn.C3DEngine.e.b bVar, int i, Runnable runnable) {
        float n_ = bVar.n_();
        float pxX = bVar.E().pxX(0);
        float pxX2 = bVar.E().pxX(1);
        float pxX3 = bVar.E().pxX(2);
        float pxX4 = bVar.E().pxX(3);
        float pxY = bVar.E().pxY(0);
        float pxY2 = bVar.E().pxY(1);
        float pxY3 = bVar.E().pxY(2);
        float pxY4 = bVar.E().pxY(3);
        float f = -n_;
        c cVar = new c(this, bVar, i, runnable, pxX, n_, pxY, pxY * 0.2f, pxX3, n_, pxY3, pxY3 * 0.2f, pxX2, f, pxY2, pxY2 * 0.2f, pxX4, f, pxY4, pxY4 * 0.2f);
        cVar.a((r) new com.censivn.C3DEngine.g.m());
        s.a(bVar, 250, cVar);
    }

    @Override // com.tsf.shell.workspace3D.h.d.a
    public final void a(com.tsf.shell.workspace3D.k.j jVar, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        if (jVar instanceof ab) {
            ab abVar = (ab) jVar;
            abVar.a((a) this);
            abVar.g(i);
            float pxX = abVar.D.E().pxX(ap.c);
            float pxY = abVar.D.E().pxY(ap.c);
            float pxX2 = abVar.D.E().pxX(ap.d);
            float pxY2 = abVar.D.E().pxY(ap.d);
            float pxX3 = abVar.D.E().pxX(ap.e);
            float pxY3 = abVar.D.E().pxY(ap.e);
            float pxX4 = abVar.D.E().pxX(ap.f);
            float pxY4 = abVar.D.E().pxY(ap.f);
            float pxX5 = abVar.D.E().pxX(ap.g);
            float pxY5 = abVar.D.E().pxY(ap.g);
            float pxX6 = abVar.D.E().pxX(ap.h);
            float pxY6 = abVar.D.E().pxY(ap.h);
            float pxX7 = abVar.D.E().pxX(ap.i);
            float pxY7 = abVar.D.E().pxY(ap.i);
            float pxX8 = abVar.D.E().pxX(ap.j);
            float pxY8 = abVar.D.E().pxY(ap.j);
            float random = (float) (64.0d + (200.0f * com.censivn.C3DEngine.a.b * Math.random()));
            if (abVar.M().z != 0.0f) {
                float f25 = -abVar.M().z;
                Number3d number3d = ap.b;
                number3d.x = random;
                number3d.y = 0.2f * pxY;
                number3d.rotateDegressZ(f25);
                f23 = number3d.x;
                f9 = number3d.y;
                number3d.x = random;
                number3d.y = 0.2f * pxY3;
                number3d.rotateDegressZ(f25);
                f21 = number3d.x;
                f10 = number3d.y;
                number3d.x = random;
                number3d.y = 0.2f * pxY5;
                number3d.rotateDegressZ(f25);
                f19 = number3d.x;
                f11 = number3d.y;
                number3d.x = random;
                number3d.y = 0.2f * pxY7;
                number3d.rotateDegressZ(f25);
                f18 = number3d.x;
                f12 = number3d.y;
                number3d.x = -random;
                number3d.y = 0.2f * pxY2;
                number3d.rotateDegressZ(f25);
                f22 = number3d.x;
                f14 = number3d.y;
                number3d.x = -random;
                number3d.y = 0.2f * pxY4;
                number3d.rotateDegressZ(f25);
                f20 = number3d.x;
                f15 = number3d.y;
                number3d.x = -random;
                number3d.y = 0.2f * pxY6;
                number3d.rotateDegressZ(f25);
                f13 = number3d.x;
                f16 = number3d.y;
                number3d.x = -random;
                number3d.y = 0.2f * pxY8;
                number3d.rotateDegressZ(f25);
                f24 = number3d.x;
                f17 = number3d.y;
            } else {
                f9 = pxY * 0.2f;
                f10 = pxY3 * 0.2f;
                f11 = pxY5 * 0.2f;
                f12 = pxY7 * 0.2f;
                f13 = -random;
                f14 = pxY2 * 0.2f;
                f15 = pxY4 * 0.2f;
                f16 = pxY6 * 0.2f;
                f17 = pxY8 * 0.2f;
                f18 = random;
                f19 = random;
                f20 = f13;
                f21 = random;
                f22 = f13;
                f23 = random;
                f24 = f13;
            }
            g gVar = new g(this, abVar, i, pxX, f23, pxY, f9, pxX3, f21, pxY3, f10, pxX5, f19, pxY5, f11, pxX7, f18, pxY7, f12, pxX2, f22, pxY2, f14, pxX4, f20, pxY4, f15, pxX6, f13, pxY6, f16, pxX8, f24, pxY8, f17);
            gVar.a((r) new com.censivn.C3DEngine.g.m());
            s.a(abVar, 250, gVar);
            return;
        }
        if (jVar instanceof ac) {
            ac acVar = (ac) jVar;
            acVar.a((a) this);
            acVar.g(i);
            com.censivn.C3DEngine.e.b l = acVar.aH().l();
            float random2 = (float) (com.tsf.shell.workspace3D.k.c.b.c.e.i + (200.0f * com.censivn.C3DEngine.a.b * Math.random()));
            float pxX9 = l.E().pxX(0);
            float pxX10 = l.E().pxX(1);
            float pxX11 = l.E().pxX(2);
            float pxX12 = l.E().pxX(3);
            float pxY9 = l.E().pxY(0);
            float pxY10 = l.E().pxY(1);
            float pxY11 = l.E().pxY(2);
            float pxY12 = l.E().pxY(3);
            if (acVar.M().z != 0.0f) {
                float f26 = -acVar.M().z;
                Number3d number3d2 = ap.b;
                number3d2.x = random2;
                number3d2.y = 0.2f * pxY9;
                number3d2.rotateDegressZ(f26);
                f8 = number3d2.x;
                f = number3d2.y;
                number3d2.x = random2;
                number3d2.y = 0.2f * pxY11;
                number3d2.rotateDegressZ(f26);
                f6 = number3d2.x;
                f2 = number3d2.y;
                number3d2.x = -random2;
                number3d2.y = 0.2f * pxY10;
                number3d2.rotateDegressZ(f26);
                f7 = number3d2.x;
                f4 = number3d2.y;
                number3d2.x = -random2;
                number3d2.y = 0.2f * pxY12;
                number3d2.rotateDegressZ(f26);
                f3 = number3d2.x;
                f5 = number3d2.y;
            } else {
                f = pxY9 * 0.2f;
                f2 = pxY11 * 0.2f;
                f3 = -random2;
                f4 = pxY10 * 0.2f;
                f5 = pxY12 * 0.2f;
                f6 = random2;
                f7 = f3;
                f8 = random2;
            }
            e eVar = new e(this, acVar, i, l, pxX9, f8, pxY9, f, pxX11, f6, pxY11, f2, pxX10, f7, pxY10, f4, pxX12, f3, pxY12, f5);
            eVar.a((r) new com.censivn.C3DEngine.g.m());
            s.a(acVar, 250, eVar);
        }
    }

    @Override // com.tsf.shell.workspace3D.h.d.a
    public final void a(com.tsf.shell.workspace3D.k.j jVar) {
        if (jVar instanceof ab) {
            ab abVar = (ab) jVar;
            s.a(abVar);
            if (abVar.aS() == 0) {
                abVar.D.E().setPX(ap.c, ap.k, ap.s, 0.0f);
                abVar.D.E().setPX(ap.e, ap.m, ap.u, 0.0f);
                abVar.D.E().setPX(ap.g, ap.o, ap.w, 0.0f);
                abVar.D.E().setPX(ap.i, ap.q, ap.y, 0.0f);
                abVar.D.ag();
            } else {
                abVar.D.E().setPX(ap.d, ap.l, ap.t, 0.0f);
                abVar.D.E().setPX(ap.f, ap.n, ap.v, 0.0f);
                abVar.D.E().setPX(ap.h, ap.p, ap.x, 0.0f);
                abVar.D.E().setPX(ap.j, ap.r, ap.z, 0.0f);
                abVar.D.ag();
            }
            abVar.D.ag();
            abVar.a((a) null);
            return;
        }
        if (jVar instanceof ac) {
            ac acVar = (ac) jVar;
            com.censivn.C3DEngine.e.b l = acVar.aH().l();
            s.a(acVar);
            if (acVar.aS() == 0) {
                l.E().setPX(0, com.tsf.shell.workspace3D.k.c.b.c.e.i, com.tsf.shell.workspace3D.k.c.b.c.e.m, 0.0f);
                l.E().setPX(2, com.tsf.shell.workspace3D.k.c.b.c.e.k, com.tsf.shell.workspace3D.k.c.b.c.e.o, 0.0f);
                l.ag();
            } else {
                l.E().setPX(1, com.tsf.shell.workspace3D.k.c.b.c.e.j, com.tsf.shell.workspace3D.k.c.b.c.e.n, 0.0f);
                l.E().setPX(3, com.tsf.shell.workspace3D.k.c.b.c.e.l, com.tsf.shell.workspace3D.k.c.b.c.e.p, 0.0f);
                l.ag();
            }
            acVar.a((a) null);
        }
    }
}
