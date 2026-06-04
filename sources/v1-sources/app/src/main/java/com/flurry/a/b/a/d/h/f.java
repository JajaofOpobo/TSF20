package com.flurry.a.b.a.d.h;

import java.util.Map;

/* loaded from: classes.dex */
public class f extends i {
    protected final com.flurry.a.b.a.g.a a;
    protected final com.flurry.a.b.a.g.a b;

    protected f(Class cls, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.g.a aVar2, Object obj, Object obj2) {
        super(cls, aVar.hashCode() ^ aVar2.hashCode(), obj, obj2);
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.flurry.a.b.a.g.a
    protected com.flurry.a.b.a.g.a a(Class cls) {
        return new f(cls, this.a, this.b, this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public com.flurry.a.b.a.g.a b(Class cls) {
        return cls == this.b.p() ? this : new f(this.d, this.a, this.b.f(cls), this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public com.flurry.a.b.a.g.a c(Class cls) {
        return cls == this.b.p() ? this : new f(this.d, this.a, this.b.h(cls), this.f, this.g);
    }

    public com.flurry.a.b.a.g.a d(Class cls) {
        return cls == this.a.p() ? this : new f(this.d, this.a.f(cls), this.b, this.f, this.g);
    }

    public com.flurry.a.b.a.g.a e(Class cls) {
        return cls == this.a.p() ? this : new f(this.d, this.a.h(cls), this.b, this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f c(Object obj) {
        return new f(this.d, this.a, this.b, this.f, obj);
    }

    @Override // com.flurry.a.b.a.g.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f b(Object obj) {
        return new f(this.d, this.a, this.b.c(obj), this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f a(Object obj) {
        return new f(this.d, this.a, this.b, obj, this.g);
    }

    @Override // com.flurry.a.b.a.d.h.i
    protected final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.getName());
        if (this.a != null) {
            sb.append('<');
            sb.append(this.a.m());
            sb.append(',');
            sb.append(this.b.m());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean f() {
        return true;
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean j() {
        return true;
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a k() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a g() {
        return this.b;
    }

    @Override // com.flurry.a.b.a.g.a
    public final int h() {
        return 2;
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        return null;
    }

    @Override // com.flurry.a.b.a.g.a
    public final String a(int i) {
        if (i == 0) {
            return "K";
        }
        if (i == 1) {
            return "V";
        }
        return null;
    }

    public final boolean l() {
        return Map.class.isAssignableFrom(this.d);
    }

    @Override // com.flurry.a.b.a.g.a
    public String toString() {
        return "[map-like type; class " + this.d.getName() + ", " + this.a + " -> " + this.b + "]";
    }

    @Override // com.flurry.a.b.a.g.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            f fVar = (f) obj;
            return this.d == fVar.d && this.a.equals(fVar.a) && this.b.equals(fVar.b);
        }
        return false;
    }
}
