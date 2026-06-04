package com.tsf.shell.workspace3D.j.b;

import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class e extends com.censivn.C3DEngine.b.v {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
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
            f = this.a.m;
            L.x = f5 + ((f - L().x) * 0.35f);
            PositionNumber3d L2 = L();
            float f6 = L2.y;
            f2 = this.a.n;
            L2.y = f6 + ((f2 - L().y) * 0.35f);
            float f7 = L().x;
            f3 = this.a.m;
            if (Math.abs(f7 - f3) < 0.2f) {
                float f8 = L().y;
                f4 = this.a.n;
                if (Math.abs(f8 - f4) < 0.2f) {
                    a_(false);
                }
            }
        }
    }
}
