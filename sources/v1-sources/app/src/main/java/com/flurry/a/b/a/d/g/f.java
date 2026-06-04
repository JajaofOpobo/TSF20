package com.flurry.a.b.a.d.g;

import java.util.List;

/* loaded from: classes.dex */
public final class f {
    private static final d[] f = new d[0];
    protected final com.flurry.a.b.a.d.e.k a;
    protected List b;
    protected d[] c;
    protected a d;
    protected Object e;

    public f(com.flurry.a.b.a.d.e.k kVar) {
        this.a = kVar;
    }

    public final List a() {
        return this.b;
    }

    public final void a(List list) {
        this.b = list;
    }

    public final void a(d[] dVarArr) {
        this.c = dVarArr;
    }

    public final void a(a aVar) {
        this.d = aVar;
    }

    public final void a(Object obj) {
        this.e = obj;
    }

    public final com.flurry.a.b.a.d.ac b() {
        d[] dVarArr;
        if (this.b == null || this.b.isEmpty()) {
            if (this.d == null) {
                return null;
            }
            dVarArr = f;
        } else {
            dVarArr = (d[]) this.b.toArray(new d[this.b.size()]);
        }
        return new e(this.a.a(), dVarArr, this.c, this.d, this.e);
    }

    public final e c() {
        return e.a(this.a.b());
    }
}
