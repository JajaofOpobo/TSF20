package com.tsf.shell.manager.p166a;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Build;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p187r.p193c.C3695a;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4177m;
import java.util.HashMap;
/* renamed from: com.tsf.shell.manager.a.f */
/* loaded from: classes.dex */
public class C3377f {

    /* renamed from: a */
    public Intent f11168a;

    /* renamed from: b */
    public ComponentName f11169b;

    /* renamed from: c */
    public long f11170c;

    /* renamed from: d */
    public TextureElement f11171d;

    /* renamed from: e */
    public String f11172e;

    /* renamed from: f */
    public ResolveInfo f11173f;

    /* renamed from: g */
    public boolean f11174g;

    /* renamed from: h */
    private boolean f11175h;

    /* renamed from: i */
    private int f11176i;

    public C3377f(ResolveInfo resolveInfo) {
        this.f11170c = 0L;
        this.f11171d = new TextureElement(0, false);
        this.f11172e = "";
        this.f11174g = false;
        this.f11176i = 0;
        m2702a(resolveInfo);
    }

    /* renamed from: a */
    public void m2706a() {
        try {
            C3222g m2747a = C3359a.f11109w.m2716a().m2747a(this.f11168a.getComponent());
            if (m2747a.m3534K() != null) {
                ((LauncherShortcutAppInfo) m2747a.m3534K()).applicationOnClick();
            }
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.a.f.1
                @Override // java.lang.Runnable
                public void run() {
                    Home.m6177b().m6182a(C3377f.this.f11168a, (Object) null);
                }
            });
        } catch (Exception e) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.a.f.2
                @Override // java.lang.Runnable
                public void run() {
                    C2244e.m6012a(C0853a.m10856d().getString(C1306b.C1315i.activity_not_found));
                }
            });
        }
    }

    /* renamed from: b */
    public TextureElement m2701b() {
        return this.f11171d;
    }

    public C3377f(ComponentName componentName, String str) {
        this.f11170c = 0L;
        this.f11171d = new TextureElement(0, false);
        this.f11172e = "";
        this.f11174g = false;
        this.f11176i = 0;
        this.f11169b = componentName;
        m2704a(componentName, 270532608);
        this.f11172e = str;
    }

    /* renamed from: c */
    public boolean m2699c() {
        return this.f11175h;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m2702a(ResolveInfo resolveInfo) {
        this.f11173f = resolveInfo;
        if (resolveInfo != null) {
            String str = resolveInfo.activityInfo.applicationInfo.packageName;
            this.f11169b = new ComponentName(str, resolveInfo.activityInfo.name);
            m2704a(this.f11169b, 270532608);
            PackageManager packageManager = C0853a.m10856d().getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                m2700b(packageInfo);
                if (Build.VERSION.SDK_INT >= 9) {
                    this.f11170c = m2703a(packageInfo);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            this.f11172e = resolveInfo.loadLabel(packageManager).toString();
            if (this.f11172e == null) {
                this.f11172e = resolveInfo.activityInfo.name;
            }
            if (this.f11172e == null) {
                this.f11172e = "";
                HashMap hashMap = new HashMap();
                hashMap.put("app info", this.f11169b.toShortString());
                C4177m.m667a("EVENT_ISSUSE_APP_TITLE_NULL", hashMap);
            }
        }
        C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.manager.a.f.3
            @Override // java.lang.Runnable
            public void run() {
                C3359a.f11104r.m1911a(C3377f.this);
            }
        });
    }

    /* renamed from: d */
    public void m2698d() {
        HashMap hashMap = new HashMap();
        ShellModel.m2387a(hashMap);
        for (Integer num : hashMap.keySet()) {
            ItemInfo itemInfo = (ItemInfo) hashMap.get(num);
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo)) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                if (launcherShortcutAppInfo.getWidget() != null && ((C3222g) launcherShortcutAppInfo.getWidget()).m3106bd() == this) {
                    C3359a.f11095i.m1647a(((LauncherShortcutAppInfo) itemInfo).getWidget());
                }
            }
        }
        hashMap.clear();
        C0853a.m10853g().m10543a(this.f11171d);
        this.f11169b = null;
        this.f11173f = null;
    }

    /* renamed from: e */
    public void m2697e() {
        m2696f();
        HashMap hashMap = new HashMap();
        ShellModel.m2387a(hashMap);
        for (Integer num : hashMap.keySet()) {
            ItemInfo itemInfo = (ItemInfo) hashMap.get(num);
            if (itemInfo != null && (itemInfo instanceof LauncherShortcutAppInfo)) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
                if (launcherShortcutAppInfo.getWidget() != null && ((C3222g) launcherShortcutAppInfo.getWidget()).m3106bd() == this && !((LauncherShortcutAppInfo) itemInfo).isFullCustomTexture()) {
                    ((LauncherShortcutAppInfo) itemInfo).reloadTexture();
                }
            }
        }
        hashMap.clear();
    }

    /* renamed from: f */
    public void m2696f() {
        C0853a.m10853g().m10540a(this.f11171d, C3695a.m1690a(null, C3566b.f11839a, this));
    }

    /* renamed from: g */
    public Bitmap m2695g() {
        return C3695a.m1693a(this.f11173f);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static long m2703a(PackageInfo packageInfo) {
        return packageInfo.firstInstallTime;
    }

    /* renamed from: b */
    public void m2700b(PackageInfo packageInfo) {
        if ((packageInfo.applicationInfo.flags & 1) > 0) {
            this.f11175h = true;
        } else {
            this.f11175h = false;
        }
    }

    /* renamed from: a */
    final void m2704a(ComponentName componentName, int i) {
        this.f11168a = new Intent("android.intent.action.MAIN");
        this.f11168a.addCategory("android.intent.category.LAUNCHER");
        this.f11168a.setComponent(componentName);
        this.f11168a.setFlags(i);
    }

    /* renamed from: a */
    public void m2705a(int i) {
        if (this.f11176i != i) {
            this.f11176i = i;
            m2697e();
        }
    }

    /* renamed from: h */
    public int m2694h() {
        return this.f11176i;
    }
}
