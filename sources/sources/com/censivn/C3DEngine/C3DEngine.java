package com.censivn.C3DEngine;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.GLSurfaceView;
import android.util.DisplayMetrics;
import com.censivn.C3DEngine.a.RendererImpl;
import com.censivn.C3DEngine.b.c.TaskDispatcher;
import com.censivn.C3DEngine.b.c.TextureFactory;
import com.tsf.shell.preference.a.a.PreferenceItemB;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class C3DEngine {
    private static Context a;
    private static RendererImpl b;
    private static TextureFactory c;
    private static GLSurfaceView d;
    private static TaskDispatcher e;
    private static String f;
    private static int g;

    public static TaskDispatcher a() {
        return e;
    }

    public static void a(Activity activity) {
        a = activity;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        com.censivn.C3DEngine.b.b.ScreenConstants.e = displayMetrics.density;
        float f2 = com.censivn.C3DEngine.b.b.ScreenConstants.e / 3.0f;
        PreferenceItemB.b = com.censivn.C3DEngine.b.b.ScreenConstants.e - (1.5f * f2);
        PreferenceItemB.a = (f2 * 1.5f) + com.censivn.C3DEngine.b.b.ScreenConstants.e;
        if (PreferenceItemB.b < 0.8f) {
            PreferenceItemB.b = 0.8f;
        }
        float fAj = com.tsf.shell.manager.b.e.aj();
        if (fAj == 0.0f) {
            com.censivn.C3DEngine.b.b.ScreenConstants.d = displayMetrics.density;
        } else {
            com.censivn.C3DEngine.b.b.ScreenConstants.d = fAj;
        }
        if (com.censivn.C3DEngine.b.b.ScreenConstants.d < 0.8f) {
            com.censivn.C3DEngine.b.b.ScreenConstants.d = 0.8f;
        }
        com.censivn.C3DEngine.b.b.ScreenConstants.f = com.censivn.C3DEngine.b.b.ScreenConstants.d / com.censivn.C3DEngine.b.b.ScreenConstants.e;
        com.censivn.C3DEngine.b.b.ScreenConstants.b = com.censivn.C3DEngine.b.b.ScreenConstants.d / 2.0f;
        com.censivn.C3DEngine.b.b.ScreenConstants.c = com.censivn.C3DEngine.b.b.ScreenConstants.d / 3.0f;
        com.censivn.C3DEngine.b.b.ScreenConstants.a = com.censivn.C3DEngine.b.b.ScreenConstants.d / 1.5f;
    }

    public static void a(TaskDispatcher cVar) {
        e = cVar;
    }

    public static void a(Context context, String str) {
        if (a == null) {
            a = context;
            f = context.getPackageName();
            try {
                g = context.getPackageManager().getPackageInfo(f, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String b() {
        return f;
    }

    public static int c() {
        return g;
    }

    public static Context d() {
        return a;
    }

    public static RendererImpl e() {
        return b;
    }

    public static void a(RendererImpl eVar) {
        b = eVar;
    }

    public static GLSurfaceView f() {
        return d;
    }

    public static void a(GLSurfaceView gLSurfaceView) {
        d = gLSurfaceView;
    }

    public static TextureFactory g() {
        return c;
    }

    public static void a(TextureFactory fVar) {
        c = fVar;
    }
}
