package com.flurry.a.b.a.d.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class h extends e {
    protected final i a;
    protected final Type c;
    protected final int d;

    public h(i iVar, Type type, j jVar, int i) {
        super(jVar);
        this.a = iVar;
        this.c = type;
        this.d = i;
    }

    public final h a(j jVar) {
        return jVar == this.b ? this : this.a.a(this.d, jVar);
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final AnnotatedElement a() {
        return null;
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final String b() {
        return "";
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Annotation a(Class cls) {
        return this.b.a(cls);
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Type c() {
        return this.c;
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Class d() {
        if (this.c instanceof Class) {
            return (Class) this.c;
        }
        return com.flurry.a.b.a.d.h.k.a().a(this.c).p();
    }

    @Override // com.flurry.a.b.a.d.e.e
    public final Class i() {
        return this.a.i();
    }

    @Override // com.flurry.a.b.a.d.e.e
    public final Member j() {
        return this.a.j();
    }

    @Override // com.flurry.a.b.a.d.e.e
    public final void a(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + this.a.i().getName());
    }

    public final Type e() {
        return this.c;
    }

    public final i f() {
        return this.a;
    }

    public final int g() {
        return this.d;
    }

    public final String toString() {
        return "[parameter #" + this.d + ", annotations: " + this.b + "]";
    }
}
