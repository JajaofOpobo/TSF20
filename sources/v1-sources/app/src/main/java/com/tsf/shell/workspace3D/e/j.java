package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class j implements Runnable {
    final /* synthetic */ e a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.z b;

    j(e eVar, com.tsf.shell.workspace3D.k.z zVar) {
        this.a = eVar;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e((com.censivn.C3DEngine.b.r) this.b);
    }
}
