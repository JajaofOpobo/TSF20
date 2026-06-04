package com.censivn.C3DEngine.api.shell;

import android.view.View;
import android.view.ViewGroup;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public class VTempleteLayerManager {
    public static void addView(View view, ViewGroup.LayoutParams layoutParams) {
        bf.m().a(view, layoutParams);
    }

    public static void removeView(View view) {
        bf.m().a(view);
    }

    public static VObject3dContainer show(VTempleteSceneCallbacks vTempleteSceneCallbacks) {
        return (VObject3dContainer) bf.m().a((com.tsf.shell.workspace3D.d.a) vTempleteSceneCallbacks.vTarget).r();
    }

    public static void showScreen() {
        bf.m().a((Runnable) null, true);
    }

    public static void showScreen(Runnable runnable) {
        bf.m().a(runnable);
    }

    public static void hideScreen() {
        bf.m();
        bf.n().a((Runnable) null);
    }

    public static void hideScreen(Runnable runnable) {
        bf.m();
        bf.n().a(runnable);
    }

    public static void remove() {
        bf.m().a();
    }
}
