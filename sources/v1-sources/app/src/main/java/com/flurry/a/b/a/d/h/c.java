package com.flurry.a.b.a.d.h;

import java.util.Collection;

/* loaded from: classes.dex */
public class c extends i {
    protected final com.flurry.a.b.a.g.a a;

    protected c(Class cls, com.flurry.a.b.a.g.a aVar, Object obj, Object obj2) {
        super(cls, aVar.hashCode(), obj, obj2);
        this.a = aVar;
    }

    @Override // com.flurry.a.b.a.g.a
    protected com.flurry.a.b.a.g.a a(Class cls) {
        return new c(cls, this.a, this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public com.flurry.a.b.a.g.a b(Class cls) {
        return cls == this.a.p() ? this : new c(this.d, this.a.f(cls), this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public com.flurry.a.b.a.g.a c(Class cls) {
        return cls == this.a.p() ? this : new c(this.d, this.a.h(cls), this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c c(Object obj) {
        return new c(this.d, this.a, this.f, obj);
    }

    @Override // com.flurry.a.b.a.g.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c b(Object obj) {
        return new c(this.d, this.a.c(obj), this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c a(Object obj) {
        return new c(this.d, this.a, obj, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean f() {
        return true;
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean i() {
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
    public final String a(int i) {
        if (i == 0) {
            return "E";
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.h.i
    protected final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.getName());
        if (this.a != null) {
            sb.append('<');
            sb.append(this.a.m());
            sb.append('>');
        }
        return sb.toString();
    }

    public final boolean f_() {
        return Collection.class.isAssignableFrom(this.d);
    }

    @Override // com.flurry.a.b.a.g.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            c cVar = (c) obj;
            return this.d == cVar.d && this.a.equals(cVar.a);
        }
        return false;
    }

    @Override // com.flurry.a.b.a.g.a
    public String toString() {
        return "[collection-like type; class " + this.d.getName() + ", contains " + this.a + "]";
    }
}
