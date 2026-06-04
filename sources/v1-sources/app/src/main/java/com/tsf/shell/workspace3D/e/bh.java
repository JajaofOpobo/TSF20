package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class bh extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ bg a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;
    private final /* synthetic */ float z;

    bh(bg bgVar, float f, float f2, float f3) {
        this.a = bgVar;
        this.x = f;
        this.y = f2;
        this.z = f3;
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
        bfVar = this.a.a;
        eVar = bfVar.a.af;
        if (eVar.g(f6) > 0.5f) {
            bfVar2 = this.a.a;
            bfVar2.a.X = f6;
            bfVar3 = this.a.a;
            vVar = bfVar3.a.au;
            PositionNumber3d L = vVar.L();
            bfVar4 = this.a.a;
            f2 = bfVar4.a.y;
            bfVar5 = this.a.a;
            f3 = bfVar5.a.X;
            L.y = f2 + f3;
            bfVar6 = this.a.a;
            p pVar = bfVar6.a;
            bfVar7 = this.a.a;
            f4 = bfVar7.a.X;
            pVar.a(f4, true);
            bfVar8 = this.a.a;
            eVar2 = bfVar8.a.af;
            bfVar9 = this.a.a;
            f5 = bfVar9.a.X;
            eVar2.i(f5);
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        bf bfVar;
        cg cgVar;
        float f = this.z;
        bfVar = this.a.a;
        cgVar = bfVar.a.W;
        com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), ThemeShellDescription.PAGE_PREVIEW_SELECT, new bi(this, cgVar.k(), f));
    }
}
