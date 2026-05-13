package com.tsf.shell.manager.bind;

import android.content.Context;
import android.content.IntentFilter;
import com.tsf.shell.InstallShortcutReceiver;
import com.tsf.shell.ShellBroadcastReceiver;
/* loaded from: classes.dex */
public class a {
    private static Context a;
    private static a b;
    private static ShellModel c;
    private static com.tsf.shell.manager.a.a d;

    public static void a(Context context) {
        a = context.getApplicationContext();
    }

    public static a a() {
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public static ShellModel b() {
        return c;
    }

    public static com.tsf.shell.manager.a.a c() {
        return d;
    }

    public a() {
        com.censivn.C3DEngine.a.a(a, "AppState");
        com.censivn.C3DEngine.a.a(new com.censivn.C3DEngine.b.c.c());
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
