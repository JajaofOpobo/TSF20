package com.flurry.a.b.a.d.e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r {
    static final Class[] a = new Class[0];
    final String b;
    final Class[] c;

    public r(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public r(Constructor constructor) {
        this("", constructor.getParameterTypes());
    }

    public r(String str, Class[] clsArr) {
        this.b = str;
        this.c = clsArr == null ? a : clsArr;
    }

    public final String toString() {
        return this.b + "(" + this.c.length + "-args)";
    }

    public final int hashCode() {
        return this.b.hashCode() + this.c.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            r rVar = (r) obj;
            if (!this.b.equals(rVar.b)) {
                return false;
            }
            Class[] clsArr = rVar.c;
            int length = this.c.length;
            if (clsArr.length != length) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                Class<?> cls = clsArr[i];
                Class cls2 = this.c[i];
                if (cls != cls2 && !cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
