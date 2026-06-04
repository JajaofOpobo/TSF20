package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class x extends com.censivn.C3DEngine.b.v {
    final /* synthetic */ p a;

    x(p pVar) {
        this.a = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:
    
        if (r0 > r1) goto L19;
     */
    @Override // com.censivn.C3DEngine.b.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        boolean z2;
        e eVar;
        float f;
        float f2;
        cg cgVar;
        float f3;
        float f4;
        float f5;
        e eVar2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        e eVar3;
        float f11;
        cg cgVar2;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z3;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        boolean z4;
        float f22;
        float f23;
        com.censivn.C3DEngine.b.v vVar;
        z = this.a.B;
        if (!z) {
            z3 = this.a.aQ;
            if (!z3) {
                PositionNumber3d L = L();
                float f24 = L.x;
                f16 = this.a.x;
                float f25 = f16 - L().x;
                f17 = this.a.A;
                L.x = f24 + (f25 * f17);
                PositionNumber3d L2 = L();
                float f26 = L2.y;
                f18 = this.a.y;
                float f27 = f18 - L().y;
                f19 = this.a.A;
                L2.y = f26 + (f27 * f19);
                float f28 = L().x;
                f20 = this.a.x;
                if (Math.abs(f28 - f20) < 0.2f) {
                    float f29 = L().y;
                    f21 = this.a.y;
                    if (Math.abs(f29 - f21) < 0.2f) {
                        z4 = this.a.D;
                        if (!z4) {
                            PositionNumber3d L3 = L();
                            f22 = this.a.x;
                            L3.x = f22;
                            PositionNumber3d L4 = L();
                            f23 = this.a.y;
                            L4.y = f23;
                            this.a.B = true;
                            vVar = this.a.w;
                            vVar.a_(false);
                        }
                    }
                }
            }
        }
        z2 = this.a.C;
        if (!z2) {
            eVar = this.a.af;
            f = this.a.az;
            if (eVar.g(f) <= 0.32f) {
                f14 = this.a.az;
                f15 = this.a.z;
            }
            p pVar = this.a;
            f2 = this.a.az;
            pVar.z = f2;
            cgVar = this.a.W;
            float k = cgVar.k();
            p pVar2 = this.a;
            f3 = this.a.z;
            f4 = this.a.A;
            pVar2.X = k + ((f3 - k) * f4);
            p pVar3 = this.a;
            f5 = this.a.X;
            pVar3.a(f5, true);
            eVar2 = this.a.af;
            f6 = this.a.X;
            eVar2.i(f6);
            f7 = this.a.X;
            f8 = this.a.z;
            if (Math.abs(f7 - f8) < 0.2f) {
                p pVar4 = this.a;
                f9 = this.a.z;
                pVar4.X = f9;
                p pVar5 = this.a;
                f10 = this.a.X;
                pVar5.a(f10, true);
                eVar3 = this.a.af;
                f11 = this.a.X;
                eVar3.i(f11);
                cgVar2 = this.a.W;
                cgVar2.a_(false);
                this.a.C = true;
                if (com.censivn.C3DEngine.a.q) {
                    f13 = this.a.X;
                    com.tsf.shell.a.t.a(f13);
                } else {
                    f12 = this.a.X;
                    com.tsf.shell.a.t.b(f12);
                }
            }
        }
    }
}
