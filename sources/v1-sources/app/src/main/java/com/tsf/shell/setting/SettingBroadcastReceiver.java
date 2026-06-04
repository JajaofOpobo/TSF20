package com.tsf.shell.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class SettingBroadcastReceiver extends BroadcastReceiver {
    public SettingBroadcastReceiver() {
        y.a();
        c.a();
        s.a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            y.a().c();
            return;
        }
        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            c.a().a(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE));
        } else if (action.equals("android.intent.action.AIRPLANE_MODE")) {
            a.a().c();
        } else if (action.equals(s.a)) {
            s.a().d();
        }
    }
}
