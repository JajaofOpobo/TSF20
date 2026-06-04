package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class InstallShortcutReceiver extends BroadcastReceiver {
    private final int[] a = new int[2];

    public static BroadcastReceiver a() {
        return new InstallShortcutReceiver();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.android.launcher.action.INSTALL_SHORTCUT".equals(intent.getAction())) {
            try {
                if (!com.tsf.shell.a.t.e()) {
                    Home.d().a(intent);
                }
            } catch (Exception e) {
            }
        }
    }
}
