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
import com.tsf.extend.C1547h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.tsf.extend.theme.ai */
/* loaded from: classes.dex */
public class C1685ai {

    /* renamed from: h */
    private static volatile C1685ai f5433h;

    /* renamed from: a */
    private List<C1848k> f5434a = Lists.newArrayList();

    /* renamed from: b */
    private List<C1848k> f5435b = Lists.newArrayList();

    /* renamed from: c */
    private List<C1848k> f5436c = Lists.newArrayList();

    /* renamed from: d */
    private Map<String, String> f5437d = Maps.newHashMap();

    /* renamed from: e */
    private boolean f5438e = false;

    /* renamed from: f */
    private boolean f5439f = false;

    /* renamed from: g */
    private boolean f5440g = false;

    /* renamed from: a */
    public static C1685ai m7809a() {
        if (f5433h == null) {
            synchronized (C1685ai.class) {
                if (f5433h == null) {
                    f5433h = new C1685ai();
                }
            }
        }
        return f5433h;
    }

    private C1685ai() {
    }

    /* renamed from: b */
    public String m7805b() {
        List<C1848k> m7803c = m7803c();
        if (m7803c.size() <= 0) {
            return null;
        }
        String m7300g = m7803c.get(0).m7300g();
        long m7329C = m7803c.get(0).m7329C();
        Iterator<C1848k> it = m7803c.iterator();
        while (true) {
            long j = m7329C;
            String str = m7300g;
            if (it.hasNext()) {
                C1848k next = it.next();
                if (j < next.m7329C()) {
                    m7300g = next.m7300g();
                    m7329C = next.m7329C();
                } else {
                    m7300g = str;
                    m7329C = j;
                }
            } else {
                return str;
            }
        }
    }

    /* renamed from: c */
    public List<C1848k> m7803c() {
        return m7806a(false);
    }

    /* renamed from: a */
    public List<C1848k> m7806a(boolean z) {
        this.f5438e = false;
        PackageManager packageManager = C1547h.m8290b().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        this.f5437d.clear();
        this.f5434a.clear();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= queryIntentActivities.size()) {
                break;
            }
            String str = queryIntentActivities.get(i2).activityInfo.packageName;
            String m7065i = C1894v.m7065i(str);
            if (!TextUtils.isEmpty(m7065i)) {
                this.f5437d.put(m7065i, str);
            }
            if (m7808a(str)) {
                this.f5439f = true;
            } else {
                C1842f m7080c = C1894v.m7080c(str);
                if (m7080c != null) {
                    PackageInfo packageInfo = null;
                    try {
                        packageInfo = packageManager.getPackageInfo(str, 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (packageInfo != null) {
                        m7080c.m7315b(packageInfo.firstInstallTime);
                        if (z) {
                            long currentTimeMillis = System.currentTimeMillis() - packageInfo.firstInstallTime;
                            if (currentTimeMillis <= 3600000) {
                                this.f5436c.add(m7080c);
                            }
                            if (currentTimeMillis > 3600000 && currentTimeMillis <= 86400000) {
                                this.f5435b.add(m7080c);
                            }
                        }
                    }
                    this.f5438e = true;
                    this.f5434a.add(m7080c);
                }
            }
            i = i2 + 1;
        }
        List<AbstractC1700aq> m7066i = C1894v.m7066i();
        if (m7066i != null && !m7066i.isEmpty()) {
            this.f5440g = true;
        }
        if (m7066i != null) {
            if (z) {
                for (AbstractC1700aq abstractC1700aq : m7066i) {
                    if (abstractC1700aq != null && !abstractC1700aq.m7300g().startsWith("live.wallpaper.") && !m7808a(abstractC1700aq.m7300g())) {
                        long currentTimeMillis2 = System.currentTimeMillis() - abstractC1700aq.m7329C();
                        if (currentTimeMillis2 <= 3600000) {
                            this.f5436c.add(abstractC1700aq);
                        }
                        if (currentTimeMillis2 > 3600000 && currentTimeMillis2 <= 86400000) {
                            this.f5435b.add(abstractC1700aq);
                        }
                    }
                }
            }
            this.f5434a.addAll(m7066i);
        }
        return this.f5434a;
    }

    /* renamed from: d */
    public List<C1848k> m7802d() {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = C1547h.m8290b().getPackageManager();
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
                C1848k c1848k = new C1848k();
                c1848k.m7310c(str);
                newArrayList.add(c1848k);
            }
        }
        return newArrayList;
    }

    /* renamed from: a */
    public boolean m7808a(String str) {
        return m7807a(str, "IS_LIVE_WALLPAPER");
    }

    /* renamed from: b */
    public boolean m7804b(String str) {
        return m7807a(str, "IS_APP_PREVIEW_NEEDED");
    }

    /* renamed from: a */
    private boolean m7807a(String str, String str2) {
        try {
            ApplicationInfo applicationInfo = C1547h.m8290b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
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
