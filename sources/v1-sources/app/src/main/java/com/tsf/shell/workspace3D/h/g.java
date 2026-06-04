package com.tsf.shell.workspace3D.h;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.theme.inside.ThemeDockDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends a implements com.tsf.shell.workspace3D.g.a.a {
    private com.tsf.shell.workspace3D.g.b.b I;
    private com.tsf.shell.workspace3D.e.a.g J;

    public g() {
        h hVar = new h(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(hVar);
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void bd() {
        super.bd();
        k().b();
        Iterator it = this.B.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                ((com.tsf.shell.workspace3D.k.j) rVar).p();
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void be() {
        super.be();
        Iterator it = this.B.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                ((com.tsf.shell.workspace3D.k.j) rVar).q();
            }
        }
    }

    public final void bn() {
        this.I = new com.tsf.shell.workspace3D.g.b.b(this, false, false);
        int i = com.censivn.C3DEngine.a.j > com.censivn.C3DEngine.a.k ? com.censivn.C3DEngine.a.k : com.censivn.C3DEngine.a.j;
        int i2 = (int) (i * 0.9d);
        int i3 = (i - i2) / 2;
        int i4 = i2 / 2;
        this.I.a(i4, i4);
        this.I.L().y = i3 + i4 + com.censivn.C3DEngine.a.o;
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.h(0.0f);
        com.censivn.C3DEngine.g.s.a(this.I);
        com.censivn.C3DEngine.g.s.a(this.I, 386, uVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.B.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.ah) {
                com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) rVar;
                if (ahVar.cf() != null) {
                    arrayList.add(ahVar.cf());
                }
            }
        }
        com.tsf.shell.workspace3D.g.a.c.a(this, com.tsf.shell.workspace3D.bf.m().f(), arrayList, 170.0f * com.censivn.C3DEngine.a.b);
    }

    @Override // com.tsf.shell.workspace3D.g.a.a
    public final void d() {
        if (com.censivn.C3DEngine.b.m.d().e() != this.I.i()) {
            this.I.k();
        }
    }

    @Override // com.tsf.shell.workspace3D.g.a.a
    public final void b() {
    }

    @Override // com.tsf.shell.workspace3D.g.a.a
    public final void a(com.censivn.C3DEngine.b.r rVar, com.tsf.shell.workspace3D.k.ah ahVar) {
        com.tsf.shell.workspace3D.k.ah cg = ahVar.cg();
        cg.Q();
        cg.L().setAllFrom(this.I.d(rVar.c(new Number3d())));
        this.I.a((com.tsf.shell.workspace3D.k.j) cg);
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void bl() {
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_RESET_BUTTON_OFF, ThemeDockDescription.DOCK_MENU_RESET_BUTTON_ON}, 5));
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_EDIT_BUTTON_OFF, ThemeDockDescription.DOCK_MENU_EDIT_BUTTON_ON}, 6));
        com.tsf.shell.workspace3D.e.a.g gVar = new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_HOMEPAGE_BUTTON_OFF, ThemeDockDescription.DOCK_MENU_HOMEPAGE_BUTTON_ON}, 4);
        this.J = gVar;
        this.G.add(gVar);
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_MULIT_CHOICE_BUTTON_OFF, ThemeDockDescription.DOCK_MENU_MULIT_CHOICE_BUTTON_ON}, 7));
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_ADD_BUTTON_OFF, 511}, 2));
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{509, ThemeDockDescription.DOCK_MENU_LASSO_BUTTON_ON}, 1));
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_SETTING_BUTTON_OFF, ThemeDockDescription.DOCK_MENU_SETTING_BUTTON_ON}, 0));
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void bm() {
        this.J.c = com.tsf.shell.workspace3D.bf.j().h() == this ? 1 : 0;
    }
}
