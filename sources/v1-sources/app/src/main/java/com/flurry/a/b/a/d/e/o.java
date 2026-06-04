package com.flurry.a.b.a.d.e;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class o extends p {
    @Override // com.flurry.a.b.a.d.e.p, com.flurry.a.b.a.d.e.s
    public final boolean a(Method method) {
        if (super.a(method)) {
            return true;
        }
        if (!com.flurry.a.b.a.d.i.l.a(method)) {
            return false;
        }
        Class<?> returnType = method.getReturnType();
        return Collection.class.isAssignableFrom(returnType) || Map.class.isAssignableFrom(returnType);
    }
}
