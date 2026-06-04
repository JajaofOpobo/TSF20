package com.tsf.shell.workspace3D.e.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.e.o;
import com.tsf.shell.workspace3D.e.p;
import com.tsf.shell.workspace3D.k.c.b.ac;

/* loaded from: classes.dex */
public final class i extends g {
    public i() {
        this.c = 1;
    }

    @Override // com.tsf.shell.workspace3D.e.b.l, com.tsf.shell.workspace3D.e.b.a
    public final void a(v vVar, v vVar2) {
        float ap = vVar2.L().y + ((vVar2.ap() - vVar2.am()) * 0.5f) + vVar2.am();
        PositionNumber3d L = vVar.L();
        L.y = ((ap - vVar.L().y) * 0.15f) + L.y;
        vVar.L().x = (-160.0f) * com.censivn.C3DEngine.a.b;
    }

    @Override // com.tsf.shell.workspace3D.e.b.g, com.tsf.shell.workspace3D.e.b.a
    public final int b(float f, float f2) {
        return b(-f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.g, com.tsf.shell.workspace3D.e.b.a
    public final void a(r rVar, float f, float f2, float f3) {
        rVar.b(com.censivn.C3DEngine.a.b * (-83.0f), 0.0f + f, 0.0f, 2.1474836E9f, f3 - f2);
    }

    @Override // com.tsf.shell.workspace3D.e.b.l
    public final float a(o oVar, r rVar, float f) {
        return oVar.a + (rVar.ao() * f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.l, com.tsf.shell.workspace3D.e.b.a
    public final void a(o oVar, r rVar, float f, boolean z) {
        float f2 = 0.0f;
        if (rVar instanceof ac) {
            f2 = com.tsf.shell.workspace3D.k.c.b.c.d.B;
            if (com.tsf.shell.workspace3D.k.c.b.c.d.C) {
                oVar.c = 90.0f;
            }
        }
        if (this.d) {
            if (z) {
                oVar.a = oVar.g - (rVar.ao() * f);
                return;
            } else {
                oVar.a = ((-(rVar.ao() + rVar.al())) / 2.0f) * f;
                return;
            }
        }
        oVar.a = f2 + ((-rVar.ao()) * f) + p.t;
    }

    @Override // com.tsf.shell.workspace3D.e.b.l, com.tsf.shell.workspace3D.e.b.a
    public final Number3d a(r rVar) {
        Number3d.TEMPNUMBER3D.y = rVar.L().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.a.f + p.b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.workspace3D.e.b.l, com.tsf.shell.workspace3D.e.b.a
    public final Number3d b(r rVar) {
        Number3d.TEMPNUMBER3D.y = rVar.L().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.a.f - p.a;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.workspace3D.e.b.l, com.tsf.shell.workspace3D.e.b.a
    public final void a(u uVar, float f) {
        uVar.h(0.0f);
        uVar.f(-f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.g, com.tsf.shell.workspace3D.e.b.a
    public final b a(r rVar, float f) {
        float asin;
        b bVar = a.b;
        if (((-com.censivn.C3DEngine.a.h) - p.a) + rVar.L().y > f) {
            asin = 180.0f;
        } else {
            asin = ((float) (Math.asin(r0 / f) / 0.017453292519943295d)) + 90.0f;
        }
        bVar.a = 24.0f;
        bVar.b = ((asin - 16.0f) + 8.0f) - 4.0f;
        bVar.d = 4.0f;
        bVar.e = (bVar.b / 2.0f) + 16.0f + 4.0f;
        return bVar;
    }

    @Override // com.tsf.shell.workspace3D.e.b.g, com.tsf.shell.workspace3D.e.b.a
    public final int c(float f, float f2) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        return (f <= f2 - 20.0f || f >= f2 + 20.0f) ? 1 : 2;
    }
}
