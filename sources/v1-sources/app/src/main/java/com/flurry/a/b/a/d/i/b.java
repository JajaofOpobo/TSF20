package com.flurry.a.b.a.d.i;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class b {
    d a = null;
    e b = null;
    j c = null;
    h d = null;
    i e = null;
    g f = null;
    f g = null;

    public final d a() {
        if (this.a == null) {
            this.a = new d();
        }
        return this.a;
    }

    public final e b() {
        if (this.b == null) {
            this.b = new e();
        }
        return this.b;
    }

    public final j c() {
        if (this.c == null) {
            this.c = new j();
        }
        return this.c;
    }

    public final h d() {
        if (this.d == null) {
            this.d = new h();
        }
        return this.d;
    }

    public final i e() {
        if (this.e == null) {
            this.e = new i();
        }
        return this.e;
    }

    public final g f() {
        if (this.f == null) {
            this.f = new g();
        }
        return this.f;
    }

    public final f g() {
        if (this.g == null) {
            this.g = new f();
        }
        return this.g;
    }

    public static HashSet a(Object[] objArr) {
        HashSet hashSet = new HashSet();
        if (objArr != null) {
            for (Object obj : objArr) {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public static Iterable b(Object[] objArr) {
        return new c(objArr);
    }
}
