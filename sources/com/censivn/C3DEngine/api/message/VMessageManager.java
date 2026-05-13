package com.censivn.C3DEngine.api.message;

import com.censivn.C3DEngine.C0853a;
/* loaded from: classes.dex */
public class VMessageManager {
    public static void postRenderRunnable(RenderRunnable renderRunnable) {
        C0853a.m10865a().m10590a(renderRunnable);
    }

    public static void postUIThreadRunnable(Runnable runnable) {
        C0853a.m10865a().m10588a(runnable);
    }

    public static void postUIThreadRunnable(Runnable runnable, long j) {
        C0853a.m10865a().m10587a(runnable, j);
    }

    public static void postGLThreadRunnable(Runnable runnable) {
        C0853a.m10865a().m10583c(runnable);
    }

    public static void postGLThreadRunnable(Runnable runnable, long j) {
        C0853a.m10865a().m10584b(runnable, j);
    }

    public void postExternalThreadRunnable(Runnable runnable) {
        C0853a.m10865a().m10581d(runnable);
    }

    public void postExternalThreadRunnable(Runnable runnable, long j) {
        C0853a.m10865a().m10582c(runnable, j);
    }

    public static void cancelRenderRunnable(RenderRunnable renderRunnable) {
        C0853a.m10865a().m10586b(renderRunnable);
    }

    public static void cancelUIRunnable(Runnable runnable) {
        C0853a.m10865a().m10579f(runnable);
    }

    public static void cancelGLRunnable(Runnable runnable) {
        C0853a.m10865a().m10578g(runnable);
    }

    public void cancelExternalThreadRunnable(Runnable runnable) {
        C0853a.m10865a().m10577h(runnable);
    }
}
