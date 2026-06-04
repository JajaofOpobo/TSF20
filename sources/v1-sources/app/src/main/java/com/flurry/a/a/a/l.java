package com.flurry.a.a.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class l extends v {
    private final List i;
    private final Map j;

    public l(u uVar, String str, r rVar) {
        super(ad.ENUM, uVar, str);
        this.i = rVar.a();
        this.j = new HashMap();
        Iterator it = rVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int i2 = i + 1;
            if (this.j.put(c.g(str2), Integer.valueOf(i)) != null) {
                throw new af("Duplicate enum symbol: " + str2);
            }
            i = i2;
        }
    }

    @Override // com.flurry.a.a.a.c
    public final List c() {
        return this.i;
    }

    @Override // com.flurry.a.a.a.c
    public final int c(String str) {
        return ((Integer) this.j.get(str)).intValue();
    }

    @Override // com.flurry.a.a.a.c
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return c(lVar) && a((v) lVar) && this.i.equals(lVar.i) && this.c.equals(lVar.c);
    }

    @Override // com.flurry.a.a.a.v, com.flurry.a.a.a.c
    final int m() {
        return super.m() + this.i.hashCode();
    }

    @Override // com.flurry.a.a.a.c
    final void a(w wVar, com.flurry.a.b.a.e eVar) {
        if (!b(wVar, eVar)) {
            eVar.d();
            eVar.a("type", "enum");
            c(wVar, eVar);
            if (this.g != null) {
                eVar.a("doc", this.g);
            }
            eVar.f("symbols");
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                eVar.b((String) it.next());
            }
            eVar.c();
            this.c.a(eVar);
            a(eVar);
            eVar.e();
        }
    }
}
