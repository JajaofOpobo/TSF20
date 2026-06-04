package com.tsf.shell.workspace3D.g;

/* loaded from: classes.dex */
final class am extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ float A;
    final /* synthetic */ al a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;
    private final /* synthetic */ float z;

    am(al alVar, float f, float f2, float f3, float f4) {
        this.a = alVar;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        al alVar;
        float f2 = this.x + (this.x * (1.0f - f));
        float f3 = this.y + (this.y * (1.0f - f));
        float f4 = (this.z * (1.0f - f)) + this.z;
        float f5 = this.A + (this.A * (1.0f - f));
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        this.a.o(f2);
        this.a.m(f3);
        this.a.i(f4);
        this.a.k(f6);
        this.a.o();
        alVar = this.a.D;
        alVar.ag();
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
    }
}
