package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class al extends af {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i;
        if (!jVar.j()) {
            if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING && pVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jVar.k().length() == 0) {
                return null;
            }
            if (pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new int[]{i(jVar, pVar)};
            }
            throw pVar.b(this.q);
        }
        com.flurry.a.b.a.d.i.h d = pVar.h().d();
        int[] iArr = (int[]) d.a();
        int i2 = 0;
        while (jVar.b() != com.flurry.a.b.a.o.END_ARRAY) {
            int i3 = i(jVar, pVar);
            if (i2 >= iArr.length) {
                i = 0;
                iArr = (int[]) d.a(iArr, i2);
            } else {
                i = i2;
            }
            i2 = i + 1;
            iArr[i] = i3;
        }
        return (int[]) d.b(iArr, i2);
    }

    public al() {
        super(int[].class);
    }
}
