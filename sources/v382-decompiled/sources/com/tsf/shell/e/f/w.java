package com.tsf.shell.e.f;

import java.util.Comparator;

/* loaded from: classes.dex */
class w implements Comparator {
    final /* synthetic */ v a;
    private double b = 0.017453292519943295d;

    w(v vVar) {
        this.a = vVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(com.censivn.C3DEngine.b.f.j jVar, com.censivn.C3DEngine.b.f.j jVar2) {
        float f;
        float f2;
        double cos = Math.cos((jVar.rotation().y + this.a.A.rotation().y) * this.b);
        f = this.a.n;
        float f3 = (float) (cos * f);
        double cos2 = Math.cos((jVar2.rotation().y + this.a.A.rotation().y) * this.b);
        f2 = this.a.n;
        float f4 = (float) (cos2 * f2);
        if (f3 > f4) {
            return 1;
        }
        if (f3 < f4) {
            return -1;
        }
        return 0;
    }
}
