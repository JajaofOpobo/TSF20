package com.tsf.shell.manager.p187r.p193c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.p030a.C0869e;
import com.tsf.C1306b;
import com.tsf.extend.base.p080j.C1438q;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.shell.C2225c;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.C3444a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p187r.p189b.C3621a;
import com.tsf.shell.manager.p187r.p193c.p194a.C3696a;
import com.tsf.shell.p091b.C2224a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p156a.C3122b;
import com.tsf.shell.p096f.p153i.p155b.p158c.C3134a;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p161c.AbstractC3341e;
import com.tsf.shell.p096f.p153i.p161c.C3332c;
import com.tsf.shell.p096f.p153i.p161c.C3338d;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import com.tsf.shell.widget.alarm.C4333r;
import com.tsf.shell.widget.cubeclock.C4406t;
import com.tsf.shell.widget.p200a.C4224k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tsf.shell.manager.r.c.e */
/* loaded from: classes.dex */
public class C3720e {

    /* renamed from: a */
    public C3621a f12255a;

    /* renamed from: b */
    private C3702b f12256b;

    /* renamed from: c */
    private ArrayList<C3343g> f12257c;

    /* renamed from: d */
    private C3343g f12258d;

    public C3720e() {
        C3696a.m1685a(this);
        this.f12255a = new C3621a();
        this.f12257c = new ArrayList<>();
        C3696a.m1684a(getClass().getClassLoader());
        C3705c.m1672a();
        m1631e();
    }

    /* renamed from: a */
    public void m1651a() {
        this.f12256b = new C3702b();
    }

    /* renamed from: b */
    public C3702b m1640b() {
        return this.f12256b;
    }

    /* renamed from: c */
    public void m1637c() {
    }

    /* renamed from: e */
    private void m1631e() {
        m1630f();
    }

    /* renamed from: a */
    public static String m1648a(C2225c.C2227b c2227b) {
        return c2227b.f7316o.equals("com.tsf.shell.widget.alarm") ? C0853a.m10858b() : c2227b.f7316o;
    }

