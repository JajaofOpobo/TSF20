package com.flurry.a.b.a.d.b;

/* loaded from: classes.dex */
public final class p {
    private final Object a;
    private final boolean b;
    private final Class c;

    protected p(com.flurry.a.b.a.g.a aVar, Object obj) {
        this.a = obj;
        this.b = aVar.t();
        this.c = aVar.p();
    }

    public final Object a(com.flurry.a.b.a.d.p pVar) {
        if (this.b && pVar.a(com.flurry.a.b.a.d.o.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            throw pVar.b("Can not map JSON null into type " + this.c.getName() + " (set DeserializationConfig.Feature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)");
        }
        return this.a;
    }
}
