package android.support.v4.a.a;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class e {
    public static void a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static Drawable b(Drawable drawable) {
        if (!(drawable instanceof o)) {
            return new l(drawable);
        }
        return drawable;
    }
}
