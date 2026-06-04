package com.tsf.shell;

/* loaded from: classes.dex */
final class ae implements Runnable {
    final /* synthetic */ Home a;

    ae(Home home) {
        this.a = home;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aq.a(3);
        this.a.F = false;
    }
}
