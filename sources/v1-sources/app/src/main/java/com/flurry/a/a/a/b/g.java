package com.flurry.a.a.a.b;

/* loaded from: classes.dex */
public final class g implements o {
    private com.flurry.a.a.a.c a;
    private String b;

    public g(com.flurry.a.a.a.c cVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    @Override // com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o) && this.b.equals(obj.toString());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
