package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class i extends o {
    protected final BigDecimal c;

    private i(BigDecimal bigDecimal) {
        this.c = bigDecimal;
    }

    public static i a(BigDecimal bigDecimal) {
        return new i(bigDecimal);
    }

    @Override // com.flurry.a.b.a.h
    public final int j() {
        return this.c.intValue();
    }

    @Override // com.flurry.a.b.a.h
    public final long k() {
        return this.c.longValue();
    }

    @Override // com.flurry.a.b.a.e.o, com.flurry.a.b.a.h
    public final double l() {
        return this.c.doubleValue();
    }

    @Override // com.flurry.a.b.a.h
    public final String m() {
        return this.c.toString();
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
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((i) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
