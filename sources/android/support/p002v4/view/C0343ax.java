package android.support.p002v4.view;

import android.os.Build;
import android.view.ViewGroup;
/* renamed from: android.support.v4.view.ax */
/* loaded from: classes.dex */
public final class C0343ax {

    /* renamed from: a */
    static final InterfaceC0346c f760a;

    /* renamed from: android.support.v4.view.ax$c */
    /* loaded from: classes.dex */
    interface InterfaceC0346c {
        /* renamed from: a */
        void mo12750a(ViewGroup viewGroup, boolean z);
    }

    /* renamed from: android.support.v4.view.ax$f */
    /* loaded from: classes.dex */
    static class C0349f implements InterfaceC0346c {
        C0349f() {
        }

        @Override // android.support.p002v4.view.C0343ax.InterfaceC0346c
        /* renamed from: a */
        public void mo12750a(ViewGroup viewGroup, boolean z) {
        }
    }

    /* renamed from: android.support.v4.view.ax$a */
    /* loaded from: classes.dex */
    static class C0344a extends C0349f {
        C0344a() {
        }

        @Override // android.support.p002v4.view.C0343ax.C0349f, android.support.p002v4.view.C0343ax.InterfaceC0346c
        /* renamed from: a */
        public void mo12750a(ViewGroup viewGroup, boolean z) {
            C0350ay.m12749a(viewGroup, z);
        }
    }

    /* renamed from: android.support.v4.view.ax$b */
    /* loaded from: classes.dex */
    static class C0345b extends C0344a {
        C0345b() {
        }
    }

    /* renamed from: android.support.v4.view.ax$d */
    /* loaded from: classes.dex */
    static class C0347d extends C0345b {
        C0347d() {
        }
    }

    /* renamed from: android.support.v4.view.ax$e */
    /* loaded from: classes.dex */
    static class C0348e extends C0347d {
        C0348e() {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f760a = new C0348e();
        } else if (i >= 18) {
            f760a = new C0347d();
        } else if (i >= 14) {
            f760a = new C0345b();
        } else if (i >= 11) {
            f760a = new C0344a();
        } else {
            f760a = new C0349f();
        }
    }

    /* renamed from: a */
    public static void m12751a(ViewGroup viewGroup, boolean z) {
        f760a.mo12750a(viewGroup, z);
    }
}
