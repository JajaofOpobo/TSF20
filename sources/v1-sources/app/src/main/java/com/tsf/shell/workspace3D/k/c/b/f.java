package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class f implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ boolean b;

    f(c cVar, boolean z) {
        this.a = cVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        Number3d number3d;
        Number3d number3d2;
        Number3d number3d3;
        Number3d number3d4;
        Number3d number3d5;
        Number3d number3d6;
        Number3d number3d7;
        Number3d number3d8;
        Number3d number3d9;
        com.censivn.C3DEngine.e.b bVar3;
        Number3d number3d10;
        Number3d number3d11;
        Number3d number3d12;
        com.censivn.C3DEngine.g.u uVar;
        Number3d number3d13;
        Number3d number3d14;
        Number3d number3d15;
        Number3d number3d16;
        Number3d number3d17;
        Number3d number3d18;
        Number3d number3d19;
        Number3d number3d20;
        Number3d number3d21;
        com.censivn.C3DEngine.e.b bVar4;
        com.censivn.C3DEngine.e.b bVar5;
        com.censivn.C3DEngine.e.b bVar6;
        com.censivn.C3DEngine.e.b bVar7;
        com.censivn.C3DEngine.e.b bVar8;
        com.censivn.C3DEngine.e.b bVar9;
        Number3d number3d22;
        Number3d number3d23;
        com.tsf.shell.workspace3D.e.o oVar = null;
        bVar = this.a.P;
        if (bVar != null) {
            Number3d.TEMPNUMBER3D.reset();
            com.tsf.shell.workspace3D.e.e h = bf.s().h();
            bVar4 = this.a.P;
            oVar = h.g(bVar4);
            Number3d number3d24 = Number3d.TEMPNUMBER3D2;
            bVar5 = this.a.P;
            number3d24.setAllFrom(bVar5.L());
            bVar6 = this.a.P;
            bVar6.L().x = oVar.a;
            bVar7 = this.a.P;
            bVar7.L().y = oVar.b;
            bVar8 = this.a.P;
            bVar8.c(Number3d.TEMPNUMBER3D);
            bVar9 = this.a.P;
            bVar9.L().setAllFrom(Number3d.TEMPNUMBER3D2);
            Number3d.TEMPNUMBER3D.x += bf.s().B();
            Number3d.TEMPNUMBER3D.y += bf.s().C();
            number3d22 = this.a.B;
            number3d22.setAllFrom(Number3d.TEMPNUMBER3D);
            number3d23 = this.a.C;
            number3d23.z = oVar.c;
        }
        if (this.b) {
            bVar3 = this.a.P;
            if (bVar3 != null) {
                if (bf.s().u()) {
                    com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
                    uVar2.j(oVar.d);
                    uVar2.k(oVar.d);
                    number3d19 = this.a.B;
                    uVar2.f(number3d19.x);
                    number3d20 = this.a.B;
                    uVar2.h(number3d20.y);
                    uVar2.a(255);
                    number3d21 = this.a.C;
                    uVar2.e(number3d21.z);
                    uVar = uVar2;
                } else {
                    uVar = new g(this);
                    uVar.j(0.0f);
                    uVar.k(0.0f);
                    uVar.a(0);
                }
            } else {
                if (com.censivn.C3DEngine.a.q) {
                    number3d16 = this.a.B;
                    number3d16.x = this.a.g.be().cellX;
                    number3d17 = this.a.B;
                    number3d17.y = this.a.g.be().cellY;
                    number3d18 = this.a.C;
                    number3d18.z = this.a.g.be().rotation;
                } else {
                    number3d10 = this.a.B;
                    number3d10.x = this.a.g.be().cellXH;
                    number3d11 = this.a.B;
                    number3d11.y = this.a.g.be().cellYH;
                    number3d12 = this.a.C;
                    number3d12.z = this.a.g.be().rotationH;
                }
                uVar = new com.censivn.C3DEngine.g.u();
                number3d13 = this.a.B;
                uVar.f(number3d13.x);
                number3d14 = this.a.B;
                uVar.h(number3d14.y);
                number3d15 = this.a.C;
                uVar.e(number3d15.z);
            }
            uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.i());
            com.censivn.C3DEngine.g.s.a(this.a.g, 350, uVar);
        } else {
            bVar2 = this.a.P;
            if (bVar2 != null) {
                if (bf.s().u()) {
                    this.a.g.N().x = oVar.d;
                    this.a.g.N().y = oVar.d;
                } else {
                    this.a.g.N().x = 0.0f;
                    this.a.g.N().y = 0.0f;
                    this.a.g.b(0.0f);
                    this.a.g.a((Boolean) false);
                }
            } else if (com.censivn.C3DEngine.a.q) {
                number3d4 = this.a.B;
                number3d4.x = this.a.g.be().cellX;
                number3d5 = this.a.B;
                number3d5.y = this.a.g.be().cellY;
                number3d6 = this.a.C;
                number3d6.z = this.a.g.be().rotation;
            } else {
                number3d = this.a.B;
                number3d.x = this.a.g.be().cellXH;
                number3d2 = this.a.B;
                number3d2.y = this.a.g.be().cellYH;
                number3d3 = this.a.C;
                number3d3.z = this.a.g.be().rotationH;
            }
            PositionNumber3d L = this.a.g.L();
            number3d7 = this.a.B;
            L.x = number3d7.x;
            PositionNumber3d L2 = this.a.g.L();
            number3d8 = this.a.B;
            L2.y = number3d8.y;
            Number3d M = this.a.g.M();
            number3d9 = this.a.C;
            M.z = number3d9.z;
        }
        bf.m().a(new h(this), this.b);
    }
}
