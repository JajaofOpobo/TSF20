package com.tsf.shell.workspace3D.g.d;

import com.tsf.shell.bd;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class ag implements Runnable {
    final /* synthetic */ w a;

    ag(w wVar) {
        this.a = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar;
        d dVar2;
        com.censivn.C3DEngine.b.v vVar;
        Runnable runnable;
        Runnable runnable2;
        bf.a(true);
        dVar = this.a.e;
        dVar.o();
        dVar2 = this.a.f;
        dVar2.o();
        w.c(this.a);
        com.tsf.shell.aq.b(this.a);
        bd.b(this.a);
        bf.m();
        vVar = this.a.i;
        vVar.Q();
        this.a.a = false;
        this.a.b = false;
        runnable = this.a.h;
        if (runnable != null) {
            runnable2 = this.a.h;
            runnable2.run();
            this.a.h = null;
        }
        this.a.a();
    }
}
