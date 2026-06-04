package com.tsf.shell.workspace3D.k;

/* loaded from: classes.dex */
final class c implements Runnable {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.h.l lVar = (com.tsf.shell.h.l) this.a.C.getLayoutParams();
        this.a.C.a(lVar.d, lVar.e);
        this.a.C.requestLayout();
        this.a.C.invalidate();
    }
}
