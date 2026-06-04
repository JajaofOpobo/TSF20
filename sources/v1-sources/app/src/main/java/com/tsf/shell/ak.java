package com.tsf.shell;

/* loaded from: classes.dex */
final class ak implements Runnable {
    final /* synthetic */ Home a;
    private final /* synthetic */ com.tsf.shell.workspace3D.h.a b;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.a c;

    ak(Home home, com.tsf.shell.workspace3D.h.a aVar, com.tsf.shell.workspace3D.k.a aVar2) {
        this.a = home;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(this.c);
        this.c.aJ();
        com.tsf.shell.workspace3D.g.ao.a(this.c);
    }
}
