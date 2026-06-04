package com.censivn.C3DEngine.api.core;

/* loaded from: classes.dex */
public class VRenderer {
    public static void pause() {
        com.censivn.C3DEngine.a.d().e();
    }

    public static void resume() {
        com.censivn.C3DEngine.a.d().f();
    }

    public static void lockView(float f, float f2) {
        com.censivn.C3DEngine.a.d().a(f, f2);
    }

    public static void unlockView() {
        com.censivn.C3DEngine.a.d().b();
    }
}
