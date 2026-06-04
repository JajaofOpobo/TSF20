package com.tsf.shell.workspace3D.k.c.b;

/* loaded from: classes.dex */
final class m implements Runnable {
    final /* synthetic */ l a;
    private final /* synthetic */ Runnable b;

    m(l lVar, Runnable runnable) {
        this.a = lVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.a(this.b);
    }
}
