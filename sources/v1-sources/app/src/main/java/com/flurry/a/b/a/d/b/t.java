package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ay;

/* loaded from: classes.dex */
public final class t extends com.flurry.a.b.a.d.w {
    final ay a;
    final com.flurry.a.b.a.d.w b;

    public t(ay ayVar, com.flurry.a.b.a.d.w wVar) {
        this.a = ayVar;
        this.b = wVar;
    }

    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return this.b.a(jVar, pVar, this.a);
    }

    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, ay ayVar) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }
}
