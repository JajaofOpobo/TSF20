package com.tsf.shell.plugin.themepicker.indicator;

/* loaded from: classes.dex */
public enum f {
    None(0),
    Triangle(1),
    Underline(2);

    public final int d;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        f[] valuesCustom = values();
        int length = valuesCustom.length;
        f[] fVarArr = new f[length];
        System.arraycopy(valuesCustom, 0, fVarArr, 0, length);
        return fVarArr;
    }

    f(int i) {
        this.d = i;
    }

    public static f a(int i) {
        for (f fVar : valuesCustom()) {
            if (fVar.d == i) {
                return fVar;
            }
        }
        return null;
    }
}
