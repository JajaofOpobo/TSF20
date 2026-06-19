package com.tsf.shell.manager.app;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.Home;
import com.tsf.shell.manager.app.AppListModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ObserverManager {
    private AppListModel c;
    private ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> a = new ArrayList<>();
    private ArrayList<a> b = new ArrayList<>();
    private c.a d = new c.a() { // from class: com.tsf.shell.manager.app.ObserverManager.1
        @Override // com.tsf.shell.manager.app.AppListModel.a
        public void a() {
            b.this.b();
        }

        @Override // com.tsf.shell.manager.app.AppListModel.a
        public void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.app.AppListModel.a
        public void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar) {
        }

        @Override // com.tsf.shell.manager.app.AppListModel.a
        public void b(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.app.AppListModel.a
        public void k_() {
            b.this.b();
        }
    };

    public interface a {
        void a();
    }

    public ObserverManager(AppListModel cVar) {
        this.c = cVar;
        cVar.a(this.d);
    }

    public void a(a aVar) {
        if (!this.b.contains(aVar)) {
            this.b.add(aVar);
        }
    }

    public void b(a aVar) {
        this.b.remove(aVar);
    }

    public void a() {
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void b() {
        if (this.b.size() > 0) {
            this.a.clear();
            ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> arrayListD = this.c.d();
            if (arrayListD != null) {
                for (com.tsf.shell.f.i.b.e.DrawerItemVisual gVar : arrayListD) {
                    LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) gVar.K();
                    if (launcherShortcutAppInfo == null || !launcherShortcutAppInfo.isHide) {
                        this.a.add(gVar);
                    }
                }
                a();
            }
        }
    }

    public static boolean c() {
        return false;
    }

    public com.tsf.shell.f.i.b.e.DrawerItemVisual a(int i) {
        return this.a.get(i);
    }

    public ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> d_() {
        return this.a;
    }

    public static void d() {}
    public static void e() {}

    public static boolean a(com.tsf.shell.f.i.b.d.FolderShortcutItem bVar) { return false; }
    public static void b(Home home) {}
    public static void c(Home home) {}
    public static void a(com.tsf.shell.manager.n.ToastOverlayController aVar) {}
    public static void a(boolean z, boolean z2, boolean z3) {}
    public static void b(com.tsf.shell.manager.n.ToastOverlayController aVar) {}
    public static void a(com.tsf.shell.f.i.b.d.FolderItemPositioner jVar) {}
}
