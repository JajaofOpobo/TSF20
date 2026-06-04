package com.flurry.a.a.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class aa extends v {
    private List i;
    private Map j;
    private final boolean k;

    public aa(u uVar, String str, boolean z) {
        super(ad.RECORD, uVar, str);
        this.k = z;
    }

    @Override // com.flurry.a.a.a.c
    public final boolean h() {
        return this.k;
    }

    @Override // com.flurry.a.a.a.c
    public final m b(String str) {
        if (this.j == null) {
            throw new a("Schema fields not set yet");
        }
        return (m) this.j.get(str);
    }

    @Override // com.flurry.a.a.a.c
    public final List b() {
        if (this.i == null) {
            throw new a("Schema fields not set yet");
        }
        return this.i;
    }

    @Override // com.flurry.a.a.a.c
    public final void a(List list) {
        int i;
        if (this.i != null) {
            throw new a("Fields are already set");
        }
        this.j = new HashMap();
        r rVar = new r();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            i = mVar.b;
            if (i != -1) {
                throw new a("Field already used: " + mVar);
            }
            mVar.b = i2;
            this.j.put(mVar.a(), mVar);
            rVar.add(mVar);
            i2++;
        }
        this.i = rVar.a();
        this.d = Integer.MIN_VALUE;
    }

    @Override // com.flurry.a.a.a.c
    public final boolean equals(Object obj) {
        ThreadLocal threadLocal;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        if (c(aaVar) && a((v) aaVar) && this.c.equals(aaVar.c)) {
            threadLocal = c.i;
            Set set = (Set) threadLocal.get();
            ab abVar = new ab(this, obj, (byte) 0);
            if (set.contains(abVar)) {
                return true;
            }
            boolean isEmpty = set.isEmpty();
            try {
                set.add(abVar);
                return this.i.equals(((aa) obj).i);
            } finally {
                if (isEmpty) {
                    set.clear();
                }
            }
        }
        return false;
    }

    @Override // com.flurry.a.a.a.v, com.flurry.a.a.a.c
    final int m() {
        ThreadLocal threadLocal;
        threadLocal = c.j;
        Map map = (Map) threadLocal.get();
        if (map.containsKey(this)) {
            return 0;
        }
        boolean isEmpty = map.isEmpty();
        try {
            map.put(this, this);
            return super.m() + this.i.hashCode();
        } finally {
            if (isEmpty) {
                map.clear();
            }
        }
    }

    @Override // com.flurry.a.a.a.c
    final void a(w wVar, com.flurry.a.b.a.e eVar) {
        String str;
        String str2;
        Set set;
        z zVar;
        Set set2;
        Set set3;
        String str3;
        if (b(wVar, eVar)) {
            return;
        }
        str = wVar.a;
        eVar.d();
        eVar.a("type", this.k ? "error" : "record");
        c(wVar, eVar);
        str2 = this.f.b;
        wVar.a = str2;
        if (this.g != null) {
            eVar.a("doc", this.g);
        }
        eVar.a("fields");
        eVar.b();
        for (m mVar : this.i) {
            eVar.d();
            eVar.a("name", mVar.a());
            eVar.a("type");
            mVar.c().a(wVar, eVar);
            if (mVar.d() != null) {
                eVar.a("doc", mVar.d());
            }
            if (mVar.e() != null) {
                eVar.a("default");
                eVar.a(mVar.e());
            }
            if (mVar.f() != n.ASCENDING) {
                str3 = mVar.f().d;
                eVar.a("order", str3);
            }
            set = mVar.g;
            if (set != null) {
                set2 = mVar.g;
                if (set2.size() != 0) {
                    eVar.a("aliases");
                    eVar.b();
                    set3 = mVar.g;
                    Iterator it = set3.iterator();
                    while (it.hasNext()) {
                        eVar.b((String) it.next());
                    }
                    eVar.c();
                }
            }
            zVar = mVar.h;
            zVar.a(eVar);
            eVar.e();
        }
        eVar.c();
        this.c.a(eVar);
        a(eVar);
        eVar.e();
        wVar.a = str;
    }
}
