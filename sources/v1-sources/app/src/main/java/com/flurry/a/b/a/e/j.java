package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public final class j extends o {
    protected final double c;

    public j(double d) {
        this.c = d;
    }

    public static j a(double d) {
        return new j(d);
    }

    @Override // com.flurry.a.b.a.h
    public final int j() {
        return (int) this.c;
    }

    @Override // com.flurry.a.b.a.h
    public final long k() {
        return (long) this.c;
    }

    @Override // com.flurry.a.b.a.e.o, com.flurry.a.b.a.h
    public final double l() {
        return this.c;
    }

    @Override // com.flurry.a.b.a.h
    public final String m() {
        return com.flurry.a.b.a.c.f.a(this.c);
    }

    @Override // com.flurry.a.b.a.e.b, com.flurry.a.b.a.d.aa
    public final void a(com.flurry.a.b.a.e eVar, aw awVar) {
        eVar.a(this.c);
    }

    @Override // com.flurry.a.b.a.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == getClass() && ((j) obj).c == this.c;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return ((int) (doubleToLongBits >> 32)) ^ ((int) doubleToLongBits);
    }
}
