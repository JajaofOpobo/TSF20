package com.flurry.a.b.a.d.e;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class c extends i {
    protected final Constructor a;

    @Override // com.flurry.a.b.a.d.e.a
    public final /* bridge */ /* synthetic */ AnnotatedElement a() {
        return this.a;
    }

    public c(Constructor constructor, j jVar, j[] jVarArr) {
        super(jVar, jVarArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.a = constructor;
    }

    public final Constructor e() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final String b() {
        return this.a.getName();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Type c() {
        return this.a.getDeclaringClass();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Class d() {
        return this.a.getDeclaringClass();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final com.flurry.a.b.a.g.a a(com.flurry.a.b.a.d.h.j jVar) {
        return a(jVar, this.a.getTypeParameters());
    }

    public final int f() {
        return this.a.getParameterTypes().length;
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

    @Override // com.flurry.a.b.a.d.e.i
    public final Object h() {
        return this.a.newInstance(new Object[0]);
    }

    @Override // com.flurry.a.b.a.d.e.i
    public final Object a(Object[] objArr) {
        return this.a.newInstance(objArr);
    }

    @Override // com.flurry.a.b.a.d.e.i
    public final Object a(Object obj) {
        return this.a.newInstance(obj);
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
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + this.a.getDeclaringClass().getName());
    }

    public final String toString() {
        return "[constructor for " + this.a.getName() + ", annotations: " + this.b + "]";
    }
}
