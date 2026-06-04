package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class y extends ce {
    final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(p pVar, float f, float f2) {
        super(f, f2);
        this.a = pVar;
    }

    @Override // com.tsf.shell.workspace3D.e.ce, com.tsf.shell.workspace3D.g.g
    public final boolean l() {
        boolean z;
        z = this.a.aL;
        return z && super.l();
    }

    @Override // com.tsf.shell.workspace3D.e.ce, com.tsf.shell.workspace3D.g.g
    public final void b(com.tsf.shell.workspace3D.g.g gVar) {
        boolean z;
        b bVar;
        bw bwVar;
        bw bwVar2;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        z = this.a.aG;
        if (!z) {
            vVar = this.a.E;
            if (vVar.L().x == 0.0f) {
                vVar2 = this.a.E;
                if (vVar2.L().y == 0.0f) {
                    com.tsf.shell.workspace3D.bf.s().D();
                    com.tsf.shell.workspace3D.bf.j().a((com.tsf.shell.workspace3D.k.j) gVar);
                    return;
                }
                return;
            }
            return;
        }
        bVar = this.a.ah;
        bVar.i();
        bwVar = this.a.ax;
        bwVar.a = gVar;
        com.censivn.C3DEngine.b.w a = com.censivn.C3DEngine.a.a();
        bwVar2 = this.a.ax;
        a.b(bwVar2, 500L);
    }

    @Override // com.tsf.shell.workspace3D.e.ce, com.tsf.shell.workspace3D.g.g
    public final boolean d(com.tsf.shell.workspace3D.g.g gVar) {
        bw bwVar;
        bw bwVar2;
        b bVar;
        com.censivn.C3DEngine.b.w a = com.censivn.C3DEngine.a.a();
        bwVar = this.a.ax;
        a.f(bwVar);
        bwVar2 = this.a.ax;
        bwVar2.a = null;
        bVar = this.a.ah;
        bVar.j();
        return false;
    }

    @Override // com.tsf.shell.workspace3D.e.ce, com.tsf.shell.workspace3D.g.g
    public final void c(com.tsf.shell.workspace3D.g.g gVar) {
        bw bwVar;
        bw bwVar2;
        b bVar;
        com.censivn.C3DEngine.b.w a = com.censivn.C3DEngine.a.a();
        bwVar = this.a.ax;
        a.f(bwVar);
        bwVar2 = this.a.ax;
        bwVar2.a = null;
        bVar = this.a.ah;
        bVar.j();
    }
}
