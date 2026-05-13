package android.support.p002v4.p007c;

import android.os.Build;
import java.util.Locale;
/* renamed from: android.support.v4.c.d */
/* loaded from: classes.dex */
public final class C0137d {

    /* renamed from: a */
    public static final Locale f405a;

    /* renamed from: b */
    private static final C0139a f406b;

    /* renamed from: c */
    private static String f407c;

    /* renamed from: d */
    private static String f408d;

    /* renamed from: android.support.v4.c.d$a */
    /* loaded from: classes.dex */
    private static class C0139a {
        private C0139a() {
        }

        /* renamed from: a */
        public int mo13413a(Locale locale) {
            if (locale != null && !locale.equals(C0137d.f405a)) {
                String m13423a = C0130a.m13423a(locale);
                if (m13423a == null) {
                    return m13414b(locale);
                }
                if (m13423a.equalsIgnoreCase(C0137d.f407c) || m13423a.equalsIgnoreCase(C0137d.f408d)) {
                    return 1;
                }
            }
            return 0;
        }

        /* renamed from: b */
        private static int m13414b(Locale locale) {
            switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                case 1:
                case 2:
                    return 1;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: android.support.v4.c.d$b */
    /* loaded from: classes.dex */
    private static class C0140b extends C0139a {
        private C0140b() {
            super();
        }

        @Override // android.support.p002v4.p007c.C0137d.C0139a
        /* renamed from: a */
        public int mo13413a(Locale locale) {
            return C0141e.m13412a(locale);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f406b = new C0140b();
        } else {
            f406b = new C0139a();
        }
        f405a = new Locale("", "");
        f407c = "Arab";
        f408d = "Hebr";
    }

    /* renamed from: a */
    public static int m13416a(Locale locale) {
        return f406b.mo13413a(locale);
    }
}
