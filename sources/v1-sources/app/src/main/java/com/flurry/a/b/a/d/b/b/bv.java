package com.flurry.a.b.a.d.b.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class bv {
    protected final HashMap a = new HashMap();

    protected bv() {
        a(new bg());
        a(new bh());
        a(new bj());
        a(new bq());
        a(new bo());
        a(new bp());
        a(new bn());
        a(new bl());
        a(new bk());
        a(new bi());
        a(new bu());
    }

    private void a(bf bfVar) {
        Class a = bfVar.a();
        HashMap hashMap = this.a;
        com.flurry.a.b.a.d.h.k.a();
        hashMap.put(com.flurry.a.b.a.d.h.k.a(a), bfVar);
    }

    public static HashMap a() {
        return new bv().a;
    }

    public static com.flurry.a.b.a.d.ae a(com.flurry.a.b.a.g.a aVar) {
        return bt.a(aVar.getClass());
    }

    public static com.flurry.a.b.a.d.ae a(com.flurry.a.b.a.d.i.p pVar) {
        return new bm(pVar, null);
    }

    public static com.flurry.a.b.a.d.ae a(com.flurry.a.b.a.d.i.p pVar, com.flurry.a.b.a.d.e.f fVar) {
        return new bm(pVar, fVar);
    }

    public static com.flurry.a.b.a.d.ae a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar) {
        com.flurry.a.b.a.d.e.k kVar = (com.flurry.a.b.a.d.e.k) nVar.b(aVar);
        Constructor a = kVar.a(String.class);
        if (a != null) {
            if (nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                com.flurry.a.b.a.d.i.l.a(a);
            }
            return new br(a);
        }
        Method b = kVar.b(String.class);
        if (b != null) {
            if (nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                com.flurry.a.b.a.d.i.l.a((Member) b);
            }
            return new bs(b);
        }
        return null;
    }
}
