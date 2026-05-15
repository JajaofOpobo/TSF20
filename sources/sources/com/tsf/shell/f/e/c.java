package com.tsf.shell.f.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    public static final float a = com.censivn.C3DEngine.b.b.a.a(300.0f);

    public static float a(float f, float f2, float f3) {
        return a(f, f2, f3, a);
    }

    public static float a(float f, float f2, float f3, float f4) {
        if (f4 == 0.0f) {
            return f;
        }
        if (f > f2) {
            float f5 = (f - f2) / com.censivn.C3DEngine.b.b.a.D;
            return (float) ((Math.sin((((double) (f5 <= 1.0f ? f5 : 1.0f)) * 3.141592653589793d) / 2.0d) * ((double) f4)) + ((double) f2));
        }
        if (f < f3) {
            float f6 = (f3 - f) / com.censivn.C3DEngine.b.b.a.D;
            return (float) (((double) f3) - (Math.sin((((double) (f6 <= 1.0f ? f6 : 1.0f)) * 3.141592653589793d) / 2.0d) * ((double) f4)));
        }
        return f;
    }

    public static float a(float f) {
        if (0.32f == 0.0f) {
            return f;
        }
        if (f > 0.0f) {
            float f2 = (f - 0.0f) / 1.0f;
            return (float) ((Math.sin((((double) (f2 <= 1.0f ? f2 : 1.0f)) * 3.141592653589793d) / 2.0d) * ((double) 0.32f)) + 0.0d);
        }
        if (f < 0.0f) {
            float f3 = (0.0f - f) / 1.0f;
            return (float) (0.0d - (Math.sin((((double) (f3 <= 1.0f ? f3 : 1.0f)) * 3.141592653589793d) / 2.0d) * ((double) 0.32f)));
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
