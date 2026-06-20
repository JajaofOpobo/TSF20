package com.tsf.shell.manager.bind;

import android.content.Context;
import android.content.IntentFilter;
import com.tsf.shell.InstallShortcutReceiver;
import com.tsf.shell.ShellBroadcastReceiver;
import com.tsf.shell.manager.bind.ShellBindCallback;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShellBindContext {
    private static Context a;
    private static ShellBindCallback b;
    private static ShellModel c;
    private static com.tsf.shell.manager.app.AppListManager d;

    public static void a(Context context) {
        a = context.getApplicationContext();
    }

    public static ShellBindCallback a() {
        if (b == null) {
            b = new ShellBindCallback();
        }
        return b;
    }

    public static ShellModel b() {
        return c;
    }

    public static com.tsf.shell.manager.app.AppListManager c() {
        return d;
    }

    public ShellBindContext() {
        com.censivn.C3DEngine.C3DEngine.a(a, "AppState");
        com.censivn.C3DEngine.C3DEngine.a(new com.censivn.C3DEngine.b.c.TaskDispatcher());
        c = new ShellModel(a);
        d = c.b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.android.launcher.action.INSTALL_SHORTCUT");
        a.registerReceiver(InstallShortcutReceiver.a(), intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.tsf.shell.plugin.patch.homepress");
        intentFilter2.addAction("com.seal.plugin.services.toggle.start.service");
        intentFilter2.addAction("com.tsf.shell.theme.action.thirdparty.apply");
        a.registerReceiver(ShellBroadcastReceiver.a(), intentFilter2);
    }

    public void d() {
        a.unregisterReceiver(c);
        a.getContentResolver();
    }
}
