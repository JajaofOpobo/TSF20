package com.flurry.a.b.a.d.b.b;

import java.lang.reflect.Type;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ae {
    static final ae b = new ae();
    HashMap a = new HashMap();

    protected ae() {
        a(Boolean.TYPE, new ag());
        a(Byte.TYPE, new ah());
        a(Short.TYPE, new an());
        a(Integer.TYPE, new al());
        a(Long.TYPE, new am());
        a(Float.TYPE, new ak());
        a(Double.TYPE, new aj());
        a(String.class, new ao());
        a(Character.TYPE, new ai());
    }

    public static HashMap a() {
        return b.a;
    }

    private void a(Class cls, com.flurry.a.b.a.d.w wVar) {
        this.a.put(com.flurry.a.b.a.d.h.k.a().a((Type) cls), wVar);
    }
}
