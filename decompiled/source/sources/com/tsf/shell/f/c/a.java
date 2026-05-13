package com.tsf.shell.f.c;

import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.c.a.f;
import com.tsf.shell.f.c.b.e;
/* loaded from: classes.dex */
public class a {
    public e a;
    public f b;
    public int c;

    public a() {
        com.tsf.shell.manager.a.g = this;
        this.c = a(com.tsf.shell.manager.b.e.v());
        this.a = new e(false);
        this.b = new f(false);
    }

    public boolean a() {
        return this.c == 0 ? com.tsf.shell.manager.b.e.ag() : com.tsf.shell.manager.b.e.ah();
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

    public void a(j jVar) {
        this.a.b();
        jVar.addChild(this.a.a());
        this.b.a(jVar, (f.a) null);
        d();
    }

    public void b(int i) {
        if (this.c != i) {
            this.c = a(i);
            com.tsf.shell.manager.b.e.f(this.c);
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
