package com.tsf.shell.e.f.a;

import android.content.ComponentName;
import android.os.AsyncTask;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {
    private ArrayList a = new ArrayList();

    public void a() {
        this.a.clear();
        Iterator it = com.tsf.shell.manager.a.w.d().a().iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it.next();
            g gVar = new g(this);
            if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
                gVar.c = cVar.K().title;
                gVar.b = ((com.tsf.shell.e.i.b.d.b) cVar).aI();
            } else {
                gVar.a = ((com.tsf.shell.e.i.b.e.i) cVar).bd().b;
            }
            this.a.add(gVar);
        }
    }

    public void b() {
        ArrayList d = com.tsf.shell.manager.a.w.a().d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (!((LauncherShortcutAppInfo) iVar.K()).isHide) {
                arrayList.add(iVar);
            }
            if (iVar.K().container != -1) {
                if (iVar.getMouseEventListener() != null && (iVar.getMouseEventListener() instanceof com.tsf.shell.e.i.b.d.a)) {
                    ((com.tsf.shell.e.i.b.d.a) iVar.getMouseEventListener()).a();
                    iVar.mouseEnabled(true);
                }
                iVar.visible(true);
                iVar.alpha(255.0f);
                iVar.g(1.0f);
                iVar.scale().setAll(1.0f, 1.0f, 1.0f);
                iVar.rotation().setAll(0.0f, 0.0f, 0.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            g gVar = (g) it2.next();
            if (gVar.b != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ComponentName componentName : gVar.b) {
                    a(componentName, arrayList, arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    com.tsf.shell.manager.a.h.t().a(gVar.c, arrayList2, false);
                }
            } else {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        com.tsf.shell.e.i.b.e.i iVar2 = (com.tsf.shell.e.i.b.e.i) it3.next();
                        if (iVar2.bd().b.equals(gVar.a)) {
                            com.tsf.shell.manager.a.w.d().a(iVar2);
                            arrayList.remove(iVar2);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            com.tsf.shell.manager.a.w.d().a((com.tsf.shell.e.i.b.e.i) it4.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
    }

    public AsyncTask a(f fVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = com.tsf.shell.manager.a.w.a().d().iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (!((LauncherShortcutAppInfo) iVar.K()).isHide) {
                arrayList.add(iVar.bd().b.getPackageName());
            }
        }
        return com.tsf.shell.plugin.classification.d.a(com.censivn.C3DEngine.a.d(), arrayList, fVar);
    }

    public void c() {
        ArrayList d = com.tsf.shell.manager.a.w.a().d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (!((LauncherShortcutAppInfo) iVar.K()).isHide) {
                arrayList.add(iVar);
            }
            if (iVar.K().container != -1) {
                if (iVar.getMouseEventListener() != null && (iVar.getMouseEventListener() instanceof com.tsf.shell.e.i.b.d.a)) {
                    ((com.tsf.shell.e.i.b.d.a) iVar.getMouseEventListener()).a();
                    iVar.mouseEnabled(true);
                }
                iVar.visible(true);
                iVar.alpha(255.0f);
                iVar.g(1.0f);
                iVar.scale().setAll(1.0f, 1.0f, 1.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.manager.a.w.d().a((com.tsf.shell.e.i.b.e.i) it2.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
        com.tsf.shell.manager.a.h.t().ao().c();
        com.tsf.shell.manager.a.h.t().ao().d();
    }

    public void a(com.tsf.shell.plugin.classification.e eVar) {
        ArrayList d = com.tsf.shell.manager.a.w.a().d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (!((LauncherShortcutAppInfo) iVar.K()).isHide) {
                arrayList.add(iVar);
            }
            if (iVar.K().container != -1) {
                if (iVar.getMouseEventListener() != null && (iVar.getMouseEventListener() instanceof com.tsf.shell.e.i.b.d.a)) {
                    ((com.tsf.shell.e.i.b.d.a) iVar.getMouseEventListener()).a();
                    iVar.mouseEnabled(true);
                }
                iVar.visible(true);
                iVar.alpha(255.0f);
                iVar.g(1.0f);
                iVar.scale().setAll(1.0f, 1.0f, 1.0f);
            }
        }
        com.tsf.shell.manager.a.w.d().b();
        for (com.tsf.shell.plugin.classification.f fVar : eVar.b) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = fVar.b.iterator();
            while (it2.hasNext()) {
                a((String) it2.next(), arrayList, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                com.tsf.shell.manager.a.h.t().a(fVar.a, arrayList2, true);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar2 = (com.tsf.shell.e.i.b.e.i) it3.next();
            if (iVar2.bd().c()) {
                arrayList3.add(iVar2);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList.remove((com.tsf.shell.e.i.b.e.b) it4.next());
        }
        if (!arrayList3.isEmpty()) {
            com.tsf.shell.manager.a.h.t().a(x.c(R.string.text_system), arrayList3, true);
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            com.tsf.shell.manager.a.w.d().a((com.tsf.shell.e.i.b.e.i) it5.next());
        }
        com.tsf.shell.manager.a.h.t().aD();
        com.tsf.shell.manager.a.h.t().ao().c();
        com.tsf.shell.manager.a.h.t().ao().d();
    }

    private void a(String str, ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (iVar.bd().b.getPackageName().equals(str)) {
                arrayList2.add(iVar);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.remove((com.tsf.shell.e.i.b.e.b) it2.next());
        }
    }

    private void a(ComponentName componentName, ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (iVar.bd().b.equals(componentName)) {
                arrayList2.add(iVar);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.remove((com.tsf.shell.e.i.b.e.b) it2.next());
        }
    }

    public void d() {
        a();
    }

    public void e() {
        b();
    }
}
