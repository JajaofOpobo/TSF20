package com.censivn.C3DEngine.p031b.p033b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p030a.C0869e;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.utils.C4182r;
import java.lang.reflect.Method;
/* renamed from: com.censivn.C3DEngine.b.b.a */
/* loaded from: classes.dex */
public class C0892a {

    /* renamed from: A */
    public static int f2550A;

    /* renamed from: B */
    public static int f2551B;

    /* renamed from: C */
    public static int f2552C;

    /* renamed from: D */
    public static int f2553D;

    /* renamed from: E */
    public static int f2554E;

    /* renamed from: F */
    public static int f2555F;

    /* renamed from: G */
    public static int f2556G;

    /* renamed from: H */
    public static int f2557H;

    /* renamed from: I */
    public static int f2558I;

    /* renamed from: J */
    public static int f2559J;

    /* renamed from: K */
    public static int f2560K;

    /* renamed from: L */
    public static int f2561L;

    /* renamed from: M */
    public static int f2562M;

    /* renamed from: N */
    public static int f2563N;

    /* renamed from: d */
    public static float f2568d;

    /* renamed from: e */
    public static float f2569e;

    /* renamed from: f */
    public static float f2570f;

    /* renamed from: o */
    public static int f2579o;

    /* renamed from: p */
    public static int f2580p;

    /* renamed from: q */
    public static int f2581q;

    /* renamed from: r */
    public static int f2582r;

    /* renamed from: s */
    public static int f2583s;

    /* renamed from: t */
    public static int f2584t;

    /* renamed from: u */
    public static int f2585u;

    /* renamed from: v */
    public static int f2586v;

    /* renamed from: w */
    public static int f2587w;

    /* renamed from: x */
    public static int f2588x;

    /* renamed from: y */
    public static int f2589y;

    /* renamed from: z */
    public static int f2590z;

    /* renamed from: a */
    public static float f2565a = 1.0f;

    /* renamed from: b */
    public static float f2566b = 1.0f;

    /* renamed from: c */
    public static float f2567c = 1.0f;

    /* renamed from: g */
    public static int f2571g = VEasing.Back.easeIn;

    /* renamed from: h */
    public static int f2572h = 40;

    /* renamed from: i */
    public static int f2573i = 80;

    /* renamed from: j */
    public static int f2574j = 100;

    /* renamed from: k */
    public static int f2575k = 0;

    /* renamed from: l */
    public static int f2576l = 0;

    /* renamed from: m */
    public static int f2577m = 0;

    /* renamed from: n */
    public static int f2578n = 0;

    /* renamed from: O */
    public static boolean f2564O = true;

    /* renamed from: a */
    public static void m10743a() {
        C3489a.m2215a();
        C3566b.m1974a();
        C3567c.m1969a();
        f2571g = (int) (f2571g * f2567c);
        f2572h = (int) (f2572h * f2567c);
        f2577m = 0;
        f2575k = (int) (f2575k * f2567c);
        f2576l = (int) (f2576l * f2567c);
    }

    /* renamed from: a */
    public static float m10742a(float f) {
        return f2567c * f;
    }

    /* renamed from: b */
    public static int m10735b(float f) {
        int i = (int) (f2567c * f);
        if (i % 2 != 0) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: a */
    public static C0981k m10741a(float f, float f2) {
        return new C0981k(f2567c * f, f2567c * f2, false);
    }

    /* renamed from: a */
    public static void m10740a(int i) {
        f2559J = i;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m10738a(Activity activity) {
        if (C3359a.f11088b.m10560b()) {
            if (activity.getResources().getConfiguration().screenHeightDp < activity.getResources().getConfiguration().screenWidthDp) {
                f2560K = 0;
                return;
            } else {
                f2560K = (f2562M - f2559J) - C4182r.m631a(activity, activity.getResources().getConfiguration().screenHeightDp);
                return;
            }
        }
        f2560K = 0;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m10737a(Activity activity, boolean z) {
        int i = f2560K;
        if (C3359a.f11088b.m10560b() || Build.VERSION.SDK_INT >= 21) {
            if (activity.getResources().getConfiguration().screenHeightDp < activity.getResources().getConfiguration().screenWidthDp) {
                f2560K = (f2561L - f2559J) - C4182r.m631a(activity, activity.getResources().getConfiguration().screenHeightDp);
            } else {
                f2560K = (f2562M - f2559J) - C4182r.m631a(activity, activity.getResources().getConfiguration().screenHeightDp);
            }
            if (f2560K < 5) {
                f2560K = 0;
            }
        } else {
            f2560K = 0;
        }
        if (z && C3359a.f11088b.m10560b() && i != f2560K) {
            m10736b();
        }
    }

    /* renamed from: a */
    public static void m10739a(int i, int i2) {
        f2555F = i;
        f2557H = f2555F / 2;
        f2556G = i2;
        f2558I = f2556G / 2;
        f2564O = f2556G > f2555F;
        m10733c();
    }

    /* renamed from: b */
    public static void m10736b() {
        if (C0869e.m10758l()) {
            m10733c();
            C3359a.f11088b.m10570a(f2551B, f2552C, f2590z, f2550A);
            return;
        }
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.b.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                C0892a.m10736b();
            }
        });
    }

    /* renamed from: c */
    public static void m10733c() {
        f2579o = (int) (f2572h * 2.0f);
        f2590z = (-f2555F) / 2;
        f2550A = -f2590z;
        f2552C = ((-f2556G) / 2) + f2560K;
        if (!C3359a.f11088b.m10553c()) {
            f2551B = (f2556G / 2) - f2559J;
            f2554E = (f2556G - f2559J) - f2560K;
        } else {
            f2551B = f2556G / 2;
            f2554E = f2556G - f2560K;
        }
        f2553D = f2555F;
        f2580p = (f2553D - f2575k) - f2576l;
        f2581q = (f2554E - f2579o) - f2577m;
        f2582r = f2590z + f2575k;
        f2583s = f2551B - f2577m;
        f2584t = f2550A - f2576l;
        f2585u = f2552C + f2579o;
        f2586v = f2582r + f2557H;
        f2588x = f2584t + f2557H;
        f2587w = f2558I - f2583s;
        f2589y = f2558I - f2585u;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0088 -> B:28:0x0024). Please submit an issue!!! */
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m10734b(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                defaultDisplay.getRealMetrics(displayMetrics);
                if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
                    f2561L = displayMetrics.widthPixels;
                    f2562M = displayMetrics.heightPixels;
                } else {
                    f2561L = displayMetrics.heightPixels;
                    f2562M = displayMetrics.widthPixels;
                }
            } else {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                try {
                    int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    int intValue2 = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                    if (intValue < intValue2) {
                        f2561L = intValue;
                        f2562M = intValue2;
                    } else {
                        f2561L = intValue2;
                        f2562M = intValue;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
        }
        if (f2561L == 0 || f2562M == 0) {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            f2562M = displayMetrics2.heightPixels;
            f2561L = displayMetrics2.widthPixels;
        }
    }
}
