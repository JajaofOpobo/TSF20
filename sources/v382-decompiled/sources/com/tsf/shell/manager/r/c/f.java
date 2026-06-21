package com.tsf.shell.manager.r.c;

import com.censivn.C3DEngine.b.f.j;
import java.util.Comparator;

/* loaded from: classes.dex */
public class f implements Comparator {
    final /* synthetic */ e a;

    public f(e eVar) {
        this.a = eVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(j jVar, j jVar2) {
        float f = (com.censivn.C3DEngine.b.b.a.I - (jVar.position().y * com.censivn.C3DEngine.b.b.a.F)) + jVar.position().x + com.censivn.C3DEngine.b.b.a.H;
        float f2 = (com.censivn.C3DEngine.b.b.a.I - (jVar2.position().y * com.censivn.C3DEngine.b.b.a.F)) + jVar2.position().x + com.censivn.C3DEngine.b.b.a.H;
        if (f > f2) {
            return 1;
        }
        if (f < f2) {
            return -1;
        }
        return 0;
    }
}
