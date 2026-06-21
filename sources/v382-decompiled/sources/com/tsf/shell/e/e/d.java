package com.tsf.shell.e.e;

/* loaded from: classes.dex */
public class d {
    public static final float a = com.censivn.C3DEngine.b.b.a.a(300.0f);

    public static float a(float f, float f2, float f3) {
        return a(f, f2, f3, a);
    }

    public static float a(float f, float f2, float f3, float f4) {
        if (f4 == 0.0f) {
            return f;
        }
        if (f > f2) {
            return (float) ((Math.sin((((f - f2) / com.censivn.C3DEngine.b.b.a.D <= 1.0f ? r1 : 1.0f) * 3.141592653589793d) / 2.0d) * f4) + f2);
        }
        if (f < f3) {
            return (float) (f3 - (Math.sin((((f3 - f) / com.censivn.C3DEngine.b.b.a.D <= 1.0f ? r1 : 1.0f) * 3.141592653589793d) / 2.0d) * f4));
        }
        return f;
    }

    public static float a(float f) {
        if (0.32f == 0.0f) {
            return f;
        }
        if (f > 0.0f) {
            return (float) ((Math.sin((((f - 0.0f) / 1.0f <= 1.0f ? r1 : 1.0f) * 3.141592653589793d) / 2.0d) * 0.32f) + 0.0d);
        }
        if (f < 0.0f) {
            return (float) (0.0d - (Math.sin((((0.0f - f) / 1.0f <= 1.0f ? r1 : 1.0f) * 3.141592653589793d) / 2.0d) * 0.32f));
        }
        return f;
    }

    public static float a(float f, float f2) {
        return (f2 / 5.0f) + f;
    }

    public static float b(float f, float f2) {
        return f - (f2 / 3.0f);
    }
}
