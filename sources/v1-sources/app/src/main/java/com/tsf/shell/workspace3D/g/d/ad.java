package com.tsf.shell.workspace3D.g.d;

/* loaded from: classes.dex */
final class ad implements Runnable {
    final /* synthetic */ ac a;
    private final /* synthetic */ com.tsf.shell.action.f b;

    ad(ac acVar, com.tsf.shell.action.f fVar) {
        this.a = acVar;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w.a(this.a.a.l, this.b);
    }
}
