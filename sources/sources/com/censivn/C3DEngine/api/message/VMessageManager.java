package com.censivn.C3DEngine.api.message;

import com.censivn.C3DEngine.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VMessageManager {
    public static void postRenderRunnable(RenderRunnable renderRunnable) {
        a.a().a(renderRunnable);
    }

    public static void postUIThreadRunnable(Runnable runnable) {
        a.a().a(runnable);
    }

    public static void postUIThreadRunnable(Runnable runnable, long j) {
        a.a().a(runnable, j);
    }

    public static void postGLThreadRunnable(Runnable runnable) {
        a.a().c(runnable);
    }

    public static void postGLThreadRunnable(Runnable runnable, long j) {
        a.a().b(runnable, j);
    }

    public void postExternalThreadRunnable(Runnable runnable) {
        a.a().d(runnable);
    }

    public void postExternalThreadRunnable(Runnable runnable, long j) {
        a.a().c(runnable, j);
    }

    public static void cancelRenderRunnable(RenderRunnable renderRunnable) {
        a.a().b(renderRunnable);
    }

    public static void cancelUIRunnable(Runnable runnable) {
        a.a().f(runnable);
    }

    public static void cancelGLRunnable(Runnable runnable) {
        a.a().g(runnable);
    }

    public void cancelExternalThreadRunnable(Runnable runnable) {
        a.a().h(runnable);
    }
}
