package com.tsf.shell.f.i.c;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class e {
    private m a = new m();

    public abstract i a(int i, int i2, boolean z);

    public abstract void b();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public e() {
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

    public i b(int i) {
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
