package android.support.v4.view;

import android.os.Build;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class e {
    static final a a;

    interface a {
        int a(int i, int i2);
    }

    static class b implements a {
        b() {
        }

        @Override // android.support.v4.view.e.a
        public int a(int i, int i2) {
            return (-8388609) & i;
        }
    }

    static class c implements a {
        c() {
        }

        @Override // android.support.v4.view.e.a
        public int a(int i, int i2) {
            return f.a(i, i2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static int a(int i, int i2) {
        return a.a(i, i2);
    }
}
