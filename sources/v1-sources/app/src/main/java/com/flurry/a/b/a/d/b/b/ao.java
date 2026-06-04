package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class ao extends af {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i;
        if (!jVar.j()) {
            if (pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                String[] strArr = new String[1];
                strArr[0] = jVar.e() != com.flurry.a.b.a.o.VALUE_NULL ? jVar.k() : null;
                return strArr;
            }
            if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING && pVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jVar.k().length() == 0) {
                return null;
            }
            throw pVar.b(this.q);
        }
        com.flurry.a.b.a.d.i.t g = pVar.g();
        Object[] a = g.a();
        int i2 = 0;
        while (true) {
            com.flurry.a.b.a.o b = jVar.b();
            if (b == com.flurry.a.b.a.o.END_ARRAY) {
                String[] strArr2 = (String[]) g.a(a, i2, String.class);
                pVar.a(g);
                return strArr2;
            }
            String k = b == com.flurry.a.b.a.o.VALUE_NULL ? null : jVar.k();
            if (i2 >= a.length) {
                a = g.a(a);
                i = 0;
            } else {
                i = i2;
            }
            i2 = i + 1;
            a[i] = k;
        }
    }

    public ao() {
        super(String[].class);
    }
}
