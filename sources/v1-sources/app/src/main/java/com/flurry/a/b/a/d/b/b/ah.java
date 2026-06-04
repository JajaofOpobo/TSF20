package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class ah extends af {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        byte r;
        int i;
        byte[] bArr;
        byte r2;
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            return jVar.a(pVar.c());
        }
        if (e == com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT) {
            Object z = jVar.z();
            if (z == null) {
                return null;
            }
            if (z instanceof byte[]) {
                return (byte[]) z;
            }
        }
        if (!jVar.j()) {
            if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING && pVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jVar.k().length() == 0) {
                return null;
            }
            if (!pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                throw pVar.b(this.q);
            }
            com.flurry.a.b.a.o e2 = jVar.e();
            if (e2 == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e2 == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
                r2 = jVar.r();
            } else {
                if (e2 != com.flurry.a.b.a.o.VALUE_NULL) {
                    throw pVar.b(this.q.getComponentType());
                }
                r2 = 0;
            }
            return new byte[]{r2};
        }
        com.flurry.a.b.a.d.i.e b = pVar.h().b();
        int i2 = 0;
        byte[] bArr2 = (byte[]) b.a();
        while (true) {
            com.flurry.a.b.a.o b2 = jVar.b();
            if (b2 == com.flurry.a.b.a.o.END_ARRAY) {
                return (byte[]) b.b(bArr2, i2);
            }
            if (b2 == com.flurry.a.b.a.o.VALUE_NUMBER_INT || b2 == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
                r = jVar.r();
            } else {
                if (b2 != com.flurry.a.b.a.o.VALUE_NULL) {
                    throw pVar.b(this.q.getComponentType());
                }
                r = 0;
            }
            if (i2 >= bArr2.length) {
                bArr = (byte[]) b.a(bArr2, i2);
                i = 0;
            } else {
                i = i2;
                bArr = bArr2;
            }
            bArr[i] = r;
            bArr2 = bArr;
            i2 = i + 1;
        }
    }

    public ah() {
        super(byte[].class);
    }
}
