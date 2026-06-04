package com.flurry.a.b.a.d.b.b;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class ba extends bw {
    public ba() {
        super(Number.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.w
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Number a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Number valueOf;
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT) {
            if (pVar.a(com.flurry.a.b.a.d.o.USE_BIG_INTEGER_FOR_INTS)) {
                return jVar.v();
            }
            return jVar.p();
        }
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            if (pVar.a(com.flurry.a.b.a.d.o.USE_BIG_DECIMAL_FOR_FLOATS)) {
                return jVar.y();
            }
            return Double.valueOf(jVar.x());
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            try {
                if (trim.indexOf(46) >= 0) {
                    if (pVar.a(com.flurry.a.b.a.d.o.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        valueOf = new BigDecimal(trim);
                    } else {
                        valueOf = new Double(trim);
                    }
                } else if (pVar.a(com.flurry.a.b.a.d.o.USE_BIG_INTEGER_FOR_INTS)) {
                    valueOf = new BigInteger(trim);
                } else {
                    long parseLong = Long.parseLong(trim);
                    if (parseLong <= 2147483647L && parseLong >= -2147483648L) {
                        valueOf = Integer.valueOf((int) parseLong);
                    } else {
                        valueOf = Long.valueOf(parseLong);
                    }
                }
                return valueOf;
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid number");
            }
        }
        throw pVar.a(this.q, e);
    }

    @Override // com.flurry.a.b.a.d.b.b.bw, com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        switch (jVar.e()) {
            case VALUE_NUMBER_INT:
            case VALUE_NUMBER_FLOAT:
            case VALUE_STRING:
                return a(jVar, pVar);
            default:
                return ayVar.c(jVar, pVar);
        }
    }
}
