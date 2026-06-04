package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;

/* loaded from: classes.dex */
final class g extends d {
    private final j[] a;

    public g(j[] jVarArr) {
        this.a = jVarArr;
    }

    @Override // com.flurry.a.b.a.d.g.a.d
    public final ac a(Class cls) {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            j jVar = this.a[i];
            if (jVar.a == cls) {
                return jVar.b;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.g.a.d
    public final d a(Class cls, ac acVar) {
        int length = this.a.length;
        if (length != 8) {
            j[] jVarArr = new j[length + 1];
            System.arraycopy(this.a, 0, jVarArr, 0, length);
            jVarArr[length] = new j(cls, acVar);
            return new g(jVarArr);
        }
        return this;
    }
}
