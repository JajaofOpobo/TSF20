package com.tsf.shell.plugin.themepicker;

/* loaded from: classes.dex */
enum v {
    HIDING,
    HIDDEN,
    SHOWING,
    SHOWN;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static v[] valuesCustom() {
        v[] valuesCustom = values();
        int length = valuesCustom.length;
        v[] vVarArr = new v[length];
        System.arraycopy(valuesCustom, 0, vVarArr, 0, length);
        return vVarArr;
    }
}
