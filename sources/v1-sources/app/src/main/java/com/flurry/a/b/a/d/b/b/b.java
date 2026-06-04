package com.flurry.a.b.a.d.b.b;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b extends bw implements com.flurry.a.b.a.d.aq {
    protected final com.flurry.a.b.a.g.a a;
    protected final com.flurry.a.b.a.d.f b;
    protected com.flurry.a.b.a.d.w c;

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return new AtomicReference(this.c.a(jVar, pVar));
    }

    public b(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        super(AtomicReference.class);
        this.a = aVar;
        this.b = fVar;
    }

    @Override // com.flurry.a.b.a.d.aq
    public final void a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar) {
        this.c = sVar.a(nVar, this.a, this.b);
    }
}
