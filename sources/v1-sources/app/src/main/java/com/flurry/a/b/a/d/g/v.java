package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.aw;
import com.flurry.a.b.a.d.az;

/* loaded from: classes.dex */
final class v extends com.flurry.a.b.a.d.ac {
    protected final az a;
    protected final com.flurry.a.b.a.d.ac b;

    public v(az azVar, com.flurry.a.b.a.d.ac acVar) {
        this.a = azVar;
        this.b = acVar;
    }

    @Override // com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        this.b.a(obj, eVar, awVar, this.a);
    }

    @Override // com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar, az azVar) {
        this.b.a(obj, eVar, awVar, azVar);
    }

    @Override // com.flurry.a.b.a.d.ac
    public final Class c() {
        return Object.class;
    }
}
