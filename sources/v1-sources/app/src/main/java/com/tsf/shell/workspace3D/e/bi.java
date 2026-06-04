package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class bi extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ bh a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;

    bi(bh bhVar, float f, float f2) {
        this.a = bhVar;
        this.x = f;
        this.y = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        bf bfVar;
        e eVar;
        bf bfVar2;
        bf bfVar3;
        com.censivn.C3DEngine.b.v vVar;
        bf bfVar4;
        float f2;
        bf bfVar5;
        float f3;
        bf bfVar6;
        bf bfVar7;
        float f4;
        bf bfVar8;
        e eVar2;
        bf bfVar9;
        float f5;
        float f6 = this.x + ((this.y - this.x) * f);
        bfVar = this.a.a.a;
        eVar = bfVar.a.af;
        if (eVar.g(f6) > 0.5f) {
            bfVar2 = this.a.a.a;
            bfVar2.a.X = f6;
            bfVar3 = this.a.a.a;
            vVar = bfVar3.a.au;
            PositionNumber3d L = vVar.L();
            bfVar4 = this.a.a.a;
            f2 = bfVar4.a.y;
            bfVar5 = this.a.a.a;
            f3 = bfVar5.a.X;
            L.y = f2 + f3;
            bfVar6 = this.a.a.a;
            p pVar = bfVar6.a;
            bfVar7 = this.a.a.a;
            f4 = bfVar7.a.X;
            pVar.a(f4, true);
            bfVar8 = this.a.a.a;
            eVar2 = bfVar8.a.af;
            bfVar9 = this.a.a.a;
            f5 = bfVar9.a.X;
            eVar2.i(f5);
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        bf bfVar;
        float f;
        bf bfVar2;
        float f2;
        bf bfVar3;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        bfVar = this.a.a.a;
        f = bfVar.a.x;
        uVar.f(f);
        bfVar2 = this.a.a.a;
        f2 = bfVar2.a.y;
        uVar.h(f2);
        uVar.e(200.0f);
        bfVar3 = this.a.a.a;
        vVar = bfVar3.a.au;
        com.censivn.C3DEngine.g.s.a(vVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        com.censivn.C3DEngine.a.a().b(new bj(this), 1500L);
        com.censivn.C3DEngine.a.a().b(new bk(this), 1000L);
    }
}
