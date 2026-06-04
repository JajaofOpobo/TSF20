package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class t extends ac {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(c cVar, c cVar2) {
        super(cVar, cVar2);
        this.a = cVar;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void br() {
        c cVar;
        c cVar2;
        c cVar3;
        com.tsf.shell.workspace3D.k.o oVar;
        LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) be();
        if (launcherFolder3DInfo.child != null) {
            String[] split = launcherFolder3DInfo.child.split(",");
            ArrayList itemInfo = launcherFolder3DInfo.getItemInfo();
            for (String str : split) {
                c cVar4 = this.a;
                LauncherShortcut3DInfo a = c.a(itemInfo, str);
                if (a != null) {
                    com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) a.getTarget();
                    abVar.j(0.0f);
                    abVar.e(false);
                    this.a.h.d(abVar);
                    cVar3 = this.a.z;
                    abVar.a((com.censivn.C3DEngine.b.l) new a(abVar, cVar3));
                    oVar = this.a.M;
                    abVar.a(oVar);
                }
            }
            itemInfo.clear();
        }
        this.a.b(true);
        c.f(this.a);
        this.a.G();
        af afVar = c.e;
        cVar = this.a.z;
        afVar.a(cVar);
        af afVar2 = c.e;
        cVar2 = this.a.z;
        af.c(cVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.workspace3D.k.j, com.tsf.shell.workspace3D.g.g
    public final void b(com.tsf.shell.workspace3D.g.g gVar) {
        ag agVar;
        super.b(gVar);
        if (gVar instanceof com.tsf.shell.workspace3D.k.ab) {
            agVar = this.a.y;
            agVar.a((com.censivn.C3DEngine.b.r) gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.workspace3D.k.j, com.tsf.shell.workspace3D.g.g
    public final void c(com.tsf.shell.workspace3D.g.g gVar) {
        ag agVar;
        super.c(gVar);
        if (gVar instanceof com.tsf.shell.workspace3D.k.ab) {
            agVar = this.a.y;
            agVar.b((com.censivn.C3DEngine.b.r) gVar);
        }
    }

    @Override // com.tsf.shell.workspace3D.k.j, com.tsf.shell.workspace3D.g.g
    public final void a(com.tsf.shell.workspace3D.g.g gVar) {
        super.a(gVar);
    }

    @Override // com.tsf.shell.workspace3D.k.j, com.tsf.shell.workspace3D.g.g
    public final boolean a(com.tsf.shell.workspace3D.g.g gVar, float f, float f2) {
        return (gVar instanceof com.tsf.shell.workspace3D.k.z) && ((com.tsf.shell.workspace3D.k.z) gVar).bD();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.workspace3D.k.j, com.tsf.shell.workspace3D.g.g
    public final boolean d(com.tsf.shell.workspace3D.g.g gVar) {
        ag agVar;
        int i;
        super.a(gVar);
        if (!(gVar instanceof com.tsf.shell.workspace3D.k.ab)) {
            return false;
        }
        agVar = this.a.y;
        agVar.b((com.censivn.C3DEngine.b.r) gVar);
        com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) gVar;
        ArrayList arrayList = null;
        ArrayList arrayList2 = new ArrayList();
        if (abVar.bz()) {
            arrayList = abVar.bH();
            i = arrayList.size();
        } else {
            i = 0;
        }
        c.i(this.a);
        this.a.g.e(false);
        d(abVar.L());
        abVar.Q();
        d((com.censivn.C3DEngine.b.r) abVar);
        if (i > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
                jVar.e(false);
                u uVar = new u(this, (com.tsf.shell.workspace3D.k.ab) jVar);
                uVar.f(0.0f);
                uVar.h(0.0f);
                com.censivn.C3DEngine.g.s.a(jVar, 450, uVar);
                arrayList2.add(jVar);
            }
            abVar.bE();
        }
        abVar.e(false);
        LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) this.a.g.be();
        this.a.a(abVar, launcherFolder3DInfo);
        v vVar = new v(this, abVar, arrayList2, launcherFolder3DInfo);
        vVar.f(0.0f);
        vVar.h(60.0f);
        vVar.j(1.0f);
        vVar.k(1.0f);
        vVar.e(0.0f);
        com.censivn.C3DEngine.g.s.a(abVar);
        com.censivn.C3DEngine.g.s.a(abVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, vVar);
        return true;
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.tsf.shell.workspace3D.k.j
    public final void n() {
        c cVar;
        cVar = this.a.z;
        c.k(cVar);
        super.n();
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.tsf.shell.workspace3D.k.j
    public final void e_() {
    }
}
