package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class bq extends bf {
    @Override // com.flurry.a.b.a.d.b.b.bf
    public final /* synthetic */ Object b(String str, com.flurry.a.b.a.d.p pVar) {
        int parseInt = Integer.parseInt(str);
        if (parseInt < -32768 || parseInt > 32767) {
            throw pVar.a(this.a, str, "overflow, value can not be represented as 16-bit value");
        }
        return Short.valueOf((short) parseInt);
    }

    bq() {
        super(Integer.class);
    }
}
