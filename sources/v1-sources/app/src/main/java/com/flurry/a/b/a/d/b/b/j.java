package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public final class j extends bw {
    protected final com.flurry.a.b.a.d.i.p a;

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Enum a;
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_STRING || e == com.flurry.a.b.a.o.FIELD_NAME) {
            a = this.a.a(jVar.k());
            if (a == null) {
                throw pVar.b(this.a.a(), "value not one of declared Enum instance names");
            }
        } else {
            if (e != com.flurry.a.b.a.o.VALUE_NUMBER_INT) {
                throw pVar.b(this.a.a());
            }
            if (pVar.a(com.flurry.a.b.a.d.o.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                throw pVar.b("Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.Feature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
            }
            a = this.a.a(jVar.t());
            if (a == null) {
                throw pVar.c(this.a.a(), "index value outside legal index range [0.." + this.a.b() + "]");
            }
        }
        return a;
    }

    public j(com.flurry.a.b.a.d.i.p pVar) {
        super(Enum.class);
        this.a = pVar;
    }

    public static com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, Class cls, com.flurry.a.b.a.d.e.f fVar) {
        if (fVar.a(0) != String.class) {
            throw new IllegalArgumentException("Parameter #0 type for factory method (" + fVar + ") not suitable, must be java.lang.String");
        }
        if (nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            com.flurry.a.b.a.d.i.l.a(fVar.j());
        }
        return new k(cls, fVar);
    }
}
