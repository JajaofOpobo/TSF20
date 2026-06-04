package com.tsf.shell.workspace3D.k.c.b;

/* loaded from: classes.dex */
final class n implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ Runnable b;

    n(c cVar, Runnable runnable) {
        this.a = cVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
