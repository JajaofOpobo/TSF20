package com.flurry.a.b.a.d.g.b;

/* loaded from: classes.dex */
public final class ah extends y implements com.flurry.a.b.a.d.ar {
    protected com.flurry.a.b.a.d.ac a;

    @Override // com.flurry.a.b.a.d.g.b.y
    public final /* synthetic */ void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        int i = 0;
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        if (length != 0) {
            if (this.a == null) {
                while (i < length) {
                    if (strArr[i] == null) {
                        eVar.f();
                    } else {
                        eVar.b(strArr[i]);
                    }
                    i++;
                }
                return;
            }
            com.flurry.a.b.a.d.ac acVar = this.a;
            int length2 = strArr.length;
            while (i < length2) {
                if (strArr[i] == null) {
                    awVar.a(eVar);
                } else {
                    acVar.a(strArr[i], eVar, awVar);
                }
                i++;
            }
        }
    }

    public ah(com.flurry.a.b.a.d.f fVar) {
        super(String[].class, null, fVar);
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        return this;
    }

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.ac a = awVar.a(String.class, this.f);
        if (a != null && a.getClass().getAnnotation(com.flurry.a.b.a.d.a.b.class) == null) {
            this.a = a;
        }
    }
}
