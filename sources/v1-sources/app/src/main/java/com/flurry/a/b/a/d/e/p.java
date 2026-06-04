package com.flurry.a.b.a.d.e;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public class p implements s {
    @Override // com.flurry.a.b.a.d.e.s
    public boolean a(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        switch (method.getParameterTypes().length) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return false;
        }
    }
}
