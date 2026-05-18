package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class a {
    static final b a;

    interface b {
        void a(Drawable drawable);

        void a(Drawable drawable, float f, float f2);

        void a(Drawable drawable, int i);

        void a(Drawable drawable, int i, int i2, int i3, int i4);

        void a(Drawable drawable, ColorStateList colorStateList);

        void a(Drawable drawable, Resources.Theme theme);

        void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);

        void a(Drawable drawable, PorterDuff.Mode mode);

        void a(Drawable drawable, boolean z);

        void b(Drawable drawable, int i);

        boolean b(Drawable drawable);

        Drawable c(Drawable drawable);

        int d(Drawable drawable);

        int e(Drawable drawable);

        boolean f(Drawable drawable);

        ColorFilter g(Drawable drawable);
    }

    /* JADX INFO: renamed from: android.support.v4.a.a.a$a, reason: collision with other inner class name */
    static class C0002a implements b {
        C0002a() {
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable) {
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable, boolean z) {
        }

        @Override // android.support.v4.a.a.a.b
        public boolean b(Drawable drawable) {
            return false;
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable, float f, float f2) {
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable, int i) {
            android.support.v4.a.a.c.a(drawable, i);
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable, ColorStateList colorStateList) {
            android.support.v4.a.a.c.a(drawable, colorStateList);
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable, PorterDuff.Mode mode) {
            android.support.v4.a.a.c.a(drawable, mode);
        }

        @Override // android.support.v4.a.a.a.b
        public Drawable c(Drawable drawable) {
            return android.support.v4.a.a.c.a(drawable);
        }

        @Override // android.support.v4.a.a.a.b
        public void b(Drawable drawable, int i) {
        }

        @Override // android.support.v4.a.a.a.b
        public int d(Drawable drawable) {
            return 0;
        }

        @Override // android.support.v4.a.a.a.b
        public int e(Drawable drawable) {
            return 0;
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable, Resources.Theme theme) {
        }

        @Override // android.support.v4.a.a.a.b
        public boolean f(Drawable drawable) {
            return false;
        }

        @Override // android.support.v4.a.a.a.b
        public ColorFilter g(Drawable drawable) {
            return null;
        }

        @Override // android.support.v4.a.a.a.b
        public void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            android.support.v4.a.a.c.a(drawable, resources, xmlPullParser, attributeSet, theme);
        }
    }

    static class c extends C0002a {
        c() {
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public Drawable c(Drawable drawable) {
            return android.support.v4.a.a.d.a(drawable);
        }
    }

    static class d extends c {
        d() {
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable) {
            android.support.v4.a.a.e.a(drawable);
        }

        @Override // android.support.v4.a.a.a.c, android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public Drawable c(Drawable drawable) {
            return android.support.v4.a.a.e.b(drawable);
        }
    }

    static class e extends d {
        e() {
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void b(Drawable drawable, int i) {
            android.support.v4.a.a.f.a(drawable, i);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public int d(Drawable drawable) {
            int iA = android.support.v4.a.a.f.a(drawable);
            if (iA >= 0) {
                return iA;
            }
            return 0;
        }
    }

    static class f extends e {
        f() {
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable, boolean z) {
            android.support.v4.a.a.g.a(drawable, z);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public boolean b(Drawable drawable) {
            return android.support.v4.a.a.g.a(drawable);
        }

        @Override // android.support.v4.a.a.a.d, android.support.v4.a.a.a.c, android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public Drawable c(Drawable drawable) {
            return android.support.v4.a.a.g.b(drawable);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public int e(Drawable drawable) {
            return android.support.v4.a.a.g.c(drawable);
        }
    }

    static class g extends f {
        g() {
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable, float f, float f2) {
            android.support.v4.a.a.h.a(drawable, f, f2);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable, int i, int i2, int i3, int i4) {
            android.support.v4.a.a.h.a(drawable, i, i2, i3, i4);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable, int i) {
            android.support.v4.a.a.h.a(drawable, i);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable, ColorStateList colorStateList) {
            android.support.v4.a.a.h.a(drawable, colorStateList);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable, PorterDuff.Mode mode) {
            android.support.v4.a.a.h.a(drawable, mode);
        }

        @Override // android.support.v4.a.a.a.f, android.support.v4.a.a.a.d, android.support.v4.a.a.a.c, android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public Drawable c(Drawable drawable) {
            return android.support.v4.a.a.h.a(drawable);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable, Resources.Theme theme) {
            android.support.v4.a.a.h.a(drawable, theme);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public boolean f(Drawable drawable) {
            return android.support.v4.a.a.h.b(drawable);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public ColorFilter g(Drawable drawable) {
            return android.support.v4.a.a.h.c(drawable);
        }

        @Override // android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            android.support.v4.a.a.h.a(drawable, resources, xmlPullParser, attributeSet, theme);
        }
    }

    static class h extends g {
        h() {
        }

        @Override // android.support.v4.a.a.a.e, android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public void b(Drawable drawable, int i) {
            android.support.v4.a.a.b.a(drawable, i);
        }

        @Override // android.support.v4.a.a.a.e, android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public int d(Drawable drawable) {
            return android.support.v4.a.a.b.a(drawable);
        }

        @Override // android.support.v4.a.a.a.g, android.support.v4.a.a.a.f, android.support.v4.a.a.a.d, android.support.v4.a.a.a.c, android.support.v4.a.a.a.C0002a, android.support.v4.a.a.a.b
        public Drawable c(Drawable drawable) {
            return drawable;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            a = new h();
            return;
        }
        if (i >= 21) {
            a = new g();
            return;
        }
        if (i >= 19) {
            a = new f();
            return;
        }
        if (i >= 17) {
            a = new e();
            return;
        }
        if (i >= 11) {
            a = new d();
        } else if (i >= 5) {
            a = new c();
        } else {
            a = new C0002a();
        }
    }

    public static void a(Drawable drawable) {
        a.a(drawable);
    }

    public static void a(Drawable drawable, boolean z) {
        a.a(drawable, z);
    }

    public static boolean b(Drawable drawable) {
        return a.b(drawable);
    }

    public static void a(Drawable drawable, float f2, float f3) {
        a.a(drawable, f2, f3);
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        a.a(drawable, i, i2, i3, i4);
    }

    public static void a(Drawable drawable, int i) {
        a.a(drawable, i);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        a.a(drawable, colorStateList);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        a.a(drawable, mode);
    }

    public static int c(Drawable drawable) {
        return a.e(drawable);
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        a.a(drawable, theme);
    }

    public static boolean d(Drawable drawable) {
        return a.f(drawable);
    }

    public static ColorFilter e(Drawable drawable) {
        return a.g(drawable);
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        a.a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static Drawable f(Drawable drawable) {
        return a.c(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T g(Drawable drawable) {
        if (drawable instanceof i) {
            return (T) ((i) drawable).a();
        }
        return drawable;
    }

    public static void b(Drawable drawable, int i) {
        a.b(drawable, i);
    }

    public static int h(Drawable drawable) {
        return a.d(drawable);
    }
}
