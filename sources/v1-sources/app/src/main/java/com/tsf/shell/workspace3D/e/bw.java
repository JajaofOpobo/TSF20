package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class bw implements Runnable {
    com.tsf.shell.workspace3D.g.g a;
    final /* synthetic */ p b;

    bw(p pVar) {
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        if (this.a != null) {
            com.tsf.shell.workspace3D.bf.s().D();
            com.tsf.shell.workspace3D.bf.j().a((com.tsf.shell.workspace3D.k.j) this.a);
            bVar = this.b.ah;
            bVar.j();
            this.a = null;
        }
    }
}
