package com.tsf.shell.e.i.c;

import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.Home;
import com.tsf.shell.utils.l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i extends g {
    public String b;
    public int d;
    public boolean e;
    public int g;
    private boolean k = false;
    public String a = "";
    public String c = "";
    public boolean f = false;
    public int h = 6;
    public int i = 0;
    public boolean j = true;
    private boolean m = true;
    private ArrayList l = new ArrayList();

    public boolean j() {
        return this.k;
    }

    public void b(boolean z) {
        this.k = z;
        if (!this.k) {
            ArrayList arrayList = (ArrayList) this.l.clone();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tsf.shell.manager.a.i.a((com.tsf.shell.e.i.c) it.next());
            }
            this.l.clear();
            arrayList.clear();
        }
    }

    public void k() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.i.c.i.1
            @Override // java.lang.Runnable
            public void run() {
                l.a(Home.c, i.this.a);
            }
        });
    }

    public void l() {
    }

    public void a(com.tsf.shell.e.i.c cVar) {
        this.l.add(cVar);
    }

    public void b(com.tsf.shell.e.i.c cVar) {
        this.l.remove(cVar);
    }

    public void m() {
        this.l.clear();
    }

    public boolean n() {
        return this.l.size() <= 0 || !this.f;
    }

    public ArrayList o() {
        return this.l;
    }

    @Override // com.tsf.shell.e.i.c.g
    public void a() {
        super.a();
        ArrayList arrayList = (ArrayList) this.l.clone();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager.a.i.a((com.tsf.shell.e.i.c) it.next());
        }
        this.l.clear();
        arrayList.clear();
    }

    @Override // com.tsf.shell.e.i.c.g
    public j a(int i, int i2, boolean z) {
        j a = a(z);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // com.tsf.shell.e.i.c.g
    public void b() {
    }

    public j a(boolean z) {
        return null;
    }

    @Override // com.tsf.shell.e.i.c.g
    public void g() {
        if (!this.m) {
            this.m = true;
            c();
        }
    }

    @Override // com.tsf.shell.e.i.c.g
    public void h() {
        if (this.m) {
            this.m = false;
            d();
        }
    }

    public void c() {
    }

    public void d() {
    }

    @Override // com.tsf.shell.e.i.c.g
    public void e() {
    }

    @Override // com.tsf.shell.e.i.c.g
    public void f() {
    }
}
