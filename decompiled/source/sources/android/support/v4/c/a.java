package android.support.v4.c;

import android.os.Build;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a {
    private static final InterfaceC0004a a;

    /* renamed from: android.support.v4.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    interface InterfaceC0004a {
        String a(Locale locale);
    }

    /* loaded from: classes.dex */
    static class b implements InterfaceC0004a {
        b() {
        }

        @Override // android.support.v4.c.a.InterfaceC0004a
        public String a(Locale locale) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class c implements InterfaceC0004a {
        c() {
        }

        @Override // android.support.v4.c.a.InterfaceC0004a
        public String a(Locale locale) {
            return android.support.v4.c.c.a(locale);
        }
    }

    /* loaded from: classes.dex */
    static class d implements InterfaceC0004a {
        d() {
        }

        @Override // android.support.v4.c.a.InterfaceC0004a
        public String a(Locale locale) {
            return android.support.v4.c.b.a(locale);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a = new d();
        } else if (i >= 14) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static String a(Locale locale) {
        return a.a(locale);
    }
}
