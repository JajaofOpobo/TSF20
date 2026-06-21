package com.tsf.shell.plugin.themepicker.indicator;

/* loaded from: classes.dex */
public enum g {
    Bottom(0),
    Top(1);

    public final int c;

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

    public static g a(int i) {
        for (g gVar : valuesCustom()) {
            if (gVar.c == i) {
                return gVar;
            }
        }
        return null;
    }
}
