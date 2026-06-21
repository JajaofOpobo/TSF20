package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public class a {
    static final c a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            a = new g();
            return;
        }
        if (i >= 21) {
            a = new f();
            return;
        }
        if (i >= 19) {
            a = new e();
        } else if (i >= 11) {
            a = new d();
        } else {
            a = new b();
        }
    }

    public static void a(Drawable drawable) {
        a.a(drawable);
    }

    public static void a(Drawable drawable, boolean z) {
        a.a(drawable, z);
    }

    public static boolean b(Drawable drawable) {
        return a.b(drawable);
    }

    public static void a(Drawable drawable, float f, float f2) {
        a.a(drawable, f, f2);
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        a.a(drawable, i, i2, i3, i4);
    }

    public static void a(Drawable drawable, int i) {
        a.a(drawable, i);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        a.a(drawable, colorStateList);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        a.a(drawable, mode);
    }

    public static Drawable c(Drawable drawable) {
        return a.c(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable d(Drawable drawable) {
        if (drawable instanceof m) {
            return ((m) drawable).a();
        }
        return drawable;
    }
}
