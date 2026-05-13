package android.support.p002v4.p003a.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: android.support.v4.a.a.a */
/* loaded from: classes.dex */
public final class C0021a {

    /* renamed from: a */
    static final InterfaceC0023b f90a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.a.a.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0023b {
        /* renamed from: a */
        void mo13847a(Drawable drawable);

        /* renamed from: a */
        void mo13843a(Drawable drawable, float f, float f2);

        /* renamed from: a */
        void mo13842a(Drawable drawable, int i);

        /* renamed from: a */
        void mo13841a(Drawable drawable, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo13840a(Drawable drawable, ColorStateList colorStateList);

        /* renamed from: a */
        void mo13839a(Drawable drawable, Resources.Theme theme);

        /* renamed from: a */
        void mo13838a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);

        /* renamed from: a */
        void mo13837a(Drawable drawable, PorterDuff.Mode mode);

        /* renamed from: a */
        void mo13846a(Drawable drawable, boolean z);

        /* renamed from: b */
        void mo13834b(Drawable drawable, int i);

        /* renamed from: b */
        boolean mo13845b(Drawable drawable);

        /* renamed from: c */
        Drawable mo13833c(Drawable drawable);

        /* renamed from: d */
        int mo13832d(Drawable drawable);

        /* renamed from: e */
        int mo13844e(Drawable drawable);

        /* renamed from: f */
        boolean mo13836f(Drawable drawable);

        /* renamed from: g */
        ColorFilter mo13835g(Drawable drawable);
    }

