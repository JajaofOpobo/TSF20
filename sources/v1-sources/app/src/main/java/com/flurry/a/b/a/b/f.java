package com.flurry.a.b.a.b;

import com.flurry.a.b.a.n;

/* loaded from: classes.dex */
public final class f extends n {
    protected final f c;
    protected int d;
    protected int e;
    protected String f;
    protected f g = null;

    public f(f fVar, int i, int i2, int i3) {
        this.a = i;
        this.c = fVar;
        this.d = i2;
        this.e = i3;
        this.b = -1;
    }

    private void a(int i, int i2, int i3) {
        this.a = i;
        this.b = -1;
        this.d = i2;
        this.e = i3;
        this.f = null;
    }

    public static f g() {
        return new f(null, 0, -1, -1);
    }

    public final f a(int i, int i2) {
        f fVar = this.g;
        if (fVar == null) {
            f fVar2 = new f(this, 1, i, i2);
            this.g = fVar2;
            return fVar2;
        }
        fVar.a(1, i, i2);
        return fVar;
    }

    public final f b(int i, int i2) {
        f fVar = this.g;
        if (fVar == null) {
            f fVar2 = new f(this, 2, i, i2);
            this.g = fVar2;
            return fVar2;
        }
        fVar.a(2, i, i2);
        return fVar;
    }

    public final String h() {
        return this.f;
    }

    public final f i() {
        return this.c;
    }

    public final com.flurry.a.b.a.g a(Object obj) {
        return new com.flurry.a.b.a.g(obj, -1L, this.d, this.e);
    }

    public final boolean j() {
        int i = this.b + 1;
        this.b = i;
        return this.a != 0 && i > 0;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        switch (this.a) {
            case 0:
                sb.append("/");
                break;
            case 1:
                sb.append('[');
                sb.append(f());
                sb.append(']');
                break;
            case 2:
                sb.append('{');
                if (this.f != null) {
                    sb.append('\"');
                    com.flurry.a.b.a.h.e.a(sb, this.f);
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
                break;
        }
        return sb.toString();
    }
}
