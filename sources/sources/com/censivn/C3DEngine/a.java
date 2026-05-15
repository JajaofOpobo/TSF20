package com.censivn.C3DEngine;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.GLSurfaceView;
import android.util.DisplayMetrics;
import com.censivn.C3DEngine.a.e;
import com.censivn.C3DEngine.b.c.c;
import com.censivn.C3DEngine.b.c.f;
import com.tsf.shell.preference.a.a.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static Context a;
    private static e b;
    private static f c;
    private static GLSurfaceView d;
    private static c e;
    private static String f;
    private static int g;

    public static c a() {
        return e;
    }

    public static void a(Activity activity) {
        a = activity;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        com.censivn.C3DEngine.b.b.a.e = displayMetrics.density;
        float f2 = com.censivn.C3DEngine.b.b.a.e / 3.0f;
        b.b = com.censivn.C3DEngine.b.b.a.e - (1.5f * f2);
        b.a = (f2 * 1.5f) + com.censivn.C3DEngine.b.b.a.e;
        if (b.b < 0.8f) {
            b.b = 0.8f;
        }
        float fAj = com.tsf.shell.manager.b.e.aj();
        if (fAj == 0.0f) {
            com.censivn.C3DEngine.b.b.a.d = displayMetrics.density;
        } else {
            com.censivn.C3DEngine.b.b.a.d = fAj;
        }
        if (com.censivn.C3DEngine.b.b.a.d < 0.8f) {
            com.censivn.C3DEngine.b.b.a.d = 0.8f;
        }
        com.censivn.C3DEngine.b.b.a.f = com.censivn.C3DEngine.b.b.a.d / com.censivn.C3DEngine.b.b.a.e;
        com.censivn.C3DEngine.b.b.a.b = com.censivn.C3DEngine.b.b.a.d / 2.0f;
        com.censivn.C3DEngine.b.b.a.c = com.censivn.C3DEngine.b.b.a.d / 3.0f;
        com.censivn.C3DEngine.b.b.a.a = com.censivn.C3DEngine.b.b.a.d / 1.5f;
    }

    public static void a(c cVar) {
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

    public static e e() {
        return b;
    }

    public static void a(e eVar) {
        b = eVar;
    }

    public static GLSurfaceView f() {
        return d;
    }

    public static void a(GLSurfaceView gLSurfaceView) {
        d = gLSurfaceView;
    }

    public static f g() {
        return c;
    }

    public static void a(f fVar) {
        c = fVar;
    }
}
