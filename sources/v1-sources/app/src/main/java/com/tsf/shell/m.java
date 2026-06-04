package com.tsf.shell;

/* loaded from: classes.dex */
final class m implements Runnable {
    final /* synthetic */ Home a;

    m(Home home) {
        this.a = home;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.a.q.a();
        n nVar = new n(this);
        com.tsf.shell.a.l.a(Home.b, nVar, nVar, false, false);
    }
}
