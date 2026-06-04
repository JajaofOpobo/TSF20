package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class l extends u {
    final /* synthetic */ k a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.j x;

    l(k kVar, com.tsf.shell.workspace3D.k.j jVar) {
        this.a = kVar;
        this.x = jVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        k kVar = this.a;
        com.tsf.shell.workspace3D.k.j jVar = this.x;
        m mVar = new m(kVar, jVar);
        mVar.a((r) new com.censivn.C3DEngine.g.k());
        mVar.d(0.0f);
        s.a(jVar, ThemeShellDescription.PICKER_MENU, mVar);
    }
}
