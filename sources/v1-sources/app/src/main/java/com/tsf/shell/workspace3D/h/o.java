package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class o implements Runnable {
    final /* synthetic */ l a;

    o(l lVar) {
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.h.a.x xVar;
        if (this.a.x()) {
            try {
                if (this.a.p != this.a.k) {
                    if (this.a.k instanceof com.tsf.shell.workspace3D.h.a.x) {
                        ((com.tsf.shell.workspace3D.h.a.x) this.a.k).bE();
                    }
                    this.a.a(this.a.p, null, null);
                } else {
                    a aVar = this.a.k;
                    xVar = this.a.h;
                    if (aVar != xVar) {
                        r0.a(this.a.h, null, null);
                    }
                }
            } catch (Exception e) {
            }
        }
    }
}
