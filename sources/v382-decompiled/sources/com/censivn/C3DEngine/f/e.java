package com.censivn.C3DEngine.f;

/* loaded from: classes.dex */
public enum e {
    POINTS(0),
    LINES(1),
    LINE_LOOP(2),
    LINE_STRIP(3),
    TRIANGLES(4),
    TRIANGLE_STRIP(5),
    TRIANGLE_FAN(6);

    private final int h;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] valuesCustom = values();
        int length = valuesCustom.length;
        e[] eVarArr = new e[length];
        System.arraycopy(valuesCustom, 0, eVarArr, 0, length);
        return eVarArr;
    }

    e(int i2) {
        this.h = i2;
    }

    public int a() {
        return this.h;
    }
}
