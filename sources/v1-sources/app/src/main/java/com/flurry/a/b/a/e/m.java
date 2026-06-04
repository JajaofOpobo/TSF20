package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public final class m extends o {
    final long c;

    private m(long j) {
        this.c = j;
    }

    public static m a(long j) {
        return new m(j);
    }

    @Override // com.flurry.a.b.a.h
    public final int j() {
        return (int) this.c;
    }

    @Override // com.flurry.a.b.a.h
    public final long k() {
        return this.c;
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
        return obj != null && obj.getClass() == getClass() && ((m) obj).c == this.c;
    }

    public final int hashCode() {
        return ((int) this.c) ^ ((int) (this.c >> 32));
    }
}
