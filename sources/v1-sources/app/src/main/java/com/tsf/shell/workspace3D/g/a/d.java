package com.tsf.shell.workspace3D.g.a;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
final class d extends v {
    d() {
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        boolean z;
        float f;
        v vVar;
        v vVar2;
        boolean z2;
        v vVar3;
        float f2;
        v vVar4;
        float f3;
        v vVar5;
        z = c.h;
        if (!z) {
            f = c.i;
            vVar = c.a;
            float f4 = (f - vVar.L().y) * 0.2f;
            vVar2 = c.a;
            PositionNumber3d L = vVar2.L();
            L.y = f4 + L.y;
            z2 = c.k;
            if (!z2) {
                vVar3 = c.a;
                float f5 = vVar3.L().y;
                f2 = c.i;
                if (Math.abs(f5 - f2) < 0.05f) {
                    vVar4 = c.a;
                    PositionNumber3d L2 = vVar4.L();
                    f3 = c.i;
                    L2.y = f3;
                    vVar5 = c.a;
                    vVar5.a_(false);
                    c.h = true;
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void l_() {
        c.a();
    }
}
