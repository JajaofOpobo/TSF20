package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class bp implements Runnable {
    final /* synthetic */ bo a;

    bp(bo boVar) {
        this.a = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.L();
        this.a.a.k();
        com.censivn.C3DEngine.a.a().b(new bq(this), 300L);
    }
}
