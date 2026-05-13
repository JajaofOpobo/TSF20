package com.tsf.shell.manager.a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.manager.a.c;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b {
    private c c;
    private ArrayList<com.tsf.shell.f.i.b.e.g> a = new ArrayList<>();
    private ArrayList<a> b = new ArrayList<>();
    private c.a d = new c.a() { // from class: com.tsf.shell.manager.a.b.1
        @Override // com.tsf.shell.manager.a.c.a
        public void a() {
            b.this.b();
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void a(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void a(com.tsf.shell.f.i.b.e.g gVar) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void b(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void k_() {
            b.this.b();
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public b(c cVar) {
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
            ArrayList<com.tsf.shell.f.i.b.e.g> d = this.c.d();
            if (d != null) {
                Iterator<com.tsf.shell.f.i.b.e.g> it = d.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.f.i.b.e.g next = it.next();
                    LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) next.K();
                    if (launcherShortcutAppInfo == null || !launcherShortcutAppInfo.isHide) {
                        this.a.add(next);
                    }
                }
                a();
            }
        }
    }

    public int c() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }

    public com.tsf.shell.f.i.b.e.g a(int i) {
        return this.a.get(i);
    }

    public ArrayList<com.tsf.shell.f.i.b.e.g> d() {
        return this.a;
    }
}
