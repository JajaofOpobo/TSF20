package com.flurry.a.b.a.d.e;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
final class n implements s {
    private n() {
    }

    /* synthetic */ n(byte b) {
        this();
    }

    @Override // com.flurry.a.b.a.d.e.s
    public final boolean a(Method method) {
        return !Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length <= 2;
    }
}
