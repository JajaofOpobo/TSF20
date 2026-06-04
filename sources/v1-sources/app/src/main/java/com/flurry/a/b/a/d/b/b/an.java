package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class an extends af {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i;
        if (!jVar.j()) {
            if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING && pVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jVar.k().length() == 0) {
                return null;
            }
            if (pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new short[]{h(jVar, pVar)};
            }
            throw pVar.b(this.q);
        }
        com.flurry.a.b.a.d.i.j c = pVar.h().c();
        short[] sArr = (short[]) c.a();
        int i2 = 0;
        while (jVar.b() != com.flurry.a.b.a.o.END_ARRAY) {
            short h = h(jVar, pVar);
            if (i2 >= sArr.length) {
                i = 0;
                sArr = (short[]) c.a(sArr, i2);
            } else {
                i = i2;
            }
            i2 = i + 1;
            sArr[i] = h;
        }
        return (short[]) c.b(sArr, i2);
    }

    public an() {
        super(short[].class);
    }
}
