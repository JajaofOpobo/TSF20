package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class ao implements Runnable {
    final /* synthetic */ al a;
    private final /* synthetic */ Runnable b;

    ao(al alVar, Runnable runnable) {
        this.a = alVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
        al alVar = this.a;
    }
}
