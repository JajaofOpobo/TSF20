package com.flurry.a.a.a.b;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements p, Comparable {
    private com.flurry.a.a.a.c a;
    private byte[] b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        h hVar = (h) obj;
        return com.flurry.a.a.a.c.a.a(this.b, this.b.length, hVar.b, hVar.b.length);
    }

    public h(com.flurry.a.a.a.c cVar) {
        this.a = cVar;
        this.b = new byte[cVar.l()];
    }

    protected h() {
    }

    @Override // com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return this.a;
    }

    @Override // com.flurry.a.a.a.b.p
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof p) && Arrays.equals(this.b, ((p) obj).b());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return Arrays.toString(this.b);
    }
}
