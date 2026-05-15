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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        com.tsf.shell.f.i.c.g gVarA = f.a("com.tsf.shell.widget.alarm", null);
        gVarA.e = true;
        gVarA.b = r.class.getName();
        gVarA.c = "com.tsf.shell.widget.alarm";
        gVarA.d = 5;
        gVarA.f = true;
        gVarA.c(b.i.widget_clock);
        gVarA.b(true);
        arrayList.add(gVarA);
        this.c.add(gVarA);
        com.tsf.shell.f.i.c.g gVarA2 = f.a("com.tsf.shell.widget.message", null);
        gVarA2.e = false;
        gVarA2.b = "";
        gVarA2.d = 5;
        gVarA2.c(b.i.widget_message);
        arrayList.add(gVarA2);
        this.c.add(gVarA2);
        com.tsf.shell.f.i.c.g gVarA3 = f.a("com.tsf.shell.widget.dotsclock", null);
        gVarA3.e = true;
        gVarA3.b = k.class.getName();
        gVarA3.c = "com.tsf.shell.widget.dotsclock";
        gVarA3.d = 5;
        gVarA3.c(b.i.widget_dots_clock);
        gVarA3.f = true;
        gVarA3.b(true);
        arrayList.add(gVarA3);
        this.c.add(gVarA3);
        com.tsf.shell.f.i.c.g gVarA4 = f.a("com.tsf.shell.widget.cubeclock", null);
        gVarA4.e = true;
        gVarA4.b = t.class.getName();
        gVarA4.c = "com.tsf.shell.widget.cubeclock";
        gVarA4.d = 5;
        gVarA4.c(b.i.widget_cubeclock);
        gVarA4.b(true);
        arrayList.add(gVarA4);
        this.c.add(gVarA4);
        com.tsf.shell.f.i.c.g gVarA5 = f.a("com.tsf.shell.widget.calendar", null);
        gVarA5.e = false;
        gVarA5.b = "";
        gVarA5.d = 5;
        gVarA5.c(b.i.widget_calendar);
        arrayList.add(gVarA5);
        this.c.add(gVarA5);
        com.tsf.shell.f.i.c.g gVarA6 = f.a("com.tsf.shell.widget.gallery", null);
        gVarA6.e = false;
        gVarA6.b = "";
        gVarA6.d = 5;
        gVarA6.c(b.i.widget_gallery);
        arrayList.add(gVarA6);
        this.c.add(gVarA6);
        com.tsf.shell.f.i.c.g gVarA7 = f.a("com.tsf.shell.widget.memo", null);
        gVarA7.e = false;
        gVarA7.b = "";
        gVarA7.d = 5;
        gVarA7.c(b.i.widget_memo);
        arrayList.add(gVarA7);
        this.c.add(gVarA7);
        com.tsf.shell.f.i.c.g gVarA8 = f.a("com.tsf.shell.widget.weather", null);
        gVarA8.e = false;
        gVarA8.b = "";
        gVarA8.d = 5;
        gVarA8.c(b.i.widget_weather);
        arrayList.add(gVarA8);
        this.c.add(gVarA8);
        com.tsf.shell.f.i.c.g gVarA9 = f.a("com.tsf.shell.widget.music", null);
        gVarA9.e = false;
        gVarA9.b = "";
        gVarA9.d = 5;
        gVarA9.c(b.i.widget_music);
        arrayList.add(gVarA9);
        this.c.add(gVarA9);
        com.tsf.shell.f.i.c.g gVarK = com.tsf.shell.f.i.b.a.b.k();
        gVarK.e = true;
        gVarK.b = com.tsf.shell.f.i.b.a.b.class.getName();
        gVarK.c = "com.tsf.shell.widget.theme.airship";
        gVarK.a = "";
        gVarK.d = 5;
        gVarK.f = true;
        gVarK.g = 1;
        gVarK.c(b.i.widget_airship);
        arrayList2.add(gVarK);
        this.c.add(gVarK);
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
        com.tsf.shell.f.i.c.g gVarA10 = f.a("com.tsf.shell.widget.adornment", null);
        gVarA10.e = false;
        gVarA10.b = "";
        gVarA10.d = 5;
        gVarA10.c(b.i.widget_photo);
        arrayList2.add(gVarA10);
        this.c.add(gVarA10);
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
                com.tsf.shell.f.i.c.g gVarA;
                ItemInfo itemInfoK = bVar.K();
                q.a("szxasasqsq", "removeWidgetFromMine...parent:" + itemInfoK);
                if (itemInfoK != null) {
                    e.this.a(itemInfoK);
                }
                if (!(itemInfoK instanceof LauncherShortcut3DInfo) && (gVarA = e.this.a(itemInfoK.packagename)) != null) {
                    gVarA.b(bVar);
                }
                bVar.g();
                bVar.destroy();
            }
        });
    }

    public void a(final com.tsf.shell.f.i.b bVar, final boolean z) {
        com.tsf.shell.f.i.c.g gVarA;
        if (com.censivn.C3DEngine.a.e.l()) {
            ItemInfo itemInfoK = bVar.K();
            q.a("szxasasqsq", "removeWidget...parent:" + itemInfoK);
            if (itemInfoK != null) {
                if (z) {
                    a(itemInfoK);
                }
                if (!(itemInfoK instanceof LauncherShortcut3DInfo) && (gVarA = a(itemInfoK.packagename)) != null) {
                    gVarA.b(bVar);
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
        com.tsf.shell.f.f.g gVarD = com.tsf.shell.manager.a.h.d(bVar.K().screen);
        bVar.ac();
        gVarD.a(bVar);
        if (gVarD.ad()) {
            bVar.q_();
        }
    }

    public void a(final ItemInfo itemInfo, final a.AbstractC0146a abstractC0146a) {
        ResolveInfo resolveInfo = null;
        com.tsf.shell.f.i.c.g gVarA = a(itemInfo.packagename);
        if (gVarA != null && gVarA.j()) {
            if (c.a(gVarA, false)) {
                com.tsf.shell.manager.r.c.a.a.a(gVarA, itemInfo, true, abstractC0146a);
                return;
            } else {
                abstractC0146a.b(itemInfo);
                com.tsf.shell.manager.r.c.a.a.a(itemInfo);
                return;
            }
        }
        PackageManager packageManager = com.censivn.C3DEngine.a.d().getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(itemInfo.packagename);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
            resolveInfo = listQueryIntentActivities.get(0);
        }
        if (resolveInfo != null) {
            com.tsf.shell.manager.a.f fVar = new com.tsf.shell.manager.a.f(resolveInfo);
            com.tsf.shell.manager.bind.a.c().g(fVar);
            final ArrayList arrayList = new ArrayList();
            arrayList.add(fVar);
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.5
                @Override // java.lang.Runnable
                public void run() {
                    e.this.d((ArrayList<com.tsf.shell.manager.a.f>) arrayList);
                    if (e.this.a(itemInfo.packagename) != null) {
                        e.this.a(itemInfo, abstractC0146a);
                    } else {
                        abstractC0146a.b(itemInfo);
                        com.tsf.shell.manager.r.c.a.a.a(itemInfo);
                    }
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
                e.this.d((ArrayList<com.tsf.shell.manager.a.f>) arrayList);
            }
        });
    }

    public void b(final ArrayList<com.tsf.shell.manager.a.f> arrayList) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.7
            @Override // java.lang.Runnable
            public void run() {
                e.this.d((ArrayList<com.tsf.shell.manager.a.f>) arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList<com.tsf.shell.manager.a.f> arrayList) {
        Context contextD = com.censivn.C3DEngine.a.d();
        for (com.tsf.shell.manager.a.f fVar : arrayList) {
            try {
                String packageName = fVar.b.getPackageName();
                String className = fVar.b.getClassName();
                if (!packageName.equals("com.tsf.shell.widget.alarm")) {
                    Context contextCreatePackageContext = contextD.createPackageContext(packageName, 3);
                    String str = fVar.e;
                    com.tsf.shell.f.i.c.g gVarA = a(packageName);
                    if (gVarA == null) {
                        gVarA = f.a(contextCreatePackageContext, str, packageName, className, fVar);
                        gVarA.j = false;
                        this.c.add(gVarA);
                        switch (gVarA.g) {
                            case 0:
                                this.a.b.a(gVarA);
                                break;
                            case 1:
                                this.a.c.a(gVarA);
                                break;
                            default:
                                this.a.b.a(gVarA);
                                break;
                        }
                    } else {
                        f.a(gVarA, contextCreatePackageContext, str, packageName, className, fVar);
                    }
                    gVarA.b(true);
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
                for (com.tsf.shell.manager.a.f fVar : arrayList) {
                    com.tsf.shell.f.i.c.g gVarA = e.this.a(fVar.b.getPackageName());
                    if (gVarA != null && !gVarA.e) {
                        try {
                            String packageName = fVar.b.getPackageName();
                            f.a(gVarA, com.censivn.C3DEngine.a.d().createPackageContext(packageName, 3), fVar.e, packageName, fVar.b.getClassName(), fVar);
                            ArrayList<com.tsf.shell.f.i.b> arrayList2 = (ArrayList) gVarA.o().clone();
                            gVarA.m();
                            com.tsf.shell.b.a.a("WidgetManager", "onWidgetUpdate delete old item size:" + arrayList2.size());
                            for (com.tsf.shell.f.i.b bVar : arrayList2) {
                                com.tsf.shell.b.a.a("WidgetManager", "onWidgetUpdate delete old item:" + arrayList2);
                                ItemInfo itemInfoK = bVar.K();
                                e.this.c(bVar);
                                com.tsf.shell.manager.r.c.a.a.a(gVarA, itemInfoK, true, null);
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
                    com.tsf.shell.f.i.c.g gVarA = e.this.a(((com.tsf.shell.manager.a.f) it.next()).b.getPackageName());
                    if (gVarA != null) {
                        gVarA.b(false);
                        if (!gVarA.j) {
                            e.this.c.remove(gVarA);
                            switch (gVarA.g) {
                                case 0:
                                    e.this.a.b.b(gVarA);
                                    break;
                                case 1:
                                    e.this.a.c.b(gVarA);
                                    break;
                                default:
                                    e.this.a.b.b(gVarA);
                                    break;
                            }
                            gVarA.a();
                        }
                    }
                }
            }
        });
    }

    public com.tsf.shell.f.i.c.g a(String str) {
        Iterator<com.tsf.shell.f.i.c.g> it = this.c.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.c.g next = it.next();
            if (next.a.equals(str) || next.c.equals(str)) {
                return next;
            }
        }
        return null;
    }
}
