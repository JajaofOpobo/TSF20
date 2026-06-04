package com.flurry.a.b.a.h;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends LinkedHashMap {
    public static final i a = new i();

    private i() {
        super(192, 0.8f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 192;
    }

    public final synchronized String a(String str) {
        String str2;
        str2 = (String) get(str);
        if (str2 == null) {
            str2 = str.intern();
            put(str2, str2);
        }
        return str2;
    }
}
