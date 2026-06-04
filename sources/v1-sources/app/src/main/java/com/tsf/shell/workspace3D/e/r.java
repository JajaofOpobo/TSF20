package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class r extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;
    private final /* synthetic */ float[] x;
    private final /* synthetic */ float y;

    r(p pVar, float[] fArr, float f) {
        this.a = pVar;
        this.x = fArr;
        this.y = f;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        float f2;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        e eVar;
        float sin = (float) Math.sin(3.141592653589793d * f);
        float f3 = this.x[0] + (this.y * sin);
        float f4 = this.x[1];
        f2 = this.a.y;
        float f5 = (sin * 50.0f * com.censivn.C3DEngine.a.b) + f2;
        vVar = this.a.au;
        vVar.L().x = f3 - com.censivn.C3DEngine.a.f;
        vVar2 = this.a.au;
        vVar2.L().y = f5;
        eVar = this.a.af;
        eVar.c(f3, f4);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.a.a().b(new s(this), 300L);
    }
}
