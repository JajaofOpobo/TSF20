package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class bd extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ba a;

    bd(ba baVar) {
        this.a = baVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.e.b bVar;
        float f2;
        float f3;
        bVar = this.a.c;
        f2 = this.a.C;
        f3 = this.a.C;
        bVar.b(f2 + ((120.0f - f3) * f));
    }
}
