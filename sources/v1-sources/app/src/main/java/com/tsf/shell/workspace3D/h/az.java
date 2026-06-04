package com.tsf.shell.workspace3D.h;

import java.util.Comparator;

/* loaded from: classes.dex */
final class az implements Comparator {
    final /* synthetic */ ao a;
    private double b = 0.017453292519943295d;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        com.censivn.C3DEngine.b.v vVar;
        float f;
        com.censivn.C3DEngine.b.v vVar2;
        float f2;
        float f3 = ((com.censivn.C3DEngine.b.r) obj).M().y;
        vVar = this.a.z;
        double cos = Math.cos((f3 + vVar.M().y) * this.b);
        f = this.a.m;
        float f4 = (float) (cos * f);
        float f5 = ((com.censivn.C3DEngine.b.r) obj2).M().y;
        vVar2 = this.a.z;
        double cos2 = Math.cos((f5 + vVar2.M().y) * this.b);
        f2 = this.a.m;
        float f6 = (float) (cos2 * f2);
        if (f4 > f6) {
            return 1;
        }
        return f4 < f6 ? -1 : 0;
    }

    az(ao aoVar) {
        this.a = aoVar;
    }
}
