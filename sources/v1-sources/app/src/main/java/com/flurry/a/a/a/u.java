package com.flurry.a.a.a;

/* loaded from: classes.dex */
final class u {
    private final String a;
    private final String b;
    private final String c;

    public u(String str, String str2) {
        if (str == null) {
            this.c = null;
            this.b = null;
            this.a = null;
            return;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.b = str2;
            this.a = c.g(str);
        } else {
            this.b = str.substring(0, lastIndexOf);
            this.a = c.g(str.substring(lastIndexOf + 1, str.length()));
        }
        this.c = this.b == null ? this.a : this.b + "." + this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.c == null ? uVar.c == null : this.c.equals(uVar.c);
    }

    public final int hashCode() {
        if (this.c == null) {
            return 0;
        }
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    public final void a(w wVar, com.flurry.a.b.a.e eVar) {
        if (this.a != null) {
            eVar.a("name", this.a);
        }
        if (this.b != null) {
            if (!this.b.equals(wVar.a())) {
                eVar.a("namespace", this.b);
            }
            if (wVar.a() == null) {
                wVar.a(this.b);
            }
        }
    }

    public final String a(String str) {
        return (this.b == null || this.b.equals(str)) ? this.a : this.c;
    }
}
