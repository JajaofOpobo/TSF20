package com.tsf.shell.workspace3D.j.b;

/* loaded from: classes.dex */
final class w implements Runnable {
    final /* synthetic */ d a;

    w(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = new x(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(xVar);
    }
}
