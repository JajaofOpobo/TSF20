package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class aa implements Runnable {
    final /* synthetic */ z a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.j b;

    aa(z zVar, com.tsf.shell.workspace3D.k.j jVar) {
        this.a = zVar;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.a.d dVar = (com.tsf.shell.workspace3D.a.d) this.b.aw();
        Integer valueOf = Integer.valueOf((int) dVar.a);
        Integer valueOf2 = Integer.valueOf((int) dVar.c);
        this.b.K();
        dVar.a(valueOf, valueOf2);
    }
}
