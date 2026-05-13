package android.support.p002v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p002v4.p010os.C0224d;
import android.support.p002v4.p010os.InterfaceC0226e;
import android.support.p002v4.view.p011a.C0256a;
import android.support.p002v4.view.p011a.C0261b;
import android.support.p002v4.view.p011a.C0289j;
import android.support.p002v4.widget.C0501k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.acra.ACRAConstants;
/* renamed from: android.support.v4.view.ViewPager */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: A */
    private int f626A;

    /* renamed from: B */
    private boolean f627B;

    /* renamed from: C */
    private boolean f628C;

    /* renamed from: D */
    private int f629D;

    /* renamed from: E */
    private int f630E;

    /* renamed from: F */
    private int f631F;

    /* renamed from: G */
    private float f632G;

    /* renamed from: H */
    private float f633H;

    /* renamed from: I */
    private float f634I;

    /* renamed from: J */
    private float f635J;

    /* renamed from: K */
    private int f636K;

    /* renamed from: L */
    private VelocityTracker f637L;

    /* renamed from: M */
    private int f638M;

    /* renamed from: N */
    private int f639N;

    /* renamed from: O */
    private int f640O;

    /* renamed from: P */
    private int f641P;

    /* renamed from: Q */
    private boolean f642Q;

    /* renamed from: R */
    private long f643R;

    /* renamed from: S */
    private C0501k f644S;

    /* renamed from: T */
    private C0501k f645T;

    /* renamed from: U */
    private boolean f646U;

    /* renamed from: V */
    private boolean f647V;

    /* renamed from: W */
    private boolean f648W;

    /* renamed from: aa */
    private int f649aa;

    /* renamed from: ab */
    private List<InterfaceC0245e> f650ab;

    /* renamed from: ac */
    private InterfaceC0245e f651ac;

    /* renamed from: ad */
    private InterfaceC0245e f652ad;

    /* renamed from: ae */
    private InterfaceC0244d f653ae;

    /* renamed from: af */
    private InterfaceC0246f f654af;

    /* renamed from: ag */
    private Method f655ag;

    /* renamed from: ah */
    private int f656ah;

    /* renamed from: ai */
    private ArrayList<View> f657ai;

    /* renamed from: ak */
    private final Runnable f658ak;

    /* renamed from: al */
    private int f659al;

    /* renamed from: b */
    private int f660b;

    /* renamed from: e */
    private final ArrayList<C0242b> f661e;

    /* renamed from: f */
    private final C0242b f662f;

    /* renamed from: g */
    private final Rect f663g;

    /* renamed from: h */
    private AbstractC0299ac f664h;

    /* renamed from: i */
    private int f665i;

    /* renamed from: j */
    private int f666j;

    /* renamed from: k */
    private Parcelable f667k;

    /* renamed from: l */
    private ClassLoader f668l;

    /* renamed from: m */
    private Scroller f669m;

    /* renamed from: n */
    private boolean f670n;

    /* renamed from: o */
    private C0247g f671o;

    /* renamed from: p */
    private int f672p;

    /* renamed from: q */
    private Drawable f673q;

    /* renamed from: r */
    private int f674r;

    /* renamed from: s */
    private int f675s;

    /* renamed from: t */
    private float f676t;

    /* renamed from: u */
    private float f677u;

    /* renamed from: v */
    private int f678v;

    /* renamed from: w */
    private int f679w;

    /* renamed from: x */
    private boolean f680x;

    /* renamed from: y */
    private boolean f681y;

    /* renamed from: z */
    private boolean f682z;

    /* renamed from: a */
    private static final int[] f622a = {16842931};

    /* renamed from: c */
    private static final Comparator<C0242b> f624c = new Comparator<C0242b>() { // from class: android.support.v4.view.ViewPager.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C0242b c0242b, C0242b c0242b2) {
            return c0242b.f696b - c0242b2.f696b;
        }
    };

    /* renamed from: d */
    private static final Interpolator f625d = new Interpolator() { // from class: android.support.v4.view.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: aj */
    private static final C0248h f623aj = new C0248h();

    /* renamed from: android.support.v4.view.ViewPager$a */
    /* loaded from: classes.dex */
    interface InterfaceC0241a {
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    /* loaded from: classes.dex */
    interface InterfaceC0244d {
        /* renamed from: a */
        void mo13151a(AbstractC0299ac abstractC0299ac, AbstractC0299ac abstractC0299ac2);
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0245e {
        /* renamed from: a */
        void mo940a(int i, float f, int i2);

        /* renamed from: b_ */
        void mo937b_(int i);

        /* renamed from: c_ */
        void mo936c_(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0246f {
        /* renamed from: a */
        void m13150a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.ViewPager$b */
    /* loaded from: classes.dex */
    public static class C0242b {

        /* renamed from: a */
        Object f695a;

        /* renamed from: b */
        int f696b;

        /* renamed from: c */
        boolean f697c;

        /* renamed from: d */
        float f698d;

        /* renamed from: e */
        float f699e;

        C0242b() {
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f661e = new ArrayList<>();
        this.f662f = new C0242b();
        this.f663g = new Rect();
        this.f666j = -1;
        this.f667k = null;
        this.f668l = null;
        this.f676t = -3.4028235E38f;
        this.f677u = Float.MAX_VALUE;
        this.f626A = 1;
        this.f636K = -1;
        this.f646U = true;
        this.f647V = false;
        this.f658ak = new Runnable() { // from class: android.support.v4.view.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.m13173c();
            }
        };
        this.f659al = 0;
        m13203a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f661e = new ArrayList<>();
        this.f662f = new C0242b();
        this.f663g = new Rect();
        this.f666j = -1;
        this.f667k = null;
        this.f668l = null;
        this.f676t = -3.4028235E38f;
        this.f677u = Float.MAX_VALUE;
        this.f626A = 1;
        this.f636K = -1;
        this.f646U = true;
        this.f647V = false;
        this.f658ak = new Runnable() { // from class: android.support.v4.view.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.m13173c();
            }
        };
        this.f659al = 0;
        m13203a();
    }

    /* renamed from: a */
    void m13203a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f669m = new Scroller(context, f625d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f631F = C0335au.m12757a(viewConfiguration);
        this.f638M = (int) (400.0f * f);
        this.f639N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f644S = new C0501k(context);
        this.f645T = new C0501k(context);
        this.f640O = (int) (25.0f * f);
        this.f641P = (int) (2.0f * f);
        this.f629D = (int) (16.0f * f);
        C0309ai.m12922a(this, new C0243c());
        if (C0309ai.m12910c(this) == 0) {
            C0309ai.m12908c((View) this, 1);
        }
        C0309ai.m12921a(this, new InterfaceC0298ab() { // from class: android.support.v4.view.ViewPager.4

            /* renamed from: b */
            private final Rect f685b = new Rect();

            @Override // android.support.p002v4.view.InterfaceC0298ab
            /* renamed from: a */
            public C0383bi mo12060a(View view, C0383bi c0383bi) {
                C0383bi m12920a = C0309ai.m12920a(view, c0383bi);
                if (!m12920a.mo12665e()) {
                    Rect rect = this.f685b;
                    rect.left = m12920a.mo12670a();
                    rect.top = m12920a.mo12668b();
                    rect.right = m12920a.mo12667c();
                    rect.bottom = m12920a.mo12666d();
                    int childCount = ViewPager.this.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        C0383bi m12912b = C0309ai.m12912b(ViewPager.this.getChildAt(i), m12920a);
                        rect.left = Math.min(m12912b.mo12670a(), rect.left);
                        rect.top = Math.min(m12912b.mo12668b(), rect.top);
                        rect.right = Math.min(m12912b.mo12667c(), rect.right);
                        rect.bottom = Math.min(m12912b.mo12666d(), rect.bottom);
                    }
                    return m12920a.mo12669a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return m12920a;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f658ak);
        if (this.f669m != null && !this.f669m.isFinished()) {
            this.f669m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.f659al != i) {
            this.f659al = i;
            if (this.f654af != null) {
                m13174b(i != 0);
            }
            m13164f(i);
        }
    }

    public void setAdapter(AbstractC0299ac abstractC0299ac) {
        if (this.f664h != null) {
            this.f664h.m12940c((DataSetObserver) null);
            this.f664h.mo12948a((ViewGroup) this);
            for (int i = 0; i < this.f661e.size(); i++) {
                C0242b c0242b = this.f661e.get(i);
                this.f664h.mo7035a((ViewGroup) this, c0242b.f696b, c0242b.f695a);
            }
            this.f664h.mo12943b((ViewGroup) this);
            this.f661e.clear();
            m13160j();
            this.f665i = 0;
            scrollTo(0, 0);
        }
        AbstractC0299ac abstractC0299ac2 = this.f664h;
        this.f664h = abstractC0299ac;
        this.f660b = 0;
        if (this.f664h != null) {
            if (this.f671o == null) {
                this.f671o = new C0247g();
            }
            this.f664h.m12940c(this.f671o);
            this.f682z = false;
            boolean z = this.f646U;
            this.f646U = true;
            this.f660b = this.f664h.mo938b();
            if (this.f666j >= 0) {
                this.f664h.mo12952a(this.f667k, this.f668l);
                m13192a(this.f666j, false, true);
                this.f666j = -1;
                this.f667k = null;
                this.f668l = null;
            } else if (!z) {
                m13173c();
            } else {
                requestLayout();
            }
        }
        if (this.f653ae != null && abstractC0299ac2 != abstractC0299ac) {
            this.f653ae.mo13151a(abstractC0299ac2, abstractC0299ac);
        }
    }

    /* renamed from: j */
    private void m13160j() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f686a) {
                    removeViewAt(i2);
                    i2--;
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public AbstractC0299ac getAdapter() {
        return this.f664h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(InterfaceC0244d interfaceC0244d) {
        this.f653ae = interfaceC0244d;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.f682z = false;
        m13192a(i, !this.f646U, false);
    }

    /* renamed from: a */
    public void m13194a(int i, boolean z) {
        this.f682z = false;
        m13192a(i, z, false);
    }

    public int getCurrentItem() {
        return this.f665i;
    }

    /* renamed from: a */
    void m13192a(int i, boolean z, boolean z2) {
        m13191a(i, z, z2, 0);
    }

    /* renamed from: a */
    void m13191a(int i, boolean z, boolean z2, int i2) {
        if (this.f664h == null || this.f664h.mo938b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (!z2 && this.f665i == i && this.f661e.size() != 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f664h.mo938b()) {
                i = this.f664h.mo938b() - 1;
            }
            int i3 = this.f626A;
            if (i > this.f665i + i3 || i < this.f665i - i3) {
                for (int i4 = 0; i4 < this.f661e.size(); i4++) {
                    this.f661e.get(i4).f697c = true;
                }
            }
            boolean z3 = this.f665i != i;
            if (this.f646U) {
                this.f665i = i;
                if (z3) {
                    m13166e(i);
                }
                requestLayout();
                return;
            }
            m13200a(i);
            m13193a(i, z, i2, z3);
        }
    }

    /* renamed from: a */
    private void m13193a(int i, boolean z, int i2, boolean z2) {
        int i3;
        C0242b m13178b = m13178b(i);
        if (m13178b != null) {
            i3 = (int) (Math.max(this.f676t, Math.min(m13178b.f699e, this.f677u)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            m13196a(i3, 0, i2);
            if (z2) {
                m13166e(i);
                return;
            }
            return;
        }
        if (z2) {
            m13166e(i);
        }
        m13181a(false);
        scrollTo(i3, 0);
        m13168d(i3);
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0245e interfaceC0245e) {
        this.f651ac = interfaceC0245e;
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.f655ag == null) {
                try {
                    this.f655ag = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.f655ag.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f656ah == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f657ai.get(i2).getLayoutParams()).f691f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public InterfaceC0245e m13188a(InterfaceC0245e interfaceC0245e) {
        InterfaceC0245e interfaceC0245e2 = this.f652ad;
        this.f652ad = interfaceC0245e;
        return interfaceC0245e2;
    }

    public int getOffscreenPageLimit() {
        return this.f626A;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f626A) {
            this.f626A = i;
            m13173c();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f672p;
        this.f672p = i;
        int width = getWidth();
        m13195a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.f672p;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f673q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f673q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f673q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    float m13202a(float f) {
        return (float) Math.sin((float) ((f - 0.5f) * 0.4712389167638204d));
    }

    /* renamed from: a */
    void m13196a(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.f669m == null || this.f669m.isFinished()) ? false : true) {
            int currX = this.f670n ? this.f669m.getCurrX() : this.f669m.getStartX();
            this.f669m.abortAnimation();
            setScrollingCacheEnabled(false);
            scrollX = currX;
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m13181a(false);
            m13173c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float m13202a = (i6 * m13202a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth))) + i6;
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(1000.0f * Math.abs(m13202a / abs2)) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / ((clientWidth * this.f664h.mo7032d(this.f665i)) + this.f672p)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f670n = false;
        this.f669m.startScroll(scrollX, scrollY, i4, i5, min);
        C0309ai.m12915b(this);
    }

    /* renamed from: a */
    C0242b m13197a(int i, int i2) {
        C0242b c0242b = new C0242b();
        c0242b.f696b = i;
        c0242b.f695a = this.f664h.mo7036a((ViewGroup) this, i);
        c0242b.f698d = this.f664h.mo7032d(i);
        if (i2 < 0 || i2 >= this.f661e.size()) {
            this.f661e.add(c0242b);
        } else {
            this.f661e.add(i2, c0242b);
        }
        return c0242b;
    }

    /* renamed from: b */
    void m13180b() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int mo938b = this.f664h.mo938b();
        this.f660b = mo938b;
        boolean z3 = this.f661e.size() < (this.f626A * 2) + 1 && this.f661e.size() < mo938b;
        boolean z4 = false;
        int i3 = this.f665i;
        boolean z5 = z3;
        int i4 = 0;
        while (i4 < this.f661e.size()) {
            C0242b c0242b = this.f661e.get(i4);
            int m12947a = this.f664h.m12947a(c0242b.f695a);
            if (m12947a == -1) {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            } else if (m12947a == -2) {
                this.f661e.remove(i4);
                int i5 = i4 - 1;
                if (!z4) {
                    this.f664h.mo12948a((ViewGroup) this);
                    z4 = true;
                }
                this.f664h.mo7035a((ViewGroup) this, c0242b.f696b, c0242b.f695a);
                if (this.f665i == c0242b.f696b) {
                    i = i5;
                    z = z4;
                    i2 = Math.max(0, Math.min(this.f665i, mo938b - 1));
                    z2 = true;
                } else {
                    i = i5;
                    z = z4;
                    i2 = i3;
                    z2 = true;
                }
            } else if (c0242b.f696b != m12947a) {
                if (c0242b.f696b == this.f665i) {
                    i3 = m12947a;
                }
                c0242b.f696b = m12947a;
                i = i4;
                z = z4;
                i2 = i3;
                z2 = true;
            } else {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            }
            z5 = z2;
            i3 = i2;
            z4 = z;
            i4 = i + 1;
        }
        if (z4) {
            this.f664h.mo12943b((ViewGroup) this);
        }
        Collections.sort(this.f661e, f624c);
        if (z5) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                if (!layoutParams.f686a) {
                    layoutParams.f688c = 0.0f;
                }
            }
            m13192a(i3, false, true);
            requestLayout();
        }
    }

    /* renamed from: c */
    void m13173c() {
        m13200a(this.f665i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
        if (r2.f696b == r17.f665i) goto L26;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m13200a(int r18) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.view.ViewPager.m13200a(int):void");
    }

    /* renamed from: k */
    private void m13159k() {
        if (this.f656ah != 0) {
            if (this.f657ai == null) {
                this.f657ai = new ArrayList<>();
            } else {
                this.f657ai.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f657ai.add(getChildAt(i));
            }
            Collections.sort(this.f657ai, f623aj);
        }
    }

    /* renamed from: a */
    private void m13189a(C0242b c0242b, int i, C0242b c0242b2) {
        C0242b c0242b3;
        C0242b c0242b4;
        int mo938b = this.f664h.mo938b();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f672p / clientWidth : 0.0f;
        if (c0242b2 != null) {
            int i2 = c0242b2.f696b;
            if (i2 < c0242b.f696b) {
                float f2 = c0242b2.f699e + c0242b2.f698d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= c0242b.f696b && i4 < this.f661e.size()) {
                    C0242b c0242b5 = this.f661e.get(i4);
                    while (true) {
                        c0242b4 = c0242b5;
                        if (i3 <= c0242b4.f696b || i4 >= this.f661e.size() - 1) {
                            break;
                        }
                        i4++;
                        c0242b5 = this.f661e.get(i4);
                    }
                    while (i3 < c0242b4.f696b) {
                        f2 += this.f664h.mo7032d(i3) + f;
                        i3++;
                    }
                    c0242b4.f699e = f2;
                    f2 += c0242b4.f698d + f;
                    i3++;
                }
            } else if (i2 > c0242b.f696b) {
                int size = this.f661e.size() - 1;
                float f3 = c0242b2.f699e;
                int i5 = i2 - 1;
                while (i5 >= c0242b.f696b && size >= 0) {
                    C0242b c0242b6 = this.f661e.get(size);
                    while (true) {
                        c0242b3 = c0242b6;
                        if (i5 >= c0242b3.f696b || size <= 0) {
                            break;
                        }
                        size--;
                        c0242b6 = this.f661e.get(size);
                    }
                    while (i5 > c0242b3.f696b) {
                        f3 -= this.f664h.mo7032d(i5) + f;
                        i5--;
                    }
                    f3 -= c0242b3.f698d + f;
                    c0242b3.f699e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f661e.size();
        float f4 = c0242b.f699e;
        int i6 = c0242b.f696b - 1;
        this.f676t = c0242b.f696b == 0 ? c0242b.f699e : -3.4028235E38f;
        this.f677u = c0242b.f696b == mo938b + (-1) ? (c0242b.f699e + c0242b.f698d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            C0242b c0242b7 = this.f661e.get(i7);
            float f5 = f4;
            while (i6 > c0242b7.f696b) {
                f5 -= this.f664h.mo7032d(i6) + f;
                i6--;
            }
            f4 = f5 - (c0242b7.f698d + f);
            c0242b7.f699e = f4;
            if (c0242b7.f696b == 0) {
                this.f676t = f4;
            }
            i6--;
        }
        float f6 = c0242b.f699e + c0242b.f698d + f;
        int i8 = c0242b.f696b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            C0242b c0242b8 = this.f661e.get(i9);
            float f7 = f6;
            while (i8 < c0242b8.f696b) {
                f7 = this.f664h.mo7032d(i8) + f + f7;
                i8++;
            }
            if (c0242b8.f696b == mo938b - 1) {
                this.f677u = (c0242b8.f698d + f7) - 1.0f;
            }
            c0242b8.f699e = f7;
            f6 = f7 + c0242b8.f698d + f;
            i8++;
        }
        this.f647V = false;
    }

    /* renamed from: android.support.v4.view.ViewPager$SavedState */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = C0224d.m13211a(new InterfaceC0226e<SavedState>() { // from class: android.support.v4.view.ViewPager.SavedState.1
            @Override // android.support.p002v4.p010os.InterfaceC0226e
            /* renamed from: b */
            public SavedState mo12052a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.support.p002v4.p010os.InterfaceC0226e
            /* renamed from: b */
            public SavedState[] mo12053a(int i) {
                return new SavedState[i];
            }
        });

        /* renamed from: a */
        int f692a;

        /* renamed from: b */
        Parcelable f693b;

        /* renamed from: c */
        ClassLoader f694c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f692a);
            parcel.writeParcelable(this.f693b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f692a + "}";
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f692a = parcel.readInt();
            this.f693b = parcel.readParcelable(classLoader);
            this.f694c = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f692a = this.f665i;
        if (this.f664h != null) {
            savedState.f693b = this.f664h.mo12954a();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f664h != null) {
            this.f664h.mo12952a(savedState.f693b, savedState.f694c);
            m13192a(savedState.f692a, false, true);
            return;
        }
        this.f666j = savedState.f692a;
        this.f667k = savedState.f693b;
        this.f668l = savedState.f694c;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.f686a |= view instanceof InterfaceC0241a;
        if (this.f680x) {
            if (layoutParams2 != null && layoutParams2.f686a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f689d = true;
            addViewInLayout(view, i, generateLayoutParams);
            return;
        }
        super.addView(view, i, generateLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f680x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: a */
    C0242b m13183a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f661e.size()) {
                C0242b c0242b = this.f661e.get(i2);
                if (!this.f664h.mo7037a(view, c0242b.f695a)) {
                    i = i2 + 1;
                } else {
                    return c0242b;
                }
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    C0242b m13175b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return m13183a(view);
            }
        }
        return null;
    }

    /* renamed from: b */
    C0242b m13178b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.f661e.size()) {
                C0242b c0242b = this.f661e.get(i3);
                if (c0242b.f696b != i) {
                    i2 = i3 + 1;
                } else {
                    return c0242b;
                }
            } else {
                return null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f646U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.view.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m13195a(i, i3, this.f672p, this.f672p);
        }
    }

    /* renamed from: a */
    private void m13195a(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f661e.isEmpty()) {
            if (!this.f669m.isFinished()) {
                this.f669m.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
                return;
            }
        }
        C0242b m13178b = m13178b(this.f665i);
        int min = (int) ((m13178b != null ? Math.min(m13178b.f699e, this.f677u) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            m13181a(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0242b m13183a;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i3 - i;
        int i11 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f686a) {
                    int i14 = layoutParams.f687b & 7;
                    int i15 = layoutParams.f687b & 112;
                    switch (i14) {
                        case 1:
                            i7 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            i7 = paddingLeft;
                            break;
                        case 3:
                            i7 = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (i10 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            i7 = measuredWidth;
                            break;
                    }
                    switch (i15) {
                        case 16:
                            measuredHeight = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i16 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i16;
                            break;
                        case 48:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i17 = paddingTop;
                            i9 = paddingBottom;
                            i8 = measuredHeight2;
                            measuredHeight = i17;
                            break;
                        case 80:
                            measuredHeight = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i8 = paddingTop;
                            i9 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i18 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i18;
                            break;
                    }
                    int i19 = i7 + scrollX;
                    childAt.layout(i19, measuredHeight, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + measuredHeight);
                    i5 = i12 + 1;
                    i6 = i8;
                    paddingBottom = i9;
                    i13++;
                    paddingLeft = paddingLeft;
                    paddingRight = paddingRight;
                    paddingTop = i6;
                    i12 = i5;
                }
            }
            i5 = i12;
            i6 = paddingTop;
            i13++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i6;
            i12 = i5;
        }
        int i20 = (i10 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f686a && (m13183a = m13183a(childAt2)) != null) {
                    int i22 = ((int) (m13183a.f699e * i20)) + paddingLeft;
                    if (layoutParams2.f689d) {
                        layoutParams2.f689d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams2.f688c * i20), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f674r = paddingTop;
        this.f675s = i11 - paddingBottom;
        this.f649aa = i12;
        if (this.f646U) {
            m13193a(this.f665i, false, 0, false);
        }
        this.f646U = false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f670n = true;
        if (!this.f669m.isFinished() && this.f669m.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f669m.getCurrX();
            int currY = this.f669m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m13168d(currX)) {
                    this.f669m.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C0309ai.m12915b(this);
            return;
        }
        m13181a(true);
    }

    /* renamed from: d */
    private boolean m13168d(int i) {
        if (this.f661e.size() == 0) {
            if (this.f646U) {
                return false;
            }
            this.f648W = false;
            m13199a(0, 0.0f, 0);
            if (this.f648W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0242b m13157m = m13157m();
        int clientWidth = getClientWidth();
        int i2 = this.f672p + clientWidth;
        float f = this.f672p / clientWidth;
        int i3 = m13157m.f696b;
        float f2 = ((i / clientWidth) - m13157m.f699e) / (m13157m.f698d + f);
        this.f648W = false;
        m13199a(i3, f2, (int) (i2 * f2));
        if (!this.f648W) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    /* renamed from: a */
    protected void m13199a(int i, float f, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.f649aa > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f686a) {
                    switch (layoutParams.f687b & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i6 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i6;
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            int i7 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i7;
                            break;
                        case 3:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i8 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i8;
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                } else {
                    int i9 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i9;
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        m13177b(i, f, i2);
        if (this.f654af != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).f686a) {
                    this.f654af.m13150a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f648W = true;
    }

    /* renamed from: b */
    private void m13177b(int i, float f, int i2) {
        if (this.f651ac != null) {
            this.f651ac.mo940a(i, f, i2);
        }
        if (this.f650ab != null) {
            int size = this.f650ab.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC0245e interfaceC0245e = this.f650ab.get(i3);
                if (interfaceC0245e != null) {
                    interfaceC0245e.mo940a(i, f, i2);
                }
            }
        }
        if (this.f652ad != null) {
            this.f652ad.mo940a(i, f, i2);
        }
    }

    /* renamed from: e */
    private void m13166e(int i) {
        if (this.f651ac != null) {
            this.f651ac.mo937b_(i);
        }
        if (this.f650ab != null) {
            int size = this.f650ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0245e interfaceC0245e = this.f650ab.get(i2);
                if (interfaceC0245e != null) {
                    interfaceC0245e.mo937b_(i);
                }
            }
        }
        if (this.f652ad != null) {
            this.f652ad.mo937b_(i);
        }
    }

    /* renamed from: f */
    private void m13164f(int i) {
        if (this.f651ac != null) {
            this.f651ac.mo936c_(i);
        }
        if (this.f650ab != null) {
            int size = this.f650ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0245e interfaceC0245e = this.f650ab.get(i2);
                if (interfaceC0245e != null) {
                    interfaceC0245e.mo936c_(i);
                }
            }
        }
        if (this.f652ad != null) {
            this.f652ad.mo936c_(i);
        }
    }

    /* renamed from: a */
    private void m13181a(boolean z) {
        boolean z2 = this.f659al == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f669m.isFinished()) {
                this.f669m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f669m.getCurrX();
                int currY = this.f669m.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m13168d(currX);
                    }
                }
            }
        }
        this.f682z = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f661e.size(); i++) {
            C0242b c0242b = this.f661e.get(i);
            if (c0242b.f697c) {
                c0242b.f697c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0309ai.m12919a(this, this.f658ak);
            } else {
                this.f658ak.run();
            }
        }
    }

    /* renamed from: a */
    private boolean m13201a(float f, float f2) {
        return (f < ((float) this.f630E) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f630E)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m13174b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0309ai.m12926a(getChildAt(i), z ? 2 : 0, (Paint) null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m13158l();
            return false;
        }
        if (action != 0) {
            if (this.f627B) {
                return true;
            }
            if (this.f628C) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.f634I = x;
                this.f632G = x;
                float y = motionEvent.getY();
                this.f635J = y;
                this.f633H = y;
                this.f636K = C0427t.m12596b(motionEvent, 0);
                this.f628C = false;
                this.f670n = true;
                this.f669m.computeScrollOffset();
                if (this.f659al == 2 && Math.abs(this.f669m.getFinalX() - this.f669m.getCurrX()) > this.f641P) {
                    this.f669m.abortAnimation();
                    this.f682z = false;
                    m13173c();
                    this.f627B = true;
                    m13170c(true);
                    setScrollState(1);
                    break;
                } else {
                    m13181a(false);
                    this.f627B = false;
                    break;
                }
            case 2:
                int i = this.f636K;
                if (i != -1) {
                    int m12598a = C0427t.m12598a(motionEvent, i);
                    float m12594c = C0427t.m12594c(motionEvent, m12598a);
                    float f = m12594c - this.f632G;
                    float abs = Math.abs(f);
                    float m12592d = C0427t.m12592d(motionEvent, m12598a);
                    float abs2 = Math.abs(m12592d - this.f635J);
                    if (f != 0.0f && !m13201a(this.f632G, f) && m13182a(this, false, (int) f, (int) m12594c, (int) m12592d)) {
                        this.f632G = m12594c;
                        this.f633H = m12592d;
                        this.f628C = true;
                        return false;
                    }
                    if (abs > this.f631F && 0.5f * abs > abs2) {
                        this.f627B = true;
                        m13170c(true);
                        setScrollState(1);
                        this.f632G = f > 0.0f ? this.f634I + this.f631F : this.f634I - this.f631F;
                        this.f633H = m12592d;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > this.f631F) {
                        this.f628C = true;
                    }
                    if (this.f627B && m13172c(m12594c)) {
                        C0309ai.m12915b(this);
                        break;
                    }
                }
                break;
            case 6:
                m13184a(motionEvent);
                break;
        }
        if (this.f637L == null) {
            this.f637L = VelocityTracker.obtain();
        }
        this.f637L.addMovement(motionEvent);
        return this.f627B;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f642Q) {
            return true;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
            if (this.f664h == null || this.f664h.mo938b() == 0) {
                return false;
            }
            if (this.f637L == null) {
                this.f637L = VelocityTracker.obtain();
            }
            this.f637L.addMovement(motionEvent);
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.f669m.abortAnimation();
                    this.f682z = false;
                    m13173c();
                    float x = motionEvent.getX();
                    this.f634I = x;
                    this.f632G = x;
                    float y = motionEvent.getY();
                    this.f635J = y;
                    this.f633H = y;
                    this.f636K = C0427t.m12596b(motionEvent, 0);
                    break;
                case 1:
                    if (this.f627B) {
                        VelocityTracker velocityTracker = this.f637L;
                        velocityTracker.computeCurrentVelocity(1000, this.f639N);
                        int m12938a = (int) C0304ag.m12938a(velocityTracker, this.f636K);
                        this.f682z = true;
                        int clientWidth = getClientWidth();
                        int scrollX = getScrollX();
                        C0242b m13157m = m13157m();
                        m13191a(m13198a(m13157m.f696b, ((scrollX / clientWidth) - m13157m.f699e) / (m13157m.f698d + (this.f672p / clientWidth)), m12938a, (int) (C0427t.m12594c(motionEvent, C0427t.m12598a(motionEvent, this.f636K)) - this.f634I)), true, true, m12938a);
                        z = m13158l();
                        break;
                    }
                    break;
                case 2:
                    if (!this.f627B) {
                        int m12598a = C0427t.m12598a(motionEvent, this.f636K);
                        if (m12598a == -1) {
                            z = m13158l();
                            break;
                        } else {
                            float m12594c = C0427t.m12594c(motionEvent, m12598a);
                            float abs = Math.abs(m12594c - this.f632G);
                            float m12592d = C0427t.m12592d(motionEvent, m12598a);
                            float abs2 = Math.abs(m12592d - this.f633H);
                            if (abs > this.f631F && abs > abs2) {
                                this.f627B = true;
                                m13170c(true);
                                this.f632G = m12594c - this.f634I > 0.0f ? this.f634I + this.f631F : this.f634I - this.f631F;
                                this.f633H = m12592d;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f627B) {
                        z = false | m13172c(C0427t.m12594c(motionEvent, C0427t.m12598a(motionEvent, this.f636K)));
                        break;
                    }
                    break;
                case 3:
                    if (this.f627B) {
                        m13193a(this.f665i, true, 0, false);
                        z = m13158l();
                        break;
                    }
                    break;
                case 5:
                    int m12597b = C0427t.m12597b(motionEvent);
                    this.f632G = C0427t.m12594c(motionEvent, m12597b);
                    this.f636K = C0427t.m12596b(motionEvent, m12597b);
                    break;
                case 6:
                    m13184a(motionEvent);
                    this.f632G = C0427t.m12594c(motionEvent, C0427t.m12598a(motionEvent, this.f636K));
                    break;
            }
            if (z) {
                C0309ai.m12915b(this);
            }
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m13158l() {
        this.f636K = -1;
        m13156n();
        return this.f644S.m12252c() | this.f645T.m12252c();
    }

    /* renamed from: c */
    private void m13170c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private boolean m13172c(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        this.f632G = f;
        float scrollX = getScrollX() + (this.f632G - f);
        int clientWidth = getClientWidth();
        float f3 = clientWidth * this.f676t;
        float f4 = clientWidth * this.f677u;
        C0242b c0242b = this.f661e.get(0);
        C0242b c0242b2 = this.f661e.get(this.f661e.size() - 1);
        if (c0242b.f696b != 0) {
            f3 = c0242b.f699e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0242b2.f696b != this.f664h.mo938b() - 1) {
            f2 = c0242b2.f699e * clientWidth;
            z2 = false;
        } else {
            f2 = f4;
        }
        if (scrollX < f3) {
            if (z) {
                r2 = this.f644S.m12258a(Math.abs(f3 - scrollX) / clientWidth);
            }
        } else if (scrollX > f2) {
            r2 = z2 ? this.f645T.m12258a(Math.abs(scrollX - f2) / clientWidth) : false;
            f3 = f2;
        } else {
            f3 = scrollX;
        }
        this.f632G += f3 - ((int) f3);
        scrollTo((int) f3, getScrollY());
        m13168d((int) f3);
        return r2;
    }

    /* renamed from: m */
    private C0242b m13157m() {
        int i;
        C0242b c0242b;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.f672p / clientWidth : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        C0242b c0242b2 = null;
        while (i3 < this.f661e.size()) {
            C0242b c0242b3 = this.f661e.get(i3);
            if (z || c0242b3.f696b == i2 + 1) {
                i = i3;
                c0242b = c0242b3;
            } else {
                C0242b c0242b4 = this.f662f;
                c0242b4.f699e = f2 + f3 + f;
                c0242b4.f696b = i2 + 1;
                c0242b4.f698d = this.f664h.mo7032d(c0242b4.f696b);
                i = i3 - 1;
                c0242b = c0242b4;
            }
            float f4 = c0242b.f699e;
            float f5 = c0242b.f698d + f4 + f;
            if (z || scrollX >= f4) {
                if (scrollX < f5 || i == this.f661e.size() - 1) {
                    return c0242b;
                }
                f3 = f4;
                i2 = c0242b.f696b;
                z = false;
                f2 = c0242b.f698d;
                c0242b2 = c0242b;
                i3 = i + 1;
            } else {
                return c0242b2;
            }
        }
        return c0242b2;
    }

    /* renamed from: a */
    private int m13198a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.f640O && Math.abs(i2) > this.f638M) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            i = (int) ((i >= this.f665i ? 0.4f : 0.6f) + i + f);
        }
        if (this.f661e.size() > 0) {
            return Math.max(this.f661e.get(0).f696b, Math.min(i, this.f661e.get(this.f661e.size() - 1).f696b));
        }
        return i;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int m12931a = C0309ai.m12931a(this);
        if (m12931a == 0 || (m12931a == 1 && this.f664h != null && this.f664h.mo938b() > 1)) {
            if (!this.f644S.m12259a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f676t * width);
                this.f644S.m12255a(height, width);
                z = false | this.f644S.m12254a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f645T.m12259a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f677u + 1.0f)) * width2);
                this.f645T.m12255a(height2, width2);
                z |= this.f645T.m12254a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f644S.m12253b();
            this.f645T.m12253b();
        }
        if (z) {
            C0309ai.m12915b(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f672p > 0 && this.f673q != null && this.f661e.size() > 0 && this.f664h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = this.f672p / width;
            C0242b c0242b = this.f661e.get(0);
            float f3 = c0242b.f699e;
            int size = this.f661e.size();
            int i = c0242b.f696b;
            int i2 = this.f661e.get(size - 1).f696b;
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                while (i4 > c0242b.f696b && i3 < size) {
                    i3++;
                    c0242b = this.f661e.get(i3);
                }
                if (i4 == c0242b.f696b) {
                    f = (c0242b.f699e + c0242b.f698d) * width;
                    f3 = c0242b.f699e + c0242b.f698d + f2;
                } else {
                    float mo7032d = this.f664h.mo7032d(i4);
                    f = (f3 + mo7032d) * width;
                    f3 += mo7032d + f2;
                }
                if (this.f672p + f > scrollX) {
                    this.f673q.setBounds(Math.round(f), this.f674r, Math.round(this.f672p + f), this.f675s);
                    this.f673q.draw(canvas);
                }
                if (f > scrollX + width) {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m13169d() {
        if (this.f627B) {
            return false;
        }
        this.f642Q = true;
        setScrollState(1);
        this.f632G = 0.0f;
        this.f634I = 0.0f;
        if (this.f637L == null) {
            this.f637L = VelocityTracker.obtain();
        } else {
            this.f637L.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f637L.addMovement(obtain);
        obtain.recycle();
        this.f643R = uptimeMillis;
        return true;
    }

    /* renamed from: e */
    public void m13167e() {
        if (!this.f642Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f664h != null) {
            VelocityTracker velocityTracker = this.f637L;
            velocityTracker.computeCurrentVelocity(1000, this.f639N);
            int m12938a = (int) C0304ag.m12938a(velocityTracker, this.f636K);
            this.f682z = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0242b m13157m = m13157m();
            m13191a(m13198a(m13157m.f696b, ((scrollX / clientWidth) - m13157m.f699e) / m13157m.f698d, m12938a, (int) (this.f632G - this.f634I)), true, true, m12938a);
        }
        m13156n();
        this.f642Q = false;
    }

    /* renamed from: b */
    public void m13179b(float f) {
        if (!this.f642Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f664h != null) {
            this.f632G += f;
            float scrollX = getScrollX() - f;
            int clientWidth = getClientWidth();
            float f2 = clientWidth * this.f676t;
            float f3 = clientWidth * this.f677u;
            C0242b c0242b = this.f661e.get(0);
            C0242b c0242b2 = this.f661e.get(this.f661e.size() - 1);
            float f4 = c0242b.f696b != 0 ? c0242b.f699e * clientWidth : f2;
            float f5 = c0242b2.f696b != this.f664h.mo938b() + (-1) ? c0242b2.f699e * clientWidth : f3;
            if (scrollX >= f4) {
                f4 = scrollX > f5 ? f5 : scrollX;
            }
            this.f632G += f4 - ((int) f4);
            scrollTo((int) f4, getScrollY());
            m13168d((int) f4);
            MotionEvent obtain = MotionEvent.obtain(this.f643R, SystemClock.uptimeMillis(), 2, this.f632G, 0.0f, 0);
            this.f637L.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: f */
    public boolean m13165f() {
        return this.f642Q;
    }

    /* renamed from: a */
    private void m13184a(MotionEvent motionEvent) {
        int m12597b = C0427t.m12597b(motionEvent);
        if (C0427t.m12596b(motionEvent, m12597b) == this.f636K) {
            int i = m12597b == 0 ? 1 : 0;
            this.f632G = C0427t.m12594c(motionEvent, i);
            this.f636K = C0427t.m12596b(motionEvent, i);
            if (this.f637L != null) {
                this.f637L.clear();
            }
        }
    }

    /* renamed from: n */
    private void m13156n() {
        this.f627B = false;
        this.f628C = false;
        if (this.f637L != null) {
            this.f637L.recycle();
            this.f637L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f681y != z) {
            this.f681y = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f664h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f676t));
        } else if (i > 0) {
            return scrollX < ((int) (((float) clientWidth) * this.f677u));
        } else {
            return false;
        }
    }

    /* renamed from: a */
    protected boolean m13182a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && m13182a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && C0309ai.m12929a(view, -i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m13185a(keyEvent);
    }

    /* renamed from: a */
    public boolean m13185a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return m13171c(17);
            case 22:
                return m13171c(66);
            case 61:
                if (Build.VERSION.SDK_INT < 11) {
                    return false;
                }
                if (C0396g.m12645a(keyEvent)) {
                    return m13171c(2);
                }
                if (!C0396g.m12644a(keyEvent, 1)) {
                    return false;
                }
                return m13171c(1);
            default:
                return false;
        }
    }

    /* renamed from: c */
    public boolean m13171c(int i) {
        View view;
        boolean z;
        boolean m13163g;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = m13190a(this.f663g, findNextFocus).left;
                int i3 = m13190a(this.f663g, view).left;
                if (view != null && i2 >= i3) {
                    m13163g = m13163g();
                } else {
                    m13163g = findNextFocus.requestFocus();
                }
            } else {
                if (i == 66) {
                    int i4 = m13190a(this.f663g, findNextFocus).left;
                    int i5 = m13190a(this.f663g, view).left;
                    if (view != null && i4 <= i5) {
                        m13163g = m13162h();
                    } else {
                        m13163g = findNextFocus.requestFocus();
                    }
                }
                m13163g = false;
            }
        } else if (i == 17 || i == 1) {
            m13163g = m13163g();
        } else {
            if (i == 66 || i == 2) {
                m13163g = m13162h();
            }
            m13163g = false;
        }
        if (m13163g) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return m13163g;
    }

    /* renamed from: a */
    private Rect m13190a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    /* renamed from: g */
    boolean m13163g() {
        if (this.f665i > 0) {
            m13194a(this.f665i - 1, true);
            return true;
        }
        return false;
    }

    /* renamed from: h */
    boolean m13162h() {
        if (this.f664h == null || this.f665i >= this.f664h.mo938b() - 1) {
            return false;
        }
        m13194a(this.f665i + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0242b m13183a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m13183a = m13183a(childAt)) != null && m13183a.f696b == this.f665i) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0242b m13183a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m13183a = m13183a(childAt)) != null && m13183a.f696b == this.f665i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        C0242b m13183a;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m13183a = m13183a(childAt)) != null && m13183a.f696b == this.f665i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0242b m13183a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m13183a = m13183a(childAt)) != null && m13183a.f696b == this.f665i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.ViewPager$c */
    /* loaded from: classes.dex */
    public class C0243c extends C0249a {
        C0243c() {
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: d */
        public void mo12429d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo12429d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0289j m13143a = C0256a.m13143a(accessibilityEvent);
            m13143a.m12980a(m13152b());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.f664h != null) {
                m13143a.m12981a(ViewPager.this.f664h.mo938b());
                m13143a.m12979b(ViewPager.this.f665i);
                m13143a.m12978c(ViewPager.this.f665i);
            }
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public void mo12432a(View view, C0261b c0261b) {
            super.mo12432a(view, c0261b);
            c0261b.m13130b(ViewPager.class.getName());
            c0261b.m13110i(m13152b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c0261b.m13142a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c0261b.m13142a(ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
            }
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public boolean mo12465a(View view, int i, Bundle bundle) {
            if (super.mo12465a(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (ViewPager.this.canScrollHorizontally(1)) {
                        ViewPager.this.setCurrentItem(ViewPager.this.f665i + 1);
                        return true;
                    }
                    return false;
                case ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES /* 8192 */:
                    if (ViewPager.this.canScrollHorizontally(-1)) {
                        ViewPager.this.setCurrentItem(ViewPager.this.f665i - 1);
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        }

        /* renamed from: b */
        private boolean m13152b() {
            return ViewPager.this.f664h != null && ViewPager.this.f664h.mo938b() > 1;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$g */
    /* loaded from: classes.dex */
    private class C0247g extends DataSetObserver {
        private C0247g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m13180b();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m13180b();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$LayoutParams */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f686a;

        /* renamed from: b */
        public int f687b;

        /* renamed from: c */
        float f688c;

        /* renamed from: d */
        boolean f689d;

        /* renamed from: e */
        int f690e;

        /* renamed from: f */
        int f691f;

        public LayoutParams() {
            super(-1, -1);
            this.f688c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f688c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f622a);
            this.f687b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.ViewPager$h */
    /* loaded from: classes.dex */
    public static class C0248h implements Comparator<View> {
        C0248h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f686a != layoutParams2.f686a) {
                return layoutParams.f686a ? 1 : -1;
            }
            return layoutParams.f690e - layoutParams2.f690e;
        }
    }
}
