package com.tsf.shell.workspace3D.k;

/* loaded from: classes.dex */
final class e implements Runnable {
    final /* synthetic */ a a;
    private final /* synthetic */ com.tsf.shell.workspace3D.h.a b;

    e(a aVar, com.tsf.shell.workspace3D.h.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tsf.shell.h.j) this.a.C.getParent()).b(this.a.C);
        this.b.q().a(this.a.C);
    }
}
