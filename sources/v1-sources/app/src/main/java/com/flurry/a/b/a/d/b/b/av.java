package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public final class av extends bb {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT) {
            int t = jVar.t();
            if (t >= 0 && t <= 65535) {
                return Character.valueOf((char) t);
            }
        } else if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String k = jVar.k();
            if (k.length() == 1) {
                return Character.valueOf(k.charAt(0));
            }
            if (k.length() == 0) {
                return (Character) b();
            }
        }
        throw pVar.a(this.q, e);
    }

    public av(Class cls, Character ch) {
        super(cls, ch);
    }
}
