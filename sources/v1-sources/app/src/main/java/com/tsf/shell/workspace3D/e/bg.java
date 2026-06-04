package com.tsf.shell.workspace3D.e;

import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class bg implements Runnable {
    final /* synthetic */ bf a;
    private final /* synthetic */ float b;

    bg(bf bfVar, float f) {
        this.a = bfVar;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cg cgVar;
        float f = this.b / 3.0f;
        cgVar = this.a.a.W;
        com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), ThemeShellDescription.PICKER_MENU, new bh(this, cgVar.k(), f, this.b));
    }
}
