package com.flurry.android;

/* loaded from: classes.dex */
final class bj implements Runnable {
    private /* synthetic */ an a;

    bj(an anVar) {
        this.a = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        if (an.a(this.a)) {
            an anVar = this.a;
            runnable = this.a.h;
            anVar.post(runnable);
        }
    }
}
