package com.tsf.shell.manager.a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b {
    private d c;
    private ArrayList a = new ArrayList();
    private ArrayList b = new ArrayList();
    private e d = new e() { // from class: com.tsf.shell.manager.a.b.1
        @Override // com.tsf.shell.manager.a.e
        public void a() {
            b.this.b();
        }

        @Override // com.tsf.shell.manager.a.e
        public void a(com.tsf.shell.e.i.b.e.i iVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.a.e
        public void a(com.tsf.shell.e.i.b.e.i iVar) {
        }

        @Override // com.tsf.shell.manager.a.e
        public void b(com.tsf.shell.e.i.b.e.i iVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.a.e
        public void i_() {
            b.this.b();
        }
    };

    public b(d dVar) {
        this.c = dVar;
        dVar.a(this.d);
    }

    public void a(c cVar) {
        if (!this.b.contains(cVar)) {
            this.b.add(cVar);
        }
    }

    public void b(c cVar) {
        this.b.remove(cVar);
    }

    public void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
    }

    public void b() {
        if (this.b.size() > 0) {
            this.a.clear();
            ArrayList d = this.c.d();
            if (d != null) {
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
                    LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) iVar.K();
                    if (launcherShortcutAppInfo == null || !launcherShortcutAppInfo.isHide) {
                        this.a.add(iVar);
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

    public com.tsf.shell.e.i.b.e.i a(int i) {
        return (com.tsf.shell.e.i.b.e.i) this.a.get(i);
    }

    public ArrayList d() {
        return this.a;
    }
}
