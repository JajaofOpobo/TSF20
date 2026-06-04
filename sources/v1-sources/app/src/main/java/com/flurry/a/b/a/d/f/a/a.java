package com.flurry.a.b.a.d.f.a;

import com.flurry.a.b.a.a.v;

/* loaded from: classes.dex */
public class a extends o {
    public a(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f.c cVar, com.flurry.a.b.a.d.f fVar, Class cls) {
        super(aVar, cVar, fVar, cls);
    }

    @Override // com.flurry.a.b.a.d.ay
    public v a() {
        return v.WRAPPER_ARRAY;
    }

    @Override // com.flurry.a.b.a.d.ay
    public final Object b(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return e(jVar, pVar);
    }

    @Override // com.flurry.a.b.a.d.ay
    public Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return e(jVar, pVar);
    }

    @Override // com.flurry.a.b.a.d.ay
    public final Object c(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return e(jVar, pVar);
    }

    @Override // com.flurry.a.b.a.d.ay
    public Object d(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return e(jVar, pVar);
    }

    private final Object e(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        String k;
        boolean j = jVar.j();
        if (jVar.j()) {
            if (jVar.b() == com.flurry.a.b.a.o.VALUE_STRING) {
                k = jVar.k();
                jVar.b();
            } else {
                if (!(this.b instanceof p) || this.e == null) {
                    throw pVar.a(jVar, com.flurry.a.b.a.o.VALUE_STRING, "need JSON String that contains type id (for subtype of " + c() + ")");
                }
                k = ((p) this.b).a();
            }
        } else {
            if (!(this.b instanceof p) || this.e == null) {
                throw pVar.a(jVar, com.flurry.a.b.a.o.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + c());
            }
            k = ((p) this.b).a();
        }
        Object a = a(pVar, k).a(jVar, pVar);
        if (j && jVar.b() != com.flurry.a.b.a.o.END_ARRAY) {
            throw pVar.a(jVar, com.flurry.a.b.a.o.END_ARRAY, "expected closing END_ARRAY after type information and deserialized value");
        }
        return a;
    }
}
