package com.tsf.shell.workspace3D.j.b;

/* loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ d a;

    l(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = new m(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(mVar);
    }
}
