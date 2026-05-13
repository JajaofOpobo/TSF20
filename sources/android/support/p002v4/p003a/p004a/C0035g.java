package android.support.p002v4.p003a.p004a;

import android.graphics.drawable.Drawable;
/* renamed from: android.support.v4.a.a.g */
/* loaded from: classes.dex */
class C0035g {
    /* renamed from: a */
    public static void m13818a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* renamed from: a */
    public static boolean m13819a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* renamed from: b */
    public static Drawable m13817b(Drawable drawable) {
        if (!(drawable instanceof InterfaceC0049o)) {
            return new C0045m(drawable);
        }
        return drawable;
    }

    /* renamed from: c */
    public static int m13816c(Drawable drawable) {
        return drawable.getAlpha();
    }
}
