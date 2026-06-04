package com.tsf.shell;

import android.content.Intent;

/* loaded from: classes.dex */
final class ai implements Runnable {
    final /* synthetic */ Home a;
    private final /* synthetic */ Intent b;

    ai(Home home, Intent intent) {
        this.a = home;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.a.a().c(new aj(this, this.b));
    }
}
