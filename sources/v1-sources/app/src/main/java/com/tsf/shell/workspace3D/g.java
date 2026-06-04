package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ d a;

    g(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Runnable runnable;
        int i2;
        int i3;
        Runnable runnable2;
        int i4;
        i = this.a.i;
        if (i > 0) {
            d dVar = this.a;
            i2 = dVar.i;
            dVar.i = i2 - 1;
            d dVar2 = this.a;
            i3 = this.a.i;
            d.c(dVar2, i3);
            com.censivn.C3DEngine.b.w a = com.censivn.C3DEngine.a.a();
            runnable2 = this.a.e;
            i4 = this.a.h;
            a.b(runnable2, i4);
            return;
        }
        d dVar3 = this.a;
        runnable = this.a.f;
        dVar3.a(runnable);
    }
}
