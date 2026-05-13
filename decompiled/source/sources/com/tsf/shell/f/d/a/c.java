package com.tsf.shell.f.d.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.f.d.a.a.d;
import com.tsf.shell.f.d.a.a.f;
import com.tsf.shell.f.d.a.a.g;
import com.tsf.shell.f.d.a.a.h;
import com.tsf.shell.manager.b.e;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c {
    private ArrayList<a> a;
    private ArrayList<a> b;
    private ArrayList<a> c;
    private a d;
    private Number3d e;
    private Number3d f;
    private boolean g = false;
    private a h;

    public void a() {
        this.g = e.m();
        this.e = new Number3d();
        this.f = new Number3d();
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.a = new ArrayList<>();
        this.a.add(new com.tsf.shell.f.d.a.a.b(70, false));
        this.a.add(new h(0, false));
        this.a.add(new g(10, false));
        this.a.add(new d(40, true));
        this.a.add(new com.tsf.shell.f.d.a.a.a(30, true));
        this.a.add(new com.tsf.shell.f.d.a.a.c(20, true));
        this.a.add(new f(60, true));
        this.h = new com.tsf.shell.f.d.a.a.e(100, false);
        if (!this.g) {
            this.a.add(this.h);
        }
        Iterator<Integer> it = com.tsf.shell.utils.h.a(e.n(), ",", false).iterator();
        while (it.hasNext()) {
            a b = b(it.next().intValue());
            if (b != null) {
                b.a(true);
                this.b.add(b);
            }
        }
        if (this.b.size() == 0) {
            a aVar = this.a.get(0);
            aVar.a(true);
            this.b.add(aVar);
        }
        this.d = this.b.get(0);
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
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                next.a(true);
                this.b.add(next);
            }
            return;
        }
        g();
        Iterator<a> it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next().a(false);
        }
        h();
    }

    private void h() {
        if (this.b.size() > 0) {
            this.d = this.b.get(0);
        } else {
            this.d = this.a.get(0);
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
        return this.a.get(i);
    }

    private a b(int i) {
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.c() == i) {
                return next;
            }
        }
        return null;
    }

    public boolean a(a aVar) {
        if (!this.g) {
            if (aVar != this.d) {
                if (this.d != null) {
                    this.d.a(false);
                }
                this.d = aVar;
                this.d.a(true);
                return true;
            }
            return false;
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
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.d()) {
                this.c.add(next);
            }
        }
        if (this.c.size() == 0) {
            Iterator<a> it2 = this.b.iterator();
            while (it2.hasNext()) {
                a next2 = it2.next();
                next2.b(false);
                this.c.add(next2);
            }
        }
        this.d = this.c.get((int) (Math.random() * this.c.size()));
    }

    public a a(com.tsf.shell.f.i.b.e.b bVar, Number3d number3d, Number3d number3d2) {
        a c = c();
        c.a(bVar.k, number3d, number3d2, null);
        return c;
    }

    public a a(com.tsf.shell.f.i.b.e.b bVar, a aVar) {
        this.e.reset();
        this.f.reset();
        aVar.a(bVar.k, bVar.localToGlobal(this.e), bVar.localRotationToGlobal(this.f), null);
        return aVar;
    }

    public a a(com.tsf.shell.f.i.b.e.b bVar) {
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
        e.c(this.g);
        String str3 = "";
        if (!this.g) {
            str = "" + this.d.c();
        } else {
            int size = this.b.size();
            int i = 0;
            while (i < size) {
                a aVar = this.b.get(i);
                if (i == size - 1) {
                    str2 = str3 + aVar.c();
                } else {
                    str2 = str3 + aVar.c() + ",";
                }
                i++;
                str3 = str2;
            }
            str = str3;
        }
        e.b(str);
    }
}
