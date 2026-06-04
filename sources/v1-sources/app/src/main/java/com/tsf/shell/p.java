package com.tsf.shell;

import android.view.KeyEvent;

/* loaded from: classes.dex */
final class p implements Runnable {
    final /* synthetic */ Home a;
    private final /* synthetic */ int b;
    private final /* synthetic */ KeyEvent c;

    p(Home home, int i, KeyEvent keyEvent) {
        this.a = home;
        this.b = i;
        this.c = keyEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aq.a(this.b, this.c);
    }
}
