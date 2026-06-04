package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class al extends l {
    final /* synthetic */ x E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(x xVar, int i, int i2) {
        super(i, i2);
        this.E = xVar;
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public final void i(boolean z) {
        k kVar;
        as asVar;
        l lVar;
        k kVar2;
        as asVar2;
        if (!z) {
            kVar = this.E.aB;
            kVar.n();
            asVar = this.E.aD;
            asVar.n();
            return;
        }
        x xVar = this.E;
        lVar = this.E.aC;
        xVar.aA = lVar;
        kVar2 = this.E.aB;
        kVar2.j();
        asVar2 = this.E.aD;
        asVar2.j();
    }

    @Override // com.tsf.shell.workspace3D.h.a.l, com.tsf.shell.workspace3D.h.a.n
    public final boolean e(int i) {
        com.tsf.shell.workspace3D.h.a.a.m mVar;
        boolean z;
        if (super.e(i)) {
            mVar = this.E.ap;
            mVar.a(i);
            z = this.E.ah;
            if (z) {
                x.t(this.E);
            } else {
                this.E.ax = new an(this);
            }
            return true;
        }
        return false;
    }

    @Override // com.tsf.shell.workspace3D.h.a.l
    public final void g(int i) {
        com.tsf.shell.workspace3D.h.a.a.m mVar;
        boolean z;
        Runnable runnable;
        boolean z2 = i != 1;
        mVar = this.E.ap;
        mVar.b(i);
        z = this.E.ah;
        if (z) {
            this.E.ai = z2;
            this.E.bK();
        } else {
            runnable = this.E.ax;
            if (runnable == null) {
                this.E.ax = new am(this);
            }
        }
    }
}
