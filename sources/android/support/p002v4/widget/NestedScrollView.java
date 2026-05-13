package android.support.p002v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.view.C0249a;
import android.support.p002v4.view.C0297aa;
import android.support.p002v4.view.C0304ag;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0427t;
import android.support.p002v4.view.C0437y;
import android.support.p002v4.view.InterfaceC0302ae;
import android.support.p002v4.view.InterfaceC0436x;
import android.support.p002v4.view.InterfaceC0438z;
import android.support.p002v4.view.p011a.C0256a;
import android.support.p002v4.view.p011a.C0261b;
import android.support.p002v4.view.p011a.C0289j;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;
import java.util.ArrayList;
import org.acra.ACRAConstants;
/* renamed from: android.support.v4.widget.NestedScrollView */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0302ae, InterfaceC0436x, InterfaceC0438z {

    /* renamed from: v */
    private static final C0451a f866v = new C0451a();

    /* renamed from: w */
    private static final int[] f867w = {16843130};

    /* renamed from: A */
    private InterfaceC0452b f868A;

    /* renamed from: a */
    private long f869a;

    /* renamed from: b */
    private final Rect f870b;

    /* renamed from: c */
    private C0529y f871c;

    /* renamed from: d */
    private C0501k f872d;

    /* renamed from: e */
    private C0501k f873e;

    /* renamed from: f */
    private int f874f;

    /* renamed from: g */
    private boolean f875g;

    /* renamed from: h */
    private boolean f876h;

    /* renamed from: i */
    private View f877i;

    /* renamed from: j */
    private boolean f878j;

    /* renamed from: k */
    private VelocityTracker f879k;

    /* renamed from: l */
    private boolean f880l;

    /* renamed from: m */
    private boolean f881m;

    /* renamed from: n */
    private int f882n;

    /* renamed from: o */
    private int f883o;

    /* renamed from: p */
    private int f884p;

    /* renamed from: q */
    private int f885q;

    /* renamed from: r */
    private final int[] f886r;

    /* renamed from: s */
    private final int[] f887s;

    /* renamed from: t */
    private int f888t;

    /* renamed from: u */
    private SavedState f889u;

    /* renamed from: x */
    private final C0297aa f890x;

    /* renamed from: y */
    private final C0437y f891y;

    /* renamed from: z */
    private float f892z;

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0452b {
        /* renamed from: a */
        void mo12007a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f870b = new Rect();
        this.f875g = true;
        this.f876h = false;
        this.f877i = null;
        this.f878j = false;
        this.f881m = true;
        this.f885q = -1;
        this.f886r = new int[2];
        this.f887s = new int[2];
        m12496a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f867w, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f890x = new C0297aa(this);
        this.f891y = new C0437y(this);
        setNestedScrollingEnabled(true);
        C0309ai.m12922a(this, f866v);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f891y.m12570a(z);
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0436x
    public boolean isNestedScrollingEnabled() {
        return this.f891y.m12576a();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f891y.m12573a(i);
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0436x
    public void stopNestedScroll() {
        this.f891y.m12568c();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f891y.m12569b();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f891y.m12572a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f891y.m12571a(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f891y.m12574a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f891y.m12575a(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f890x.m12955a(view, view2, i);
        startNestedScroll(2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onStopNestedScroll(View view) {
        this.f890x.m12956a(view);
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m12469f((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f890x.m12957a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * getHeight());
    }

    /* renamed from: a */
    private void m12496a() {
        this.f871c = C0529y.m12156a(getContext(), null);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f882n = viewConfiguration.getScaledTouchSlop();
        this.f883o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f884p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(InterfaceC0452b interfaceC0452b) {
        this.f868A = interfaceC0452b;
    }

    /* renamed from: b */
    private boolean m12482b() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        }
        return false;
    }

    public void setFillViewport(boolean z) {
        if (z != this.f880l) {
            this.f880l = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f881m = z;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f868A != null) {
            this.f868A.mo12007a(this, i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f880l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m12488a(keyEvent);
    }

    /* renamed from: a */
    public boolean m12488a(KeyEvent keyEvent) {
        this.f870b.setEmpty();
        if (!m12482b()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    if (!keyEvent.isAltPressed()) {
                        return m12476c(33);
                    }
                    return m12481b(33);
                case 20:
                    if (!keyEvent.isAltPressed()) {
                        return m12476c(ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130);
                    }
                    return m12481b(ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130);
                case 62:
                    m12495a(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                default:
                    return false;
            }
        } else {
            return false;
        }
    }

    /* renamed from: c */
    private boolean m12475c(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    /* renamed from: c */
    private void m12477c() {
        if (this.f879k == null) {
            this.f879k = VelocityTracker.obtain();
        } else {
            this.f879k.clear();
        }
    }

    /* renamed from: d */
    private void m12474d() {
        if (this.f879k == null) {
            this.f879k = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m12472e() {
        if (this.f879k != null) {
            this.f879k.recycle();
            this.f879k = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m12472e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f878j) {
            return true;
        }
        switch (action & 255) {
            case 0:
                int y = (int) motionEvent.getY();
                if (!m12475c((int) motionEvent.getX(), y)) {
                    this.f878j = false;
                    m12472e();
                    break;
                } else {
                    this.f874f = y;
                    this.f885q = C0427t.m12596b(motionEvent, 0);
                    m12477c();
                    this.f879k.addMovement(motionEvent);
                    this.f871c.m12150g();
                    this.f878j = this.f871c.m12163a() ? false : true;
                    startNestedScroll(2);
                    break;
                }
            case 1:
            case 3:
                this.f878j = false;
                this.f885q = -1;
                m12472e();
                if (this.f871c.m12160a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0309ai.m12915b(this);
                }
                stopNestedScroll();
                break;
            case 2:
                int i = this.f885q;
                if (i != -1) {
                    int m12598a = C0427t.m12598a(motionEvent, i);
                    if (m12598a == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + i + " in onInterceptTouchEvent");
                        break;
                    } else {
                        int m12592d = (int) C0427t.m12592d(motionEvent, m12598a);
                        if (Math.abs(m12592d - this.f874f) > this.f882n && (getNestedScrollAxes() & 2) == 0) {
                            this.f878j = true;
                            this.f874f = m12592d;
                            m12474d();
                            this.f879k.addMovement(motionEvent);
                            this.f888t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                m12487a(motionEvent);
                break;
        }
        return this.f878j;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        ViewParent parent;
        m12474d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int m12599a = C0427t.m12599a(motionEvent);
        if (m12599a == 0) {
            this.f888t = 0;
        }
        obtain.offsetLocation(0.0f, this.f888t);
        switch (m12599a) {
            case 0:
                if (getChildCount() == 0) {
                    return false;
                }
                boolean z = !this.f871c.m12163a();
                this.f878j = z;
                if (z && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                if (!this.f871c.m12163a()) {
                    this.f871c.m12149h();
                }
                this.f874f = (int) motionEvent.getY();
                this.f885q = C0427t.m12596b(motionEvent, 0);
                startNestedScroll(2);
                break;
            case 1:
                if (this.f878j) {
                    VelocityTracker velocityTracker = this.f879k;
                    velocityTracker.computeCurrentVelocity(1000, this.f884p);
                    int m12937b = (int) C0304ag.m12937b(velocityTracker, this.f885q);
                    if (Math.abs(m12937b) > this.f883o) {
                        m12469f(-m12937b);
                    } else if (this.f871c.m12160a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0309ai.m12915b(this);
                    }
                }
                this.f885q = -1;
                m12470f();
                break;
            case 2:
                int m12598a = C0427t.m12598a(motionEvent, this.f885q);
                if (m12598a == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f885q + " in onTouchEvent");
                    break;
                } else {
                    int m12592d = (int) C0427t.m12592d(motionEvent, m12598a);
                    int i2 = this.f874f - m12592d;
                    if (dispatchNestedPreScroll(0, i2, this.f887s, this.f886r)) {
                        i2 -= this.f887s[1];
                        obtain.offsetLocation(0.0f, this.f886r[1]);
                        this.f888t += this.f886r[1];
                    }
                    if (this.f878j || Math.abs(i2) <= this.f882n) {
                        i = i2;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f878j = true;
                        if (i2 > 0) {
                            i = i2 - this.f882n;
                        } else {
                            i = i2 + this.f882n;
                        }
                    }
                    if (this.f878j) {
                        this.f874f = m12592d - this.f886r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int m12931a = C0309ai.m12931a(this);
                        boolean z2 = m12931a == 0 || (m12931a == 1 && scrollRange > 0);
                        if (m12492a(0, i, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent()) {
                            this.f879k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (dispatchNestedScroll(0, scrollY2, 0, i - scrollY2, this.f886r)) {
                            this.f874f -= this.f886r[1];
                            obtain.offsetLocation(0.0f, this.f886r[1]);
                            this.f888t += this.f886r[1];
                            break;
                        } else if (z2) {
                            m12468g();
                            int i3 = scrollY + i;
                            if (i3 < 0) {
                                this.f872d.m12257a(i / getHeight(), C0427t.m12594c(motionEvent, m12598a) / getWidth());
                                if (!this.f873e.m12259a()) {
                                    this.f873e.m12252c();
                                }
                            } else if (i3 > scrollRange) {
                                this.f873e.m12257a(i / getHeight(), 1.0f - (C0427t.m12594c(motionEvent, m12598a) / getWidth()));
                                if (!this.f872d.m12259a()) {
                                    this.f872d.m12252c();
                                }
                            }
                            if (this.f872d != null && (!this.f872d.m12259a() || !this.f873e.m12259a())) {
                                C0309ai.m12915b(this);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                if (this.f878j && getChildCount() > 0 && this.f871c.m12160a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0309ai.m12915b(this);
                }
                this.f885q = -1;
                m12470f();
                break;
            case 5:
                int m12597b = C0427t.m12597b(motionEvent);
                this.f874f = (int) C0427t.m12592d(motionEvent, m12597b);
                this.f885q = C0427t.m12596b(motionEvent, m12597b);
                break;
            case 6:
                m12487a(motionEvent);
                this.f874f = (int) C0427t.m12592d(motionEvent, C0427t.m12598a(motionEvent, this.f885q));
                break;
        }
        if (this.f879k != null) {
            this.f879k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private void m12487a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (C0427t.m12596b(motionEvent, action) == this.f885q) {
            int i = action == 0 ? 1 : 0;
            this.f874f = (int) C0427t.m12592d(motionEvent, i);
            this.f885q = C0427t.m12596b(motionEvent, i);
            if (this.f879k != null) {
                this.f879k.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((C0427t.m12593d(motionEvent) & 2) != 0) {
            switch (motionEvent.getAction()) {
                case 8:
                    if (this.f878j) {
                        return false;
                    }
                    float m12591e = C0427t.m12591e(motionEvent, 9);
                    if (m12591e != 0.0f) {
                        int verticalScrollFactorCompat = (int) (m12591e * getVerticalScrollFactorCompat());
                        int scrollRange = getScrollRange();
                        int scrollY = getScrollY();
                        int i = scrollY - verticalScrollFactorCompat;
                        if (i < 0) {
                            scrollRange = 0;
                        } else if (i <= scrollRange) {
                            scrollRange = i;
                        }
                        if (scrollRange != scrollY) {
                            super.scrollTo(getScrollX(), scrollRange);
                            return true;
                        }
                        return false;
                    }
                    return false;
                default:
                    return false;
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f892z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f892z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f892z;
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* renamed from: a */
    boolean m12492a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int m12931a = C0309ai.m12931a(this);
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = m12931a == 0 || (m12931a == 1 && z4);
        boolean z7 = m12931a == 0 || (m12931a == 1 && z5);
        int i9 = i3 + i;
        if (!z6) {
            i7 = 0;
        }
        int i10 = i4 + i2;
        if (!z7) {
            i8 = 0;
        }
        int i11 = -i7;
        int i12 = i7 + i5;
        int i13 = -i8;
        int i14 = i8 + i6;
        if (i9 > i12) {
            z2 = true;
        } else if (i9 >= i11) {
            z2 = false;
            i12 = i9;
        } else {
            z2 = true;
            i12 = i11;
        }
        if (i10 > i14) {
            z3 = true;
        } else if (i10 >= i13) {
            z3 = false;
            i14 = i10;
        } else {
            z3 = true;
            i14 = i13;
        }
        if (z3) {
            this.f871c.m12160a(i12, i14, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i12, i14, z2, z3);
        return z2 || z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    /* renamed from: a */
    private View m12483a(boolean z, int i, int i2) {
        boolean z2;
        View view;
        ArrayList focusables = getFocusables(2);
        View view2 = null;
        boolean z3 = false;
        int size = focusables.size();
        int i3 = 0;
        while (i3 < size) {
            View view3 = (View) focusables.get(i3);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i < bottom && top < i2) {
                boolean z4 = i < top && bottom < i2;
                if (view2 == null) {
                    boolean z5 = z4;
                    view = view3;
                    z2 = z5;
                } else {
                    boolean z6 = (z && top < view2.getTop()) || (!z && bottom > view2.getBottom());
                    if (z3) {
                        if (z4 && z6) {
                            view = view3;
                            z2 = z3;
                        }
                    } else if (z4) {
                        view = view3;
                        z2 = true;
                    } else if (z6) {
                        view = view3;
                        z2 = z3;
                    }
                }
                i3++;
                view2 = view;
                z3 = z2;
            }
            z2 = z3;
            view = view2;
            i3++;
            view2 = view;
            z3 = z2;
        }
        return view2;
    }

    /* renamed from: a */
    public boolean m12495a(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f870b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f870b.top + height > childAt.getBottom()) {
                    this.f870b.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f870b.top = getScrollY() - height;
            if (this.f870b.top < 0) {
                this.f870b.top = 0;
            }
        }
        this.f870b.bottom = this.f870b.top + height;
        return m12493a(i, this.f870b.top, this.f870b.bottom);
    }

    /* renamed from: b */
    public boolean m12481b(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.f870b.top = 0;
        this.f870b.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f870b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            this.f870b.top = this.f870b.bottom - height;
        }
        return m12493a(i, this.f870b.top, this.f870b.bottom);
    }

    /* renamed from: a */
    private boolean m12493a(int i, int i2, int i3) {
        boolean z = false;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        boolean z2 = i == 33;
        View m12483a = m12483a(z2, i2, i3);
        if (m12483a == null) {
            m12483a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m12471e(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (m12483a != findFocus()) {
            m12483a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    public boolean m12476c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m12485a(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f870b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f870b);
            m12471e(m12491a(this.f870b));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < maxScrollAmount) {
                    maxScrollAmount = bottom - scrollY;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m12471e(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && m12486a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m12486a(View view) {
        return !m12485a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m12485a(View view, int i, int i2) {
        view.getDrawingRect(this.f870b);
        offsetDescendantRectToMyCoords(view, this.f870b);
        return this.f870b.bottom + i >= getScrollY() && this.f870b.top - i <= getScrollY() + i2;
    }

    /* renamed from: e */
    private void m12471e(int i) {
        if (i != 0) {
            if (this.f881m) {
                m12494a(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: a */
    public final void m12494a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f869a > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f871c.m12162a(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, max)) - scrollY);
                C0309ai.m12915b(this);
            } else {
                if (!this.f871c.m12163a()) {
                    this.f871c.m12149h();
                }
                scrollBy(i, i2);
            }
            this.f869a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b */
    public final void m12480b(int i, int i2) {
        m12494a(i - getScrollX(), i2 - getScrollY());
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0302ae
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0302ae
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0302ae
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0302ae
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0302ae
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, android.support.p002v4.view.InterfaceC0302ae
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f871c.m12150g()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int m12155b = this.f871c.m12155b();
            int m12154c = this.f871c.m12154c();
            if (scrollX != m12155b || scrollY != m12154c) {
                int scrollRange = getScrollRange();
                int m12931a = C0309ai.m12931a(this);
                boolean z = m12931a == 0 || (m12931a == 1 && scrollRange > 0);
                m12492a(m12155b - scrollX, m12154c - scrollY, scrollX, scrollY, 0, scrollRange, 0, 0, false);
                if (z) {
                    m12468g();
                    if (m12154c <= 0 && scrollY > 0) {
                        this.f872d.m12256a((int) this.f871c.m12151f());
                    } else if (m12154c >= scrollRange && scrollY < scrollRange) {
                        this.f873e.m12256a((int) this.f871c.m12151f());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m12478b(View view) {
        view.getDrawingRect(this.f870b);
        offsetDescendantRectToMyCoords(view, this.f870b);
        int m12491a = m12491a(this.f870b);
        if (m12491a != 0) {
            scrollBy(0, m12491a);
        }
    }

    /* renamed from: a */
    private boolean m12490a(Rect rect, boolean z) {
        int m12491a = m12491a(rect);
        boolean z2 = m12491a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m12491a);
            } else {
                m12494a(0, m12491a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    protected int m12491a(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i4 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = (rect.top - scrollY) + 0;
            } else {
                i3 = (rect.bottom - i4) + 0;
            }
            i = Math.min(i3, getChildAt(0).getBottom() - i4);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            i = 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i4 - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            i = Math.max(i2, -getScrollY());
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f875g) {
            m12478b(view2);
        } else {
            this.f877i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || m12486a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m12490a(rect, z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f875g = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f875g = false;
        if (this.f877i != null && m12484a(this.f877i, this)) {
            m12478b(this.f877i);
        }
        this.f877i = null;
        if (!this.f876h) {
            if (this.f889u != null) {
                scrollTo(getScrollX(), this.f889u.f893a);
                this.f889u = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f876h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.f876h = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m12485a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f870b);
            offsetDescendantRectToMyCoords(findFocus, this.f870b);
            m12471e(m12491a(this.f870b));
        }
    }

    /* renamed from: a */
    private static boolean m12484a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m12484a((View) parent, view2);
    }

    /* renamed from: d */
    public void m12473d(int i) {
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            this.f871c.m12158a(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, getChildAt(0).getHeight() - height), 0, height / 2);
            C0309ai.m12915b(this);
        }
    }

    /* renamed from: f */
    private void m12469f(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        if (!dispatchNestedPreFling(0.0f, i)) {
            dispatchNestedFling(0.0f, i, z);
            if (z) {
                m12473d(i);
            }
        }
    }

    /* renamed from: f */
    private void m12470f() {
        this.f878j = false;
        m12472e();
        stopNestedScroll();
        if (this.f872d != null) {
            this.f872d.m12252c();
            this.f873e.m12252c();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int m12479b = m12479b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int m12479b2 = m12479b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (m12479b != getScrollX() || m12479b2 != getScrollY()) {
                super.scrollTo(m12479b, m12479b2);
            }
        }
    }

    /* renamed from: g */
    private void m12468g() {
        if (C0309ai.m12931a(this) != 2) {
            if (this.f872d == null) {
                Context context = getContext();
                this.f872d = new C0501k(context);
                this.f873e = new C0501k(context);
                return;
            }
            return;
        }
        this.f872d = null;
        this.f873e = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f872d != null) {
            int scrollY = getScrollY();
            if (!this.f872d.m12259a()) {
                int save = canvas.save();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), Math.min(0, scrollY));
                this.f872d.m12255a(width, getHeight());
                if (this.f872d.m12254a(canvas)) {
                    C0309ai.m12915b(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f873e.m12259a()) {
                int save2 = canvas.save();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((-width2) + getPaddingLeft(), Math.max(getScrollRange(), scrollY) + height);
                canvas.rotate(180.0f, width2, 0.0f);
                this.f873e.m12255a(width2, height);
                if (this.f873e.m12254a(canvas)) {
                    C0309ai.m12915b(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: b */
    private static int m12479b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f889u = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f893a = getScrollY();
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.widget.NestedScrollView$SavedState */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v4.widget.NestedScrollView.SavedState.1
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
        public int f893a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f893a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f893a);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f893a + "}";
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C0451a extends C0249a {
        C0451a() {
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public boolean mo12465a(View view, int i, Bundle bundle) {
            if (super.mo12465a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                switch (i) {
                    case 4096:
                        int min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.getScrollRange());
                        if (min != nestedScrollView.getScrollY()) {
                            nestedScrollView.m12480b(0, min);
                            return true;
                        }
                        return false;
                    case ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES /* 8192 */:
                        int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.m12480b(0, max);
                            return true;
                        }
                        return false;
                    default:
                        return false;
                }
            }
            return false;
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public void mo12432a(View view, C0261b c0261b) {
            int scrollRange;
            super.mo12432a(view, c0261b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0261b.m13130b(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                c0261b.m13110i(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c0261b.m13142a(ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    c0261b.m13142a(4096);
                }
            }
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: d */
        public void mo12429d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo12429d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            C0289j m13143a = C0256a.m13143a(accessibilityEvent);
            m13143a.m12980a(nestedScrollView.getScrollRange() > 0);
            m13143a.m12977d(nestedScrollView.getScrollX());
            m13143a.m12976e(nestedScrollView.getScrollY());
            m13143a.m12975f(nestedScrollView.getScrollX());
            m13143a.m12974g(nestedScrollView.getScrollRange());
        }
    }
}
