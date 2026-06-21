package com.tsf.shell.manager.a;

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
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.utils.n;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i {
    public Intent a;
    public ComponentName b;
    public long c;
    public TextureElement d;
    public String e;
    public ResolveInfo f;
    public boolean g;
    private boolean h;
    private int i;

    public i(ResolveInfo resolveInfo) {
        this.c = 0L;
        this.d = new TextureElement(0, false);
        this.e = "";
        this.g = false;
        this.i = 0;
        a(resolveInfo);
    }

    public void a() {
        try {
            com.tsf.shell.e.i.b.e.i a = com.tsf.shell.manager.a.w.a().a(this.a.getComponent());
            if (a.K() != null) {
                ((LauncherShortcutAppInfo) a.K()).applicationOnClick();
            }
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.a.i.1
                @Override // java.lang.Runnable
                public void run() {
                    Home.b().a(i.this.a, (Object) null);
                }
            });
        } catch (Exception e) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.a.i.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.k.a(com.censivn.C3DEngine.a.d().getString(R.string.activity_not_found));
                }
            });
        }
    }

    public TextureElement b() {
        return this.d;
    }

    public i(ComponentName componentName, String str) {
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
            PackageManager packageManager = com.censivn.C3DEngine.a.d().getPackageManager();
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
                HashMap hashMap = new HashMap();
                hashMap.put("app info", this.b.toShortString());
                n.a("EVENT_ISSUSE_APP_TITLE_NULL", hashMap);
            }
        }
        com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.a.i.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.r.a(i.this);
            }
        });
    }

    public void d() {
        HashMap hashMap = new HashMap();
        ShellModel.a(hashMap);
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            ItemInfo itemInfo = (ItemInfo) hashMap.get((Integer) it.next());
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo)) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                if (launcherShortcutAppInfo.getWidget() != null && ((com.tsf.shell.e.i.b.e.i) launcherShortcutAppInfo.getWidget()).bd() == this) {
                    com.tsf.shell.manager.a.i.a(((LauncherShortcutAppInfo) itemInfo).getWidget());
                }
            }
        }
        hashMap.clear();
        com.censivn.C3DEngine.a.g().a(this.d);
        this.b = null;
        this.f = null;
    }

    public void e() {
        f();
        HashMap hashMap = new HashMap();
        ShellModel.a(hashMap);
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            ItemInfo itemInfo = (ItemInfo) hashMap.get((Integer) it.next());
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo)) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                if (launcherShortcutAppInfo.getWidget() != null && ((com.tsf.shell.e.i.b.e.i) launcherShortcutAppInfo.getWidget()).bd() == this && !((LauncherShortcutAppInfo) itemInfo).isFullCustomTexture()) {
                    ((LauncherShortcutAppInfo) itemInfo).reloadTexture();
                }
            }
        }
        hashMap.clear();
    }

    public void f() {
        com.censivn.C3DEngine.a.g().a(this.d, com.tsf.shell.manager.r.c.a.a(null, com.tsf.shell.manager.o.b.a, this));
    }

    public Bitmap g() {
        return com.tsf.shell.manager.r.c.a.a(this.f);
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
            e();
        }
    }

    public int h() {
        return this.i;
    }
}
