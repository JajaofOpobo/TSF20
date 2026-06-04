package com.tsf.shell.workspace3D.j.a;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
final class b extends v {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
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
            f = this.a.g;
            L.x = f5 + ((f - L().x) * 0.25f);
            PositionNumber3d L2 = L();
            float f6 = L2.y;
            f2 = this.a.h;
            L2.y = f6 + ((f2 - L().y) * 0.25f);
            float f7 = L().x;
            f3 = this.a.g;
            if (Math.abs(f7 - f3) < 0.2f) {
                float f8 = L().y;
                f4 = this.a.h;
                if (Math.abs(f8 - f4) < 0.2f) {
                    a_(false);
                }
            }
        }
    }
}
