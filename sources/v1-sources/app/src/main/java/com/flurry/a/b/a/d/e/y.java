package com.flurry.a.b.a.d.e;

/* loaded from: classes.dex */
public class y implements x {
    protected static final y a = new y((com.flurry.a.b.a.a.d) y.class.getAnnotation(com.flurry.a.b.a.a.d.class));
    protected final com.flurry.a.b.a.a.f b;
    protected final com.flurry.a.b.a.a.f c;
    protected final com.flurry.a.b.a.a.f d;
    protected final com.flurry.a.b.a.a.f e;
    protected final com.flurry.a.b.a.a.f f;

    @Override // com.flurry.a.b.a.d.e.x
    public final /* synthetic */ x a(com.flurry.a.b.a.a.d dVar) {
        if (dVar == null) {
            return this;
        }
        com.flurry.a.b.a.a.n[] a2 = dVar.a();
        return a(a(a2, com.flurry.a.b.a.a.n.GETTER) ? dVar.b() : com.flurry.a.b.a.a.f.NONE).b(a(a2, com.flurry.a.b.a.a.n.IS_GETTER) ? dVar.c() : com.flurry.a.b.a.a.f.NONE).c(a(a2, com.flurry.a.b.a.a.n.SETTER) ? dVar.d() : com.flurry.a.b.a.a.f.NONE).d(a(a2, com.flurry.a.b.a.a.n.CREATOR) ? dVar.e() : com.flurry.a.b.a.a.f.NONE).e(a(a2, com.flurry.a.b.a.a.n.FIELD) ? dVar.f() : com.flurry.a.b.a.a.f.NONE);
    }

    public static y a() {
        return a;
    }

    private y(com.flurry.a.b.a.a.d dVar) {
        com.flurry.a.b.a.a.n[] a2 = dVar.a();
        this.b = a(a2, com.flurry.a.b.a.a.n.GETTER) ? dVar.b() : com.flurry.a.b.a.a.f.NONE;
        this.c = a(a2, com.flurry.a.b.a.a.n.IS_GETTER) ? dVar.c() : com.flurry.a.b.a.a.f.NONE;
        this.d = a(a2, com.flurry.a.b.a.a.n.SETTER) ? dVar.d() : com.flurry.a.b.a.a.f.NONE;
        this.e = a(a2, com.flurry.a.b.a.a.n.CREATOR) ? dVar.e() : com.flurry.a.b.a.a.f.NONE;
        this.f = a(a2, com.flurry.a.b.a.a.n.FIELD) ? dVar.f() : com.flurry.a.b.a.a.f.NONE;
    }

    private y(com.flurry.a.b.a.a.f fVar, com.flurry.a.b.a.a.f fVar2, com.flurry.a.b.a.a.f fVar3, com.flurry.a.b.a.a.f fVar4, com.flurry.a.b.a.a.f fVar5) {
        this.b = fVar;
        this.c = fVar2;
        this.d = fVar3;
        this.e = fVar4;
        this.f = fVar5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.e.x
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y a(com.flurry.a.b.a.a.f fVar) {
        com.flurry.a.b.a.a.f fVar2 = fVar == com.flurry.a.b.a.a.f.DEFAULT ? a.b : fVar;
        return this.b == fVar2 ? this : new y(fVar2, this.c, this.d, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.e.x
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public y b(com.flurry.a.b.a.a.f fVar) {
        com.flurry.a.b.a.a.f fVar2 = fVar == com.flurry.a.b.a.a.f.DEFAULT ? a.c : fVar;
        return this.c == fVar2 ? this : new y(this.b, fVar2, this.d, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.e.x
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public y c(com.flurry.a.b.a.a.f fVar) {
        com.flurry.a.b.a.a.f fVar2 = fVar == com.flurry.a.b.a.a.f.DEFAULT ? a.d : fVar;
        return this.d == fVar2 ? this : new y(this.b, this.c, fVar2, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.e.x
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public y d(com.flurry.a.b.a.a.f fVar) {
        com.flurry.a.b.a.a.f fVar2 = fVar == com.flurry.a.b.a.a.f.DEFAULT ? a.e : fVar;
        return this.e == fVar2 ? this : new y(this.b, this.c, this.d, fVar2, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.e.x
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public y e(com.flurry.a.b.a.a.f fVar) {
        com.flurry.a.b.a.a.f fVar2 = fVar == com.flurry.a.b.a.a.f.DEFAULT ? a.f : fVar;
        return this.f == fVar2 ? this : new y(this.b, this.c, this.d, this.e, fVar2);
    }

    @Override // com.flurry.a.b.a.d.e.x
    public final boolean a(e eVar) {
        return this.e.a(eVar.j());
    }

    @Override // com.flurry.a.b.a.d.e.x
    public final boolean a(d dVar) {
        return this.f.a(dVar.e());
    }

    @Override // com.flurry.a.b.a.d.e.x
    public final boolean a(f fVar) {
        return this.b.a(fVar.e());
    }

    @Override // com.flurry.a.b.a.d.e.x
    public final boolean b(f fVar) {
        return this.c.a(fVar.e());
    }

    @Override // com.flurry.a.b.a.d.e.x
    public final boolean c(f fVar) {
        return this.d.a(fVar.e());
    }

    private static boolean a(com.flurry.a.b.a.a.n[] nVarArr, com.flurry.a.b.a.a.n nVar) {
        for (com.flurry.a.b.a.a.n nVar2 : nVarArr) {
            if (nVar2 == nVar || nVar2 == com.flurry.a.b.a.a.n.ALL) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "[Visibility: getter: " + this.b + ", isGetter: " + this.c + ", setter: " + this.d + ", creator: " + this.e + ", field: " + this.f + "]";
    }
}
