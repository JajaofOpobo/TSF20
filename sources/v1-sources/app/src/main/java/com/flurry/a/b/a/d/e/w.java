package com.flurry.a.b.a.d.e;

/* loaded from: classes.dex */
final class w {
    public final Object a;
    public final w b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public w(Object obj, w wVar, String str, boolean z, boolean z2) {
        w wVar2;
        this.a = obj;
        this.b = wVar;
        if (str == null) {
            str = null;
            wVar2 = this;
        } else if (str.length() == 0) {
            str = null;
            wVar2 = this;
        } else {
            wVar2 = this;
        }
        wVar2.c = str;
        this.d = z;
        this.e = z2;
    }

    public final w a(Object obj) {
        return obj == this.a ? this : new w(obj, this.b, this.c, this.d, this.e);
    }

    private w a(w wVar) {
        return wVar == this.b ? this : new w(this.a, wVar, this.c, this.d, this.e);
    }

    public final w a() {
        w a;
        while (this.e) {
            if (this.b == null) {
                return null;
            }
            this = this.b;
        }
        if (this.b != null && (a = this.b.a()) != this.b) {
            return this.a(a);
        }
        return this;
    }

    public final w b() {
        w b = this.b == null ? null : this.b.b();
        return this.d ? a(b) : b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w b(w wVar) {
        return this.b == null ? a(wVar) : a(this.b.b(wVar));
    }

    public final w c() {
        if (this.b != null) {
            w c = this.b.c();
            if (this.c != null) {
                if (c.c == null) {
                    return a((w) null);
                }
                return a(c);
            }
            if (c.c != null) {
                return c;
            }
            if (this.d == c.d) {
                return a(c);
            }
            return this.d ? a((w) null) : c;
        }
        return this;
    }

    public final String toString() {
        String str = this.a.toString() + "[visible=" + this.d + "]";
        if (this.b != null) {
            return str + ", " + this.b.toString();
        }
        return str;
    }
}
