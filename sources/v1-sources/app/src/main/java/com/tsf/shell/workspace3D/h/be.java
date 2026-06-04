package com.tsf.shell.workspace3D.h;

import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class be extends com.censivn.C3DEngine.e.b {
    final /* synthetic */ ba a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(ba baVar, float f, float f2) {
        super(f, f2, 5, 5, false);
        this.a = baVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0 != false) goto L6;
     */
    @Override // com.censivn.C3DEngine.b.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        com.censivn.C3DEngine.e.b bVar;
        float f;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        float f2;
        com.censivn.C3DEngine.e.b bVar4;
        boolean z2;
        com.censivn.C3DEngine.e.b bVar5;
        float f3;
        com.censivn.C3DEngine.e.b bVar6;
        float f4;
        com.censivn.C3DEngine.e.b bVar7;
        float f5;
        com.censivn.C3DEngine.e.b bVar8;
        float f6;
        com.censivn.C3DEngine.e.b bVar9;
        boolean z3;
        boolean z4;
        float f7;
        float f8;
        float f9;
        float f10;
        com.censivn.C3DEngine.c.a aVar;
        com.censivn.C3DEngine.c.b.a aVar2;
        com.censivn.C3DEngine.c.b.a aVar3;
        boolean z5;
        z = this.a.u;
        if (z) {
            z5 = this.a.x;
        }
        bVar = this.a.c;
        PositionNumber3d L = bVar.L();
        float f11 = L.x;
        f = this.a.v;
        bVar2 = this.a.c;
        L.x = f11 + ((f - bVar2.L().x) * 0.2f);
        bVar3 = this.a.c;
        PositionNumber3d L2 = bVar3.L();
        float f12 = L2.y;
        f2 = this.a.w;
        bVar4 = this.a.c;
        L2.y = f12 + ((f2 - bVar4.L().y) * 0.2f);
        z2 = this.a.x;
        if (!z2) {
            bVar5 = this.a.c;
            float f13 = bVar5.L().x;
            f3 = this.a.v;
            if (Math.abs(f13 - f3) < 0.2f) {
                bVar6 = this.a.c;
                float f14 = bVar6.L().y;
                f4 = this.a.w;
                if (Math.abs(f14 - f4) < 0.2f) {
                    this.a.u = true;
                    bVar7 = this.a.c;
                    PositionNumber3d L3 = bVar7.L();
                    f5 = this.a.v;
                    L3.x = f5;
                    bVar8 = this.a.c;
                    PositionNumber3d L4 = bVar8.L();
                    f6 = this.a.w;
                    L4.y = f6;
                    bVar9 = this.a.c;
                    bVar9.a_(false);
                }
            }
        }
        z3 = this.a.y;
        if (z3) {
            z4 = this.a.u;
            if (z4) {
                f7 = this.a.l;
                float f15 = (f7 * 5.0f) / com.censivn.C3DEngine.a.j;
                f8 = this.a.m;
                float f16 = ((-f8) * 5.0f) / com.censivn.C3DEngine.a.j;
                float abs = Math.abs(f15);
                f9 = this.a.n;
                if (abs <= f9) {
                    aVar3 = this.a.k;
                    aVar3.a(f15);
                }
                float abs2 = Math.abs(f16);
                f10 = this.a.o;
                if (abs2 <= f10) {
                    aVar2 = this.a.k;
                    aVar2.b(f16);
                }
                aVar = this.a.j;
                aVar.a();
            }
        }
    }
}
