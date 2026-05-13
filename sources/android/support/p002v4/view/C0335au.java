package android.support.p002v4.view;

import android.os.Build;
import android.view.ViewConfiguration;
/* renamed from: android.support.v4.view.au */
/* loaded from: classes.dex */
public final class C0335au {

    /* renamed from: a */
    static final InterfaceC0340e f759a;

    /* renamed from: android.support.v4.view.au$e */
    /* loaded from: classes.dex */
    interface InterfaceC0340e {
        /* renamed from: a */
        int mo12755a(ViewConfiguration viewConfiguration);

        /* renamed from: b */
        boolean mo12754b(ViewConfiguration viewConfiguration);
    }

    /* renamed from: android.support.v4.view.au$a */
    /* loaded from: classes.dex */
    static class C0336a implements InterfaceC0340e {
        C0336a() {
        }

        @Override // android.support.p002v4.view.C0335au.InterfaceC0340e
        /* renamed from: a */
        public int mo12755a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledTouchSlop();
        }

        @Override // android.support.p002v4.view.C0335au.InterfaceC0340e
        /* renamed from: b */
        public boolean mo12754b(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    /* renamed from: android.support.v4.view.au$b */
    /* loaded from: classes.dex */
    static class C0337b extends C0336a {
        C0337b() {
        }

        @Override // android.support.p002v4.view.C0335au.C0336a, android.support.p002v4.view.C0335au.InterfaceC0340e
        /* renamed from: a */
        public int mo12755a(ViewConfiguration viewConfiguration) {
            return C0341av.m12753a(viewConfiguration);
        }
    }

    /* renamed from: android.support.v4.view.au$c */
    /* loaded from: classes.dex */
    static class C0338c extends C0337b {
        C0338c() {
        }

        @Override // android.support.p002v4.view.C0335au.C0336a, android.support.p002v4.view.C0335au.InterfaceC0340e
        /* renamed from: b */
        public boolean mo12754b(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.au$d */
    /* loaded from: classes.dex */
    static class C0339d extends C0338c {
        C0339d() {
        }

        @Override // android.support.p002v4.view.C0335au.C0338c, android.support.p002v4.view.C0335au.C0336a, android.support.p002v4.view.C0335au.InterfaceC0340e
        /* renamed from: b */
        public boolean mo12754b(ViewConfiguration viewConfiguration) {
            return C0342aw.m12752a(viewConfiguration);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f759a = new C0339d();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f759a = new C0338c();
        } else if (Build.VERSION.SDK_INT >= 8) {
            f759a = new C0337b();
        } else {
            f759a = new C0336a();
        }
    }

    /* renamed from: a */
    public static int m12757a(ViewConfiguration viewConfiguration) {
        return f759a.mo12755a(viewConfiguration);
    }

    /* renamed from: b */
    public static boolean m12756b(ViewConfiguration viewConfiguration) {
        return f759a.mo12754b(viewConfiguration);
    }
}
