package com.flurry.a.a.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ae extends c {
    private final List f;
    private final Map g;

    public ae(r rVar) {
        super(ad.UNION);
        int i;
        String g;
        this.g = new HashMap();
        this.f = rVar.a();
        int i2 = 0;
        Iterator it = rVar.iterator();
        do {
            i = i2;
            if (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.a() == ad.UNION) {
                    throw new a("Nested union: " + this);
                }
                g = cVar.g();
                if (g == null) {
                    throw new a("Nameless in union:" + this);
                }
                i2 = i + 1;
            } else {
                return;
            }
        } while (this.g.put(g, Integer.valueOf(i)) == null);
        throw new a("Duplicate in union:" + g);
    }

    @Override // com.flurry.a.a.a.c
    public final List k() {
        return this.f;
    }

    @Override // com.flurry.a.a.a.c
    public final Integer e(String str) {
        return (Integer) this.g.get(str);
    }

    @Override // com.flurry.a.a.a.c
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return c(aeVar) && this.f.equals(aeVar.f) && this.c.equals(aeVar.c);
    }

    @Override // com.flurry.a.a.a.c
    final int m() {
        int m = super.m();
        Iterator it = this.f.iterator();
        while (true) {
            int i = m;
            if (it.hasNext()) {
                m = ((c) it.next()).m() + i;
            } else {
                return i;
            }
        }
    }

    @Override // com.flurry.a.a.a.c
    public final void a(String str, String str2) {
        throw new a("Can't set properties on a union: " + this);
    }

    @Override // com.flurry.a.a.a.c
    final void a(w wVar, com.flurry.a.b.a.e eVar) {
        eVar.b();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(wVar, eVar);
        }
        eVar.c();
    }
}
