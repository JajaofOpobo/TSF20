package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.aw;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    protected final Method a;
    protected final com.flurry.a.b.a.d.g.b.n b;

    public a(com.flurry.a.b.a.d.e.f fVar, com.flurry.a.b.a.d.g.b.n nVar) {
        this.a = fVar.e();
        this.b = nVar;
    }

    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        Object invoke = this.a.invoke(obj, new Object[0]);
        if (invoke != null) {
            if (!(invoke instanceof Map)) {
                throw new com.flurry.a.b.a.d.y("Value returned by 'any-getter' (" + this.a.getName() + "()) not java.util.Map but " + invoke.getClass().getName());
            }
            this.b.a((Map) invoke, eVar, awVar);
        }
    }

    public final void a(aw awVar) {
        this.b.a(awVar);
    }
}
