package com.tsf.shell.manager.r.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.b;
import com.tsf.extend.base.j.q;
import com.tsf.extend.base.j.z;
import com.tsf.shell.c;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.r.c.a.a;
import com.tsf.shell.widget.a.k;
import com.tsf.shell.widget.alarm.r;
import com.tsf.shell.widget.cubeclock.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class e {
    public com.tsf.shell.manager.r.b.a a;
    private b b;
    private ArrayList<com.tsf.shell.f.i.c.g> c;
    private com.tsf.shell.f.i.c.g d;

    public e() {
        com.tsf.shell.manager.r.c.a.a.a(this);
        this.a = new com.tsf.shell.manager.r.b.a();
        this.c = new ArrayList<>();
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

    public static String a(c.b bVar) {
        return bVar.o.equals("com.tsf.shell.widget.alarm") ? com.censivn.C3DEngine.a.b() : bVar.o;
    }

    private void f() {
        ArrayList<com.tsf.shell.f.i.c.e> arrayList = new ArrayList<>();
        ArrayList<com.tsf.shell.f.i.c.e> arrayList2 = new ArrayList<>();
        com.tsf.shell.f.i.c.c cVar = new com.tsf.shell.f.i.c.c();
        this.d = cVar;
        cVar.e = true;
        cVar.b = com.tsf.shell.f.i.b.d.b.class.getName();
        ((com.tsf.shell.f.i.c.g) cVar).a = "";
        cVar.d = 1;
        cVar.c(b.i.widget_folder);
        arrayList.add(this.d);
        this.c.add(cVar);
        com.tsf.shell.f.i.c.g a = f.a("com.tsf.shell.widget.alarm", null);
        a.e = true;
        a.b = r.class.getName();
        a.c = "com.tsf.shell.widget.alarm";
        a.d = 5;
        a.f = true;
        a.c(b.i.widget_clock);
        a.b(true);
        arrayList.add(a);
        this.c.add(a);
        com.tsf.shell.f.i.c.g a2 = f.a("com.tsf.shell.widget.message", null);
        a2.e = false;
        a2.b = "";
        a2.d = 5;
        a2.c(b.i.widget_message);
        arrayList.add(a2);
        this.c.add(a2);
        com.tsf.shell.f.i.c.g a3 = f.a("com.tsf.shell.widget.dotsclock", null);
        a3.e = true;
        a3.b = k.class.getName();
        a3.c = "com.tsf.shell.widget.dotsclock";
        a3.d = 5;
        a3.c(b.i.widget_dots_clock);
        a3.f = true;
        a3.b(true);
        arrayList.add(a3);
        this.c.add(a3);
        com.tsf.shell.f.i.c.g a4 = f.a("com.tsf.shell.widget.cubeclock", null);
        a4.e = true;
        a4.b = t.class.getName();
        a4.c = "com.tsf.shell.widget.cubeclock";
        a4.d = 5;
        a4.c(b.i.widget_cubeclock);
        a4.b(true);
        arrayList.add(a4);
        this.c.add(a4);
        com.tsf.shell.f.i.c.g a5 = f.a("com.tsf.shell.widget.calendar", null);
        a5.e = false;
        a5.b = "";
        a5.d = 5;
        a5.c(b.i.widget_calendar);
        arrayList.add(a5);
        this.c.add(a5);
        com.tsf.shell.f.i.c.g a6 = f.a("com.tsf.shell.widget.gallery", null);
        a6.e = false;
        a6.b = "";
        a6.d = 5;
        a6.c(b.i.widget_gallery);
        arrayList.add(a6);
        this.c.add(a6);
        com.tsf.shell.f.i.c.g a7 = f.a("com.tsf.shell.widget.memo", null);
        a7.e = false;
        a7.b = "";
        a7.d = 5;
        a7.c(b.i.widget_memo);
        arrayList.add(a7);
        this.c.add(a7);
        com.tsf.shell.f.i.c.g a8 = f.a("com.tsf.shell.widget.weather", null);
        a8.e = false;
        a8.b = "";
        a8.d = 5;
        a8.c(b.i.widget_weather);
        arrayList.add(a8);
        this.c.add(a8);
        com.tsf.shell.f.i.c.g a9 = f.a("com.tsf.shell.widget.music", null);
        a9.e = false;
        a9.b = "";
        a9.d = 5;
        a9.c(b.i.widget_music);
        arrayList.add(a9);
        this.c.add(a9);
        com.tsf.shell.f.i.c.g k = com.tsf.shell.f.i.b.a.b.k();
        k.e = true;
        k.b = com.tsf.shell.f.i.b.a.b.class.getName();
        k.c = "com.tsf.shell.widget.theme.airship";
        k.a = "";
        k.d = 5;
        k.f = true;
        k.g = 1;
        k.c(b.i.widget_airship);
        arrayList2.add(k);
        this.c.add(k);
        com.tsf.shell.f.i.c.d dVar = new com.tsf.shell.f.i.c.d();
        dVar.e = true;
        dVar.b = com.tsf.shell.f.i.b.c.a.class.getName();
        dVar.c = "com.tsf.shell.widget.floating";
        ((com.tsf.shell.f.i.c.g) dVar).a = "";
        dVar.d = 5;
        dVar.g = 1;
        dVar.c(b.i.widget_flotage);
        arrayList2.add(dVar);
        this.c.add(dVar);
        com.tsf.shell.f.i.c.g a10 = f.a("com.tsf.shell.widget.adornment", null);
        a10.e = false;
        a10.b = "";
        a10.d = 5;
        a10.c(b.i.widget_photo);
        arrayList2.add(a10);
        this.c.add(a10);
        this.a.b.a(arrayList);
        this.a.c.a(arrayList2);
    }

    public void a(com.tsf.shell.f.i.b bVar) {
        a(bVar, true);
    }

    public void a(final ItemInfo itemInfo) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.1
            @Override // java.lang.Runnable
            public void run() {
                itemInfo.unbindGL();
            }
        });
        if (itemInfo.id != -1) {
            com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.2
                @Override // java.lang.Runnable
                public void run() {
                    ShellModel.a.b(itemInfo);
                }
            });
        }
    }

    public void b(final com.tsf.shell.f.i.b bVar) {
        z.a(6, new Runnable() { // from class: com.tsf.shell.manager.r.c.e.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.f.i.c.g a;
                ItemInfo K = bVar.K();
                q.a("szxasasqsq", "removeWidgetFromMine...parent:" + K);
                if (K != null) {
                    e.this.a(K);
                }
                if (!(K instanceof LauncherShortcut3DInfo) && (a = e.this.a(K.packagename)) != null) {
                    a.b(bVar);
                }
                bVar.g();
                bVar.destroy();
            }
        });
    }

    public void a(final com.tsf.shell.f.i.b bVar, final boolean z) {
        com.tsf.shell.f.i.c.g a;
        if (com.censivn.C3DEngine.a.e.l()) {
            ItemInfo K = bVar.K();
            q.a("szxasasqsq", "removeWidget...parent:" + K);
            if (K != null) {
                if (z) {
                    a(K);
                }
                if (!(K instanceof LauncherShortcut3DInfo) && (a = a(K.packagename)) != null) {
                    a.b(bVar);
                }
            }
            bVar.g();
            bVar.destroy();
            return;
        }
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.4
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(bVar, z);
            }
        });
    }

    public void c(com.tsf.shell.f.i.b bVar) {
        bVar.g();
        bVar.destroy();
    }

    public void d(com.tsf.shell.f.i.b bVar) {
        com.tsf.shell.f.f.g d = com.tsf.shell.manager.a.h.d(bVar.K().screen);
        bVar.ac();
        d.a(bVar);
        if (d.ad()) {
            bVar.q_();
        }
    }

    public void a(final ItemInfo itemInfo, final a.AbstractC0146a abstractC0146a) {
        ResolveInfo resolveInfo = null;
        com.tsf.shell.f.i.c.g a = a(itemInfo.packagename);
        if (a != null && a.j()) {
            if (c.a(a, false)) {
                com.tsf.shell.manager.r.c.a.a.a(a, itemInfo, true, abstractC0146a);
                return;
            }
            abstractC0146a.b(itemInfo);
            com.tsf.shell.manager.r.c.a.a.a(itemInfo);
            return;
        }
        PackageManager packageManager = com.censivn.C3DEngine.a.d().getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(itemInfo.packagename);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            resolveInfo = queryIntentActivities.get(0);
        }
        if (resolveInfo != null) {
            com.tsf.shell.manager.a.f fVar = new com.tsf.shell.manager.a.f(resolveInfo);
            com.tsf.shell.manager.bind.a.c().g(fVar);
            final ArrayList arrayList = new ArrayList();
            arrayList.add(fVar);
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.5
                @Override // java.lang.Runnable
                public void run() {
                    e.this.d(arrayList);
                    if (e.this.a(itemInfo.packagename) != null) {
                        e.this.a(itemInfo, abstractC0146a);
                        return;
                    }
                    abstractC0146a.b(itemInfo);
                    com.tsf.shell.manager.r.c.a.a.a(itemInfo);
                }
            });
            return;
        }
        abstractC0146a.b(itemInfo);
        com.tsf.shell.manager.r.c.a.a.a(itemInfo);
    }

    public void d() {
    }

    public void a(final ArrayList<com.tsf.shell.manager.a.f> arrayList) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.6
            @Override // java.lang.Runnable
            public void run() {
                e.this.d(arrayList);
            }
        });
    }

    public void b(final ArrayList<com.tsf.shell.manager.a.f> arrayList) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.7
            @Override // java.lang.Runnable
            public void run() {
                e.this.d(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList<com.tsf.shell.manager.a.f> arrayList) {
        Context d = com.censivn.C3DEngine.a.d();
        Iterator<com.tsf.shell.manager.a.f> it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager.a.f next = it.next();
            try {
                String packageName = next.b.getPackageName();
                String className = next.b.getClassName();
                if (!packageName.equals("com.tsf.shell.widget.alarm")) {
                    Context createPackageContext = d.createPackageContext(packageName, 3);
                    String str = next.e;
                    com.tsf.shell.f.i.c.g a = a(packageName);
                    if (a == null) {
                        a = f.a(createPackageContext, str, packageName, className, next);
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
                        f.a(a, createPackageContext, str, packageName, className, next);
                    }
                    a.b(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void c(final ArrayList<com.tsf.shell.manager.a.f> arrayList) {
        com.tsf.shell.b.a.a("WidgetManager", "bind3dWidgetUpdate size:" + arrayList.size());
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.8
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.manager.a.f fVar = (com.tsf.shell.manager.a.f) it.next();
                    com.tsf.shell.f.i.c.g a = e.this.a(fVar.b.getPackageName());
                    if (a != null && !a.e) {
                        try {
                            String packageName = fVar.b.getPackageName();
                            f.a(a, com.censivn.C3DEngine.a.d().createPackageContext(packageName, 3), fVar.e, packageName, fVar.b.getClassName(), fVar);
                            ArrayList arrayList2 = (ArrayList) a.o().clone();
                            a.m();
                            com.tsf.shell.b.a.a("WidgetManager", "onWidgetUpdate delete old item size:" + arrayList2.size());
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) it2.next();
                                com.tsf.shell.b.a.a("WidgetManager", "onWidgetUpdate delete old item:" + arrayList2);
                                ItemInfo K = bVar.K();
                                e.this.c(bVar);
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

    public void a(final ArrayList<com.tsf.shell.manager.a.f> arrayList, boolean z) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.9
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.f.i.c.g a = e.this.a(((com.tsf.shell.manager.a.f) it.next()).b.getPackageName());
                    if (a != null) {
                        a.b(false);
                        if (!a.j) {
                            e.this.c.remove(a);
                            switch (a.g) {
                                case 0:
                                    e.this.a.b.b(a);
                                    break;
                                case 1:
                                    e.this.a.c.b(a);
                                    break;
                                default:
                                    e.this.a.b.b(a);
                                    break;
                            }
                            a.a();
                        }
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tsf.shell.f.i.c.g a(java.lang.String r4) {
        /*
            r3 = this;
            java.util.ArrayList<com.tsf.shell.f.i.c.g> r0 = r3.c
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            com.tsf.shell.f.i.c.g r0 = (com.tsf.shell.f.i.c.g) r0
            java.lang.String r2 = r0.a
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L22
            java.lang.String r2 = r0.c
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
        L22:
            return r0
        L23:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.manager.r.c.e.a(java.lang.String):com.tsf.shell.f.i.c.g");
    }
}
