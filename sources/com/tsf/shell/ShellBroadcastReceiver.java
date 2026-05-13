package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tsf.shell.theme.inside.ThemeManager;
/* loaded from: classes.dex */
public class ShellBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static ShellBroadcastReceiver f7173a;

    /* renamed from: a */
    public static ShellBroadcastReceiver m6148a() {
        if (f7173a == null) {
            f7173a = new ShellBroadcastReceiver();
        }
        return f7173a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        String action = intent.getAction();
        if ("com.tsf.shell.plugin.patch.homepress".equals(action)) {
            if (Home.m6177b() != null) {
                Home.m6177b().m6160p();
            }
        } else if (!"com.seal.plugin.services.toggle.start.service".equals(action) && "com.tsf.shell.theme.action.thirdparty.apply".equals(action) && (stringExtra = intent.getStringExtra("pkgname")) != null) {
            ThemeManager.getInstance().setThemeFromAction(stringExtra);
        }
    }
}
