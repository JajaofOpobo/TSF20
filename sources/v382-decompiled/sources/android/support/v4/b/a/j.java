package android.support.v4.b.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class j {
    public static void a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static Drawable b(Drawable drawable) {
        if (!(drawable instanceof o)) {
            return new o(drawable);
        }
        return drawable;
    }
}
