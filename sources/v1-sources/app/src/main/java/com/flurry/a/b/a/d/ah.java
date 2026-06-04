package com.flurry.a.b.a.d;

import java.text.DateFormat;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ah implements j {
    protected static final DateFormat d = com.flurry.a.b.a.d.i.z.f;
    protected ai e;
    protected HashMap f;
    protected boolean g;
    protected com.flurry.a.b.a.d.f.b h;

    public abstract e a(com.flurry.a.b.a.g.a aVar);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    protected ah(i iVar, b bVar, com.flurry.a.b.a.d.e.x xVar, com.flurry.a.b.a.d.h.k kVar) {
        this.e = new ai(iVar, bVar, xVar, kVar, d);
        this.h = null;
        this.g = true;
    }

    protected ah(ah ahVar, ai aiVar, com.flurry.a.b.a.d.f.b bVar) {
        this.e = aiVar;
        this.h = bVar;
        this.g = true;
        this.f = ahVar.f;
    }

    public final i i() {
        return this.e.a();
    }

    public b a() {
        return this.e.b();
    }

    public com.flurry.a.b.a.d.e.x e() {
        return this.e.c();
    }

    public final an j() {
        return this.e.d();
    }

    public final u k() {
        return this.e.h();
    }

    @Override // com.flurry.a.b.a.d.j
    public final Class a(Class cls) {
        if (this.f == null) {
            return null;
        }
        return (Class) this.f.get(new com.flurry.a.b.a.d.h.b(cls));
    }

    public final com.flurry.a.b.a.d.f.d l() {
        return this.e.f();
    }

    public final com.flurry.a.b.a.d.f.b m() {
        if (this.h == null) {
            this.h = new com.flurry.a.b.a.d.f.a.l();
        }
        return this.h;
    }

    public final com.flurry.a.b.a.d.h.k n() {
        return this.e.e();
    }

    public final com.flurry.a.b.a.g.a e(Class cls) {
        return this.e.e().a(cls, (com.flurry.a.b.a.d.h.j) null);
    }

    public final com.flurry.a.b.a.g.a a(com.flurry.a.b.a.g.a aVar, Class cls) {
        return this.e.e().a(aVar, cls);
    }

    public final DateFormat o() {
        return this.e.g();
    }

    public final e f(Class cls) {
        return a(e(cls));
    }

    public final com.flurry.a.b.a.d.f.d g(Class cls) {
        com.flurry.a.b.a.d.f.d d2;
        u h = this.e.h();
        return (h == null || (d2 = h.d()) == null) ? (com.flurry.a.b.a.d.f.d) com.flurry.a.b.a.d.i.l.a(cls, c()) : d2;
    }

    public final com.flurry.a.b.a.d.f.c h(Class cls) {
        com.flurry.a.b.a.d.f.c e;
        u h = this.e.h();
        return (h == null || (e = h.e()) == null) ? (com.flurry.a.b.a.d.f.c) com.flurry.a.b.a.d.i.l.a(cls, c()) : e;
    }
}
