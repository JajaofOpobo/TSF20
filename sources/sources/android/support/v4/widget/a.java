package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.ai;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();
    private final View c;
    private Runnable d;
    private int g;
    private int h;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private final C0010a a = new C0010a();
    private final Interpolator b = new AccelerateInterpolator();
    private float[] e = {0.0f, 0.0f};
    private float[] f = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] i = {0.0f, 0.0f};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {Float.MAX_VALUE, Float.MAX_VALUE};

    public abstract void a(int i, int i2);

    public abstract boolean e(int i);

    public abstract boolean f(int i);

    public a(View view) {
        this.c = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        a(i, i);
        b(i2, i2);
        a(1);
        e(Float.MAX_VALUE, Float.MAX_VALUE);
        d(0.2f, 0.2f);
        c(1.0f, 1.0f);
        b(r);
        c(500);
        d(500);
    }

    public a a(boolean z) {
        if (this.p && !z) {
            c();
        }
        this.p = z;
        return this;
    }

    public a a(float f, float f2) {
        this.k[0] = f / 1000.0f;
        this.k[1] = f2 / 1000.0f;
        return this;
    }

    public a b(float f, float f2) {
        this.j[0] = f / 1000.0f;
        this.j[1] = f2 / 1000.0f;
        return this;
    }

    public a c(float f, float f2) {
        this.i[0] = f / 1000.0f;
        this.i[1] = f2 / 1000.0f;
        return this;
    }

    public a a(int i) {
        this.g = i;
        return this;
    }

    public a d(float f, float f2) {
        this.e[0] = f;
        this.e[1] = f2;
        return this;
    }

    public a e(float f, float f2) {
        this.f[0] = f;
        this.f[1] = f2;
        return this;
    }

    public a b(int i) {
        this.h = i;
        return this;
    }

    public a c(int i) {
        this.a.a(i);
        return this;
    }

    public a d(int i) {
        this.a.b(i);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.p) {
            return false;
        }
        switch (android.support.v4.view.t.a(motionEvent)) {
            case 0:
                this.n = true;
                this.l = false;
                this.a.a(a(0, motionEvent.getX(), view.getWidth(), this.c.getWidth()), a(1, motionEvent.getY(), view.getHeight(), this.c.getHeight()));
                if (!this.o && a()) {
                    b();
                }
                break;
            case 1:
            case 3:
                c();
                break;
            case 2:
                this.a.a(a(0, motionEvent.getX(), view.getWidth(), this.c.getWidth()), a(1, motionEvent.getY(), view.getHeight(), this.c.getHeight()));
                if (!this.o) {
                    b();
                }
                break;
        }
        return this.q && this.o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        C0010a c0010a = this.a;
        int iF = c0010a.f();
        int iE = c0010a.e();
        return (iF != 0 && f(iF)) || (iE != 0 && e(iE));
    }

    private void b() {
        if (this.d == null) {
            this.d = new b();
        }
        this.o = true;
        this.m = true;
        if (!this.l && this.h > 0) {
            ai.a(this.c, this.d, this.h);
        } else {
            this.d.run();
        }
        this.l = true;
    }

    private void c() {
        if (this.m) {
            this.o = false;
        } else {
            this.a.b();
        }
    }

    private float a(int i, float f, float f2, float f3) {
        float fA = a(this.e[i], f2, this.f[i], f);
        if (fA == 0.0f) {
            return 0.0f;
        }
        float f4 = this.i[i];
        float f5 = this.j[i];
        float f6 = this.k[i];
        float f7 = f4 * f3;
        if (fA > 0.0f) {
            return b(fA * f7, f5, f6);
        }
        return -b((-fA) * f7, f5, f6);
    }

    private float a(float f, float f2, float f3, float f4) {
        float interpolation;
        float fB = b(f * f2, 0.0f, f3);
        float f5 = f(f2 - f4, fB) - f(f4, fB);
        if (f5 < 0.0f) {
            interpolation = -this.b.getInterpolation(-f5);
        } else {
            if (f5 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.b.getInterpolation(f5);
        }
        return b(interpolation, -1.0f, 1.0f);
    }

    private float f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.g) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        break;
                    } else if (this.o && this.g == 1) {
                        break;
                    }
                }
                break;
            case 2:
                if (f < 0.0f) {
                }
                break;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.o) {
                if (a.this.m) {
                    a.this.m = false;
                    a.this.a.a();
                }
                C0010a c0010a = a.this.a;
                if (c0010a.c() || !a.this.a()) {
                    a.this.o = false;
                    return;
                }
                if (a.this.n) {
                    a.this.n = false;
                    a.this.d();
                }
                c0010a.d();
                a.this.a(c0010a.g(), c0010a.h());
                ai.a(a.this.c, this);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.a$a, reason: collision with other inner class name */
    private static class C0010a {
        private int a;
        private int b;
        private float c;
        private float d;
        private float j;
        private int k;
        private long e = Long.MIN_VALUE;
        private long i = -1;
        private long f = 0;
        private int g = 0;
        private int h = 0;

        public void a(int i) {
            this.a = i;
        }

        public void b(int i) {
            this.b = i;
        }

        public void a() {
            this.e = AnimationUtils.currentAnimationTimeMillis();
            this.i = -1L;
            this.f = this.e;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }

        public void b() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.b((int) (jCurrentAnimationTimeMillis - this.e), 0, this.b);
            this.j = a(jCurrentAnimationTimeMillis);
            this.i = jCurrentAnimationTimeMillis;
        }

        public boolean c() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        private float a(long j) {
            if (j < this.e) {
                return 0.0f;
            }
            if (this.i < 0 || j < this.i) {
                return a.b((j - this.e) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            return (a.b((j - this.i) / this.k, 0.0f, 1.0f) * this.j) + (1.0f - this.j);
        }

        private float a(float f) {
            return ((-4.0f) * f * f) + (4.0f * f);
        }

        public void d() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fA = a(a(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f;
            this.f = jCurrentAnimationTimeMillis;
            this.g = (int) (j * fA * this.c);
            this.h = (int) (j * fA * this.d);
        }

        public void a(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public int e() {
            return (int) (this.c / Math.abs(this.c));
        }

        public int f() {
            return (int) (this.d / Math.abs(this.d));
        }

        public int g() {
            return this.g;
        }

        public int h() {
            return this.h;
        }
    }
}
