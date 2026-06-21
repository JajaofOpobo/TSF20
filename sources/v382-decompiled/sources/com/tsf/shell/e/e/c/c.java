package com.tsf.shell.e.e.c;

/* loaded from: classes.dex */
class c {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    final /* synthetic */ b l;

    public c(b bVar, float f, float f2, float f3, int i, int i2) {
        this.l = bVar;
        this.g = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = i;
        this.k = i2;
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public c(b bVar, float f, float f2, float f3) {
        this.l = bVar;
        this.g = 1.0f;
        this.h = 0;
        this.i = 0;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.j = 0;
        this.k = 0;
    }

    public void a() {
        this.a += (this.d - this.a) * this.g;
        this.b += (this.e - this.b) * this.g;
        this.c += (this.f - this.c) * this.g;
    }
}
