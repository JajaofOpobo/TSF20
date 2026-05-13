package com.censivn.C3DEngine.api.element;
/* loaded from: classes.dex */
public class Uv {
    public float u;
    public float v;

    public Uv() {
        this.u = 0.0f;
        this.v = 0.0f;
    }

    public Uv(float f, float f2) {
        this.u = f;
        this.v = f2;
    }

    /* renamed from: clone */
    public Uv m6clone() {
        return new Uv(this.u, this.v);
    }
}
