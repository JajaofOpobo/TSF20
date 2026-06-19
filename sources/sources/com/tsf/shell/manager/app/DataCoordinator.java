package com.tsf.shell.manager.app;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.f.f.a.FolderPage;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DataCoordinator {
    public static String a = "0";
    public static String b = "1";
    public static String c = "2";
    public static String d = "3";
    private StateHub g;
    private AppListModel e = new AppListModel(this);
    private com.tsf.shell.f.f.a.d.DrawerSortManager f = new com.tsf.shell.f.f.a.d.DrawerSortManager(this);
    private FolderManager h = new FolderManager(this);
    private com.tsf.shell.f.f.a.PageItemList i = new com.tsf.shell.f.f.a.PageItemList(this);

    public AppListModel a() {
        return this.e;
    }

    public com.tsf.shell.f.f.a.d.DrawerSortManager b() {
        return this.f;
    }

    public FolderManager c() {
        return this.h;
    }

    public com.tsf.shell.f.f.a.PageItemList d() {
        return this.i;
    }

    public void a(final ArrayList<LauncherAppInfo> arrayList) {
        this.g = com.tsf.shell.manager.app.StateHub.t();
        com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.manager.app.DataCoordinator.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> arrayList2 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.f.i.b.e.DrawerItemVisual gVar = new com.tsf.shell.f.i.b.e.DrawerItemVisual(null, (f) it.next(), true);
                    gVar.setMouseEventListener(e.this.g.f(gVar));
                    arrayList2.add(gVar);
                }
                e.this.e.a(arrayList2);
            }
        });
    }

    public void a(final ArrayList<LauncherAppInfo> arrayList, final boolean z) {
        com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.manager.app.DataCoordinator.2
            @Override // java.lang.Runnable
            public void run() {
                for (LauncherAppInfo fVar : arrayList) {
                    fVar.e();
                    if (e.this.e.a(fVar) == null) {
                        com.tsf.shell.f.i.b.e.DrawerItemVisual gVar = new com.tsf.shell.f.i.b.e.DrawerItemVisual(new LauncherShortcutAppInfo(), fVar, true);
                        gVar.setMouseEventListener(e.this.g.f(gVar));
                        e.this.e.a(gVar, z);
                    }
                }
            }
        });
    }

    public void b(final ArrayList<LauncherAppInfo> arrayList, final boolean z) {
        com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.manager.app.DataCoordinator.3
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    com.tsf.shell.manager.GlobalServiceLocator.l.a(arrayList);
                }
                for (LauncherAppInfo fVar : arrayList) {
                    fVar.d();
                    com.tsf.shell.f.i.b.e.DrawerItemVisual gVarA = e.this.e.a(fVar);
                    if (gVarA != null) {
                        gVarA.g();
                        gVarA.destroy();
                        e.this.e.b(gVarA, z);
                    }
                }
            }
        });
    }

    public void b(final ArrayList<LauncherAppInfo> arrayList) {
        com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.manager.app.DataCoordinator.4
            @Override // java.lang.Runnable
            public void run() {
                for (LauncherAppInfo fVar : arrayList) {
                    fVar.e();
                    e.this.e.a(e.this.e.a(fVar));
                }
            }
        });
    }
}
