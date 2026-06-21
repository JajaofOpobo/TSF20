package com.censivn.C3DEngine.b.f;

import java.util.Comparator;

/* loaded from: classes.dex */
public class b implements Comparator {
    final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(j jVar, j jVar2) {
        int rendererPriorityLevel = jVar.getRendererPriorityLevel();
        int rendererPriorityLevel2 = jVar2.getRendererPriorityLevel();
        if (rendererPriorityLevel > rendererPriorityLevel2) {
            return 1;
        }
        if (rendererPriorityLevel < rendererPriorityLevel2) {
            return -1;
        }
        return 0;
    }
}
