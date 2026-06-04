package com.censivn.C3DEngine.g;

/* loaded from: classes.dex */
public final class d implements r {
    private float a;

    public d() {
        float f;
        f = b.a;
        this.a = f;
    }

    @Override // com.censivn.C3DEngine.g.r
    public final float a(float f) {
        float f2 = (float) (f / 0.5d);
        if (f2 < 1.0f) {
            float f3 = f2 * f2;
            this.a = (float) (this.a * 1.525d);
            return (float) ((((f2 * (r2 + 1.0f)) - this.a) * f3 * 0.5d) + 0.0d);
        }
        float f4 = f2 - 2.0f;
        float f5 = f4 * f4;
        float f6 = (float) (this.a * 1.525d);
        this.a = f6;
        return (((((f4 * (f6 + 1.0f)) + this.a) * f5) + 2.0f) * 0.5f) + 0.0f;
    }
}
