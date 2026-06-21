package com.tsf.shell.e.c;

import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.e.c.a.f;
import com.tsf.shell.e.c.b.e;
import com.tsf.shell.manager.b.g;

/* loaded from: classes.dex */
public class a {
    public e a;
    public f b;
    public int c;

    public a() {
        com.tsf.shell.manager.a.g = this;
        this.c = a(g.v());
        this.a = new e(false);
        this.b = new f(false);
    }

    public boolean a() {
        return this.c == 0 ? g.ae() : g.af();
    }

    public void b() {
        this.a.o();
    }

    public int c() {
        return this.c;
    }

    public int a(int i) {
        if (i >= 0 && i <= 1) {
            return i;
        }
        return 0;
    }

    public void a(l lVar) {
        this.a.b();
        lVar.addChild(this.a.a());
        this.b.a(lVar, (com.tsf.shell.e.c.a.g) null);
        d();
    }

    public void b(int i) {
        if (this.c != i) {
            this.c = a(i);
            g.f(this.c);
            switch (i) {
                case 0:
                    this.a.c(true);
                    this.b.u();
                    this.b.a(true);
                    break;
                case 1:
                    this.a.b(true);
                    this.b.d();
                    this.b.t();
                    break;
            }
        }
        d();
    }

    private void d() {
        if (a()) {
            this.a.c();
        } else {
            this.a.d();
        }
    }
}
