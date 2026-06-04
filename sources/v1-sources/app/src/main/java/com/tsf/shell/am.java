package com.tsf.shell;

import android.widget.Toast;

/* loaded from: classes.dex */
final class am implements Runnable {
    final /* synthetic */ Home a;

    am(Home home) {
        this.a = home;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(Home.d(), R.string.activity_not_found, 0).show();
    }
}
