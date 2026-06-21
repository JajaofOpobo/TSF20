package com.censivn.C3DEngine.b.g;

/* loaded from: classes.dex */
public class c implements v {
    private float a;

    public c() {
        float f;
        f = b.a;
        this.a = f;
    }

    @Override // com.censivn.C3DEngine.b.g.v
    public float a(float f) {
        return f * f * (((this.a + 1.0f) * f) - this.a);
    }
}
