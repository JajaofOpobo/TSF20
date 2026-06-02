package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class InstallShortcutReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.android.launcher.action.INSTALL_SHORTCUT".equals(intent.getAction())) {
            Intent launchIntent = intent.getParcelableExtra(Intent.EXTRA_SHORTCUT_INTENT);
            String name = intent.getStringExtra(Intent.EXTRA_SHORTCUT_NAME);
            if (launchIntent != null && name != null) {
                com.tsf.shell.util.ShortcutHelper.createShortcut(context, name, launchIntent);
            }
        }
    }
}
