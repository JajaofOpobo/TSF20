package com.tsf.shell.workspace3D.j.b;

/* loaded from: classes.dex */
final class t implements Runnable {
    final /* synthetic */ d a;

    t(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar = new u(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(uVar);
    }
}
