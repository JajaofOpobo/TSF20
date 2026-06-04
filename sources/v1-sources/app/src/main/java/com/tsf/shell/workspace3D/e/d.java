package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class d extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ b a;
    private final /* synthetic */ com.censivn.C3DEngine.e.b x;

    d(b bVar, com.censivn.C3DEngine.e.b bVar2) {
        this.a = bVar;
        this.x = bVar2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        boolean z;
        this.x.b(255.0f);
        this.x.N().setAll(0.0f, 0.0f, 1.0f);
        z = this.a.B;
        if (z) {
            this.a.a(this.x);
        } else {
            this.x.Q();
            this.x.z().d();
        }
    }
}
