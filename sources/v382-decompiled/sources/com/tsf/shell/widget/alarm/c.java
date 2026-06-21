package com.tsf.shell.widget.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class c extends BroadcastReceiver {
    final /* synthetic */ AlarmWidget a;

    c(AlarmWidget alarmWidget) {
        this.a = alarmWidget;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!action.equals("com.tsf.shell.widget.alarm.SettingOnChange")) {
            if (!action.equals(AlarmWidget.y)) {
                if (action.equals(AlarmWidget.z)) {
                    this.a.m.b();
                    return;
                }
                return;
            }
            this.a.k();
            return;
        }
        AlarmWidget.n.b();
        u.c("Widget AUTOLocation:" + com.tsf.shell.widget.alarm.setting.j.a + "   LocationName:" + com.tsf.shell.widget.alarm.setting.j.c);
        this.a.h();
        this.a.j.c();
        this.a.i.a();
    }
}
