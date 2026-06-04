package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ad {
    private static com.censivn.C3DEngine.e.a.a b;
    private static com.tsf.shell.workspace3D.k.ab c;
    public SystemFolderTheme a = ThemeManager.getInstance().getCurrentThemeDescription().widget.folder;

    protected static void a(c cVar) {
        if (com.tsf.shell.workspace3D.z.a()) {
            cVar.s = true;
            ao aoVar = c.d;
            aoVar.O.e(false);
            com.censivn.C3DEngine.g.s.a(aoVar.O);
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.a(0);
            com.censivn.C3DEngine.g.s.a(aoVar.O, 300, uVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.k().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
                if (rVar instanceof com.tsf.shell.workspace3D.k.ah) {
                    com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) rVar;
                    if (ahVar.cf() != null) {
                        arrayList.add(ahVar.cf());
                    }
                }
            }
            com.tsf.shell.workspace3D.g.a.c.a(cVar, cVar.g, arrayList, 80.0f * com.censivn.C3DEngine.a.b);
        }
    }

    protected final void a(c cVar, com.censivn.C3DEngine.b.r rVar, com.tsf.shell.workspace3D.k.ab abVar) {
        cVar.j().o();
        float p = cVar.j().p();
        if (b == null) {
            b = com.tsf.shell.workspace3D.k.b.ap.c();
        }
        Number3d.TEMPNUMBER3D3.reset();
        Number3d c2 = rVar.c(Number3d.TEMPNUMBER3D3);
        b.z().d();
        b.z().c(abVar.C);
        b.L().x = c2.x;
        b.L().y = c2.y;
        bf.m();
        b.Q();
        bf.m().a(b);
        if (c != null) {
            c.h(true);
            c = null;
        }
        ae aeVar = new ae(this, abVar);
        Number3d.TEMPNUMBER3D3.reset();
        Number3d c3 = abVar.c(Number3d.TEMPNUMBER3D3);
        aeVar.f(c3.x);
        aeVar.h(p + c3.y);
        aeVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.e());
        com.censivn.C3DEngine.g.s.a(b);
        com.censivn.C3DEngine.g.s.a(b, ThemeShellDescription.PAGE_PREVIEW_SELECT, aeVar);
        c = abVar;
    }
}
