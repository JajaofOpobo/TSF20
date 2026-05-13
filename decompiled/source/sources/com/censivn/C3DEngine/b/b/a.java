package com.censivn.C3DEngine.b.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import com.censivn.C3DEngine.a.e;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.utils.r;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class a {
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    public static int M;
    public static int N;
    public static float d;
    public static float e;
    public static float f;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    public static float a = 1.0f;
    public static float b = 1.0f;
    public static float c = 1.0f;
    public static int g = VEasing.Back.easeIn;
    public static int h = 40;
    public static int i = 80;
    public static int j = 100;
    public static int k = 0;
    public static int l = 0;
    public static int m = 0;
    public static int n = 0;
    public static boolean O = true;

    public static void a() {
        com.tsf.shell.manager.g.a.a();
        com.tsf.shell.manager.o.b.a();
        com.tsf.shell.manager.o.c.a();
        g = (int) (g * c);
        h = (int) (h * c);
        m = 0;
        k = (int) (k * c);
        l = (int) (l * c);
    }

    public static float a(float f2) {
        return c * f2;
    }

    public static int b(float f2) {
        int i2 = (int) (c * f2);
        if (i2 % 2 != 0) {
            return i2 + 1;
        }
        return i2;
    }

    public static k a(float f2, float f3) {
        return new k(c * f2, c * f3, false);
    }

    public static void a(int i2) {
        J = i2;
    }

    @SuppressLint({"NewApi"})
    public static void a(Activity activity) {
        if (com.tsf.shell.manager.a.b.b()) {
            if (activity.getResources().getConfiguration().screenHeightDp < activity.getResources().getConfiguration().screenWidthDp) {
                K = 0;
                return;
            } else {
                K = (M - J) - r.a(activity, activity.getResources().getConfiguration().screenHeightDp);
                return;
            }
        }
        K = 0;
    }

    @SuppressLint({"NewApi"})
    public static void a(Activity activity, boolean z2) {
        int i2 = K;
        if (com.tsf.shell.manager.a.b.b() || Build.VERSION.SDK_INT >= 21) {
            if (activity.getResources().getConfiguration().screenHeightDp < activity.getResources().getConfiguration().screenWidthDp) {
                K = (L - J) - r.a(activity, activity.getResources().getConfiguration().screenHeightDp);
            } else {
                K = (M - J) - r.a(activity, activity.getResources().getConfiguration().screenHeightDp);
            }
            if (K < 5) {
                K = 0;
            }
        } else {
            K = 0;
        }
        if (z2 && com.tsf.shell.manager.a.b.b() && i2 != K) {
            b();
        }
    }

    public static void a(int i2, int i3) {
        F = i2;
        H = F / 2;
        G = i3;
        I = G / 2;
        O = G > F;
        c();
    }

    public static void b() {
        if (e.l()) {
            c();
            com.tsf.shell.manager.a.b.a(B, C, z, A);
            return;
        }
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.b();
            }
        });
    }

    public static void c() {
        o = (int) (h * 2.0f);
        z = (-F) / 2;
        A = -z;
        C = ((-G) / 2) + K;
        if (!com.tsf.shell.manager.a.b.c()) {
            B = (G / 2) - J;
            E = (G - J) - K;
        } else {
            B = G / 2;
            E = G - K;
        }
        D = F;
        p = (D - k) - l;
        q = (E - o) - m;
        r = z + k;
        s = B - m;
        t = A - l;
        u = C + o;
        v = r + H;
        x = t + H;
        w = I - s;
        y = I - u;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0088 -> B:28:0x0024). Please submit an issue!!! */
    @SuppressLint({"NewApi"})
    public static void b(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                defaultDisplay.getRealMetrics(displayMetrics);
                if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
                    L = displayMetrics.widthPixels;
                    M = displayMetrics.heightPixels;
                } else {
                    L = displayMetrics.heightPixels;
                    M = displayMetrics.widthPixels;
                }
            } else {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                try {
                    int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    int intValue2 = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                    if (intValue < intValue2) {
                        L = intValue;
                        M = intValue2;
                    } else {
                        L = intValue2;
                        M = intValue;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e3) {
        }
        if (L == 0 || M == 0) {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            M = displayMetrics2.heightPixels;
            L = displayMetrics2.widthPixels;
        }
    }
}
