package com.tsf.shell;

/* loaded from: classes.dex */
final class j implements Runnable {
    final /* synthetic */ i a;
    private final /* synthetic */ Runnable b;

    j(i iVar, Runnable runnable) {
        this.a = iVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.a.a().c(this.b);
    }
}
