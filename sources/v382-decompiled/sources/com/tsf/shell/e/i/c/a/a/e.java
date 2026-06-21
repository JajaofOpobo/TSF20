package com.tsf.shell.e.i.c.a.a;

/* loaded from: classes.dex */
class e {
    final /* synthetic */ d a;
    private Object[] b;
    private int c;
    private int d;

    public e(d dVar, int i) {
        this.a = dVar;
        this.c = i;
        this.b = new Object[i];
    }

    public void a(int i, Object obj) {
        if (i < 0 || i > this.d || this.d >= this.c) {
            throw new IndexOutOfBoundsException();
        }
        for (int i2 = this.d; i2 > i; i2--) {
            this.b[i2] = this.b[i2 - 1];
        }
        this.b[i] = obj;
        this.d++;
    }

    public void a(Object obj) {
        if (this.d >= this.c) {
            throw new IndexOutOfBoundsException();
        }
        Object[] objArr = this.b;
        int i = this.d;
        this.d = i + 1;
        objArr[i] = obj;
    }

    public void a(e eVar) {
        if (this.d + eVar.b() > this.c) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < eVar.b(); i++) {
            Object[] objArr = this.b;
            int i2 = this.d;
            this.d = i2 + 1;
            objArr[i2] = eVar.a(i);
        }
    }

    public void a() {
        this.d = 0;
    }

    public Object a(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public Object b(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException();
        }
        Object obj = this.b[i];
        while (i < this.d - 1) {
            this.b[i] = this.b[i + 1];
            i++;
        }
        this.d--;
        return obj;
    }

    public int b() {
        return this.d;
    }
}
