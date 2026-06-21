package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class j extends BroadcastReceiver {
    final /* synthetic */ Home a;

    private j(Home home) {
        this.a = home;
    }

    /* synthetic */ j(Home home, j jVar) {
        this(home);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.n();
    }
}
