package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class ai extends af {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            char[] l = jVar.l();
            int n = jVar.n();
            int m = jVar.m();
            char[] cArr = new char[m];
            System.arraycopy(l, n, cArr, 0, m);
            return cArr;
        }
        if (!jVar.j()) {
            if (e == com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT) {
                Object z = jVar.z();
                if (z == null) {
                    return null;
                }
                if (z instanceof char[]) {
                    return (char[]) z;
                }
                if (z instanceof String) {
                    return ((String) z).toCharArray();
                }
                if (z instanceof byte[]) {
                    return com.flurry.a.b.a.b.a().a((byte[]) z, false).toCharArray();
                }
            }
            throw pVar.b(this.q);
        }
        StringBuilder sb = new StringBuilder(64);
        while (true) {
            com.flurry.a.b.a.o b = jVar.b();
            if (b == com.flurry.a.b.a.o.END_ARRAY) {
                return sb.toString().toCharArray();
            }
            if (b != com.flurry.a.b.a.o.VALUE_STRING) {
                throw pVar.b(Character.TYPE);
            }
            String k = jVar.k();
            if (k.length() != 1) {
                throw com.flurry.a.b.a.d.y.a(jVar, "Can not convert a JSON String of length " + k.length() + " into a char element of char array");
            }
            sb.append(k.charAt(0));
        }
    }

    public ai() {
        super(char[].class);
    }
}
