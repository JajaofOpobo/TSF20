package com.flurry.a.b.a;

import java.io.Reader;
import java.io.Writer;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class c {
    static final int a = k.a();
    static final int b = f.a();
    protected static final ThreadLocal c = new ThreadLocal();
    protected com.flurry.a.b.a.f.c d;
    protected com.flurry.a.b.a.f.a e;
    protected p f;
    protected int g;
    protected int h;
    protected com.flurry.a.b.a.c.a i;
    protected com.flurry.a.b.a.c.c j;
    protected com.flurry.a.b.a.c.g k;

    public c() {
        this(null);
    }

    public c(p pVar) {
        this.d = com.flurry.a.b.a.f.c.a();
        this.e = com.flurry.a.b.a.f.a.a();
        this.g = a;
        this.h = b;
        this.f = pVar;
    }

    public final c a(k kVar) {
        this.g |= kVar.b();
        return this;
    }

    private boolean b(k kVar) {
        return (this.g & kVar.b()) != 0;
    }

    public final c a(p pVar) {
        this.f = pVar;
        return this;
    }

    public p a() {
        return this.f;
    }

    public final j a(Reader reader) {
        return new com.flurry.a.b.a.b.h(a((Object) reader), this.g, this.j != null ? this.j.a() : reader, this.f, this.d.a(b(k.CANONICALIZE_FIELD_NAMES), b(k.INTERN_FIELD_NAMES)));
    }

    public final e a(Writer writer) {
        com.flurry.a.b.a.c.b a2 = a((Object) writer);
        if (this.k != null) {
            writer = this.k.a();
        }
        com.flurry.a.b.a.b.j jVar = new com.flurry.a.b.a.b.j(a2, this.h, this.f, writer);
        if (this.i != null) {
            jVar.a(this.i);
        }
        return jVar;
    }

    private static com.flurry.a.b.a.c.b a(Object obj) {
        SoftReference softReference = (SoftReference) c.get();
        com.flurry.a.b.a.h.a aVar = softReference == null ? null : (com.flurry.a.b.a.h.a) softReference.get();
        if (aVar == null) {
            aVar = new com.flurry.a.b.a.h.a();
            c.set(new SoftReference(aVar));
        }
        return new com.flurry.a.b.a.c.b(aVar, obj);
    }
}
