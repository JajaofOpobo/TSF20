package com.tsf.shell.workspace3D.g.d;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
final class f extends com.censivn.C3DEngine.e.b {
    final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(d dVar, float f, float f2) {
        super(f, f2, (byte) 0);
        this.a = dVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        float f;
        float f2;
        float f3;
        if (I() == 0.0f) {
            Number3d M = M();
            f3 = this.a.K;
            M.z = f3;
        } else {
            Number3d M2 = M();
            float f4 = M2.z;
            f = this.a.K;
            M2.z = f4 + ((f - M().z) * 0.23f);
        }
        float I = I();
        f2 = this.a.L;
        float I2 = I + ((f2 - I()) * 0.23f);
        if (Math.abs(I2 - I()) < 1.0f) {
            I2 = this.a.L;
        }
        b(I2);
    }
}
