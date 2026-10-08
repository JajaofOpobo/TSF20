package com.censivn.C3DEngine.g;

/* loaded from: classes.dex */
public final class h implements r {
    @Override // com.censivn.C3DEngine.g.r
    public final float a(float f) {
        float f2 = (float) (f / 0.5d);
        if (f2 < 1.0f) {
            return (float) (((-0.5d) * (Math.sqrt(1.0f - (f2 * f2)) - 1.0d)) + 0.0d);
        }
        float f3 = f2 - 2.0f;
        return (float) (((Math.sqrt(1.0f - (f3 * f3)) + 1.0d) * 0.5d) + 0.0d);
    }
}
