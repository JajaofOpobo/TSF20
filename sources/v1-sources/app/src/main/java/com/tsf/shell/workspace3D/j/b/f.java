package com.tsf.shell.workspace3D.j.b;

/* loaded from: classes.dex */
final class f implements Runnable {
    final /* synthetic */ d a;

    f(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = new g(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(gVar);
    }
}
