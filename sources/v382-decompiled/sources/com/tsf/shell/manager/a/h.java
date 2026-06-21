package com.tsf.shell.manager.a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.e.f.a.m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {
    public static String a = "0";
    public static String b = "1";
    public static String c = "2";
    public static String d = "3";
    private m g;
    private d e = new d(this);
    private com.tsf.shell.e.f.a.d.a f = new com.tsf.shell.e.f.a.d.a(this);
    private f h = new f(this);
    private com.tsf.shell.e.f.a.c i = new com.tsf.shell.e.f.a.c(this);

    public d a() {
        return this.e;
    }

    public com.tsf.shell.e.f.a.d.a b() {
        return this.f;
    }

    public f c() {
        return this.h;
    }

    public com.tsf.shell.e.f.a.c d() {
        return this.i;
    }

    public void a(final ArrayList arrayList) {
        this.g = com.tsf.shell.manager.a.h.t();
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.h.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.e.i.b.e.i iVar = new com.tsf.shell.e.i.b.e.i(null, (i) it.next(), true);
                    iVar.setMouseEventListener(h.this.g.f(iVar));
                    arrayList2.add(iVar);
                }
                h.this.e.a(arrayList2);
            }
        });
    }

    public void a(final ArrayList arrayList, final boolean z) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.h.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.e();
                    if (h.this.e.a(iVar) == null) {
                        com.tsf.shell.e.i.b.e.i iVar2 = new com.tsf.shell.e.i.b.e.i(new LauncherShortcutAppInfo(), iVar, true);
                        iVar2.setMouseEventListener(h.this.g.f(iVar2));
                        h.this.e.a(iVar2, z);
                    }
                }
            }
        });
    }

    public void b(final ArrayList arrayList, final boolean z) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.h.3
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    com.tsf.shell.manager.a.l.a(arrayList);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.d();
                    com.tsf.shell.e.i.b.e.i a2 = h.this.e.a(iVar);
                    if (a2 != null) {
                        a2.g();
                        a2.destroy();
                        h.this.e.b(a2, z);
                    }
                }
            }
        });
    }

    public void b(final ArrayList arrayList) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.h.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.e();
                    h.this.e.a(h.this.e.a(iVar));
                }
            }
        });
    }
}
