package com.flurry.a.b.a.d.e;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j implements com.flurry.a.b.a.d.i.a {
    protected HashMap a;

    public j() {
    }

    private j(HashMap hashMap) {
        this.a = hashMap;
    }

    public final Annotation a(Class cls) {
        if (this.a == null) {
            return null;
        }
        return (Annotation) this.a.get(cls);
    }

    public static j a(j jVar, j jVar2) {
        if (jVar == null || jVar.a == null || jVar.a.isEmpty()) {
            return jVar2;
        }
        if (jVar2 != null && jVar2.a != null && !jVar2.a.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (Annotation annotation : jVar2.a.values()) {
                hashMap.put(annotation.annotationType(), annotation);
            }
            for (Annotation annotation2 : jVar.a.values()) {
                hashMap.put(annotation2.annotationType(), annotation2);
            }
            return new j(hashMap);
        }
        return jVar;
    }

    public final int a() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }

    public final void a(Annotation annotation) {
        if (this.a == null || !this.a.containsKey(annotation.annotationType())) {
            c(annotation);
        }
    }

    public final void b(Annotation annotation) {
        c(annotation);
    }

    public final String toString() {
        return this.a == null ? "[null]" : this.a.toString();
    }

    private void c(Annotation annotation) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(annotation.annotationType(), annotation);
    }
}
