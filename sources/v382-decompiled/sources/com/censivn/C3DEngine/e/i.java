package com.censivn.C3DEngine.e;

import java.io.InputStream;

/* loaded from: classes.dex */
class i {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    final /* synthetic */ h r;

    private i(h hVar) {
        this.r = hVar;
    }

    /* synthetic */ i(h hVar, i iVar) {
        this(hVar);
    }

    public void a(InputStream inputStream) {
        this.a = this.r.b(inputStream);
        this.b = this.r.b(inputStream);
        if (this.a != 844121161 || this.b != 8) {
            throw new Exception("This is not a valid MD2 file.");
        }
        this.c = this.r.b(inputStream);
        this.d = this.r.b(inputStream);
        this.e = this.r.b(inputStream);
        this.f = this.r.b(inputStream);
        this.g = this.r.b(inputStream);
        this.h = this.r.b(inputStream);
        this.i = this.r.b(inputStream);
        this.j = this.r.b(inputStream);
        this.k = this.r.b(inputStream);
        this.l = this.r.b(inputStream);
        this.m = this.r.b(inputStream);
        this.n = this.r.b(inputStream);
        this.o = this.r.b(inputStream);
        this.p = this.r.b(inputStream);
        this.q = this.r.b(inputStream);
    }
}
