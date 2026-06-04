package com.flurry.a.b.a.d.b.b;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class k extends bw {
    protected final Class a;
    protected final Method b;

    public k(Class cls, com.flurry.a.b.a.d.e.f fVar) {
        super(Enum.class);
        this.a = cls;
        this.b = fVar.e();
    }

    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e != com.flurry.a.b.a.o.VALUE_STRING && e != com.flurry.a.b.a.o.FIELD_NAME) {
            throw pVar.b(this.a);
        }
        try {
            return this.b.invoke(this.a, jVar.k());
        } catch (Exception e2) {
            com.flurry.a.b.a.d.i.l.a(e2);
            return null;
        }
    }
}
