package com.tsf.shell.workspace3D;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class au extends com.censivn.C3DEngine.e.c implements com.tsf.shell.workspace3D.g.g {
    private com.tsf.shell.workspace3D.g.b.k A;
    private av a;

    public au(av avVar) {
        this.a = avVar;
        this.A = avVar.j();
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final int i() {
        return 1;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final void a(com.tsf.shell.workspace3D.g.g gVar) {
        if (gVar instanceof com.tsf.shell.workspace3D.k.ab) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) gVar;
            this.a.e(this.A.a(jVar.L().x, jVar.L().y));
        }
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final com.tsf.shell.workspace3D.g.g j() {
        return null;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final boolean a(com.tsf.shell.workspace3D.g.g gVar, float f, float f2) {
        return (gVar instanceof com.tsf.shell.workspace3D.k.z) && ((com.tsf.shell.workspace3D.k.z) gVar).bD();
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final void b(com.tsf.shell.workspace3D.g.g gVar) {
        if (gVar instanceof com.tsf.shell.workspace3D.k.ab) {
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) gVar;
            abVar.a((short) 230, (short) 255, (short) 154, (short) 0);
            this.A.m();
            int a = this.A.a(abVar.L().x, abVar.L().y);
            this.a.d(a != -1 ? a : 0);
        }
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final void c(com.tsf.shell.workspace3D.g.g gVar) {
        if (gVar instanceof com.tsf.shell.workspace3D.k.ab) {
            this.a.l();
            ((com.tsf.shell.workspace3D.k.j) gVar).a((short) 255, (short) 255, (short) 255, (short) 255);
        }
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final boolean d(com.tsf.shell.workspace3D.g.g gVar) {
        ArrayList arrayList;
        int i;
        if (!(gVar instanceof com.tsf.shell.workspace3D.k.ab)) {
            return false;
        }
        int l = this.a.l();
        ((com.tsf.shell.workspace3D.k.j) gVar).a((short) 255, (short) 255, (short) 255, (short) 255);
        if (!(gVar instanceof com.tsf.shell.workspace3D.k.ab)) {
            return false;
        }
        com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) gVar;
        ArrayList arrayList2 = new ArrayList();
        if (!abVar.bz()) {
            arrayList = null;
            i = 0;
        } else {
            arrayList = abVar.bH();
            i = arrayList.size();
        }
        arrayList2.add(abVar);
        if (i > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
                jVar.e(false);
                arrayList2.add(jVar);
            }
            abVar.bF();
        }
        abVar.Q();
        this.a.a(arrayList2, l);
        arrayList2.clear();
        return true;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final boolean k() {
        return false;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final boolean l() {
        return true;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final com.tsf.shell.workspace3D.g.g a(int i, int i2) {
        return null;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final void e(com.tsf.shell.workspace3D.g.g gVar) {
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final boolean f(com.tsf.shell.workspace3D.g.g gVar) {
        return false;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final void m() {
    }
}
