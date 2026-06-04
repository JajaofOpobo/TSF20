package com.tsf.shell;

/* loaded from: classes.dex */
final class ar implements Runnable {
    private final /* synthetic */ int a;

    ar(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at atVar;
        at atVar2;
        at atVar3;
        atVar = aq.b;
        if (atVar != null) {
            if (this.a == 3) {
                atVar3 = aq.b;
                atVar3.a(4);
            } else {
                atVar2 = aq.b;
                atVar2.a(this.a);
            }
        }
    }
}
