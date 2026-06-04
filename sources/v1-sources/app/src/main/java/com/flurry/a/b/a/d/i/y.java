package com.flurry.a.b.a.d.i;

import com.flurry.a.b.a.d.ah;

/* loaded from: classes.dex */
public final class y {
    protected r a;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized com.flurry.a.b.a.c.h a(Class cls, ah ahVar) {
        com.flurry.a.b.a.c.h hVar;
        com.flurry.a.b.a.d.h.b bVar = new com.flurry.a.b.a.d.h.b(cls);
        if (this.a == null) {
            this.a = new r();
        } else {
            hVar = (com.flurry.a.b.a.c.h) this.a.get(bVar);
        }
        String b = ahVar.a().b(((com.flurry.a.b.a.d.e.k) ahVar.f(cls)).c());
        hVar = new com.flurry.a.b.a.c.h(b == null ? cls.getSimpleName() : b);
        this.a.put(bVar, hVar);
        return hVar;
    }
}
