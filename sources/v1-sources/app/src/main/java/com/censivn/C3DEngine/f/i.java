package com.censivn.C3DEngine.f;

import java.io.InputStream;

/* loaded from: classes.dex */
final class i {
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

    /* synthetic */ i(h hVar, byte b) {
        this(hVar);
    }

    public final void a(InputStream inputStream) {
        h hVar = this.r;
        this.a = h.b(inputStream);
        h hVar2 = this.r;
        this.b = h.b(inputStream);
        if (this.a != 844121161 || this.b != 8) {
            throw new Exception("This is not a valid MD2 file.");
        }
        h hVar3 = this.r;
        this.c = h.b(inputStream);
        h hVar4 = this.r;
        this.d = h.b(inputStream);
        h hVar5 = this.r;
        this.e = h.b(inputStream);
        h hVar6 = this.r;
        this.f = h.b(inputStream);
        h hVar7 = this.r;
        this.g = h.b(inputStream);
        h hVar8 = this.r;
        this.h = h.b(inputStream);
        h hVar9 = this.r;
        this.i = h.b(inputStream);
        h hVar10 = this.r;
        this.j = h.b(inputStream);
        h hVar11 = this.r;
        this.k = h.b(inputStream);
        h hVar12 = this.r;
        this.l = h.b(inputStream);
        h hVar13 = this.r;
        this.m = h.b(inputStream);
        h hVar14 = this.r;
        this.n = h.b(inputStream);
        h hVar15 = this.r;
        this.o = h.b(inputStream);
        h hVar16 = this.r;
        this.p = h.b(inputStream);
        h hVar17 = this.r;
        this.q = h.b(inputStream);
    }
}
