package com.flurry.a.b.a.d.h;

/* loaded from: classes.dex */
public final class g extends f {
    private g(Class cls, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.g.a aVar2, Object obj, Object obj2) {
        super(cls, aVar, aVar2, obj, obj2);
    }

    public static g a(Class cls, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.g.a aVar2) {
        return new g(cls, aVar, aVar2, null, null);
    }

    @Override // com.flurry.a.b.a.d.h.f, com.flurry.a.b.a.g.a
    protected final com.flurry.a.b.a.g.a a(Class cls) {
        return new g(cls, this.a, this.b, this.f, this.g);
    }

    @Override // com.flurry.a.b.a.d.h.f, com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a b(Class cls) {
        return cls == this.b.p() ? this : new g(this.d, this.a, this.b.f(cls), this.f, this.g);
    }

    @Override // com.flurry.a.b.a.d.h.f, com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a c(Class cls) {
        return cls == this.b.p() ? this : new g(this.d, this.a, this.b.h(cls), this.f, this.g);
    }

    @Override // com.flurry.a.b.a.d.h.f
    public final com.flurry.a.b.a.g.a d(Class cls) {
        return cls == this.a.p() ? this : new g(this.d, this.a.f(cls), this.b, this.f, this.g);
    }

    @Override // com.flurry.a.b.a.d.h.f
    public final com.flurry.a.b.a.g.a e(Class cls) {
        return cls == this.a.p() ? this : new g(this.d, this.a.h(cls), this.b, this.f, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.h.f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public g c(Object obj) {
        return new g(this.d, this.a, this.b, this.f, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.h.f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public g b(Object obj) {
        return new g(this.d, this.a, this.b.c(obj), this.f, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.h.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public g a(Object obj) {
        return new g(this.d, this.a, this.b, obj, this.g);
    }

    @Override // com.flurry.a.b.a.d.h.f, com.flurry.a.b.a.g.a
    public final String toString() {
        return "[map type; class " + this.d.getName() + ", " + this.a + " -> " + this.b + "]";
    }
}
