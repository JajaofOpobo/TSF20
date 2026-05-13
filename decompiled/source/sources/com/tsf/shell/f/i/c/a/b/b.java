package com.tsf.shell.f.i.c.a.b;
/* loaded from: classes.dex */
public abstract class b {
    int a = 0;
    d b;
    e c;

    public abstract int a();

    public abstract float[] a(int i);

    public void b(int i) {
    }

    public void c(int i) {
    }

    public void a(d dVar) {
        this.b = dVar;
        if (this.c != null) {
            this.b.a(this.c);
        }
    }

    public void b() {
        this.b = null;
    }

    public void a(int i, int i2) {
        this.b.b(i, i2);
    }

    public void a(e eVar) {
        this.c = eVar;
        if (this.b != null) {
            this.b.a(this.c);
        }
    }
}
