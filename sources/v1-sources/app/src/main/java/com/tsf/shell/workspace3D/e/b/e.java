package com.tsf.shell.workspace3D.e.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.e.o;
import com.tsf.shell.workspace3D.e.p;
import com.tsf.shell.workspace3D.k.c.b.ac;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends a {
    public e() {
        this.c = 3;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final float a(int i, ArrayList arrayList, float f) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            r rVar = (r) arrayList.get(i2);
            f2 += (rVar.ao() - rVar.al()) + f;
        }
        return f2 - f;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public void a(v vVar, v vVar2) {
        vVar.L().x += (vVar2.L().x - vVar.L().x) * 0.15f;
        vVar.L().y = 138.0f * com.censivn.C3DEngine.a.b;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final float a(ArrayList arrayList, int i, float f, float f2, float f3, float f4) {
        if (i == 0) {
            return 1.0f;
        }
        float f5 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            r rVar = (r) arrayList.get(i2);
            f5 += (rVar.ao() - rVar.al()) + f4;
        }
        float f6 = ((f - f2) - f3) / (f5 - f4);
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public void a(o oVar, r rVar, float f, boolean z) {
        float f2;
        if (rVar instanceof ac) {
            f2 = com.tsf.shell.workspace3D.k.c.b.c.d.y;
            if (com.tsf.shell.workspace3D.k.c.b.c.d.C) {
                oVar.c = 0.0f;
            }
        } else {
            f2 = 0.0f;
        }
        if (this.d) {
            if (z) {
                oVar.b = oVar.g - (rVar.am() * f);
                return;
            } else {
                oVar.b = ((-(rVar.ap() + rVar.am())) / 2.0f) * f;
                return;
            }
        }
        oVar.b = (((-rVar.am()) * f) - p.q) - f2;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public void a(u uVar, float f) {
        uVar.f(0.0f);
        uVar.h(f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public Number3d a(r rVar) {
        Number3d.TEMPNUMBER3D.x = rVar.L().x;
        Number3d.TEMPNUMBER3D.y = com.censivn.C3DEngine.a.h - p.b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public Number3d b(r rVar) {
        Number3d.TEMPNUMBER3D.x = rVar.L().x;
        Number3d.TEMPNUMBER3D.y = com.censivn.C3DEngine.a.h + p.a;
        return Number3d.TEMPNUMBER3D;
    }

    public float a(o oVar, r rVar, float f) {
        return oVar.b + (rVar.am() * f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public boolean a(boolean z) {
        return z;
    }
}
