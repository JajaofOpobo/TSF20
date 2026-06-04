package com.flurry.a.b.a.d;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class z implements Serializable {
    protected Object a;
    protected String b;
    protected int c;

    protected z() {
        this.c = -1;
    }

    public z(Object obj, String str) {
        this.c = -1;
        this.a = obj;
        if (str == null) {
            throw new NullPointerException("Can not pass null fieldName");
        }
        this.b = str;
    }

    public z(Object obj, int i) {
        this.c = -1;
        this.a = obj;
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = this.a instanceof Class ? (Class) this.a : this.a.getClass();
        Package r2 = cls.getPackage();
        if (r2 != null) {
            sb.append(r2.getName());
            sb.append('.');
        }
        sb.append(cls.getSimpleName());
        sb.append('[');
        if (this.b != null) {
            sb.append('\"');
            sb.append(this.b);
            sb.append('\"');
        } else if (this.c >= 0) {
            sb.append(this.c);
        } else {
            sb.append('?');
        }
        sb.append(']');
        return sb.toString();
    }
}
