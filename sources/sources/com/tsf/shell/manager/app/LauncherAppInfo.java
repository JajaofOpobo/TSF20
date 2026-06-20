package com.tsf.shell.manager.app;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Build;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.utils.FlurryAnalyticsLogger;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LauncherAppInfo {
    public Intent a;
    public ComponentName b;
    public long c;
    public TextureElement d;
    public String e;
    public ResolveInfo f;
    public boolean g;
    private boolean h;
    private int i;

    public LauncherAppInfo(ResolveInfo resolveInfo) {
        this.c = 0L;
        this.d = new TextureElement(0, false);
        this.e = "";
        this.g = false;
        this.i = 0;
        a(resolveInfo);
    }

    public void a_() {
        try {
            Home.b().a(this.a, (Object) null);
        } catch (Exception e) {
            com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.manager.app.LauncherAppInfo.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.e.a(com.censivn.C3DEngine.C3DEngine.d().getString(b.i.activity_not_found));
                }
            });
        }
    }

    public static a a() {
        return null;
    }
    public static void a(int i, int i2, int i3, int i4) {}
    public static class a {
        public void show() {}
    }

    public TextureElement b() {
        return this.d;
    }

    public LauncherAppInfo(ComponentName componentName, String str) {
        this.c = 0L;
        this.d = new TextureElement(0, false);
        this.e = "";
        this.g = false;
        this.i = 0;
        this.b = componentName;
        a(componentName, 270532608);
        this.e = str;
    }

    public boolean c() {
        return this.h;
    }

    @SuppressLint({"NewApi"})
    public void a(ResolveInfo resolveInfo) {
        this.f = resolveInfo;
        if (resolveInfo != null) {
            String str = resolveInfo.activityInfo.applicationInfo.packageName;
            this.b = new ComponentName(str, resolveInfo.activityInfo.name);
            a(this.b, 270532608);
            PackageManager packageManager = com.censivn.C3DEngine.C3DEngine.d().getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                b(packageInfo);
                if (Build.VERSION.SDK_INT >= 9) {
                    this.c = a(packageInfo);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            this.e = resolveInfo.loadLabel(packageManager).toString();
            if (this.e == null) {
                this.e = resolveInfo.activityInfo.name;
            }
            if (this.e == null) {
                this.e = "";
                HashMap map = new HashMap();
                map.put("app info", this.b.toShortString());
                m.a("EVENT_ISSUSE_APP_TITLE_NULL", map);
            }
        }
        com.censivn.C3DEngine.C3DEngine.a().d(new Runnable() { // from class: com.tsf.shell.manager.app.LauncherAppInfo.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.app.EventHandler.a(f.this);
            }
        });
    }

    public void d() {
        HashMap map = new HashMap();
        ShellModel.a((HashMap<Integer, ItemInfo>) map);
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ItemInfo itemInfo = (ItemInfo) map.get((Integer) it.next());
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo)) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                if (launcherShortcutAppInfo.getWidget() != null && ((com.tsf.shell.f.i.b.e.DrawerItemVisual) launcherShortcutAppInfo.getWidget()).bd() == this) {
                    com.tsf.shell.manager.app.WidgetManager.a(((LauncherShortcutAppInfo) itemInfo).getWidget());
                }
            }
        }
        map.clear();
        com.censivn.C3DEngine.C3DEngine.g().a(this.d);
        this.b = null;
        this.f = null;
    }

    public void e() {
        a();
        HashMap map = new HashMap();
        ShellModel.a((HashMap<Integer, ItemInfo>) map);
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ItemInfo itemInfo = (ItemInfo) map.get((Integer) it.next());
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo)) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                if (launcherShortcutAppInfo.getWidget() != null && ((com.tsf.shell.f.i.b.e.DrawerItemVisual) launcherShortcutAppInfo.getWidget()).bd() == this && !((LauncherShortcutAppInfo) itemInfo).isFullCustomTexture()) {
                    ((LauncherShortcutAppInfo) itemInfo).reloadTexture();
                }
            }
        }
        map.clear();
    }

    public void f() {
        com.censivn.C3DEngine.C3DEngine.g().a(this.d, com.tsf.shell.manager.r.c.a.WidgetInstantiator(null, com.tsf.shell.manager.o.ButtonPresetManager.a, this));
    }

    public Bitmap g() {
        return com.tsf.shell.manager.r.c.a.WidgetInstantiator(this.f);
    }

    @SuppressLint({"NewApi"})
    public static long a(PackageInfo packageInfo) {
        return packageInfo.firstInstallTime;
    }

    public void b(PackageInfo packageInfo) {
        if ((packageInfo.applicationInfo.flags & 1) > 0) {
            this.h = true;
        } else {
            this.h = false;
        }
    }

    final void a(ComponentName componentName, int i) {
        this.a = new Intent("android.intent.action.MAIN");
        this.a.addCategory("android.intent.category.LAUNCHER");
        this.a.setComponent(componentName);
        this.a.setFlags(i);
    }

    public void a(int i) {
        if (this.i != i) {
            this.i = i;
            a();
        }
    }

    public int h() {
        return this.i;
    }
}
