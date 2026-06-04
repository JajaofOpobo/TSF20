package com.tsf.shell.h;

/* loaded from: classes.dex */
final class p implements Runnable {
    final /* synthetic */ m a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.a b;
    private final /* synthetic */ com.tsf.shell.workspace3D.h.a c;

    p(m mVar, com.tsf.shell.workspace3D.k.a aVar, com.tsf.shell.workspace3D.h.a aVar2) {
        this.a = mVar;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != null && this.b.C != null) {
            this.b.C.requestLayout();
            if (!this.c.bf()) {
                this.b.C.b();
            }
        }
    }
}
