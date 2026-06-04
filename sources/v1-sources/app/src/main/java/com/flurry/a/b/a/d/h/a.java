package com.flurry.a.b.a.d.h;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class a extends i {
    protected final com.flurry.a.b.a.g.a a;
    protected final Object b;

    @Override // com.flurry.a.b.a.g.a
    public final /* synthetic */ com.flurry.a.b.a.g.a a(Object obj) {
        return obj == this.f ? this : new a(this.a, this.b, obj, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public final /* synthetic */ com.flurry.a.b.a.g.a b(Object obj) {
        return obj == this.a.o() ? this : new a(this.a.c(obj), this.b, this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public final /* synthetic */ com.flurry.a.b.a.g.a c(Object obj) {
        return obj == this.g ? this : new a(this.a, this.b, this.f, obj);
    }

    private a(com.flurry.a.b.a.g.a aVar, Object obj, Object obj2, Object obj3) {
        super(obj.getClass(), aVar.hashCode(), obj2, obj3);
        this.a = aVar;
        this.b = obj;
    }

    public static a a(com.flurry.a.b.a.g.a aVar) {
        return new a(aVar, Array.newInstance((Class<?>) aVar.p(), 0), null, null);
    }

    @Override // com.flurry.a.b.a.d.h.i
    protected final String a() {
        return this.d.getName();
    }

    @Override // com.flurry.a.b.a.g.a
    protected final com.flurry.a.b.a.g.a a(Class cls) {
        if (!cls.isArray()) {
            throw new IllegalArgumentException("Incompatible narrowing operation: trying to narrow " + toString() + " to class " + cls.getName());
        }
        com.flurry.a.b.a.g.a a = k.a().a((Type) cls.getComponentType());
        Object obj = this.f;
        Object obj2 = this.g;
        return a(a);
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a b(Class cls) {
        if (cls == this.a.p()) {
            return this;
        }
        com.flurry.a.b.a.g.a f = this.a.f(cls);
        Object obj = this.f;
        Object obj2 = this.g;
        return a(f);
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a c(Class cls) {
        if (cls == this.a.p()) {
            return this;
        }
        com.flurry.a.b.a.g.a h = this.a.h(cls);
        Object obj = this.f;
        Object obj2 = this.g;
        return a(h);
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean b() {
        return true;
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean c() {
        return false;
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean d() {
        return true;
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean e() {
        return this.a.e();
    }

    @Override // com.flurry.a.b.a.g.a
    public final String a(int i) {
        if (i == 0) {
            return "E";
        }
        return null;
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean f() {
        return true;
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a g() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.g.a
    public final int h() {
        return 1;
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a b(int i) {
        if (i == 0) {
            return this.a;
        }
        return null;
    }

    @Override // com.flurry.a.b.a.g.a
    public final String toString() {
        return "[array type, component type: " + this.a + "]";
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.a.equals(((a) obj).a);
    }
}
