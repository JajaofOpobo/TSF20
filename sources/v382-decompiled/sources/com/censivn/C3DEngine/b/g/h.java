package com.censivn.C3DEngine.b.g;

/* loaded from: classes.dex */
public class h implements v {
    @Override // com.censivn.C3DEngine.b.g.v
    public float a(float f) {
        double sqrt;
        float f2 = f * 2.0f;
        if (f2 < 1.0f) {
            sqrt = (Math.sqrt(1.0f - (f2 * f2)) - 1.0d) * (-0.5d);
        } else {
            float f3 = f2 - 2.0f;
            sqrt = (Math.sqrt(1.0f - (f3 * f3)) + 1.0d) * 0.5d;
        }
        return (float) sqrt;
    }
}
