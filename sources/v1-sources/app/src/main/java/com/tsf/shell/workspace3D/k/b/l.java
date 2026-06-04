package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class l extends com.censivn.C3DEngine.b.v {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        boolean z;
        float f;
        boolean z2;
        float f2;
        float f3;
        z = this.a.v;
        if (!z) {
            PositionNumber3d L = L();
            float f4 = L.x;
            f = this.a.w;
            L.x = f4 + ((f - L().x) * 0.5f);
            z2 = this.a.x;
            if (!z2) {
                float f5 = L().x;
                f2 = this.a.w;
                if (Math.abs(f5 - f2) < 0.2d) {
                    PositionNumber3d L2 = L();
                    f3 = this.a.w;
                    L2.x = f3;
                    this.a.v();
                }
            }
        }
    }
}
