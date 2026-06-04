package com.flurry.a.b.a.d.g.a;

/* loaded from: classes.dex */
public final class m {
    protected int a;
    protected Class b;
    protected com.flurry.a.b.a.g.a c;
    protected boolean d;

    public m(Class cls, boolean z) {
        this.b = cls;
        this.c = null;
        this.d = z;
        this.a = a(cls, z);
    }

    public m(com.flurry.a.b.a.g.a aVar, boolean z) {
        this.c = aVar;
        this.b = null;
        this.d = z;
        this.a = a(aVar, z);
    }

    private static final int a(Class cls, boolean z) {
        int hashCode = cls.getName().hashCode();
        if (z) {
            return hashCode + 1;
        }
        return hashCode;
    }

    private static final int a(com.flurry.a.b.a.g.a aVar, boolean z) {
        int hashCode = aVar.hashCode() - 1;
        if (z) {
            return hashCode - 1;
        }
        return hashCode;
    }

    public final void a(Class cls) {
        this.c = null;
        this.b = cls;
        this.d = true;
        this.a = a(cls, true);
    }

    public final void b(Class cls) {
        this.c = null;
        this.b = cls;
        this.d = false;
        this.a = a(cls, false);
    }

    public final void a(com.flurry.a.b.a.g.a aVar) {
        this.c = aVar;
        this.b = null;
        this.d = true;
        this.a = a(aVar, true);
    }

    public final void b(com.flurry.a.b.a.g.a aVar) {
        this.c = aVar;
        this.b = null;
        this.d = false;
        this.a = a(aVar, false);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b != null ? "{class: " + this.b.getName() + ", typed? " + this.d + "}" : "{type: " + this.c + ", typed? " + this.d + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m mVar = (m) obj;
        if (mVar.d != this.d) {
            return false;
        }
        if (this.b != null) {
            return mVar.b == this.b;
        }
        return this.c.equals(mVar.c);
    }
}
