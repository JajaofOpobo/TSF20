package android.support.v4.view;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class az {
    static final b a;

    interface b {
        void a(ViewParent viewParent, View view);

        void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4);

        void a(ViewParent viewParent, View view, int i, int i2, int[] iArr);

        boolean a(ViewParent viewParent, View view, float f, float f2);

        boolean a(ViewParent viewParent, View view, float f, float f2, boolean z);

        boolean a(ViewParent viewParent, View view, View view2, int i);

        void b(ViewParent viewParent, View view, View view2, int i);
    }

    static class e implements b {
        e() {
        }

        @Override // android.support.v4.view.az.b
        public boolean a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof z) {
                return ((z) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        @Override // android.support.v4.view.az.b
        public void b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof z) {
                ((z) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        @Override // android.support.v4.view.az.b
        public void a(ViewParent viewParent, View view) {
            if (viewParent instanceof z) {
                ((z) viewParent).onStopNestedScroll(view);
            }
        }

        @Override // android.support.v4.view.az.b
        public void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof z) {
                ((z) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        @Override // android.support.v4.view.az.b
        public void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof z) {
                ((z) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        @Override // android.support.v4.view.az.b
        public boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof z) {
                return ((z) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        @Override // android.support.v4.view.az.b
        public boolean a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof z) {
                return ((z) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    static class a extends e {
        a() {
        }
    }

    static class c extends a {
        c() {
        }
    }

    static class d extends c {
        d() {
        }

        @Override // android.support.v4.view.az.e, android.support.v4.view.az.b
        public boolean a(ViewParent viewParent, View view, View view2, int i) {
            return ba.a(viewParent, view, view2, i);
        }

        @Override // android.support.v4.view.az.e, android.support.v4.view.az.b
        public void b(ViewParent viewParent, View view, View view2, int i) {
            ba.b(viewParent, view, view2, i);
        }

        @Override // android.support.v4.view.az.e, android.support.v4.view.az.b
        public void a(ViewParent viewParent, View view) {
            ba.a(viewParent, view);
        }

        @Override // android.support.v4.view.az.e, android.support.v4.view.az.b
        public void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            ba.a(viewParent, view, i, i2, i3, i4);
        }

        @Override // android.support.v4.view.az.e, android.support.v4.view.az.b
        public void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            ba.a(viewParent, view, i, i2, iArr);
        }

        @Override // android.support.v4.view.az.e, android.support.v4.view.az.b
        public boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return ba.a(viewParent, view, f, f2, z);
        }

        @Override // android.support.v4.view.az.e, android.support.v4.view.az.b
        public boolean a(ViewParent viewParent, View view, float f, float f2) {
            return ba.a(viewParent, view, f, f2);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a = new d();
            return;
        }
        if (i >= 19) {
            a = new c();
        } else if (i >= 14) {
            a = new a();
        } else {
            a = new e();
        }
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i) {
        return a.a(viewParent, view, view2, i);
    }

    public static void b(ViewParent viewParent, View view, View view2, int i) {
        a.b(viewParent, view, view2, i);
    }

    public static void a(ViewParent viewParent, View view) {
        a.a(viewParent, view);
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        a.a(viewParent, view, i, i2, i3, i4);
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        a.a(viewParent, view, i, i2, iArr);
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return a.a(viewParent, view, f, f2, z);
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2) {
        return a.a(viewParent, view, f, f2);
    }
}
