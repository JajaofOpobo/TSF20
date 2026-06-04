package com.flurry.a.b.a.d.i;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class p {
    protected final Class a;
    protected final Enum[] b;
    protected final HashMap c;

    private p(Class cls, Enum[] enumArr, HashMap hashMap) {
        this.a = cls;
        this.b = enumArr;
        this.c = hashMap;
    }

    public static p a(Class cls, com.flurry.a.b.a.d.b bVar) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("No enum constants for class " + cls.getName());
        }
        HashMap hashMap = new HashMap();
        for (Enum r4 : enumArr) {
            hashMap.put(bVar.a(r4), r4);
        }
        return new p(cls, enumArr, hashMap);
    }

    public static p a(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum r3 = enumArr[length];
                hashMap.put(r3.toString(), r3);
            } else {
                return new p(cls, enumArr, hashMap);
            }
        }
    }

    public final Enum a(String str) {
        return (Enum) this.c.get(str);
    }

    public final Enum a(int i) {
        if (i < 0 || i >= this.b.length) {
            return null;
        }
        return this.b[i];
    }

    public final Class a() {
        return this.a;
    }

    public final int b() {
        return this.b.length - 1;
    }
}
