package com.tsf.shell.workspace3D.g;

/* loaded from: classes.dex */
final class av extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ float A;
    final /* synthetic */ ar a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;
    private final /* synthetic */ float z;

    av(ar arVar, float f, float f2, float f3, float f4) {
        this.a = arVar;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        ar arVar;
        float f6;
        ar arVar2;
        float f7;
        ar arVar3;
        float f8;
        ar arVar4;
        float f9;
        float f10 = this.x;
        f2 = this.a.O;
        if (f10 != f2) {
            arVar4 = this.a.F;
            float f11 = this.x;
            f9 = this.a.O;
            arVar4.o(f11 + ((f9 - this.x) * f));
        }
        float f12 = this.y;
        f3 = this.a.P;
        if (f12 != f3) {
            arVar3 = this.a.F;
            float f13 = this.y;
            f8 = this.a.P;
            arVar3.m(f13 + ((f8 - this.y) * f));
        }
        float f14 = this.z;
        f4 = this.a.Q;
        if (f14 != f4) {
            arVar2 = this.a.F;
            float f15 = this.z;
            f7 = this.a.Q;
            arVar2.i(f15 + ((f7 - this.z) * f));
        }
        float f16 = this.A;
        f5 = this.a.R;
        if (f16 != f5) {
            arVar = this.a.F;
            float f17 = this.A;
            f6 = this.a.R;
            arVar.k(f17 + ((f6 - this.A) * f));
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
    }
}
