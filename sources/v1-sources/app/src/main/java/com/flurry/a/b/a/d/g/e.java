package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public final class e extends com.flurry.a.b.a.d.g.b.b {
    public e(com.flurry.a.b.a.g.a aVar, d[] dVarArr, d[] dVarArr2, a aVar2, Object obj) {
        super(aVar, dVarArr, dVarArr2, aVar2, obj);
    }

    private e(Class cls, d[] dVarArr) {
        super(cls, dVarArr, (d[]) null, (a) null, (Object) null);
    }

    public static e a(Class cls) {
        return new e(cls, a);
    }

    @Override // com.flurry.a.b.a.d.ac
    public final com.flurry.a.b.a.d.ac a() {
        return new com.flurry.a.b.a.d.g.a.p(this);
    }

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        eVar.d();
        if (this.e != null) {
            c(obj, eVar, awVar);
        } else {
            b(obj, eVar, awVar);
        }
        eVar.e();
    }

    public final String toString() {
        return "BeanSerializer for " + c().getName();
    }
}
