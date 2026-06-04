package com.tsf.shell.workspace3D.h;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
final class ac extends com.censivn.C3DEngine.b.v {
    final /* synthetic */ ab a;

    ac(ab abVar) {
        this.a = abVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    @Override // com.censivn.C3DEngine.b.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        boolean z2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i;
        int i2;
        int i3;
        int i4;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        z = this.a.u;
        if (!z) {
            z2 = this.a.v;
            if (z2) {
                Number3d M = M();
                float f26 = M.y;
                f25 = this.a.w;
                M.y = f26 + ((f25 - M().y) * 0.5f);
                return;
            }
            Number3d M2 = M();
            float f27 = M2.y;
            f = this.a.w;
            M2.y = f27 + ((f - M().y) * 0.2f);
            float f28 = M().y;
            f2 = this.a.i;
            if (f28 < f2) {
                f20 = this.a.w;
                f21 = this.a.i;
                if (f20 < f21) {
                    ab abVar = this.a;
                    f22 = abVar.w;
                    f23 = this.a.i;
                    f24 = this.a.w;
                    abVar.w = f22 + ((f23 - f24) * 0.3f);
                    f9 = M().y;
                    f10 = this.a.w;
                    if (Math.abs(f9 - f10) < 0.01d && w()) {
                        a_(false);
                        Number3d M3 = M();
                        f19 = this.a.w;
                        M3.y = f19;
                    }
                    i = this.a.B;
                    i2 = this.a.C;
                    if (i == i2) {
                        i3 = this.a.B;
                        i4 = this.a.D;
                        if (i3 == i4) {
                            ab abVar2 = this.a;
                            f11 = abVar2.w;
                            abVar2.w = f11 + 2.0f;
                            f12 = this.a.w;
                            f13 = this.a.j;
                            if (f12 > f13) {
                                ab abVar3 = this.a;
                                f14 = this.a.j;
                                abVar3.w = f14;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ab abVar4 = this.a;
                    f15 = abVar4.w;
                    abVar4.w = f15 - 2.0f;
                    f16 = this.a.w;
                    f17 = this.a.i;
                    if (f16 < f17) {
                        ab abVar5 = this.a;
                        f18 = this.a.i;
                        abVar5.w = f18;
                        return;
                    }
                    return;
                }
            }
            float f29 = M().y;
            f3 = this.a.j;
            if (f29 > f3) {
                f4 = this.a.w;
                f5 = this.a.j;
                if (f4 > f5) {
                    ab abVar6 = this.a;
                    f6 = abVar6.w;
                    f7 = this.a.j;
                    f8 = this.a.w;
                    abVar6.w = f6 + ((f7 - f8) * 0.3f);
                }
            }
            f9 = M().y;
            f10 = this.a.w;
            if (Math.abs(f9 - f10) < 0.01d) {
                a_(false);
                Number3d M32 = M();
                f19 = this.a.w;
                M32.y = f19;
            }
            i = this.a.B;
            i2 = this.a.C;
            if (i == i2) {
            }
        }
    }
}
