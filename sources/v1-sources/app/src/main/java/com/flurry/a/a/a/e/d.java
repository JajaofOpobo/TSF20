package com.flurry.a.a.a.e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d extends WeakReference {
    int a;
    final /* synthetic */ b b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    d(b bVar, Object obj) {
        super(obj, r0);
        ReferenceQueue referenceQueue;
        this.b = bVar;
        referenceQueue = bVar.a;
        this.a = System.identityHashCode(obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this == obj || get() == ((d) obj).get();
    }
}
