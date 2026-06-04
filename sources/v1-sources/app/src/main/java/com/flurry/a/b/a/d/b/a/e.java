package com.flurry.a.b.a.d.b.a;

import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.w;

/* loaded from: classes.dex */
public final class e extends com.flurry.a.b.a.d.b.k {
    protected final com.flurry.a.b.a.d.e.h i;
    protected final Object j;

    public e(String str, com.flurry.a.b.a.g.a aVar, ay ayVar, com.flurry.a.b.a.d.i.a aVar2, com.flurry.a.b.a.d.e.h hVar, int i, Object obj) {
        super(str, aVar, ayVar, aVar2);
        this.i = hVar;
        this.h = i;
        this.j = obj;
    }

    private e(e eVar, w wVar) {
        super(eVar, wVar);
        this.i = eVar.i;
        this.j = eVar.j;
    }

    @Override // com.flurry.a.b.a.d.b.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e a(w wVar) {
        return new e(this, wVar);
    }

    @Override // com.flurry.a.b.a.d.b.k, com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.d.e.e b() {
        return this.i;
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        a(jVar, pVar);
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(Object obj, Object obj2) {
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final Object j() {
        return this.j;
    }
}
