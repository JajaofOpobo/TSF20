package com.tsf.shell.e.h.a.a;

import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c extends com.censivn.C3DEngine.b.b.a.a {
    private boolean a = false;
    private boolean b = false;
    private int c = 10;

    public abstract ArrayList a(int i);

    public c(int i) {
        setTitle(i);
        setTitlePosition(com.censivn.C3DEngine.b.b.a.a(120.0f));
        setTitleSize(36);
        setMarginDistance(com.censivn.C3DEngine.b.b.a.a(10.0f));
        minY((-com.tsf.shell.e.h.a.c.a) / 2.0f);
        maxY(com.tsf.shell.e.h.a.c.a / 2.0f);
    }

    public void a() {
        if (!this.b) {
            this.b = true;
            a(true);
        } else {
            a(false);
        }
    }

    public void b() {
    }

    public void b(int i) {
        this.c = i;
    }

    public int c() {
        return this.c;
    }

    public void d() {
        for (int i = 0; i < children().size(); i++) {
            j jVar = (j) children().get(i);
            if (jVar instanceof b) {
                b bVar = (b) jVar;
                if (bVar.c().id == com.tsf.shell.manager.a.o.a().v().c(false).id) {
                    bVar.c().id = 0;
                }
            }
        }
    }

    public void e() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < children().size()) {
                j jVar = (j) children().get(i2);
                if (jVar instanceof b) {
                    ((b) jVar).h();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public void a(final boolean z) {
        if (!this.a) {
            this.a = true;
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.h.a.a.c.1
                @Override // java.lang.Runnable
                public void run() {
                    final ArrayList a = c.this.a(c.this.c);
                    Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.e.h.a.a.c.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.a(a);
                            c.this.a = false;
                        }
                    };
                    if (z) {
                        runnable2.run();
                    } else {
                        com.censivn.C3DEngine.a.a().c(runnable2);
                    }
                }
            };
            if (z) {
                runnable.run();
            } else {
                com.censivn.C3DEngine.a.a().d(runnable);
            }
        }
    }

    public void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        while (!children().isEmpty()) {
            j removeChildAt = removeChildAt(0);
            if (removeChildAt instanceof b) {
                arrayList2.add((b) removeChildAt);
            }
        }
        c(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager.c.a.a.b bVar = (com.tsf.shell.manager.c.a.a.b) it.next();
            b a = a(bVar, arrayList2);
            if (a == null) {
                a = com.tsf.shell.manager.c.c.b();
            }
            a.a(bVar);
            addChild(a);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).j();
        }
        arrayList2.clear();
    }

    public void c(int i) {
        if (i == 0) {
            visible(false);
        } else {
            visible(true);
        }
    }

    private b a(com.tsf.shell.manager.c.a.a.b bVar, ArrayList arrayList) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < arrayList.size()) {
                if (!((b) arrayList.get(i2)).e().equals(bVar.b)) {
                    i = i2 + 1;
                } else {
                    return (b) arrayList.remove(i2);
                }
            } else {
                return null;
            }
        }
    }
}
