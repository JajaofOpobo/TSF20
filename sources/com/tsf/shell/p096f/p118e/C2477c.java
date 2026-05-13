package com.tsf.shell.p096f.p118e;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
/* renamed from: com.tsf.shell.f.e.c */
/* loaded from: classes.dex */
public class C2477c {

    /* renamed from: a */
    public static final float f8158a = C0892a.m10742a(300.0f);

    /* renamed from: a */
    public static float m5473a(float f, float f2, float f3) {
        return m5472a(f, f2, f3, f8158a);
    }

    /* renamed from: a */
    public static float m5472a(float f, float f2, float f3, float f4) {
        if (f4 != 0.0f) {
            if (f > f2) {
                float f5 = (f - f2) / C0892a.f2553D;
                return (float) ((Math.sin(((f5 <= 1.0f ? f5 : 1.0f) * 3.141592653589793d) / 2.0d) * f4) + f2);
            } else if (f < f3) {
                float f6 = (f3 - f) / C0892a.f2553D;
                return (float) (f3 - (Math.sin(((f6 <= 1.0f ? f6 : 1.0f) * 3.141592653589793d) / 2.0d) * f4));
            } else {
                return f;
            }
        }
        return f;
    }

    /* renamed from: a */
    public static float m5475a(float f) {
        if (0.32f != 0.0f) {
            if (f > 0.0f) {
                float f2 = (f - 0.0f) / 1.0f;
                return (float) ((Math.sin(((f2 <= 1.0f ? f2 : 1.0f) * 3.141592653589793d) / 2.0d) * 0.32f) + 0.0d);
            } else if (f < 0.0f) {
                float f3 = (0.0f - f) / 1.0f;
                return (float) (0.0d - (Math.sin(((f3 <= 1.0f ? f3 : 1.0f) * 3.141592653589793d) / 2.0d) * 0.32f));
            } else {
                return f;
            }
        }
        return f;
    }

    /* renamed from: a */
    public static float m5474a(float f, float f2) {
        return (f2 / 5.0f) + f;
    }

    /* renamed from: b */
    public static float m5471b(float f, float f2) {
        return f - (f2 / 3.0f);
    }
}
