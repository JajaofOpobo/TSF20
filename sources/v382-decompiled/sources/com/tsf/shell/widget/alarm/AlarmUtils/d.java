package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class d extends BroadcastReceiver {
    final /* synthetic */ AlarmAlertActivity a;

    d(AlarmAlertActivity alarmAlertActivity) {
        this.a = alarmAlertActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.b(context);
    }
}