    /* renamed from: android.support.v4.a.a.a$a */
    /* loaded from: classes.dex */
    static class C0022a implements InterfaceC0023b {
        C0022a() {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13847a(Drawable drawable) {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13846a(Drawable drawable, boolean z) {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: b */
        public boolean mo13845b(Drawable drawable) {
            return false;
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13843a(Drawable drawable, float f, float f2) {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13841a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13842a(Drawable drawable, int i) {
            C0031c.m13828a(drawable, i);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13840a(Drawable drawable, ColorStateList colorStateList) {
            C0031c.m13827a(drawable, colorStateList);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13837a(Drawable drawable, PorterDuff.Mode mode) {
            C0031c.m13825a(drawable, mode);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: c */
        public Drawable mo13833c(Drawable drawable) {
            return C0031c.m13829a(drawable);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: b */
        public void mo13834b(Drawable drawable, int i) {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: d */
        public int mo13832d(Drawable drawable) {
            return 0;
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: e */
        public int mo13844e(Drawable drawable) {
            return 0;
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13839a(Drawable drawable, Resources.Theme theme) {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: f */
        public boolean mo13836f(Drawable drawable) {
            return false;
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: g */
        public ColorFilter mo13835g(Drawable drawable) {
            return null;
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13838a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            C0031c.m13826a(drawable, resources, xmlPullParser, attributeSet, theme);
        }
    }

    /* renamed from: android.support.v4.a.a.a$c */
    /* loaded from: classes.dex */
    static class C0024c extends C0022a {
        C0024c() {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: c */
        public Drawable mo13833c(Drawable drawable) {
            return C0032d.m13824a(drawable);
        }
    }

    /* renamed from: android.support.v4.a.a.a$d */
    /* loaded from: classes.dex */
    static class C0025d extends C0024c {
        C0025d() {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13847a(Drawable drawable) {
            C0033e.m13823a(drawable);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0024c, android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: c */
        public Drawable mo13833c(Drawable drawable) {
            return C0033e.m13822b(drawable);
        }
    }

    /* renamed from: android.support.v4.a.a.a$e */
    /* loaded from: classes.dex */
    static class C0026e extends C0025d {
        C0026e() {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: b */
        public void mo13834b(Drawable drawable, int i) {
            C0034f.m13820a(drawable, i);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: d */
        public int mo13832d(Drawable drawable) {
            int m13821a = C0034f.m13821a(drawable);
            if (m13821a >= 0) {
                return m13821a;
            }
            return 0;
        }
    }

    /* renamed from: android.support.v4.a.a.a$f */
    /* loaded from: classes.dex */
    static class C0027f extends C0026e {
        C0027f() {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13846a(Drawable drawable, boolean z) {
            C0035g.m13818a(drawable, z);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: b */
        public boolean mo13845b(Drawable drawable) {
            return C0035g.m13819a(drawable);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0025d, android.support.p002v4.p003a.p004a.C0021a.C0024c, android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: c */
        public Drawable mo13833c(Drawable drawable) {
            return C0035g.m13817b(drawable);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: e */
        public int mo13844e(Drawable drawable) {
            return C0035g.m13816c(drawable);
        }
    }

    /* renamed from: android.support.v4.a.a.a$g */
    /* loaded from: classes.dex */
    static class C0028g extends C0027f {
        C0028g() {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13843a(Drawable drawable, float f, float f2) {
            C0036h.m13814a(drawable, f, f2);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13841a(Drawable drawable, int i, int i2, int i3, int i4) {
            C0036h.m13812a(drawable, i, i2, i3, i4);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13842a(Drawable drawable, int i) {
            C0036h.m13813a(drawable, i);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13840a(Drawable drawable, ColorStateList colorStateList) {
            C0036h.m13811a(drawable, colorStateList);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13837a(Drawable drawable, PorterDuff.Mode mode) {
            C0036h.m13808a(drawable, mode);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0027f, android.support.p002v4.p003a.p004a.C0021a.C0025d, android.support.p002v4.p003a.p004a.C0021a.C0024c, android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: c */
        public Drawable mo13833c(Drawable drawable) {
            return C0036h.m13815a(drawable);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13839a(Drawable drawable, Resources.Theme theme) {
            C0036h.m13810a(drawable, theme);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: f */
        public boolean mo13836f(Drawable drawable) {
            return C0036h.m13807b(drawable);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: g */
        public ColorFilter mo13835g(Drawable drawable) {
            return C0036h.m13806c(drawable);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: a */
        public void mo13838a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            C0036h.m13809a(drawable, resources, xmlPullParser, attributeSet, theme);
        }
    }

    /* renamed from: android.support.v4.a.a.a$h */
    /* loaded from: classes.dex */
    static class C0029h extends C0028g {
        C0029h() {
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0026e, android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: b */
        public void mo13834b(Drawable drawable, int i) {
            C0030b.m13830a(drawable, i);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0026e, android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: d */
        public int mo13832d(Drawable drawable) {
            return C0030b.m13831a(drawable);
        }

        @Override // android.support.p002v4.p003a.p004a.C0021a.C0028g, android.support.p002v4.p003a.p004a.C0021a.C0027f, android.support.p002v4.p003a.p004a.C0021a.C0025d, android.support.p002v4.p003a.p004a.C0021a.C0024c, android.support.p002v4.p003a.p004a.C0021a.C0022a, android.support.p002v4.p003a.p004a.C0021a.InterfaceC0023b
        /* renamed from: c */
        public Drawable mo13833c(Drawable drawable) {
            return drawable;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f90a = new C0029h();
        } else if (i >= 21) {
            f90a = new C0028g();
        } else if (i >= 19) {
            f90a = new C0027f();
        } else if (i >= 17) {
            f90a = new C0026e();
        } else if (i >= 11) {
            f90a = new C0025d();
        } else if (i >= 5) {
            f90a = new C0024c();
        } else {
            f90a = new C0022a();
        }
    }

    /* renamed from: a */
    public static void m13864a(Drawable drawable) {
        f90a.mo13847a(drawable);
    }

    /* renamed from: a */
    public static void m13856a(Drawable drawable, boolean z) {
        f90a.mo13846a(drawable, z);
    }

    /* renamed from: b */
    public static boolean m13855b(Drawable drawable) {
        return f90a.mo13845b(drawable);
    }

    /* renamed from: a */
    public static void m13863a(Drawable drawable, float f, float f2) {
        f90a.mo13843a(drawable, f, f2);
    }

    /* renamed from: a */
    public static void m13861a(Drawable drawable, int i, int i2, int i3, int i4) {
        f90a.mo13841a(drawable, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m13862a(Drawable drawable, int i) {
        f90a.mo13842a(drawable, i);
    }

    /* renamed from: a */
    public static void m13860a(Drawable drawable, ColorStateList colorStateList) {
        f90a.mo13840a(drawable, colorStateList);
    }

    /* renamed from: a */
    public static void m13857a(Drawable drawable, PorterDuff.Mode mode) {
        f90a.mo13837a(drawable, mode);
    }

    /* renamed from: c */
    public static int m13853c(Drawable drawable) {
        return f90a.mo13844e(drawable);
    }

    /* renamed from: a */
    public static void m13859a(Drawable drawable, Resources.Theme theme) {
        f90a.mo13839a(drawable, theme);
    }

    /* renamed from: d */
    public static boolean m13852d(Drawable drawable) {
        return f90a.mo13836f(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m13851e(Drawable drawable) {
        return f90a.mo13835g(drawable);
    }

    /* renamed from: a */
    public static void m13858a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f90a.mo13838a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: f */
    public static Drawable m13850f(Drawable drawable) {
        return f90a.mo13833c(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static <T extends Drawable> T m13849g(Drawable drawable) {
        if (drawable instanceof InterfaceC0037i) {
            return (T) ((InterfaceC0037i) drawable).mo13805a();
        }
        return drawable;
    }

    /* renamed from: b */
    public static void m13854b(Drawable drawable, int i) {
        f90a.mo13834b(drawable, i);
    }

    /* renamed from: h */
    public static int m13848h(Drawable drawable) {
        return f90a.mo13832d(drawable);
    }
}
