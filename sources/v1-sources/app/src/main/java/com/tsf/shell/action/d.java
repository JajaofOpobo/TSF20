package com.tsf.shell.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class d extends BroadcastReceiver {
    d() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.tsf.shell.SET_ACTION".equals(intent.getAction())) {
            c.a(intent.getIntExtra("gesture_action", 0), intent.getStringExtra("gesture_name"), intent.getStringExtra("gesture_url"));
        }
    }
}
