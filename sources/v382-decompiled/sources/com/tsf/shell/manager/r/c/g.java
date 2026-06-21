package com.tsf.shell.manager.r.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.shell.R;
import com.tsf.shell.widget.a.m;
import com.tsf.shell.widget.alarm.an;
import com.tsf.shell.widget.cubeclock.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g {
    public com.tsf.shell.manager.r.b.a a;
    private b b;
    private ArrayList c;
    private com.tsf.shell.e.i.c.i d;

    public g() {
        com.tsf.shell.manager.r.c.a.a.a(this);
        this.a = new com.tsf.shell.manager.r.b.a();
        this.c = new ArrayList();
        com.tsf.shell.manager.r.c.a.a.a(getClass().getClassLoader());
        c.a();
        e();
    }

    public void a() {
        this.b = new b();
    }

    public b b() {
        return this.b;
    }

    public void c() {
    }

    private void e() {
        f();
    }

    public static String a(com.tsf.shell.e eVar) {
        return eVar.o.equals("com.tsf.shell.widget.alarm") ? com.censivn.C3DEngine.a.b() : eVar.o;
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.tsf.shell.e.i.c.c cVar = new com.tsf.shell.e.i.c.c();
        this.d = cVar;
        cVar.e = true;
        cVar.b = com.tsf.shell.e.i.b.d.b.class.getName();
        ((com.tsf.shell.e.i.c.i) cVar).a = "";
        cVar.d = 1;
        cVar.c(R.string.widget_folder);
        arrayList.add(this.d);
        this.c.add(cVar);
        com.tsf.shell.e.i.c.i a = h.a("com.tsf.shell.widget.alarm", null);
        a.e = true;
        a.b = an.class.getName();
        a.c = "com.tsf.shell.widget.alarm";
        a.d = 5;
        a.f = true;
        a.c(R.string.widget_clock);
        a.b(true);
        arrayList.add(a);
        this.c.add(a);
        com.tsf.shell.e.i.c.i a2 = h.a("com.tsf.shell.widget.message", null);
        a2.e = false;
        a2.b = "";
        a2.d = 5;
        a2.c(R.string.widget_message);
        arrayList.add(a2);
        this.c.add(a2);
        com.tsf.shell.e.i.c.i a3 = h.a("com.tsf.shell.widget.dotsclock", null);
        a3.e = true;
        a3.b = m.class.getName();
        a3.c = "com.tsf.shell.widget.dotsclock";
        a3.d = 5;
        a3.c(R.string.widget_dots_clock);
        a3.f = true;
        a3.b(true);
        arrayList.add(a3);
        this.c.add(a3);
        com.tsf.shell.e.i.c.i a4 = h.a("com.tsf.shell.widget.cubeclock", null);
        a4.e = true;
        a4.b = v.class.getName();
        a4.c = "com.tsf.shell.widget.cubeclock";
        a4.d = 5;
        a4.c(R.string.widget_cubeclock);
        a4.b(true);
        arrayList.add(a4);
        this.c.add(a4);
        com.tsf.shell.e.i.c.i a5 = h.a("com.tsf.shell.widget.calendar", null);
        a5.e = false;
        a5.b = "";
        a5.d = 5;
        a5.c(R.string.widget_calendar);
        arrayList.add(a5);
        this.c.add(a5);
        com.tsf.shell.e.i.c.i a6 = h.a("com.tsf.shell.widget.gallery", null);
        a6.e = false;
        a6.b = "";
        a6.d = 5;
        a6.c(R.string.widget_gallery);
        arrayList.add(a6);
        this.c.add(a6);
        com.tsf.shell.e.i.c.i a7 = h.a("com.tsf.shell.widget.memo", null);
        a7.e = false;
        a7.b = "";
        a7.d = 5;
        a7.c(R.string.widget_memo);
        arrayList.add(a7);
        this.c.add(a7);
        com.tsf.shell.e.i.c.i a8 = h.a("com.tsf.shell.widget.weather", null);
        a8.e = false;
        a8.b = "";
        a8.d = 5;
        a8.c(R.string.widget_weather);
        arrayList.add(a8);
        this.c.add(a8);
        com.tsf.shell.e.i.c.i a9 = h.a("com.tsf.shell.widget.music", null);
        a9.e = false;
        a9.b = "";
        a9.d = 5;
        a9.c(R.string.widget_music);
        arrayList.add(a9);
        this.c.add(a9);
        com.tsf.shell.e.i.c.i k = com.tsf.shell.e.i.b.a.b.k();
        k.e = true;
        k.b = com.tsf.shell.e.i.b.a.b.class.getName();
        k.c = "com.tsf.shell.widget.theme.airship";
        k.a = "";
        k.d = 5;
        k.f = true;
        k.g = 1;
        k.c(R.string.widget_airship);
        arrayList2.add(k);
        this.c.add(k);
        com.tsf.shell.e.i.c.e eVar = new com.tsf.shell.e.i.c.e();
        eVar.e = true;
        eVar.b = com.tsf.shell.e.i.b.c.a.class.getName();
        eVar.c = "com.tsf.shell.widget.floating";
        ((com.tsf.shell.e.i.c.i) eVar).a = "";
        eVar.d = 5;
        eVar.g = 1;
        eVar.c(R.string.widget_flotage);
        arrayList2.add(eVar);
        this.c.add(eVar);
        com.tsf.shell.e.i.c.i a10 = h.a("com.tsf.shell.widget.adornment", null);
        a10.e = false;
        a10.b = "";
        a10.d = 5;
        a10.c(R.string.widget_photo);
        arrayList2.add(a10);
        this.c.add(a10);
        this.a.b.a(arrayList);
        this.a.c.a(arrayList2);
    }

    public void a(com.tsf.shell.e.i.c cVar) {
        a(cVar, true);
    }

    public void a(final ItemInfo itemInfo) {
        itemInfo.unbindGL();
        if (itemInfo.id != -1) {
            com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.bind.d.b(itemInfo);
                }
            });
        }
    }

    public void a(final com.tsf.shell.e.i.c cVar, final boolean z) {
        com.tsf.shell.e.i.c.i a;
        if (com.censivn.C3DEngine.a.i.l()) {
            ItemInfo K = cVar.K();
            if (K != null) {
                if (z) {
                    a(K);
                }
                if (!(K instanceof LauncherShortcut3DInfo) && (a = a(K.packagename)) != null) {
                    a.b(cVar);
                }
            }
            cVar.g();
            cVar.destroy();
            return;
        }
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.2
            @Override // java.lang.Runnable
            public void run() {
                g.this.a(cVar, z);
            }
        });
    }

    public void b(com.tsf.shell.e.i.c cVar) {
        cVar.g();
        cVar.destroy();
    }

    public void c(com.tsf.shell.e.i.c cVar) {
        com.tsf.shell.e.f.g d = com.tsf.shell.manager.a.h.d(cVar.K().screen);
        cVar.ac();
        d.a(cVar);
        if (d.ad()) {
            cVar.o_();
        }
    }

    public void a(final ItemInfo itemInfo, final com.tsf.shell.manager.r.c.a.b bVar) {
        ResolveInfo resolveInfo = null;
        com.tsf.shell.e.i.c.i a = a(itemInfo.packagename);
        if (a != null && a.j()) {
            if (c.a(a, false)) {
                com.tsf.shell.manager.r.c.a.a.a(a, itemInfo, true, bVar);
                return;
            } else {
                bVar.b(itemInfo);
                com.tsf.shell.manager.r.c.a.a.a(itemInfo);
                return;
            }
        }
        PackageManager packageManager = com.censivn.C3DEngine.a.d().getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(itemInfo.packagename);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            resolveInfo = queryIntentActivities.get(0);
        }
        if (resolveInfo != null) {
            com.tsf.shell.manager.a.i iVar = new com.tsf.shell.manager.a.i(resolveInfo);
            com.tsf.shell.manager.bind.a.c().g(iVar);
            final ArrayList arrayList = new ArrayList();
            arrayList.add(iVar);
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.3
                @Override // java.lang.Runnable
                public void run() {
                    g.this.d(arrayList);
                    if (g.this.a(itemInfo.packagename) != null) {
                        g.this.a(itemInfo, bVar);
                    } else {
                        bVar.b(itemInfo);
                        com.tsf.shell.manager.r.c.a.a.a(itemInfo);
                    }
                }
            });
            return;
        }
        bVar.b(itemInfo);
        com.tsf.shell.manager.r.c.a.a.a(itemInfo);
    }

    public void d() {
    }

    public void a(final ArrayList arrayList) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.4
            @Override // java.lang.Runnable
            public void run() {
                g.this.d(arrayList);
            }
        });
    }

    public void b(final ArrayList arrayList) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.5
            @Override // java.lang.Runnable
            public void run() {
                g.this.d(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList arrayList) {
        Context d = com.censivn.C3DEngine.a.d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager.a.i iVar = (com.tsf.shell.manager.a.i) it.next();
            try {
                String packageName = iVar.b.getPackageName();
                String className = iVar.b.getClassName();
                if (!packageName.equals("com.tsf.shell.widget.alarm")) {
                    Context createPackageContext = d.createPackageContext(packageName, 3);
                    String str = iVar.e;
                    com.tsf.shell.e.i.c.i a = a(packageName);
                    if (a == null) {
                        a = h.a(createPackageContext, str, packageName, className, iVar);
                        a.j = false;
                        this.c.add(a);
                        switch (a.g) {
                            case 0:
                                this.a.b.a(a);
                                break;
                            case 1:
                                this.a.c.a(a);
                                break;
                            default:
                                this.a.b.a(a);
                                break;
                        }
                    } else {
                        h.a(a, createPackageContext, str, packageName, className, iVar);
                    }
                    a.b(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void c(final ArrayList arrayList) {
        com.tsf.shell.a.a.a("WidgetManager", "bind3dWidgetUpdate size:" + arrayList.size());
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.6
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.manager.a.i iVar = (com.tsf.shell.manager.a.i) it.next();
                    com.tsf.shell.e.i.c.i a = g.this.a(iVar.b.getPackageName());
                    if (a != null && !a.e) {
                        try {
                            String packageName = iVar.b.getPackageName();
                            h.a(a, com.censivn.C3DEngine.a.d().createPackageContext(packageName, 3), iVar.e, packageName, iVar.b.getClassName(), iVar);
                            ArrayList arrayList2 = (ArrayList) a.o().clone();
                            a.m();
                            com.tsf.shell.a.a.a("WidgetManager", "onWidgetUpdate delete old item size:" + arrayList2.size());
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it2.next();
                                com.tsf.shell.a.a.a("WidgetManager", "onWidgetUpdate delete old item:" + arrayList2);
                                ItemInfo K = cVar.K();
                                g.this.b(cVar);
                                com.tsf.shell.manager.r.c.a.a.a(a, K, true, null);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    public void a(final ArrayList arrayList, boolean z) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.7
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.e.i.c.i a = g.this.a(((com.tsf.shell.manager.a.i) it.next()).b.getPackageName());
                    if (a != null) {
                        a.b(false);
                        if (!a.j) {
                            g.this.c.remove(a);
                            switch (a.g) {
                                case 0:
                                    g.this.a.b.b(a);
                                    break;
                                case 1:
                                    g.this.a.c.b(a);
                                    break;
                                default:
                                    g.this.a.b.b(a);
                                    break;
                            }
                            a.a();
                        }
                    }
                }
            }
        });
    }

    public com.tsf.shell.e.i.c.i a(String str) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.c.i iVar = (com.tsf.shell.e.i.c.i) it.next();
            if (iVar.a.equals(str) || iVar.c.equals(str)) {
                return iVar;
            }
        }
        return null;
    }
}
