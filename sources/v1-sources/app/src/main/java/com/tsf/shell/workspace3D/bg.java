package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class bg implements Runnable {
    final /* synthetic */ bf a;

    bg(bf bfVar) {
        this.a = bfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.h.q qVar;
        r rVar;
        qVar = this.a.c;
        qVar.onResume();
        com.censivn.C3DEngine.g.s.c();
        rVar = bf.e;
        rVar.b();
    }
}
