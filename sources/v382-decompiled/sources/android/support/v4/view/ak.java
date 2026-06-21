package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class ak {
    static final au a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a = new at();
            return;
        }
        if (i >= 19) {
            a = new as();
            return;
        }
        if (i >= 17) {
            a = new ar();
            return;
        }
        if (i >= 16) {
            a = new aq();
            return;
        }
        if (i >= 14) {
            a = new ap();
            return;
        }
        if (i >= 11) {
            a = new ao();
            return;
        }
        if (i >= 9) {
            a = new an();
        } else if (i >= 7) {
            a = new am();
        } else {
            a = new al();
        }
    }

    public static boolean a(View view, int i) {
        return a.a(view, i);
    }

    public static int a(View view) {
        return a.a(view);
    }

    public static void a(View view, a aVar) {
        a.a(view, aVar);
    }

    public static void b(View view) {
        a.b(view);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static int c(View view) {
        return a.c(view);
    }

    public static void b(View view, int i) {
        a.b(view, i);
    }

    public static void a(View view, int i, Paint paint) {
        a.a(view, i, paint);
    }

    public static int d(View view) {
        return a.d(view);
    }

    public static int e(View view) {
        return a.e(view);
    }

    public static void a(View view, boolean z) {
        a.a(view, z);
    }

    public static boolean f(View view) {
        return a.f(view);
    }
}
