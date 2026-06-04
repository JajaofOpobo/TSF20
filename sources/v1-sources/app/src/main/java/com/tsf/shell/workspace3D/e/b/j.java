package com.tsf.shell.workspace3D.e.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.e.o;
import com.tsf.shell.workspace3D.e.p;
import com.tsf.shell.workspace3D.k.c.b.ac;

/* loaded from: classes.dex */
public final class j extends c {
    public j() {
        this.c = 2;
    }

    @Override // com.tsf.shell.workspace3D.e.b.e, com.tsf.shell.workspace3D.e.b.a
    public final void a(v vVar, v vVar2) {
        vVar.L().x += (vVar2.L().x - vVar.L().x) * 0.15f;
        vVar.L().y = (-138.0f) * com.censivn.C3DEngine.a.b;
    }

    @Override // com.tsf.shell.workspace3D.e.b.c, com.tsf.shell.workspace3D.e.b.a
    public final int b(float f, float f2) {
        return b(-f2);
    }

    @Override // com.tsf.shell.workspace3D.e.b.c, com.tsf.shell.workspace3D.e.b.a
    public final void a(r rVar, float f, float f2, float f3) {
        rVar.b((-f3) + f2, com.censivn.C3DEngine.a.b * (-83.0f), 0.0f, -f, 2.1474836E9f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.e
    public final float a(o oVar, r rVar, float f) {
        return oVar.b + (rVar.ap() * f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.e, com.tsf.shell.workspace3D.e.b.a
    public final void a(o oVar, r rVar, float f, boolean z) {
        float f2 = 0.0f;
        if (rVar instanceof ac) {
            f2 = com.tsf.shell.workspace3D.k.c.b.c.d.z;
            if (com.tsf.shell.workspace3D.k.c.b.c.d.C) {
                oVar.c = 180.0f;
            }
        }
        if (this.d) {
            if (z) {
                oVar.b = oVar.g - (rVar.ap() * f);
                return;
            } else {
                oVar.b = ((-(rVar.ap() + rVar.am())) / 2.0f) * f;
                return;
            }
        }
        oVar.b = f2 + ((-rVar.ap()) * f) + p.r;
    }

    @Override // com.tsf.shell.workspace3D.e.b.e, com.tsf.shell.workspace3D.e.b.a
    public final boolean a(boolean z) {
        return z;
    }

    @Override // com.tsf.shell.workspace3D.e.b.e, com.tsf.shell.workspace3D.e.b.a
    public final Number3d a(r rVar) {
        Number3d.TEMPNUMBER3D.x = rVar.L().x;
        Number3d.TEMPNUMBER3D.y = com.censivn.C3DEngine.a.o + p.b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.workspace3D.e.b.e, com.tsf.shell.workspace3D.e.b.a
    public final Number3d b(r rVar) {
        Number3d.TEMPNUMBER3D.x = rVar.L().x;
        Number3d.TEMPNUMBER3D.y = com.censivn.C3DEngine.a.g - p.a;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.workspace3D.e.b.e, com.tsf.shell.workspace3D.e.b.a
    public final void a(u uVar, float f) {
        uVar.f(0.0f);
        uVar.h(-f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.c, com.tsf.shell.workspace3D.e.b.a
    public final b a(r rVar, float f) {
        float asin;
        b bVar = a.b;
        if ((com.censivn.C3DEngine.a.f - p.a) - rVar.L().x > f) {
            asin = 180.0f;
        } else {
            asin = ((float) (Math.asin(r0 / f) / 0.017453292519943295d)) + 90.0f;
        }
        bVar.a = 24.0f;
        bVar.b = ((asin - 16.0f) + 8.0f) - 4.0f;
        bVar.d = -266.0f;
        bVar.e = (-254.0f) + (bVar.b / 2.0f) + 4.0f;
        return bVar;
    }

    @Override // com.tsf.shell.workspace3D.e.b.c, com.tsf.shell.workspace3D.e.b.a
    public final int c(float f, float f2) {
        return ((f <= -270.0f || f >= 20.0f + f2) && (f >= 90.0f || f <= 70.0f)) ? 1 : 2;
    }
}
