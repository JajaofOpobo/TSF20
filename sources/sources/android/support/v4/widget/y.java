package android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class y {
    Object a;
    a b;

    interface a {
        Object a(Context context, Interpolator interpolator);

        void a(Object obj, int i, int i2, int i3, int i4);

        void a(Object obj, int i, int i2, int i3, int i4, int i5);

        void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

        void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

        boolean a(Object obj);

        boolean a(Object obj, int i, int i2, int i3, int i4, int i5, int i6);

        int b(Object obj);

        int c(Object obj);

        float d(Object obj);

        boolean e(Object obj);

        void f(Object obj);

        int g(Object obj);

        int h(Object obj);
    }

    static class b implements a {
        b() {
        }

        @Override // android.support.v4.widget.y.a
        public Object a(Context context, Interpolator interpolator) {
            return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
        }

        @Override // android.support.v4.widget.y.a
        public boolean a(Object obj) {
            return ((Scroller) obj).isFinished();
        }

        @Override // android.support.v4.widget.y.a
        public int b(Object obj) {
            return ((Scroller) obj).getCurrX();
        }

        @Override // android.support.v4.widget.y.a
        public int c(Object obj) {
            return ((Scroller) obj).getCurrY();
        }

        @Override // android.support.v4.widget.y.a
        public float d(Object obj) {
            return 0.0f;
        }

        @Override // android.support.v4.widget.y.a
        public boolean e(Object obj) {
            return ((Scroller) obj).computeScrollOffset();
        }

        @Override // android.support.v4.widget.y.a
        public void a(Object obj, int i, int i2, int i3, int i4) {
            ((Scroller) obj).startScroll(i, i2, i3, i4);
        }

        @Override // android.support.v4.widget.y.a
        public void a(Object obj, int i, int i2, int i3, int i4, int i5) {
            ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
        }

        @Override // android.support.v4.widget.y.a
        public void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        @Override // android.support.v4.widget.y.a
        public void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        @Override // android.support.v4.widget.y.a
        public void f(Object obj) {
            ((Scroller) obj).abortAnimation();
        }

        @Override // android.support.v4.widget.y.a
        public int g(Object obj) {
            return ((Scroller) obj).getFinalX();
        }

        @Override // android.support.v4.widget.y.a
        public int h(Object obj) {
            return ((Scroller) obj).getFinalY();
        }

        @Override // android.support.v4.widget.y.a
        public boolean a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
            return false;
        }
    }

    static class c implements a {
        c() {
        }

        @Override // android.support.v4.widget.y.a
        public Object a(Context context, Interpolator interpolator) {
            return z.a(context, interpolator);
        }

        @Override // android.support.v4.widget.y.a
        public boolean a(Object obj) {
            return z.a(obj);
        }

        @Override // android.support.v4.widget.y.a
        public int b(Object obj) {
            return z.b(obj);
        }

        @Override // android.support.v4.widget.y.a
        public int c(Object obj) {
            return z.c(obj);
        }

        @Override // android.support.v4.widget.y.a
        public float d(Object obj) {
            return 0.0f;
        }

        @Override // android.support.v4.widget.y.a
        public boolean e(Object obj) {
            return z.d(obj);
        }

        @Override // android.support.v4.widget.y.a
        public void a(Object obj, int i, int i2, int i3, int i4) {
            z.a(obj, i, i2, i3, i4);
        }

        @Override // android.support.v4.widget.y.a
        public void a(Object obj, int i, int i2, int i3, int i4, int i5) {
            z.a(obj, i, i2, i3, i4, i5);
        }

        @Override // android.support.v4.widget.y.a
        public void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            z.a(obj, i, i2, i3, i4, i5, i6, i7, i8);
        }

        @Override // android.support.v4.widget.y.a
        public void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            z.a(obj, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }

        @Override // android.support.v4.widget.y.a
        public void f(Object obj) {
            z.e(obj);
        }

        @Override // android.support.v4.widget.y.a
        public int g(Object obj) {
            return z.f(obj);
        }

        @Override // android.support.v4.widget.y.a
        public int h(Object obj) {
            return z.g(obj);
        }

        @Override // android.support.v4.widget.y.a
        public boolean a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
            return z.a(obj, i, i2, i3, i4, i5, i6);
        }
    }

    static class d extends c {
        d() {
        }

        @Override // android.support.v4.widget.y.c, android.support.v4.widget.y.a
        public float d(Object obj) {
            return aa.a(obj);
        }
    }

    public static y a(Context context) {
        return a(context, null);
    }

    public static y a(Context context, Interpolator interpolator) {
        return new y(Build.VERSION.SDK_INT, context, interpolator);
    }

    private y(int i, Context context, Interpolator interpolator) {
        if (i >= 14) {
            this.b = new d();
        } else if (i >= 9) {
            this.b = new c();
        } else {
            this.b = new b();
        }
        this.a = this.b.a(context, interpolator);
    }

    public boolean a() {
        return this.b.a(this.a);
    }

    public int b() {
        return this.b.b(this.a);
    }

    public int c() {
        return this.b.c(this.a);
    }

    public int d() {
        return this.b.g(this.a);
    }

    public int e() {
        return this.b.h(this.a);
    }

    public float f() {
        return this.b.d(this.a);
    }

    public boolean g() {
        return this.b.e(this.a);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.b.a(this.a, i, i2, i3, i4);
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        this.b.a(this.a, i, i2, i3, i4, i5);
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.b.a(this.a, i, i2, i3, i4, i5, i6, i7, i8);
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.b.a(this.a, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    public boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.b.a(this.a, i, i2, i3, i4, i5, i6);
    }

    public void h() {
        this.b.f(this.a);
    }
}
