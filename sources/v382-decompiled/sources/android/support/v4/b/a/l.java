package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
class l {
    public static void a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void a(Drawable drawable, int i) {
        if (drawable instanceof q) {
            i.a(drawable, i);
        } else {
            drawable.setTint(i);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof q) {
            i.a(drawable, colorStateList);
        } else {
            drawable.setTintList(colorStateList);
        }
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        if (drawable instanceof GradientDrawable) {
            i.a(drawable, mode);
        } else {
            drawable.setTintMode(mode);
        }
    }

    public static Drawable a(Drawable drawable) {
        if (drawable instanceof GradientDrawable) {
            return new q(drawable);
        }
        return drawable;
    }
}
