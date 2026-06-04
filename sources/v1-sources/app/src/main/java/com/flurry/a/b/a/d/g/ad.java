package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.aw;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class ad extends com.flurry.a.b.a.d.g.b.s {
    public static final ad a = new ad();

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        Number number = (Number) obj;
        if (number instanceof BigDecimal) {
            eVar.a((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            eVar.a((BigInteger) number);
            return;
        }
        if (number instanceof Integer) {
            eVar.a(number.intValue());
            return;
        }
        if (number instanceof Long) {
            eVar.a(number.longValue());
            return;
        }
        if (number instanceof Double) {
            eVar.a(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            eVar.a(number.floatValue());
        } else if ((number instanceof Byte) || (number instanceof Short)) {
            eVar.a(number.intValue());
        } else {
            eVar.e(number.toString());
        }
    }

    public ad() {
        super(Number.class);
    }
}
