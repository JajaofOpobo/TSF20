package com.censivn.C3DEngine.b.g;

/* loaded from: classes.dex */
public class k implements v {
    @Override // com.censivn.C3DEngine.b.g.v
    public float a(float f) {
        float f2;
        float f3 = 0.0f;
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f / 1.0f == 1.0f) {
            return 1.0f;
        }
        float f4 = 0.0f == 0.0f ? 0.3f : 0.0f;
        if (0.0f == 0.0f || 0.0f < 1.0f) {
            f2 = f4 / 4.0f;
            f3 = 1.0f;
        } else {
            f2 = (f4 / 3.1415927f) * 2.0f * ((float) Math.asin(1.0f / 0.0f));
        }
        return (float) ((Math.sin((((r4 - f2) * 3.141592653589793d) * 2.0d) / f4) * f3 * Math.pow(2.0d, (-10.0f) * r4)) + 1.0d);
    }
}
