package com.tsf.shell.e.d.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.e.d.a.a.d;
import com.tsf.shell.e.d.a.a.e;
import com.tsf.shell.e.d.a.a.f;
import com.tsf.shell.e.d.a.a.h;
import com.tsf.shell.manager.b.g;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    private ArrayList a;
    private ArrayList b;
    private ArrayList c;
    private a d;
    private Number3d e;
    private Number3d f;
    private boolean g = false;
    private a h;

    public void a() {
        this.g = g.m();
        this.e = new Number3d();
        this.f = new Number3d();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.a.add(new com.tsf.shell.e.d.a.a.b(70, false));
        this.a.add(new h(0, false));
        this.a.add(new com.tsf.shell.e.d.a.a.g(10, false));
        this.a.add(new d(40, true));
        this.a.add(new com.tsf.shell.e.d.a.a.a(30, true));
        this.a.add(new com.tsf.shell.e.d.a.a.c(20, true));
        this.a.add(new f(60, true));
        this.h = new e(100, false);
        if (!this.g) {
            this.a.add(this.h);
        }
        Iterator it = com.tsf.shell.utils.h.a(g.n(), ",", false).iterator();
        while (it.hasNext()) {
            a b = b(((Integer) it.next()).intValue());
            if (b != null) {
                b.a(true);
                this.b.add(b);
            }
        }
        if (this.b.size() == 0) {
            a aVar = (a) this.a.get(0);
            aVar.a(true);
            this.b.add(aVar);
        }
        this.d = (a) this.b.get(0);
    }

    private void f() {
        this.h.a(false);
        this.a.remove(this.h);
    }

    private void g() {
        if (!this.a.contains(this.h)) {
            this.a.add(this.h);
        }
    }

    public void a(boolean z) {
        this.g = z;
        if (z) {
            f();
            this.a.remove(this.h);
            this.b.clear();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                aVar.a(true);
                this.b.add(aVar);
            }
            return;
        }
        g();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).a(false);
        }
        h();
    }

    private void h() {
        if (this.b.size() > 0) {
            this.d = (a) this.b.get(0);
        } else {
            this.d = (a) this.a.get(0);
        }
        this.d.a(true);
    }

    public boolean b() {
        return this.g;
    }

    private void b(a aVar) {
        if (!this.b.contains(aVar)) {
            aVar.a(true);
            this.b.add(aVar);
        } else if (this.b.size() > 1) {
            aVar.a(false);
            this.b.remove(aVar);
            if (this.d == aVar) {
                h();
            }
        }
    }

    public a a(int i) {
        return (a) this.a.get(i);
    }

    private a b(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.c() == i) {
                return aVar;
            }
        }
        return null;
    }

    public boolean a(a aVar) {
        if (!this.g) {
            if (aVar == this.d) {
                return false;
            }
            if (this.d != null) {
                this.d.a(false);
            }
            this.d = aVar;
            this.d.a(true);
            return true;
        }
        b(aVar);
        return true;
    }

    public a c() {
        a aVar = this.d;
        if (this.g) {
            aVar.b(true);
            i();
        }
        return aVar;
    }

    private void i() {
        this.c.clear();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!aVar.d()) {
                this.c.add(aVar);
            }
        }
        if (this.c.size() == 0) {
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                a aVar2 = (a) it2.next();
                aVar2.b(false);
                this.c.add(aVar2);
            }
        }
        this.d = (a) this.c.get((int) (Math.random() * this.c.size()));
    }

    public a a(com.tsf.shell.e.i.b.e.b bVar, Number3d number3d, Number3d number3d2) {
        a c = c();
        c.a(bVar.k, number3d, number3d2, null);
        return c;
    }

    public a a(com.tsf.shell.e.i.b.e.b bVar, a aVar) {
        this.e.reset();
        this.f.reset();
        aVar.a(bVar.k, bVar.localToGlobal(this.e), bVar.localRotationToGlobal(this.f), null);
        return aVar;
    }

    public a a(com.tsf.shell.e.i.b.e.b bVar) {
        this.e.reset();
        this.f.reset();
        Number3d localToGlobal = bVar.localToGlobal(this.e);
        Number3d localRotationToGlobal = bVar.localRotationToGlobal(this.f);
        a c = c();
        c.a(bVar.k, localToGlobal, localRotationToGlobal, null);
        return c;
    }

    public int d() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }

    public void e() {
        String str;
        String str2;
        g.c(this.g);
        String str3 = "";
        if (this.g) {
            int size = this.b.size();
            int i = 0;
            while (i < size) {
                a aVar = (a) this.b.get(i);
                if (i == size - 1) {
                    str2 = String.valueOf(str3) + aVar.c();
                } else {
                    str2 = String.valueOf(str3) + aVar.c() + ",";
                }
                i++;
                str3 = str2;
            }
            str = str3;
        } else {
            str = String.valueOf("") + this.d.c();
        }
        g.b(str);
    }
}
