package android.support.p002v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
/* renamed from: android.support.v4.widget.s */
/* loaded from: classes.dex */
public final class C0517s {

    /* renamed from: a */
    static final InterfaceC0523f f1102a;

    /* renamed from: android.support.v4.widget.s$f */
    /* loaded from: classes.dex */
    interface InterfaceC0523f {
        /* renamed from: a */
        void mo12172a(PopupWindow popupWindow, int i);

        /* renamed from: a */
        void mo12171a(PopupWindow popupWindow, View view, int i, int i2, int i3);

        /* renamed from: a */
        void mo12170a(PopupWindow popupWindow, boolean z);
    }

    /* renamed from: android.support.v4.widget.s$c */
    /* loaded from: classes.dex */
    static class C0520c implements InterfaceC0523f {
        C0520c() {
        }

        @Override // android.support.p002v4.widget.C0517s.InterfaceC0523f
        /* renamed from: a */
        public void mo12171a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2);
        }

        @Override // android.support.p002v4.widget.C0517s.InterfaceC0523f
        /* renamed from: a */
        public void mo12170a(PopupWindow popupWindow, boolean z) {
        }

        @Override // android.support.p002v4.widget.C0517s.InterfaceC0523f
        /* renamed from: a */
        public void mo12172a(PopupWindow popupWindow, int i) {
        }
    }

    /* renamed from: android.support.v4.widget.s$d */
    /* loaded from: classes.dex */
    static class C0521d extends C0520c {
        C0521d() {
        }

        @Override // android.support.p002v4.widget.C0517s.C0520c, android.support.p002v4.widget.C0517s.InterfaceC0523f
        /* renamed from: a */
        public void mo12172a(PopupWindow popupWindow, int i) {
            C0526v.m12166a(popupWindow, i);
        }
    }

    /* renamed from: android.support.v4.widget.s$e */
    /* loaded from: classes.dex */
    static class C0522e extends C0521d {
        C0522e() {
        }

        @Override // android.support.p002v4.widget.C0517s.C0520c, android.support.p002v4.widget.C0517s.InterfaceC0523f
        /* renamed from: a */
        public void mo12171a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            C0527w.m12165a(popupWindow, view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.s$a */
    /* loaded from: classes.dex */
    static class C0518a extends C0522e {
        C0518a() {
        }

        @Override // android.support.p002v4.widget.C0517s.C0520c, android.support.p002v4.widget.C0517s.InterfaceC0523f
        /* renamed from: a */
        public void mo12170a(PopupWindow popupWindow, boolean z) {
            C0524t.m12169a(popupWindow, z);
        }
    }

    /* renamed from: android.support.v4.widget.s$b */
    /* loaded from: classes.dex */
    static class C0519b extends C0518a {
        C0519b() {
        }

        @Override // android.support.p002v4.widget.C0517s.C0518a, android.support.p002v4.widget.C0517s.C0520c, android.support.p002v4.widget.C0517s.InterfaceC0523f
        /* renamed from: a */
        public void mo12170a(PopupWindow popupWindow, boolean z) {
            C0525u.m12167a(popupWindow, z);
        }

        @Override // android.support.p002v4.widget.C0517s.C0521d, android.support.p002v4.widget.C0517s.C0520c, android.support.p002v4.widget.C0517s.InterfaceC0523f
        /* renamed from: a */
        public void mo12172a(PopupWindow popupWindow, int i) {
            C0525u.m12168a(popupWindow, i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f1102a = new C0519b();
        } else if (i >= 21) {
            f1102a = new C0518a();
        } else if (i >= 19) {
            f1102a = new C0522e();
        } else if (i >= 9) {
            f1102a = new C0521d();
        } else {
            f1102a = new C0520c();
        }
    }

    /* renamed from: a */
    public static void m12174a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f1102a.mo12171a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m12173a(PopupWindow popupWindow, boolean z) {
        f1102a.mo12170a(popupWindow, z);
    }

    /* renamed from: a */
    public static void m12175a(PopupWindow popupWindow, int i) {
        f1102a.mo12172a(popupWindow, i);
    }
}