    /* renamed from: f */
    private void m1630f() {
        ArrayList<AbstractC3341e> arrayList = new ArrayList<>();
        ArrayList<AbstractC3341e> arrayList2 = new ArrayList<>();
        C3332c c3332c = new C3332c();
        this.f12258d = c3332c;
        c3332c.f11056e = true;
        c3332c.f11053b = C3145b.class.getName();
        ((C3343g) c3332c).f11052a = "";
        c3332c.f11055d = 1;
        c3332c.m2807c(C1306b.C1315i.widget_folder);
        arrayList.add(this.f12258d);
        this.f12257c.add(c3332c);
        C3343g m1627a = C3730f.m1627a("com.tsf.shell.widget.alarm", null);
        m1627a.f11056e = true;
        m1627a.f11053b = C4333r.class.getName();
        m1627a.f11054c = "com.tsf.shell.widget.alarm";
        m1627a.f11055d = 5;
        m1627a.f11057f = true;
        m1627a.m2807c(C1306b.C1315i.widget_clock);
        m1627a.m2796b(true);
        arrayList.add(m1627a);
        this.f12257c.add(m1627a);
        C3343g m1627a2 = C3730f.m1627a("com.tsf.shell.widget.message", null);
        m1627a2.f11056e = false;
        m1627a2.f11053b = "";
        m1627a2.f11055d = 5;
        m1627a2.m2807c(C1306b.C1315i.widget_message);
        arrayList.add(m1627a2);
        this.f12257c.add(m1627a2);
        C3343g m1627a3 = C3730f.m1627a("com.tsf.shell.widget.dotsclock", null);
        m1627a3.f11056e = true;
        m1627a3.f11053b = C4224k.class.getName();
        m1627a3.f11054c = "com.tsf.shell.widget.dotsclock";
        m1627a3.f11055d = 5;
        m1627a3.m2807c(C1306b.C1315i.widget_dots_clock);
        m1627a3.f11057f = true;
        m1627a3.m2796b(true);
        arrayList.add(m1627a3);
        this.f12257c.add(m1627a3);
        C3343g m1627a4 = C3730f.m1627a("com.tsf.shell.widget.cubeclock", null);
        m1627a4.f11056e = true;
        m1627a4.f11053b = C4406t.class.getName();
        m1627a4.f11054c = "com.tsf.shell.widget.cubeclock";
        m1627a4.f11055d = 5;
        m1627a4.m2807c(C1306b.C1315i.widget_cubeclock);
        m1627a4.m2796b(true);
        arrayList.add(m1627a4);
        this.f12257c.add(m1627a4);
        C3343g m1627a5 = C3730f.m1627a("com.tsf.shell.widget.calendar", null);
        m1627a5.f11056e = false;
        m1627a5.f11053b = "";
        m1627a5.f11055d = 5;
        m1627a5.m2807c(C1306b.C1315i.widget_calendar);
        arrayList.add(m1627a5);
        this.f12257c.add(m1627a5);
        C3343g m1627a6 = C3730f.m1627a("com.tsf.shell.widget.gallery", null);
        m1627a6.f11056e = false;
        m1627a6.f11053b = "";
        m1627a6.f11055d = 5;
        m1627a6.m2807c(C1306b.C1315i.widget_gallery);
        arrayList.add(m1627a6);
        this.f12257c.add(m1627a6);
        C3343g m1627a7 = C3730f.m1627a("com.tsf.shell.widget.memo", null);
        m1627a7.f11056e = false;
        m1627a7.f11053b = "";
        m1627a7.f11055d = 5;
        m1627a7.m2807c(C1306b.C1315i.widget_memo);
        arrayList.add(m1627a7);
        this.f12257c.add(m1627a7);
        C3343g m1627a8 = C3730f.m1627a("com.tsf.shell.widget.weather", null);
        m1627a8.f11056e = false;
        m1627a8.f11053b = "";
        m1627a8.f11055d = 5;
        m1627a8.m2807c(C1306b.C1315i.widget_weather);
        arrayList.add(m1627a8);
        this.f12257c.add(m1627a8);
        C3343g m1627a9 = C3730f.m1627a("com.tsf.shell.widget.music", null);
        m1627a9.f11056e = false;
        m1627a9.f11053b = "";
        m1627a9.f11055d = 5;
        m1627a9.m2807c(C1306b.C1315i.widget_music);
        arrayList.add(m1627a9);
        this.f12257c.add(m1627a9);
        C3343g m3469k = C3122b.m3469k();
        m3469k.f11056e = true;
        m3469k.f11053b = C3122b.class.getName();
        m3469k.f11054c = "com.tsf.shell.widget.theme.airship";
        m3469k.f11052a = "";
        m3469k.f11055d = 5;
        m3469k.f11057f = true;
        m3469k.f11058g = 1;
        m3469k.m2807c(C1306b.C1315i.widget_airship);
        arrayList2.add(m3469k);
        this.f12257c.add(m3469k);
        C3338d c3338d = new C3338d();
        c3338d.f11056e = true;
        c3338d.f11053b = C3134a.class.getName();
        c3338d.f11054c = "com.tsf.shell.widget.floating";
        ((C3343g) c3338d).f11052a = "";
        c3338d.f11055d = 5;
        c3338d.f11058g = 1;
        c3338d.m2807c(C1306b.C1315i.widget_flotage);
        arrayList2.add(c3338d);
        this.f12257c.add(c3338d);
        C3343g m1627a10 = C3730f.m1627a("com.tsf.shell.widget.adornment", null);
        m1627a10.f11056e = false;
        m1627a10.f11053b = "";
        m1627a10.f11055d = 5;
        m1627a10.m2807c(C1306b.C1315i.widget_photo);
        arrayList2.add(m1627a10);
        this.f12257c.add(m1627a10);
        this.f12255a.f12000b.m1749a(arrayList);
        this.f12255a.f12001c.m1823a(arrayList2);
    }

    /* renamed from: a */
    public void m1647a(C3112b c3112b) {
        m1646a(c3112b, true);
    }

