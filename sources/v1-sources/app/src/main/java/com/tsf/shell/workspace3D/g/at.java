package com.tsf.shell.workspace3D.g;

/* loaded from: classes.dex */
final class at implements Runnable {
    final /* synthetic */ as a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.a b;

    at(as asVar, com.tsf.shell.workspace3D.k.a aVar) {
        this.a = asVar;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != null && this.b.C != null) {
            this.b.C.requestLayout();
        }
    }
}
