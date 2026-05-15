package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tsf.shell.manager.l.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class InstallShortcutReceiver extends BroadcastReceiver {
    private final int[] a = new int[2];

    public static BroadcastReceiver a() {
        return new InstallShortcutReceiver();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.android.launcher.action.INSTALL_SHORTCUT".equals(intent.getAction())) {
            try {
                com.tsf.shell.manager.l.a aVar = com.tsf.shell.manager.a.x.a;
                com.tsf.shell.manager.l.a.a(intent, (a.C0130a) null);
            } catch (Exception e) {
            }
        }
    }
}
