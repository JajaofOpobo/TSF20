package com.tsf.shell.h;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {
    public CharSequence a;
    public Intent b;
    public ComponentName c;
    public ArrayList d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public long i;
    public boolean j;
    public ResolveInfo k;

    public b(CharSequence charSequence, String str, String str2, Intent intent, int i) {
        this.a = "";
        this.e = 0;
        this.f = true;
        this.g = false;
        this.h = false;
        this.i = 0L;
        this.j = false;
        this.a = charSequence;
        this.c = new ComponentName(str, str2);
        this.b = intent;
        this.e = i;
    }

    public final void a(ResolveInfo resolveInfo) {
        this.k = resolveInfo;
        this.c = new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name);
        ComponentName componentName = this.c;
        this.b = new Intent("android.intent.action.MAIN");
        this.b.addCategory("android.intent.category.LAUNCHER");
        this.b.setComponent(componentName);
        this.b.setFlags(270532608);
        PackageManager packageManager = com.censivn.C3DEngine.a.c().getPackageManager();
        this.a = resolveInfo.loadLabel(packageManager).toString();
        if (this.a == null) {
            this.a = resolveInfo.activityInfo.name;
        }
        if (Build.VERSION.SDK_INT >= 9) {
            try {
                this.i = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 128).firstInstallTime;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if ((resolveInfo.activityInfo.applicationInfo.flags & 128) != 0 || (resolveInfo.activityInfo.applicationInfo.flags & 1) == 0) {
            this.f = false;
        } else {
            this.f = true;
        }
    }

    public b(ResolveInfo resolveInfo) {
        this.a = "";
        this.e = 0;
        this.f = true;
        this.g = false;
        this.h = false;
        this.i = 0L;
        this.j = false;
        a(resolveInfo);
    }

    public final String toString() {
        return "LauncherAppInfo(title=" + this.a.toString() + ")";
    }
}
