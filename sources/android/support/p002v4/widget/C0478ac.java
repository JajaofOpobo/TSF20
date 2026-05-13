package android.support.p002v4.widget;

import android.content.Context;
import android.support.p002v4.view.C0304ag;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0427t;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;
/* renamed from: android.support.v4.widget.ac */
/* loaded from: classes.dex */
public class C0478ac {

    /* renamed from: v */
    private static final Interpolator f1010v = new Interpolator() { // from class: android.support.v4.widget.ac.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    private int f1011a;

    /* renamed from: b */
    private int f1012b;

    /* renamed from: d */
    private float[] f1014d;

    /* renamed from: e */
    private float[] f1015e;

    /* renamed from: f */
    private float[] f1016f;

    /* renamed from: g */
    private float[] f1017g;

    /* renamed from: h */
    private int[] f1018h;

    /* renamed from: i */
    private int[] f1019i;

    /* renamed from: j */
    private int[] f1020j;

    /* renamed from: k */
    private int f1021k;

    /* renamed from: l */
    private VelocityTracker f1022l;

    /* renamed from: m */
    private float f1023m;

    /* renamed from: n */
    private float f1024n;

    /* renamed from: o */
    private int f1025o;

    /* renamed from: p */
    private int f1026p;

    /* renamed from: q */
    private C0529y f1027q;

    /* renamed from: r */
    private final AbstractC0481a f1028r;

    /* renamed from: s */
    private View f1029s;

    /* renamed from: t */
    private boolean f1030t;

    /* renamed from: u */
    private final ViewGroup f1031u;

    /* renamed from: c */
    private int f1013c = -1;

    /* renamed from: w */
    private final Runnable f1032w = new Runnable() { // from class: android.support.v4.widget.ac.2
        @Override // java.lang.Runnable
        public void run() {
            C0478ac.this.m12312c(0);
        }
    };

    /* renamed from: android.support.v4.widget.ac$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0481a {
        /* renamed from: a */
        public abstract boolean mo12294a(View view, int i);

        /* renamed from: a */
        public void mo12298a(int i) {
        }

        /* renamed from: a */
        public void mo12292a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: b */
        public void mo12288b(View view, int i) {
        }

        /* renamed from: a */
        public void mo12295a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo12297a(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo12291b(int i) {
            return false;
        }

        /* renamed from: b */
        public void mo12290b(int i, int i2) {
        }

        /* renamed from: c */
        public int m12286c(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo12296a(View view) {
            return 0;
        }

        /* renamed from: b */
        public int m12289b(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo12293a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public int mo12287b(View view, int i, int i2) {
            return 0;
        }
    }

    /* renamed from: a */
    public static C0478ac m12325a(ViewGroup viewGroup, AbstractC0481a abstractC0481a) {
        return new C0478ac(viewGroup.getContext(), viewGroup, abstractC0481a);
    }

    /* renamed from: a */
    public static C0478ac m12326a(ViewGroup viewGroup, float f, AbstractC0481a abstractC0481a) {
        C0478ac m12325a = m12325a(viewGroup, abstractC0481a);
        m12325a.f1012b = (int) (m12325a.f1012b * (1.0f / f));
        return m12325a;
    }

    private C0478ac(Context context, ViewGroup viewGroup, AbstractC0481a abstractC0481a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0481a == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1031u = viewGroup;
        this.f1028r = abstractC0481a;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1025o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1012b = viewConfiguration.getScaledTouchSlop();
        this.f1023m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1024n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1027q = C0529y.m12156a(context, f1010v);
    }

    /* renamed from: a */
    public void m12340a(float f) {
        this.f1024n = f;
    }

    /* renamed from: a */
    public int m12341a() {
        return this.f1011a;
    }

    /* renamed from: a */
    public void m12335a(int i) {
        this.f1026p = i;
    }

    /* renamed from: b */
    public int m12323b() {
        return this.f1025o;
    }

    /* renamed from: a */
    public void m12329a(View view, int i) {
        if (view.getParent() != this.f1031u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1031u + ")");
        }
        this.f1029s = view;
        this.f1013c = i;
        this.f1028r.mo12288b(view, i);
        m12312c(1);
    }

    /* renamed from: c */
    public View m12313c() {
        return this.f1029s;
    }

    /* renamed from: d */
    public int m12309d() {
        return this.f1012b;
    }

    /* renamed from: e */
    public void m12306e() {
        this.f1013c = -1;
        m12301g();
        if (this.f1022l != null) {
            this.f1022l.recycle();
            this.f1022l = null;
        }
    }

    /* renamed from: f */
    public void m12303f() {
        m12306e();
        if (this.f1011a == 2) {
            int m12155b = this.f1027q.m12155b();
            int m12154c = this.f1027q.m12154c();
            this.f1027q.m12149h();
            int m12155b2 = this.f1027q.m12155b();
            int m12154c2 = this.f1027q.m12154c();
            this.f1028r.mo12292a(this.f1029s, m12155b2, m12154c2, m12155b2 - m12155b, m12154c2 - m12154c);
        }
        m12312c(0);
    }

    /* renamed from: a */
    public boolean m12328a(View view, int i, int i2) {
        this.f1029s = view;
        this.f1013c = -1;
        boolean m12332a = m12332a(i, i2, 0, 0);
        if (!m12332a && this.f1011a == 0 && this.f1029s != null) {
            this.f1029s = null;
        }
        return m12332a;
    }

    /* renamed from: a */
    public boolean m12334a(int i, int i2) {
        if (!this.f1030t) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return m12332a(i, i2, (int) C0304ag.m12938a(this.f1022l, this.f1013c), (int) C0304ag.m12937b(this.f1022l, this.f1013c));
    }

    /* renamed from: a */
    private boolean m12332a(int i, int i2, int i3, int i4) {
        int left = this.f1029s.getLeft();
        int top = this.f1029s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1027q.m12149h();
            m12312c(0);
            return false;
        }
        this.f1027q.m12161a(left, top, i5, i6, m12327a(this.f1029s, i5, i6, i3, i4));
        m12312c(2);
        return true;
    }

    /* renamed from: a */
    private int m12327a(View view, int i, int i2, int i3, int i4) {
        int m12318b = m12318b(i3, (int) this.f1024n, (int) this.f1023m);
        int m12318b2 = m12318b(i4, (int) this.f1024n, (int) this.f1023m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m12318b);
        int abs4 = Math.abs(m12318b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        float f = m12318b != 0 ? abs3 / i5 : abs / i6;
        return (int) (((m12318b2 != 0 ? abs4 / i5 : abs2 / i6) * m12333a(i2, m12318b2, this.f1028r.m12289b(view))) + (f * m12333a(i, m12318b, this.f1028r.mo12296a(view))));
    }

    /* renamed from: a */
    private int m12333a(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f1031u.getWidth();
        int i4 = width / 2;
        float m12322b = (m12322b(Math.min(1.0f, Math.abs(i) / width)) * i4) + i4;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m12322b / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: b */
    private int m12318b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    /* renamed from: a */
    private float m12338a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    /* renamed from: b */
    private float m12322b(float f) {
        return (float) Math.sin((float) ((f - 0.5f) * 0.4712389167638204d));
    }

    /* renamed from: a */
    public boolean m12324a(boolean z) {
        boolean z2;
        if (this.f1011a == 2) {
            boolean m12150g = this.f1027q.m12150g();
            int m12155b = this.f1027q.m12155b();
            int m12154c = this.f1027q.m12154c();
            int left = m12155b - this.f1029s.getLeft();
            int top = m12154c - this.f1029s.getTop();
            if (left != 0) {
                C0309ai.m12902e(this.f1029s, left);
            }
            if (top != 0) {
                C0309ai.m12905d(this.f1029s, top);
            }
            if (left != 0 || top != 0) {
                this.f1028r.mo12292a(this.f1029s, m12155b, m12154c, left, top);
            }
            if (m12150g && m12155b == this.f1027q.m12153d() && m12154c == this.f1027q.m12152e()) {
                this.f1027q.m12149h();
                z2 = false;
            } else {
                z2 = m12150g;
            }
            if (!z2) {
                if (z) {
                    this.f1031u.post(this.f1032w);
                } else {
                    m12312c(0);
                }
            }
        }
        return this.f1011a == 2;
    }

    /* renamed from: a */
    private void m12339a(float f, float f2) {
        this.f1030t = true;
        this.f1028r.mo12295a(this.f1029s, f, f2);
        this.f1030t = false;
        if (this.f1011a == 1) {
            m12312c(0);
        }
    }

    /* renamed from: g */
    private void m12301g() {
        if (this.f1014d != null) {
            Arrays.fill(this.f1014d, 0.0f);
            Arrays.fill(this.f1015e, 0.0f);
            Arrays.fill(this.f1016f, 0.0f);
            Arrays.fill(this.f1017g, 0.0f);
            Arrays.fill(this.f1018h, 0);
            Arrays.fill(this.f1019i, 0);
            Arrays.fill(this.f1020j, 0);
            this.f1021k = 0;
        }
    }

    /* renamed from: e */
    private void m12305e(int i) {
        if (this.f1014d != null) {
            this.f1014d[i] = 0.0f;
            this.f1015e[i] = 0.0f;
            this.f1016f[i] = 0.0f;
            this.f1017g[i] = 0.0f;
            this.f1018h[i] = 0;
            this.f1019i[i] = 0;
            this.f1020j[i] = 0;
            this.f1021k &= (1 << i) ^ (-1);
        }
    }

    /* renamed from: f */
    private void m12302f(int i) {
        if (this.f1014d == null || this.f1014d.length <= i) {
            float[] fArr = new float[i + 1];
            float[] fArr2 = new float[i + 1];
            float[] fArr3 = new float[i + 1];
            float[] fArr4 = new float[i + 1];
            int[] iArr = new int[i + 1];
            int[] iArr2 = new int[i + 1];
            int[] iArr3 = new int[i + 1];
            if (this.f1014d != null) {
                System.arraycopy(this.f1014d, 0, fArr, 0, this.f1014d.length);
                System.arraycopy(this.f1015e, 0, fArr2, 0, this.f1015e.length);
                System.arraycopy(this.f1016f, 0, fArr3, 0, this.f1016f.length);
                System.arraycopy(this.f1017g, 0, fArr4, 0, this.f1017g.length);
                System.arraycopy(this.f1018h, 0, iArr, 0, this.f1018h.length);
                System.arraycopy(this.f1019i, 0, iArr2, 0, this.f1019i.length);
                System.arraycopy(this.f1020j, 0, iArr3, 0, this.f1020j.length);
            }
            this.f1014d = fArr;
            this.f1015e = fArr2;
            this.f1016f = fArr3;
            this.f1017g = fArr4;
            this.f1018h = iArr;
            this.f1019i = iArr2;
            this.f1020j = iArr3;
        }
    }

    /* renamed from: a */
    private void m12337a(float f, float f2, int i) {
        m12302f(i);
        float[] fArr = this.f1014d;
        this.f1016f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1015e;
        this.f1017g[i] = f2;
        fArr2[i] = f2;
        this.f1018h[i] = m12304e((int) f, (int) f2);
        this.f1021k |= 1 << i;
    }

    /* renamed from: c */
    private void m12310c(MotionEvent motionEvent) {
        int m12595c = C0427t.m12595c(motionEvent);
        for (int i = 0; i < m12595c; i++) {
            int m12596b = C0427t.m12596b(motionEvent, i);
            float m12594c = C0427t.m12594c(motionEvent, i);
            float m12592d = C0427t.m12592d(motionEvent, i);
            this.f1016f[m12596b] = m12594c;
            this.f1017g[m12596b] = m12592d;
        }
    }

    /* renamed from: b */
    public boolean m12320b(int i) {
        return (this.f1021k & (1 << i)) != 0;
    }

    /* renamed from: c */
    void m12312c(int i) {
        this.f1031u.removeCallbacks(this.f1032w);
        if (this.f1011a != i) {
            this.f1011a = i;
            this.f1028r.mo12298a(i);
            if (this.f1011a == 0) {
                this.f1029s = null;
            }
        }
    }

    /* renamed from: b */
    boolean m12315b(View view, int i) {
        if (view == this.f1029s && this.f1013c == i) {
            return true;
        }
        if (view != null && this.f1028r.mo12294a(view, i)) {
            this.f1013c = i;
            m12329a(view, i);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
        if (r8 != r7) goto L56;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m12331a(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.widget.C0478ac.m12331a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public void m12316b(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        int m12599a = C0427t.m12599a(motionEvent);
        int m12597b = C0427t.m12597b(motionEvent);
        if (m12599a == 0) {
            m12306e();
        }
        if (this.f1022l == null) {
            this.f1022l = VelocityTracker.obtain();
        }
        this.f1022l.addMovement(motionEvent);
        switch (m12599a) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int m12596b = C0427t.m12596b(motionEvent, 0);
                View m12307d = m12307d((int) x, (int) y);
                m12337a(x, y, m12596b);
                m12315b(m12307d, m12596b);
                int i3 = this.f1018h[m12596b];
                if ((this.f1026p & i3) != 0) {
                    this.f1028r.mo12297a(i3 & this.f1026p, m12596b);
                    return;
                }
                return;
            case 1:
                if (this.f1011a == 1) {
                    m12299h();
                }
                m12306e();
                return;
            case 2:
                if (this.f1011a == 1) {
                    if (m12300g(this.f1013c)) {
                        int m12598a = C0427t.m12598a(motionEvent, this.f1013c);
                        float m12594c = C0427t.m12594c(motionEvent, m12598a);
                        float m12592d = C0427t.m12592d(motionEvent, m12598a);
                        int i4 = (int) (m12594c - this.f1016f[this.f1013c]);
                        int i5 = (int) (m12592d - this.f1017g[this.f1013c]);
                        m12317b(this.f1029s.getLeft() + i4, this.f1029s.getTop() + i5, i4, i5);
                        m12310c(motionEvent);
                        return;
                    }
                    return;
                }
                int m12595c = C0427t.m12595c(motionEvent);
                while (i2 < m12595c) {
                    int m12596b2 = C0427t.m12596b(motionEvent, i2);
                    if (m12300g(m12596b2)) {
                        float m12594c2 = C0427t.m12594c(motionEvent, i2);
                        float m12592d2 = C0427t.m12592d(motionEvent, i2);
                        float f = m12594c2 - this.f1014d[m12596b2];
                        float f2 = m12592d2 - this.f1015e[m12596b2];
                        m12321b(f, f2, m12596b2);
                        if (this.f1011a != 1) {
                            View m12307d2 = m12307d((int) m12594c2, (int) m12592d2);
                            if (m12330a(m12307d2, f, f2) && m12315b(m12307d2, m12596b2)) {
                            }
                        }
                        m12310c(motionEvent);
                        return;
                    }
                    i2++;
                }
                m12310c(motionEvent);
                return;
            case 3:
                if (this.f1011a == 1) {
                    m12339a(0.0f, 0.0f);
                }
                m12306e();
                return;
            case 4:
            default:
                return;
            case 5:
                int m12596b3 = C0427t.m12596b(motionEvent, m12597b);
                float m12594c3 = C0427t.m12594c(motionEvent, m12597b);
                float m12592d3 = C0427t.m12592d(motionEvent, m12597b);
                m12337a(m12594c3, m12592d3, m12596b3);
                if (this.f1011a == 0) {
                    m12315b(m12307d((int) m12594c3, (int) m12592d3), m12596b3);
                    int i6 = this.f1018h[m12596b3];
                    if ((this.f1026p & i6) != 0) {
                        this.f1028r.mo12297a(i6 & this.f1026p, m12596b3);
                        return;
                    }
                    return;
                } else if (m12311c((int) m12594c3, (int) m12592d3)) {
                    m12315b(this.f1029s, m12596b3);
                    return;
                } else {
                    return;
                }
            case 6:
                int m12596b4 = C0427t.m12596b(motionEvent, m12597b);
                if (this.f1011a == 1 && m12596b4 == this.f1013c) {
                    int m12595c2 = C0427t.m12595c(motionEvent);
                    while (true) {
                        if (i2 >= m12595c2) {
                            i = -1;
                        } else {
                            int m12596b5 = C0427t.m12596b(motionEvent, i2);
                            if (m12596b5 != this.f1013c) {
                                if (m12307d((int) C0427t.m12594c(motionEvent, i2), (int) C0427t.m12592d(motionEvent, i2)) == this.f1029s && m12315b(this.f1029s, m12596b5)) {
                                    i = this.f1013c;
                                }
                            }
                            i2++;
                        }
                    }
                    if (i == -1) {
                        m12299h();
                    }
                }
                m12305e(m12596b4);
                return;
        }
    }

    /* renamed from: b */
    private void m12321b(float f, float f2, int i) {
        int i2 = m12336a(f, f2, i, 1) ? 1 : 0;
        if (m12336a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m12336a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m12336a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1019i;
            iArr[i] = iArr[i] | i2;
            this.f1028r.mo12290b(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m12336a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f1018h[i] & i2) != i2 || (this.f1026p & i2) == 0 || (this.f1020j[i] & i2) == i2 || (this.f1019i[i] & i2) == i2) {
            return false;
        }
        if (abs > this.f1012b || abs2 > this.f1012b) {
            if (abs >= abs2 * 0.5f || !this.f1028r.mo12291b(i2)) {
                return (this.f1019i[i] & i2) == 0 && abs > ((float) this.f1012b);
            }
            int[] iArr = this.f1020j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m12330a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f1028r.mo12296a(view) > 0;
        boolean z2 = this.f1028r.m12289b(view) > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f1012b * this.f1012b)) : z ? Math.abs(f) > ((float) this.f1012b) : z2 && Math.abs(f2) > ((float) this.f1012b);
    }

    /* renamed from: d */
    public boolean m12308d(int i) {
        int length = this.f1014d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m12319b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m12319b(int i, int i2) {
        if (m12320b(i2)) {
            boolean z = (i & 1) == 1;
            boolean z2 = (i & 2) == 2;
            float f = this.f1016f[i2] - this.f1014d[i2];
            float f2 = this.f1017g[i2] - this.f1015e[i2];
            return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f1012b * this.f1012b)) : z ? Math.abs(f) > ((float) this.f1012b) : z2 && Math.abs(f2) > ((float) this.f1012b);
        }
        return false;
    }

    /* renamed from: h */
    private void m12299h() {
        this.f1022l.computeCurrentVelocity(1000, this.f1023m);
        m12339a(m12338a(C0304ag.m12938a(this.f1022l, this.f1013c), this.f1024n, this.f1023m), m12338a(C0304ag.m12937b(this.f1022l, this.f1013c), this.f1024n, this.f1023m));
    }

    /* renamed from: b */
    private void m12317b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int left = this.f1029s.getLeft();
        int top = this.f1029s.getTop();
        if (i3 != 0) {
            i5 = this.f1028r.mo12293a(this.f1029s, i, i3);
            C0309ai.m12902e(this.f1029s, i5 - left);
        } else {
            i5 = i;
        }
        if (i4 != 0) {
            i6 = this.f1028r.mo12287b(this.f1029s, i2, i4);
            C0309ai.m12905d(this.f1029s, i6 - top);
        } else {
            i6 = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.f1028r.mo12292a(this.f1029s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: c */
    public boolean m12311c(int i, int i2) {
        return m12314b(this.f1029s, i, i2);
    }

    /* renamed from: b */
    public boolean m12314b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: d */
    public View m12307d(int i, int i2) {
        for (int childCount = this.f1031u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1031u.getChildAt(this.f1028r.m12286c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: e */
    private int m12304e(int i, int i2) {
        int i3 = i < this.f1031u.getLeft() + this.f1025o ? 1 : 0;
        if (i2 < this.f1031u.getTop() + this.f1025o) {
            i3 |= 4;
        }
        if (i > this.f1031u.getRight() - this.f1025o) {
            i3 |= 2;
        }
        return i2 > this.f1031u.getBottom() - this.f1025o ? i3 | 8 : i3;
    }

    /* renamed from: g */
    private boolean m12300g(int i) {
        if (m12320b(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
