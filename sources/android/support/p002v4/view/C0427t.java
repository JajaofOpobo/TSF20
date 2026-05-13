package android.support.p002v4.view;

import android.os.Build;
import android.view.MotionEvent;
/* renamed from: android.support.v4.view.t */
/* loaded from: classes.dex */
public final class C0427t {

    /* renamed from: a */
    static final InterfaceC0432e f797a;

    /* renamed from: android.support.v4.view.t$e */
    /* loaded from: classes.dex */
    interface InterfaceC0432e {
        /* renamed from: a */
        int mo12590a(MotionEvent motionEvent);

        /* renamed from: a */
        int mo12589a(MotionEvent motionEvent, int i);

        /* renamed from: b */
        int mo12588b(MotionEvent motionEvent);

        /* renamed from: b */
        int mo12587b(MotionEvent motionEvent, int i);

        /* renamed from: c */
        float mo12586c(MotionEvent motionEvent, int i);

        /* renamed from: d */
        float mo12585d(MotionEvent motionEvent, int i);

        /* renamed from: e */
        float mo12584e(MotionEvent motionEvent, int i);
    }

    /* renamed from: android.support.v4.view.t$a */
    /* loaded from: classes.dex */
    static class C0428a implements InterfaceC0432e {
        C0428a() {
        }

        @Override // android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: a */
        public int mo12589a(MotionEvent motionEvent, int i) {
            return i == 0 ? 0 : -1;
        }

        @Override // android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: b */
        public int mo12587b(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        @Override // android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: c */
        public float mo12586c(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return motionEvent.getX();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        @Override // android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: d */
        public float mo12585d(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return motionEvent.getY();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        @Override // android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: a */
        public int mo12590a(MotionEvent motionEvent) {
            return 1;
        }

        @Override // android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: b */
        public int mo12588b(MotionEvent motionEvent) {
            return 0;
        }

        @Override // android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: e */
        public float mo12584e(MotionEvent motionEvent, int i) {
            return 0.0f;
        }
    }

    /* renamed from: android.support.v4.view.t$b */
    /* loaded from: classes.dex */
    static class C0429b extends C0428a {
        C0429b() {
        }

        @Override // android.support.p002v4.view.C0427t.C0428a, android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: a */
        public int mo12589a(MotionEvent motionEvent, int i) {
            return C0433u.m12582a(motionEvent, i);
        }

        @Override // android.support.p002v4.view.C0427t.C0428a, android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: b */
        public int mo12587b(MotionEvent motionEvent, int i) {
            return C0433u.m12581b(motionEvent, i);
        }

        @Override // android.support.p002v4.view.C0427t.C0428a, android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: c */
        public float mo12586c(MotionEvent motionEvent, int i) {
            return C0433u.m12580c(motionEvent, i);
        }

        @Override // android.support.p002v4.view.C0427t.C0428a, android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: d */
        public float mo12585d(MotionEvent motionEvent, int i) {
            return C0433u.m12579d(motionEvent, i);
        }

        @Override // android.support.p002v4.view.C0427t.C0428a, android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: a */
        public int mo12590a(MotionEvent motionEvent) {
            return C0433u.m12583a(motionEvent);
        }
    }

    /* renamed from: android.support.v4.view.t$c */
    /* loaded from: classes.dex */
    static class C0430c extends C0429b {
        C0430c() {
        }

        @Override // android.support.p002v4.view.C0427t.C0428a, android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: b */
        public int mo12588b(MotionEvent motionEvent) {
            return C0434v.m12578a(motionEvent);
        }
    }

    /* renamed from: android.support.v4.view.t$d */
    /* loaded from: classes.dex */
    static class C0431d extends C0430c {
        C0431d() {
        }

        @Override // android.support.p002v4.view.C0427t.C0428a, android.support.p002v4.view.C0427t.InterfaceC0432e
        /* renamed from: e */
        public float mo12584e(MotionEvent motionEvent, int i) {
            return C0435w.m12577a(motionEvent, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 12) {
            f797a = new C0431d();
        } else if (Build.VERSION.SDK_INT >= 9) {
            f797a = new C0430c();
        } else if (Build.VERSION.SDK_INT >= 5) {
            f797a = new C0429b();
        } else {
            f797a = new C0428a();
        }
    }

    /* renamed from: a */
    public static int m12599a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    /* renamed from: b */
    public static int m12597b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    /* renamed from: a */
    public static int m12598a(MotionEvent motionEvent, int i) {
        return f797a.mo12589a(motionEvent, i);
    }

    /* renamed from: b */
    public static int m12596b(MotionEvent motionEvent, int i) {
        return f797a.mo12587b(motionEvent, i);
    }

    /* renamed from: c */
    public static float m12594c(MotionEvent motionEvent, int i) {
        return f797a.mo12586c(motionEvent, i);
    }

    /* renamed from: d */
    public static float m12592d(MotionEvent motionEvent, int i) {
        return f797a.mo12585d(motionEvent, i);
    }

    /* renamed from: c */
    public static int m12595c(MotionEvent motionEvent) {
        return f797a.mo12590a(motionEvent);
    }

    /* renamed from: d */
    public static int m12593d(MotionEvent motionEvent) {
        return f797a.mo12588b(motionEvent);
    }

    /* renamed from: e */
    public static float m12591e(MotionEvent motionEvent, int i) {
        return f797a.mo12584e(motionEvent, i);
    }
}
