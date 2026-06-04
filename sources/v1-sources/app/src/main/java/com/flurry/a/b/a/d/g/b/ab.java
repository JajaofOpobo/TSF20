package com.flurry.a.b.a.d.g.b;

/* loaded from: classes.dex */
public final class ab extends v {
    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        char[] cArr = (char[]) obj;
        if (!awVar.a(com.flurry.a.b.a.d.at.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            eVar.a(cArr, 0, cArr.length);
            return;
        }
        eVar.b();
        a(eVar, cArr);
        eVar.c();
    }

    @Override // com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        char[] cArr = (char[]) obj;
        if (awVar.a(com.flurry.a.b.a.d.at.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            azVar.c(cArr, eVar);
            a(eVar, cArr);
            azVar.f(cArr, eVar);
        } else {
            azVar.a(cArr, eVar);
            eVar.a(cArr, 0, cArr.length);
            azVar.d(cArr, eVar);
        }
    }

    public ab() {
        super(char[].class);
    }

    private static void a(com.flurry.a.b.a.e eVar, char[] cArr) {
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            eVar.a(cArr, i, 1);
        }
    }
}
