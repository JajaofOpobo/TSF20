package com.flurry.a.b.a.d.g.b;

import java.util.Date;

/* loaded from: classes.dex */
public final class as extends v {
    static final as a = new as();

    public as() {
        super(Object.class);
    }

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        if (obj instanceof Date) {
            awVar.b((Date) obj, eVar);
        } else {
            eVar.a(obj.toString());
        }
    }
}
