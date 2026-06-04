package com.tsf.shell.workspace3D.g.d;

/* loaded from: classes.dex */
final class af extends d {
    final /* synthetic */ w F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(w wVar, w wVar2, i iVar) {
        super(wVar2, iVar);
        this.F = wVar;
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
