package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class bs extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ float A;
    private final /* synthetic */ float B;
    final /* synthetic */ br a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;
    private final /* synthetic */ float z;

    bs(br brVar, float f, float f2, float f3, float f4, float f5) {
        this.a = brVar;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.B = f5;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        float f2;
        vVar = this.a.a.au;
        vVar.L().x = this.x + (((com.censivn.C3DEngine.a.e + (20.0f * com.censivn.C3DEngine.a.b)) - this.x) * f);
        vVar2 = this.a.a.au;
        PositionNumber3d L = vVar2.L();
        float f3 = this.y;
        f2 = this.a.a.y;
        L.y = f3 + ((f2 - this.y) * f);
        com.tsf.shell.workspace3D.bf.j().a(this.z + ((this.A - this.z) * f), ((this.B - 0.0f) * f) + 0.0f, this.A, this.B);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        float f;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        f = this.a.a.x;
        uVar.f(f);
        vVar = this.a.a.au;
        com.censivn.C3DEngine.g.s.a(vVar, ThemeShellDescription.PUBLIC_BUTTON_CLOSE, uVar);
        com.tsf.shell.workspace3D.bf.j().s();
        com.censivn.C3DEngine.a.a().b(new bt(this), 1000L);
    }
}
