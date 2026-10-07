package com.censivn.C3DEngine.i;

import com.tsf.shell.theme.inside.ThemeParser;

/* loaded from: classes.dex */
public enum e {
    LINEAR(9729),
    EXP(2048),
    EXP2(ThemeParser.TYPE_ICON_MENU);

    private final int d;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] valuesCustom = values();
        int length = valuesCustom.length;
        e[] eVarArr = new e[length];
        System.arraycopy(valuesCustom, 0, eVarArr, 0, length);
        return eVarArr;
    }

    e(int i) {
        this.d = i;
    }
}
