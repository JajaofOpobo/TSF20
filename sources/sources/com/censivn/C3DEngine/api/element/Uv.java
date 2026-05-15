package com.censivn.C3DEngine.api.element;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Uv m6clone() {
        return new Uv(this.u, this.v);
    }
}
