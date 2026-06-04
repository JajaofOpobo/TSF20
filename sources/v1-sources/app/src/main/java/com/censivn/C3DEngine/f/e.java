package com.censivn.C3DEngine.f;

import java.util.Comparator;

/* loaded from: classes.dex */
final class e implements Comparator {
    final /* synthetic */ d a;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int height = ((b) obj).a.getHeight();
        int height2 = ((b) obj2).a.getHeight();
        if (height < height2) {
            return 1;
        }
        return height == height2 ? 0 : -1;
    }

    private e(d dVar) {
        this.a = dVar;
    }

    /* synthetic */ e(d dVar, byte b) {
        this(dVar);
    }
}
