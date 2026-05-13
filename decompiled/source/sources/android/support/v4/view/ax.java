package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class ax {
    static final c a;

    /* loaded from: classes.dex */
    interface c {
        void a(ViewGroup viewGroup, boolean z);
    }

    /* loaded from: classes.dex */
    static class f implements c {
        f() {
        }

        @Override // android.support.v4.view.ax.c
        public void a(ViewGroup viewGroup, boolean z) {
        }
    }

    /* loaded from: classes.dex */
    static class a extends f {
        a() {
        }

        @Override // android.support.v4.view.ax.f, android.support.v4.view.ax.c
        public void a(ViewGroup viewGroup, boolean z) {
            ay.a(viewGroup, z);
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }
    }

    /* loaded from: classes.dex */
    static class d extends b {
        d() {
        }
    }

    /* loaded from: classes.dex */
    static class e extends d {
        e() {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a = new e();
        } else if (i >= 18) {
            a = new d();
        } else if (i >= 14) {
            a = new b();
        } else if (i >= 11) {
            a = new a();
        } else {
            a = new f();
        }
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        a.a(viewGroup, z);
    }
}
