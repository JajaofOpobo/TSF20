package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class bh implements Runnable {
    final /* synthetic */ bf a;

    bh(bf bfVar) {
        this.a = bfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar;
        com.tsf.shell.h.q qVar;
        com.censivn.C3DEngine.g.s.b();
        rVar = bf.e;
        rVar.c();
        qVar = this.a.c;
        qVar.onPause();
    }
}
