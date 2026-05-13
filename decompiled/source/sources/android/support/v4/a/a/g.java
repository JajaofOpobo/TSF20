package android.support.v4.a.a;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
class g {
    public static void a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Drawable b(Drawable drawable) {
        if (!(drawable instanceof o)) {
            return new m(drawable);
        }
        return drawable;
    }

    public static int c(Drawable drawable) {
        return drawable.getAlpha();
    }
}
