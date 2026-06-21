package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class c extends BroadcastReceiver {
    final /* synthetic */ AlarmAlertActivity a;

    c(AlarmAlertActivity alarmAlertActivity) {
        this.a = alarmAlertActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Alarm alarm;
        Alarm alarm2 = (Alarm) intent.getParcelableExtra("intent.extra.alarm");
        alarm = this.a.d;
        if (alarm.a != alarm2.a) {
            return;
        }
        this.a.a(true);
    }
}
