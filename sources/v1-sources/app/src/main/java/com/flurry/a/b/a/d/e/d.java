package com.flurry.a.b.a.d.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class d extends e {
    protected final Field a;

    @Override // com.flurry.a.b.a.d.e.a
    public final /* bridge */ /* synthetic */ AnnotatedElement a() {
        return this.a;
    }

    public d(Field field, j jVar) {
        super(jVar);
        this.a = field;
    }

    public final d a(j jVar) {
        return new d(this.a, jVar);
    }

    public final void a(Annotation annotation) {
        this.b.b(annotation);
    }

    public final Field e() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final String b() {
        return this.a.getName();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Annotation a(Class cls) {
        return this.b.a(cls);
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Type c() {
        return this.a.getGenericType();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Class d() {
        return this.a.getType();
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
            this.a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to setValue() for field " + f() + ": " + e.getMessage(), e);
        }
    }

    public final String f() {
        return this.a.getDeclaringClass().getName() + "#" + this.a.getName();
    }

    public final String toString() {
        return "[field " + this.a.getName() + ", annotations: " + this.b + "]";
    }
}
