package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class am implements Runnable {
    final /* synthetic */ al a;

    am(al alVar) {
        this.a = alVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar;
        x xVar2;
        com.tsf.shell.workspace3D.h.a.a.m mVar;
        x xVar3;
        xVar = this.a.E;
        xVar2 = this.a.E;
        mVar = xVar2.ap;
        xVar.ai = mVar.c() != 1;
        xVar3 = this.a.E;
        xVar3.bK();
    }
}
