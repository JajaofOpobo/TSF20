package android.support.p002v4.view;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* renamed from: android.support.v4.view.bb */
/* loaded from: classes.dex */
public final class C0363bb {

    /* renamed from: a */
    static final InterfaceC0373g f766a;

    /* renamed from: b */
    private WeakReference<View> f767b;

    /* renamed from: c */
    private Runnable f768c = null;

    /* renamed from: d */
    private Runnable f769d = null;

    /* renamed from: e */
    private int f770e = -1;

    /* renamed from: android.support.v4.view.bb$g */
    /* loaded from: classes.dex */
    interface InterfaceC0373g {
        /* renamed from: a */
        long mo12691a(C0363bb c0363bb, View view);

        /* renamed from: a */
        void mo12690a(C0363bb c0363bb, View view, float f);

        /* renamed from: a */
        void mo12689a(C0363bb c0363bb, View view, long j);

        /* renamed from: a */
        void mo12688a(C0363bb c0363bb, View view, InterfaceC0380bf interfaceC0380bf);

        /* renamed from: a */
        void mo12687a(C0363bb c0363bb, View view, InterfaceC0382bh interfaceC0382bh);

        /* renamed from: a */
        void mo12686a(C0363bb c0363bb, View view, Interpolator interpolator);

        /* renamed from: b */
        void mo12685b(C0363bb c0363bb, View view);

        /* renamed from: b */
        void mo12684b(C0363bb c0363bb, View view, float f);

        /* renamed from: b */
        void mo12683b(C0363bb c0363bb, View view, long j);

