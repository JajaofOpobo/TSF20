package com.tsf.shell;

/* loaded from: classes.dex */
final class z implements Runnable {
    final /* synthetic */ Home a;
    private final /* synthetic */ com.tsf.shell.workspace3D.h.a b;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.a c;

    z(Home home, com.tsf.shell.workspace3D.h.a aVar, com.tsf.shell.workspace3D.k.a aVar2) {
        this.a = home;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(this.c);
    }
}
