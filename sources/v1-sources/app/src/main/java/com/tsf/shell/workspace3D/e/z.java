package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class z extends ce {
    final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(p pVar, float f, float f2) {
        super(f, f2);
        this.a = pVar;
    }

    @Override // com.tsf.shell.workspace3D.e.ce, com.tsf.shell.workspace3D.g.g
    public final boolean l() {
        boolean z;
        z = this.a.aO;
        return z;
    }

    @Override // com.tsf.shell.workspace3D.e.ce, com.tsf.shell.workspace3D.g.g
    public final void b(com.tsf.shell.workspace3D.g.g gVar) {
        b bVar;
        com.tsf.shell.g.h.b();
        ((com.tsf.shell.workspace3D.k.j) gVar).a((short) 180, (short) 255, (short) 50, (short) 0);
        this.a.H();
        bVar = this.a.ai;
        bVar.i();
    }

    @Override // com.tsf.shell.workspace3D.e.ce, com.tsf.shell.workspace3D.g.g
    public final void c(com.tsf.shell.workspace3D.g.g gVar) {
        b bVar;
        ((com.tsf.shell.workspace3D.k.j) gVar).K();
        this.a.I();
        bVar = this.a.ai;
        bVar.j();
    }

    @Override // com.tsf.shell.workspace3D.e.ce, com.tsf.shell.workspace3D.g.g
    public final boolean d(com.tsf.shell.workspace3D.g.g gVar) {
        b bVar;
        bVar = this.a.ai;
        bVar.j();
        com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) gVar;
        com.tsf.shell.workspace3D.bf.m().a(jVar);
        if (jVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
            com.tsf.shell.workspace3D.k.b.ap.a(jVar, 0, new aa(this, jVar), null);
            return true;
        }
        com.tsf.shell.workspace3D.k.b.ap.a(jVar, 0, null);
        return true;
    }
}
