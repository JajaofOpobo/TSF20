package com.flurry.a.b.a.d.i;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class q {
    private final EnumMap a;

    private q(Map map) {
        this.a = new EnumMap(map);
    }

    public static q a(Class cls, com.flurry.a.b.a.d.b bVar) {
        Enum[] enumArr = (Enum[]) l.e(cls).getEnumConstants();
        if (enumArr != null) {
            HashMap hashMap = new HashMap();
            for (Enum r4 : enumArr) {
                hashMap.put(r4, new com.flurry.a.b.a.c.h(bVar.a(r4)));
            }
            return new q(hashMap);
        }
        throw new IllegalArgumentException("Can not determine enum constants for Class " + cls.getName());
    }

    public static q a(Class cls) {
        Enum[] enumArr = (Enum[]) l.e(cls).getEnumConstants();
        if (enumArr != null) {
            HashMap hashMap = new HashMap();
            for (Enum r4 : enumArr) {
                hashMap.put(r4, new com.flurry.a.b.a.c.h(r4.toString()));
            }
            return new q(hashMap);
        }
        throw new IllegalArgumentException("Can not determine enum constants for Class " + cls.getName());
    }

    public final com.flurry.a.b.a.c.h a(Enum r2) {
        return (com.flurry.a.b.a.c.h) this.a.get(r2);
    }
}
