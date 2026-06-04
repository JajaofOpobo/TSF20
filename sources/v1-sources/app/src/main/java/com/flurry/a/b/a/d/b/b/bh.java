package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class bh extends bf {
    @Override // com.flurry.a.b.a.d.b.b.bf
    public final /* synthetic */ Object b(String str, com.flurry.a.b.a.d.p pVar) {
        int parseInt = Integer.parseInt(str);
        if (parseInt < -128 || parseInt > 127) {
            throw pVar.a(this.a, str, "overflow, value can not be represented as 8-bit value");
        }
        return Byte.valueOf((byte) parseInt);
    }

    bh() {
        super(Byte.class);
    }
}
