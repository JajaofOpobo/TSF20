package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class ai {
    static final m a;

    interface m {
        int a(int i, int i2, int i3);

        int a(View view);

        bi a(View view, bi biVar);

        void a(View view, float f);

        void a(View view, int i, int i2);

        void a(View view, int i, int i2, int i3, int i4);

        void a(View view, int i, Paint paint);

        void a(View view, ColorStateList colorStateList);

        void a(View view, Paint paint);

        void a(View view, PorterDuff.Mode mode);

        void a(View view, android.support.v4.view.a aVar);

        void a(View view, ab abVar);

        void a(View view, Runnable runnable);

        void a(View view, Runnable runnable, long j);

        void a(View view, boolean z);

        void a(ViewGroup viewGroup, boolean z);

        boolean a(View view, int i);

        bi b(View view, bi biVar);

        void b(View view);

        void b(View view, float f);

        void b(View view, boolean z);

        boolean b(View view, int i);

        int c(View view);

        void c(View view, float f);

        void c(View view, int i);

        int d(View view);

        void d(View view, float f);

        void d(View view, int i);

        int e(View view);

        void e(View view, float f);

        void e(View view, int i);

        ViewParent f(View view);

        boolean g(View view);

        int h(View view);

        int i(View view);

        boolean j(View view);

        float k(View view);

        float l(View view);

        int m(View view);

        bb n(View view);

        int o(View view);

        void p(View view);

        float q(View view);

        boolean r(View view);

        void s(View view);

        boolean t(View view);

        ColorStateList u(View view);

        PorterDuff.Mode v(View view);

        void w(View view);

        boolean x(View view);

        boolean y(View view);

        boolean z(View view);
    }

    static class a implements m {
        WeakHashMap<View, bb> a = null;

        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.view.ai.m
        public boolean a(View view, int i) {
            return (view instanceof ae) && a((ae) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.view.ai.m
        public boolean b(View view, int i) {
            return (view instanceof ae) && b((ae) view, i);
        }

        @Override // android.support.v4.view.ai.m
        public int a(View view) {
            return 2;
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, android.support.v4.view.a aVar) {
        }

        @Override // android.support.v4.view.ai.m
        public void b(View view) {
            view.invalidate();
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, int i, int i2, int i3, int i4) {
            view.invalidate(i, i2, i3, i4);
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, Runnable runnable) {
            view.postDelayed(runnable, a());
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, a() + j);
        }

        long a() {
            return 10L;
        }

        @Override // android.support.v4.view.ai.m
        public int c(View view) {
            return 0;
        }

        @Override // android.support.v4.view.ai.m
        public void c(View view, int i) {
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, int i, Paint paint) {
        }

        @Override // android.support.v4.view.ai.m
        public int d(View view) {
            return 0;
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, Paint paint) {
        }

        @Override // android.support.v4.view.ai.m
        public int e(View view) {
            return 0;
        }

        @Override // android.support.v4.view.ai.m
        public ViewParent f(View view) {
            return view.getParent();
        }

        @Override // android.support.v4.view.ai.m
        public boolean g(View view) {
            Drawable background = view.getBackground();
            return background != null && background.getOpacity() == -1;
        }

        @Override // android.support.v4.view.ai.m
        public int a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        @Override // android.support.v4.view.ai.m
        public int h(View view) {
            return view.getMeasuredWidth();
        }

        @Override // android.support.v4.view.ai.m
        public int i(View view) {
            return 0;
        }

        @Override // android.support.v4.view.ai.m
        public boolean j(View view) {
            return true;
        }

        @Override // android.support.v4.view.ai.m
        public float k(View view) {
            return 0.0f;
        }

        @Override // android.support.v4.view.ai.m
        public float l(View view) {
            return 0.0f;
        }

        @Override // android.support.v4.view.ai.m
        public int m(View view) {
            return aj.d(view);
        }

        @Override // android.support.v4.view.ai.m
        public bb n(View view) {
            return new bb(view);
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, float f) {
        }

        @Override // android.support.v4.view.ai.m
        public void b(View view, float f) {
        }

        @Override // android.support.v4.view.ai.m
        public void c(View view, float f) {
        }

        @Override // android.support.v4.view.ai.m
        public void d(View view, float f) {
        }

        @Override // android.support.v4.view.ai.m
        public int o(View view) {
            return 0;
        }

        @Override // android.support.v4.view.ai.m
        public void p(View view) {
        }

        @Override // android.support.v4.view.ai.m
        public void e(View view, float f) {
        }

        @Override // android.support.v4.view.ai.m
        public float q(View view) {
            return 0.0f;
        }

        @Override // android.support.v4.view.ai.m
        public void a(ViewGroup viewGroup, boolean z) {
        }

        @Override // android.support.v4.view.ai.m
        public boolean r(View view) {
            return false;
        }

        @Override // android.support.v4.view.ai.m
        public void s(View view) {
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, ab abVar) {
        }

        @Override // android.support.v4.view.ai.m
        public bi a(View view, bi biVar) {
            return biVar;
        }

        @Override // android.support.v4.view.ai.m
        public bi b(View view, bi biVar) {
            return biVar;
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, boolean z) {
        }

        @Override // android.support.v4.view.ai.m
        public void b(View view, boolean z) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.view.ai.m
        public boolean t(View view) {
            if (view instanceof x) {
                return ((x) view).isNestedScrollingEnabled();
            }
            return false;
        }

        @Override // android.support.v4.view.ai.m
        public ColorStateList u(View view) {
            return aj.a(view);
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, ColorStateList colorStateList) {
            aj.a(view, colorStateList);
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, PorterDuff.Mode mode) {
            aj.a(view, mode);
        }

        @Override // android.support.v4.view.ai.m
        public PorterDuff.Mode v(View view) {
            return aj.b(view);
        }

        private boolean a(ae aeVar, int i) {
            int iComputeHorizontalScrollOffset = aeVar.computeHorizontalScrollOffset();
            int iComputeHorizontalScrollRange = aeVar.computeHorizontalScrollRange() - aeVar.computeHorizontalScrollExtent();
            if (iComputeHorizontalScrollRange == 0) {
                return false;
            }
            return i < 0 ? iComputeHorizontalScrollOffset > 0 : iComputeHorizontalScrollOffset < iComputeHorizontalScrollRange + (-1);
        }

        private boolean b(ae aeVar, int i) {
            int iComputeVerticalScrollOffset = aeVar.computeVerticalScrollOffset();
            int iComputeVerticalScrollRange = aeVar.computeVerticalScrollRange() - aeVar.computeVerticalScrollExtent();
            if (iComputeVerticalScrollRange == 0) {
                return false;
            }
            return i < 0 ? iComputeVerticalScrollOffset > 0 : iComputeVerticalScrollOffset < iComputeVerticalScrollRange + (-1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.view.ai.m
        public void w(View view) {
            if (view instanceof x) {
                ((x) view).stopNestedScroll();
            }
        }

        @Override // android.support.v4.view.ai.m
        public boolean x(View view) {
            return aj.c(view);
        }

        @Override // android.support.v4.view.ai.m
        public boolean y(View view) {
            return aj.e(view);
        }

        @Override // android.support.v4.view.ai.m
        public boolean z(View view) {
            return false;
        }

        @Override // android.support.v4.view.ai.m
        public void a(View view, int i, int i2) {
        }

        @Override // android.support.v4.view.ai.m
        public void d(View view, int i) {
            aj.b(view, i);
        }

        @Override // android.support.v4.view.ai.m
        public void e(View view, int i) {
            aj.a(view, i);
        }
    }

    static class b extends a {
        b() {
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean g(View view) {
            return ak.a(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(ViewGroup viewGroup, boolean z) {
            ak.a(viewGroup, z);
        }
    }

    static class c extends b {
        c() {
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int a(View view) {
            return al.a(view);
        }
    }

    static class d extends c {
        d() {
        }

        @Override // android.support.v4.view.ai.a
        long a() {
            return am.a();
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, int i, Paint paint) {
            am.a(view, i, paint);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int d(View view) {
            return am.a(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, Paint paint) {
            a(view, d(view), paint);
            view.invalidate();
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int a(int i, int i2, int i3) {
            return am.a(i, i2, i3);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int h(View view) {
            return am.b(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int i(View view) {
            return am.c(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public float k(View view) {
            return am.d(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, float f) {
            am.a(view, f);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void b(View view, float f) {
            am.b(view, f);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void c(View view, float f) {
            am.c(view, f);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void d(View view, float f) {
            am.d(view, f);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public float l(View view) {
            return am.e(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void s(View view) {
            am.f(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, boolean z) {
            am.a(view, z);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void b(View view, boolean z) {
            am.b(view, z);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void d(View view, int i) {
            am.b(view, i);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void e(View view, int i) {
            am.a(view, i);
        }
    }

    static class f extends d {
        static boolean b = false;

        f() {
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean a(View view, int i) {
            return an.a(view, i);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean b(View view, int i) {
            return an.b(view, i);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, android.support.v4.view.a aVar) {
            an.a(view, aVar == null ? null : aVar.a());
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public bb n(View view) {
            if (this.a == null) {
                this.a = new WeakHashMap<>();
            }
            bb bbVar = this.a.get(view);
            if (bbVar == null) {
                bb bbVar2 = new bb(view);
                this.a.put(view, bbVar2);
                return bbVar2;
            }
            return bbVar;
        }
    }

    static class e extends f {
        e() {
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean z(View view) {
            return ao.a(view);
        }
    }

    static class g extends e {
        g() {
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void b(View view) {
            ap.a(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, int i, int i2, int i3, int i4) {
            ap.a(view, i, i2, i3, i4);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, Runnable runnable) {
            ap.a(view, runnable);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, Runnable runnable, long j) {
            ap.a(view, runnable, j);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int c(View view) {
            return ap.b(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void c(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            ap.a(view, i);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public ViewParent f(View view) {
            return ap.c(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int m(View view) {
            return ap.d(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void p(View view) {
            ap.e(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean r(View view) {
            return ap.f(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean j(View view) {
            return ap.g(view);
        }
    }

    static class h extends g {
        h() {
        }

        @Override // android.support.v4.view.ai.d, android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, Paint paint) {
            aq.a(view, paint);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int e(View view) {
            return aq.a(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public int o(View view) {
            return aq.b(view);
        }
    }

    static class i extends h {
        i() {
        }
    }

    static class j extends i {
        j() {
        }

        @Override // android.support.v4.view.ai.g, android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void c(View view, int i) {
            ap.a(view, i);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean x(View view) {
            return ar.a(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean y(View view) {
            return ar.b(view);
        }
    }

    static class k extends j {
        k() {
        }

        @Override // android.support.v4.view.ai.g, android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void p(View view) {
            as.a(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void e(View view, float f) {
            as.a(view, f);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public float q(View view) {
            return as.b(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, ab abVar) {
            as.a(view, abVar);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public boolean t(View view) {
            return as.e(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void w(View view) {
            as.f(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public ColorStateList u(View view) {
            return as.c(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, ColorStateList colorStateList) {
            as.a(view, colorStateList);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, PorterDuff.Mode mode) {
            as.a(view, mode);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public PorterDuff.Mode v(View view) {
            return as.d(view);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public bi a(View view, bi biVar) {
            return as.a(view, biVar);
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public bi b(View view, bi biVar) {
            return as.b(view, biVar);
        }

        @Override // android.support.v4.view.ai.d, android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void d(View view, int i) {
            as.b(view, i);
        }

        @Override // android.support.v4.view.ai.d, android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void e(View view, int i) {
            as.a(view, i);
        }
    }

    static class l extends k {
        l() {
        }

        @Override // android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void a(View view, int i, int i2) {
            at.a(view, i, i2);
        }

        @Override // android.support.v4.view.ai.k, android.support.v4.view.ai.d, android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void d(View view, int i) {
            at.b(view, i);
        }

        @Override // android.support.v4.view.ai.k, android.support.v4.view.ai.d, android.support.v4.view.ai.a, android.support.v4.view.ai.m
        public void e(View view, int i) {
            at.a(view, i);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            a = new l();
            return;
        }
        if (i2 >= 21) {
            a = new k();
            return;
        }
        if (i2 >= 19) {
            a = new j();
            return;
        }
        if (i2 >= 17) {
            a = new h();
            return;
        }
        if (i2 >= 16) {
            a = new g();
            return;
        }
        if (i2 >= 15) {
            a = new e();
            return;
        }
        if (i2 >= 14) {
            a = new f();
            return;
        }
        if (i2 >= 11) {
            a = new d();
            return;
        }
        if (i2 >= 9) {
            a = new c();
        } else if (i2 >= 7) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static boolean a(View view, int i2) {
        return a.a(view, i2);
    }

    public static boolean b(View view, int i2) {
        return a.b(view, i2);
    }

    public static int a(View view) {
        return a.a(view);
    }

    public static void a(View view, android.support.v4.view.a aVar) {
        a.a(view, aVar);
    }

    public static void b(View view) {
        a.b(view);
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        a.a(view, i2, i3, i4, i5);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j2) {
        a.a(view, runnable, j2);
    }

    public static int c(View view) {
        return a.c(view);
    }

    public static void c(View view, int i2) {
        a.c(view, i2);
    }

    public static void a(View view, int i2, Paint paint) {
        a.a(view, i2, paint);
    }

    public static int d(View view) {
        return a.d(view);
    }

    public static void a(View view, Paint paint) {
        a.a(view, paint);
    }

    public static int e(View view) {
        return a.e(view);
    }

    public static ViewParent f(View view) {
        return a.f(view);
    }

    public static boolean g(View view) {
        return a.g(view);
    }

    public static int a(int i2, int i3, int i4) {
        return a.a(i2, i3, i4);
    }

    public static int h(View view) {
        return a.h(view);
    }

    public static int i(View view) {
        return a.i(view);
    }

    public static float j(View view) {
        return a.k(view);
    }

    public static int k(View view) {
        return a.m(view);
    }

    public static bb l(View view) {
        return a.n(view);
    }

    public static void a(View view, float f2) {
        a.a(view, f2);
    }

    public static void b(View view, float f2) {
        a.b(view, f2);
    }

    public static void c(View view, float f2) {
        a.c(view, f2);
    }

    public static void d(View view, float f2) {
        a.d(view, f2);
    }

    public static float m(View view) {
        return a.l(view);
    }

    public static void e(View view, float f2) {
        a.e(view, f2);
    }

    public static float n(View view) {
        return a.q(view);
    }

    public static int o(View view) {
        return a.o(view);
    }

    public static void p(View view) {
        a.p(view);
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        a.a(viewGroup, z);
    }

    public static boolean q(View view) {
        return a.r(view);
    }

    public static void r(View view) {
        a.s(view);
    }

    public static void a(View view, ab abVar) {
        a.a(view, abVar);
    }

    public static bi a(View view, bi biVar) {
        return a.a(view, biVar);
    }

    public static bi b(View view, bi biVar) {
        return a.b(view, biVar);
    }

    public static void a(View view, boolean z) {
        a.a(view, z);
    }

    public static void b(View view, boolean z) {
        a.b(view, z);
    }

    public static boolean s(View view) {
        return a.j(view);
    }

    public static ColorStateList t(View view) {
        return a.u(view);
    }

    public static void a(View view, ColorStateList colorStateList) {
        a.a(view, colorStateList);
    }

    public static PorterDuff.Mode u(View view) {
        return a.v(view);
    }

    public static void a(View view, PorterDuff.Mode mode) {
        a.a(view, mode);
    }

    public static boolean v(View view) {
        return a.t(view);
    }

    public static void w(View view) {
        a.w(view);
    }

    public static boolean x(View view) {
        return a.x(view);
    }

    public static void d(View view, int i2) {
        a.e(view, i2);
    }

    public static void e(View view, int i2) {
        a.d(view, i2);
    }

    public static boolean y(View view) {
        return a.y(view);
    }

    public static boolean z(View view) {
        return a.z(view);
    }

    public static void a(View view, int i2, int i3) {
        a.a(view, i2, i3);
    }
}
