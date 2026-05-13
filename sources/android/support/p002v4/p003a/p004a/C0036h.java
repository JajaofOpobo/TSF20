package android.support.p002v4.p003a.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: android.support.v4.a.a.h */
/* loaded from: classes.dex */
class C0036h {
    /* renamed from: a */
    public static void m13814a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* renamed from: a */
    public static void m13812a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m13813a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: a */
    public static void m13811a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: a */
    public static void m13808a(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* renamed from: a */
    public static Drawable m13815a(Drawable drawable) {
        if (!(drawable instanceof InterfaceC0049o)) {
            return new C0047n(drawable);
        }
        return drawable;
    }

    /* renamed from: a */
    public static void m13810a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* renamed from: b */
    public static boolean m13807b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* renamed from: c */
    public static ColorFilter m13806c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* renamed from: a */
    public static void m13809a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
