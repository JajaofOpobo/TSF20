package com.flurry.a.b.a.d.b.b;

import java.util.EnumSet;

/* loaded from: classes.dex */
public final class m extends ap {
    protected final Class a;
    protected final com.flurry.a.b.a.d.w b;

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (!jVar.j()) {
            throw pVar.b(EnumSet.class);
        }
        EnumSet noneOf = EnumSet.noneOf(this.a);
        while (true) {
            com.flurry.a.b.a.o b = jVar.b();
            if (b == com.flurry.a.b.a.o.END_ARRAY) {
                return noneOf;
            }
            if (b == com.flurry.a.b.a.o.VALUE_NULL) {
                throw pVar.b(this.a);
            }
            noneOf.add((Enum) this.b.a(jVar, pVar));
        }
    }

    public m(Class cls, com.flurry.a.b.a.d.w wVar) {
        super(EnumSet.class);
        this.a = cls;
        this.b = wVar;
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return ayVar.b(jVar, pVar);
    }
}
