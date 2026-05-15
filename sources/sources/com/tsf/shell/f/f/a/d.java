package com.tsf.shell.f.f.a;

import android.content.ComponentName;
import android.os.AsyncTask;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.b;
import com.tsf.shell.plugin.classification.d;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private ArrayList<b> a = new ArrayList<>();

    class b {
        ComponentName a;
        ComponentName[] b;
        String c;

        b() {
        }
    }

    public static class a implements d.InterfaceC0151d {
        @Override // com.tsf.shell.plugin.classification.d.InterfaceC0151d
        public void a(d.a aVar) {
        }

        @Override // com.tsf.shell.plugin.classification.d.InterfaceC0151d
        public void a() {
        }
    }

    public void a() {
        this.a.clear();
        for (com.tsf.shell.f.i.b bVar : com.tsf.shell.manager.a.w.d().a()) {
            b bVar2 = new b();
            if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
                bVar2.c = bVar.K().title;
                bVar2.b = ((com.tsf.shell.f.i.b.d.b) bVar).aI();
            } else {
                bVar2.a = ((com.tsf.shell.f.i.b.e.g) bVar).bd().b;
            }
            this.a.add(bVar2);
        }
    }

    public void b() {
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayListD = com.tsf.shell.manager.a.w.a().d();
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayList = new ArrayList<>();
        for (com.tsf.shell.f.i.b.e.g gVar : arrayListD) {
            if (!((LauncherShortcutAppInfo) gVar.K()).isHide) {
                arrayList.add(gVar);
            }
            if (gVar.K().container != -1) {
                if (gVar.getMouseEventListener() != null && (gVar.getMouseEventListener() instanceof com.tsf.shell.f.i.b.d.a)) {
                    ((com.tsf.shell.f.i.b.d.a) gVar.getMouseEventListener()).a();
                    gVar.mouseEnabled(true);
                }
                gVar.visible(true);
                gVar.alpha(255.0f);
                gVar.g(1.0f);
                gVar.scale().setAll(1.0f, 1.0f, 1.0f);
                gVar.rotation().setAll(0.0f, 0.0f, 0.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        for (b bVar : this.a) {
            if (bVar.b != null) {
                ArrayList<com.tsf.shell.f.i.b.e.b> arrayList2 = new ArrayList<>();
                for (ComponentName componentName : bVar.b) {
                    a(componentName, arrayList, arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    com.tsf.shell.manager.a.h.t().a(bVar.c, arrayList2, false);
                }
            } else {
                Iterator<com.tsf.shell.f.i.b.e.g> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.tsf.shell.f.i.b.e.g next = it.next();
                        if (next.bd().b.equals(bVar.a)) {
                            com.tsf.shell.manager.a.w.d().a(next);
                            arrayList.remove(next);
                            break;
                        }
                    }
                }
            }
        }
        Iterator<com.tsf.shell.f.i.b.e.g> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.manager.a.w.d().a(it2.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
    }

    public AsyncTask a(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (com.tsf.shell.f.i.b.e.g gVar : com.tsf.shell.manager.a.w.a().d()) {
            if (!((LauncherShortcutAppInfo) gVar.K()).isHide) {
                arrayList.add(gVar.bd().b.getPackageName());
            }
        }
        return com.tsf.shell.plugin.classification.d.a(com.censivn.C3DEngine.a.d(), arrayList, aVar);
    }

    public void c() {
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayListD = com.tsf.shell.manager.a.w.a().d();
        ArrayList arrayList = new ArrayList();
        for (com.tsf.shell.f.i.b.e.g gVar : arrayListD) {
            if (!((LauncherShortcutAppInfo) gVar.K()).isHide) {
                arrayList.add(gVar);
            }
            if (gVar.K().container != -1) {
                if (gVar.getMouseEventListener() != null && (gVar.getMouseEventListener() instanceof com.tsf.shell.f.i.b.d.a)) {
                    ((com.tsf.shell.f.i.b.d.a) gVar.getMouseEventListener()).a();
                    gVar.mouseEnabled(true);
                }
                gVar.visible(true);
                gVar.alpha(255.0f);
                gVar.g(1.0f);
                gVar.scale().setAll(1.0f, 1.0f, 1.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager.a.w.d().a((com.tsf.shell.f.i.b.e.g) it.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
        com.tsf.shell.manager.a.h.t().ao().c();
        com.tsf.shell.manager.a.h.t().ao().d();
    }

    public void a(d.a aVar) {
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayListD = com.tsf.shell.manager.a.w.a().d();
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayList = new ArrayList<>();
        for (com.tsf.shell.f.i.b.e.g gVar : arrayListD) {
            if (!((LauncherShortcutAppInfo) gVar.K()).isHide) {
                arrayList.add(gVar);
            }
            if (gVar.K().container != -1) {
                if (gVar.getMouseEventListener() != null && (gVar.getMouseEventListener() instanceof com.tsf.shell.f.i.b.d.a)) {
                    ((com.tsf.shell.f.i.b.d.a) gVar.getMouseEventListener()).a();
                    gVar.mouseEnabled(true);
                }
                gVar.visible(true);
                gVar.alpha(255.0f);
                gVar.g(1.0f);
                gVar.scale().setAll(1.0f, 1.0f, 1.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        for (d.b bVar : aVar.b) {
            ArrayList<com.tsf.shell.f.i.b.e.b> arrayList2 = new ArrayList<>();
            Iterator<String> it = bVar.b.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                com.tsf.shell.manager.a.h.t().a(bVar.a, arrayList2, true);
            }
        }
        ArrayList<com.tsf.shell.f.i.b.e.b> arrayList3 = new ArrayList<>();
        for (com.tsf.shell.f.i.b.e.g gVar2 : arrayList) {
            if (gVar2.bd().c()) {
                arrayList3.add(gVar2);
            }
        }
        Iterator<com.tsf.shell.f.i.b.e.b> it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList.remove(it2.next());
        }
        if (!arrayList3.isEmpty()) {
            com.tsf.shell.manager.a.h.t().a(x.c(b.i.text_system), arrayList3, true);
        }
        Iterator<com.tsf.shell.f.i.b.e.g> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            com.tsf.shell.manager.a.w.d().a(it3.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
        com.tsf.shell.manager.a.h.t().ao().c();
        com.tsf.shell.manager.a.h.t().ao().d();
    }

    private void a(String str, ArrayList<com.tsf.shell.f.i.b.e.g> arrayList, ArrayList<com.tsf.shell.f.i.b.e.b> arrayList2) {
        for (com.tsf.shell.f.i.b.e.g gVar : arrayList) {
            if (gVar.bd().b.getPackageName().equals(str)) {
                arrayList2.add(gVar);
            }
        }
        Iterator<com.tsf.shell.f.i.b.e.b> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
    }

    private void a(ComponentName componentName, ArrayList<com.tsf.shell.f.i.b.e.g> arrayList, ArrayList<com.tsf.shell.f.i.b.e.b> arrayList2) {
        for (com.tsf.shell.f.i.b.e.g gVar : arrayList) {
            if (gVar.bd().b.equals(componentName)) {
                arrayList2.add(gVar);
            }
        }
        Iterator<com.tsf.shell.f.i.b.e.b> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
    }

    public void d() {
        a();
    }

    public void e() {
        b();
    }
}
