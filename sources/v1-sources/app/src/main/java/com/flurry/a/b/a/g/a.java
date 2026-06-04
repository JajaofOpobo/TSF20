package com.flurry.a.b.a.g;

import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public abstract class a {
    protected final Class d;
    protected final int e;
    protected Object f = null;
    protected Object g = null;

    protected abstract a a(Class cls);

    public abstract a b(Class cls);

    public abstract a b(Object obj);

    public abstract a c(Class cls);

    public abstract a c(Object obj);

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract String m();

    public abstract String toString();

    protected a(Class cls, int i) {
        this.d = cls;
        this.e = cls.getName().hashCode() + i;
    }

    public a a(Object obj) {
        g(obj);
        return this;
    }

    public final void g(Object obj) {
        if (obj != null && this.f != null) {
            throw new IllegalStateException("Trying to reset value handler for type [" + toString() + "]; old handler of type " + this.f.getClass().getName() + ", new handler of type " + obj.getClass().getName());
        }
        this.f = obj;
    }

    public final a f(Class cls) {
        if (cls != this.d) {
            Class cls2 = this.d;
            d(cls);
            a a = a(cls);
            if (this.f != a.n()) {
                a = a.a(this.f);
            }
            if (this.g != a.o()) {
                a = a.c(this.g);
            }
            return a;
        }
        return this;
    }

    public final a g(Class cls) {
        if (cls != this.d) {
            a a = a(cls);
            if (this.f != a.n()) {
                a = a.a(this.f);
            }
            if (this.g != a.o()) {
                a = a.c(this.g);
            }
            return a;
        }
        return this;
    }

    public final a h(Class cls) {
        if (cls != this.d) {
            d(this.d);
            return a(cls);
        }
        return this;
    }

    public final Class p() {
        return this.d;
    }

    public boolean c() {
        return Modifier.isAbstract(this.d.getModifiers());
    }

    public boolean d() {
        return (this.d.getModifiers() & 1536) == 0 || this.d.isPrimitive();
    }

    public final boolean q() {
        return Throwable.class.isAssignableFrom(this.d);
    }

    public boolean b() {
        return false;
    }

    public final boolean r() {
        return this.d.isEnum();
    }

    public final boolean s() {
        return this.d.isInterface();
    }

    public final boolean t() {
        return this.d.isPrimitive();
    }

    public final boolean u() {
        return Modifier.isFinal(this.d.getModifiers());
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public boolean e() {
        return h() > 0;
    }

    public a k() {
        return null;
    }

    public a g() {
        return null;
    }

    public int h() {
        return 0;
    }

    public a b(int i) {
        return null;
    }

    public String a(int i) {
        return null;
    }

    public Object n() {
        return this.f;
    }

    public Object o() {
        return this.g;
    }

    private void d(Class cls) {
        if (!this.d.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Class " + cls.getName() + " is not assignable to " + this.d.getName());
        }
    }

    public final int hashCode() {
        return this.e;
    }
}
