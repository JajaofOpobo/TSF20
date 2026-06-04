package com.flurry.a.b.a.d.b.a;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {
    private final ArrayList a = new ArrayList();
    private final HashMap b = new HashMap();

    public final void a(com.flurry.a.b.a.d.b.k kVar, String str) {
        Integer valueOf = Integer.valueOf(this.a.size());
        this.a.add(new h(kVar, str));
        this.b.put(kVar.c(), valueOf);
        this.b.put(str, valueOf);
    }

    public final f a() {
        return new f((h[]) this.a.toArray(new h[this.a.size()]), this.b);
    }
}
