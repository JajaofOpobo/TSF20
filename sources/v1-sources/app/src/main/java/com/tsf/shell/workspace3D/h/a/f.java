package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class f extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ com.censivn.C3DEngine.g.u A;
    final /* synthetic */ e a;
    private final /* synthetic */ com.censivn.C3DEngine.b.r x;
    private final /* synthetic */ com.censivn.C3DEngine.b.r y;
    private final /* synthetic */ int z;

    f(e eVar, com.censivn.C3DEngine.b.r rVar, com.censivn.C3DEngine.b.r rVar2, int i, com.censivn.C3DEngine.g.u uVar) {
        this.a = eVar;
        this.x = rVar;
        this.y = rVar2;
        this.z = i;
        this.A = uVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        if (this.x.ay() != null) {
            this.x.ay().a().a((Runnable) new g(this, this.y, this.z, this.x, this.A));
        } else {
            this.y.N().setAll(1.0f, 1.0f, 1.0f);
            this.a.a(this.z, this.x);
            this.x.N().setAll(0.0f, 0.0f, 1.0f);
            com.censivn.C3DEngine.g.s.a(this.x, 200, this.A);
        }
    }
}
