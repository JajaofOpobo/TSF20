package com.tsf.shell.workspace3D.a;

/* loaded from: classes.dex */
final class f implements Runnable {
    final /* synthetic */ d a;
    private final /* synthetic */ com.tsf.shell.workspace3D.g.g b;

    f(d dVar, com.tsf.shell.workspace3D.g.g gVar) {
        this.a = dVar;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float[] fArr;
        float[] fArr2;
        com.tsf.shell.workspace3D.g.g gVar = this.b;
        fArr = this.a.t;
        int i = (int) fArr[0];
        fArr2 = this.a.t;
        com.tsf.shell.workspace3D.g.g a = gVar.a(i, (int) fArr2[1]);
        this.a.u = false;
        if (a != null) {
            this.b.e(a);
        } else {
            this.b.m();
        }
    }
}
