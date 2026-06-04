package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ f a;
    private final /* synthetic */ com.censivn.C3DEngine.b.r b;
    private final /* synthetic */ int c;
    private final /* synthetic */ com.censivn.C3DEngine.b.r d;
    private final /* synthetic */ com.censivn.C3DEngine.g.u e;

    g(f fVar, com.censivn.C3DEngine.b.r rVar, int i, com.censivn.C3DEngine.b.r rVar2, com.censivn.C3DEngine.g.u uVar) {
        this.a = fVar;
        this.b = rVar;
        this.c = i;
        this.d = rVar2;
        this.e = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.a.a().c(new h(this, this.b, this.c, this.d, this.e));
    }
}
