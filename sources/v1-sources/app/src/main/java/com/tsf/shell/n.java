package com.tsf.shell;

/* loaded from: classes.dex */
final class n implements Runnable {
    final /* synthetic */ m a;

    n(m mVar) {
        this.a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.h.m mVar;
        o oVar = new o(this);
        mVar = this.a.a.e;
        mVar.post(oVar);
    }
}
