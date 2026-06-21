package com.censivn.C3DEngine.e;

import java.util.Comparator;

/* loaded from: classes.dex */
class e implements Comparator {
    final /* synthetic */ d a;

    private e(d dVar) {
        this.a = dVar;
    }

    /* synthetic */ e(d dVar, e eVar) {
        this(dVar);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        int height = bVar.a.getHeight();
        int height2 = bVar2.a.getHeight();
        if (height < height2) {
            return 1;
        }
        if (height == height2) {
            return 0;
        }
        return -1;
    }
}
