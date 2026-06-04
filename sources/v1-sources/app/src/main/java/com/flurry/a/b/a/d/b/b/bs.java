package com.flurry.a.b.a.d.b.b;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class bs extends bf {
    final Method b;

    public bs(Method method) {
        super(method.getDeclaringClass());
        this.b = method;
    }

    @Override // com.flurry.a.b.a.d.b.b.bf
    public final Object b(String str, com.flurry.a.b.a.d.p pVar) {
        return this.b.invoke(null, str);
    }
}
