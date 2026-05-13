package com.tsf.shell.manager.a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.f.f.a.h;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e {
    public static String a = "0";
    public static String b = "1";
    public static String c = "2";
    public static String d = "3";
    private h g;
    private c e = new c(this);
    private com.tsf.shell.f.f.a.d.a f = new com.tsf.shell.f.f.a.d.a(this);
    private d h = new d(this);
    private com.tsf.shell.f.f.a.b i = new com.tsf.shell.f.f.a.b(this);

    public c a() {
        return this.e;
    }

    public com.tsf.shell.f.f.a.d.a b() {
        return this.f;
    }

    public d c() {
        return this.h;
    }

    public com.tsf.shell.f.f.a.b d() {
        return this.i;
    }

    public void a(final ArrayList<f> arrayList) {
        this.g = com.tsf.shell.manager.a.h.t();
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.e.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<com.tsf.shell.f.i.b.e.g> arrayList2 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.f.i.b.e.g gVar = new com.tsf.shell.f.i.b.e.g(null, (f) it.next(), true);
                    gVar.setMouseEventListener(e.this.g.f(gVar));
                    arrayList2.add(gVar);
                }
                e.this.e.a(arrayList2);
            }
        });
    }

    public void a(final ArrayList<f> arrayList, final boolean z) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.e.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    fVar.e();
                    if (e.this.e.a(fVar) == null) {
                        com.tsf.shell.f.i.b.e.g gVar = new com.tsf.shell.f.i.b.e.g(new LauncherShortcutAppInfo(), fVar, true);
                        gVar.setMouseEventListener(e.this.g.f(gVar));
                        e.this.e.a(gVar, z);
                    }
                }
            }
        });
    }

    public void b(final ArrayList<f> arrayList, final boolean z) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.e.3
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    com.tsf.shell.manager.a.l.a(arrayList);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    fVar.d();
                    com.tsf.shell.f.i.b.e.g a2 = e.this.e.a(fVar);
                    if (a2 != null) {
                        a2.g();
                        a2.destroy();
                        e.this.e.b(a2, z);
                    }
                }
            }
        });
    }

    public void b(final ArrayList<f> arrayList) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.a.e.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    fVar.e();
                    e.this.e.a(e.this.e.a(fVar));
                }
            }
        });
    }
}
