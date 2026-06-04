package com.flurry.a.a.a;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class v extends c {
    final u f;
    final String g;
    Set h;

    public v(ad adVar, u uVar, String str) {
        super(adVar);
        String str2;
        String str3;
        this.f = uVar;
        this.g = str;
        Map map = e;
        str2 = uVar.c;
        if (map.containsKey(str2)) {
            StringBuilder sb = new StringBuilder("Schemas may not be named after primitives: ");
            str3 = uVar.c;
            throw new b(sb.append(str3).toString());
        }
    }

    @Override // com.flurry.a.a.a.c
    public final String d() {
        String str;
        str = this.f.a;
        return str;
    }

    @Override // com.flurry.a.a.a.c
    public final String e() {
        return this.g;
    }

    @Override // com.flurry.a.a.a.c
    public final String f() {
        String str;
        str = this.f.b;
        return str;
    }

    @Override // com.flurry.a.a.a.c
    public final String g() {
        String str;
        str = this.f.c;
        return str;
    }

    @Override // com.flurry.a.a.a.c
    public final void d(String str) {
        String str2;
        if (this.h == null) {
            this.h = new LinkedHashSet();
        }
        Set set = this.h;
        str2 = this.f.b;
        set.add(new u(str, str2));
    }

    public final boolean b(w wVar, com.flurry.a.b.a.e eVar) {
        String str;
        if (!equals(wVar.get(this.f))) {
            str = this.f.a;
            if (str != null) {
                wVar.put(this.f, this);
            }
            return false;
        }
        eVar.b(this.f.a(wVar.a()));
        return true;
    }

    public final void c(w wVar, com.flurry.a.b.a.e eVar) {
        this.f.a(wVar, eVar);
    }

    public final boolean a(v vVar) {
        return this.f.equals(vVar.f);
    }

    @Override // com.flurry.a.a.a.c
    int m() {
        return super.m() + this.f.hashCode();
    }

    public final void a(com.flurry.a.b.a.e eVar) {
        String str;
        if (this.h != null && this.h.size() != 0) {
            eVar.a("aliases");
            eVar.b();
            for (u uVar : this.h) {
                str = this.f.b;
                eVar.b(uVar.a(str));
            }
            eVar.c();
        }
    }
}
