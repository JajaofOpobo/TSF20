package com.flurry.a.b.a.d.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class a {
    public abstract Annotation a(Class cls);

    public abstract AnnotatedElement a();

    public abstract String b();

    public abstract Type c();

    public abstract Class d();

    protected a() {
    }

    public final boolean b(Class cls) {
        return a(cls) != null;
    }

    public com.flurry.a.b.a.g.a a(com.flurry.a.b.a.d.h.j jVar) {
        return jVar.a(c());
    }
}
