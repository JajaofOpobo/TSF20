package android.support.v4.view;

import android.os.Build;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class au {
    static final e a;

    /* loaded from: classes.dex */
    interface e {
        int a(ViewConfiguration viewConfiguration);

        boolean b(ViewConfiguration viewConfiguration);
    }

    /* loaded from: classes.dex */
    static class a implements e {
        a() {
        }

        @Override // android.support.v4.view.au.e
        public int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledTouchSlop();
        }

        @Override // android.support.v4.view.au.e
        public boolean b(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.view.au.a, android.support.v4.view.au.e
        public int a(ViewConfiguration viewConfiguration) {
            return av.a(viewConfiguration);
        }
    }

    /* loaded from: classes.dex */
    static class c extends b {
        c() {
        }

        @Override // android.support.v4.view.au.a, android.support.v4.view.au.e
        public boolean b(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    static class d extends c {
        d() {
        }

        @Override // android.support.v4.view.au.c, android.support.v4.view.au.a, android.support.v4.view.au.e
        public boolean b(ViewConfiguration viewConfiguration) {
            return aw.a(viewConfiguration);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            a = new d();
        } else if (Build.VERSION.SDK_INT >= 11) {
            a = new c();
        } else if (Build.VERSION.SDK_INT >= 8) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        return a.b(viewConfiguration);
    }
}
