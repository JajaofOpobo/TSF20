package com.tsf.shell.manager.bind;

import android.content.Context;
import android.content.IntentFilter;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p035c.C0919c;
import com.tsf.shell.InstallShortcutReceiver;
import com.tsf.shell.ShellBroadcastReceiver;
import com.tsf.shell.manager.p166a.C3360a;
/* renamed from: com.tsf.shell.manager.bind.a */
/* loaded from: classes.dex */
public class C3444a {

    /* renamed from: a */
    private static Context f11401a;

    /* renamed from: b */
    private static C3444a f11402b;

    /* renamed from: c */
    private static ShellModel f11403c;

    /* renamed from: d */
    private static C3360a f11404d;

    /* renamed from: a */
    public static void m2358a(Context context) {
        f11401a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3444a m2359a() {
        if (f11402b == null) {
            f11402b = new C3444a();
        }
        return f11402b;
    }

    /* renamed from: b */
    public static ShellModel m2357b() {
        return f11403c;
    }

    /* renamed from: c */
    public static C3360a m2356c() {
        return f11404d;
    }

    public C3444a() {
        C0853a.m10863a(f11401a, "AppState");
        C0853a.m10860a(new C0919c());
        f11403c = new ShellModel(f11401a);
        f11404d = f11403c.m2385b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.android.launcher.action.INSTALL_SHORTCUT");
        f11401a.registerReceiver(InstallShortcutReceiver.m6154a(), intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.tsf.shell.plugin.patch.homepress");
        intentFilter2.addAction("com.seal.plugin.services.toggle.start.service");
        intentFilter2.addAction("com.tsf.shell.theme.action.thirdparty.apply");
        f11401a.registerReceiver(ShellBroadcastReceiver.m6148a(), intentFilter2);
    }

    /* renamed from: d */
    public void m2355d() {
        f11401a.unregisterReceiver(f11403c);
        f11401a.getContentResolver();
    }
}
