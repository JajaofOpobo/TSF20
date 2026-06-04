package com.flurry.a.b.a.d;

/* loaded from: classes.dex */
abstract class ak extends ah {
    protected int i;

    protected ak(i iVar, b bVar, com.flurry.a.b.a.d.e.x xVar, com.flurry.a.b.a.d.h.k kVar, int i) {
        super(iVar, bVar, xVar, kVar);
        this.i = i;
    }

    protected ak(ak akVar, ai aiVar, com.flurry.a.b.a.d.f.b bVar) {
        super(akVar, aiVar, bVar);
        this.i = akVar.i;
    }

    static int i(Class cls) {
        Object[] objArr = (Enum[]) cls.getEnumConstants();
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            i2 = ((aj) obj).a() ? ((aj) obj).b() | i2 : i2;
        }
        return i2;
    }
}
