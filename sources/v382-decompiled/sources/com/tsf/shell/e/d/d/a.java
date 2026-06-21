package com.tsf.shell.e.d.d;

import com.tsf.shell.e.f.p;
import com.tsf.shell.manager.b.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    public ArrayList a;
    public b b;
    private com.tsf.shell.e.d.d.a.a c;

    public void a() {
        int i = 0;
        this.b = new b();
        this.a = new ArrayList();
        this.a.add(new com.tsf.shell.e.d.d.a.b(0));
        this.a.add(new com.tsf.shell.e.d.d.a.c(1));
        int o = g.o();
        if (o >= 0) {
            i = o > this.a.size() + (-1) ? this.a.size() - 1 : o;
        }
        this.c = (com.tsf.shell.e.d.d.a.a) this.a.get(i);
    }

    public boolean b() {
        return this.c instanceof com.tsf.shell.e.d.d.a.c;
    }

    public void c() {
        a((com.tsf.shell.e.d.d.a.a) this.a.get(1));
    }

    public void d() {
        a((com.tsf.shell.e.d.d.a.a) this.a.get(0));
    }

    public boolean a(com.tsf.shell.e.d.d.a.a aVar) {
        if (aVar == this.c) {
            return false;
        }
        if (this.c != null) {
            this.c.b();
        }
        this.c = aVar;
        g.c(aVar.d());
        return true;
    }

    public com.tsf.shell.e.d.d.a.a e() {
        return this.c;
    }

    public void f() {
        this.c.c();
    }

    public void g() {
        com.tsf.shell.e.f.g n = com.tsf.shell.manager.a.h.n();
        if (n != null) {
            n.ae();
            if (n.ah() != null) {
                n.ah().ae();
            }
            if (n.ag() != null) {
                n.ag().ae();
            }
        }
    }

    public void h() {
        if (((p) com.tsf.shell.manager.a.v.a.a.h()).a()) {
            f();
            g();
        }
    }
}
