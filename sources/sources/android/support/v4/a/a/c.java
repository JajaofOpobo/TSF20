package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, int i) {
        if (drawable instanceof o) {
            ((o) drawable).setTint(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof o) {
            ((o) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        if (drawable instanceof o) {
            ((o) drawable).setTintMode(mode);
        }
    }

    public static Drawable a(Drawable drawable) {
        if (!(drawable instanceof o)) {
            return new j(drawable);
        }
        return drawable;
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet);
    }
}
