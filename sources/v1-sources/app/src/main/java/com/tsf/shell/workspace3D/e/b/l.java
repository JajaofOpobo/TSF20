package com.tsf.shell.workspace3D.e.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.e.o;
import com.tsf.shell.workspace3D.e.p;
import com.tsf.shell.workspace3D.k.c.b.ac;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends a {
    public l() {
        this.c = 0;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final float a(int i, ArrayList arrayList, float f) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            r rVar = (r) arrayList.get(i2);
            f2 += (rVar.ap() - rVar.am()) + f;
        }
        return f2 - f;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public void a(v vVar, v vVar2) {
        float ap = vVar2.L().y + ((vVar2.ap() - vVar2.am()) * 0.5f) + vVar2.am();
        PositionNumber3d L = vVar.L();
        L.y = ((ap - vVar.L().y) * 0.15f) + L.y;
        vVar.L().x = 160.0f * com.censivn.C3DEngine.a.b;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final float a(ArrayList arrayList, int i, float f, float f2, float f3, float f4) {
        if (i == 0) {
            return 1.0f;
        }
        float f5 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            r rVar = (r) arrayList.get(i2);
            f5 += (rVar.ap() - rVar.am()) + f4;
        }
        float f6 = ((f - f2) - f3) / (f5 - f4);
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public void a(o oVar, r rVar, float f, boolean z) {
        float f2 = 0.0f;
        if (rVar instanceof ac) {
            f2 = com.tsf.shell.workspace3D.k.c.b.c.d.A;
            if (com.tsf.shell.workspace3D.k.c.b.c.d.C) {
                oVar.c = -90.0f;
            }
        }
        if (this.d) {
            if (z) {
                oVar.a = oVar.g - (rVar.al() * f);
                return;
            } else {
                oVar.a = ((-(rVar.ao() + rVar.al())) / 2.0f) * f;
                return;
            }
        }
        oVar.a = (((-rVar.al()) * f) - p.s) - f2;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public void a(u uVar, float f) {
        uVar.h(0.0f);
        uVar.f(f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public Number3d a(r rVar) {
        Number3d.TEMPNUMBER3D.y = rVar.L().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.a.e - p.b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public Number3d b(r rVar) {
        Number3d.TEMPNUMBER3D.y = rVar.L().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.a.e + p.a;
        return Number3d.TEMPNUMBER3D;
    }

    public float a(o oVar, r rVar, float f) {
        return oVar.a + (rVar.al() * f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final boolean a(boolean z) {
        return false;
    }
}
