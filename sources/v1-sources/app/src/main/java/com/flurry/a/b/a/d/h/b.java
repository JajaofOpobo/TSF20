package com.flurry.a.b.a.d.h;

/* loaded from: classes.dex */
public final class b implements Comparable {
    private String a;
    private Class b;
    private int c;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((b) obj).a);
    }

    public b() {
        this.b = null;
        this.a = null;
        this.c = 0;
    }

    public b(Class cls) {
        this.b = cls;
        this.a = cls.getName();
        this.c = this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == getClass() && ((b) obj).b == this.b;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return this.a;
    }
}
