package android.support.v4.view;

import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class j {
    static final a a;

    interface a {
        n a(LayoutInflater layoutInflater);

        void a(LayoutInflater layoutInflater, n nVar);
    }

    static class b implements a {
        b() {
        }

        @Override // android.support.v4.view.j.a
        public void a(LayoutInflater layoutInflater, n nVar) {
            k.a(layoutInflater, nVar);
        }

        @Override // android.support.v4.view.j.a
        public n a(LayoutInflater layoutInflater) {
            return k.a(layoutInflater);
        }
    }

    static class c extends b {
        c() {
        }

        @Override // android.support.v4.view.j.b, android.support.v4.view.j.a
        public void a(LayoutInflater layoutInflater, n nVar) {
            l.a(layoutInflater, nVar);
        }
    }

    static class d extends c {
        d() {
        }

        @Override // android.support.v4.view.j.c, android.support.v4.view.j.b, android.support.v4.view.j.a
        public void a(LayoutInflater layoutInflater, n nVar) {
            m.a(layoutInflater, nVar);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a = new d();
        } else if (i >= 11) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static void a(LayoutInflater layoutInflater, n nVar) {
        a.a(layoutInflater, nVar);
    }

    public static n a(LayoutInflater layoutInflater) {
        return a.a(layoutInflater);
    }
}
