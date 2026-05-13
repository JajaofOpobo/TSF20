package com.censivn.C3DEngine.api.shell;

import android.view.View;
import android.view.ViewGroup;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p100b.C2284a;
/* loaded from: classes.dex */
public class VTempleteLayerManager {
    public static void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C3359a.f11096j.m2234a(view, layoutParams);
    }

    public static void removeView(View view) {
        C3359a.f11096j.m2235a(view);
    }

    public static VObject3dContainer show(VTempleteSceneCallbacks vTempleteSceneCallbacks) {
        return (VObject3dContainer) C3359a.f11096j.m2229a((C2284a) vTempleteSceneCallbacks.vTarget).getVirtualObject();
    }

    public static void showScreen() {
        C3359a.f11096j.m2218d();
    }

    public static void showScreen(Runnable runnable) {
        C3359a.f11096j.m2221b(runnable);
    }

    public static void hideScreen() {
        C3359a.f11096j.m2220c();
    }

    public static void hideScreen(Runnable runnable) {
        C3359a.f11096j.m2227a(runnable);
    }

    public static void remove() {
        C3359a.f11096j.m2224b();
    }
}
