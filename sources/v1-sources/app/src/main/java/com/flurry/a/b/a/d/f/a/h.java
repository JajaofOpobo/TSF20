package com.flurry.a.b.a.d.f.a;

import com.flurry.a.b.a.a.v;
import com.flurry.a.b.a.d.w;

/* loaded from: classes.dex */
public final class h extends o {
    public h(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f.c cVar, com.flurry.a.b.a.d.f fVar) {
        super(aVar, cVar, fVar, null);
    }

    @Override // com.flurry.a.b.a.d.ay
    public final v a() {
        return v.WRAPPER_OBJECT;
    }

    @Override // com.flurry.a.b.a.d.ay
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return e(jVar, pVar);
    }

    @Override // com.flurry.a.b.a.d.ay
    public final Object b(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return e(jVar, pVar);
    }

    @Override // com.flurry.a.b.a.d.ay
    public final Object c(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return e(jVar, pVar);
    }

    @Override // com.flurry.a.b.a.d.ay
    public final Object d(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return e(jVar, pVar);
    }

    private final Object e(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (jVar.e() != com.flurry.a.b.a.o.START_OBJECT) {
            throw pVar.a(jVar, com.flurry.a.b.a.o.START_OBJECT, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + c());
        }
        if (jVar.b() != com.flurry.a.b.a.o.FIELD_NAME) {
            throw pVar.a(jVar, com.flurry.a.b.a.o.FIELD_NAME, "need JSON String that contains type id (for subtype of " + c() + ")");
        }
        w a = a(pVar, jVar.k());
        jVar.b();
        Object a2 = a.a(jVar, pVar);
        if (jVar.b() != com.flurry.a.b.a.o.END_OBJECT) {
            throw pVar.a(jVar, com.flurry.a.b.a.o.END_OBJECT, "expected closing END_OBJECT after type information and deserialized value");
        }
        return a2;
    }
}
