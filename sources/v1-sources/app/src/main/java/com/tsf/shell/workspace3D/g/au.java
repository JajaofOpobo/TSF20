package com.tsf.shell.workspace3D.g;

/* loaded from: classes.dex */
final class au extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ int A;
    final /* synthetic */ ar a;
    private final /* synthetic */ int x;
    private final /* synthetic */ int y;
    private final /* synthetic */ int z;

    au(ar arVar, int i, int i2, int i3, int i4) {
        this.a = arVar;
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.A = i4;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        ar arVar;
        arVar = this.a.F;
        arVar.c(this.x + (this.y * (1.0f - f)), this.z + (this.A * (1.0f - f)));
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
    }
}
