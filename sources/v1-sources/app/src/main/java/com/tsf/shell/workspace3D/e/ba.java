package com.tsf.shell.workspace3D.e;

import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class ba extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;

    ba(p pVar, float f, float f2) {
        this.a = pVar;
        this.x = f;
        this.y = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        float f;
        float f2;
        this.a.s();
        this.a.m();
        p pVar = this.a;
        f = this.a.x;
        pVar.ap = f;
        p pVar2 = this.a;
        f2 = this.a.y;
        pVar2.aq = f2;
        com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), ThemeShellDescription.PICKER_MENU, new bb(this, this.x, this.y));
    }
}
