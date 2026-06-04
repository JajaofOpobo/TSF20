package com.flurry.a.b.a.d.h;

import com.flurry.a.b.a.d.ab;
import com.flurry.a.b.a.d.aw;
import com.flurry.a.b.a.d.az;

/* loaded from: classes.dex */
public abstract class i extends com.flurry.a.b.a.g.a implements ab {
    volatile String c;

    protected abstract String a();

    protected i(Class cls, int i, Object obj, Object obj2) {
        super(cls, i);
        this.f = obj;
        this.g = obj2;
    }

    @Override // com.flurry.a.b.a.g.a
    public final String m() {
        String str = this.c;
        if (str == null) {
            return a();
        }
        return str;
    }

    @Override // com.flurry.a.b.a.g.a
    public final Object n() {
        return this.f;
    }

    @Override // com.flurry.a.b.a.g.a
    public final Object o() {
        return this.g;
    }

    @Override // com.flurry.a.b.a.d.ab
    public final void a(com.flurry.a.b.a.e eVar, aw awVar, az azVar) {
        azVar.a(this, eVar);
        a(eVar, awVar);
        azVar.d(this, eVar);
    }

    @Override // com.flurry.a.b.a.d.aa
    public final void a(com.flurry.a.b.a.e eVar, aw awVar) {
        eVar.b(m());
    }
}
