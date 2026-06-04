package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.y;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class k implements com.flurry.a.b.a.d.f {
    protected final String a;
    protected final com.flurry.a.b.a.g.a b;
    protected final com.flurry.a.b.a.d.i.a c;
    protected com.flurry.a.b.a.d.w d;
    protected ay e;
    protected p f;
    protected String g;
    protected int h;

    public abstract k a(com.flurry.a.b.a.d.w wVar);

    public abstract void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj);

    public abstract void a(Object obj, Object obj2);

    @Override // com.flurry.a.b.a.d.f
    public abstract com.flurry.a.b.a.d.e.e b();

    protected k(String str, com.flurry.a.b.a.g.a aVar, ay ayVar, com.flurry.a.b.a.d.i.a aVar2) {
        this.h = -1;
        if (str == null || str.length() == 0) {
            this.a = "";
        } else {
            this.a = com.flurry.a.b.a.h.i.a.a(str);
        }
        this.b = aVar;
        this.c = aVar2;
        this.e = ayVar;
    }

    protected k(k kVar) {
        this.h = -1;
        this.a = kVar.a;
        this.b = kVar.b;
        this.c = kVar.c;
        this.d = kVar.d;
        this.e = kVar.e;
        this.f = kVar.f;
        this.g = kVar.g;
        this.h = kVar.h;
    }

    protected k(k kVar, com.flurry.a.b.a.d.w wVar) {
        Object b;
        p pVar = null;
        this.h = -1;
        this.a = kVar.a;
        this.b = kVar.b;
        this.c = kVar.c;
        this.e = kVar.e;
        this.g = kVar.g;
        this.h = kVar.h;
        this.d = wVar;
        if (wVar != null && (b = wVar.b()) != null) {
            pVar = new p(this.b, b);
        }
        this.f = pVar;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(int i) {
        if (this.h != -1) {
            throw new IllegalStateException("Property '" + this.a + "' already had index (" + this.h + "), trying to assign " + i);
        }
        this.h = i;
    }

    public final String c() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.g.a a() {
        return this.b;
    }

    public final String d() {
        return this.g;
    }

    public final boolean e() {
        return this.d != null;
    }

    public final boolean f() {
        return this.e != null;
    }

    public final com.flurry.a.b.a.d.w g() {
        return this.d;
    }

    public final ay h() {
        return this.e;
    }

    public final int i() {
        return this.h;
    }

    public Object j() {
        return null;
    }

    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (jVar.e() == com.flurry.a.b.a.o.VALUE_NULL) {
            if (this.f == null) {
                return null;
            }
            return this.f.a(pVar);
        }
        if (this.e != null) {
            return this.d.a(jVar, pVar, this.e);
        }
        return this.d.a(jVar, pVar);
    }

    protected final void a(Exception exc, Object obj) {
        if (exc instanceof IllegalArgumentException) {
            String name = obj == null ? "[NULL]" : obj.getClass().getName();
            StringBuilder append = new StringBuilder("Problem deserializing property '").append(this.a);
            append.append("' (expected type: ").append(this.b);
            append.append("; actual type: ").append(name).append(")");
            String message = exc.getMessage();
            if (message != null) {
                append.append(", problem: ").append(message);
            } else {
                append.append(" (no error message provided)");
            }
            throw new y(append.toString(), null, exc);
        }
        a(exc);
    }

    protected static IOException a(Exception exc) {
        if (exc instanceof IOException) {
            throw ((IOException) exc);
        }
        boolean z = exc instanceof RuntimeException;
        Exception exc2 = exc;
        if (z) {
            throw ((RuntimeException) exc);
        }
        while (exc2.getCause() != null) {
            exc2 = exc2.getCause();
        }
        throw new y(exc2.getMessage(), null, exc2);
    }

    public String toString() {
        return "[property '" + this.a + "']";
    }
}
