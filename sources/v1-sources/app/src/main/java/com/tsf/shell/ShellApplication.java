package com.tsf.shell;

import android.app.Application;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Handler;
import com.tsf.shell.setting.SettingBroadcastReceiver;
import com.tsf.shell.workspace3D.ShellWallpaperManager;
import dalvik.system.VMRuntime;

/* loaded from: classes.dex */
public class ShellApplication extends Application {
    public static ShellModel a;
    private final ContentObserver b = new bk(this, new Handler());

    @Override // android.app.Application
    public void onCreate() {
        VMRuntime.getRuntime().setMinimumHeapSize(4194304L);
        super.onCreate();
        a = new ShellModel(this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        registerReceiver(a, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
        registerReceiver(a, intentFilter2);
        IntentFilter intentFilter3 = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        intentFilter3.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter3.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter3.addAction(com.tsf.shell.setting.s.a);
        registerReceiver(new SettingBroadcastReceiver(), intentFilter3);
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addAction("android.intent.action.WALLPAPER_CHANGED");
        registerReceiver(ShellWallpaperManager.a(), intentFilter4);
        IntentFilter intentFilter5 = new IntentFilter();
        intentFilter5.addAction("com.android.launcher.action.INSTALL_SHORTCUT");
        registerReceiver(InstallShortcutReceiver.a(), intentFilter5);
        IntentFilter intentFilter6 = new IntentFilter();
        intentFilter6.addAction("com.tsf.shell.plugin.patch.homepress");
        registerReceiver(ShellBroadcastReceiver.a(), intentFilter6);
        getContentResolver().registerContentObserver(cb.a, true, this.b);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        unregisterReceiver(a);
        getContentResolver().unregisterContentObserver(this.b);
    }

    public static ShellModel a() {
        return a;
    }
}
