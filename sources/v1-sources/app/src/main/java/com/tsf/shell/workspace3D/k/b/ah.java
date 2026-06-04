package com.tsf.shell.workspace3D.k.b;

/* loaded from: classes.dex */
final class ah extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ab a;

    ah(ab abVar) {
        this.a = abVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.c.b.b bVar;
        com.censivn.C3DEngine.c.a aVar;
        bVar = this.a.d;
        bVar.c = (float) ((1.0f - f) * 0.5d);
        aVar = this.a.e;
        aVar.a();
    }
}
