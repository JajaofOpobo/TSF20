package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.C0853a;
/* loaded from: classes.dex */
public class VRenderer {
    public static void pause() {
        C0853a.m10855e().m10762h();
    }

    public static void resume() {
        C0853a.m10855e().m10761i();
    }

    public static void lockView(float f, float f2) {
        C0853a.m10855e().m10770b(f, f2);
    }

    public static void unlockView() {
        C0853a.m10855e().m10764f();
    }
}
