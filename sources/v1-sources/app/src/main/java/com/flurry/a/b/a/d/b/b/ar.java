package com.flurry.a.b.a.d.b.b;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class ar extends bw {
    public ar() {
        super(BigDecimal.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.w
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BigDecimal a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return jVar.y();
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if (trim.length() == 0) {
                return null;
            }
            try {
                return new BigDecimal(trim);
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid representation");
            }
        }
        throw pVar.a(this.q, e);
    }
}
