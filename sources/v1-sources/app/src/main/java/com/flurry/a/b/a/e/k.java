package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public final class k extends o {
    private static final k[] d = new k[12];
    final int c;

    static {
        for (int i = 0; i < 12; i++) {
            d[i] = new k(i - 1);
        }
    }

    private k(int i) {
        this.c = i;
    }

    public static k a(int i) {
        return (i > 10 || i < -1) ? new k(i) : d[i + 1];
    }

    @Override // com.flurry.a.b.a.h
    public final boolean d() {
        return true;
    }

    @Override // com.flurry.a.b.a.h
    public final int j() {
        return this.c;
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
        return obj != null && obj.getClass() == getClass() && ((k) obj).c == this.c;
    }

    public final int hashCode() {
        return this.c;
    }
}
