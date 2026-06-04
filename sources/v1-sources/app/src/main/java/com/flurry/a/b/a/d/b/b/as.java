package com.flurry.a.b.a.d.b.b;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class as extends bw {
    public as() {
        super(BigInteger.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.w
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BigInteger a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT) {
            switch (jVar.q()) {
                case INT:
                case LONG:
                    return BigInteger.valueOf(jVar.u());
            }
        }
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return jVar.y().toBigInteger();
        }
        if (e != com.flurry.a.b.a.o.VALUE_STRING) {
            throw pVar.a(this.q, e);
        }
        String trim = jVar.k().trim();
        if (trim.length() == 0) {
            return null;
        }
        try {
            return new BigInteger(trim);
        } catch (IllegalArgumentException e2) {
            throw pVar.b(this.q, "not a valid representation");
        }
    }
}
