package com.censivn.C3DEngine.f;

/* loaded from: classes.dex */
public enum f {
    SMOOTH(7425),
    FLAT(7424);

    private final int c;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        f[] valuesCustom = values();
        int length = valuesCustom.length;
        f[] fVarArr = new f[length];
        System.arraycopy(valuesCustom, 0, fVarArr, 0, length);
        return fVarArr;
    }

    f(int i) {
        this.c = i;
    }
}
