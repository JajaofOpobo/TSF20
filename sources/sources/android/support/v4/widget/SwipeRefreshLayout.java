package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.ai;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements android.support.v4.view.x, android.support.v4.view.z {
    private static final String c = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] y = {R.attr.enabled};
    private int A;
    private float B;
    private r C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    private float I;
    private boolean J;
    private int K;
    private int L;
    private boolean M;
    private Animation.AnimationListener N;
    private final Animation O;
    private final Animation P;
    protected int a;
    protected int b;
    private View d;
    private a e;
    private boolean f;
    private int g;
    private float h;
    private float i;
    private final android.support.v4.view.aa j;
    private final android.support.v4.view.y k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private float r;
    private float s;
    private boolean t;
    private int u;
    private boolean v;
    private boolean w;
    private final DecelerateInterpolator x;
    private b z;

    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.z.clearAnimation();
        this.C.stop();
        this.z.setVisibility(8);
        setColorViewAlpha(255);
        if (this.v) {
            setAnimationProgress(0.0f);
        } else {
            a(this.b - this.p, true);
        }
        this.p = this.z.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    private void setColorViewAlpha(int i) {
        this.z.getBackground().setAlpha(i);
        this.C.setAlpha(i);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.K = i2;
                this.L = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.K = i3;
                this.L = i3;
            }
            this.z.setImageDrawable(null);
            this.C.a(i);
            this.z.setImageDrawable(this.C);
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        this.h = -1.0f;
        this.l = new int[2];
        this.m = new int[2];
        this.q = false;
        this.u = -1;
        this.A = -1;
        this.N = new Animation.AnimationListener() { // from class: android.support.v4.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.f) {
                    SwipeRefreshLayout.this.C.setAlpha(255);
                    SwipeRefreshLayout.this.C.start();
                    if (SwipeRefreshLayout.this.J && SwipeRefreshLayout.this.e != null) {
                        SwipeRefreshLayout.this.e.a();
                    }
                    SwipeRefreshLayout.this.p = SwipeRefreshLayout.this.z.getTop();
                    return;
                }
                SwipeRefreshLayout.this.b();
            }
        };
        this.O = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.a((((int) (((!SwipeRefreshLayout.this.M ? (int) (SwipeRefreshLayout.this.I - Math.abs(SwipeRefreshLayout.this.b)) : (int) SwipeRefreshLayout.this.I) - SwipeRefreshLayout.this.a) * f)) + SwipeRefreshLayout.this.a) - SwipeRefreshLayout.this.z.getTop(), false);
                SwipeRefreshLayout.this.C.a(1.0f - f);
            }
        };
        this.P = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.c(f);
            }
        };
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.o = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.K = (int) (displayMetrics.density * 40.0f);
        this.L = (int) (displayMetrics.density * 40.0f);
        c();
        ai.a((ViewGroup) this, true);
        this.I = displayMetrics.density * 64.0f;
        this.h = this.I;
        this.j = new android.support.v4.view.aa(this);
        this.k = new android.support.v4.view.y(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.A >= 0) {
            if (i2 == i - 1) {
                return this.A;
            }
            if (i2 >= this.A) {
                return i2 + 1;
            }
            return i2;
        }
        return i2;
    }

    private void c() {
        this.z = new b(getContext(), -328966, 20.0f);
        this.C = new r(getContext(), this);
        this.C.b(-328966);
        this.z.setImageDrawable(this.C);
        this.z.setVisibility(8);
        addView(this.z);
    }

    public void setOnRefreshListener(a aVar) {
        this.e = aVar;
    }

    private boolean d() {
        return Build.VERSION.SDK_INT < 11;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.f != z) {
            this.f = z;
            if (!this.M) {
                i = (int) (this.I + this.b);
            } else {
                i = (int) this.I;
            }
            a(i - this.p, true);
            this.J = false;
            a(this.N);
            return;
        }
        a(z, false);
    }

    private void a(Animation.AnimationListener animationListener) {
        this.z.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.C.setAlpha(255);
        }
        this.D = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.D.setDuration(this.o);
        if (animationListener != null) {
            this.z.a(animationListener);
        }
        this.z.clearAnimation();
        this.z.startAnimation(this.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f) {
        if (d()) {
            setColorViewAlpha((int) (255.0f * f));
        } else {
            ai.c(this.z, f);
            ai.d(this.z, f);
        }
    }

    private void a(boolean z, boolean z2) {
        if (this.f != z) {
            this.J = z2;
            g();
            this.f = z;
            if (this.f) {
                a(this.p, this.N);
            } else {
                b(this.N);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Animation.AnimationListener animationListener) {
        this.E = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.E.setDuration(150L);
        this.z.a(animationListener);
        this.z.clearAnimation();
        this.z.startAnimation(this.E);
    }

    private void e() {
        this.F = a(this.C.getAlpha(), 76);
    }

    private void f() {
        this.G = a(this.C.getAlpha(), 255);
    }

    private Animation a(final int i, final int i2) {
        if (this.v && d()) {
            return null;
        }
        Animation animation = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.C.setAlpha((int) (i + ((i2 - i) * f)));
            }
        };
        animation.setDuration(300L);
        this.z.a((Animation.AnimationListener) null);
        this.z.clearAnimation();
        this.z.startAnimation(animation);
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
        this.z.setBackgroundColor(i);
        this.C.b(i);
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
        g();
        this.C.a(iArr);
    }

    private void g() {
        if (this.d == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.z)) {
                    this.d = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.h = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.d == null) {
                g();
            }
            if (this.d != null) {
                View view = this.d;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.z.getMeasuredWidth();
                this.z.layout((measuredWidth / 2) - (measuredWidth2 / 2), this.p, (measuredWidth / 2) + (measuredWidth2 / 2), this.p + this.z.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.d == null) {
            g();
        }
        if (this.d != null) {
            this.d.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.z.measure(View.MeasureSpec.makeMeasureSpec(this.K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
            if (!this.M && !this.q) {
                this.q = true;
                int i3 = -this.z.getMeasuredHeight();
                this.b = i3;
                this.p = i3;
            }
            this.A = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.z) {
                    this.A = i4;
                    return;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        if (this.z != null) {
            return this.z.getMeasuredHeight();
        }
        return 0;
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT < 14) {
            if (this.d instanceof AbsListView) {
                AbsListView absListView = (AbsListView) this.d;
                return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
            }
            return ai.b(this.d, -1) || this.d.getScrollY() > 0;
        }
        return ai.b(this.d, -1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g();
        int iA = android.support.v4.view.t.a(motionEvent);
        if (this.w && iA == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || a() || this.f || this.n) {
            return false;
        }
        switch (iA) {
            case 0:
                a(this.b - this.z.getTop(), true);
                this.u = android.support.v4.view.t.b(motionEvent, 0);
                this.t = false;
                float fA = a(motionEvent, this.u);
                if (fA == -1.0f) {
                    return false;
                }
                this.s = fA;
                break;
                break;
            case 1:
            case 3:
                this.t = false;
                this.u = -1;
                break;
            case 2:
                if (this.u == -1) {
                    Log.e(c, "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                float fA2 = a(motionEvent, this.u);
                if (fA2 == -1.0f) {
                    return false;
                }
                if (fA2 - this.s > this.g && !this.t) {
                    this.r = this.s + this.g;
                    this.t = true;
                    this.C.setAlpha(76);
                }
                break;
                break;
            case 6:
                a(motionEvent);
                break;
        }
        return this.t;
    }

    private float a(MotionEvent motionEvent, int i) {
        int iA = android.support.v4.view.t.a(motionEvent, i);
        if (iA < 0) {
            return -1.0f;
        }
        return android.support.v4.view.t.d(motionEvent, iA);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.d instanceof AbsListView)) {
            if (this.d == null || ai.v(this.d)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.w || this.f || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.j.a(view, view2, i);
        startNestedScroll(i & 2);
        this.i = 0.0f;
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.i > 0.0f) {
            if (i2 > this.i) {
                iArr[1] = i2 - ((int) this.i);
                this.i = 0.0f;
            } else {
                this.i -= i2;
                iArr[1] = i2;
            }
            a(this.i);
        }
        if (this.M && i2 > 0 && this.i == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.z.setVisibility(8);
        }
        int[] iArr2 = this.l;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr2[1] + iArr[1];
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.j.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public void onStopNestedScroll(View view) {
        this.j.a(view);
        this.n = false;
        if (this.i > 0.0f) {
            b(this.i);
            this.i = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.m);
        if (this.m[1] + i4 < 0 && !a()) {
            this.i = Math.abs(r0) + this.i;
            a(this.i);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.k.a(z);
    }

    @Override // android.view.View, android.support.v4.view.x
    public boolean isNestedScrollingEnabled() {
        return this.k.a();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.k.a(i);
    }

    @Override // android.view.View, android.support.v4.view.x
    public void stopNestedScroll() {
        this.k.c();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.k.b();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.k.a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.k.a(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.k.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.k.a(f, f2);
    }

    private boolean a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void a(float f) {
        this.C.a(true);
        float fMin = Math.min(1.0f, Math.abs(f / this.h));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.h;
        float f2 = this.M ? this.I - this.b : this.I;
        float fMax2 = ((float) (((double) (Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f)) - Math.pow(r3 / 4.0f, 2.0d))) * 2.0f;
        int i = ((int) ((f2 * fMin) + (f2 * fMax2 * 2.0f))) + this.b;
        if (this.z.getVisibility() != 0) {
            this.z.setVisibility(0);
        }
        if (!this.v) {
            ai.c((View) this.z, 1.0f);
            ai.d((View) this.z, 1.0f);
        }
        if (this.v) {
            setAnimationProgress(Math.min(1.0f, f / this.h));
        }
        if (f < this.h) {
            if (this.C.getAlpha() > 76 && !a(this.F)) {
                e();
            }
        } else if (this.C.getAlpha() < 255 && !a(this.G)) {
            f();
        }
        this.C.a(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.C.a(Math.min(1.0f, fMax));
        this.C.b(((-0.25f) + (fMax * 0.4f) + (fMax2 * 2.0f)) * 0.5f);
        a(i - this.p, true);
    }

    private void b(float f) {
        if (f > this.h) {
            a(true, true);
            return;
        }
        this.f = false;
        this.C.a(0.0f, 0.0f);
        Animation.AnimationListener animationListener = null;
        if (!this.v) {
            animationListener = new Animation.AnimationListener() { // from class: android.support.v4.widget.SwipeRefreshLayout.5
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.v) {
                        SwipeRefreshLayout.this.b((Animation.AnimationListener) null);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }
            };
        }
        b(this.p, animationListener);
        this.C.a(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iA = android.support.v4.view.t.a(motionEvent);
        if (this.w && iA == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || a() || this.n) {
            return false;
        }
        switch (iA) {
            case 0:
                this.u = android.support.v4.view.t.b(motionEvent, 0);
                this.t = false;
                return true;
            case 1:
                int iA2 = android.support.v4.view.t.a(motionEvent, this.u);
                if (iA2 < 0) {
                    Log.e(c, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                float fD = (android.support.v4.view.t.d(motionEvent, iA2) - this.r) * 0.5f;
                this.t = false;
                b(fD);
                this.u = -1;
                return false;
            case 2:
                int iA3 = android.support.v4.view.t.a(motionEvent, this.u);
                if (iA3 < 0) {
                    Log.e(c, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float fD2 = (android.support.v4.view.t.d(motionEvent, iA3) - this.r) * 0.5f;
                if (this.t) {
                    if (fD2 <= 0.0f) {
                        return false;
                    }
                    a(fD2);
                }
                return true;
            case 3:
                return false;
            case 4:
            default:
                return true;
            case 5:
                int iB = android.support.v4.view.t.b(motionEvent);
                if (iB < 0) {
                    Log.e(c, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.u = android.support.v4.view.t.b(motionEvent, iB);
                return true;
            case 6:
                a(motionEvent);
                return true;
        }
    }

    private void a(int i, Animation.AnimationListener animationListener) {
        this.a = i;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.x);
        if (animationListener != null) {
            this.z.a(animationListener);
        }
        this.z.clearAnimation();
        this.z.startAnimation(this.O);
    }

    private void b(int i, Animation.AnimationListener animationListener) {
        if (this.v) {
            c(i, animationListener);
            return;
        }
        this.a = i;
        this.P.reset();
        this.P.setDuration(200L);
        this.P.setInterpolator(this.x);
        if (animationListener != null) {
            this.z.a(animationListener);
        }
        this.z.clearAnimation();
        this.z.startAnimation(this.P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f) {
        a((this.a + ((int) ((this.b - this.a) * f))) - this.z.getTop(), false);
    }

    private void c(int i, Animation.AnimationListener animationListener) {
        this.a = i;
        if (d()) {
            this.B = this.C.getAlpha();
        } else {
            this.B = ai.m(this.z);
        }
        this.H = new Animation() { // from class: android.support.v4.widget.SwipeRefreshLayout.8
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.B + ((-SwipeRefreshLayout.this.B) * f));
                SwipeRefreshLayout.this.c(f);
            }
        };
        this.H.setDuration(150L);
        if (animationListener != null) {
            this.z.a(animationListener);
        }
        this.z.clearAnimation();
        this.z.startAnimation(this.H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        this.z.bringToFront();
        this.z.offsetTopAndBottom(i);
        this.p = this.z.getTop();
        if (z && Build.VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    private void a(MotionEvent motionEvent) {
        int iB = android.support.v4.view.t.b(motionEvent);
        if (android.support.v4.view.t.b(motionEvent, iB) == this.u) {
            this.u = android.support.v4.view.t.b(motionEvent, iB == 0 ? 1 : 0);
        }
    }
}
