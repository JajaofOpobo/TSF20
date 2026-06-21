package com.censivn.C3DEngine.i;

/* loaded from: classes.dex */
public enum g {
    SMOOTH(7425),
    FLAT(7424);

    private final int c;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        g[] valuesCustom = values();
        int length = valuesCustom.length;
        g[] gVarArr = new g[length];
        System.arraycopy(valuesCustom, 0, gVarArr, 0, length);
        return gVarArr;
    }

    g(int i) {
        this.c = i;
    }
}
