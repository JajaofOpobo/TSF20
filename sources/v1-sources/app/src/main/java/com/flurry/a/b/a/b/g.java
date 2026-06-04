package com.flurry.a.b.a.b;

import com.flurry.a.b.a.n;

/* loaded from: classes.dex */
public final class g extends n {
    protected final g c;
    protected String d;
    protected g e = null;

    private g(int i, g gVar) {
        this.a = i;
        this.c = gVar;
        this.b = -1;
    }

    public static g g() {
        return new g(0, null);
    }

    private final g a(int i) {
        this.a = i;
        this.b = -1;
        this.d = null;
        return this;
    }

    public final g h() {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.a(1);
        }
        g gVar2 = new g(1, this);
        this.e = gVar2;
        return gVar2;
    }

    public final g i() {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.a(2);
        }
        g gVar2 = new g(2, this);
        this.e = gVar2;
        return gVar2;
    }

    public final g j() {
        return this.c;
    }

    public final int a(String str) {
        if (this.a != 2 || this.d != null) {
            return 4;
        }
        this.d = str;
        return this.b < 0 ? 0 : 1;
    }

    public final int k() {
        if (this.a == 2) {
            if (this.d == null) {
                return 5;
            }
            this.d = null;
            this.b++;
            return 2;
        }
        if (this.a == 1) {
            int i = this.b;
            this.b++;
            return i < 0 ? 0 : 1;
        }
        this.b++;
        return this.b == 0 ? 0 : 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        if (this.a == 2) {
            sb.append('{');
            if (this.d != null) {
                sb.append('\"');
                sb.append(this.d);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else if (this.a == 1) {
            sb.append('[');
            sb.append(f());
            sb.append(']');
        } else {
            sb.append("/");
        }
        return sb.toString();
    }
}
