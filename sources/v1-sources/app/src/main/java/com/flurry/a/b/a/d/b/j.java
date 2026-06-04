package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.y;
import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j {
    protected final com.flurry.a.b.a.d.f a;
    protected final Method b;
    protected final com.flurry.a.b.a.g.a c;
    protected com.flurry.a.b.a.d.w d;

    public j(com.flurry.a.b.a.d.f fVar, com.flurry.a.b.a.d.e.f fVar2, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.w wVar) {
        this(fVar, fVar2.e(), aVar, wVar);
    }

    private j(com.flurry.a.b.a.d.f fVar, Method method, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.w wVar) {
        this.a = fVar;
        this.c = aVar;
        this.b = method;
        this.d = wVar;
    }

    public final j a(com.flurry.a.b.a.d.w wVar) {
        return new j(this.a, this.b, this.c, wVar);
    }

    public final com.flurry.a.b.a.d.f a() {
        return this.a;
    }

    public final boolean b() {
        return this.d != null;
    }

    public final com.flurry.a.b.a.g.a c() {
        return this.c;
    }

    public final void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj, String str) {
        a(obj, str, a(jVar, pVar));
    }

    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (jVar.e() == com.flurry.a.b.a.o.VALUE_NULL) {
            return null;
        }
        return this.d.a(jVar, pVar);
    }

    public final void a(Object obj, String str, Object obj2) {
        try {
            this.b.invoke(obj, str, obj2);
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                String name = obj2 == null ? "[NULL]" : obj2.getClass().getName();
                StringBuilder append = new StringBuilder("Problem deserializing \"any\" property '").append(str);
                append.append("' of class " + d() + " (expected type: ").append(this.c);
                append.append("; actual type: ").append(name).append(")");
                String message = e.getMessage();
                if (message != null) {
                    append.append(", problem: ").append(message);
                } else {
                    append.append(" (no error message provided)");
                }
                throw new y(append.toString(), null, e);
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            boolean z = e instanceof RuntimeException;
            Exception exc = e;
            if (z) {
                throw ((RuntimeException) e);
            }
            while (exc.getCause() != null) {
                exc = exc.getCause();
            }
            throw new y(exc.getMessage(), null, exc);
        }
    }

    private String d() {
        return this.b.getDeclaringClass().getName();
    }

    public final String toString() {
        return "[any property on class " + d() + "]";
    }
}
