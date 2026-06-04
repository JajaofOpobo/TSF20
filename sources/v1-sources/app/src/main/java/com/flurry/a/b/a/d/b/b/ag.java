package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class ag extends af {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i;
        if (!jVar.j()) {
            if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING && pVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jVar.k().length() == 0) {
                return null;
            }
            if (pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new boolean[]{d(jVar, pVar)};
            }
            throw pVar.b(this.q);
        }
        com.flurry.a.b.a.d.i.d a = pVar.h().a();
        boolean[] zArr = (boolean[]) a.a();
        int i2 = 0;
        while (jVar.b() != com.flurry.a.b.a.o.END_ARRAY) {
            boolean d = d(jVar, pVar);
            if (i2 >= zArr.length) {
                i = 0;
                zArr = (boolean[]) a.a(zArr, i2);
            } else {
                i = i2;
            }
            i2 = i + 1;
            zArr[i] = d;
        }
        return (boolean[]) a.b(zArr, i2);
    }

    public ag() {
        super(boolean[].class);
    }
}
