package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class ak extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ab a;

    ak(ab abVar) {
        this.a = abVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.b.v vVar;
        vVar = this.a.M;
        vVar.N().setAll(1.0f - f, 1.0f - f, 1.0f);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.b.v vVar;
        bVar = this.a.G;
        bVar.Q();
        vVar = this.a.M;
        vVar.Q();
    }
}
