package com.tsf.extend.base.view;
/* renamed from: com.tsf.extend.base.view.a */
/* loaded from: classes.dex */
public class C1475a {

    /* renamed from: a */
    private float[] f4600a;

    public C1475a(float[] fArr, int i) {
        this.f4600a = new float[i * 2];
        m8466a(fArr);
    }

    /* renamed from: a */
    public float m8467a(float f) {
        int length = this.f4600a.length / 2;
        int i = (int) ((length * f) + 0.5d);
        if (i < 0) {
            i = 0;
        } else if (i >= length) {
            i = length - 1;
        }
        return this.f4600a[(i * 2) + 1];
    }

    /* renamed from: a */
    private void m8466a(float[] fArr) {
        int length = fArr.length;
        if (length % 2 != 0 || length < 2) {
            throw new IllegalArgumentException("error in BezierCurve::Init");
        }
        int i = length / 2;
        float[] fArr2 = new float[i];
        float[] fArr3 = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            fArr2[i3] = fArr[i2];
            fArr3[i3] = fArr[i2 + 1];
            i2 += 2;
            i3++;
        }
        m8465a(fArr2, fArr2, i);
        m8465a(fArr3, fArr3, i);
        float[] fArr4 = this.f4600a;
        fArr4[0] = fArr2[0];
        fArr4[1] = fArr3[0];
        float[] fArr5 = new float[i];
        int length2 = fArr4.length;
        float f = length2;
        for (int i4 = 2; i4 < length2; i4 += 2) {
            float f2 = i4 / f;
            float f3 = f2 / (1.0f - f2);
            fArr5[0] = (float) Math.pow(1.0f - f2, i - 1);
            for (int i5 = 1; i5 < i; i5++) {
                fArr5[i5] = fArr5[i5 - 1] * f3;
            }
            fArr4[i4] = m8464b(fArr2, fArr5, i);
            fArr4[i4 + 1] = m8464b(fArr3, fArr5, i);
        }
    }

    /* renamed from: a */
    public static void m8465a(float[] fArr, float[] fArr2, int i) {
        int i2 = 1;
        fArr2[0] = fArr[0];
        for (int i3 = 1; i3 < i; i3++) {
            i2 = (i2 * (i - i3)) / i3;
            fArr2[i3] = fArr[i3] * i2;
        }
    }

    /* renamed from: b */
    public static float m8464b(float[] fArr, float[] fArr2, int i) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2] * fArr2[i2];
        }
        return f;
    }
}
