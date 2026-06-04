package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class s extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ r a;
    private final /* synthetic */ Runnable x;

    s(r rVar, Runnable runnable) {
        this.a = rVar;
        this.x = runnable;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        vVar = this.a.f;
        vVar.a((Boolean) false);
        if (this.x != null) {
            this.x.run();
        }
    }
}
