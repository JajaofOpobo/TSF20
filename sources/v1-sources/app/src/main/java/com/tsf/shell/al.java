package com.tsf.shell;

import android.widget.Toast;

/* loaded from: classes.dex */
final class al implements Runnable {
    final /* synthetic */ Home a;

    al(Home home) {
        this.a = home;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(Home.d(), R.string.activity_not_found, 0).show();
    }
}
