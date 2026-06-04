package com.censivn.C3DEngine.b.a;

/* loaded from: classes.dex */
public final class a {
    public float a;
    public float b;

    public final void a(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(a aVar, a aVar2) {
        return (aVar.a * aVar2.b) - (aVar.b * aVar2.a);
    }
}
