package com.censivn.C3DEngine.g;

/* loaded from: classes.dex */
public final class k implements r {
    @Override // com.censivn.C3DEngine.g.r
    public final float a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f / 1.0f == 1.0f) {
            return 1.0f;
        }
        return (float) ((Math.sin(((((r0 * 1.0f) - 0.075f) * 3.141592653589793d) * 2.0d) / 0.30000001192092896d) * Math.pow(2.0d, (-10.0f) * r0) * 1.0d) + 1.0d + 0.0d);
    }
}
