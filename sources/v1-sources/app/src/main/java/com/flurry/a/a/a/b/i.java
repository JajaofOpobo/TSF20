package com.flurry.a.a.a.b;

import com.flurry.a.a.a.ad;

/* loaded from: classes.dex */
public final class i implements q, Comparable {
    private final com.flurry.a.a.a.c a;
    private final Object[] b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return c.a().a(this, (i) obj, this.a);
    }

    public i(com.flurry.a.a.a.c cVar) {
        if (cVar == null || !ad.RECORD.equals(cVar.a())) {
            throw new com.flurry.a.a.a.a("Not a record schema: " + cVar);
        }
        this.a = cVar;
        this.b = new Object[cVar.b().size()];
    }

    @Override // com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return this.a;
    }

    @Override // com.flurry.a.a.a.b.r
    public final void a(int i, Object obj) {
        this.b[i] = obj;
    }

    @Override // com.flurry.a.a.a.b.r
    public final Object a(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.g().equals(iVar.a.g()) && c.a().a(this, iVar, this.a, true) == 0;
    }

    public final int hashCode() {
        return c.a().a(this, this.a);
    }

    public final String toString() {
        return c.a().a(this);
    }
}
