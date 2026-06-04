package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public final class r extends s {
    static final r c = new r("");
    final String d;

    private r(String str) {
        this.d = str;
    }

    public static r b(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return c;
        }
        return new r(str);
    }

    @Override // com.flurry.a.b.a.h
    public final boolean e() {
        return true;
    }

    @Override // com.flurry.a.b.a.h
    public final String h() {
        return this.d;
    }

    @Override // com.flurry.a.b.a.h
    public final String m() {
        return this.d;
    }

    @Override // com.flurry.a.b.a.h
    public final double n() {
        return com.flurry.a.b.a.c.e.d(this.d);
    }

    @Override // com.flurry.a.b.a.e.b, com.flurry.a.b.a.d.aa
    public final void a(com.flurry.a.b.a.e eVar, aw awVar) {
        if (this.d == null) {
            eVar.f();
        } else {
            eVar.b(this.d);
        }
    }

    @Override // com.flurry.a.b.a.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((r) obj).d.equals(this.d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.flurry.a.b.a.e.s, com.flurry.a.b.a.h
    public final String toString() {
        int length = this.d.length();
        StringBuilder sb = new StringBuilder((length >> 4) + length + 2);
        a(sb, this.d);
        return sb.toString();
    }

    protected static void a(StringBuilder sb, String str) {
        sb.append('\"');
        com.flurry.a.b.a.h.e.a(sb, str);
        sb.append('\"');
    }
}
