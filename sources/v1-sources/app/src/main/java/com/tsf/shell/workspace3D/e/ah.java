package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class ah implements Runnable {
    final /* synthetic */ p a;

    ah(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        by byVar;
        by byVar2;
        com.censivn.C3DEngine.b.v vVar;
        byVar = this.a.I;
        byVar.h(0.0f);
        byVar2 = this.a.H;
        byVar2.h(0.0f);
        vVar = this.a.G;
        vVar.Q();
    }
}
