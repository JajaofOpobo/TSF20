package com.tsf.shell.e.f.a.d;

import com.tsf.shell.Home;
import com.tsf.shell.e.f.a.d.a.b;
import com.tsf.shell.e.f.a.d.a.c;
import com.tsf.shell.e.f.a.d.a.d;
import com.tsf.shell.e.f.a.d.a.e;
import com.tsf.shell.e.f.a.d.a.f;
import com.tsf.shell.manager.a.h;
import com.tsf.shell.manager.b.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a {
    private h b;
    private c d;
    private d e;
    private boolean a = false;
    private int f = -1;
    private ArrayList c = new ArrayList();

    public a(h hVar) {
        this.b = hVar;
        this.c.add(new b(0));
        this.c.add(new e(2));
        this.c.add(new f(1));
        this.c.add(new com.tsf.shell.e.f.a.d.a.a(3));
        this.e = new d(0);
        c(g.al());
    }

    public int a() {
        return this.c.size();
    }

    public c a(int i) {
        return (c) this.c.get(i);
    }

    public c b() {
        return this.d;
    }

    private Comparator e() {
        return this.d.a();
    }

    public int a(ArrayList arrayList, com.tsf.shell.e.i.c cVar) {
        int binarySearch = Collections.binarySearch(arrayList, cVar, this.d.a());
        if (binarySearch < 0) {
            return -(binarySearch + 1);
        }
        return binarySearch;
    }

    public boolean c() {
        return this.a;
    }

    public void a(ArrayList arrayList) {
        Collections.sort(arrayList, this.e.a());
    }

    public void d() {
        Collections.sort(com.tsf.shell.manager.a.h.t().ao().a(), e());
    }

    private void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.k() == i) {
                this.d = cVar;
            }
        }
        if (this.d == null) {
            this.d = (c) this.c.get(0);
        }
    }

    public void b(int i) {
        g.o(i);
        c(i);
        if (this.a) {
            this.f = i;
            return;
        }
        if (!com.tsf.shell.manager.a.h.t().ao().a().isEmpty()) {
            this.a = true;
            d();
            com.tsf.shell.manager.a.w.d().c();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.f.a.d.a.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.a.h.t().ay();
                    a.this.a = false;
                    if (a.this.f != -1) {
                        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.a.d.a.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                a.this.b(a.this.f);
                                a.this.f = -1;
                            }
                        });
                    } else {
                        com.tsf.shell.manager.a.b.c(Home.b());
                    }
                }
            };
            com.tsf.shell.manager.a.b.b(Home.b());
            com.tsf.shell.manager.a.h.t().b(runnable);
        }
    }
}