        /* renamed from: c */
        void mo12682c(C0363bb c0363bb, View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0363bb(View view) {
        this.f767b = new WeakReference<>(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.bb$a */
    /* loaded from: classes.dex */
    public static class C0365a implements InterfaceC0373g {

        /* renamed from: a */
        WeakHashMap<View, Runnable> f771a = null;

        C0365a() {
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12689a(C0363bb c0363bb, View view, long j) {
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12690a(C0363bb c0363bb, View view, float f) {
            m12692e(c0363bb, view);
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: b */
        public void mo12684b(C0363bb c0363bb, View view, float f) {
            m12692e(c0363bb, view);
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public long mo12691a(C0363bb c0363bb, View view) {
            return 0L;
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12686a(C0363bb c0363bb, View view, Interpolator interpolator) {
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: b */
        public void mo12683b(C0363bb c0363bb, View view, long j) {
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: b */
        public void mo12685b(C0363bb c0363bb, View view) {
            m12692e(c0363bb, view);
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: c */
        public void mo12682c(C0363bb c0363bb, View view) {
            m12694a(view);
            m12693d(c0363bb, view);
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12688a(C0363bb c0363bb, View view, InterfaceC0380bf interfaceC0380bf) {
            view.setTag(2113929216, interfaceC0380bf);
        }

        @Override // android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12687a(C0363bb c0363bb, View view, InterfaceC0382bh interfaceC0382bh) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m12693d(C0363bb c0363bb, View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC0380bf interfaceC0380bf = tag instanceof InterfaceC0380bf ? (InterfaceC0380bf) tag : null;
            Runnable runnable = c0363bb.f768c;
            Runnable runnable2 = c0363bb.f769d;
            c0363bb.f768c = null;
            c0363bb.f769d = null;
            if (runnable != null) {
                runnable.run();
            }
            if (interfaceC0380bf != null) {
                interfaceC0380bf.mo11265a(view);
                interfaceC0380bf.mo11264b(view);
            }
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.f771a != null) {
                this.f771a.remove(view);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v4.view.bb$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0366a implements Runnable {

            /* renamed from: a */
            WeakReference<View> f772a;

            /* renamed from: b */
            C0363bb f773b;

            private RunnableC0366a(C0363bb c0363bb, View view) {
                this.f772a = new WeakReference<>(view);
                this.f773b = c0363bb;
            }

            @Override // java.lang.Runnable
            public void run() {
                View view = this.f772a.get();
                if (view != null) {
                    C0365a.this.m12693d(this.f773b, view);
                }
            }
        }

        /* renamed from: a */
        private void m12694a(View view) {
            Runnable runnable;
            if (this.f771a != null && (runnable = this.f771a.get(view)) != null) {
                view.removeCallbacks(runnable);
            }
        }

        /* renamed from: e */
        private void m12692e(C0363bb c0363bb, View view) {
            Runnable runnable = this.f771a != null ? this.f771a.get(view) : null;
            if (runnable == null) {
                runnable = new RunnableC0366a(c0363bb, view);
                if (this.f771a == null) {
                    this.f771a = new WeakHashMap<>();
                }
                this.f771a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }
    }

    /* renamed from: android.support.v4.view.bb$b */
    /* loaded from: classes.dex */
    static class C0367b extends C0365a {

        /* renamed from: b */
        WeakHashMap<View, Integer> f775b = null;

        C0367b() {
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12689a(C0363bb c0363bb, View view, long j) {
            C0374bc.m12679a(view, j);
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12690a(C0363bb c0363bb, View view, float f) {
            C0374bc.m12680a(view, f);
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: b */
        public void mo12684b(C0363bb c0363bb, View view, float f) {
            C0374bc.m12675b(view, f);
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public long mo12691a(C0363bb c0363bb, View view) {
            return C0374bc.m12681a(view);
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12686a(C0363bb c0363bb, View view, Interpolator interpolator) {
            C0374bc.m12677a(view, interpolator);
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: b */
        public void mo12683b(C0363bb c0363bb, View view, long j) {
            C0374bc.m12674b(view, j);
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: b */
        public void mo12685b(C0363bb c0363bb, View view) {
            C0374bc.m12676b(view);
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: c */
        public void mo12682c(C0363bb c0363bb, View view) {
            C0374bc.m12673c(view);
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12688a(C0363bb c0363bb, View view, InterfaceC0380bf interfaceC0380bf) {
            view.setTag(2113929216, interfaceC0380bf);
            C0374bc.m12678a(view, new C0368a(c0363bb));
        }

        /* renamed from: android.support.v4.view.bb$b$a */
        /* loaded from: classes.dex */
        static class C0368a implements InterfaceC0380bf {

            /* renamed from: a */
            C0363bb f776a;

            /* renamed from: b */
            boolean f777b;

            C0368a(C0363bb c0363bb) {
                this.f776a = c0363bb;
            }

            @Override // android.support.p002v4.view.InterfaceC0380bf
            /* renamed from: a */
            public void mo11265a(View view) {
                this.f777b = false;
                if (this.f776a.f770e >= 0) {
                    C0309ai.m12926a(view, 2, (Paint) null);
                }
                if (this.f776a.f768c != null) {
                    Runnable runnable = this.f776a.f768c;
                    this.f776a.f768c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC0380bf interfaceC0380bf = tag instanceof InterfaceC0380bf ? (InterfaceC0380bf) tag : null;
                if (interfaceC0380bf != null) {
                    interfaceC0380bf.mo11265a(view);
                }
            }

            @Override // android.support.p002v4.view.InterfaceC0380bf
            /* renamed from: b */
            public void mo11264b(View view) {
                if (this.f776a.f770e >= 0) {
                    C0309ai.m12926a(view, this.f776a.f770e, (Paint) null);
                    this.f776a.f770e = -1;
                }
                if (Build.VERSION.SDK_INT >= 16 || !this.f777b) {
                    if (this.f776a.f769d != null) {
                        Runnable runnable = this.f776a.f769d;
                        this.f776a.f769d = null;
                        runnable.run();
                    }
                    Object tag = view.getTag(2113929216);
                    InterfaceC0380bf interfaceC0380bf = tag instanceof InterfaceC0380bf ? (InterfaceC0380bf) tag : null;
                    if (interfaceC0380bf != null) {
                        interfaceC0380bf.mo11264b(view);
                    }
                    this.f777b = true;
                }
            }

            @Override // android.support.p002v4.view.InterfaceC0380bf
            /* renamed from: c */
            public void mo11263c(View view) {
                InterfaceC0380bf interfaceC0380bf;
                Object tag = view.getTag(2113929216);
                if (!(tag instanceof InterfaceC0380bf)) {
                    interfaceC0380bf = null;
                } else {
                    interfaceC0380bf = (InterfaceC0380bf) tag;
                }
                if (interfaceC0380bf != null) {
                    interfaceC0380bf.mo11263c(view);
                }
            }
        }
    }

    /* renamed from: android.support.v4.view.bb$d */
    /* loaded from: classes.dex */
    static class C0370d extends C0367b {
        C0370d() {
        }

        @Override // android.support.p002v4.view.C0363bb.C0367b, android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12688a(C0363bb c0363bb, View view, InterfaceC0380bf interfaceC0380bf) {
            C0376bd.m12672a(view, interfaceC0380bf);
        }
    }

    /* renamed from: android.support.v4.view.bb$c */
    /* loaded from: classes.dex */
    static class C0369c extends C0370d {
        C0369c() {
        }
    }

    /* renamed from: android.support.v4.view.bb$e */
    /* loaded from: classes.dex */
    static class C0371e extends C0369c {
        C0371e() {
        }

        @Override // android.support.p002v4.view.C0363bb.C0365a, android.support.p002v4.view.C0363bb.InterfaceC0373g
        /* renamed from: a */
        public void mo12687a(C0363bb c0363bb, View view, InterfaceC0382bh interfaceC0382bh) {
            C0378be.m12671a(view, interfaceC0382bh);
        }
    }

    /* renamed from: android.support.v4.view.bb$f */
    /* loaded from: classes.dex */
    static class C0372f extends C0371e {
        C0372f() {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f766a = new C0372f();
        } else if (i >= 19) {
            f766a = new C0371e();
        } else if (i >= 18) {
            f766a = new C0369c();
        } else if (i >= 16) {
            f766a = new C0370d();
        } else if (i >= 14) {
            f766a = new C0367b();
        } else {
            f766a = new C0365a();
        }
    }

    /* renamed from: a */
    public C0363bb m12709a(long j) {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12689a(this, view, j);
        }
        return this;
    }

    /* renamed from: a */
    public C0363bb m12710a(float f) {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12690a(this, view, f);
        }
        return this;
    }

    /* renamed from: b */
    public C0363bb m12701b(float f) {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12684b(this, view, f);
        }
        return this;
    }

    /* renamed from: a */
    public long m12711a() {
        View view = this.f767b.get();
        if (view != null) {
            return f766a.mo12691a(this, view);
        }
        return 0L;
    }

    /* renamed from: a */
    public C0363bb m12703a(Interpolator interpolator) {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12686a(this, view, interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0363bb m12700b(long j) {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12683b(this, view, j);
        }
        return this;
    }

    /* renamed from: b */
    public void m12702b() {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12685b(this, view);
        }
    }

    /* renamed from: c */
    public void m12697c() {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12682c(this, view);
        }
    }

    /* renamed from: a */
    public C0363bb m12705a(InterfaceC0380bf interfaceC0380bf) {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12688a(this, view, interfaceC0380bf);
        }
        return this;
    }

    /* renamed from: a */
    public C0363bb m12704a(InterfaceC0382bh interfaceC0382bh) {
        View view = this.f767b.get();
        if (view != null) {
            f766a.mo12687a(this, view, interfaceC0382bh);
        }
        return this;
    }
}
