package com.tsf.shell.workspace3D.g.d;

/* loaded from: classes.dex */
final class h extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ d a;
    private final /* synthetic */ Runnable x;

    h(d dVar, Runnable runnable) {
        this.a = dVar;
        this.x = runnable;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        w wVar;
        wVar = this.a.Z;
        wVar.b(this.a);
        d dVar = this.a;
        this.a.J = null;
        dVar.I = null;
        if (this.x != null) {
            this.x.run();
        }
    }
}
