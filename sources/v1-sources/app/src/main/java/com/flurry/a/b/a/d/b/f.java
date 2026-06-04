package com.flurry.a.b.a.d.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    protected final com.flurry.a.b.a.d.e.k a;
    protected final HashMap b = new LinkedHashMap();
    protected List c;
    protected HashMap d;
    protected HashSet e;
    protected v f;
    protected j g;
    protected boolean h;

    public f(com.flurry.a.b.a.d.e.k kVar) {
        this.a = kVar;
    }

    public final void a(k kVar) {
        this.b.put(kVar.c(), kVar);
    }

    public final void b(k kVar) {
        k kVar2 = (k) this.b.put(kVar.c(), kVar);
        if (kVar2 != null && kVar2 != kVar) {
            throw new IllegalArgumentException("Duplicate property '" + kVar.c() + "' for " + this.a.a());
        }
    }

    public final void a(String str, k kVar) {
        if (this.d == null) {
            this.d = new HashMap(4);
        }
        this.d.put(str, kVar);
        if (this.b != null) {
            this.b.remove(kVar.c());
        }
    }

    public final void a(String str, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.i.a aVar2, com.flurry.a.b.a.d.e.e eVar, Object obj) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new com.flurry.a.b.a.d.b.a.p(str, aVar, aVar2, eVar, obj));
    }

    public final void a(String str) {
        if (this.e == null) {
            this.e = new HashSet();
        }
        this.e.add(str);
    }

    public final void a(j jVar) {
        if (this.g != null && jVar != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.g = jVar;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(v vVar) {
        this.f = vVar;
    }

    public final boolean b(String str) {
        return this.b.containsKey(str);
    }

    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.b.a.a aVar = new com.flurry.a.b.a.d.b.a.a(this.b.values());
        aVar.a();
        return new d(this.a, fVar, this.f, aVar, this.d, this.e, this.h, this.g, this.c);
    }
}
