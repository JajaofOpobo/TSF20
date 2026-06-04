package com.flurry.a.b.a.d.b.a;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o {
    protected final ArrayList a = new ArrayList();

    public final void a(com.flurry.a.b.a.d.b.k kVar) {
        this.a.add(kVar);
    }

    public final Object a(com.flurry.a.b.a.d.p pVar, Object obj, com.flurry.a.b.a.h.m mVar) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            com.flurry.a.b.a.d.b.k kVar = (com.flurry.a.b.a.d.b.k) this.a.get(i);
            com.flurry.a.b.a.j h = mVar.h();
            h.b();
            kVar.a(h, pVar, obj);
        }
        return obj;
    }
}
