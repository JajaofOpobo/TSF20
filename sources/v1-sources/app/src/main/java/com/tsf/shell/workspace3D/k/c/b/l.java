package com.tsf.shell.workspace3D.k.c.b;

/* loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ Runnable b;

    l(c cVar, Runnable runnable) {
        this.a = cVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.a.a().c(new m(this, this.b));
    }
}
