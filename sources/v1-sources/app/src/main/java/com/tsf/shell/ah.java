package com.tsf.shell;

/* loaded from: classes.dex */
final class ah implements Runnable {
    final /* synthetic */ Home a;

    ah(Home home) {
        this.a = home;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.q = true;
        com.tsf.shell.workspace3D.bf.q().i();
        com.tsf.shell.workspace3D.u.a();
    }
}
