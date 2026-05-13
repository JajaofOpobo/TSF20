package com.censivn.C3DEngine.p030a;

import android.opengl.Matrix;
/* renamed from: com.censivn.C3DEngine.a.c */
/* loaded from: classes.dex */
public class C0863c {

    /* renamed from: a */
    private static final float[] f2445a = new float[32];

    /* renamed from: a */
    public static void m10829a(float[] fArr, int i, float[] fArr2, int i2, float[] fArr3, int i3) {
        Matrix.multiplyMM(fArr, i, fArr2, i2, fArr3, i3);
    }

    /* renamed from: b */
    public static void m10828b(float[] fArr, int i, float[] fArr2, int i2, float[] fArr3, int i3) {
        Matrix.multiplyMV(fArr, i, fArr2, i2, fArr3, i3);
    }

    /* renamed from: a */
    public static void m10831a(float[] fArr, int i, float f, float f2, float f3, float f4, float f5, float f6) {
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
        float f10 = 2.0f * f5 * f8;
        fArr[i + 0] = 2.0f * f5 * f7;
        fArr[i + 5] = f10;
        fArr[i + 8] = f7 * (f2 + f) * 2.0f;
        fArr[i + 9] = f8 * (f4 + f3);
        fArr[i + 10] = (f6 + f5) * f9;
        fArr[i + 14] = f9 * f6 * f5 * 2.0f;
        fArr[i + 11] = -1.0f;
        fArr[i + 1] = 0.0f;
        fArr[i + 2] = 0.0f;
        fArr[i + 3] = 0.0f;
        fArr[i + 4] = 0.0f;
        fArr[i + 6] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 12] = 0.0f;
        fArr[i + 13] = 0.0f;
        fArr[i + 15] = 0.0f;
    }

    /* renamed from: a */
    public static float m10833a(float f, float f2, float f3) {
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    /* renamed from: a */
    public static void m10832a(float[] fArr, int i, float f, float f2, float f3) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + i2;
            int i4 = i3 + 12;
            fArr[i4] = (fArr[i3 + 8] * f3) + (fArr[i3] * f) + (fArr[i3 + 4] * f2) + fArr[i4];
        }
    }

    /* renamed from: a */
    public static void m10830a(float[] fArr, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f4 - f;
        float f11 = f5 - f2;
        float f12 = f6 - f3;
        float m10833a = 1.0f / m10833a(f10, f11, f12);
        float f13 = f10 * m10833a;
        float f14 = f11 * m10833a;
        float f15 = f12 * m10833a;
        float f16 = (f14 * f9) - (f15 * f8);
        float f17 = (f15 * f7) - (f13 * f9);
        float f18 = (f13 * f8) - (f14 * f7);
        float m10833a2 = 1.0f / m10833a(f16, f17, f18);
        float f19 = f16 * m10833a2;
        float f20 = f17 * m10833a2;
        float f21 = f18 * m10833a2;
        fArr[i + 0] = f19;
        fArr[i + 1] = (f20 * f15) - (f21 * f14);
        fArr[i + 2] = -f13;
        fArr[i + 3] = 0.0f;
        fArr[i + 4] = f20;
        fArr[i + 5] = (f21 * f13) - (f19 * f15);
        fArr[i + 6] = -f14;
        fArr[i + 7] = 0.0f;
        fArr[i + 8] = f21;
        fArr[i + 9] = (f19 * f14) - (f20 * f13);
        fArr[i + 10] = -f15;
        fArr[i + 11] = 0.0f;
        fArr[i + 12] = 0.0f;
        fArr[i + 13] = 0.0f;
        fArr[i + 14] = 0.0f;
        fArr[i + 15] = 1.0f;
        m10832a(fArr, i, -f, -f2, -f3);
    }
}
