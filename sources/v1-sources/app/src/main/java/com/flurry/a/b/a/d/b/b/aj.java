package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class aj extends af {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i;
        if (!jVar.j()) {
            if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING && pVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jVar.k().length() == 0) {
                return null;
            }
            if (pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new double[]{p(jVar, pVar)};
            }
            throw pVar.b(this.q);
        }
        com.flurry.a.b.a.d.i.f g = pVar.h().g();
        double[] dArr = (double[]) g.a();
        int i2 = 0;
        while (jVar.b() != com.flurry.a.b.a.o.END_ARRAY) {
            double p = p(jVar, pVar);
            if (i2 >= dArr.length) {
                i = 0;
                dArr = (double[]) g.a(dArr, i2);
            } else {
                i = i2;
            }
            i2 = i + 1;
            dArr[i] = p;
        }
        return (double[]) g.b(dArr, i2);
    }

    public aj() {
        super(double[].class);
    }
}
