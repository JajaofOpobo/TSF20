package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public final class q extends s {
    protected final Object c;

    public q(Object obj) {
        this.c = obj;
    }

    @Override // com.flurry.a.b.a.h
    public final String m() {
        return this.c == null ? "null" : this.c.toString();
    }

    @Override // com.flurry.a.b.a.h
    public final double n() {
        if (this.c instanceof Number) {
            return ((Number) this.c).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.flurry.a.b.a.e.b, com.flurry.a.b.a.d.aa
    public final void a(com.flurry.a.b.a.e eVar, aw awVar) {
        if (this.c == null) {
            eVar.f();
        } else {
            eVar.a(this.c);
        }
    }

    @Override // com.flurry.a.b.a.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            q qVar = (q) obj;
            if (this.c == null) {
                return qVar.c == null;
            }
            return this.c.equals(qVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.flurry.a.b.a.e.s, com.flurry.a.b.a.h
    public final String toString() {
        return String.valueOf(this.c);
    }
}
