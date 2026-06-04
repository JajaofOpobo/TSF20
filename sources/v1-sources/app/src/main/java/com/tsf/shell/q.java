package com.tsf.shell;

import android.view.KeyEvent;

/* loaded from: classes.dex */
final class q implements Runnable {
    final /* synthetic */ Home a;
    private final /* synthetic */ int b;
    private final /* synthetic */ KeyEvent c;

    q(Home home, int i, KeyEvent keyEvent) {
        this.a = home;
        this.b = i;
        this.c = keyEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        KeyEvent keyEvent = this.c;
        aq.a(i);
    }
}
