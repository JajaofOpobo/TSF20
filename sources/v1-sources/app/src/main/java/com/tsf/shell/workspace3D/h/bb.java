package com.tsf.shell.workspace3D.h;

import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class bb implements Runnable {
    final /* synthetic */ ba a;

    bb(ba baVar) {
        this.a = baVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.g.b.b bVar2;
        com.censivn.C3DEngine.g.b.b bVar3;
        com.censivn.C3DEngine.g.u uVar;
        ba baVar = this.a;
        bVar = this.a.c;
        baVar.C = bVar.I();
        bVar2 = this.a.B;
        com.censivn.C3DEngine.g.s.a(bVar2);
        bVar3 = this.a.B;
        uVar = this.a.A;
        com.censivn.C3DEngine.g.s.a(bVar3, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }
}
