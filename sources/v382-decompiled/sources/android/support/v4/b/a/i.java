package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, int i) {
        if (drawable instanceof m) {
            ((m) drawable).setTint(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof m) {
            ((m) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        if (drawable instanceof m) {
            ((m) drawable).setTintMode(mode);
        }
    }

    public static Drawable a(Drawable drawable) {
        if (!(drawable instanceof n)) {
            return new n(drawable);
        }
        return drawable;
    }
}
