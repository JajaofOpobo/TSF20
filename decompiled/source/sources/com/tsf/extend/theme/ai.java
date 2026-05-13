package com.tsf.extend.theme;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.google.android.collect.Lists;
import com.google.android.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class ai {
    private static volatile ai h;
    private List<k> a = Lists.newArrayList();
    private List<k> b = Lists.newArrayList();
    private List<k> c = Lists.newArrayList();
    private Map<String, String> d = Maps.newHashMap();
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    public static ai a() {
        if (h == null) {
            synchronized (ai.class) {
                if (h == null) {
                    h = new ai();
                }
            }
        }
        return h;
    }

    private ai() {
    }

    public String b() {
        List<k> c = c();
        if (c.size() <= 0) {
            return null;
        }
        String g = c.get(0).g();
        long C = c.get(0).C();
        Iterator<k> it = c.iterator();
        while (true) {
            long j = C;
            String str = g;
            if (it.hasNext()) {
                k next = it.next();
                if (j < next.C()) {
                    g = next.g();
                    C = next.C();
                } else {
                    g = str;
                    C = j;
                }
            } else {
                return str;
            }
        }
    }

    public List<k> c() {
        return a(false);
    }

    public List<k> a(boolean z) {
        this.e = false;
        PackageManager packageManager = com.tsf.extend.h.b().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        this.d.clear();
        this.a.clear();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= queryIntentActivities.size()) {
                break;
            }
            String str = queryIntentActivities.get(i2).activityInfo.packageName;
            String i3 = v.i(str);
            if (!TextUtils.isEmpty(i3)) {
                this.d.put(i3, str);
            }
            if (a(str)) {
                this.f = true;
            } else {
                f c = v.c(str);
                if (c != null) {
                    PackageInfo packageInfo = null;
                    try {
                        packageInfo = packageManager.getPackageInfo(str, 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (packageInfo != null) {
                        c.b(packageInfo.firstInstallTime);
                        if (z) {
                            long currentTimeMillis = System.currentTimeMillis() - packageInfo.firstInstallTime;
                            if (currentTimeMillis <= 3600000) {
                                this.c.add(c);
                            }
                            if (currentTimeMillis > 3600000 && currentTimeMillis <= 86400000) {
                                this.b.add(c);
                            }
                        }
                    }
                    this.e = true;
                    this.a.add(c);
                }
            }
            i = i2 + 1;
        }
        List<aq> i4 = v.i();
        if (i4 != null && !i4.isEmpty()) {
            this.g = true;
        }
        if (i4 != null) {
            if (z) {
                for (aq aqVar : i4) {
                    if (aqVar != null && !aqVar.g().startsWith("live.wallpaper.") && !a(aqVar.g())) {
                        long currentTimeMillis2 = System.currentTimeMillis() - aqVar.C();
                        if (currentTimeMillis2 <= 3600000) {
                            this.c.add(aqVar);
                        }
                        if (currentTimeMillis2 > 3600000 && currentTimeMillis2 <= 86400000) {
                            this.b.add(aqVar);
                        }
                    }
                }
            }
            this.a.addAll(i4);
        }
        return this.a;
    }

    public List<k> d() {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = com.tsf.extend.h.b().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList newArrayList = Lists.newArrayList();
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            String str = queryIntentActivities.get(i).activityInfo.packageName;
            try {
                applicationInfo = packageManager.getApplicationInfo(str, ItemInfo.APP_INTENT);
            } catch (PackageManager.NameNotFoundException e) {
                applicationInfo = null;
            }
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.getBoolean("KEYBOARD_THEME_SUPPORT", false)) {
                k kVar = new k();
                kVar.c(str);
                newArrayList.add(kVar);
            }
        }
        return newArrayList;
    }

    public boolean a(String str) {
        return a(str, "IS_LIVE_WALLPAPER");
    }

    public boolean b(String str) {
        return a(str, "IS_APP_PREVIEW_NEEDED");
    }

    private boolean a(String str, String str2) {
        try {
            ApplicationInfo applicationInfo = com.tsf.extend.h.b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return false;
            }
            return applicationInfo.metaData.getBoolean(str2, false);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
