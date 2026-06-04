package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class ac implements Runnable {
    final /* synthetic */ x a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;

    ac(x xVar, int i, int i2) {
        this.a = xVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b, this.c);
        this.a.bC();
    }
}
