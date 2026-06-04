package com.flurry.a.b.a.c;

import com.flurry.a.b.a.h.l;

/* loaded from: classes.dex */
public final class b {
    protected final Object a;
    protected final com.flurry.a.b.a.h.a c;
    protected byte[] d = null;
    protected byte[] e = null;
    protected char[] f = null;
    protected char[] g = null;
    protected char[] h = null;
    protected final boolean b = false;

    public b(com.flurry.a.b.a.h.a aVar, Object obj) {
        this.c = aVar;
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final l c() {
        return new l(this.c);
    }

    public final char[] d() {
        if (this.f != null) {
            throw new IllegalStateException("Trying to call allocTokenBuffer() second time");
        }
        this.f = this.c.a(com.flurry.a.b.a.h.c.TOKEN_BUFFER);
        return this.f;
    }

    public final char[] e() {
        if (this.g != null) {
            throw new IllegalStateException("Trying to call allocConcatBuffer() second time");
        }
        this.g = this.c.a(com.flurry.a.b.a.h.c.CONCAT_BUFFER);
        return this.g;
    }

    public final char[] a(int i) {
        if (this.h != null) {
            throw new IllegalStateException("Trying to call allocNameCopyBuffer() second time");
        }
        this.h = this.c.a(com.flurry.a.b.a.h.c.NAME_COPY_BUFFER, i);
        return this.h;
    }

    public final void a(char[] cArr) {
        if (cArr != null) {
            if (cArr != this.f) {
                throw new IllegalArgumentException("Trying to release buffer not owned by the context");
            }
            this.f = null;
            this.c.a(com.flurry.a.b.a.h.c.TOKEN_BUFFER, cArr);
        }
    }

    public final void b(char[] cArr) {
        if (cArr != null) {
            if (cArr != this.g) {
                throw new IllegalArgumentException("Trying to release buffer not owned by the context");
            }
            this.g = null;
            this.c.a(com.flurry.a.b.a.h.c.CONCAT_BUFFER, cArr);
        }
    }

    public final void c(char[] cArr) {
        if (cArr != null) {
            if (cArr != this.h) {
                throw new IllegalArgumentException("Trying to release buffer not owned by the context");
            }
            this.h = null;
            this.c.a(com.flurry.a.b.a.h.c.NAME_COPY_BUFFER, cArr);
        }
    }
}
