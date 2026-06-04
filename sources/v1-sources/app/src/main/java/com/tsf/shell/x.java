package com.tsf.shell;

/* loaded from: classes.dex */
final class x implements Runnable {
    final /* synthetic */ Home a;
    private final /* synthetic */ com.tsf.shell.h.k b;

    x(Home home, com.tsf.shell.h.k kVar) {
        this.a = home;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.g.d.w wVar;
        com.tsf.shell.workspace3D.g.d.w wVar2;
        com.tsf.shell.workspace3D.g.d.w wVar3;
        wVar = this.a.E;
        if (wVar == null) {
            this.a.E = new y(this);
        }
        if (this.b == null) {
            wVar3 = this.a.E;
            wVar3.a(0.0f, 0.0f);
        } else {
            float[] b = com.censivn.C3DEngine.h.a.b(this.b.b, this.b.c);
            wVar2 = this.a.E;
            wVar2.a(b[0], b[1]);
        }
    }
}
