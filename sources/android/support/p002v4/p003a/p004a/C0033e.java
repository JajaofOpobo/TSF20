package android.support.p002v4.p003a.p004a;

import android.graphics.drawable.Drawable;
/* renamed from: android.support.v4.a.a.e */
/* loaded from: classes.dex */
class C0033e {
    /* renamed from: a */
    public static void m13823a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: b */
    public static Drawable m13822b(Drawable drawable) {
        if (!(drawable instanceof InterfaceC0049o)) {
            return new C0043l(drawable);
        }
        return drawable;
    }
}
