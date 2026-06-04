package com.tsf.shell.workspace3D.k;

/* loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ j a;

    l(j jVar) {
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.N != null) {
            this.a.N.z().b();
            this.a.N.Q();
            this.a.N.H();
            this.a.N = null;
        }
    }
}
