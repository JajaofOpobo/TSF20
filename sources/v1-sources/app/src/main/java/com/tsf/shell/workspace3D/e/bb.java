package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class bb extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ba a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;

    bb(ba baVar, float f, float f2) {
        this.a = baVar;
        this.x = f;
        this.y = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        float f2;
        float f3;
        com.censivn.C3DEngine.b.v vVar3;
        float f4;
        float f5;
        vVar = this.a.a.au;
        vVar.M().z = 160.0f + (40.0f * f);
        p pVar = this.a.a;
        vVar2 = this.a.a.au;
        PositionNumber3d L = vVar2.L();
        f2 = this.a.a.ap;
        float f6 = this.x;
        f3 = this.a.a.ap;
        float f7 = f2 + ((f6 - f3) * f);
        L.x = f7;
        pVar.x = f7;
        p pVar2 = this.a.a;
        vVar3 = this.a.a.au;
        PositionNumber3d L2 = vVar3.L();
        f4 = this.a.a.aq;
        float f8 = this.y;
        f5 = this.a.a.aq;
        float f9 = f4 + ((f8 - f5) * f);
        L2.y = f9;
        pVar2.y = f9;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        float f;
        e eVar;
        com.censivn.C3DEngine.b.v vVar;
        this.a.a.t();
        com.censivn.C3DEngine.a.a().b(new bc(this), 2000L);
        com.censivn.C3DEngine.a.a().b(new bd(this), 1500L);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        f = this.a.a.y;
        eVar = this.a.a.af;
        uVar.h(f + eVar.aK());
        uVar.e(300.0f);
        vVar = this.a.a.au;
        com.censivn.C3DEngine.g.s.a(vVar, ThemeShellDescription.PICKER_MENU, uVar);
    }
}
