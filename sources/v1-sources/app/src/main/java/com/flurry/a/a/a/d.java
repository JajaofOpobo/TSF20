package com.flurry.a.a.a;

import java.util.HashSet;

/* loaded from: classes.dex */
final class d extends ThreadLocal {
    d() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new HashSet();
    }
}
