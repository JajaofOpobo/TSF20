package com.tsf.shell.f.i._c;

import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.Home;
import com.tsf.shell.utils.k;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends e {
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
    private ArrayList<com.tsf.shell.f.i.B> l = new ArrayList<>();

    public boolean j() {
        return this.k;
    }

    public void b(boolean z) {
        this.k = z;
        if (!this.k) {
            ArrayList arrayList = (ArrayList) this.l.clone();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tsf.shell.manager._a.i.a((com.tsf.shell.f.i.B) it.next());
            }
            this.l.clear();
            arrayList.clear();
        }
    }

    public void k() {
        com.censivn.C3DEngine.A.a().a(new Runnable() { // from class: com.tsf.shell.f.i._c.g.1
            @Override // java.lang.Runnable
            public void run() {
                k.a(Home.c, g.this.a);
            }
        });
    }

    public void l() {
    }

    public void a(com.tsf.shell.f.i.B bVar) {
        this.l.add(bVar);
    }

    public void b(com.tsf.shell.f.i.B bVar) {
        this.l.remove(bVar);
    }

    public void m() {
        this.l.clear();
    }

    public boolean n() {
        return this.l.size() <= 0 || !this.f;
    }

    public ArrayList<com.tsf.shell.f.i.B> o() {
        return this.l;
    }

    @Override // com.tsf.shell.f.i._c.e
    public void a() {
        super.a();
        ArrayList arrayList = (ArrayList) this.l.clone();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager._a.i.a((com.tsf.shell.f.i.B) it.next());
        }
        this.l.clear();
        arrayList.clear();
    }

    @Override // com.tsf.shell.f.i._c.e
    public i a(int i, int i2, boolean z) {
        i iVarA = a(z);
        if (iVarA == null) {
            return null;
        }
        return iVarA;
    }

    @Override // com.tsf.shell.f.i._c.e
    public void b() {
    }

    public i a(boolean z) {
        return null;
    }

    @Override // com.tsf.shell.f.i._c.e
    public void g() {
        if (!this.m) {
            this.m = true;
            c();
        }
    }

    @Override // com.tsf.shell.f.i._c.e
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

    @Override // com.tsf.shell.f.i._c.e
    public void e() {
    }

    @Override // com.tsf.shell.f.i._c.e
    public void f() {
    }
}
