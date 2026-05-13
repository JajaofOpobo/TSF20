package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class bb {
    static final g a;
    private WeakReference<View> b;
    private Runnable c = null;
    private Runnable d = null;
    private int e = -1;

    /* loaded from: classes.dex */
    interface g {
        long a(bb bbVar, View view);

        void a(bb bbVar, View view, float f);

        void a(bb bbVar, View view, long j);

        void a(bb bbVar, View view, bf bfVar);

        void a(bb bbVar, View view, bh bhVar);

        void a(bb bbVar, View view, Interpolator interpolator);

        void b(bb bbVar, View view);

        void b(bb bbVar, View view, float f);

        void b(bb bbVar, View view, long j);

        void c(bb bbVar, View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bb(View view) {
        this.b = new WeakReference<>(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements g {
        WeakHashMap<View, Runnable> a = null;

        a() {
        }

        @Override // android.support.v4.view.bb.g
        public void a(bb bbVar, View view, long j) {
        }

        @Override // android.support.v4.view.bb.g
        public void a(bb bbVar, View view, float f) {
            e(bbVar, view);
        }

        @Override // android.support.v4.view.bb.g
        public void b(bb bbVar, View view, float f) {
            e(bbVar, view);
        }

        @Override // android.support.v4.view.bb.g
        public long a(bb bbVar, View view) {
            return 0L;
        }

        @Override // android.support.v4.view.bb.g
        public void a(bb bbVar, View view, Interpolator interpolator) {
        }

        @Override // android.support.v4.view.bb.g
        public void b(bb bbVar, View view, long j) {
        }

        @Override // android.support.v4.view.bb.g
        public void b(bb bbVar, View view) {
            e(bbVar, view);
        }

        @Override // android.support.v4.view.bb.g
        public void c(bb bbVar, View view) {
            a(view);
            d(bbVar, view);
        }

        @Override // android.support.v4.view.bb.g
        public void a(bb bbVar, View view, bf bfVar) {
            view.setTag(2113929216, bfVar);
        }

        @Override // android.support.v4.view.bb.g
        public void a(bb bbVar, View view, bh bhVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(bb bbVar, View view) {
            Object tag = view.getTag(2113929216);
            bf bfVar = tag instanceof bf ? (bf) tag : null;
            Runnable runnable = bbVar.c;
            Runnable runnable2 = bbVar.d;
            bbVar.c = null;
            bbVar.d = null;
            if (runnable != null) {
                runnable.run();
            }
            if (bfVar != null) {
                bfVar.a(view);
                bfVar.b(view);
            }
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.a != null) {
                this.a.remove(view);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v4.view.bb$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0009a implements Runnable {
            WeakReference<View> a;
            bb b;

            private RunnableC0009a(bb bbVar, View view) {
                this.a = new WeakReference<>(view);
                this.b = bbVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                View view = this.a.get();
                if (view != null) {
                    a.this.d(this.b, view);
                }
            }
        }

        private void a(View view) {
            Runnable runnable;
            if (this.a != null && (runnable = this.a.get(view)) != null) {
                view.removeCallbacks(runnable);
            }
        }

        private void e(bb bbVar, View view) {
            Runnable runnable = this.a != null ? this.a.get(view) : null;
            if (runnable == null) {
                runnable = new RunnableC0009a(bbVar, view);
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                this.a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        WeakHashMap<View, Integer> b = null;

        b() {
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void a(bb bbVar, View view, long j) {
            bc.a(view, j);
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void a(bb bbVar, View view, float f) {
            bc.a(view, f);
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void b(bb bbVar, View view, float f) {
            bc.b(view, f);
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public long a(bb bbVar, View view) {
            return bc.a(view);
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void a(bb bbVar, View view, Interpolator interpolator) {
            bc.a(view, interpolator);
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void b(bb bbVar, View view, long j) {
            bc.b(view, j);
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void b(bb bbVar, View view) {
            bc.b(view);
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void c(bb bbVar, View view) {
            bc.c(view);
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void a(bb bbVar, View view, bf bfVar) {
            view.setTag(2113929216, bfVar);
            bc.a(view, new a(bbVar));
        }

        /* loaded from: classes.dex */
        static class a implements bf {
            bb a;
            boolean b;

            a(bb bbVar) {
                this.a = bbVar;
            }

            @Override // android.support.v4.view.bf
            public void a(View view) {
                this.b = false;
                if (this.a.e >= 0) {
                    ai.a(view, 2, (Paint) null);
                }
                if (this.a.c != null) {
                    Runnable runnable = this.a.c;
                    this.a.c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                bf bfVar = tag instanceof bf ? (bf) tag : null;
                if (bfVar != null) {
                    bfVar.a(view);
                }
            }

            @Override // android.support.v4.view.bf
            public void b(View view) {
                if (this.a.e >= 0) {
                    ai.a(view, this.a.e, (Paint) null);
                    this.a.e = -1;
                }
                if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                    if (this.a.d != null) {
                        Runnable runnable = this.a.d;
                        this.a.d = null;
                        runnable.run();
                    }
                    Object tag = view.getTag(2113929216);
                    bf bfVar = tag instanceof bf ? (bf) tag : null;
                    if (bfVar != null) {
                        bfVar.b(view);
                    }
                    this.b = true;
                }
            }

            @Override // android.support.v4.view.bf
            public void c(View view) {
                bf bfVar;
                Object tag = view.getTag(2113929216);
                if (!(tag instanceof bf)) {
                    bfVar = null;
                } else {
                    bfVar = (bf) tag;
                }
                if (bfVar != null) {
                    bfVar.c(view);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class d extends b {
        d() {
        }

        @Override // android.support.v4.view.bb.b, android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void a(bb bbVar, View view, bf bfVar) {
            bd.a(view, bfVar);
        }
    }

    /* loaded from: classes.dex */
    static class c extends d {
        c() {
        }
    }

    /* loaded from: classes.dex */
    static class e extends c {
        e() {
        }

        @Override // android.support.v4.view.bb.a, android.support.v4.view.bb.g
        public void a(bb bbVar, View view, bh bhVar) {
            be.a(view, bhVar);
        }
    }

    /* loaded from: classes.dex */
    static class f extends e {
        f() {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a = new f();
        } else if (i >= 19) {
            a = new e();
        } else if (i >= 18) {
            a = new c();
        } else if (i >= 16) {
            a = new d();
        } else if (i >= 14) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public bb a(long j) {
        View view = this.b.get();
        if (view != null) {
            a.a(this, view, j);
        }
        return this;
    }

    public bb a(float f2) {
        View view = this.b.get();
        if (view != null) {
            a.a(this, view, f2);
        }
        return this;
    }

    public bb b(float f2) {
        View view = this.b.get();
        if (view != null) {
            a.b(this, view, f2);
        }
        return this;
    }

    public long a() {
        View view = this.b.get();
        if (view != null) {
            return a.a(this, view);
        }
        return 0L;
    }

    public bb a(Interpolator interpolator) {
        View view = this.b.get();
        if (view != null) {
            a.a(this, view, interpolator);
        }
        return this;
    }

    public bb b(long j) {
        View view = this.b.get();
        if (view != null) {
            a.b(this, view, j);
        }
        return this;
    }

    public void b() {
        View view = this.b.get();
        if (view != null) {
            a.b(this, view);
        }
    }

    public void c() {
        View view = this.b.get();
        if (view != null) {
            a.c(this, view);
        }
    }

    public bb a(bf bfVar) {
        View view = this.b.get();
        if (view != null) {
            a.a(this, view, bfVar);
        }
        return this;
    }

    public bb a(bh bhVar) {
        View view = this.b.get();
        if (view != null) {
            a.a(this, view, bhVar);
        }
        return this;
    }
}
