package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class aj implements Runnable {
    final /* synthetic */ p a;

    aj(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.g.u uVar;
        bVar = this.a.V;
        com.censivn.C3DEngine.g.s.a(bVar);
        bVar2 = this.a.V;
        uVar = this.a.T;
        com.censivn.C3DEngine.g.s.a(bVar2, 400, uVar);
    }
}
