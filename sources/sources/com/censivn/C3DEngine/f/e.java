package com.censivn.C3DEngine.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public enum e {
    POINTS(0),
    LINES(1),
    LINE_LOOP(2),
    LINE_STRIP(3),
    TRIANGLES(4),
    TRIANGLE_STRIP(5),
    TRIANGLE_FAN(6);

    private final int h;

    e(int i2) {
        this.h = i2;
    }

    public int a() {
        return this.h;
    }
}
