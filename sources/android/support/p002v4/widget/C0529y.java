package android.support.p002v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.Scroller;
/* renamed from: android.support.v4.widget.y */
/* loaded from: classes.dex */
public final class C0529y {

    /* renamed from: a */
    Object f1109a;

    /* renamed from: b */
    InterfaceC0530a f1110b;

    /* renamed from: android.support.v4.widget.y$a */
    /* loaded from: classes.dex */
    interface InterfaceC0530a {
        /* renamed from: a */
        Object mo12148a(Context context, Interpolator interpolator);

        /* renamed from: a */
        void mo12146a(Object obj, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo12145a(Object obj, int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo12143a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

        /* renamed from: a */
        void mo12142a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

        /* renamed from: a */
        boolean mo12147a(Object obj);

        /* renamed from: a */
        boolean mo12144a(Object obj, int i, int i2, int i3, int i4, int i5, int i6);

        /* renamed from: b */
        int mo12141b(Object obj);

        /* renamed from: c */
        int mo12140c(Object obj);

        /* renamed from: d */
        float mo12135d(Object obj);

        /* renamed from: e */
        boolean mo12139e(Object obj);

        /* renamed from: f */
        void mo12138f(Object obj);

        /* renamed from: g */
        int mo12137g(Object obj);

        /* renamed from: h */
        int mo12136h(Object obj);
    }

    /* renamed from: android.support.v4.widget.y$b */
    /* loaded from: classes.dex */
    static class C0531b implements InterfaceC0530a {
        C0531b() {
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public Object mo12148a(Context context, Interpolator interpolator) {
            return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public boolean mo12147a(Object obj) {
            return ((Scroller) obj).isFinished();
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: b */
        public int mo12141b(Object obj) {
            return ((Scroller) obj).getCurrX();
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: c */
        public int mo12140c(Object obj) {
            return ((Scroller) obj).getCurrY();
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: d */
        public float mo12135d(Object obj) {
            return 0.0f;
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: e */
        public boolean mo12139e(Object obj) {
            return ((Scroller) obj).computeScrollOffset();
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public void mo12146a(Object obj, int i, int i2, int i3, int i4) {
            ((Scroller) obj).startScroll(i, i2, i3, i4);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public void mo12145a(Object obj, int i, int i2, int i3, int i4, int i5) {
            ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public void mo12143a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public void mo12142a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: f */
        public void mo12138f(Object obj) {
            ((Scroller) obj).abortAnimation();
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: g */
        public int mo12137g(Object obj) {
            return ((Scroller) obj).getFinalX();
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: h */
        public int mo12136h(Object obj) {
            return ((Scroller) obj).getFinalY();
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public boolean mo12144a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.y$c */
    /* loaded from: classes.dex */
    static class C0532c implements InterfaceC0530a {
        C0532c() {
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public Object mo12148a(Context context, Interpolator interpolator) {
            return C0534z.m12134a(context, interpolator);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public boolean mo12147a(Object obj) {
            return C0534z.m12133a(obj);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: b */
        public int mo12141b(Object obj) {
            return C0534z.m12127b(obj);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: c */
        public int mo12140c(Object obj) {
            return C0534z.m12126c(obj);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: d */
        public float mo12135d(Object obj) {
            return 0.0f;
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: e */
        public boolean mo12139e(Object obj) {
            return C0534z.m12125d(obj);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public void mo12146a(Object obj, int i, int i2, int i3, int i4) {
            C0534z.m12132a(obj, i, i2, i3, i4);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public void mo12145a(Object obj, int i, int i2, int i3, int i4, int i5) {
            C0534z.m12131a(obj, i, i2, i3, i4, i5);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public void mo12143a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C0534z.m12129a(obj, i, i2, i3, i4, i5, i6, i7, i8);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public void mo12142a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            C0534z.m12128a(obj, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: f */
        public void mo12138f(Object obj) {
            C0534z.m12124e(obj);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: g */
        public int mo12137g(Object obj) {
            return C0534z.m12123f(obj);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: h */
        public int mo12136h(Object obj) {
            return C0534z.m12122g(obj);
        }

        @Override // android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: a */
        public boolean mo12144a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
            return C0534z.m12130a(obj, i, i2, i3, i4, i5, i6);
        }
    }

    /* renamed from: android.support.v4.widget.y$d */
    /* loaded from: classes.dex */
    static class C0533d extends C0532c {
        C0533d() {
        }

        @Override // android.support.p002v4.widget.C0529y.C0532c, android.support.p002v4.widget.C0529y.InterfaceC0530a
        /* renamed from: d */
        public float mo12135d(Object obj) {
            return C0476aa.m12342a(obj);
        }
    }

    /* renamed from: a */
    public static C0529y m12157a(Context context) {
        return m12156a(context, null);
    }

    /* renamed from: a */
    public static C0529y m12156a(Context context, Interpolator interpolator) {
        return new C0529y(Build.VERSION.SDK_INT, context, interpolator);
    }

    private C0529y(int i, Context context, Interpolator interpolator) {
        if (i >= 14) {
            this.f1110b = new C0533d();
        } else if (i >= 9) {
            this.f1110b = new C0532c();
        } else {
            this.f1110b = new C0531b();
        }
        this.f1109a = this.f1110b.mo12148a(context, interpolator);
    }

    /* renamed from: a */
    public boolean m12163a() {
        return this.f1110b.mo12147a(this.f1109a);
    }

    /* renamed from: b */
    public int m12155b() {
        return this.f1110b.mo12141b(this.f1109a);
    }

    /* renamed from: c */
    public int m12154c() {
        return this.f1110b.mo12140c(this.f1109a);
    }

    /* renamed from: d */
    public int m12153d() {
        return this.f1110b.mo12137g(this.f1109a);
    }

    /* renamed from: e */
    public int m12152e() {
        return this.f1110b.mo12136h(this.f1109a);
    }

    /* renamed from: f */
    public float m12151f() {
        return this.f1110b.mo12135d(this.f1109a);
    }

    /* renamed from: g */
    public boolean m12150g() {
        return this.f1110b.mo12139e(this.f1109a);
    }

    /* renamed from: a */
    public void m12162a(int i, int i2, int i3, int i4) {
        this.f1110b.mo12146a(this.f1109a, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void m12161a(int i, int i2, int i3, int i4, int i5) {
        this.f1110b.mo12145a(this.f1109a, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public void m12159a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f1110b.mo12143a(this.f1109a, i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public void m12158a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f1110b.mo12142a(this.f1109a, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    /* renamed from: a */
    public boolean m12160a(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f1110b.mo12144a(this.f1109a, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: h */
    public void m12149h() {
        this.f1110b.mo12138f(this.f1109a);
    }
}