    /* renamed from: a */
    public void m1650a(final ItemInfo itemInfo) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.1
            @Override // java.lang.Runnable
            public void run() {
                itemInfo.unbindGL();
            }
        });
        if (itemInfo.f2532id != -1) {
            C0853a.m10865a().m10580e(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.2
                @Override // java.lang.Runnable
                public void run() {
                    ShellModel.C3435a.m2367b(itemInfo);
                }
            });
        }
    }

    /* renamed from: b */
    public void m1639b(final C3112b c3112b) {
        C1455z.m8564a(6, new Runnable() { // from class: com.tsf.shell.manager.r.c.e.3
            @Override // java.lang.Runnable
            public void run() {
                C3343g m1643a;
                ItemInfo m3534K = c3112b.m3534K();
                C1438q.m8608a("szxasasqsq", "removeWidgetFromMine...parent:" + m3534K);
                if (m3534K != null) {
                    C3720e.this.m1650a(m3534K);
                }
                if (!(m3534K instanceof LauncherShortcut3DInfo) && (m1643a = C3720e.this.m1643a(m3534K.packagename)) != null) {
                    m1643a.m2797b(c3112b);
                }
                c3112b.mo3055g();
                c3112b.destroy();
            }
        });
    }

    /* renamed from: a */
    public void m1646a(final C3112b c3112b, final boolean z) {
        C3343g m1643a;
        if (C0869e.m10758l()) {
            ItemInfo m3534K = c3112b.m3534K();
            C1438q.m8608a("szxasasqsq", "removeWidget...parent:" + m3534K);
            if (m3534K != null) {
                if (z) {
                    m1650a(m3534K);
                }
                if (!(m3534K instanceof LauncherShortcut3DInfo) && (m1643a = m1643a(m3534K.packagename)) != null) {
                    m1643a.m2797b(c3112b);
                }
            }
            c3112b.mo3055g();
            c3112b.destroy();
            return;
        }
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.4
            @Override // java.lang.Runnable
            public void run() {
                C3720e.this.m1646a(c3112b, z);
            }
        });
    }

    /* renamed from: c */
    public void m1636c(C3112b c3112b) {
        c3112b.mo3055g();
        c3112b.destroy();
    }

    /* renamed from: d */
    public void m1633d(C3112b c3112b) {
        C2932g m4054d = C3359a.f11094h.m4054d(c3112b.m3534K().screen);
        c3112b.mo3458ac();
        m4054d.m4229a(c3112b);
        if (m4054d.m4216ad()) {
            c3112b.mo3081q_();
        }
    }

    /* renamed from: a */
    public void m1649a(final ItemInfo itemInfo, final C3696a.AbstractC3699a abstractC3699a) {
        ResolveInfo resolveInfo = null;
        C3343g m1643a = m1643a(itemInfo.packagename);
        if (m1643a != null && m1643a.m2789j()) {
            if (C3705c.m1670a(m1643a, false)) {
                C3696a.m1686a(m1643a, itemInfo, true, abstractC3699a);
                return;
            }
            abstractC3699a.m1679b(itemInfo);
            C3696a.m1688a(itemInfo);
            return;
        }
        PackageManager packageManager = C0853a.m10856d().getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(itemInfo.packagename);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            resolveInfo = queryIntentActivities.get(0);
        }
        if (resolveInfo != null) {
            C3377f c3377f = new C3377f(resolveInfo);
            C3444a.m2356c().m2757g(c3377f);
            final ArrayList arrayList = new ArrayList();
            arrayList.add(c3377f);
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.5
                @Override // java.lang.Runnable
                public void run() {
                    C3720e.this.m1632d(arrayList);
                    if (C3720e.this.m1643a(itemInfo.packagename) != null) {
                        C3720e.this.m1649a(itemInfo, abstractC3699a);
                        return;
                    }
                    abstractC3699a.m1679b(itemInfo);
                    C3696a.m1688a(itemInfo);
                }
            });
            return;
        }
        abstractC3699a.m1679b(itemInfo);
        C3696a.m1688a(itemInfo);
    }

    /* renamed from: d */
    public void m1634d() {
    }

    /* renamed from: a */
    public void m1642a(final ArrayList<C3377f> arrayList) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.6
            @Override // java.lang.Runnable
            public void run() {
                C3720e.this.m1632d(arrayList);
            }
        });
    }

    /* renamed from: b */
    public void m1638b(final ArrayList<C3377f> arrayList) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.7
            @Override // java.lang.Runnable
            public void run() {
                C3720e.this.m1632d(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m1632d(ArrayList<C3377f> arrayList) {
        Context m10856d = C0853a.m10856d();
        Iterator<C3377f> it = arrayList.iterator();
        while (it.hasNext()) {
            C3377f next = it.next();
            try {
                String packageName = next.f11169b.getPackageName();
                String className = next.f11169b.getClassName();
                if (!packageName.equals("com.tsf.shell.widget.alarm")) {
                    Context createPackageContext = m10856d.createPackageContext(packageName, 3);
                    String str = next.f11172e;
                    C3343g m1643a = m1643a(packageName);
                    if (m1643a == null) {
                        m1643a = C3730f.m1629a(createPackageContext, str, packageName, className, next);
                        m1643a.f11061j = false;
                        this.f12257c.add(m1643a);
                        switch (m1643a.f11058g) {
                            case 0:
                                this.f12255a.f12000b.m1754a(m1643a);
                                break;
                            case 1:
                                this.f12255a.f12001c.m1826a(m1643a);
                                break;
                            default:
                                this.f12255a.f12000b.m1754a(m1643a);
                                break;
                        }
                    } else {
                        C3730f.m1628a(m1643a, createPackageContext, str, packageName, className, next);
                    }
                    m1643a.m2796b(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void m1635c(final ArrayList<C3377f> arrayList) {
        C2224a.m6053a("WidgetManager", "bind3dWidgetUpdate size:" + arrayList.size());
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.8
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3377f c3377f = (C3377f) it.next();
                    C3343g m1643a = C3720e.this.m1643a(c3377f.f11169b.getPackageName());
                    if (m1643a != null && !m1643a.f11056e) {
                        try {
                            String packageName = c3377f.f11169b.getPackageName();
                            C3730f.m1628a(m1643a, C0853a.m10856d().createPackageContext(packageName, 3), c3377f.f11172e, packageName, c3377f.f11169b.getClassName(), c3377f);
                            ArrayList arrayList2 = (ArrayList) m1643a.m2784o().clone();
                            m1643a.m2786m();
                            C2224a.m6053a("WidgetManager", "onWidgetUpdate delete old item size:" + arrayList2.size());
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                C3112b c3112b = (C3112b) it2.next();
                                C2224a.m6053a("WidgetManager", "onWidgetUpdate delete old item:" + arrayList2);
                                ItemInfo m3534K = c3112b.m3534K();
                                C3720e.this.m1636c(c3112b);
                                C3696a.m1686a(m1643a, m3534K, true, null);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void m1641a(final ArrayList<C3377f> arrayList, boolean z) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.9
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3343g m1643a = C3720e.this.m1643a(((C3377f) it.next()).f11169b.getPackageName());
                    if (m1643a != null) {
                        m1643a.m2796b(false);
                        if (!m1643a.f11061j) {
                            C3720e.this.f12257c.remove(m1643a);
                            switch (m1643a.f11058g) {
                                case 0:
                                    C3720e.this.f12255a.f12000b.m1748b(m1643a);
                                    break;
                                case 1:
                                    C3720e.this.f12255a.f12001c.m1822b(m1643a);
                                    break;
                                default:
                                    C3720e.this.f12255a.f12000b.m1748b(m1643a);
                                    break;
                            }
                            m1643a.mo1625a();
                        }
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tsf.shell.p096f.p153i.p161c.C3343g m1643a(java.lang.String r4) {
        /*
            r3 = this;
            java.util.ArrayList<com.tsf.shell.f.i.c.g> r0 = r3.f12257c
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            com.tsf.shell.f.i.c.g r0 = (com.tsf.shell.p096f.p153i.p161c.C3343g) r0
            java.lang.String r2 = r0.f11052a
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L22
            java.lang.String r2 = r0.f11054c
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
        L22:
            return r0
        L23:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.manager.p187r.p193c.C3720e.m1643a(java.lang.String):com.tsf.shell.f.i.c.g");
    }
}
