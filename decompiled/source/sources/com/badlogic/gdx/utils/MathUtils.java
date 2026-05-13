package com.badlogic.gdx.utils;

import java.util.Random;
/* loaded from: classes.dex */
public class MathUtils {
    public static final float DEG_TO_RAD = 0.017453292f;
    public static final float PI = 3.1415927f;
    public static final float RAD_TO_DEG = 57.295776f;
    public static float _2PI = 6.2831855f;
    public static float _HALF_PI = 1.5707964f;
    public static Random RANDOM = new Random(System.nanoTime());

    public static float atan2(float f, float f2) {
        return radToDeg((float) Math.atan2(f, f2));
    }

    public static final float radToDeg(float f) {
        return 57.295776f * f;
    }

    public static final float degToRad(float f) {
        return 0.017453292f * f;
    }

    public static final int randomSign() {
        return RANDOM.nextBoolean() ? 1 : -1;
    }

    public static final float random(float f, float f2) {
        return (RANDOM.nextFloat() * (f2 - f)) + f;
    }

    public static final int random(int i, int i2) {
        return RANDOM.nextInt((i2 - i) + 1) + i;
    }

    public static final boolean isPowerOfTwo(int i) {
        return i != 0 && ((i + (-1)) & i) == 0;
    }

    public static final int nextPowerOfTwo(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        for (int i3 = 1; i3 < 32; i3 <<= 1) {
            i2 |= i2 >> i3;
        }
        return i2 + 1;
    }

    public static final int sum(int[] iArr) {
        int i = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            i += iArr[length];
        }
        return i;
    }

    public static final void arraySumInternal(int[] iArr) {
        int length = iArr.length;
        for (int i = 1; i < length; i++) {
            iArr[i] = iArr[i - 1] + iArr[i];
        }
    }

    public static final void arraySumInternal(long[] jArr) {
        int length = jArr.length;
        for (int i = 1; i < length; i++) {
            jArr[i] = jArr[i - 1] + jArr[i];
        }
    }

    public static final void arraySumInternal(long[] jArr, long j) {
        jArr[0] = jArr[0] * j;
        int length = jArr.length;
        for (int i = 1; i < length; i++) {
            jArr[i] = jArr[i - 1] + (jArr[i] * j);
        }
    }

    public static final void arraySumInto(long[] jArr, long[] jArr2, long j) {
        jArr2[0] = jArr[0] * j;
        int length = jArr.length;
        for (int i = 1; i < length; i++) {
            jArr2[i] = jArr2[i - 1] + (jArr[i] * j);
        }
    }

    public static final float arraySum(float[] fArr) {
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    public static final float arrayAverage(float[] fArr) {
        return arraySum(fArr) / fArr.length;
    }

    public static float[] rotateAroundCenter(float[] fArr, float f, float f2, float f3) {
        if (f != 0.0f) {
            float degToRad = degToRad(f);
            float sin = (float) Math.sin(degToRad);
            float cos = (float) Math.cos(degToRad);
            for (int length = fArr.length - 2; length >= 0; length -= 2) {
                float f4 = fArr[length];
                float f5 = fArr[length + 1];
                fArr[length] = (((f4 - f2) * cos) - ((f5 - f3) * sin)) + f2;
                fArr[length + 1] = ((f4 - f2) * sin) + ((f5 - f3) * cos) + f3;
            }
        }
        return fArr;
    }

    public static float[] scaleAroundCenter(float[] fArr, float f, float f2, float f3, float f4) {
        if (f != 1.0f || f2 != 1.0f) {
            for (int length = fArr.length - 2; length >= 0; length -= 2) {
                fArr[length] = ((fArr[length] - f3) * f) + f3;
                fArr[length + 1] = ((fArr[length + 1] - f4) * f2) + f4;
            }
        }
        return fArr;
    }

    public static float[] rotateAndScaleAroundCenter(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        rotateAroundCenter(fArr, f, f2, f3);
        return scaleAroundCenter(fArr, f4, f5, f6, f7);
    }

    public static float[] revertScaleAroundCenter(float[] fArr, float f, float f2, float f3, float f4) {
        return scaleAroundCenter(fArr, 1.0f / f, 1.0f / f2, f3, f4);
    }

    public static float[] revertRotateAroundCenter(float[] fArr, float f, float f2, float f3) {
        return rotateAroundCenter(fArr, -f, f2, f3);
    }

    public static float[] revertRotateAndScaleAroundCenter(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        revertScaleAroundCenter(fArr, f4, f5, f6, f7);
        return revertRotateAroundCenter(fArr, f, f2, f3);
    }

    public static int bringToBounds(int i, int i2, int i3) {
        return Math.max(i, Math.min(i2, i3));
    }

    public static float bringToBounds(float f, float f2, float f3) {
        return Math.max(f, Math.min(f2, f3));
    }

    public static float distance(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }
}
