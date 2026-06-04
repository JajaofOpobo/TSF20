package com.flurry.a.b.a.d.f;

/* loaded from: classes.dex */
public final class a {
    protected final Class a;
    protected final int b;
    protected String c;

    public a(Class cls, String str) {
        this.a = cls;
        this.b = cls.getName().hashCode();
        this.c = (str == null || str.length() == 0) ? null : str;
    }

    public final Class a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == getClass() && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "[NamedType, class " + this.a.getName() + ", name: " + (this.c == null ? "null" : "'" + this.c + "'") + "]";
    }
}
