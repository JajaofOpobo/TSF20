package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class ao extends BroadcastReceiver {
    final /* synthetic */ Home a;

    private ao(Home home) {
        this.a = home;
    }

    /* synthetic */ ao(Home home, byte b) {
        this(home);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.l();
    }
}
