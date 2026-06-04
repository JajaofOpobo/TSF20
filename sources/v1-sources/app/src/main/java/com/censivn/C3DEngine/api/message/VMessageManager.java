package com.censivn.C3DEngine.api.message;

import com.censivn.C3DEngine.b.w;

/* loaded from: classes.dex */
public class VMessageManager {
    public static void postRenderRunnable(RenderRunnable renderRunnable) {
        com.censivn.C3DEngine.a.a().a(renderRunnable);
    }

    public static void postUIThreadRunnable(Runnable runnable) {
        com.censivn.C3DEngine.a.a();
        w.a(runnable);
    }

    public static void postUIThreadRunnable(Runnable runnable, long j) {
        com.censivn.C3DEngine.a.a();
        w.a(runnable, j);
    }

    public static void postGLThreadRunnable(Runnable runnable) {
        com.censivn.C3DEngine.a.a().c(runnable);
    }

    public static void postGLThreadRunnable(Runnable runnable, long j) {
        com.censivn.C3DEngine.a.a().b(runnable, j);
    }

    public void postExternalThreadRunnable(Runnable runnable) {
        com.censivn.C3DEngine.a.a().d(runnable);
    }

    public void postExternalThreadRunnable(Runnable runnable, long j) {
        com.censivn.C3DEngine.a.a().c(runnable, j);
    }

    public static void cancelRenderRunnable(RenderRunnable renderRunnable) {
        com.censivn.C3DEngine.a.a().b(renderRunnable);
    }

    public static void cancelUIRunnable(Runnable runnable) {
        com.censivn.C3DEngine.a.a();
        w.e(runnable);
    }

    public static void cancelGLRunnable(Runnable runnable) {
        com.censivn.C3DEngine.a.a().f(runnable);
    }

    public void cancelExternalThreadRunnable(Runnable runnable) {
        com.censivn.C3DEngine.a.a().g(runnable);
    }
}
