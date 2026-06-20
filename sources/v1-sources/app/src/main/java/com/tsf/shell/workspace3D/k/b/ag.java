package com.tsf.shell.workspace3D.k.b;

/* loaded from: classes.dex */
final class ag extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ab a;

    ag(ab abVar) {
        this.a = abVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.c.b.SpringPhysicsSystem bVar;
        com.censivn.C3DEngine.c.a aVar;
        bVar = this.a.d;
        bVar.c = (float) (f * 0.5d);
        aVar = this.a.e;
        aVar.a();
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), 300, new ah(this.a));
    }
}
