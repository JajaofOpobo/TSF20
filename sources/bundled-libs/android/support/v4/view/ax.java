package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class ax {
    static final c a;

    interface c {
        void a(ViewGroup viewGroup, boolean z);
    }

    static class f implements c {
        f() {
        }

        @Override // android.support.v4.view.ax.c
        public void a(ViewGroup viewGroup, boolean z) {
        }
    }

    static class a extends f {
        a() {
        }

        @Override // android.support.v4.view.ax.f, android.support.v4.view.ax.c
        public void a(ViewGroup viewGroup, boolean z) {
            ay.a(viewGroup, z);
        }
    }

    static class b extends a {
        b() {
        }
    }

    static class d extends b {
        d() {
        }
    }

    static class e extends d {
        e() {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a = new e();
            return;
        }
        if (i >= 18) {
            a = new d();
            return;
        }
        if (i >= 14) {
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
