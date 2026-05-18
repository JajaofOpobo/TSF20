package android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class s {
    static final f a;

    interface f {
        void a(PopupWindow popupWindow, int i);

        void a(PopupWindow popupWindow, View view, int i, int i2, int i3);

        void a(PopupWindow popupWindow, boolean z);
    }

    static class c implements f {
        c() {
        }

        @Override // android.support.v4.widget.s.f
        public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2);
        }

        @Override // android.support.v4.widget.s.f
        public void a(PopupWindow popupWindow, boolean z) {
        }

        @Override // android.support.v4.widget.s.f
        public void a(PopupWindow popupWindow, int i) {
        }
    }

    static class d extends c {
        d() {
        }

        @Override // android.support.v4.widget.s.c, android.support.v4.widget.s.f
        public void a(PopupWindow popupWindow, int i) {
            v.a(popupWindow, i);
        }
    }

    static class e extends d {
        e() {
        }

        @Override // android.support.v4.widget.s.c, android.support.v4.widget.s.f
        public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            w.a(popupWindow, view, i, i2, i3);
        }
    }

    static class a extends e {
        a() {
        }

        @Override // android.support.v4.widget.s.c, android.support.v4.widget.s.f
        public void a(PopupWindow popupWindow, boolean z) {
            t.a(popupWindow, z);
        }
    }

    static class b extends a {
        b() {
        }

        @Override // android.support.v4.widget.s.a, android.support.v4.widget.s.c, android.support.v4.widget.s.f
        public void a(PopupWindow popupWindow, boolean z) {
            u.a(popupWindow, z);
        }

        @Override // android.support.v4.widget.s.d, android.support.v4.widget.s.c, android.support.v4.widget.s.f
        public void a(PopupWindow popupWindow, int i) {
            u.a(popupWindow, i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            a = new b();
            return;
        }
        if (i >= 21) {
            a = new a();
            return;
        }
        if (i >= 19) {
            a = new e();
        } else if (i >= 9) {
            a = new d();
        } else {
            a = new c();
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        a.a(popupWindow, view, i, i2, i3);
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        a.a(popupWindow, z);
    }

    public static void a(PopupWindow popupWindow, int i) {
        a.a(popupWindow, i);
    }
}
