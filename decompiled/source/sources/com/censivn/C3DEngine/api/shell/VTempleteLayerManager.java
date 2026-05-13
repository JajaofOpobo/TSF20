package com.censivn.C3DEngine.api.shell;

import android.view.View;
import android.view.ViewGroup;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.tsf.shell.manager.a;
/* loaded from: classes.dex */
public class VTempleteLayerManager {
    public static void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a.j.a(view, layoutParams);
    }

    public static void removeView(View view) {
        a.j.a(view);
    }

    public static VObject3dContainer show(VTempleteSceneCallbacks vTempleteSceneCallbacks) {
        return (VObject3dContainer) a.j.a((com.tsf.shell.f.b.a) vTempleteSceneCallbacks.vTarget).getVirtualObject();
    }

    public static void showScreen() {
        a.j.d();
    }

    public static void showScreen(Runnable runnable) {
        a.j.b(runnable);
    }

    public static void hideScreen() {
        a.j.c();
    }

    public static void hideScreen(Runnable runnable) {
        a.j.a(runnable);
    }

    public static void remove() {
        a.j.b();
    }
}
