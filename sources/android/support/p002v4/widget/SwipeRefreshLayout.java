package android.support.p002v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p002v4.view.C0297aa;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0427t;
import android.support.p002v4.view.C0437y;
import android.support.p002v4.view.InterfaceC0436x;
import android.support.p002v4.view.InterfaceC0438z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
/* renamed from: android.support.v4.widget.SwipeRefreshLayout */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0436x, InterfaceC0438z {

    /* renamed from: c */
    private static final String f928c = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: y */
    private static final int[] f929y = {16842766};

    /* renamed from: A */
    private int f930A;

    /* renamed from: B */
    private float f931B;

    /* renamed from: C */
    private C0512r f932C;

    /* renamed from: D */
    private Animation f933D;

    /* renamed from: E */
    private Animation f934E;

    /* renamed from: F */
    private Animation f935F;

    /* renamed from: G */
    private Animation f936G;

    /* renamed from: H */
    private Animation f937H;

    /* renamed from: I */
    private float f938I;

    /* renamed from: J */
    private boolean f939J;

    /* renamed from: K */
    private int f940K;

    /* renamed from: L */
    private int f941L;

    /* renamed from: M */
    private boolean f942M;

    /* renamed from: N */
    private Animation.AnimationListener f943N;

    /* renamed from: O */
    private final Animation f944O;

    /* renamed from: P */
    private final Animation f945P;

    /* renamed from: a */
    protected int f946a;

    /* renamed from: b */
    protected int f947b;

    /* renamed from: d */
    private View f948d;

    /* renamed from: e */
    private InterfaceC0471a f949e;

    /* renamed from: f */
    private boolean f950f;

    /* renamed from: g */
    private int f951g;

    /* renamed from: h */
    private float f952h;

    /* renamed from: i */
    private float f953i;

    /* renamed from: j */
    private final C0297aa f954j;

    /* renamed from: k */
    private final C0437y f955k;

    /* renamed from: l */
    private final int[] f956l;

    /* renamed from: m */
    private final int[] f957m;

    /* renamed from: n */
    private boolean f958n;

    /* renamed from: o */
    private int f959o;

    /* renamed from: p */
    private int f960p;

    /* renamed from: q */
    private boolean f961q;

    /* renamed from: r */
    private float f962r;

    /* renamed from: s */
    private float f963s;

    /* renamed from: t */
    private boolean f964t;

    /* renamed from: u */
    private int f965u;

    /* renamed from: v */
    private boolean f966v;

    /* renamed from: w */
    private boolean f967w;

    /* renamed from: x */
    private final DecelerateInterpolator f968x;

    /* renamed from: z */
    private C0482b f969z;

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0471a {
        /* renamed from: a */
        void m12387a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12408b() {
        this.f969z.clearAnimation();
        this.f932C.stop();
        this.f969z.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f966v) {
            setAnimationProgress(0.0f);
        } else {
            m12419a(this.f947b - this.f960p, true);
        }
        this.f960p = this.f969z.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12408b();
    }

    private void setColorViewAlpha(int i) {
        this.f969z.getBackground().setAlpha(i);
        this.f932C.setAlpha(i);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.f940K = i2;
                this.f941L = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.f940K = i3;
                this.f941L = i3;
            }
            this.f969z.setImageDrawable(null);
            this.f932C.m12221a(i);
            this.f969z.setImageDrawable(this.f932C);
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f950f = false;
        this.f952h = -1.0f;
        this.f956l = new int[2];
        this.f957m = new int[2];
        this.f961q = false;
        this.f965u = -1;
        this.f930A = -1;
        this.f943N = new Animation.AnimationListener() { // from class: android.support.v4.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.f950f) {
                    SwipeRefreshLayout.this.f932C.setAlpha(255);
                    SwipeRefreshLayout.this.f932C.start();
                    if (SwipeRefreshLayout.this.f939J && SwipeRefreshLayout.this.f949e != null) {
                        SwipeRefreshLayout.this.f949e.m12387a();
                    }
                    SwipeRefreshLayout.this.f960p = SwipeRefreshLayout.this.f969z.getTop();
                    return;
                }
                SwipeRefreshLayout.this.m12408b();
            }
        };
        this.f944O = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.m12419a((((int) (((!SwipeRefreshLayout.this.f942M ? (int) (SwipeRefreshLayout.this.f938I - Math.abs(SwipeRefreshLayout.this.f947b)) : (int) SwipeRefreshLayout.this.f938I) - SwipeRefreshLayout.this.f946a) * f)) + SwipeRefreshLayout.this.f946a) - SwipeRefreshLayout.this.f969z.getTop(), false);
                SwipeRefreshLayout.this.f932C.m12225a(1.0f - f);
            }
        };
        this.f945P = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.m12401c(f);
            }
        };
        this.f951g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f959o = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f968x = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f929y);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f940K = (int) (displayMetrics.density * 40.0f);
        this.f941L = (int) (displayMetrics.density * 40.0f);
        m12402c();
        C0309ai.m12916a((ViewGroup) this, true);
        this.f938I = displayMetrics.density * 64.0f;
        this.f952h = this.f938I;
        this.f954j = new C0297aa(this);
        this.f955k = new C0437y(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f930A >= 0) {
            if (i2 == i - 1) {
                return this.f930A;
            }
            if (i2 >= this.f930A) {
                return i2 + 1;
            }
            return i2;
        }
        return i2;
    }

    /* renamed from: c */
    private void m12402c() {
        this.f969z = new C0482b(getContext(), -328966, 20.0f);
        this.f932C = new C0512r(getContext(), this);
        this.f932C.m12210b(-328966);
        this.f969z.setImageDrawable(this.f932C);
        this.f969z.setVisibility(8);
        addView(this.f969z);
    }

    public void setOnRefreshListener(InterfaceC0471a interfaceC0471a) {
        this.f949e = interfaceC0471a;
    }

    /* renamed from: d */
    private boolean m12398d() {
        return Build.VERSION.SDK_INT < 11;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.f950f != z) {
            this.f950f = z;
            if (!this.f942M) {
                i = (int) (this.f938I + this.f947b);
            } else {
                i = (int) this.f938I;
            }
            m12419a(i - this.f960p, true);
            this.f939J = false;
            m12411a(this.f943N);
            return;
        }
        m12409a(z, false);
    }

    /* renamed from: a */
    private void m12411a(Animation.AnimationListener animationListener) {
        this.f969z.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f932C.setAlpha(255);
        }
        this.f933D = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f933D.setDuration(this.f959o);
        if (animationListener != null) {
            this.f969z.m12282a(animationListener);
        }
        this.f969z.clearAnimation();
        this.f969z.startAnimation(this.f933D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f) {
        if (m12398d()) {
            setColorViewAlpha((int) (255.0f * f));
            return;
        }
        C0309ai.m12909c(this.f969z, f);
        C0309ai.m12906d(this.f969z, f);
    }

    /* renamed from: a */
    private void m12409a(boolean z, boolean z2) {
        if (this.f950f != z) {
            this.f939J = z2;
            m12392g();
            this.f950f = z;
            if (this.f950f) {
                m12420a(this.f960p, this.f943N);
            } else {
                m12403b(this.f943N);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12403b(Animation.AnimationListener animationListener) {
        this.f934E = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f934E.setDuration(150L);
        this.f969z.m12282a(animationListener);
        this.f969z.clearAnimation();
        this.f969z.startAnimation(this.f934E);
    }

    /* renamed from: e */
    private void m12396e() {
        this.f935F = m12421a(this.f932C.getAlpha(), 76);
    }

    /* renamed from: f */
    private void m12394f() {
        this.f936G = m12421a(this.f932C.getAlpha(), 255);
    }

    /* renamed from: a */
    private Animation m12421a(final int i, final int i2) {
        if (this.f966v && m12398d()) {
            return null;
        }
        Animation animation = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.f932C.setAlpha((int) (i + ((i2 - i) * f)));
            }
        };
        animation.setDuration(300L);
        this.f969z.m12282a((Animation.AnimationListener) null);
        this.f969z.clearAnimation();
        this.f969z.startAnimation(animation);
        return animation;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f969z.setBackgroundColor(i);
        this.f932C.m12210b(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        m12392g();
        this.f932C.m12214a(iArr);
    }

    /* renamed from: g */
    private void m12392g() {
        if (this.f948d == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f969z)) {
                    this.f948d = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.f952h = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f948d == null) {
                m12392g();
            }
            if (this.f948d != null) {
                View view = this.f948d;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f969z.getMeasuredWidth();
                this.f969z.layout((measuredWidth / 2) - (measuredWidth2 / 2), this.f960p, (measuredWidth / 2) + (measuredWidth2 / 2), this.f960p + this.f969z.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f948d == null) {
            m12392g();
        }
        if (this.f948d != null) {
            this.f948d.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f969z.measure(View.MeasureSpec.makeMeasureSpec(this.f940K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f941L, 1073741824));
            if (!this.f942M && !this.f961q) {
                this.f961q = true;
                int i3 = -this.f969z.getMeasuredHeight();
                this.f947b = i3;
                this.f960p = i3;
            }
            this.f930A = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.f969z) {
                    this.f930A = i4;
                    return;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        if (this.f969z != null) {
            return this.f969z.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: a */
    public boolean m12423a() {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 14) {
            if (this.f948d instanceof AbsListView) {
                AbsListView absListView = (AbsListView) this.f948d;
                return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
            }
            if (C0309ai.m12913b(this.f948d, -1) || this.f948d.getScrollY() > 0) {
                z = true;
            }
            return z;
        }
        return C0309ai.m12913b(this.f948d, -1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m12392g();
        int m12599a = C0427t.m12599a(motionEvent);
        if (this.f967w && m12599a == 0) {
            this.f967w = false;
        }
        if (!isEnabled() || this.f967w || m12423a() || this.f950f || this.f958n) {
            return false;
        }
        switch (m12599a) {
            case 0:
                m12419a(this.f947b - this.f969z.getTop(), true);
                this.f965u = C0427t.m12596b(motionEvent, 0);
                this.f964t = false;
                float m12412a = m12412a(motionEvent, this.f965u);
                if (m12412a != -1.0f) {
                    this.f963s = m12412a;
                    break;
                } else {
                    return false;
                }
            case 1:
            case 3:
                this.f964t = false;
                this.f965u = -1;
                break;
            case 2:
                if (this.f965u == -1) {
                    Log.e(f928c, "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                float m12412a2 = m12412a(motionEvent, this.f965u);
                if (m12412a2 == -1.0f) {
                    return false;
                }
                if (m12412a2 - this.f963s > this.f951g && !this.f964t) {
                    this.f962r = this.f963s + this.f951g;
                    this.f964t = true;
                    this.f932C.setAlpha(76);
                    break;
                }
                break;
            case 6:
                m12413a(motionEvent);
                break;
        }
        return this.f964t;
    }

    /* renamed from: a */
    private float m12412a(MotionEvent motionEvent, int i) {
        int m12598a = C0427t.m12598a(motionEvent, i);
        if (m12598a < 0) {
            return -1.0f;
        }
        return C0427t.m12592d(motionEvent, m12598a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f948d instanceof AbsListView)) {
            if (this.f948d == null || C0309ai.m12885v(this.f948d)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f967w || this.f950f || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f954j.m12955a(view, view2, i);
        startNestedScroll(i & 2);
        this.f953i = 0.0f;
        this.f958n = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f953i > 0.0f) {
            if (i2 > this.f953i) {
                iArr[1] = i2 - ((int) this.f953i);
                this.f953i = 0.0f;
            } else {
                this.f953i -= i2;
                iArr[1] = i2;
            }
            m12422a(this.f953i);
        }
        if (this.f942M && i2 > 0 && this.f953i == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f969z.setVisibility(8);
        }
        int[] iArr2 = this.f956l;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr2[1] + iArr[1];
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f954j.m12957a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onStopNestedScroll(View view) {
        this.f954j.m12956a(view);
        this.f958n = false;
        if (this.f953i > 0.0f) {
            m12407b(this.f953i);
            this.f953i = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f957m);
        int i5 = this.f957m[1] + i4;
        if (i5 < 0 && !m12423a()) {
            this.f953i = Math.abs(i5) + this.f953i;
            m12422a(this.f953i);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f955k.m12570a(z);
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0436x
    public boolean isNestedScrollingEnabled() {
        return this.f955k.m12576a();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f955k.m12573a(i);
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0436x
    public void stopNestedScroll() {
        this.f955k.m12568c();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f955k.m12569b();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f955k.m12572a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f955k.m12571a(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f955k.m12574a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f955k.m12575a(f, f2);
    }

    /* renamed from: a */
    private boolean m12410a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: a */
    private void m12422a(float f) {
        this.f932C.m12215a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f952h));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f952h;
        float f2 = this.f942M ? this.f938I - this.f947b : this.f938I;
        float max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2);
        float pow = ((float) ((max2 / 4.0f) - Math.pow(max2 / 4.0f, 2.0d))) * 2.0f;
        int i = ((int) ((f2 * min) + (f2 * pow * 2.0f))) + this.f947b;
        if (this.f969z.getVisibility() != 0) {
            this.f969z.setVisibility(0);
        }
        if (!this.f966v) {
            C0309ai.m12909c((View) this.f969z, 1.0f);
            C0309ai.m12906d((View) this.f969z, 1.0f);
        }
        if (this.f966v) {
            setAnimationProgress(Math.min(1.0f, f / this.f952h));
        }
        if (f < this.f952h) {
            if (this.f932C.getAlpha() > 76 && !m12410a(this.f935F)) {
                m12396e();
            }
        } else if (this.f932C.getAlpha() < 255 && !m12410a(this.f936G)) {
            m12394f();
        }
        this.f932C.m12224a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f932C.m12225a(Math.min(1.0f, max));
        this.f932C.m12212b(((-0.25f) + (max * 0.4f) + (pow * 2.0f)) * 0.5f);
        m12419a(i - this.f960p, true);
    }

    /* renamed from: b */
    private void m12407b(float f) {
        if (f > this.f952h) {
            m12409a(true, true);
            return;
        }
        this.f950f = false;
        this.f932C.m12224a(0.0f, 0.0f);
        Animation.AnimationListener animationListener = null;
        if (!this.f966v) {
            animationListener = new Animation.AnimationListener() { // from class: android.support.v4.widget.SwipeRefreshLayout.5
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.f966v) {
                        SwipeRefreshLayout.this.m12403b((Animation.AnimationListener) null);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }
            };
        }
        m12406b(this.f960p, animationListener);
        this.f932C.m12215a(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int m12599a = C0427t.m12599a(motionEvent);
        if (this.f967w && m12599a == 0) {
            this.f967w = false;
        }
        if (!isEnabled() || this.f967w || m12423a() || this.f958n) {
            return false;
        }
        switch (m12599a) {
            case 0:
                this.f965u = C0427t.m12596b(motionEvent, 0);
                this.f964t = false;
                break;
            case 1:
                int m12598a = C0427t.m12598a(motionEvent, this.f965u);
                if (m12598a < 0) {
                    Log.e(f928c, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                this.f964t = false;
                m12407b((C0427t.m12592d(motionEvent, m12598a) - this.f962r) * 0.5f);
                this.f965u = -1;
                return false;
            case 2:
                int m12598a2 = C0427t.m12598a(motionEvent, this.f965u);
                if (m12598a2 < 0) {
                    Log.e(f928c, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float m12592d = (C0427t.m12592d(motionEvent, m12598a2) - this.f962r) * 0.5f;
                if (this.f964t) {
                    if (m12592d > 0.0f) {
                        m12422a(m12592d);
                        break;
                    } else {
                        return false;
                    }
                }
                break;
            case 3:
                return false;
            case 5:
                int m12597b = C0427t.m12597b(motionEvent);
                if (m12597b < 0) {
                    Log.e(f928c, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f965u = C0427t.m12596b(motionEvent, m12597b);
                break;
            case 6:
                m12413a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: a */
    private void m12420a(int i, Animation.AnimationListener animationListener) {
        this.f946a = i;
        this.f944O.reset();
        this.f944O.setDuration(200L);
        this.f944O.setInterpolator(this.f968x);
        if (animationListener != null) {
            this.f969z.m12282a(animationListener);
        }
        this.f969z.clearAnimation();
        this.f969z.startAnimation(this.f944O);
    }

    /* renamed from: b */
    private void m12406b(int i, Animation.AnimationListener animationListener) {
        if (this.f966v) {
            m12400c(i, animationListener);
            return;
        }
        this.f946a = i;
        this.f945P.reset();
        this.f945P.setDuration(200L);
        this.f945P.setInterpolator(this.f968x);
        if (animationListener != null) {
            this.f969z.m12282a(animationListener);
        }
        this.f969z.clearAnimation();
        this.f969z.startAnimation(this.f945P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m12401c(float f) {
        m12419a((this.f946a + ((int) ((this.f947b - this.f946a) * f))) - this.f969z.getTop(), false);
    }

    /* renamed from: c */
    private void m12400c(int i, Animation.AnimationListener animationListener) {
        this.f946a = i;
        if (m12398d()) {
            this.f931B = this.f932C.getAlpha();
        } else {
            this.f931B = C0309ai.m12894m(this.f969z);
        }
        this.f937H = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.8
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.f931B + ((-SwipeRefreshLayout.this.f931B) * f));
                SwipeRefreshLayout.this.m12401c(f);
            }
        };
        this.f937H.setDuration(150L);
        if (animationListener != null) {
            this.f969z.m12282a(animationListener);
        }
        this.f969z.clearAnimation();
        this.f969z.startAnimation(this.f937H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12419a(int i, boolean z) {
        this.f969z.bringToFront();
        this.f969z.offsetTopAndBottom(i);
        this.f960p = this.f969z.getTop();
        if (z && Build.VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    /* renamed from: a */
    private void m12413a(MotionEvent motionEvent) {
        int m12597b = C0427t.m12597b(motionEvent);
        if (C0427t.m12596b(motionEvent, m12597b) == this.f965u) {
            this.f965u = C0427t.m12596b(motionEvent, m12597b == 0 ? 1 : 0);
        }
    }
}
