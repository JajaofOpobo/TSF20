package com.tsf.shell.workspace3D.j;

import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class o extends com.censivn.C3DEngine.b.v {
    final /* synthetic */ n a;

    o(n nVar) {
        this.a = nVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        float f;
        float f2;
        float f3;
        float f4;
        if (w()) {
            PositionNumber3d L = L();
            float f5 = L.x;
            f = this.a.h;
            L.x = f5 + ((f - L().x) * 0.35f);
            PositionNumber3d L2 = L();
            float f6 = L2.y;
            f2 = this.a.i;
            L2.y = f6 + ((f2 - L().y) * 0.35f);
            float f7 = L().x;
            f3 = this.a.h;
            if (Math.abs(f7 - f3) < 0.2f) {
                float f8 = L().y;
                f4 = this.a.i;
                if (Math.abs(f8 - f4) < 0.2f) {
                    a_(false);
                }
            }
        }
    }
}
