package com.censivn.C3DEngine;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.GLSurfaceView;
import android.util.DisplayMetrics;
import com.censivn.C3DEngine.p030a.C0869e;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0919c;
import com.censivn.C3DEngine.p031b.p035c.C0936f;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.preference.p196a.p197a.C4024b;
/* renamed from: com.censivn.C3DEngine.a */
/* loaded from: classes.dex */
public class C0853a {

    /* renamed from: a */
    private static Context f2408a;

    /* renamed from: b */
    private static C0869e f2409b;

    /* renamed from: c */
    private static C0936f f2410c;

    /* renamed from: d */
    private static GLSurfaceView f2411d;

    /* renamed from: e */
    private static C0919c f2412e;

    /* renamed from: f */
    private static String f2413f;

    /* renamed from: g */
    private static int f2414g;

    /* renamed from: a */
    public static C0919c m10865a() {
        return f2412e;
    }

    /* renamed from: a */
    public static void m10864a(Activity activity) {
        f2408a = activity;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C0892a.f2569e = displayMetrics.density;
        float f = C0892a.f2569e / 3.0f;
        C4024b.f13181b = C0892a.f2569e - (1.5f * f);
        C4024b.f13180a = (f * 1.5f) + C0892a.f2569e;
        if (C4024b.f13181b < 0.8f) {
            C4024b.f13181b = 0.8f;
        }
        float m2515aj = C3430e.m2515aj();
        if (m2515aj == 0.0f) {
            C0892a.f2568d = displayMetrics.density;
        } else {
            C0892a.f2568d = m2515aj;
        }
        if (C0892a.f2568d < 0.8f) {
            C0892a.f2568d = 0.8f;
        }
        C0892a.f2570f = C0892a.f2568d / C0892a.f2569e;
        C0892a.f2566b = C0892a.f2568d / 2.0f;
        C0892a.f2567c = C0892a.f2568d / 3.0f;
        C0892a.f2565a = C0892a.f2568d / 1.5f;
    }

    /* renamed from: a */
    public static void m10860a(C0919c c0919c) {
        f2412e = c0919c;
    }

    /* renamed from: a */
    public static void m10863a(Context context, String str) {
        if (f2408a == null) {
            f2408a = context;
            f2413f = context.getPackageName();
            try {
                f2414g = context.getPackageManager().getPackageInfo(f2413f, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static String m10858b() {
        return f2413f;
    }

    /* renamed from: c */
    public static int m10857c() {
        return f2414g;
    }

    /* renamed from: d */
    public static Context m10856d() {
        return f2408a;
    }

    /* renamed from: e */
    public static C0869e m10855e() {
        return f2409b;
    }

    /* renamed from: a */
    public static void m10861a(C0869e c0869e) {
        f2409b = c0869e;
    }

    /* renamed from: f */
    public static GLSurfaceView m10854f() {
        return f2411d;
    }

    /* renamed from: a */
    public static void m10862a(GLSurfaceView gLSurfaceView) {
        f2411d = gLSurfaceView;
    }

    /* renamed from: g */
    public static C0936f m10853g() {
        return f2410c;
    }

    /* renamed from: a */
    public static void m10859a(C0936f c0936f) {
        f2410c = c0936f;
    }
}
