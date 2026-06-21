package com.tsf.shell.e.f.a.b;

import java.util.Comparator;

/* loaded from: classes.dex */
public class o implements Comparator {
    final /* synthetic */ n a;

    public o(n nVar) {
        this.a = nVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(com.censivn.C3DEngine.b.f.j jVar, com.censivn.C3DEngine.b.f.j jVar2) {
        if (jVar.getTag() == null || jVar2.getTag() == null) {
            return 0;
        }
        float floatValue = ((Float) jVar.getTag()).floatValue();
        float floatValue2 = ((Float) jVar2.getTag()).floatValue();
        if (floatValue == floatValue2) {
            return 0;
        }
        return floatValue > floatValue2 ? 1 : -1;
    }
}
