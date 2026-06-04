package com.flurry.a.b.a.c;

import com.flurry.a.b.a.r;

/* loaded from: classes.dex */
public final class h implements r {
    protected final String a;
    protected char[] b;

    public h(String str) {
        this.a = str;
    }

    @Override // com.flurry.a.b.a.r
    public final String a() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.r
    public final char[] b() {
        char[] cArr = this.b;
        if (cArr == null) {
            char[] a = d.a().a(this.a);
            this.b = a;
            return a;
        }
        return cArr;
    }

    public final String toString() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.a.equals(((h) obj).a);
    }
}
