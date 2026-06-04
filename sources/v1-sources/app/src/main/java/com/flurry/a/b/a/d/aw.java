package com.flurry.a.b.a.d;

import java.lang.reflect.Type;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class aw {
    protected static final com.flurry.a.b.a.g.a a;
    protected final as b;
    protected final Class c;

    public abstract ac a(com.flurry.a.b.a.g.a aVar);

    public abstract ac a(com.flurry.a.b.a.g.a aVar, f fVar);

    public abstract ac a(Class cls, f fVar);

    public abstract void a(long j, com.flurry.a.b.a.e eVar);

    public abstract void a(as asVar, com.flurry.a.b.a.e eVar, Object obj, au auVar);

    public abstract void a(Date date, com.flurry.a.b.a.e eVar);

    public abstract ac b(com.flurry.a.b.a.g.a aVar, f fVar);

    public abstract ac b(Class cls, f fVar);

    public abstract void b(long j, com.flurry.a.b.a.e eVar);

    public abstract void b(Date date, com.flurry.a.b.a.e eVar);

    public abstract ac c();

    public abstract ac d();

    static {
        com.flurry.a.b.a.d.h.k.a();
        a = com.flurry.a.b.a.d.h.k.a(Object.class);
    }

    protected aw(as asVar) {
        this.b = asVar;
        this.c = asVar == null ? null : this.b.f();
    }

    public final boolean a(at atVar) {
        return this.b.a(atVar);
    }

    public final Class a() {
        return this.c;
    }

    public final com.flurry.a.b.a.d.g.j b() {
        return this.b.h();
    }

    public final com.flurry.a.b.a.g.a a(Type type) {
        return this.b.n().a(type);
    }

    public final com.flurry.a.b.a.g.a a(com.flurry.a.b.a.g.a aVar, Class cls) {
        return this.b.a(aVar, cls);
    }

    public final void a(Object obj, com.flurry.a.b.a.e eVar) {
        if (obj == null) {
            d().a(null, eVar, this);
        } else {
            b(obj.getClass(), (f) null).a(obj, eVar, this);
        }
    }

    public final void a(com.flurry.a.b.a.e eVar) {
        d().a(null, eVar, this);
    }
}
