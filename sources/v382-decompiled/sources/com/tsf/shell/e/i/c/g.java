package com.tsf.shell.e.i.c;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.o;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public abstract class g {
    private o a = new o();

    public abstract j a(int i, int i2, boolean z);

    public abstract void b();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public g() {
        this.a.e(-1);
        this.a.d(36);
        com.tsf.shell.manager.o.c.a(this.a, com.tsf.shell.manager.o.c.h);
    }

    public void a() {
        i();
        this.a.destroy();
    }

    public void i() {
        this.a.a();
        b();
    }

    public void a(int i) {
        this.a.d(i);
    }

    public j b(int i) {
        this.a.f(i);
        return this.a;
    }

    public void c(int i) {
        a(x.c(i));
    }

    public void a(String str) {
        this.a.a(str);
    }
}
