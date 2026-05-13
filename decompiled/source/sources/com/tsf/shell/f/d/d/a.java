package com.tsf.shell.f.d.d;

import com.tsf.shell.f.f.g;
import com.tsf.shell.manager.b.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a {
    public ArrayList<com.tsf.shell.f.d.d.a.a> a;
    public b b;
    private com.tsf.shell.f.d.d.a.a c;

    public void a() {
        int i = 0;
        this.b = new b();
        this.a = new ArrayList<>();
        this.a.add(new com.tsf.shell.f.d.d.a.b(0));
        this.a.add(new com.tsf.shell.f.d.d.a.c(1));
        int o = e.o();
        if (o >= 0) {
            i = o > this.a.size() + (-1) ? this.a.size() - 1 : o;
        }
        this.c = this.a.get(i);
    }

    public boolean b() {
        return this.c instanceof com.tsf.shell.f.d.d.a.c;
    }

    public void c() {
        a(this.a.get(1));
    }

    public void d() {
        a(this.a.get(0));
    }

    public boolean a(com.tsf.shell.f.d.d.a.a aVar) {
        if (aVar != this.c) {
            if (this.c != null) {
                this.c.b();
            }
            this.c = aVar;
            e.c(aVar.d());
            return true;
        }
        return false;
    }

    public com.tsf.shell.f.d.d.a.a e() {
        return this.c;
    }

    public void f() {
        this.c.c();
    }

    public void g() {
        g n = com.tsf.shell.manager.a.h.n();
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
        if (com.tsf.shell.manager.a.v.a.a.h().a()) {
            f();
            g();
        }
    }
}
