package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ g a;
    private final /* synthetic */ com.censivn.C3DEngine.b.r b;
    private final /* synthetic */ int c;
    private final /* synthetic */ com.censivn.C3DEngine.b.r d;
    private final /* synthetic */ com.censivn.C3DEngine.g.u e;

    h(g gVar, com.censivn.C3DEngine.b.r rVar, int i, com.censivn.C3DEngine.b.r rVar2, com.censivn.C3DEngine.g.u uVar) {
        this.a = gVar;
        this.b = rVar;
        this.c = i;
        this.d = rVar2;
        this.e = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.N().setAll(1.0f, 1.0f, 1.0f);
        this.a.a.a.a(this.c, this.d);
        com.censivn.C3DEngine.g.s.a(this.d);
        this.d.N().setAll(0.0f, 0.0f, 1.0f);
        com.censivn.C3DEngine.g.s.a(this.d, 200, this.e);
    }
}
