package com.tsf.extend.base.support;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: A */
    private boolean f4468A;

    /* renamed from: B */
    private boolean f4469B;

    /* renamed from: C */
    private int f4470C;

    /* renamed from: D */
    private int f4471D;

    /* renamed from: E */
    private int f4472E;

    /* renamed from: F */
    private float f4473F;

    /* renamed from: G */
    private float f4474G;

    /* renamed from: H */
    private float f4475H;

    /* renamed from: I */
    private float f4476I;

    /* renamed from: J */
    private int f4477J;

    /* renamed from: K */
    private VelocityTracker f4478K;

    /* renamed from: L */
    private int f4479L;

    /* renamed from: M */
    private int f4480M;

    /* renamed from: N */
    private int f4481N;

    /* renamed from: O */
    private int f4482O;

    /* renamed from: P */
    private boolean f4483P;

    /* renamed from: Q */
    private boolean f4484Q;

    /* renamed from: R */
    private boolean f4485R;

    /* renamed from: S */
    private boolean f4486S;

    /* renamed from: T */
    private int f4487T;

    /* renamed from: U */
    private InterfaceC1464e f4488U;

    /* renamed from: V */
    private InterfaceC1464e f4489V;

    /* renamed from: W */
    private InterfaceC1463d f4490W;

    /* renamed from: aa */
    private InterfaceC1465f f4491aa;

    /* renamed from: ab */
    private Method f4492ab;

    /* renamed from: ac */
    private int f4493ac;

    /* renamed from: ad */
    private ArrayList<View> f4494ad;

    /* renamed from: af */
    private final Runnable f4495af;

    /* renamed from: ag */
    private int f4496ag;

    /* renamed from: b */
    private int f4497b;

    /* renamed from: e */
    private final ArrayList<C1461b> f4498e;

    /* renamed from: f */
    private final C1461b f4499f;

    /* renamed from: g */
    private final Rect f4500g;

    /* renamed from: h */
    private AbstractC1468a f4501h;

    /* renamed from: i */
    private int f4502i;

    /* renamed from: j */
    private int f4503j;

    /* renamed from: k */
    private Parcelable f4504k;

    /* renamed from: l */
    private ClassLoader f4505l;

    /* renamed from: m */
    private Scroller f4506m;

    /* renamed from: n */
    private C1466g f4507n;

    /* renamed from: o */
    private int f4508o;

    /* renamed from: p */
    private Drawable f4509p;

    /* renamed from: q */
    private int f4510q;

    /* renamed from: r */
    private int f4511r;

    /* renamed from: s */
    private float f4512s;

    /* renamed from: t */
    private float f4513t;

    /* renamed from: u */
    private int f4514u;

    /* renamed from: v */
    private int f4515v;

    /* renamed from: w */
    private boolean f4516w;

    /* renamed from: x */
    private boolean f4517x;

    /* renamed from: y */
    private boolean f4518y;

    /* renamed from: z */
    private int f4519z;

    /* renamed from: a */
    private static final int[] f4464a = {16842931};

    /* renamed from: c */
    private static final Comparator<C1461b> f4466c = new Comparator<C1461b>() { // from class: com.tsf.extend.base.support.ViewPager.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1461b c1461b, C1461b c1461b2) {
            return c1461b.f4531b - c1461b2.f4531b;
        }
    };

    /* renamed from: d */
    private static final Interpolator f4467d = new Interpolator() { // from class: com.tsf.extend.base.support.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: ae */
    private static final C1467h f4465ae = new C1467h();

    /* renamed from: com.tsf.extend.base.support.ViewPager$a */
    /* loaded from: classes.dex */
    interface InterfaceC1460a {
    }

    /* renamed from: com.tsf.extend.base.support.ViewPager$d */
    /* loaded from: classes.dex */
    interface InterfaceC1463d {
        /* renamed from: a */
        void m8514a(AbstractC1468a abstractC1468a, AbstractC1468a abstractC1468a2);
    }

    /* renamed from: com.tsf.extend.base.support.ViewPager$e */
    /* loaded from: classes.dex */
    public interface InterfaceC1464e {
        /* renamed from: a */
        void mo6728a(int i);

        /* renamed from: a */
        void mo6727a(int i, float f, int i2);

        /* renamed from: b */
        void mo6723b(int i);
    }

    /* renamed from: com.tsf.extend.base.support.ViewPager$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1465f {
        /* renamed from: a */
        void m8513a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.support.ViewPager$b */
    /* loaded from: classes.dex */
    public static class C1461b {

        /* renamed from: a */
        Object f4530a;

        /* renamed from: b */
        int f4531b;

        /* renamed from: c */
        boolean f4532c;

        /* renamed from: d */
        float f4533d;

        /* renamed from: e */
        float f4534e;

        C1461b() {
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f4498e = new ArrayList<>();
        this.f4499f = new C1461b();
        this.f4500g = new Rect();
        this.f4503j = -1;
        this.f4504k = null;
        this.f4505l = null;
        this.f4512s = -3.4028235E38f;
        this.f4513t = Float.MAX_VALUE;
        this.f4519z = 1;
        this.f4477J = -1;
        this.f4484Q = true;
        this.f4485R = false;
        this.f4495af = new Runnable() { // from class: com.tsf.extend.base.support.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.m8532c();
            }
        };
        this.f4496ag = 0;
        m8561a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4498e = new ArrayList<>();
        this.f4499f = new C1461b();
        this.f4500g = new Rect();
        this.f4503j = -1;
        this.f4504k = null;
        this.f4505l = null;
        this.f4512s = -3.4028235E38f;
        this.f4513t = Float.MAX_VALUE;
        this.f4519z = 1;
        this.f4477J = -1;
        this.f4484Q = true;
        this.f4485R = false;
        this.f4495af = new Runnable() { // from class: com.tsf.extend.base.support.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.m8532c();
            }
        };
        this.f4496ag = 0;
        m8561a();
    }

    /* renamed from: a */
    void m8561a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4506m = new Scroller(context, f4467d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4472E = viewConfiguration.getScaledPagingTouchSlop();
        this.f4479L = (int) (400.0f * f);
        this.f4480M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4481N = (int) (25.0f * f);
        this.f4482O = (int) (2.0f * f);
        this.f4470C = (int) (f * 16.0f);
        setAccessibilityDelegate(new C1462c());
        if (m8527d(this)) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f4495af);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.f4496ag != i) {
            this.f4496ag = i;
            if (this.f4491aa != null) {
                m8533b(i != 0);
            }
            if (this.f4488U != null) {
                this.f4488U.mo6723b(i);
            }
        }
    }

    public void setAdapter(AbstractC1468a abstractC1468a) {
        if (this.f4501h != null) {
            this.f4501h.m8503b(this.f4507n);
            this.f4501h.m8506a((ViewGroup) this);
            for (int i = 0; i < this.f4498e.size(); i++) {
                C1461b c1461b = this.f4498e.get(i);
                this.f4501h.mo6709a((ViewGroup) this, c1461b.f4531b, c1461b.f4530a);
            }
            this.f4501h.m8500b((ViewGroup) this);
            this.f4498e.clear();
            m8524g();
            this.f4502i = 0;
            scrollTo(0, 0);
        }
        AbstractC1468a abstractC1468a2 = this.f4501h;
        this.f4501h = abstractC1468a;
        this.f4497b = 0;
        if (this.f4501h != null) {
            if (this.f4507n == null) {
                this.f4507n = new C1466g();
            }
            this.f4501h.m8511a((DataSetObserver) this.f4507n);
            this.f4518y = false;
            boolean z = this.f4484Q;
            this.f4484Q = true;
            this.f4497b = this.f4501h.mo6712a();
            if (this.f4503j >= 0) {
                this.f4501h.m8510a(this.f4504k, this.f4505l);
                m8550a(this.f4503j, false, true);
                this.f4503j = -1;
                this.f4504k = null;
                this.f4505l = null;
            } else if (!z) {
                m8532c();
            } else {
                requestLayout();
            }
        }
        if (this.f4490W != null && abstractC1468a2 != abstractC1468a) {
            this.f4490W.m8514a(abstractC1468a2, abstractC1468a);
        }
    }

    /* renamed from: g */
    private void m8524g() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f4521a) {
                    removeViewAt(i2);
                    i2--;
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public AbstractC1468a getAdapter() {
        return this.f4501h;
    }

    void setOnAdapterChangeListener(InterfaceC1463d interfaceC1463d) {
        this.f4490W = interfaceC1463d;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.f4518y = false;
        m8550a(i, !this.f4484Q, false);
    }

    /* renamed from: a */
    public void m8552a(int i, boolean z) {
        this.f4518y = false;
        m8550a(i, z, false);
    }

    public int getCurrentItem() {
        return this.f4502i;
    }

    /* renamed from: a */
    void m8550a(int i, boolean z, boolean z2) {
        m8549a(i, z, z2, 0);
    }

    /* renamed from: a */
    void m8549a(int i, boolean z, boolean z2, int i2) {
        if (this.f4501h == null || this.f4501h.mo6712a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (!z2 && this.f4502i == i && this.f4498e.size() != 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f4501h.mo6712a()) {
                i = this.f4501h.mo6712a() - 1;
            }
            int i3 = this.f4519z;
            if (i > this.f4502i + i3 || i < this.f4502i - i3) {
                for (int i4 = 0; i4 < this.f4498e.size(); i4++) {
                    this.f4498e.get(i4).f4532c = true;
                }
            }
            boolean z3 = this.f4502i != i;
            if (this.f4484Q) {
                this.f4502i = i;
                if (z3 && this.f4488U != null) {
                    this.f4488U.mo6728a(i);
                }
                if (z3 && this.f4489V != null) {
                    this.f4489V.mo6728a(i);
                }
                requestLayout();
                return;
            }
            m8558a(i);
            m8551a(i, z, i2, z3);
        }
    }

    /* renamed from: a */
    private void m8551a(int i, boolean z, int i2, boolean z2) {
        int i3;
        C1461b m8536b = m8536b(i);
        if (m8536b != null) {
            i3 = (int) (Math.max(this.f4512s, Math.min(m8536b.f4534e, this.f4513t)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            m8554a(i3, 0, i2);
            if (z2 && this.f4488U != null) {
                this.f4488U.mo6728a(i);
            }
            if (z2 && this.f4489V != null) {
                this.f4489V.mo6728a(i);
                return;
            }
            return;
        }
        if (z2 && this.f4488U != null) {
            this.f4488U.mo6728a(i);
        }
        if (z2 && this.f4489V != null) {
            this.f4489V.mo6728a(i);
        }
        m8539a(false);
        scrollTo(i3, 0);
    }

    public void setOnPageChangeListener(InterfaceC1464e interfaceC1464e) {
        this.f4488U = interfaceC1464e;
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.f4492ab == null) {
                try {
                    this.f4492ab = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.f4492ab.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f4493ac == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f4494ad.get(i2).getLayoutParams()).f4526f;
    }

    public int getOffscreenPageLimit() {
        return this.f4519z;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f4519z) {
            this.f4519z = i;
            m8532c();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f4508o;
        this.f4508o = i;
        int width = getWidth();
        m8553a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.f4508o;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4509p = drawable;
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
        return super.verifyDrawable(drawable) || drawable == this.f4509p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4509p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    float m8560a(float f) {
        return (float) Math.sin((float) ((f - 0.5f) * 0.4712389167638204d));
    }

    /* renamed from: a */
    void m8554a(int i, int i2, int i3) {
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m8539a(false);
            m8532c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float m8560a = (i6 * m8560a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth))) + i6;
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(1000.0f * Math.abs(m8560a / abs2)) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / ((clientWidth * this.f4501h.mo8176a(this.f4502i)) + this.f4508o)) + 1.0f) * 100.0f);
        }
        this.f4506m.startScroll(scrollX, scrollY, i4, i5, Math.min(abs, 600));
        m8530c(this);
    }

    /* renamed from: a */
    C1461b m8555a(int i, int i2) {
        C1461b c1461b = new C1461b();
        c1461b.f4531b = i;
        c1461b.f4530a = this.f4501h.mo6710a((ViewGroup) this, i);
        c1461b.f4533d = this.f4501h.mo8176a(i);
        if (i2 < 0 || i2 >= this.f4498e.size()) {
            this.f4498e.add(c1461b);
        } else {
            this.f4498e.add(i2, c1461b);
        }
        return c1461b;
    }

    /* renamed from: b */
    void m8538b() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int mo6712a = this.f4501h.mo6712a();
        this.f4497b = mo6712a;
        boolean z3 = this.f4498e.size() < (this.f4519z * 2) + 1 && this.f4498e.size() < mo6712a;
        boolean z4 = false;
        int i3 = this.f4502i;
        boolean z5 = z3;
        int i4 = 0;
        while (i4 < this.f4498e.size()) {
            C1461b c1461b = this.f4498e.get(i4);
            int m8505a = this.f4501h.m8505a(c1461b.f4530a);
            if (m8505a == -1) {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            } else if (m8505a == -2) {
                this.f4498e.remove(i4);
                int i5 = i4 - 1;
                if (!z4) {
                    this.f4501h.m8506a((ViewGroup) this);
                    z4 = true;
                }
                this.f4501h.mo6709a((ViewGroup) this, c1461b.f4531b, c1461b.f4530a);
                if (this.f4502i == c1461b.f4531b) {
                    i = i5;
                    z = z4;
                    i2 = Math.max(0, Math.min(this.f4502i, mo6712a - 1));
                    z2 = true;
                } else {
                    i = i5;
                    z = z4;
                    i2 = i3;
                    z2 = true;
                }
            } else if (c1461b.f4531b != m8505a) {
                if (c1461b.f4531b == this.f4502i) {
                    i3 = m8505a;
                }
                c1461b.f4531b = m8505a;
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
            this.f4501h.m8500b((ViewGroup) this);
        }
        Collections.sort(this.f4498e, f4466c);
        if (z5) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                if (!layoutParams.f4521a) {
                    layoutParams.f4523c = 0.0f;
                }
            }
            m8550a(i3, false, true);
            requestLayout();
        }
    }

    /* renamed from: c */
    void m8532c() {
        m8558a(this.f4502i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
        if (r2.f4531b == r18.f4502i) goto L29;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m8558a(int r19) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.support.ViewPager.m8558a(int):void");
    }

    /* renamed from: h */
    private void m8523h() {
        if (this.f4493ac != 0) {
            if (this.f4494ad == null) {
                this.f4494ad = new ArrayList<>();
            } else {
                this.f4494ad.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f4494ad.add(getChildAt(i));
            }
            Collections.sort(this.f4494ad, f4465ae);
        }
    }

    /* renamed from: a */
    private void m8542a(C1461b c1461b, int i, C1461b c1461b2) {
        C1461b c1461b3;
        C1461b c1461b4;
        int mo6712a = this.f4501h.mo6712a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f4508o / clientWidth : 0.0f;
        if (c1461b2 != null) {
            int i2 = c1461b2.f4531b;
            if (i2 < c1461b.f4531b) {
                float f2 = c1461b2.f4534e + c1461b2.f4533d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= c1461b.f4531b && i4 < this.f4498e.size()) {
                    C1461b c1461b5 = this.f4498e.get(i4);
                    while (true) {
                        c1461b4 = c1461b5;
                        if (i3 <= c1461b4.f4531b || i4 >= this.f4498e.size() - 1) {
                            break;
                        }
                        i4++;
                        c1461b5 = this.f4498e.get(i4);
                    }
                    while (i3 < c1461b4.f4531b) {
                        f2 += this.f4501h.mo8176a(i3) + f;
                        i3++;
                    }
                    c1461b4.f4534e = f2;
                    f2 += c1461b4.f4533d + f;
                    i3++;
                }
            } else if (i2 > c1461b.f4531b) {
                int size = this.f4498e.size() - 1;
                float f3 = c1461b2.f4534e;
                int i5 = i2 - 1;
                while (i5 >= c1461b.f4531b && size >= 0) {
                    C1461b c1461b6 = this.f4498e.get(size);
                    while (true) {
                        c1461b3 = c1461b6;
                        if (i5 >= c1461b3.f4531b || size <= 0) {
                            break;
                        }
                        size--;
                        c1461b6 = this.f4498e.get(size);
                    }
                    while (i5 > c1461b3.f4531b) {
                        f3 -= this.f4501h.mo8176a(i5) + f;
                        i5--;
                    }
                    f3 -= c1461b3.f4533d + f;
                    c1461b3.f4534e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f4498e.size();
        float f4 = c1461b.f4534e;
        int i6 = c1461b.f4531b - 1;
        this.f4512s = c1461b.f4531b == 0 ? c1461b.f4534e : -3.4028235E38f;
        this.f4513t = c1461b.f4531b == mo6712a + (-1) ? (c1461b.f4534e + c1461b.f4533d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            C1461b c1461b7 = this.f4498e.get(i7);
            float f5 = f4;
            while (i6 > c1461b7.f4531b) {
                f5 -= this.f4501h.mo8176a(i6) + f;
                i6--;
            }
            f4 = f5 - (c1461b7.f4533d + f);
            c1461b7.f4534e = f4;
            if (c1461b7.f4531b == 0) {
                this.f4512s = f4;
            }
            i6--;
        }
        float f6 = c1461b.f4534e + c1461b.f4533d + f;
        int i8 = c1461b.f4531b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            C1461b c1461b8 = this.f4498e.get(i9);
            float f7 = f6;
            while (i8 < c1461b8.f4531b) {
                f7 = this.f4501h.mo8176a(i8) + f + f7;
                i8++;
            }
            if (c1461b8.f4531b == mo6712a - 1) {
                this.f4513t = (c1461b8.f4533d + f7) - 1.0f;
            }
            c1461b8.f4534e = f7;
            f6 = f7 + c1461b8.f4533d + f;
            i8++;
        }
        this.f4485R = false;
    }

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.tsf.extend.base.support.ViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f4527a;

        /* renamed from: b */
        Parcelable f4528b;

        /* renamed from: c */
        ClassLoader f4529c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f4529c = getClass().getClassLoader();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4527a);
            parcel.writeParcelable(this.f4528b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4527a + "}";
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4529c = getClass().getClassLoader();
            this.f4527a = parcel.readInt();
            this.f4528b = parcel.readParcelable(this.f4529c);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4527a = this.f4502i;
        if (this.f4501h != null) {
            savedState.f4528b = this.f4501h.m8504b();
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
        if (this.f4501h != null) {
            this.f4501h.m8510a(savedState.f4528b, savedState.f4529c);
            m8550a(savedState.f4527a, false, true);
            return;
        }
        this.f4503j = savedState.f4527a;
        this.f4504k = savedState.f4528b;
        this.f4505l = savedState.f4529c;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.f4521a |= view instanceof InterfaceC1460a;
        if (this.f4516w) {
            if (layoutParams2 != null && layoutParams2.f4521a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f4524d = true;
            addViewInLayout(view, i, generateLayoutParams);
            return;
        }
        super.addView(view, i, generateLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f4516w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: a */
    C1461b m8545a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f4498e.size()) {
                C1461b c1461b = this.f4498e.get(i2);
                if (!this.f4501h.mo6711a(view, c1461b.f4530a)) {
                    i = i2 + 1;
                } else {
                    return c1461b;
                }
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    C1461b m8535b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return m8545a(view);
            }
        }
        return null;
    }

    /* renamed from: b */
    C1461b m8536b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.f4498e.size()) {
                C1461b c1461b = this.f4498e.get(i3);
                if (c1461b.f4531b != i) {
                    i2 = i3 + 1;
                } else {
                    return c1461b;
                }
            } else {
                return null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4484Q = true;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.support.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m8553a(i, i3, this.f4508o, this.f4508o);
        }
    }

    /* renamed from: a */
    private void m8553a(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f4498e.isEmpty()) {
            int paddingLeft = (int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
            scrollTo(paddingLeft, getScrollY());
            if (!this.f4506m.isFinished()) {
                this.f4506m.startScroll(paddingLeft, 0, (int) (m8536b(this.f4502i).f4534e * i), 0, this.f4506m.getDuration() - this.f4506m.timePassed());
                return;
            }
            return;
        }
        C1461b m8536b = m8536b(this.f4502i);
        int min = (int) ((m8536b != null ? Math.min(m8536b.f4534e, this.f4513t) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            m8539a(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1461b m8545a;
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
                if (layoutParams.f4521a) {
                    int i14 = layoutParams.f4522b & 7;
                    int i15 = layoutParams.f4522b & 112;
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
                if (!layoutParams2.f4521a && (m8545a = m8545a(childAt2)) != null) {
                    int i22 = ((int) (m8545a.f4534e * i20)) + paddingLeft;
                    if (layoutParams2.f4524d) {
                        layoutParams2.f4524d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams2.f4523c * i20), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f4510q = paddingTop;
        this.f4511r = i11 - paddingBottom;
        this.f4487T = i12;
        if (this.f4484Q) {
            m8551a(this.f4502i, false, 0, false);
        }
        this.f4484Q = false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.f4506m.isFinished() && this.f4506m.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f4506m.getCurrX();
            int currY = this.f4506m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m8528d(currX)) {
                    this.f4506m.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            m8530c(this);
            return;
        }
        m8539a(true);
    }

    /* renamed from: d */
    private boolean m8528d(int i) {
        if (this.f4498e.size() == 0) {
            this.f4486S = false;
            m8557a(0, 0.0f, 0);
            if (this.f4486S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1461b m8522i = m8522i();
        int clientWidth = getClientWidth();
        int i2 = this.f4508o + clientWidth;
        float f = this.f4508o / clientWidth;
        int i3 = m8522i.f4531b;
        float f2 = ((i / clientWidth) - m8522i.f4534e) / (m8522i.f4533d + f);
        this.f4486S = false;
        m8557a(i3, f2, (int) (i2 * f2));
        if (!this.f4486S) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    /* renamed from: a */
    protected void m8557a(int i, float f, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.f4487T > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4521a) {
                    switch (layoutParams.f4522b & 7) {
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
        if (this.f4488U != null) {
            this.f4488U.mo6727a(i, f, i2);
        }
        if (this.f4489V != null) {
            this.f4489V.mo6727a(i, f, i2);
        }
        if (this.f4491aa != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).f4521a) {
                    this.f4491aa.m8513a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f4486S = true;
    }

    /* renamed from: a */
    private void m8539a(boolean z) {
        boolean z2 = this.f4496ag == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f4506m.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f4506m.getCurrX();
            int currY = this.f4506m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f4518y = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f4498e.size(); i++) {
            C1461b c1461b = this.f4498e.get(i);
            if (c1461b.f4532c) {
                c1461b.f4532c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                m8544a(this, this.f4495af);
            } else {
                this.f4495af.run();
            }
        }
    }

    /* renamed from: a */
    private boolean m8559a(float f, float f2) {
        return (f < ((float) this.f4471D) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f4471D)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m8533b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? 2 : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f4468A = false;
            this.f4469B = false;
            this.f4477J = -1;
            if (this.f4478K != null) {
                this.f4478K.recycle();
                this.f4478K = null;
                return false;
            }
            return false;
        }
        if (action != 0) {
            if (this.f4468A) {
                return true;
            }
            if (this.f4469B) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.f4475H = x;
                this.f4473F = x;
                float y = motionEvent.getY();
                this.f4476I = y;
                this.f4474G = y;
                this.f4477J = motionEvent.getPointerId(0);
                this.f4469B = false;
                this.f4506m.computeScrollOffset();
                if (this.f4496ag == 2 && Math.abs(this.f4506m.getFinalX() - this.f4506m.getCurrX()) > this.f4482O) {
                    this.f4506m.abortAnimation();
                    this.f4518y = false;
                    m8532c();
                    this.f4468A = true;
                    setScrollState(1);
                    break;
                } else {
                    m8539a(false);
                    this.f4468A = false;
                    break;
                }
                break;
            case 2:
                int i = this.f4477J;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.f4473F;
                    float abs = Math.abs(f);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.f4476I);
                    if (f != 0.0f && !m8559a(this.f4473F, f) && m8543a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f4473F = x2;
                        this.f4474G = y2;
                        this.f4469B = true;
                        return false;
                    }
                    if (abs > this.f4472E && 0.5f * abs > abs2) {
                        this.f4468A = true;
                        setScrollState(1);
                        this.f4473F = f > 0.0f ? this.f4475H + this.f4472E : this.f4475H - this.f4472E;
                        this.f4474G = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > this.f4472E) {
                        this.f4469B = true;
                    }
                    if (this.f4468A && m8537b(x2)) {
                        m8530c(this);
                        break;
                    }
                }
                break;
            case 6:
                m8546a(motionEvent);
                break;
        }
        if (this.f4478K == null) {
            this.f4478K = VelocityTracker.obtain();
        }
        this.f4478K.addMovement(motionEvent);
        return this.f4468A;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f4483P) {
            return true;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
            if (this.f4501h == null || this.f4501h.mo6712a() == 0) {
                return false;
            }
            if (this.f4478K == null) {
                this.f4478K = VelocityTracker.obtain();
            }
            this.f4478K.addMovement(motionEvent);
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.f4506m.abortAnimation();
                    this.f4518y = false;
                    m8532c();
                    this.f4468A = true;
                    setScrollState(1);
                    float x = motionEvent.getX();
                    this.f4475H = x;
                    this.f4473F = x;
                    float y = motionEvent.getY();
                    this.f4476I = y;
                    this.f4474G = y;
                    this.f4477J = motionEvent.getPointerId(0);
                    break;
                case 1:
                    if (this.f4468A) {
                        VelocityTracker velocityTracker = this.f4478K;
                        velocityTracker.computeCurrentVelocity(1000, this.f4480M);
                        int xVelocity = (int) velocityTracker.getXVelocity(this.f4477J);
                        this.f4518y = true;
                        int clientWidth = getClientWidth();
                        int scrollX = getScrollX();
                        C1461b m8522i = m8522i();
                        m8549a(m8556a(m8522i.f4531b, ((scrollX / clientWidth) - m8522i.f4534e) / m8522i.f4533d, xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f4477J)) - this.f4475H)), true, true, xVelocity);
                        this.f4477J = -1;
                        m8521j();
                        break;
                    }
                    break;
                case 2:
                    if (!this.f4468A) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f4477J);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f4473F);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f4474G);
                        if (abs > this.f4472E && abs > abs2) {
                            this.f4468A = true;
                            this.f4473F = x2 - this.f4475H > 0.0f ? this.f4475H + this.f4472E : this.f4475H - this.f4472E;
                            this.f4474G = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                        }
                    }
                    if (this.f4468A) {
                        z = false | m8537b(motionEvent.getX(motionEvent.findPointerIndex(this.f4477J)));
                        break;
                    }
                    break;
                case 3:
                    if (this.f4468A) {
                        m8551a(this.f4502i, true, 0, false);
                        this.f4477J = -1;
                        m8521j();
                        break;
                    }
                    break;
                case 5:
                    int actionIndex = motionEvent.getActionIndex();
                    this.f4473F = motionEvent.getX(actionIndex);
                    this.f4477J = motionEvent.getPointerId(actionIndex);
                    break;
                case 6:
                    m8546a(motionEvent);
                    this.f4473F = motionEvent.getX(motionEvent.findPointerIndex(this.f4477J));
                    break;
            }
            if (z) {
                m8530c(this);
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m8537b(float f) {
        this.f4473F = f;
        float scrollX = getScrollX() + (this.f4473F - f);
        int clientWidth = getClientWidth();
        float f2 = clientWidth * this.f4512s;
        float f3 = clientWidth * this.f4513t;
        C1461b c1461b = this.f4498e.get(0);
        C1461b c1461b2 = this.f4498e.get(this.f4498e.size() - 1);
        float f4 = c1461b.f4531b != 0 ? c1461b.f4534e * clientWidth : f2;
        float f5 = c1461b2.f4531b != this.f4501h.mo6712a() + (-1) ? c1461b2.f4534e * clientWidth : f3;
        if (scrollX >= f4) {
            f4 = scrollX > f5 ? f5 : scrollX;
        }
        this.f4473F += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        m8528d((int) f4);
        return false;
    }

    /* renamed from: i */
    private C1461b m8522i() {
        int i;
        C1461b c1461b;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.f4508o / clientWidth : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        C1461b c1461b2 = null;
        while (i3 < this.f4498e.size()) {
            C1461b c1461b3 = this.f4498e.get(i3);
            if (z || c1461b3.f4531b == i2 + 1) {
                i = i3;
                c1461b = c1461b3;
            } else {
                C1461b c1461b4 = this.f4499f;
                c1461b4.f4534e = f2 + f3 + f;
                c1461b4.f4531b = i2 + 1;
                c1461b4.f4533d = this.f4501h.mo8176a(c1461b4.f4531b);
                i = i3 - 1;
                c1461b = c1461b4;
            }
            float f4 = c1461b.f4534e;
            float f5 = c1461b.f4533d + f4 + f;
            if (z || scrollX >= f4) {
                if (scrollX < f5 || i == this.f4498e.size() - 1) {
                    return c1461b;
                }
                f3 = f4;
                i2 = c1461b.f4531b;
                z = false;
                f2 = c1461b.f4533d;
                c1461b2 = c1461b;
                i3 = i + 1;
            } else {
                return c1461b2;
            }
        }
        return c1461b2;
    }

    /* renamed from: a */
    private int m8556a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.f4481N && Math.abs(i2) > this.f4479L) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            i = (int) ((i >= this.f4502i ? 0.4f : 0.6f) + i + f);
        }
        if (this.f4498e.size() > 0) {
            return Math.max(this.f4498e.get(0).f4531b, Math.min(i, this.f4498e.get(this.f4498e.size() - 1).f4531b));
        }
        return i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f4508o > 0 && this.f4509p != null && this.f4498e.size() > 0 && this.f4501h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = this.f4508o / width;
            C1461b c1461b = this.f4498e.get(0);
            float f3 = c1461b.f4534e;
            int size = this.f4498e.size();
            int i = c1461b.f4531b;
            int i2 = this.f4498e.get(size - 1).f4531b;
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                while (i4 > c1461b.f4531b && i3 < size) {
                    i3++;
                    c1461b = this.f4498e.get(i3);
                }
                if (i4 == c1461b.f4531b) {
                    f = (c1461b.f4534e + c1461b.f4533d) * width;
                    f3 = c1461b.f4534e + c1461b.f4533d + f2;
                } else {
                    float mo8176a = this.f4501h.mo8176a(i4);
                    f = (f3 + mo8176a) * width;
                    f3 += mo8176a + f2;
                }
                if (this.f4508o + f > scrollX) {
                    this.f4509p.setBounds((int) f, this.f4510q, (int) (this.f4508o + f + 0.5f), this.f4511r);
                    this.f4509p.draw(canvas);
                }
                if (f > scrollX + width) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m8546a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4477J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4473F = motionEvent.getX(i);
            this.f4477J = motionEvent.getPointerId(i);
            if (this.f4478K != null) {
                this.f4478K.clear();
            }
        }
    }

    /* renamed from: j */
    private void m8521j() {
        this.f4468A = false;
        this.f4469B = false;
        if (this.f4478K != null) {
            this.f4478K.recycle();
            this.f4478K = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f4517x != z) {
            this.f4517x = z;
        }
    }

    /* renamed from: a */
    protected boolean m8543a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && m8543a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m8547a(keyEvent);
    }

    /* renamed from: a */
    public boolean m8547a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return m8531c(17);
            case 22:
                return m8531c(66);
            case 61:
                if (Build.VERSION.SDK_INT < 11) {
                    return false;
                }
                if (keyEvent.hasNoModifiers()) {
                    return m8531c(2);
                }
                if (!keyEvent.hasModifiers(1)) {
                    return false;
                }
                return m8531c(1);
            default:
                return false;
        }
    }

    /* renamed from: c */
    public boolean m8531c(int i) {
        View view;
        boolean z;
        boolean m8529d;
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
                int i2 = m8548a(this.f4500g, findNextFocus).left;
                int i3 = m8548a(this.f4500g, view).left;
                if (view != null && i2 >= i3) {
                    m8529d = m8529d();
                } else {
                    m8529d = findNextFocus.requestFocus();
                }
            } else {
                if (i == 66) {
                    int i4 = m8548a(this.f4500g, findNextFocus).left;
                    int i5 = m8548a(this.f4500g, view).left;
                    if (view != null && i4 <= i5) {
                        m8529d = m8526e();
                    } else {
                        m8529d = findNextFocus.requestFocus();
                    }
                }
                m8529d = false;
            }
        } else if (i == 17 || i == 1) {
            m8529d = m8529d();
        } else {
            if (i == 66 || i == 2) {
                m8529d = m8526e();
            }
            m8529d = false;
        }
        if (m8529d) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return m8529d;
    }

    /* renamed from: a */
    private Rect m8548a(Rect rect, View view) {
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

    /* renamed from: d */
    boolean m8529d() {
        if (this.f4502i > 0) {
            m8552a(this.f4502i - 1, true);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    boolean m8526e() {
        if (this.f4501h == null || this.f4502i >= this.f4501h.mo6712a() - 1) {
            return false;
        }
        m8552a(this.f4502i + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1461b m8545a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m8545a = m8545a(childAt)) != null && m8545a.f4531b == this.f4502i) {
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
        C1461b m8545a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m8545a = m8545a(childAt)) != null && m8545a.f4531b == this.f4502i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        C1461b m8545a;
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
            if (childAt.getVisibility() == 0 && (m8545a = m8545a(childAt)) != null && m8545a.f4531b == this.f4502i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1461b m8545a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m8545a = m8545a(childAt)) != null && m8545a.f4531b == this.f4502i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
    /* renamed from: com.tsf.extend.base.support.ViewPager$c */
    /* loaded from: classes.dex */
    public class C1462c extends View.AccessibilityDelegate {
        C1462c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecord obtain = AccessibilityRecord.obtain();
            obtain.setScrollable(m8517a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.f4501h != null) {
                obtain.setItemCount(ViewPager.this.f4501h.mo6712a());
                obtain.setFromIndex(ViewPager.this.f4502i);
                obtain.setToIndex(ViewPager.this.f4502i);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ViewPager.class.getName());
            accessibilityNodeInfo.setScrollable(m8517a());
            if (m8516b()) {
                accessibilityNodeInfo.addAction(4096);
            }
            if (m8515c()) {
                accessibilityNodeInfo.addAction(ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (m8516b()) {
                        ViewPager.this.setCurrentItem(ViewPager.this.f4502i + 1);
                        return true;
                    }
                    return false;
                case ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES /* 8192 */:
                    if (m8515c()) {
                        ViewPager.this.setCurrentItem(ViewPager.this.f4502i - 1);
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        }

        /* renamed from: a */
        private boolean m8517a() {
            return ViewPager.this.f4501h != null && ViewPager.this.f4501h.mo6712a() > 1;
        }

        /* renamed from: b */
        private boolean m8516b() {
            return ViewPager.this.f4501h != null && ViewPager.this.f4502i >= 0 && ViewPager.this.f4502i < ViewPager.this.f4501h.mo6712a() + (-1);
        }

        /* renamed from: c */
        private boolean m8515c() {
            return ViewPager.this.f4501h != null && ViewPager.this.f4502i > 0 && ViewPager.this.f4502i < ViewPager.this.f4501h.mo6712a();
        }
    }

    /* renamed from: com.tsf.extend.base.support.ViewPager$g */
    /* loaded from: classes.dex */
    private class C1466g extends DataSetObserver {
        private C1466g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m8538b();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m8538b();
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f4521a;

        /* renamed from: b */
        public int f4522b;

        /* renamed from: c */
        float f4523c;

        /* renamed from: d */
        boolean f4524d;

        /* renamed from: e */
        int f4525e;

        /* renamed from: f */
        int f4526f;

        public LayoutParams() {
            super(-1, -1);
            this.f4523c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4523c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4464a);
            this.f4522b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    static void m8530c(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.invalidate();
        }
    }

    /* renamed from: d */
    static boolean m8527d(View view) {
        return Build.VERSION.SDK_INT >= 16 && view.getImportantForAccessibility() == 0;
    }

    /* renamed from: a */
    static void m8544a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 10L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.support.ViewPager$h */
    /* loaded from: classes.dex */
    public static class C1467h implements Comparator<View> {
        C1467h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f4521a != layoutParams2.f4521a) {
                return layoutParams.f4521a ? 1 : -1;
            }
            return layoutParams.f4525e - layoutParams2.f4525e;
        }
    }
}
