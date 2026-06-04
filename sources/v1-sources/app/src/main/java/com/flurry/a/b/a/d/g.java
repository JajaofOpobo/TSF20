package com.flurry.a.b.a.d;

/* loaded from: classes.dex */
public class g implements f {
    protected final String a;
    protected final com.flurry.a.b.a.g.a b;
    protected final com.flurry.a.b.a.d.e.e c;
    protected final com.flurry.a.b.a.d.i.a d;

    public g(String str, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.i.a aVar2, com.flurry.a.b.a.d.e.e eVar) {
        this.a = str;
        this.b = aVar;
        this.c = eVar;
        this.d = aVar2;
    }

    public final g a(com.flurry.a.b.a.g.a aVar) {
        return new g(this.a, aVar, this.d, this.c);
    }

    public final String c() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.g.a a() {
        return this.b;
    }

    @Override // com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.d.e.e b() {
        return this.c;
    }
}
