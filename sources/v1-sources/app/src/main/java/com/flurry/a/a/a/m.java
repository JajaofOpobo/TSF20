package com.flurry.a.a.a;

import java.util.Set;

/* loaded from: classes.dex */
public final class m {
    private final String a;
    private final c c;
    private final String d;
    private final com.flurry.a.b.a.h e;
    private final n f;
    private Set g;
    private transient int b = -1;
    private final z h = new z(c.h);

    public m(String str, c cVar, String str2, com.flurry.a.b.a.h hVar, n nVar) {
        this.a = c.g(str);
        this.c = cVar;
        this.d = str2;
        this.e = hVar;
        this.f = nVar;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final c c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final com.flurry.a.b.a.h e() {
        return this.e;
    }

    public final n f() {
        return this.f;
    }

    public final synchronized void a(String str, String str2) {
        this.h.a(str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a.equals(mVar.a) && this.c.equals(mVar.c)) {
            com.flurry.a.b.a.h hVar = mVar.e;
            if ((this.e == null ? hVar == null : Double.isNaN(this.e.o()) ? Double.isNaN(hVar.o()) : this.e.equals(hVar)) && this.h.equals(mVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.c.m();
    }

    public final String toString() {
        return this.a + " type:" + this.c.f + " pos:" + this.b;
    }
}
