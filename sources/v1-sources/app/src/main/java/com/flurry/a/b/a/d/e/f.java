package com.flurry.a.b.a.d.e;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes.dex */
public final class f extends i {
    protected final Method a;
    protected Class[] c;

    @Override // com.flurry.a.b.a.d.e.a
    public final /* bridge */ /* synthetic */ AnnotatedElement a() {
        return this.a;
    }

    public f(Method method, j jVar, j[] jVarArr) {
        super(jVar, jVarArr);
        this.a = method;
    }

    public final f a(Method method) {
        return new f(method, this.b, this.d);
    }

    public final f a(j jVar) {
        return new f(this.a, jVar, this.d);
    }

    public final Method e() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final String b() {
        return this.a.getName();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Type c() {
        return this.a.getGenericReturnType();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Class d() {
        return this.a.getReturnType();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final com.flurry.a.b.a.g.a a(com.flurry.a.b.a.d.h.j jVar) {
        return a(jVar, (TypeVariable[]) this.a.getTypeParameters());
    }

    @Override // com.flurry.a.b.a.d.e.i
    public final Object h() {
        return this.a.invoke(null, new Object[0]);
    }

    @Override // com.flurry.a.b.a.d.e.i
    public final Object a(Object[] objArr) {
        return this.a.invoke(null, objArr);
    }

    @Override // com.flurry.a.b.a.d.e.i
    public final Object a(Object obj) {
        return this.a.invoke(null, obj);
    }

    @Override // com.flurry.a.b.a.d.e.e
    public final Class i() {
        return this.a.getDeclaringClass();
    }

    @Override // com.flurry.a.b.a.d.e.e
    public final Member j() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.e.e
    public final void a(Object obj, Object obj2) {
        try {
            this.a.invoke(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to setValue() with method " + n() + ": " + e.getMessage(), e);
        } catch (InvocationTargetException e2) {
            throw new IllegalArgumentException("Failed to setValue() with method " + n() + ": " + e2.getMessage(), e2);
        }
    }

    public final int f() {
        return this.a.getGenericParameterTypes().length;
    }

    public final Class g() {
        Class<?>[] parameterTypes = this.a.getParameterTypes();
        if (parameterTypes.length <= 0) {
            return null;
        }
        return parameterTypes[0];
    }

    @Override // com.flurry.a.b.a.d.e.i
    public final Type a(int i) {
        Type[] genericParameterTypes = this.a.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    public final Class[] m() {
        if (this.c == null) {
            this.c = this.a.getParameterTypes();
        }
        return this.c;
    }

    public final String n() {
        return this.a.getDeclaringClass().getName() + "#" + this.a.getName() + "(" + f() + " params)";
    }

    public final String toString() {
        return "[method " + this.a.getName() + ", annotations: " + this.b + "]";
    }
}
