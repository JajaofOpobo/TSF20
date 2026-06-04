package com.flurry.a.a.a.e;

import java.util.Map;

/* loaded from: classes.dex */
final class c implements Map.Entry {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ b c;

    c(b bVar, Object obj, Object obj2) {
        this.c = bVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
