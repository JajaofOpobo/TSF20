package com.tsf.shell;

/* loaded from: classes.dex */
final class ad implements Runnable {
    final /* synthetic */ Home a;

    ad(Home home) {
        this.a = home;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        iVar = this.a.v;
        iVar.b("Home");
        com.tsf.shell.workspace3D.bf.q().g();
        com.tsf.shell.workspace3D.bf.q().h();
    }
}
