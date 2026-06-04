package com.tsf.shell.workspace3D.g;

/* loaded from: classes.dex */
final class aa extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ y a;
    private final /* synthetic */ int[][] x;

    aa(y yVar, int[][] iArr) {
        this.a = yVar;
        this.x = iArr;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.e.a.a aVar;
        com.censivn.C3DEngine.e.a.a aVar2;
        for (int i = 0; i < 5; i++) {
            aVar2 = y.f;
            com.censivn.C3DEngine.e.a.c a = aVar2.a(i);
            a.m.spX(this.x[i][0] * f);
            a.m.spY(this.x[i][1] * f);
            a.c();
        }
        aVar = y.f;
        aVar.b((int) (255.0f * f));
    }
}
