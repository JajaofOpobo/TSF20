package com.flurry.a.b.a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements Serializable {
    public static final g a = new g("N/A", -1, -1, -1, (byte) 0);
    final long b;
    final long c;
    final int d;
    final int e;
    final Object f;

    public g(Object obj, long j, int i, int i2) {
        this(obj, j, i, i2, (byte) 0);
    }

    private g(Object obj, long j, int i, int i2, byte b) {
        this.f = obj;
        this.b = -1L;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        if (this.f == null) {
            sb.append("UNKNOWN");
        } else {
            sb.append(this.f.toString());
        }
        sb.append("; line: ");
        sb.append(this.d);
        sb.append(", column: ");
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }

    public final int hashCode() {
        return ((((this.f == null ? 1 : this.f.hashCode()) ^ this.d) + this.e) ^ ((int) this.c)) + ((int) this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f == null) {
                if (gVar.f != null) {
                    return false;
                }
            } else if (!this.f.equals(gVar.f)) {
                return false;
            }
            return this.d == gVar.d && this.e == gVar.e && this.c == gVar.c && this.b == gVar.b;
        }
        return false;
    }
}
