package com.tsf.shell;

/* loaded from: classes.dex */
final class s implements Runnable {
    final /* synthetic */ Home a;
    private final /* synthetic */ com.tsf.shell.h.k b;

    s(Home home, com.tsf.shell.h.k kVar) {
        this.a = home;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.h.m mVar;
        mVar = this.a.e;
        mVar.a(this.b);
    }
}
