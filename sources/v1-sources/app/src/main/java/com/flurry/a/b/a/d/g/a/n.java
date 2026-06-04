package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.at;
import com.flurry.a.b.a.d.aw;
import com.flurry.a.b.a.d.az;
import com.flurry.a.b.a.d.g.b.v;
import com.flurry.a.b.a.d.y;

/* loaded from: classes.dex */
public final class n extends v {
    public n() {
        super(Object.class);
    }

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        if (awVar.a(at.FAIL_ON_EMPTY_BEANS)) {
            a(obj);
        }
        eVar.d();
        eVar.e();
    }

    @Override // com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar, az azVar) {
        if (awVar.a(at.FAIL_ON_EMPTY_BEANS)) {
            a(obj);
        }
        azVar.b(obj, eVar);
        azVar.e(obj, eVar);
    }

    private static void a(Object obj) {
        throw new y("No serializer found for class " + obj.getClass().getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS) )");
    }
}
