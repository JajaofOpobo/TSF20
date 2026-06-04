package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class am extends com.censivn.C3DEngine.b.v {
    final /* synthetic */ al a;

    am(al alVar) {
        this.a = alVar;
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.d.b
    public final boolean e(com.censivn.C3DEngine.b.r rVar) {
        boolean e = super.e(rVar);
        if (aB() == 0) {
            Q();
        }
        return e;
    }

    @Override // com.censivn.C3DEngine.b.v
    public final com.censivn.C3DEngine.b.r c(int i) {
        com.censivn.C3DEngine.b.r c = super.c(i);
        if (aB() == 0) {
            Q();
        }
        return c;
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.d.b
    public final void d(com.censivn.C3DEngine.b.r rVar) {
        com.censivn.C3DEngine.b.ab abVar;
        if (P() == null) {
            abVar = this.a.a;
            abVar.d(this);
        }
        rVar.Q();
        this.z.add(rVar);
        rVar.a((com.censivn.C3DEngine.d.b) this);
        rVar.a(R());
        com.censivn.C3DEngine.a.d().g();
    }

    @Override // com.censivn.C3DEngine.b.v
    public final void a(com.censivn.C3DEngine.b.r rVar, int i) {
        com.censivn.C3DEngine.b.ab abVar;
        if (P() == null) {
            abVar = this.a.a;
            abVar.d(this);
        }
        rVar.Q();
        this.z.add(i, rVar);
        rVar.a((com.censivn.C3DEngine.d.b) this);
        rVar.a(R());
        com.censivn.C3DEngine.a.d().g();
    }
}
