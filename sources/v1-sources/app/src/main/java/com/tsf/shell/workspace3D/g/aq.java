package com.tsf.shell.workspace3D.g;

/* loaded from: classes.dex */
final class aq implements Runnable {
    final /* synthetic */ ap a;
    private final /* synthetic */ float b;

    aq(ap apVar, float f) {
        this.a = apVar;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ar arVar;
        int i;
        arVar = this.a.e;
        i = this.a.d;
        arVar.a(i, this.b);
    }
}
