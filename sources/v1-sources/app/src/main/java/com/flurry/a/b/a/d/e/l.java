package com.flurry.a.b.a.d.e;

import com.flurry.a.b.a.d.ah;
import com.flurry.a.b.a.d.as;

/* loaded from: classes.dex */
public final class l extends com.flurry.a.b.a.d.i {
    protected static final k a = k.a(null, com.flurry.a.b.a.d.h.h.d(String.class), b.b(String.class, null, null));
    protected static final k b = k.a(null, com.flurry.a.b.a.d.h.h.d(Boolean.TYPE), b.b(Boolean.TYPE, null, null));
    protected static final k c = k.a(null, com.flurry.a.b.a.d.h.h.d(Integer.TYPE), b.b(Integer.TYPE, null, null));
    protected static final k d = k.a(null, com.flurry.a.b.a.d.h.h.d(Long.TYPE), b.b(Long.TYPE, null, null));
    public static final m e = new m((byte) 0);
    public static final p f = new p();
    public static final o g = new o();
    protected static final s h = new n((byte) 0);
    public static final l i = new l();

    @Override // com.flurry.a.b.a.d.i
    public final /* synthetic */ com.flurry.a.b.a.d.e a(ah ahVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.j jVar) {
        boolean b2 = ahVar.b();
        com.flurry.a.b.a.d.b a2 = ahVar.a();
        Class p = aVar.p();
        if (!b2) {
            a2 = null;
        }
        return k.a(ahVar, aVar, b.a(p, a2, jVar));
    }

    @Override // com.flurry.a.b.a.d.i
    public final /* synthetic */ com.flurry.a.b.a.d.e a(as asVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.j jVar) {
        k a2 = a(aVar);
        return a2 == null ? k.b(a(asVar, aVar, jVar, true)) : a2;
    }

    @Override // com.flurry.a.b.a.d.i
    public final /* bridge */ /* synthetic */ com.flurry.a.b.a.d.e a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.j jVar) {
        k a2 = a(aVar);
        return a2 == null ? k.a(a(nVar, aVar, jVar, false)) : a2;
    }

    @Override // com.flurry.a.b.a.d.i
    public final /* synthetic */ com.flurry.a.b.a.d.e b(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.j jVar) {
        k a2 = a(aVar);
        return a2 == null ? k.a(a(nVar, aVar, jVar, false)) : a2;
    }

    private static u a(ah ahVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.j jVar, boolean z) {
        boolean b2 = ahVar.b();
        com.flurry.a.b.a.d.b a2 = ahVar.a();
        Class p = aVar.p();
        if (!b2) {
            a2 = null;
        }
        b a3 = b.a(p, a2, jVar);
        a3.a(h);
        a3.m();
        a3.a(h);
        a3.n();
        return new u(ahVar, z, aVar, a3).k();
    }

    private static k a(com.flurry.a.b.a.g.a aVar) {
        Class p = aVar.p();
        if (p == String.class) {
            return a;
        }
        if (p == Boolean.TYPE) {
            return b;
        }
        if (p == Integer.TYPE) {
            return c;
        }
        if (p == Long.TYPE) {
            return d;
        }
        return null;
    }
}
