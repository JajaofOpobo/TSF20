package com.tsf.shell.e.i.c.a.b;

/* loaded from: classes.dex */
public abstract class b {
    int a = 0;
    e b;
    f c;

    public abstract int a();

    public abstract float[] a(int i);

    public void b(int i) {
    }

    public void c(int i) {
    }

    public void a(e eVar) {
        this.b = eVar;
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

    public void a(f fVar) {
        this.c = fVar;
        if (this.b != null) {
            this.b.a(this.c);
        }
    }
}
