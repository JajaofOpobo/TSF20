package com.flurry.a.b.a.d.h;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class e {
    protected final Type a;
    protected final Class b;
    protected final ParameterizedType c;
    protected e d;
    protected e e;

    public e(Type type) {
        this.a = type;
        if (type instanceof Class) {
            this.b = (Class) type;
            this.c = null;
        } else {
            if (type instanceof ParameterizedType) {
                this.c = (ParameterizedType) type;
                this.b = (Class) this.c.getRawType();
                return;
            }
            throw new IllegalArgumentException("Type " + type.getClass().getName() + " can not be used to construct HierarchicType");
        }
    }

    private e(Type type, Class cls, ParameterizedType parameterizedType, e eVar) {
        this.a = type;
        this.b = cls;
        this.c = parameterizedType;
        this.d = eVar;
        this.e = null;
    }

    public final e a() {
        e a = this.d == null ? null : this.d.a();
        e eVar = new e(this.a, this.b, this.c, a);
        if (a != null) {
            a.e = eVar;
        }
        return eVar;
    }

    public final void a(e eVar) {
        this.d = eVar;
    }

    public final e b() {
        return this.d;
    }

    public final void b(e eVar) {
        this.e = eVar;
    }

    public final boolean c() {
        return this.c != null;
    }

    public final ParameterizedType d() {
        return this.c;
    }

    public final Class e() {
        return this.b;
    }

    public final String toString() {
        return this.c != null ? this.c.toString() : this.b.getName();
    }
}
