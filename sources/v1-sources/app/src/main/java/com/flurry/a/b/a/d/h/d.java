package com.flurry.a.b.a.d.h;

/* loaded from: classes.dex */
public final class d extends c {
    private d(Class cls, com.flurry.a.b.a.g.a aVar, Object obj, Object obj2) {
        super(cls, aVar, obj, obj2);
    }

    @Override // com.flurry.a.b.a.d.h.c, com.flurry.a.b.a.g.a
    protected final com.flurry.a.b.a.g.a a(Class cls) {
        return new d(cls, this.a, null, null);
    }

    @Override // com.flurry.a.b.a.d.h.c, com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a b(Class cls) {
        return cls == this.a.p() ? this : new d(this.d, this.a.f(cls), this.f, this.g);
    }

    @Override // com.flurry.a.b.a.d.h.c, com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a c(Class cls) {
        return cls == this.a.p() ? this : new d(this.d, this.a.h(cls), this.f, this.g);
    }

    public static d a(Class cls, com.flurry.a.b.a.g.a aVar) {
        return new d(cls, aVar, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.h.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public d c(Object obj) {
        return new d(this.d, this.a, this.f, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.h.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public d b(Object obj) {
        return new d(this.d, this.a.c(obj), this.f, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.h.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d a(Object obj) {
        return new d(this.d, this.a, obj, this.g);
    }

    @Override // com.flurry.a.b.a.d.h.c, com.flurry.a.b.a.g.a
    public final String toString() {
        return "[collection type; class " + this.d.getName() + ", contains " + this.a + "]";
    }
}
