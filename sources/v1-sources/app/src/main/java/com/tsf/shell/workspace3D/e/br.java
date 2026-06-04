package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class br extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ float A;
    private final /* synthetic */ float B;
    final /* synthetic */ p a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;
    private final /* synthetic */ float z;

    br(p pVar, float f, float f2, float f3, float f4, float f5) {
        this.a = pVar;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.B = f5;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.b.v vVar;
        float f2;
        float f3;
        com.censivn.C3DEngine.b.v vVar2;
        float f4;
        float f5;
        vVar = this.a.au;
        PositionNumber3d L = vVar.L();
        f2 = this.a.x;
        float f6 = this.x;
        f3 = this.a.x;
        L.x = f2 + ((f6 - f3) * f);
        vVar2 = this.a.au;
        PositionNumber3d L2 = vVar2.L();
        f4 = this.a.y;
        float f7 = this.y;
        f5 = this.a.y;
        L2.y = f4 + ((f7 - f5) * f);
        com.tsf.shell.workspace3D.bf.j().a(this.z + ((this.A - this.z) * f), this.B + ((0.0f - this.B) * f), this.z, this.B);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.g.b.b bVar = new com.censivn.C3DEngine.g.b.b();
        vVar = this.a.au;
        float f = vVar.L().x;
        vVar2 = this.a.au;
        com.censivn.C3DEngine.g.s.a(bVar, ThemeShellDescription.UNREAD_COUNT_BG, new bs(this, f, vVar2.L().y, this.A, this.z, this.B));
    }
}
