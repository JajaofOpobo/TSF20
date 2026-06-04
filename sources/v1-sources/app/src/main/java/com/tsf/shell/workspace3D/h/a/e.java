package com.tsf.shell.workspace3D.h.a;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends com.censivn.C3DEngine.b.v {
    private i A;
    private e B;
    private e C;
    private int D;
    private int E;
    private com.tsf.shell.workspace3D.h.a.a.l F;
    public float a = 0.0f;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;

    public final boolean i() {
        return this.I;
    }

    public final void h(boolean z) {
        this.I = true;
        Iterator it = aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                if (z) {
                    com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                    uVar.h((com.censivn.C3DEngine.a.g - (com.censivn.C3DEngine.a.b * 200.0f)) + (((float) Math.random()) * 200.0f * com.censivn.C3DEngine.a.b));
                    uVar.f(0.0f);
                    uVar.d(e(50));
                    uVar.e(e(180));
                    uVar.c(e(50));
                    uVar.j(0.0f);
                    uVar.k(0.0f);
                    com.censivn.C3DEngine.g.s.a(rVar);
                    com.censivn.C3DEngine.g.s.a(rVar, 250, uVar);
                } else {
                    rVar.L().x = 0.0f;
                    rVar.L().y = (com.censivn.C3DEngine.a.g - (com.censivn.C3DEngine.a.b * 200.0f)) + (((float) Math.random()) * 200.0f * com.censivn.C3DEngine.a.b);
                    rVar.M().x = e(50);
                    rVar.M().y = e(50);
                    rVar.M().z = e(180);
                    rVar.N().x = 0.0f;
                    rVar.N().y = 0.0f;
                }
            }
        }
    }

    private static float e(int i) {
        return (float) (i - ((i * 2) * Math.random()));
    }

    public final void i(boolean z) {
        this.I = false;
        Iterator it = aD().iterator();
        int i = 0;
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                Number3d number3d = (Number3d) x.Z.get(i);
                if (z) {
                    com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                    uVar.b((int) (Math.random() * 250.0d));
                    uVar.f(number3d.x);
                    uVar.h(number3d.y);
                    uVar.e(0.0f);
                    uVar.j(1.0f);
                    uVar.k(1.0f);
                    uVar.c(0.0f);
                    uVar.d(0.0f);
                    uVar.a(com.censivn.C3DEngine.g.a.a);
                    com.censivn.C3DEngine.g.s.a(rVar);
                    com.censivn.C3DEngine.g.s.a(rVar, 400, uVar);
                } else {
                    rVar.L().x = number3d.x;
                    rVar.L().y = number3d.y;
                    rVar.M().x = 0.0f;
                    rVar.M().y = 0.0f;
                    rVar.M().z = 0.0f;
                    rVar.N().x = 1.0f;
                    rVar.N().y = 1.0f;
                }
                i++;
            }
        }
    }

    public e(com.tsf.shell.workspace3D.h.a.a.l lVar) {
        a(lVar);
    }

    public final void a(i iVar) {
        this.A = iVar;
    }

    public final void a(com.tsf.shell.workspace3D.h.a.a.l lVar) {
        if (this.F != null) {
            this.F.b();
        }
        this.F = lVar.a();
        this.F.a(this);
        if (this.H) {
            com.tsf.shell.workspace3D.h.a.a.l lVar2 = this.F;
        }
    }

    public final com.tsf.shell.workspace3D.h.a.a.l j() {
        return this.F;
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void H() {
        aD().clear();
        this.A = null;
        this.B = null;
        this.C = null;
        this.F.b();
        this.F = null;
        Q();
        super.H();
    }

    public final void j(boolean z) {
        if (super.A() && !z) {
            g(0.0f);
        }
        super.a(Boolean.valueOf(z));
    }

    public final void a(com.tsf.shell.workspace3D.k.ah ahVar, int i) {
        int aB = aB();
        if (aB == x.J) {
            com.tsf.shell.workspace3D.k.ah ahVar2 = (com.tsf.shell.workspace3D.k.ah) aD().remove(aB - 1);
            if (this.C != null && this.C.D != 0) {
                this.C.a(ahVar2, 0);
            } else {
                this.A.a().a(ahVar2, 0);
            }
        }
        if (i >= aB) {
            i = aB;
        }
        a((com.censivn.C3DEngine.b.r) ahVar, i);
        f(i);
    }

    public final void a(com.tsf.shell.workspace3D.k.ah ahVar) {
        int f = f(ahVar);
        super.e(ahVar);
        if (aB() == 0) {
            this.A.a(this, this.B, this.C);
            return;
        }
        if (this.C != null && this.C.D != 0) {
            com.tsf.shell.workspace3D.k.ah ahVar2 = (com.tsf.shell.workspace3D.k.ah) this.C.d(0);
            this.C.a(ahVar2);
            d(ahVar2);
        }
        f(f);
    }

    public final void a(e eVar) {
        this.B = eVar;
    }

    public final void b(e eVar) {
        this.C = eVar;
    }

    public final e k() {
        return this.C;
    }

    public final void a(int i) {
        this.D = i;
    }

    public final int l() {
        return this.D;
    }

    public final boolean m() {
        return this.G;
    }

    public final void a(int i, com.censivn.C3DEngine.b.r rVar) {
        aD().set(i, rVar);
        rVar.a((com.censivn.C3DEngine.d.b) this);
        b((com.tsf.shell.workspace3D.k.ah) rVar, i);
    }

    public final void a(ArrayList arrayList) {
        int aB = aB();
        for (int i = 0; i < aB; i++) {
            a(i, (com.censivn.C3DEngine.b.r) arrayList.get((x.J * this.D) + i));
        }
    }

    public final void a(ArrayList arrayList, Runnable runnable) {
        int i;
        int aB = aB();
        com.censivn.C3DEngine.g.u uVar = null;
        int i2 = -1;
        int i3 = 0;
        while (i3 < aB) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) arrayList.get((x.J * this.D) + i3);
            com.censivn.C3DEngine.b.r d = d(i3);
            com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
            uVar2.j(1.0f);
            uVar2.k(1.0f);
            f fVar = new f(this, rVar, d, i3, uVar2);
            fVar.j(0.0f);
            fVar.k(0.0f);
            int random = (int) (Math.random() * 400.0d);
            if (random > i2) {
                i = random;
            } else {
                i = i2;
                uVar2 = uVar;
            }
            fVar.b(random);
            com.censivn.C3DEngine.g.s.a(d, 200, fVar);
            i3++;
            i2 = i;
            uVar = uVar2;
        }
        if (uVar != null) {
            uVar.a(runnable);
        }
    }

    public final void n() {
        this.F.f();
    }

    public final void o() {
        this.F.g();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        this.A.a(this);
    }

    public final void g(float f) {
        this.a = f;
        this.F.a(f);
    }

    public final void p() {
        if (this.C != null) {
            this.C.g(this.a + 1.0f);
        }
    }

    public final void q() {
        if (this.B != null) {
            this.B.g(this.a - 1.0f);
        }
    }

    public final void h(float f) {
        g(f);
        if (this.a < 0.0f) {
            if (this.C != null) {
                this.C.g(f + 1.0f);
                e eVar = this.C;
                if (eVar.C != null) {
                    if (eVar.a < 0.0f) {
                        eVar.C.g(eVar.a + 1.0f);
                        eVar.C.j(true);
                    } else {
                        eVar.C.j(false);
                    }
                }
                this.C.j(true);
            }
            if (this.B != null) {
                this.B.j(false);
                return;
            }
            return;
        }
        if (this.a > 0.0f) {
            if (this.B != null) {
                this.B.g(f - 1.0f);
                e eVar2 = this.B;
                if (eVar2.B != null) {
                    if (eVar2.a > 0.0f) {
                        eVar2.B.g(eVar2.a - 1.0f);
                        eVar2.B.j(true);
                    } else {
                        eVar2.B.j(false);
                    }
                }
                this.B.j(true);
            }
            if (this.C != null) {
                this.C.j(false);
                return;
            }
            return;
        }
        if (this.C != null) {
            this.C.j(false);
        }
        if (this.B != null) {
            this.B.j(false);
        }
    }

    public final void aG() {
        this.F.c();
    }

    public final void aH() {
        this.F.d();
    }

    public final void aI() {
        this.G = false;
        this.F.e();
    }

    public final void aJ() {
        this.G = true;
        com.tsf.shell.workspace3D.h.a.a.l lVar = this.F;
    }

    public final void aK() {
        this.H = true;
        com.tsf.shell.workspace3D.h.a.a.l lVar = this.F;
    }

    private void f(int i) {
        int aB = aB();
        while (i < aB) {
            b((com.tsf.shell.workspace3D.k.ah) d(i), i);
            i++;
        }
        this.E = aB;
    }

    private static void b(com.tsf.shell.workspace3D.k.ah ahVar, int i) {
        Number3d number3d = (Number3d) x.Z.get(i);
        ahVar.L().x = number3d.x;
        ahVar.L().y = number3d.y;
    }
}
