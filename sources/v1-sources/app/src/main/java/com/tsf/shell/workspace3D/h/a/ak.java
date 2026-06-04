package com.tsf.shell.workspace3D.h.a;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
final class ak extends com.censivn.C3DEngine.b.v {
    final /* synthetic */ x a;

    ak(x xVar) {
        this.a = xVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        e eVar;
        float f;
        int i;
        boolean z;
        e eVar2;
        e eVar3;
        e eVar4;
        boolean z2;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        float f2;
        com.censivn.C3DEngine.b.v vVar3;
        e eVar5;
        float f3;
        boolean z3;
        e eVar6;
        com.censivn.C3DEngine.b.v vVar4;
        e eVar7;
        e eVar8;
        e eVar9;
        boolean z4;
        com.censivn.C3DEngine.b.v vVar5;
        com.censivn.C3DEngine.b.v vVar6;
        float f4;
        com.censivn.C3DEngine.b.v vVar7;
        this.a.ae = null;
        eVar = this.a.ad;
        if (eVar != null) {
            f = this.a.ay;
            i = this.a.af;
            float f5 = f / i;
            z = this.a.ag;
            if (z) {
                eVar7 = this.a.ad;
                eVar8 = this.a.ad;
                float f6 = eVar8.a;
                eVar9 = this.a.ad;
                eVar7.h(((f5 - eVar9.a) * 0.5f) + f6);
                z4 = this.a.ai;
                if (z4) {
                    vVar5 = this.a.ab;
                    Number3d M = vVar5.M();
                    vVar6 = this.a.ab;
                    float f7 = vVar6.M().x;
                    f4 = this.a.az;
                    vVar7 = this.a.ab;
                    M.x = f7 + ((f4 - vVar7.M().x) * 0.3f);
                    return;
                }
                return;
            }
            if (f5 == 0.0f) {
                eVar5 = this.a.ad;
                if (Math.abs(eVar5.a - f5) < 0.002d) {
                    float f8 = M().x;
                    f3 = this.a.az;
                    if (Math.abs(f8 - f3) < 0.002d) {
                        z3 = this.a.ah;
                        if (!z3) {
                            eVar6 = this.a.ad;
                            eVar6.h(0.0f);
                            x.l(this.a);
                            vVar4 = this.a.ab;
                            vVar4.M().x = 0.0f;
                            return;
                        }
                        return;
                    }
                }
            }
            eVar2 = this.a.ad;
            eVar3 = this.a.ad;
            float f9 = eVar3.a;
            eVar4 = this.a.ad;
            eVar2.h(((f5 - eVar4.a) * 0.2f) + f9);
            z2 = this.a.ai;
            if (z2) {
                vVar = this.a.ab;
                Number3d M2 = vVar.M();
                vVar2 = this.a.ab;
                float f10 = vVar2.M().x;
                f2 = this.a.az;
                vVar3 = this.a.ab;
                M2.x = f10 + ((f2 - vVar3.M().x) * 0.3f);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        e eVar;
        e eVar2;
        com.censivn.C3DEngine.b.v vVar;
        eVar = this.a.ae;
        if (eVar != null) {
            eVar2 = this.a.ae;
            com.tsf.shell.workspace3D.h.a.a.l j = eVar2.j();
            vVar = this.a.ab;
            j.a(vVar);
        }
    }
}
