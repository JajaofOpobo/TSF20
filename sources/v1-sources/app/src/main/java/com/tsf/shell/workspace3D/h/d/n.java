package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class n extends u {
    final /* synthetic */ k a;
    private final /* synthetic */ com.censivn.C3DEngine.e.b x;
    private final /* synthetic */ Runnable y;

    n(k kVar, com.censivn.C3DEngine.e.b bVar, Runnable runnable) {
        this.a = kVar;
        this.x = bVar;
        this.y = runnable;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        k kVar = this.a;
        com.censivn.C3DEngine.e.b bVar = this.x;
        o oVar = new o(kVar, this.y);
        oVar.a((r) new com.censivn.C3DEngine.g.k());
        oVar.d(0.0f);
        s.a(bVar, ThemeShellDescription.PICKER_MENU, oVar);
    }
}
