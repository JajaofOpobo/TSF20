package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class bg extends bf {
    @Override // com.flurry.a.b.a.d.b.b.bf
    public final /* synthetic */ Object b(String str, com.flurry.a.b.a.d.p pVar) {
        if ("true".equals(str)) {
            return Boolean.TRUE;
        }
        if ("false".equals(str)) {
            return Boolean.FALSE;
        }
        throw pVar.a(this.a, str, "value not 'true' or 'false'");
    }

    bg() {
        super(Boolean.class);
    }
}
