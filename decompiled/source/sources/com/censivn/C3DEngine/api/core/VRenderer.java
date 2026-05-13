package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.a;
/* loaded from: classes.dex */
public class VRenderer {
    public static void pause() {
        a.e().h();
    }

    public static void resume() {
        a.e().i();
    }

    public static void lockView(float f, float f2) {
        a.e().b(f, f2);
    }

    public static void unlockView() {
        a.e().f();
    }
}
