package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class ad extends cg {
    final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(p pVar, int i, int i2, ch chVar) {
        super(i, i2, chVar);
        this.a = pVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void b(float f) {
        super.a(f);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final com.censivn.C3DEngine.b.r b(float f, float f2, boolean z) {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        bVar = this.a.aa;
        if (!bVar.b(f, f2)) {
            return super.b(f, f2, true);
        }
        bVar2 = this.a.aa;
        return bVar2;
    }
}
