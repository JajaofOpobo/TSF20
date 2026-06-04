package com.flurry.a.b.a.d.b.b;

import java.util.EnumMap;

/* loaded from: classes.dex */
public final class l extends ap {
    protected final Class a;
    protected final com.flurry.a.b.a.d.w b;
    protected final com.flurry.a.b.a.d.w c;

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (jVar.e() != com.flurry.a.b.a.o.START_OBJECT) {
            throw pVar.b(EnumMap.class);
        }
        EnumMap enumMap = new EnumMap(this.a);
        while (jVar.b() != com.flurry.a.b.a.o.END_OBJECT) {
            Enum r0 = (Enum) this.b.a(jVar, pVar);
            if (r0 == null) {
                throw pVar.b(this.a, "value not one of declared Enum instance names");
            }
            enumMap.put((EnumMap) r0, (Enum) (jVar.b() == com.flurry.a.b.a.o.VALUE_NULL ? null : this.c.a(jVar, pVar)));
        }
        return enumMap;
    }

    public l(Class cls, com.flurry.a.b.a.d.w wVar, com.flurry.a.b.a.d.w wVar2) {
        super(EnumMap.class);
        this.a = cls;
        this.b = wVar;
        this.c = wVar2;
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return ayVar.a(jVar, pVar);
    }
}
