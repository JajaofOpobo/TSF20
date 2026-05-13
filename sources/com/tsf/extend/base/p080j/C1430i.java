package com.tsf.extend.base.p080j;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.tsf.extend.C1547h;
/* renamed from: com.tsf.extend.base.j.i */
/* loaded from: classes.dex */
public class C1430i {

    /* renamed from: a */
    public static Float f4417a;

    /* renamed from: b */
    public static Float f4418b;

    /* renamed from: c */
    private static DisplayMetrics f4419c = C1547h.m8290b().getResources().getDisplayMetrics();

    /* renamed from: a */
    public static float m8660a() {
        return f4419c.density;
    }

    /* renamed from: b */
    public static float m8657b() {
        if (f4417a == null) {
            f4417a = Float.valueOf((m8655d() * 2.0f) / (m8660a() * 720.0f));
        }
        return f4417a.floatValue();
    }

    /* renamed from: c */
    public static float m8656c() {
        if (f4418b == null) {
            f4418b = Float.valueOf((m8654e() * 2.0f) / (m8660a() * 1280.0f));
        }
        return f4418b.floatValue();
    }

    /* renamed from: d */
    public static int m8655d() {
        return C1547h.m8290b().getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: e */
    public static int m8654e() {
        return C1547h.m8290b().getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: a */
    private static float m8658a(int i, float f, DisplayMetrics displayMetrics) {
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
                return TypedValue.applyDimension(1, m8656c() * f, displayMetrics);
            case 9:
                return m8656c() * f;
            case 10:
                return TypedValue.applyDimension(1, m8657b() * f, displayMetrics);
        }
    }

    /* renamed from: a */
    public static int m8659a(float f) {
        return (int) m8658a(1, f, f4419c);
    }
}
