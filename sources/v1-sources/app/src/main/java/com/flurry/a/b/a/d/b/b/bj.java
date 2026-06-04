package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class bj extends bf {
    @Override // com.flurry.a.b.a.d.b.b.bf
    public final /* synthetic */ Object b(String str, com.flurry.a.b.a.d.p pVar) {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw pVar.a(this.a, str, "can only convert 1-character Strings");
    }

    bj() {
        super(Character.class);
    }
}
