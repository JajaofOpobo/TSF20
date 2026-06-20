package com.tsf.shell.manager.r.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.b;
import com.tsf.extend.base.j.LogUtils;
import com.tsf.extend.base.j.HandlerUtils;
import com.tsf.shell.ShellBackgroundRenderer;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.r.c.a.WidgetInstantiator;
import com.tsf.shell.widget.a.WidgetConstants;
import com.tsf.shell.widget.alarm.AlarmClickEvent;
import com.tsf.shell.widget.cubeclock.CubeClockData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetRegistryManager {
    public com.tsf.shell.manager.r.b.WidgetMenuPanel a;
    private b b;
    private ArrayList<com.tsf.shell.f.i.c.ItemGroupBase> c;
    private com.tsf.shell.f.i.c.ItemGroupBase d;

    public WidgetRegistryManager() {
        com.tsf.shell.manager.r.c.a.WidgetInstantiator.a(this);
        this.a = new com.tsf.shell.manager.r.b.WidgetMenuPanel();
        this.c = new ArrayList<>();
        com.tsf.shell.manager.r.c.a.WidgetInstantiator.a(getClass().getClassLoader());
        c.a();
        WidgetRegistryManager();
    }

    public void a() {
        this.b = new WidgetFeatureConfig();
    }

    public b b() {
        return this.b;
    }

    public void c() {
    }

    private void e() {
        WidgetRegistryManager();
    }

    public static String a(c.b bVar) {
        return bVar.o.equals("com.tsf.shell.widget.alarm") ? com.censivn.C3DEngine.a.GestureDetector() : bVar.o;
    }

    private void f() {
        ArrayList<com.tsf.shell.f.i.c.ItemLabelProvider> arrayList = new ArrayList<>();
        ArrayList<com.tsf.shell.f.i.c.ItemLabelProvider> arrayList2 = new ArrayList<>();
        com.tsf.shell.f.i.c.FolderItemGroup cVar = new com.tsf.shell.f.i.c.FolderItemGroup();
        this.d = cVar;
        cVar.e = true;
        cVar.b = com.tsf.shell.f.i.b.d.FolderShortcutItem.class.getName();
        ((com.tsf.shell.f.i.c.ItemGroupBase) cVar).a = "";
        cVar.d = 1;
        cVar.c(b.i.widget_folder);
        arrayList.add(this.d);
        this.c.add(cVar);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA = f.a("com.tsf.shell.widget.alarm", null);
        gVarA.e = true;
        gVarA.b = r.class.getName();
        gVarA.c = "com.tsf.shell.widget.alarm";
        gVarA.d = 5;
        gVarA.f = true;
        gVarA.c(b.i.widget_clock);
        gVarA.b(true);
        arrayList.add(gVarA);
        this.c.add(gVarA);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA2 = f.a("com.tsf.shell.widget.message", null);
        gVarA2.e = false;
        gVarA2.b = "";
        gVarA2.d = 5;
        gVarA2.c(b.i.widget_message);
        arrayList.add(gVarA2);
        this.c.add(gVarA2);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA3 = f.a("com.tsf.shell.widget.dotsclock", null);
        gVarA3.e = true;
        gVarA3.b = k.class.getName();
        gVarA3.c = "com.tsf.shell.widget.dotsclock";
        gVarA3.d = 5;
        gVarA3.c(b.i.widget_dots_clock);
        gVarA3.f = true;
        gVarA3.b(true);
        arrayList.add(gVarA3);
        this.c.add(gVarA3);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA4 = f.a("com.tsf.shell.widget.cubeclock", null);
        gVarA4.e = true;
        gVarA4.b = t.class.getName();
        gVarA4.c = "com.tsf.shell.widget.cubeclock";
        gVarA4.d = 5;
        gVarA4.c(b.i.widget_cubeclock);
        gVarA4.b(true);
        arrayList.add(gVarA4);
        this.c.add(gVarA4);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA5 = f.a("com.tsf.shell.widget.calendar", null);
        gVarA5.e = false;
        gVarA5.b = "";
        gVarA5.d = 5;
        gVarA5.c(b.i.widget_calendar);
        arrayList.add(gVarA5);
        this.c.add(gVarA5);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA6 = f.a("com.tsf.shell.widget.gallery", null);
        gVarA6.e = false;
        gVarA6.b = "";
        gVarA6.d = 5;
        gVarA6.c(b.i.widget_gallery);
        arrayList.add(gVarA6);
        this.c.add(gVarA6);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA7 = f.a("com.tsf.shell.widget.memo", null);
        gVarA7.e = false;
        gVarA7.b = "";
        gVarA7.d = 5;
        gVarA7.c(b.i.widget_memo);
        arrayList.add(gVarA7);
        this.c.add(gVarA7);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA8 = f.a("com.tsf.shell.widget.weather", null);
        gVarA8.e = false;
        gVarA8.b = "";
        gVarA8.d = 5;
        gVarA8.c(b.i.widget_weather);
        arrayList.add(gVarA8);
        this.c.add(gVarA8);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA9 = f.a("com.tsf.shell.widget.music", null);
        gVarA9.e = false;
        gVarA9.b = "";
        gVarA9.d = 5;
        gVarA9.c(b.i.widget_music);
        arrayList.add(gVarA9);
        this.c.add(gVarA9);
        com.tsf.shell.f.i.c.ItemGroupBase gVarK = com.tsf.shell.f.i.b.a.ItemContainerPageItem.k();
        gVarK.e = true;
        gVarK.b = com.tsf.shell.f.i.b.a.ItemContainerPageItem.class.getName();
        gVarK.c = "com.tsf.shell.widget.theme.airship";
        gVarK.a = "";
        gVarK.d = 5;
        gVarK.f = true;
        gVarK.g = 1;
        gVarK.c(b.i.widget_airship);
        arrayList2.add(gVarK);
        this.c.add(gVarK);
        com.tsf.shell.f.i.c.PendingItemGroup dVar = new com.tsf.shell.f.i.c.PendingItemGroup();
        dVar.e = true;
        dVar.b = com.tsf.shell.f.i.b.c.ItemDataConfig.class.getName();
        dVar.c = "com.tsf.shell.widget.floating";
        ((com.tsf.shell.f.i.c.ItemGroupBase) dVar).a = "";
        dVar.d = 5;
        dVar.g = 1;
        dVar.c(b.i.widget_flotage);
        arrayList2.add(dVar);
        this.c.add(dVar);
        com.tsf.shell.f.i.c.ItemGroupBase gVarA10 = f.a("com.tsf.shell.widget.adornment", null);
        gVarA10.e = false;
        gVarA10.b = "";
        gVarA10.d = 5;
        gVarA10.c(b.i.widget_photo);
        arrayList2.add(gVarA10);
        this.c.add(gVarA10);
        this.a.b.a(arrayList);
        this.a.c.a(arrayList2);
    }

    public void a(com.tsf.shell.f.i.PageItem bVar) {
        a(bVar, true);
    }

    public void a(final ItemInfo itemInfo) {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.1
            @Override // java.lang.Runnable
            public void run() {
                itemInfo.unbindGL();
            }
        });
        if (itemInfo.id != -1) {
            com.censivn.C3DEngine.C3DEngine.a().e(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.2
                @Override // java.lang.Runnable
                public void run() {
                    ShellModel.a.b(itemInfo);
                }
            });
        }
    }

    public void b(final com.tsf.shell.f.i.PageItem bVar) {
        z.a(6, new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.f.i.c.ItemGroupBase gVarA;
                ItemInfo itemInfoK = bVar.K();
                q.a("szxasasqsq", "removeWidgetFromMine...parent:" + itemInfoK);
                if (itemInfoK != null) {
                    WidgetRegistryManager.this.a(itemInfoK);
                }
                if (!(itemInfoK instanceof LauncherShortcut3DInfo) && (gVarA = WidgetRegistryManager.this.a(itemInfoK.packagename)) != null) {
                    gVarA.b(bVar);
                }
                bVar.g();
                bVar.destroy();
            }
        });
    }

    public void a(final com.tsf.shell.f.i.PageItem bVar, final boolean z) {
        com.tsf.shell.f.i.c.ItemGroupBase gVarA;
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
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.4
            @Override // java.lang.Runnable
            public void run() {
                WidgetRegistryManager.this.a(bVar, z);
            }
        });
    }

    public void c(com.tsf.shell.f.i.PageItem bVar) {
        bVar.g();
        bVar.destroy();
    }

    public void d(com.tsf.shell.f.i.PageItem bVar) {
        com.tsf.shell.f.f.WorkspacePage gVarD = com.tsf.shell.manager.app.StateHub.d(bVar.K().screen);
        bVar.ac();
        gVarD.a(bVar);
        if (gVarD.ad()) {
            bVar.q_();
        }
    }

    public void a(final ItemInfo itemInfo, final a.AbstractC0146a abstractC0146a) {
        ResolveInfo resolveInfo = null;
        com.tsf.shell.f.i.c.ItemGroupBase gVarA = a(itemInfo.packagename);
        if (gVarA != null && gVarA.j()) {
            if (c.a(gVarA, false)) {
                com.tsf.shell.manager.r.c.a.WidgetInstantiator.a(gVarA, itemInfo, true, abstractC0146a);
                return;
            } else {
                abstractC0146a.b(itemInfo);
                com.tsf.shell.manager.r.c.a.WidgetInstantiator.a(itemInfo);
                return;
            }
        }
        PackageManager packageManager = com.censivn.C3DEngine.C3DEngine.d().getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(itemInfo.packagename);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
            resolveInfo = listQueryIntentActivities.get(0);
        }
        if (resolveInfo != null) {
            com.tsf.shell.manager.app.LauncherAppInfo fVar = new com.tsf.shell.manager.app.LauncherAppInfo(resolveInfo);
            com.tsf.shell.manager.bind.ShellBindContext.c().g(fVar);
            final ArrayList arrayList = new ArrayList();
            arrayList.add(fVar);
            com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.5
                @Override // java.lang.Runnable
                public void run() {
                    WidgetRegistryManager.this.d((ArrayList<com.tsf.shell.manager.app.LauncherAppInfo>) arrayList);
                    if (WidgetRegistryManager.this.a(itemInfo.packagename) != null) {
                        WidgetRegistryManager.this.a(itemInfo, abstractC0146a);
                    } else {
                        abstractC0146a.b(itemInfo);
                        com.tsf.shell.manager.r.c.a.WidgetInstantiator.a(itemInfo);
                    }
                }
            });
            return;
        }
        abstractC0146a.b(itemInfo);
        com.tsf.shell.manager.r.c.a.WidgetInstantiator.a(itemInfo);
    }

    public void d() {
    }

    public void a(final ArrayList<com.tsf.shell.manager.app.LauncherAppInfo> arrayList) {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.6
            @Override // java.lang.Runnable
            public void run() {
                WidgetRegistryManager.this.d((ArrayList<com.tsf.shell.manager.app.LauncherAppInfo>) arrayList);
            }
        });
    }

    public void b(final ArrayList<com.tsf.shell.manager.app.LauncherAppInfo> arrayList) {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.7
            @Override // java.lang.Runnable
            public void run() {
                WidgetRegistryManager.this.d((ArrayList<com.tsf.shell.manager.app.LauncherAppInfo>) arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList<com.tsf.shell.manager.app.LauncherAppInfo> arrayList) {
        Context contextD = com.censivn.C3DEngine.C3DEngine.d();
        for (com.tsf.shell.manager.app.LauncherAppInfo fVar : arrayList) {
            try {
                String packageName = fVar.b.getPackageName();
                String className = fVar.b.getClassName();
                if (!packageName.equals("com.tsf.shell.widget.alarm")) {
                    Context contextCreatePackageContext = contextD.createPackageContext(packageName, 3);
                    String str = fVar.e;
                    com.tsf.shell.f.i.c.ItemGroupBase gVarA = a(packageName);
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

    public void c(final ArrayList<com.tsf.shell.manager.app.LauncherAppInfo> arrayList) {
        com.tsf.shell.b.ShellBridge.a("WidgetManager", "bind3dWidgetUpdate size:" + arrayList.size());
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.8
            @Override // java.lang.Runnable
            public void run() {
                for (com.tsf.shell.manager.app.LauncherAppInfo fVar : arrayList) {
                    com.tsf.shell.f.i.c.ItemGroupBase gVarA = WidgetRegistryManager.this.a(fVar.b.getPackageName());
                    if (gVarA != null && !gVarA.e) {
                        try {
                            String packageName = fVar.b.getPackageName();
                            f.a(gVarA, com.censivn.C3DEngine.C3DEngine.d().createPackageContext(packageName, 3), fVar.e, packageName, fVar.b.getClassName(), fVar);
                            ArrayList<com.tsf.shell.f.i.PageItem> arrayList2 = (ArrayList) gVarA.o().clone();
                            gVarA.m();
                            com.tsf.shell.b.ShellBridge.a("WidgetManager", "onWidgetUpdate delete old item size:" + arrayList2.size());
                            for (com.tsf.shell.f.i.PageItem bVar : arrayList2) {
                                com.tsf.shell.b.ShellBridge.a("WidgetManager", "onWidgetUpdate delete old item:" + arrayList2);
                                ItemInfo itemInfoK = bVar.K();
                                WidgetRegistryManager.this.c(bVar);
                                com.tsf.shell.manager.r.c.a.WidgetInstantiator.a(gVarA, itemInfoK, true, null);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    public void a(final ArrayList<com.tsf.shell.manager.app.LauncherAppInfo> arrayList, boolean z) {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetRegistryManager.9
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.f.i.c.ItemGroupBase gVarA = WidgetRegistryManager.this.a(((com.tsf.shell.manager.app.LauncherAppInfo) it.next()).b.getPackageName());
                    if (gVarA != null) {
                        gVarA.b(false);
                        if (!gVarA.j) {
                            WidgetRegistryManager.this.c.remove(gVarA);
                            switch (gVarA.g) {
                                case 0:
                                    WidgetRegistryManager.this.a.b.b(gVarA);
                                    break;
                                case 1:
                                    WidgetRegistryManager.this.a.c.b(gVarA);
                                    break;
                                default:
                                    WidgetRegistryManager.this.a.b.b(gVarA);
                                    break;
                            }
                            gVarA.a();
                        }
                    }
                }
            }
        });
    }

    public com.tsf.shell.f.i.c.ItemGroupBase a(String str) {
        Iterator<com.tsf.shell.f.i.c.ItemGroupBase> it = this.c.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.c.ItemGroupBase next = it.next();
            if (next.a.equals(str) || next.c.equals(str)) {
                return next;
            }
        }
        return null;
    }
}
