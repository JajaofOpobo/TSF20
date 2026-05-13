package android.support.p002v4.view;

import android.os.Build;
import android.view.ViewGroup;
/* renamed from: android.support.v4.view.o */
/* loaded from: classes.dex */
public final class C0414o {

    /* renamed from: a */
    static final InterfaceC0415a f795a;

    /* renamed from: android.support.v4.view.o$a */
    /* loaded from: classes.dex */
    interface InterfaceC0415a {
        /* renamed from: a */
        int mo12622a(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: b */
        int mo12621b(ViewGroup.MarginLayoutParams marginLayoutParams);
    }

    /* renamed from: android.support.v4.view.o$b */
    /* loaded from: classes.dex */
    static class C0416b implements InterfaceC0415a {
        C0416b() {
        }

        @Override // android.support.p002v4.view.C0414o.InterfaceC0415a
        /* renamed from: a */
        public int mo12622a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.leftMargin;
        }

        @Override // android.support.p002v4.view.C0414o.InterfaceC0415a
        /* renamed from: b */
        public int mo12621b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.rightMargin;
        }
    }

    /* renamed from: android.support.v4.view.o$c */
    /* loaded from: classes.dex */
    static class C0417c implements InterfaceC0415a {
        C0417c() {
        }

        @Override // android.support.p002v4.view.C0414o.InterfaceC0415a
        /* renamed from: a */
        public int mo12622a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C0418p.m12620a(marginLayoutParams);
        }

        @Override // android.support.p002v4.view.C0414o.InterfaceC0415a
        /* renamed from: b */
        public int mo12621b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C0418p.m12619b(marginLayoutParams);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f795a = new C0417c();
        } else {
            f795a = new C0416b();
        }
    }

    /* renamed from: a */
    public static int m12624a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f795a.mo12622a(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m12623b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f795a.mo12621b(marginLayoutParams);
    }
}
