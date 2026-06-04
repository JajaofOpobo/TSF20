package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class am extends af {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i;
        if (!jVar.j()) {
            if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING && pVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jVar.k().length() == 0) {
                return null;
            }
            if (pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new long[]{l(jVar, pVar)};
            }
            throw pVar.b(this.q);
        }
        com.flurry.a.b.a.d.i.i e = pVar.h().e();
        long[] jArr = (long[]) e.a();
        int i2 = 0;
        while (jVar.b() != com.flurry.a.b.a.o.END_ARRAY) {
            long l = l(jVar, pVar);
            if (i2 >= jArr.length) {
                i = 0;
                jArr = (long[]) e.a(jArr, i2);
            } else {
                i = i2;
            }
            i2 = i + 1;
            jArr[i] = l;
        }
        return (long[]) e.b(jArr, i2);
    }

    public am() {
        super(long[].class);
    }
}
