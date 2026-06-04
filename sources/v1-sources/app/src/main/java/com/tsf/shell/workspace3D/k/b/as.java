package com.tsf.shell.workspace3D.k.b;

/* loaded from: classes.dex */
final class as implements Runnable {
    private final /* synthetic */ com.tsf.shell.workspace3D.k.j a;
    private final /* synthetic */ int b;
    private final /* synthetic */ Runnable c;

    as(com.tsf.shell.workspace3D.k.j jVar, int i, Runnable runnable) {
        this.a = jVar;
        this.b = i;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a(this.a, this.b, this.c);
    }
}
