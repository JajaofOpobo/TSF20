package android.support.p002v4.p003a.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: android.support.v4.a.a.c */
/* loaded from: classes.dex */
class C0031c {
    /* renamed from: a */
    public static void m13828a(Drawable drawable, int i) {
        if (drawable instanceof InterfaceC0049o) {
            ((InterfaceC0049o) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m13827a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof InterfaceC0049o) {
            ((InterfaceC0049o) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m13825a(Drawable drawable, PorterDuff.Mode mode) {
        if (drawable instanceof InterfaceC0049o) {
            ((InterfaceC0049o) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m13829a(Drawable drawable) {
        if (!(drawable instanceof InterfaceC0049o)) {
            return new C0038j(drawable);
        }
        return drawable;
    }

    /* renamed from: a */
    public static void m13826a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet);
    }
}
