package android.support.p002v4.view;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
/* renamed from: android.support.v4.view.az */
/* loaded from: classes.dex */
public final class C0351az {

    /* renamed from: a */
    static final InterfaceC0353b f761a;

    /* renamed from: android.support.v4.view.az$b */
    /* loaded from: classes.dex */
    interface InterfaceC0353b {
        /* renamed from: a */
        void mo12741a(ViewParent viewParent, View view);

        /* renamed from: a */
        void mo12738a(ViewParent viewParent, View view, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo12737a(ViewParent viewParent, View view, int i, int i2, int[] iArr);

        /* renamed from: a */
        boolean mo12740a(ViewParent viewParent, View view, float f, float f2);

        /* renamed from: a */
        boolean mo12739a(ViewParent viewParent, View view, float f, float f2, boolean z);

        /* renamed from: a */
        boolean mo12736a(ViewParent viewParent, View view, View view2, int i);

        /* renamed from: b */
        void mo12735b(ViewParent viewParent, View view, View view2, int i);
    }

    /* renamed from: android.support.v4.view.az$e */
    /* loaded from: classes.dex */
    static class C0356e implements InterfaceC0353b {
        C0356e() {
        }

        @Override // android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public boolean mo12736a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof InterfaceC0438z) {
                return ((InterfaceC0438z) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        @Override // android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: b */
        public void mo12735b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof InterfaceC0438z) {
                ((InterfaceC0438z) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        @Override // android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public void mo12741a(ViewParent viewParent, View view) {
            if (viewParent instanceof InterfaceC0438z) {
                ((InterfaceC0438z) viewParent).onStopNestedScroll(view);
            }
        }

        @Override // android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public void mo12738a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof InterfaceC0438z) {
                ((InterfaceC0438z) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        @Override // android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public void mo12737a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof InterfaceC0438z) {
                ((InterfaceC0438z) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        @Override // android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public boolean mo12739a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof InterfaceC0438z) {
                return ((InterfaceC0438z) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        @Override // android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public boolean mo12740a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof InterfaceC0438z) {
                return ((InterfaceC0438z) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.view.az$a */
    /* loaded from: classes.dex */
    static class C0352a extends C0356e {
        C0352a() {
        }
    }

    /* renamed from: android.support.v4.view.az$c */
    /* loaded from: classes.dex */
    static class C0354c extends C0352a {
        C0354c() {
        }
    }

    /* renamed from: android.support.v4.view.az$d */
    /* loaded from: classes.dex */
    static class C0355d extends C0354c {
        C0355d() {
        }

        @Override // android.support.p002v4.view.C0351az.C0356e, android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public boolean mo12736a(ViewParent viewParent, View view, View view2, int i) {
            return C0362ba.m12713a(viewParent, view, view2, i);
        }

        @Override // android.support.p002v4.view.C0351az.C0356e, android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: b */
        public void mo12735b(ViewParent viewParent, View view, View view2, int i) {
            C0362ba.m12712b(viewParent, view, view2, i);
        }

        @Override // android.support.p002v4.view.C0351az.C0356e, android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public void mo12741a(ViewParent viewParent, View view) {
            C0362ba.m12718a(viewParent, view);
        }

        @Override // android.support.p002v4.view.C0351az.C0356e, android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public void mo12738a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            C0362ba.m12715a(viewParent, view, i, i2, i3, i4);
        }

        @Override // android.support.p002v4.view.C0351az.C0356e, android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public void mo12737a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            C0362ba.m12714a(viewParent, view, i, i2, iArr);
        }

        @Override // android.support.p002v4.view.C0351az.C0356e, android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public boolean mo12739a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return C0362ba.m12716a(viewParent, view, f, f2, z);
        }

        @Override // android.support.p002v4.view.C0351az.C0356e, android.support.p002v4.view.C0351az.InterfaceC0353b
        /* renamed from: a */
        public boolean mo12740a(ViewParent viewParent, View view, float f, float f2) {
            return C0362ba.m12717a(viewParent, view, f, f2);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f761a = new C0355d();
        } else if (i >= 19) {
            f761a = new C0354c();
        } else if (i >= 14) {
            f761a = new C0352a();
        } else {
            f761a = new C0356e();
        }
    }

    /* renamed from: a */
    public static boolean m12743a(ViewParent viewParent, View view, View view2, int i) {
        return f761a.mo12736a(viewParent, view, view2, i);
    }

    /* renamed from: b */
    public static void m12742b(ViewParent viewParent, View view, View view2, int i) {
        f761a.mo12735b(viewParent, view, view2, i);
    }

    /* renamed from: a */
    public static void m12748a(ViewParent viewParent, View view) {
        f761a.mo12741a(viewParent, view);
    }

    /* renamed from: a */
    public static void m12745a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        f761a.mo12738a(viewParent, view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m12744a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        f761a.mo12737a(viewParent, view, i, i2, iArr);
    }

    /* renamed from: a */
    public static boolean m12746a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f761a.mo12739a(viewParent, view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m12747a(ViewParent viewParent, View view, float f, float f2) {
        return f761a.mo12740a(viewParent, view, f, f2);
    }
}
