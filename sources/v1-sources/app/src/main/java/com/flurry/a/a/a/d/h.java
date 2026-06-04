package com.flurry.a.a.a.d;

/* loaded from: classes.dex */
public abstract class h implements g, Comparable {
    @Override // com.flurry.a.a.a.b.b
    public abstract com.flurry.a.a.a.c a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof g) && getClass() == obj.getClass() && compareTo((g) obj) == 0;
    }

    public int hashCode() {
        return a.c().a(this, a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        return a.c().a(this, gVar, a());
    }

    public String toString() {
        return a.c().a(this);
    }
}
