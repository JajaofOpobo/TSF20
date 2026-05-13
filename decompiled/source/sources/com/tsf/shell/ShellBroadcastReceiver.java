package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tsf.shell.theme.inside.ThemeManager;
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
        String stringExtra;
        String action = intent.getAction();
        if ("com.tsf.shell.plugin.patch.homepress".equals(action)) {
            if (Home.b() != null) {
                Home.b().p();
            }
        } else if (!"com.seal.plugin.services.toggle.start.service".equals(action) && "com.tsf.shell.theme.action.thirdparty.apply".equals(action) && (stringExtra = intent.getStringExtra("pkgname")) != null) {
            ThemeManager.getInstance().setThemeFromAction(stringExtra);
        }
    }
}
