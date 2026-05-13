package android.support.p002v4.view;

import android.os.Build;
/* renamed from: android.support.v4.view.e */
/* loaded from: classes.dex */
public final class C0391e {

    /* renamed from: a */
    static final InterfaceC0392a f789a;

    /* renamed from: android.support.v4.view.e$a */
    /* loaded from: classes.dex */
    interface InterfaceC0392a {
        /* renamed from: a */
        int mo12647a(int i, int i2);
    }

    /* renamed from: android.support.v4.view.e$b */
    /* loaded from: classes.dex */
    static class C0393b implements InterfaceC0392a {
        C0393b() {
        }

        @Override // android.support.p002v4.view.C0391e.InterfaceC0392a
        /* renamed from: a */
        public int mo12647a(int i, int i2) {
            return (-8388609) & i;
        }
    }

    /* renamed from: android.support.v4.view.e$c */
    /* loaded from: classes.dex */
    static class C0394c implements InterfaceC0392a {
        C0394c() {
        }

        @Override // android.support.p002v4.view.C0391e.InterfaceC0392a
        /* renamed from: a */
        public int mo12647a(int i, int i2) {
            return C0395f.m12646a(i, i2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f789a = new C0394c();
        } else {
            f789a = new C0393b();
        }
    }

    /* renamed from: a */
    public static int m12648a(int i, int i2) {
        return f789a.mo12647a(i, i2);
    }
}
