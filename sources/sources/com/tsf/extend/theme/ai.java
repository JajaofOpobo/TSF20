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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        List<k> listC = c();
        if (listC.size() <= 0) {
            return null;
        }
        String strG = listC.get(0).g();
        long jC = listC.get(0).C();
        Iterator<k> it = listC.iterator();
        while (true) {
            long j = jC;
            String str = strG;
            if (!it.hasNext()) {
                return str;
            }
            k next = it.next();
            if (j < next.C()) {
                strG = next.g();
                jC = next.C();
            } else {
                strG = str;
                jC = j;
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
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        this.d.clear();
        this.a.clear();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= listQueryIntentActivities.size()) {
                break;
            }
            String str = listQueryIntentActivities.get(i2).activityInfo.packageName;
            String strI = v.i(str);
            if (!TextUtils.isEmpty(strI)) {
                this.d.put(strI, str);
            }
            if (a(str)) {
                this.f = true;
            } else {
                f fVarC = v.c(str);
                if (fVarC != null) {
                    PackageInfo packageInfo = null;
                    try {
                        packageInfo = packageManager.getPackageInfo(str, 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (packageInfo != null) {
                        fVarC.b(packageInfo.firstInstallTime);
                        if (z) {
                            long jCurrentTimeMillis = System.currentTimeMillis() - packageInfo.firstInstallTime;
                            if (jCurrentTimeMillis <= 3600000) {
                                this.c.add(fVarC);
                            }
                            if (jCurrentTimeMillis > 3600000 && jCurrentTimeMillis <= 86400000) {
                                this.b.add(fVarC);
                            }
                        }
                    }
                    this.e = true;
                    this.a.add(fVarC);
                }
            }
            i = i2 + 1;
        }
        List<aq> listI = v.i();
        if (listI != null && !listI.isEmpty()) {
            this.g = true;
        }
        if (listI != null) {
            if (z) {
                for (aq aqVar : listI) {
                    if (aqVar != null && !aqVar.g().startsWith("live.wallpaper.") && !a(aqVar.g())) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - aqVar.C();
                        if (jCurrentTimeMillis2 <= 3600000) {
                            this.c.add(aqVar);
                        }
                        if (jCurrentTimeMillis2 > 3600000 && jCurrentTimeMillis2 <= 86400000) {
                            this.b.add(aqVar);
                        }
                    }
                }
            }
            this.a.addAll(listI);
        }
        return this.a;
    }

    public List<k> d() {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = com.tsf.extend.h.b().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        for (int i = 0; i < listQueryIntentActivities.size(); i++) {
            String str = listQueryIntentActivities.get(i).activityInfo.packageName;
            try {
                applicationInfo = packageManager.getApplicationInfo(str, ItemInfo.APP_INTENT);
            } catch (PackageManager.NameNotFoundException e) {
                applicationInfo = null;
            }
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.getBoolean("KEYBOARD_THEME_SUPPORT", false)) {
                k kVar = new k();
                kVar.c(str);
                arrayListNewArrayList.add(kVar);
            }
        }
        return arrayListNewArrayList;
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
