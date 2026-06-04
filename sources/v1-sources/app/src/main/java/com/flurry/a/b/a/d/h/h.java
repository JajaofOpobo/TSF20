package com.flurry.a.b.a.d.h;

/* loaded from: classes.dex */
public final class h extends i {
    protected final com.flurry.a.b.a.g.a[] a;
    protected final String[] b;

    @Override // com.flurry.a.b.a.g.a
    public final /* synthetic */ com.flurry.a.b.a.g.a a(Object obj) {
        return obj == this.f ? this : new h(this.d, this.b, this.a, obj, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public final /* synthetic */ com.flurry.a.b.a.g.a c(Object obj) {
        return new h(this.d, this.b, this.a, this.f, obj);
    }

    protected h(Class cls) {
        this(cls, null, null, null, null);
    }

    protected h(Class cls, String[] strArr, com.flurry.a.b.a.g.a[] aVarArr, Object obj, Object obj2) {
        super(cls, 0, obj, obj2);
        if (strArr == null || strArr.length == 0) {
            this.b = null;
            this.a = null;
        } else {
            this.b = strArr;
            this.a = aVarArr;
        }
    }

    public static h d(Class cls) {
        return new h(cls, null, null, null, null);
    }

    @Override // com.flurry.a.b.a.g.a
    protected final com.flurry.a.b.a.g.a a(Class cls) {
        return new h(cls, this.b, this.a, this.f, this.g);
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a b(Class cls) {
        throw new IllegalArgumentException("Internal error: SimpleType.narrowContentsBy() should never be called");
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a c(Class cls) {
        throw new IllegalArgumentException("Internal error: SimpleType.widenContentsBy() should never be called");
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a b(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
    }

    @Override // com.flurry.a.b.a.d.h.i
    protected final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.getName());
        if (this.a != null && this.a.length > 0) {
            sb.append('<');
            boolean z = true;
            for (com.flurry.a.b.a.g.a aVar : this.a) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(aVar.m());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean f() {
        return false;
    }

    @Override // com.flurry.a.b.a.g.a
    public final int h() {
        if (this.a == null) {
            return 0;
        }
        return this.a.length;
    }

    @Override // com.flurry.a.b.a.g.a
    public final com.flurry.a.b.a.g.a b(int i) {
        if (i < 0 || this.a == null || i >= this.a.length) {
            return null;
        }
        return this.a[i];
    }

    @Override // com.flurry.a.b.a.g.a
    public final String a(int i) {
        if (i < 0 || this.b == null || i >= this.b.length) {
            return null;
        }
        return this.b[i];
    }

    @Override // com.flurry.a.b.a.g.a
    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ").append(a()).append(']');
        return sb.toString();
    }

    @Override // com.flurry.a.b.a.g.a
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            h hVar = (h) obj;
            if (hVar.d != this.d) {
                return false;
            }
            com.flurry.a.b.a.g.a[] aVarArr = this.a;
            com.flurry.a.b.a.g.a[] aVarArr2 = hVar.a;
            if (aVarArr == null) {
                return aVarArr2 == null || aVarArr2.length == 0;
            }
            if (aVarArr2 != null && aVarArr.length == aVarArr2.length) {
                int length = aVarArr.length;
                for (int i = 0; i < length; i++) {
                    if (!aVarArr[i].equals(aVarArr2[i])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
