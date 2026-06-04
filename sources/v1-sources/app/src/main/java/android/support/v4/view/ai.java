package android.support.v4.view;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class ai {
    static final ap a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            a = new ao();
            return;
        }
        if (i >= 16) {
            a = new an();
            return;
        }
        if (i >= 14) {
            a = new am();
            return;
        }
        if (i >= 11) {
            a = new al();
        } else if (i >= 9) {
            a = new ak();
        } else {
            a = new aj();
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

    public static void d(View view) {
        a.d(view);
    }

    public static void b(View view, int i) {
        a.b(view, i);
    }
}
