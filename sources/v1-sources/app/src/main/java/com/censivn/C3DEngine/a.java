package com.censivn.C3DEngine;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.DisplayMetrics;
import com.censivn.C3DEngine.b.ad;
import com.censivn.C3DEngine.b.w;
import com.censivn.C3DEngine.b.z;
import com.tsf.shell.a.t;
import com.tsf.shell.bd;

/* loaded from: classes.dex */
public final class a {
    public static float c;
    public static float d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    private static Context r;
    private static z s;
    private static ad t;
    private static GLSurfaceView u;
    private static w v;
    public static float a = 1.0f;
    public static float b = 1.0f;
    public static boolean q = true;

    public static w a() {
        return v;
    }

    public static void a(Activity activity) {
        r = activity;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        d = displayMetrics.density;
        float J = t.J();
        if (J != 0.0f) {
            c = J;
        } else if (displayMetrics.density == 2.0f) {
            c = 1.8f;
        } else if (displayMetrics.density == 3.0f) {
            c = 2.7f;
        } else {
            c = displayMetrics.density;
        }
        if (c < 0.8f) {
            c = 0.8f;
        }
        b = c / 1.8f;
        a = c / 1.5f;
    }

    public static void a(w wVar) {
        v = wVar;
    }

    public static void a(int i2) {
        p = i2;
    }

    public static void a(int i2, int i3) {
        l = i2;
        n = i2 / 2;
        m = i3;
        o = i3 / 2;
        q = m > l;
        b();
    }

    public static void b() {
        int i2 = (-l) / 2;
        e = i2;
        f = -i2;
        h = (-m) / 2;
        if (bd.a()) {
            g = (-h) - p;
            k = m - p;
            i = p;
        } else {
            g = -h;
            k = m;
            i = 0;
        }
        j = l;
    }

    public static void a(Context context) {
        r = context;
    }

    public static Context c() {
        return r;
    }

    public static z d() {
        return s;
    }

    public static void a(z zVar) {
        s = zVar;
    }

    public static GLSurfaceView e() {
        return u;
    }

    public static void a(GLSurfaceView gLSurfaceView) {
        u = gLSurfaceView;
    }

    public static ad f() {
        return t;
    }

    public static void a(ad adVar) {
        t = adVar;
    }
}
