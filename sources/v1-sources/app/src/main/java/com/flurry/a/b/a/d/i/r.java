package com.flurry.a.b.a.d.i;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r extends LinkedHashMap {
    protected final int a;

    public r() {
        super(20, 0.8f, true);
        this.a = 200;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a;
    }
}
