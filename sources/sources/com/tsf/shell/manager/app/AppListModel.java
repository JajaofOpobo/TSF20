package com.tsf.shell.manager.app;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppListModel {
    private ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> b;
    private DataCoordinator d;
    private WidgetPanelController e = new WidgetPanelController();
    private ArrayList<a> c = new ArrayList<>();
    public ObserverManager a = new ObserverManager(this);

    public interface a {
        void a();

        void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar);

        void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z);

        void b(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z);

        void k_();
    }

    public AppListModel(DataCoordinator eVar) {
        this.d = eVar;
    }

    public WidgetPanelController a() {
        return this.e;
    }

    public boolean b() {
        return this.b != null;
    }

    protected void a(ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> arrayList) {
        this.b = arrayList;
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().k_();
        }
    }

    public void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z) {
        a(gVar, z, true);
    }

    public void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z, boolean z2) {
        this.b.add(gVar);
        if (z2) {
            a();
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(gVar, z);
            }
        }
    }

    protected boolean b(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z) {
        boolean zRemove = this.b.remove(gVar);
        a();
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b(gVar, z);
        }
        return zRemove;
    }

    public void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar) {
        a();
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(gVar);
        }
    }

    public void c() {
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public com.tsf.shell.f.i.b.e.DrawerItemVisual a(ComponentName componentName) {
        for (com.tsf.shell.f.i.b.e.DrawerItemVisual gVar : this.b) {
            if (gVar.bd().b.equals(componentName)) {
                return gVar;
            }
        }
        return null;
    }

    public com.tsf.shell.f.i.b.e.DrawerItemVisual a(int i) {
        for (com.tsf.shell.f.i.b.e.DrawerItemVisual gVar : this.b) {
            if (gVar.K() != null && gVar.K().id == i) {
                return gVar;
            }
        }
        return null;
    }

    public com.tsf.shell.f.i.b.e.DrawerItemVisual a(f fVar) {
        for (com.tsf.shell.f.i.b.e.DrawerItemVisual gVar : this.b) {
            if (gVar.bd() == fVar) {
                return gVar;
            }
        }
        return null;
    }

    public ArrayList<com.tsf.shell.f.i.b.e.DrawerItemVisual> d() {
        return this.b;
    }

    public void a(a aVar) {
        if (!this.c.contains(aVar)) {
            this.c.add(aVar);
        }
    }

    public void b(a aVar) {
        this.c.remove(aVar);
    }
}
