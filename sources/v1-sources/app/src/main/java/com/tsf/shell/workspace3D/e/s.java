package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class s implements Runnable {
    final /* synthetic */ r a;

    s(r rVar) {
        this.a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        eVar = this.a.a.af;
        eVar.n();
        com.censivn.C3DEngine.a.a().b(new t(this), 500L);
    }
}
