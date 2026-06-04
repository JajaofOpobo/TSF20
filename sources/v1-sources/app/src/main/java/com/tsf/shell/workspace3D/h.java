package com.tsf.shell.workspace3D;

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
        if (this.x != null) {
            this.x.run();
        }
    }
}
