package android.support.p002v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0427t;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* renamed from: android.support.v4.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0472a implements View.OnTouchListener {

    /* renamed from: r */
    private static final int f980r = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    private final View f983c;

    /* renamed from: d */
    private Runnable f984d;

    /* renamed from: g */
    private int f987g;

    /* renamed from: h */
    private int f988h;

    /* renamed from: l */
    private boolean f992l;

    /* renamed from: m */
    private boolean f993m;

    /* renamed from: n */
    private boolean f994n;

    /* renamed from: o */
    private boolean f995o;

    /* renamed from: p */
    private boolean f996p;

    /* renamed from: q */
    private boolean f997q;

    /* renamed from: a */
    private final C0474a f981a = new C0474a();

    /* renamed from: b */
    private final Interpolator f982b = new AccelerateInterpolator();

    /* renamed from: e */
    private float[] f985e = {0.0f, 0.0f};

    /* renamed from: f */
    private float[] f986f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i */
    private float[] f989i = {0.0f, 0.0f};

    /* renamed from: j */
    private float[] f990j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f991k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: a */
    public abstract void mo12233a(int i, int i2);

    /* renamed from: e */
    public abstract boolean mo12232e(int i);

    /* renamed from: f */
    public abstract boolean mo12231f(int i);

    public AbstractView$OnTouchListenerC0472a(View view) {
        this.f983c = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        m12385a(i, i);
        m12375b(i2, i2);
        m12382a(1);
        m12360e(Float.MAX_VALUE, Float.MAX_VALUE);
        m12363d(0.2f, 0.2f);
        m12368c(1.0f, 1.0f);
        m12373b(f980r);
        m12367c(500);
        m12362d(500);
    }

    /* renamed from: a */
    public AbstractView$OnTouchListenerC0472a m12377a(boolean z) {
        if (this.f996p && !z) {
            m12369c();
        }
        this.f996p = z;
        return this;
    }

    /* renamed from: a */
    public AbstractView$OnTouchListenerC0472a m12385a(float f, float f2) {
        this.f991k[0] = f / 1000.0f;
        this.f991k[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public AbstractView$OnTouchListenerC0472a m12375b(float f, float f2) {
        this.f990j[0] = f / 1000.0f;
        this.f990j[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public AbstractView$OnTouchListenerC0472a m12368c(float f, float f2) {
        this.f989i[0] = f / 1000.0f;
        this.f989i[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public AbstractView$OnTouchListenerC0472a m12382a(int i) {
        this.f987g = i;
        return this;
    }

    /* renamed from: d */
    public AbstractView$OnTouchListenerC0472a m12363d(float f, float f2) {
        this.f985e[0] = f;
        this.f985e[1] = f2;
        return this;
    }

    /* renamed from: e */
    public AbstractView$OnTouchListenerC0472a m12360e(float f, float f2) {
        this.f986f[0] = f;
        this.f986f[1] = f2;
        return this;
    }

    /* renamed from: b */
    public AbstractView$OnTouchListenerC0472a m12373b(int i) {
        this.f988h = i;
        return this;
    }

    /* renamed from: c */
    public AbstractView$OnTouchListenerC0472a m12367c(int i) {
        this.f981a.m12352a(i);
        return this;
    }

    /* renamed from: d */
    public AbstractView$OnTouchListenerC0472a m12362d(int i) {
        this.f981a.m12349b(i);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (this.f996p) {
            switch (C0427t.m12599a(motionEvent)) {
                case 0:
                    this.f994n = true;
                    this.f992l = false;
                    this.f981a.m12353a(m12381a(0, motionEvent.getX(), view.getWidth(), this.f983c.getWidth()), m12381a(1, motionEvent.getY(), view.getHeight(), this.f983c.getHeight()));
                    if (!this.f995o && m12386a()) {
                        m12376b();
                        break;
                    }
                    break;
                case 1:
                case 3:
                    m12369c();
                    break;
                case 2:
                    this.f981a.m12353a(m12381a(0, motionEvent.getX(), view.getWidth(), this.f983c.getWidth()), m12381a(1, motionEvent.getY(), view.getHeight(), this.f983c.getHeight()));
                    if (!this.f995o) {
                        m12376b();
                        break;
                    }
                    break;
            }
            if (!this.f997q || !this.f995o) {
                z = false;
            }
            return z;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12386a() {
        C0474a c0474a = this.f981a;
        int m12345f = c0474a.m12345f();
        int m12346e = c0474a.m12346e();
        return (m12345f != 0 && mo12231f(m12345f)) || (m12346e != 0 && mo12232e(m12346e));
    }

    /* renamed from: b */
    private void m12376b() {
        if (this.f984d == null) {
            this.f984d = new RunnableC0475b();
        }
        this.f995o = true;
        this.f993m = true;
        if (!this.f992l && this.f988h > 0) {
            C0309ai.m12918a(this.f983c, this.f984d, this.f988h);
        } else {
            this.f984d.run();
        }
        this.f992l = true;
    }

    /* renamed from: c */
    private void m12369c() {
        if (this.f993m) {
            this.f995o = false;
        } else {
            this.f981a.m12350b();
        }
    }

    /* renamed from: a */
    private float m12381a(int i, float f, float f2, float f3) {
        float m12383a = m12383a(this.f985e[i], f2, this.f986f[i], f);
        if (m12383a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f989i[i];
        float f5 = this.f990j[i];
        float f6 = this.f991k[i];
        float f7 = f4 * f3;
        if (m12383a > 0.0f) {
            return m12374b(m12383a * f7, f5, f6);
        }
        return -m12374b((-m12383a) * f7, f5, f6);
    }

    /* renamed from: a */
    private float m12383a(float f, float f2, float f3, float f4) {
        float interpolation;
        float m12374b = m12374b(f * f2, 0.0f, f3);
        float m12358f = m12358f(f2 - f4, m12374b) - m12358f(f4, m12374b);
        if (m12358f < 0.0f) {
            interpolation = -this.f982b.getInterpolation(-m12358f);
        } else if (m12358f <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f982b.getInterpolation(m12358f);
        }
        return m12374b(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: f */
    private float m12358f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f987g) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    return (this.f995o && this.f987g == 1) ? 1.0f : 0.0f;
                }
                return 0.0f;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m12372b(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static float m12374b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m12364d() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f983c.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$b */
    /* loaded from: classes.dex */
    public class RunnableC0475b implements Runnable {
        private RunnableC0475b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractView$OnTouchListenerC0472a.this.f995o) {
                if (AbstractView$OnTouchListenerC0472a.this.f993m) {
                    AbstractView$OnTouchListenerC0472a.this.f993m = false;
                    AbstractView$OnTouchListenerC0472a.this.f981a.m12355a();
                }
                C0474a c0474a = AbstractView$OnTouchListenerC0472a.this.f981a;
                if (c0474a.m12348c() || !AbstractView$OnTouchListenerC0472a.this.m12386a()) {
                    AbstractView$OnTouchListenerC0472a.this.f995o = false;
                    return;
                }
                if (AbstractView$OnTouchListenerC0472a.this.f994n) {
                    AbstractView$OnTouchListenerC0472a.this.f994n = false;
                    AbstractView$OnTouchListenerC0472a.this.m12364d();
                }
                c0474a.m12347d();
                AbstractView$OnTouchListenerC0472a.this.mo12233a(c0474a.m12344g(), c0474a.m12343h());
                C0309ai.m12919a(AbstractView$OnTouchListenerC0472a.this.f983c, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$a */
    /* loaded from: classes.dex */
    public static class C0474a {

        /* renamed from: a */
        private int f998a;

        /* renamed from: b */
        private int f999b;

        /* renamed from: c */
        private float f1000c;

        /* renamed from: d */
        private float f1001d;

        /* renamed from: j */
        private float f1007j;

        /* renamed from: k */
        private int f1008k;

        /* renamed from: e */
        private long f1002e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f1006i = -1;

        /* renamed from: f */
        private long f1003f = 0;

        /* renamed from: g */
        private int f1004g = 0;

        /* renamed from: h */
        private int f1005h = 0;

        /* renamed from: a */
        public void m12352a(int i) {
            this.f998a = i;
        }

        /* renamed from: b */
        public void m12349b(int i) {
            this.f999b = i;
        }

        /* renamed from: a */
        public void m12355a() {
            this.f1002e = AnimationUtils.currentAnimationTimeMillis();
            this.f1006i = -1L;
            this.f1003f = this.f1002e;
            this.f1007j = 0.5f;
            this.f1004g = 0;
            this.f1005h = 0;
        }

        /* renamed from: b */
        public void m12350b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1008k = AbstractView$OnTouchListenerC0472a.m12372b((int) (currentAnimationTimeMillis - this.f1002e), 0, this.f999b);
            this.f1007j = m12351a(currentAnimationTimeMillis);
            this.f1006i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public boolean m12348c() {
            return this.f1006i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1006i + ((long) this.f1008k);
        }

        /* renamed from: a */
        private float m12351a(long j) {
            if (j < this.f1002e) {
                return 0.0f;
            }
            if (this.f1006i >= 0 && j >= this.f1006i) {
                return (AbstractView$OnTouchListenerC0472a.m12374b(((float) (j - this.f1006i)) / this.f1008k, 0.0f, 1.0f) * this.f1007j) + (1.0f - this.f1007j);
            }
            return AbstractView$OnTouchListenerC0472a.m12374b(((float) (j - this.f1002e)) / this.f998a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: a */
        private float m12354a(float f) {
            return ((-4.0f) * f * f) + (4.0f * f);
        }

        /* renamed from: d */
        public void m12347d() {
            if (this.f1003f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m12354a = m12354a(m12351a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f1003f;
            this.f1003f = currentAnimationTimeMillis;
            this.f1004g = (int) (((float) j) * m12354a * this.f1000c);
            this.f1005h = (int) (((float) j) * m12354a * this.f1001d);
        }

        /* renamed from: a */
        public void m12353a(float f, float f2) {
            this.f1000c = f;
            this.f1001d = f2;
        }

        /* renamed from: e */
        public int m12346e() {
            return (int) (this.f1000c / Math.abs(this.f1000c));
        }

        /* renamed from: f */
        public int m12345f() {
            return (int) (this.f1001d / Math.abs(this.f1001d));
        }

        /* renamed from: g */
        public int m12344g() {
            return this.f1004g;
        }

        /* renamed from: h */
        public int m12343h() {
            return this.f1005h;
        }
    }
}
