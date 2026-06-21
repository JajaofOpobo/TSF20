package com.censivn.C3DEngine;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.GLSurfaceView;
import android.util.DisplayMetrics;
import com.censivn.C3DEngine.a.i;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.c.m;
import com.tsf.shell.manager.b.g;
import com.tsf.shell.preference.a.a.b;

/* loaded from: classes.dex */
public class a {
    private static Context a;
    private static i b;
    private static m c;
    private static GLSurfaceView d;
    private static e e;
    private static String f;
    private static int g;

    public static e a() {
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
        float ah = g.ah();
        if (ah == 0.0f) {
            com.censivn.C3DEngine.b.b.a.d = displayMetrics.density;
        } else {
            com.censivn.C3DEngine.b.b.a.d = ah;
        }
        if (com.censivn.C3DEngine.b.b.a.d < 0.8f) {
            com.censivn.C3DEngine.b.b.a.d = 0.8f;
        }
        com.censivn.C3DEngine.b.b.a.f = com.censivn.C3DEngine.b.b.a.d / com.censivn.C3DEngine.b.b.a.e;
        com.censivn.C3DEngine.b.b.a.b = com.censivn.C3DEngine.b.b.a.d / 2.0f;
        com.censivn.C3DEngine.b.b.a.c = com.censivn.C3DEngine.b.b.a.d / 3.0f;
        com.censivn.C3DEngine.b.b.a.a = com.censivn.C3DEngine.b.b.a.d / 1.5f;
    }

    public static void a(e eVar) {
        e = eVar;
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

    public static i e() {
        return b;
    }

    public static void a(i iVar) {
        b = iVar;
    }

    public static GLSurfaceView f() {
        return d;
    }

    public static void a(GLSurfaceView gLSurfaceView) {
        d = gLSurfaceView;
    }

    public static m g() {
        return c;
    }

    public static void a(m mVar) {
        c = mVar;
    }
}
