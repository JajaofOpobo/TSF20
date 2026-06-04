package com.flurry.a.b.a.d;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class n extends ak {
    protected com.flurry.a.b.a.d.i.s a;
    protected final com.flurry.a.b.a.e.l b;
    protected boolean c;

    public n(i iVar, b bVar, com.flurry.a.b.a.d.e.x xVar, com.flurry.a.b.a.d.h.k kVar) {
        super(iVar, bVar, xVar, kVar, i(o.class));
        this.b = com.flurry.a.b.a.e.l.a;
    }

    private n(n nVar, HashMap hashMap, com.flurry.a.b.a.d.f.b bVar) {
        this(nVar, nVar.e);
        this.f = hashMap;
        this.h = bVar;
    }

    private n(n nVar, ai aiVar) {
        super(nVar, aiVar, nVar.h);
        this.a = nVar.a;
        this.b = nVar.b;
        this.c = nVar.c;
    }

    protected final n a(int i) {
        this.c = (at.SORT_PROPERTIES_ALPHABETICALLY.b() & i) != 0;
        return this;
    }

    public final n a(com.flurry.a.b.a.d.f.b bVar) {
        HashMap hashMap = this.f;
        this.g = true;
        return new n(this, hashMap, bVar);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final b a() {
        return a(o.USE_ANNOTATIONS) ? super.a() : com.flurry.a.b.a.d.e.t.a;
    }

    @Override // com.flurry.a.b.a.d.ah
    public final e a(com.flurry.a.b.a.g.a aVar) {
        return i().a((ah) this, aVar, (j) this);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final boolean b() {
        return a(o.USE_ANNOTATIONS);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final boolean c() {
        return a(o.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final boolean d() {
        return this.c;
    }

    @Override // com.flurry.a.b.a.d.ah
    public final com.flurry.a.b.a.d.e.x e() {
        com.flurry.a.b.a.d.e.x e = super.e();
        if (!a(o.AUTO_DETECT_SETTERS)) {
            e = e.c(com.flurry.a.b.a.a.f.NONE);
        }
        if (!a(o.AUTO_DETECT_CREATORS)) {
            e = e.d(com.flurry.a.b.a.a.f.NONE);
        }
        if (!a(o.AUTO_DETECT_FIELDS)) {
            return e.e(com.flurry.a.b.a.a.f.NONE);
        }
        return e;
    }

    public final boolean a(o oVar) {
        return (this.i & oVar.b()) != 0;
    }

    public final com.flurry.a.b.a.d.i.s f() {
        return this.a;
    }

    public static com.flurry.a.b.a.a g() {
        return com.flurry.a.b.a.b.a();
    }

    public final com.flurry.a.b.a.e.l h() {
        return this.b;
    }

    public final e b(com.flurry.a.b.a.g.a aVar) {
        return i().a(this, aVar, (j) this);
    }

    public final e c(com.flurry.a.b.a.g.a aVar) {
        return i().b(this, aVar, this);
    }

    public final w b(Class cls) {
        w a;
        u k = k();
        return (k == null || (a = k.a()) == null) ? (w) com.flurry.a.b.a.d.i.l.a(cls, a(o.CAN_OVERRIDE_ACCESS_MODIFIERS)) : a;
    }

    public final ae c(Class cls) {
        ae b;
        u k = k();
        return (k == null || (b = k.b()) == null) ? (ae) com.flurry.a.b.a.d.i.l.a(cls, a(o.CAN_OVERRIDE_ACCESS_MODIFIERS)) : b;
    }

    public final com.flurry.a.b.a.d.b.v d(Class cls) {
        k();
        return (com.flurry.a.b.a.d.b.v) com.flurry.a.b.a.d.i.l.a(cls, a(o.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }
}
