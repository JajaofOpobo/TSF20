package com.flurry.a.b.a.d;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class as extends ak {
    protected com.flurry.a.b.a.d.a.h a;
    protected Class b;
    protected com.flurry.a.b.a.d.g.j c;

    public as(i iVar, b bVar, com.flurry.a.b.a.d.e.x xVar, com.flurry.a.b.a.d.h.k kVar) {
        super(iVar, bVar, xVar, kVar, i(at.class));
        this.a = null;
        this.c = null;
    }

    private as(as asVar, HashMap hashMap, com.flurry.a.b.a.d.f.b bVar) {
        this(asVar, asVar.e);
        this.f = hashMap;
        this.h = bVar;
    }

    private as(as asVar, ai aiVar) {
        super(asVar, aiVar, asVar.h);
        this.a = null;
        this.a = asVar.a;
        this.b = asVar.b;
        this.c = asVar.c;
    }

    public final as a(com.flurry.a.b.a.d.f.b bVar) {
        HashMap hashMap = this.f;
        this.g = true;
        return new as(this, hashMap, bVar);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final b a() {
        return a(at.USE_ANNOTATIONS) ? super.a() : com.flurry.a.b.a.d.e.t.a;
    }

    @Override // com.flurry.a.b.a.d.ah
    public final e a(com.flurry.a.b.a.g.a aVar) {
        return i().a((ah) this, aVar, (j) this);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final boolean b() {
        return a(at.USE_ANNOTATIONS);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final boolean c() {
        return a(at.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final boolean d() {
        return a(at.SORT_PROPERTIES_ALPHABETICALLY);
    }

    @Override // com.flurry.a.b.a.d.ah
    public final com.flurry.a.b.a.d.e.x e() {
        com.flurry.a.b.a.d.e.x e = super.e();
        if (!a(at.AUTO_DETECT_GETTERS)) {
            e = e.a(com.flurry.a.b.a.a.f.NONE);
        }
        if (!a(at.AUTO_DETECT_IS_GETTERS)) {
            e = e.b(com.flurry.a.b.a.a.f.NONE);
        }
        if (!a(at.AUTO_DETECT_FIELDS)) {
            return e.e(com.flurry.a.b.a.a.f.NONE);
        }
        return e;
    }

    public final boolean a(at atVar) {
        return (this.i & atVar.b()) != 0;
    }

    public final Class f() {
        return this.b;
    }

    public final com.flurry.a.b.a.d.a.h g() {
        if (this.a != null) {
            return this.a;
        }
        return a(at.WRITE_NULL_PROPERTIES) ? com.flurry.a.b.a.d.a.h.ALWAYS : com.flurry.a.b.a.d.a.h.NON_NULL;
    }

    public final com.flurry.a.b.a.d.g.j h() {
        return this.c;
    }

    public final e b(com.flurry.a.b.a.g.a aVar) {
        return i().a(this, aVar, (j) this);
    }

    public final ac b(Class cls) {
        ac c;
        u k = k();
        return (k == null || (c = k.c()) == null) ? (ac) com.flurry.a.b.a.d.i.l.a(cls, a(at.CAN_OVERRIDE_ACCESS_MODIFIERS)) : c;
    }

    public final String toString() {
        return "[SerializationConfig: flags=0x" + Integer.toHexString(this.i) + "]";
    }
}
