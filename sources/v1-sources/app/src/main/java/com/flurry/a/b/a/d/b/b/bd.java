package com.flurry.a.b.a.d.b.b;

import java.util.Date;

/* loaded from: classes.dex */
public final class bd extends bw {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Date q = q(jVar, pVar);
        if (q == null) {
            return null;
        }
        return new java.sql.Date(q.getTime());
    }

    public bd() {
        super(java.sql.Date.class);
    }
}
