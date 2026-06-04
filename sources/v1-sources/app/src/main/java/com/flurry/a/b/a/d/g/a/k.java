package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k {
    protected final b a;
    protected final m b = new m((Class) getClass(), false);

    private k(b bVar) {
        this.a = bVar;
    }

    public final k a() {
        return new k(this.a);
    }

    public static k a(HashMap hashMap) {
        return new k(new b(hashMap));
    }

    public final ac a(com.flurry.a.b.a.g.a aVar) {
        this.b.a(aVar);
        return this.a.a(this.b);
    }

    public final ac a(Class cls) {
        this.b.a(cls);
        return this.a.a(this.b);
    }

    public final ac b(Class cls) {
        this.b.b(cls);
        return this.a.a(this.b);
    }

    public final ac b(com.flurry.a.b.a.g.a aVar) {
        this.b.b(aVar);
        return this.a.a(this.b);
    }
}
