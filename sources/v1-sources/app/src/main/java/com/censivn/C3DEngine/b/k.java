package com.censivn.C3DEngine.b;

import android.opengl.Matrix;

/* loaded from: classes.dex */
public final class k {
    private static final float[] a = new float[32];

    public static void a(float[] fArr, float[] fArr2, float[] fArr3, int i) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, i);
    }

    public static void a(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
    }

    public static void a(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6) {
        if (f == f2) {
            throw new IllegalArgumentException("left == right");
        }
        if (f4 == f3) {
            throw new IllegalArgumentException("top == bottom");
        }
        if (f5 == f6) {
            throw new IllegalArgumentException("near == far");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("near <= 0.0f");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("far <= 0.0f");
        }
        float f7 = 1.0f / (f2 - f);
        float f8 = 1.0f / (f4 - f3);
        float f9 = 1.0f / (f5 - f6);
        float f10 = f5 * f7 * 2.0f;
        float f11 = f5 * f8 * 2.0f;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[8] = f7 * (f2 + f) * 2.0f;
        fArr[9] = f8 * (f4 + f3);
        fArr[10] = (f6 + f5) * f9;
        fArr[14] = f9 * f6 * f5 * 2.0f;
        fArr[11] = -1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[15] = 0.0f;
    }

    private static float a(float f, float f2, float f3) {
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    public static void a(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f4 - f;
        float f11 = f5 - f2;
        float f12 = f6 - f3;
        float a2 = 1.0f / a(f10, f11, f12);
        float f13 = f10 * a2;
        float f14 = f11 * a2;
        float f15 = f12 * a2;
        float f16 = (f14 * f9) - (f15 * f8);
        float f17 = (f15 * f7) - (f13 * f9);
        float f18 = (f13 * f8) - (f14 * f7);
        float a3 = 1.0f / a(f16, f17, f18);
        float f19 = f16 * a3;
        float f20 = f17 * a3;
        float f21 = f18 * a3;
        fArr[0] = f19;
        fArr[1] = (f20 * f15) - (f21 * f14);
        fArr[2] = -f13;
        fArr[3] = 0.0f;
        fArr[4] = f20;
        fArr[5] = (f21 * f13) - (f19 * f15);
        fArr[6] = -f14;
        fArr[7] = 0.0f;
        fArr[8] = f21;
        fArr[9] = (f19 * f14) - (f20 * f13);
        fArr[10] = -f15;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        float f22 = -f;
        float f23 = -f2;
        float f24 = -f3;
        for (int i = 0; i < 4; i++) {
            int i2 = i + 0;
            int i3 = i2 + 12;
            fArr[i3] = (fArr[i2 + 8] * f24) + (fArr[i2] * f22) + (fArr[i2 + 4] * f23) + fArr[i3];
        }
    }
}
