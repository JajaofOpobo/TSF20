package com.flurry.a.a.a;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
final class w extends LinkedHashMap {
    private String a;

    public final String a() {
        return this.a;
    }

    public final void a(String str) {
        this.a = str;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c get(Object obj) {
        u uVar;
        if (obj instanceof String) {
            ad adVar = (ad) c.e.get((String) obj);
            if (adVar != null) {
                return c.a(adVar);
            }
            uVar = new u((String) obj, this.a);
        } else {
            uVar = (u) obj;
        }
        return (c) super.get(uVar);
    }

    public final void a(c cVar) {
        put(((v) cVar).f, cVar);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c put(u uVar, c cVar) {
        if (containsKey(uVar)) {
            throw new af("Can't redefine: " + uVar);
        }
        return (c) super.put(uVar, cVar);
    }
}
