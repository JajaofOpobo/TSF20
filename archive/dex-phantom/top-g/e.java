package com.censivn.C3DEngine.g;

/* loaded from: classes.dex */
public final class e implements r {
    private float a;

    public e() {
        float f;
        f = b.a;
        this.a = f;
    }

    @Override // com.censivn.C3DEngine.g.r
    public final float a(float f) {
        float f2 = (f / 1.0f) - 1.0f;
        return (((((f2 * (this.a + 1.0f)) + this.a) * f2 * f2) + 1.0f) * 1.0f) + 0.0f;
    }
}
