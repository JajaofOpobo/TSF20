package com.tsf.shell.f.f.a.d;

import com.tsf.shell.Home;
import com.tsf.shell.f.f.a.d.a.b;
import com.tsf.shell.f.f.a.d.a.c;
import com.tsf.shell.f.f.a.d.a.d;
import com.tsf.shell.f.f.a.d.a.f;
import com.tsf.shell.manager.a.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private e b;
    private c d;
    private d e;
    private boolean a = false;
    private int f = -1;
    private ArrayList<c> c = new ArrayList<>();

    public a(e eVar) {
        this.b = eVar;
        this.c.add(new b(0));
        this.c.add(new com.tsf.shell.f.f.a.d.a.e(2));
        this.c.add(new f(1));
        this.c.add(new com.tsf.shell.f.f.a.d.a.a(3));
        this.e = new d(0);
        c(com.tsf.shell.manager.b.e.an());
    }

    public int a() {
        return this.c.size();
    }

    public c a(int i) {
        return this.c.get(i);
    }

    public c b() {
        return this.d;
    }

    private Comparator<? super com.tsf.shell.f.i.b> e() {
        return this.d.a();
    }

    public int a(ArrayList<com.tsf.shell.f.i.b> arrayList, com.tsf.shell.f.i.b bVar) {
        int iBinarySearch = Collections.binarySearch(arrayList, bVar, this.d.a());
        if (iBinarySearch < 0) {
            return -(iBinarySearch + 1);
        }
        return iBinarySearch;
    }

    public boolean c() {
        return this.a;
    }

    public void a(ArrayList<com.tsf.shell.f.i.b> arrayList) {
        Collections.sort(arrayList, this.e.a());
    }

    public void d() {
        Collections.sort(com.tsf.shell.manager.a.h.t().ao().a(), e());
    }

    private void c(int i) {
        for (c cVar : this.c) {
            if (cVar.k() == i) {
                this.d = cVar;
            }
        }
        if (this.d == null) {
            this.d = this.c.get(0);
        }
    }

    public void b(int i) {
        com.tsf.shell.manager.b.e.p(i);
        c(i);
        if (this.a) {
            this.f = i;
            return;
        }
        if (!com.tsf.shell.manager.a.h.t().ao().a().isEmpty()) {
            this.a = true;
            d();
            com.tsf.shell.manager.a.w.d().c();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.a.d.a.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.a.h.t().ay();
                    a.this.a = false;
                    if (a.this.f != -1) {
                        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.d.a.1.1
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
