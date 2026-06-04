package com.tsf.shell.workspace3D.g.e;

/* loaded from: classes.dex */
final class b implements Runnable {
    private final /* synthetic */ c a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;

    b(c cVar, int i, int i2) {
        this.a = cVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        a aVar2;
        aVar = a.a;
        if (aVar == null) {
            a.a = new a();
        }
        aVar2 = a.a;
        aVar2.b(this.a, this.b, this.c);
    }
}
