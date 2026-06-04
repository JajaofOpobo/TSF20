package com.tsf.shell.workspace3D.j.b;

/* loaded from: classes.dex */
final class i implements Runnable {
    final /* synthetic */ d a;

    i(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = new j(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(jVar);
    }
}
