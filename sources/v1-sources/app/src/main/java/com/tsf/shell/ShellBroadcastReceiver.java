package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ShellBroadcastReceiver extends BroadcastReceiver {
    private static ShellBroadcastReceiver a;

    public static ShellBroadcastReceiver a() {
        if (a == null) {
            a = new ShellBroadcastReceiver();
        }
        return a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.tsf.shell.plugin.patch.homepress".equals(intent.getAction()) && Home.d() != null) {
            Home.d().p();
        }
    }
}
