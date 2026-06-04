package com.tsf.shell.workspace3D.k;

/* loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ a a;
    private final /* synthetic */ j b;

    h(a aVar, j jVar) {
        this.a = aVar;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.N == null) {
            this.a.N = com.tsf.shell.workspace3D.g.f.a((int) (this.a.A.n_() + (com.censivn.C3DEngine.a.b * 10.0f)), (int) (this.a.A.o_() + (com.censivn.C3DEngine.a.b * 10.0f)));
            this.a.N.c((Boolean) false);
            this.a.N.z().c(com.tsf.shell.workspace3D.g.f.h);
            this.a.N.L().y = (this.b.am() + this.b.ap()) / 2.0f;
            this.b.d(this.a.N);
        }
    }
}
