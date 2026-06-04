package com.tsf.shell.workspace3D.k;

/* loaded from: classes.dex */
final class k implements Runnable {
    final /* synthetic */ j a;
    private final /* synthetic */ j b;

    k(j jVar, j jVar2) {
        this.a = jVar;
        this.b = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.N == null) {
            this.a.N = com.tsf.shell.workspace3D.g.f.a((int) ((-this.b.al()) + this.b.ao() + (com.censivn.C3DEngine.a.b * 10.0f)), (int) ((-this.b.am()) + this.b.ap() + (com.censivn.C3DEngine.a.b * 10.0f)));
            this.a.N.c((Boolean) false);
            this.a.N.z().c(com.tsf.shell.workspace3D.g.f.h);
            this.a.N.L().y = (this.b.am() + this.b.ap()) / 2.0f;
            this.b.d(this.a.N);
        }
    }
}
