package com.tsf.shell.workspace3D.g.d;

/* loaded from: classes.dex */
final class ae extends d {
    final /* synthetic */ w F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(w wVar, w wVar2, i iVar) {
        super(wVar2, iVar);
        this.F = wVar;
    }

    @Override // com.tsf.shell.workspace3D.g.d.d
    public final void a(r rVar) {
        d dVar;
        d dVar2;
        d dVar3;
        if (!rVar.b.a.isEmpty()) {
            dVar2 = this.F.f;
            q qVar = rVar.b;
            dVar3 = this.F.e;
            dVar2.a(qVar, (com.censivn.C3DEngine.b.r) dVar3);
            return;
        }
        dVar = this.F.f;
        dVar.a((Runnable) null, false);
    }

    @Override // com.tsf.shell.workspace3D.g.d.d
    public final void b(r rVar) {
        if (rVar.h) {
            if (rVar.b.a.isEmpty()) {
                this.F.h = rVar;
                this.F.e();
                return;
            }
            return;
        }
        rVar.run();
        j();
        com.censivn.C3DEngine.a.d().g();
    }
}
