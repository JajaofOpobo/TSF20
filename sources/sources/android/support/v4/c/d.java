package android.support.v4.c;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class d {
    public static final Locale a;
    private static final a b;
    private static String c;
    private static String d;

    private static class a {
        private a() {
        }

        public int a(Locale locale) {
            if (locale != null && !locale.equals(d.a)) {
                String strA = android.support.v4.c.a.a(locale);
                if (strA == null) {
                    return b(locale);
                }
                if (strA.equalsIgnoreCase(d.c) || strA.equalsIgnoreCase(d.d)) {
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
