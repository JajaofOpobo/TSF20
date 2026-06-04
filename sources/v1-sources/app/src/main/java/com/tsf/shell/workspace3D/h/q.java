package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class q implements Runnable {
    final /* synthetic */ l a;

    q(l lVar) {
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.k.aG() == -1) {
            com.censivn.C3DEngine.b.m.d().c().a(false);
        } else {
            com.censivn.C3DEngine.b.m.d().c().a(true);
        }
        l lVar = this.a;
        com.tsf.shell.h.r.a(true);
        com.tsf.shell.a.t.j(this.a.k.aG());
        this.a.r = 2;
    }
}
