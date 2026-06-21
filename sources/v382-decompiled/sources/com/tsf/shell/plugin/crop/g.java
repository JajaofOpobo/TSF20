package com.tsf.shell.plugin.crop;

/* loaded from: classes.dex */
enum g {
    CENTER,
    NULL,
    TOP,
    LEFT,
    RIGHT,
    BOTTOM;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        g[] valuesCustom = values();
        int length = valuesCustom.length;
        g[] gVarArr = new g[length];
        System.arraycopy(valuesCustom, 0, gVarArr, 0, length);
        return gVarArr;
    }
}
