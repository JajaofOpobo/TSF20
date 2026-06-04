package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public final class bz extends bw {
    @Override // com.flurry.a.b.a.d.b.b.bw, com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return a(jVar, pVar);
    }

    public bz() {
        super(String.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.w
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            return jVar.k();
        }
        if (e == com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT) {
            Object z = jVar.z();
            if (z == null) {
                return null;
            }
            if (z instanceof byte[]) {
                return com.flurry.a.b.a.b.a().a((byte[]) z, false);
            }
            return z.toString();
        }
        if (e.d()) {
            return jVar.k();
        }
        throw pVar.a(this.q, e);
    }
}
