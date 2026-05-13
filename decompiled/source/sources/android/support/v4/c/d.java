package android.support.v4.c;

import android.os.Build;
import java.util.Locale;
/* loaded from: classes.dex */
public final class d {
    public static final Locale a;
    private static final a b;
    private static String c;
    private static String d;

    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        public int a(Locale locale) {
            if (locale != null && !locale.equals(d.a)) {
                String a = android.support.v4.c.a.a(locale);
                if (a == null) {
                    return b(locale);
                }
                if (a.equalsIgnoreCase(d.c) || a.equalsIgnoreCase(d.d)) {
                    return 1;
                }
            }
            return 0;
        }

        private static int b(Locale locale) {
            switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                case 1:
                case 2:
                    return 1;
                default:
                    return 0;
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        private b() {
            super();
        }

        @Override // android.support.v4.c.d.a
        public int a(Locale locale) {
            return e.a(locale);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            b = new b();
        } else {
            b = new a();
        }
        a = new Locale("", "");
        c = "Arab";
        d = "Hebr";
    }

    public static int a(Locale locale) {
        return b.a(locale);
    }
}
