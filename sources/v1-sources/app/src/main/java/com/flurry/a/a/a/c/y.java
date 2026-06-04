package com.flurry.a.a.a.c;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class y extends w implements com.flurry.a.a.a.c.a.b {
    protected p c;

    y(com.flurry.a.a.a.c.a.g gVar) {
        super(gVar);
        a((p) null);
    }

    public final y a(p pVar) {
        this.a.e();
        this.c = pVar;
        return this;
    }

    @Override // com.flurry.a.a.a.c.p
    public final void b() {
        this.a.a(com.flurry.a.a.a.c.a.g.c);
        this.c.b();
    }

    @Override // com.flurry.a.a.a.c.p
    public final boolean c() {
        this.a.a(com.flurry.a.a.a.c.a.g.d);
        return this.c.c();
    }

    @Override // com.flurry.a.a.a.c.p
    public final int d() {
        this.a.a(com.flurry.a.a.a.c.a.g.e);
        return this.c.d();
    }

    @Override // com.flurry.a.a.a.c.p
    public long e() {
        this.a.a(com.flurry.a.a.a.c.a.g.f);
        return this.c.e();
    }

    @Override // com.flurry.a.a.a.c.p
    public float f() {
        this.a.a(com.flurry.a.a.a.c.a.g.g);
        return this.c.f();
    }

    @Override // com.flurry.a.a.a.c.p
    public double g() {
        this.a.a(com.flurry.a.a.a.c.a.g.h);
        return this.c.g();
    }

    @Override // com.flurry.a.a.a.c.p
    public final com.flurry.a.a.a.e.a a(com.flurry.a.a.a.e.a aVar) {
        this.a.a(com.flurry.a.a.a.c.a.g.i);
        return this.c.a(aVar);
    }

    @Override // com.flurry.a.a.a.c.p
    public final String h() {
        this.a.a(com.flurry.a.a.a.c.a.g.i);
        return this.c.h();
    }

    @Override // com.flurry.a.a.a.c.p
    public final void i() {
        this.a.a(com.flurry.a.a.a.c.a.g.i);
        this.c.i();
    }

    @Override // com.flurry.a.a.a.c.p
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        this.a.a(com.flurry.a.a.a.c.a.g.j);
        return this.c.a(byteBuffer);
    }

    @Override // com.flurry.a.a.a.c.p
    public final void j() {
        this.a.a(com.flurry.a.a.a.c.a.g.j);
        this.c.j();
    }

    private void b(int i) {
        this.a.a(com.flurry.a.a.a.c.a.g.k);
        com.flurry.a.a.a.c.a.o oVar = (com.flurry.a.a.a.c.a.o) this.a.c();
        if (i != oVar.A) {
            throw new com.flurry.a.a.a.b("Incorrect length for fixed binary: expected " + oVar.A + " but received " + i + " bytes.");
        }
    }

    @Override // com.flurry.a.a.a.c.p
    public final void a(byte[] bArr, int i, int i2) {
        b(i2);
        this.c.a(bArr, i, i2);
    }

    @Override // com.flurry.a.a.a.c.p
    public final void a(int i) {
        b(i);
        this.c.a(i);
    }

    @Override // com.flurry.a.a.a.c.w
    protected final void a() {
        this.a.a(com.flurry.a.a.a.c.a.g.k);
        this.c.a(((com.flurry.a.a.a.c.a.o) this.a.c()).A);
    }

    @Override // com.flurry.a.a.a.c.p
    public int k() {
        this.a.a(com.flurry.a.a.a.c.a.g.l);
        com.flurry.a.a.a.c.a.o oVar = (com.flurry.a.a.a.c.a.o) this.a.c();
        int k = this.c.k();
        if (k < 0 || k >= oVar.A) {
            throw new com.flurry.a.a.a.b("Enumeration out of range: max is " + oVar.A + " but received " + k);
        }
        return k;
    }

    @Override // com.flurry.a.a.a.c.p
    public final long l() {
        this.a.a(com.flurry.a.a.a.c.a.g.n);
        long l = this.c.l();
        if (l == 0) {
            this.a.a(com.flurry.a.a.a.c.a.g.o);
        }
        return l;
    }

    @Override // com.flurry.a.a.a.c.p
    public final long m() {
        this.a.b();
        long m = this.c.m();
        if (m == 0) {
            this.a.a(com.flurry.a.a.a.c.a.g.o);
        }
        return m;
    }

    @Override // com.flurry.a.a.a.c.p
    public final long n() {
        this.a.a(com.flurry.a.a.a.c.a.g.n);
        long n = this.c.n();
        while (n != 0) {
            while (true) {
                long j = n - 1;
                if (n > 0) {
                    this.a.f();
                    n = j;
                }
            }
            n = this.c.n();
        }
        this.a.a(com.flurry.a.a.a.c.a.g.o);
        return 0L;
    }

    @Override // com.flurry.a.a.a.c.p
    public final long o() {
        this.a.a(com.flurry.a.a.a.c.a.g.p);
        long o = this.c.o();
        if (o == 0) {
            this.a.a(com.flurry.a.a.a.c.a.g.q);
        }
        return o;
    }

    @Override // com.flurry.a.a.a.c.p
    public final long p() {
        this.a.b();
        long p = this.c.p();
        if (p == 0) {
            this.a.a(com.flurry.a.a.a.c.a.g.q);
        }
        return p;
    }

    @Override // com.flurry.a.a.a.c.p
    public final long q() {
        this.a.a(com.flurry.a.a.a.c.a.g.p);
        long q = this.c.q();
        while (q != 0) {
            while (true) {
                long j = q - 1;
                if (q > 0) {
                    this.a.f();
                    q = j;
                }
            }
            q = this.c.q();
        }
        this.a.a(com.flurry.a.a.a.c.a.g.q);
        return 0L;
    }

    @Override // com.flurry.a.a.a.c.p
    public int r() {
        this.a.a(com.flurry.a.a.a.c.a.g.m);
        com.flurry.a.a.a.c.a.h hVar = (com.flurry.a.a.a.c.a.h) this.a.c();
        int r = this.c.r();
        this.a.c(hVar.a(r));
        return r;
    }

    public com.flurry.a.a.a.c.a.g a(com.flurry.a.a.a.c.a.g gVar, com.flurry.a.a.a.c.a.g gVar2) {
        return null;
    }
}
