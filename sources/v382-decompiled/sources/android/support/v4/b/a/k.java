package android.support.v4.b.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class k {
    public static void a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Drawable b(Drawable drawable) {
        if (!(drawable instanceof p)) {
            return new p(drawable);
        }
        return drawable;
    }
}
