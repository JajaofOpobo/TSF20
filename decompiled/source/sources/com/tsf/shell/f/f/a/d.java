package com.tsf.shell.f.f.a;

import android.content.ComponentName;
import android.os.AsyncTask;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.b;
import com.tsf.shell.plugin.classification.d;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d {
    private ArrayList<b> a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {
        ComponentName a;
        ComponentName[] b;
        String c;

        b() {
        }
    }

    /* loaded from: classes.dex */
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
        Iterator<com.tsf.shell.f.i.b> it = com.tsf.shell.manager.a.w.d().a().iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b next = it.next();
            b bVar = new b();
            if (next instanceof com.tsf.shell.f.i.b.d.b) {
                bVar.c = next.K().title;
                bVar.b = ((com.tsf.shell.f.i.b.d.b) next).aI();
            } else {
                bVar.a = ((com.tsf.shell.f.i.b.e.g) next).bd().b;
            }
            this.a.add(bVar);
        }
    }

    public void b() {
        ArrayList<com.tsf.shell.f.i.b.e.g> d = com.tsf.shell.manager.a.w.a().d();
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayList = new ArrayList<>();
        Iterator<com.tsf.shell.f.i.b.e.g> it = d.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (!((LauncherShortcutAppInfo) next.K()).isHide) {
                arrayList.add(next);
            }
            if (next.K().container != -1) {
                if (next.getMouseEventListener() != null && (next.getMouseEventListener() instanceof com.tsf.shell.f.i.b.d.a)) {
                    ((com.tsf.shell.f.i.b.d.a) next.getMouseEventListener()).a();
                    next.mouseEnabled(true);
                }
                next.visible(true);
                next.alpha(255.0f);
                next.g(1.0f);
                next.scale().setAll(1.0f, 1.0f, 1.0f);
                next.rotation().setAll(0.0f, 0.0f, 0.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        Iterator<b> it2 = this.a.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (next2.b != null) {
                ArrayList<com.tsf.shell.f.i.b.e.b> arrayList2 = new ArrayList<>();
                for (ComponentName componentName : next2.b) {
                    a(componentName, arrayList, arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    com.tsf.shell.manager.a.h.t().a(next2.c, arrayList2, false);
                }
            } else {
                Iterator<com.tsf.shell.f.i.b.e.g> it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        com.tsf.shell.f.i.b.e.g next3 = it3.next();
                        if (next3.bd().b.equals(next2.a)) {
                            com.tsf.shell.manager.a.w.d().a(next3);
                            arrayList.remove(next3);
                            break;
                        }
                    }
                }
            }
        }
        Iterator<com.tsf.shell.f.i.b.e.g> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            com.tsf.shell.manager.a.w.d().a(it4.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
    }

    public AsyncTask a(a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<com.tsf.shell.f.i.b.e.g> it = com.tsf.shell.manager.a.w.a().d().iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (!((LauncherShortcutAppInfo) next.K()).isHide) {
                arrayList.add(next.bd().b.getPackageName());
            }
        }
        return com.tsf.shell.plugin.classification.d.a(com.censivn.C3DEngine.a.d(), arrayList, aVar);
    }

    public void c() {
        ArrayList<com.tsf.shell.f.i.b.e.g> d = com.tsf.shell.manager.a.w.a().d();
        ArrayList arrayList = new ArrayList();
        Iterator<com.tsf.shell.f.i.b.e.g> it = d.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (!((LauncherShortcutAppInfo) next.K()).isHide) {
                arrayList.add(next);
            }
            if (next.K().container != -1) {
                if (next.getMouseEventListener() != null && (next.getMouseEventListener() instanceof com.tsf.shell.f.i.b.d.a)) {
                    ((com.tsf.shell.f.i.b.d.a) next.getMouseEventListener()).a();
                    next.mouseEnabled(true);
                }
                next.visible(true);
                next.alpha(255.0f);
                next.g(1.0f);
                next.scale().setAll(1.0f, 1.0f, 1.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.manager.a.w.d().a((com.tsf.shell.f.i.b.e.g) it2.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
        com.tsf.shell.manager.a.h.t().ao().c();
        com.tsf.shell.manager.a.h.t().ao().d();
    }

    public void a(d.a aVar) {
        d.b[] bVarArr;
        ArrayList<com.tsf.shell.f.i.b.e.g> d = com.tsf.shell.manager.a.w.a().d();
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayList = new ArrayList<>();
        Iterator<com.tsf.shell.f.i.b.e.g> it = d.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (!((LauncherShortcutAppInfo) next.K()).isHide) {
                arrayList.add(next);
            }
            if (next.K().container != -1) {
                if (next.getMouseEventListener() != null && (next.getMouseEventListener() instanceof com.tsf.shell.f.i.b.d.a)) {
                    ((com.tsf.shell.f.i.b.d.a) next.getMouseEventListener()).a();
                    next.mouseEnabled(true);
                }
                next.visible(true);
                next.alpha(255.0f);
                next.g(1.0f);
                next.scale().setAll(1.0f, 1.0f, 1.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        for (d.b bVar : aVar.b) {
            ArrayList<com.tsf.shell.f.i.b.e.b> arrayList2 = new ArrayList<>();
            Iterator<String> it2 = bVar.b.iterator();
            while (it2.hasNext()) {
                a(it2.next(), arrayList, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                com.tsf.shell.manager.a.h.t().a(bVar.a, arrayList2, true);
            }
        }
        ArrayList<com.tsf.shell.f.i.b.e.b> arrayList3 = new ArrayList<>();
        Iterator<com.tsf.shell.f.i.b.e.g> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            com.tsf.shell.f.i.b.e.g next2 = it3.next();
            if (next2.bd().c()) {
                arrayList3.add(next2);
            }
        }
        Iterator<com.tsf.shell.f.i.b.e.b> it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList.remove(it4.next());
        }
        if (!arrayList3.isEmpty()) {
            com.tsf.shell.manager.a.h.t().a(x.c(b.i.text_system), arrayList3, true);
        }
        Iterator<com.tsf.shell.f.i.b.e.g> it5 = arrayList.iterator();
        while (it5.hasNext()) {
            com.tsf.shell.manager.a.w.d().a(it5.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
        com.tsf.shell.manager.a.h.t().ao().c();
        com.tsf.shell.manager.a.h.t().ao().d();
    }

    private void a(String str, ArrayList<com.tsf.shell.f.i.b.e.g> arrayList, ArrayList<com.tsf.shell.f.i.b.e.b> arrayList2) {
        Iterator<com.tsf.shell.f.i.b.e.g> it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (next.bd().b.getPackageName().equals(str)) {
                arrayList2.add(next);
            }
        }
        Iterator<com.tsf.shell.f.i.b.e.b> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.remove(it2.next());
        }
    }

    private void a(ComponentName componentName, ArrayList<com.tsf.shell.f.i.b.e.g> arrayList, ArrayList<com.tsf.shell.f.i.b.e.b> arrayList2) {
        Iterator<com.tsf.shell.f.i.b.e.g> it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g next = it.next();
            if (next.bd().b.equals(componentName)) {
                arrayList2.add(next);
            }
        }
        Iterator<com.tsf.shell.f.i.b.e.b> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.remove(it2.next());
        }
    }

    public void d() {
        a();
    }

    public void e() {
        b();
    }
}
