package com.tsf.extend.base.j;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i {
    public static Float a;
    public static Float b;
    private static DisplayMetrics c = com.tsf.extend.h.b().getResources().getDisplayMetrics();

    public static float a() {
        return c.density;
    }

    public static float b() {
        if (a == null) {
            a = Float.valueOf((d() * 2.0f) / (a() * 720.0f));
        }
        return a.floatValue();
    }

    public static float c() {
        if (b == null) {
            b = Float.valueOf((e() * 2.0f) / (a() * 1280.0f));
        }
        return b.floatValue();
    }

    public static int d() {
        return com.tsf.extend.h.b().getResources().getDisplayMetrics().widthPixels;
    }

    public static int e() {
        return com.tsf.extend.h.b().getResources().getDisplayMetrics().heightPixels;
    }

    private static float a(int i, float f, DisplayMetrics displayMetrics) {
        switch (i) {
            case 1:
            case 2:
                return TypedValue.applyDimension(i, f, displayMetrics);
            case 3:
            case 4:
            case 5:
            default:
                return 0.0f;
            case 6:
                return f / displayMetrics.density;
            case 7:
                return f / displayMetrics.scaledDensity;
            case 8:
                return TypedValue.applyDimension(1, c() * f, displayMetrics);
            case 9:
                return c() * f;
            case 10:
                return TypedValue.applyDimension(1, b() * f, displayMetrics);
        }
    }

    public static int a(float f) {
        return (int) a(1, f, c);
    }
}
