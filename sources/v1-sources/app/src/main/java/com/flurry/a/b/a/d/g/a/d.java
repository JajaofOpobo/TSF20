package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;
import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public abstract class d {
    public abstract ac a(Class cls);

    public abstract d a(Class cls, ac acVar);

    public final h a(Class cls, aw awVar, com.flurry.a.b.a.d.f fVar) {
        ac a = awVar.a(cls, fVar);
        return new h(a, a(cls, a));
    }

    public final h a(com.flurry.a.b.a.g.a aVar, aw awVar, com.flurry.a.b.a.d.f fVar) {
        ac a = awVar.a(aVar, fVar);
        return new h(a, a(aVar.p(), a));
    }

    public static d a() {
        return f.a;
    }
}
