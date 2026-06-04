package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class ao extends k {
    final /* synthetic */ x E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(x xVar, x xVar2) {
        super(xVar2);
        this.E = xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r1 != false) goto L15;
     */
    @Override // com.tsf.shell.workspace3D.h.a.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        k kVar;
        k kVar2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        kVar = this.E.aB;
        if (((n) kVar).C) {
            z3 = this.E.aG;
            if (!z3) {
                z4 = this.E.aH;
                if (!z4) {
                    return true;
                }
            }
        }
        kVar2 = this.E.aB;
        if (!((n) kVar2).C) {
            z = this.E.aG;
            if (!z) {
                z2 = this.E.aH;
            }
            this.E.br();
            return true;
        }
        return false;
    }

    @Override // com.tsf.shell.workspace3D.h.a.k, com.tsf.shell.workspace3D.h.a.n
    public final boolean e(int i) {
        boolean z;
        z = this.E.ah;
        if (z) {
            return super.e(i);
        }
        return false;
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public final void i(boolean z) {
        l lVar;
        as asVar;
        k kVar;
        l lVar2;
        as asVar2;
        if (!z) {
            this.E.aA = null;
            lVar = this.E.aC;
            lVar.n();
            asVar = this.E.aD;
            asVar.n();
            return;
        }
        x xVar = this.E;
        kVar = this.E.aB;
        xVar.aA = kVar;
        lVar2 = this.E.aC;
        lVar2.j();
        asVar2 = this.E.aD;
        asVar2.j();
    }
}
