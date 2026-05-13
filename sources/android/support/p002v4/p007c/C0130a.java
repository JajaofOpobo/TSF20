package android.support.p002v4.p007c;

import android.os.Build;
import java.util.Locale;
/* renamed from: android.support.v4.c.a */
/* loaded from: classes.dex */
public final class C0130a {

    /* renamed from: a */
    private static final InterfaceC0131a f401a;

    /* renamed from: android.support.v4.c.a$a */
    /* loaded from: classes.dex */
    interface InterfaceC0131a {
        /* renamed from: a */
        String mo13422a(Locale locale);
    }

    /* renamed from: android.support.v4.c.a$b */
    /* loaded from: classes.dex */
    static class C0132b implements InterfaceC0131a {
        C0132b() {
        }

        @Override // android.support.p002v4.p007c.C0130a.InterfaceC0131a
        /* renamed from: a */
        public String mo13422a(Locale locale) {
            return null;
        }
    }

    /* renamed from: android.support.v4.c.a$c */
    /* loaded from: classes.dex */
    static class C0133c implements InterfaceC0131a {
        C0133c() {
        }

        @Override // android.support.p002v4.p007c.C0130a.InterfaceC0131a
        /* renamed from: a */
        public String mo13422a(Locale locale) {
            return C0136c.m13419a(locale);
        }
    }

    /* renamed from: android.support.v4.c.a$d */
    /* loaded from: classes.dex */
    static class C0134d implements InterfaceC0131a {
        C0134d() {
        }

        @Override // android.support.p002v4.p007c.C0130a.InterfaceC0131a
        /* renamed from: a */
        public String mo13422a(Locale locale) {
            return C0135b.m13421a(locale);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f401a = new C0134d();
        } else if (i >= 14) {
            f401a = new C0133c();
        } else {
            f401a = new C0132b();
        }
    }

    /* renamed from: a */
    public static String m13423a(Locale locale) {
        return f401a.mo13422a(locale);
    }
}
