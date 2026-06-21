package com.tsf.shell.plugin.themepicker.utils;

/* loaded from: classes.dex */
public enum e {
    PENDING,
    RUNNING,
    FINISHED;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] valuesCustom = values();
        int length = valuesCustom.length;
        e[] eVarArr = new e[length];
        System.arraycopy(valuesCustom, 0, eVarArr, 0, length);
        return eVarArr;
    }
}
