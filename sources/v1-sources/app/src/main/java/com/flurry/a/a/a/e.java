package com.flurry.a.a.a;

import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class e extends ThreadLocal {
    e() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new IdentityHashMap();
    }
}
