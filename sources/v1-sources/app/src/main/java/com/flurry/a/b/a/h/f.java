package com.flurry.a.b.a.h;

import com.flurry.a.b.a.q;

/* loaded from: classes.dex */
public final class f implements q {
    protected com.flurry.a.b.a.b.a a = new g();
    protected com.flurry.a.b.a.b.a b = new h();
    protected boolean c = true;
    protected int d = 0;

    @Override // com.flurry.a.b.a.q
    public final void a(com.flurry.a.b.a.e eVar) {
        eVar.a(' ');
    }

    @Override // com.flurry.a.b.a.q
    public final void b(com.flurry.a.b.a.e eVar) {
        eVar.a('{');
        if (!this.b.a()) {
            this.d++;
        }
    }

    @Override // com.flurry.a.b.a.q
    public final void h(com.flurry.a.b.a.e eVar) {
        this.b.a(eVar, this.d);
    }

    @Override // com.flurry.a.b.a.q
    public final void d(com.flurry.a.b.a.e eVar) {
        if (this.c) {
            eVar.c(" : ");
        } else {
            eVar.a(':');
        }
    }

    @Override // com.flurry.a.b.a.q
    public final void c(com.flurry.a.b.a.e eVar) {
        eVar.a(',');
        this.b.a(eVar, this.d);
    }

    @Override // com.flurry.a.b.a.q
    public final void a(com.flurry.a.b.a.e eVar, int i) {
        if (!this.b.a()) {
            this.d--;
        }
        if (i > 0) {
            this.b.a(eVar, this.d);
        } else {
            eVar.a(' ');
        }
        eVar.a('}');
    }

    @Override // com.flurry.a.b.a.q
    public final void e(com.flurry.a.b.a.e eVar) {
        if (!this.a.a()) {
            this.d++;
        }
        eVar.a('[');
    }

    @Override // com.flurry.a.b.a.q
    public final void g(com.flurry.a.b.a.e eVar) {
        this.a.a(eVar, this.d);
    }

    @Override // com.flurry.a.b.a.q
    public final void f(com.flurry.a.b.a.e eVar) {
        eVar.a(',');
        this.a.a(eVar, this.d);
    }

    @Override // com.flurry.a.b.a.q
    public final void b(com.flurry.a.b.a.e eVar, int i) {
        if (!this.a.a()) {
            this.d--;
        }
        if (i > 0) {
            this.a.a(eVar, this.d);
        } else {
            eVar.a(' ');
        }
        eVar.a(']');
    }
}
