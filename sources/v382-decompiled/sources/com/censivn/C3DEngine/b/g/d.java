package com.censivn.C3DEngine.b.g;

/* loaded from: classes.dex */
public class d implements v {
    private float a;
    private float b;

    public d() {
        float f;
        float f2;
        f = b.a;
        this.a = f;
        f2 = b.a;
        this.b = f2 * 1.525f;
    }

    @Override // com.censivn.C3DEngine.b.g.v
    public float a(float f) {
        double d;
        float f2 = f * 2.0f;
        if (f2 < 1.0f) {
            d = ((f2 * (this.b + 1.0f)) - this.b) * f2 * 0.5d * f2;
        } else {
            float f3 = f2 - 2.0f;
            d = ((((f3 * (this.b + 1.0f)) + this.b) * f3 * f3) + 2.0f) * 0.5d;
        }
        return (float) d;
    }
}
