package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
public final class b extends com.censivn.C3DEngine.b.v {
    private com.censivn.C3DEngine.e.b A;
    private boolean B = false;
    private com.censivn.C3DEngine.e.b a;

    public b(com.censivn.C3DEngine.e.b bVar) {
        this.a = bVar;
        this.A = new c(this, bVar.n_(), bVar.o_(), bVar);
        this.A.N().setAll(0.0f, 0.0f, 1.0f);
    }

    public final void i() {
        this.B = true;
        this.A.Q();
        this.a.d(this.A);
        a(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.censivn.C3DEngine.e.b bVar) {
        d dVar = new d(this, bVar);
        dVar.j(5.0f);
        dVar.k(5.0f);
        dVar.a(0);
        com.censivn.C3DEngine.g.s.a(bVar, 750, dVar);
    }

    public final void j() {
        this.B = false;
    }
}
