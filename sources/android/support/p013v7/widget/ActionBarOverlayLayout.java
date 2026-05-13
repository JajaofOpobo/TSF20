package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.view.C0297aa;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0363bb;
import android.support.p002v4.view.C0381bg;
import android.support.p002v4.view.InterfaceC0380bf;
import android.support.p002v4.view.InterfaceC0438z;
import android.support.p002v4.widget.C0529y;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0438z, InterfaceC0753m {

    /* renamed from: a */
    static final int[] f1629a = {C0535a.C0536a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f1630A;

    /* renamed from: B */
    private final C0297aa f1631B;

    /* renamed from: b */
    private int f1632b;

    /* renamed from: c */
    private int f1633c;

    /* renamed from: d */
    private ContentFrameLayout f1634d;

    /* renamed from: e */
    private ActionBarContainer f1635e;

    /* renamed from: f */
    private InterfaceC0754n f1636f;

    /* renamed from: g */
    private Drawable f1637g;

    /* renamed from: h */
    private boolean f1638h;

    /* renamed from: i */
    private boolean f1639i;

    /* renamed from: j */
    private boolean f1640j;

    /* renamed from: k */
    private boolean f1641k;

    /* renamed from: l */
    private boolean f1642l;

    /* renamed from: m */
    private int f1643m;

    /* renamed from: n */
    private int f1644n;

    /* renamed from: o */
    private final Rect f1645o;

    /* renamed from: p */
    private final Rect f1646p;

    /* renamed from: q */
    private final Rect f1647q;

    /* renamed from: r */
    private final Rect f1648r;

    /* renamed from: s */
    private final Rect f1649s;

    /* renamed from: t */
    private final Rect f1650t;

    /* renamed from: u */
    private InterfaceC0655a f1651u;

    /* renamed from: v */
    private final int f1652v;

    /* renamed from: w */
    private C0529y f1653w;

    /* renamed from: x */
    private C0363bb f1654x;

    /* renamed from: y */
    private final InterfaceC0380bf f1655y;

    /* renamed from: z */
    private final Runnable f1656z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0655a {
        /* renamed from: a */
        void mo11641a(int i);

        /* renamed from: g */
        void mo11640g(boolean z);

        /* renamed from: l */
        void mo11639l();

        /* renamed from: m */
        void mo11638m();

        /* renamed from: n */
        void mo11637n();

        /* renamed from: o */
        void mo11636o();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1633c = 0;
        this.f1645o = new Rect();
        this.f1646p = new Rect();
        this.f1647q = new Rect();
        this.f1648r = new Rect();
        this.f1649s = new Rect();
        this.f1650t = new Rect();
        this.f1652v = 600;
        this.f1655y = new C0381bg() { // from class: android.support.v7.widget.ActionBarOverlayLayout.1
            @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
            /* renamed from: b */
            public void mo11264b(View view) {
                ActionBarOverlayLayout.this.f1654x = null;
                ActionBarOverlayLayout.this.f1642l = false;
            }

            @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
            /* renamed from: c */
            public void mo11263c(View view) {
                ActionBarOverlayLayout.this.f1654x = null;
                ActionBarOverlayLayout.this.f1642l = false;
            }
        };
        this.f1656z = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.m11646k();
                ActionBarOverlayLayout.this.f1654x = C0309ai.m12895l(ActionBarOverlayLayout.this.f1635e).m12701b(0.0f).m12705a(ActionBarOverlayLayout.this.f1655y);
            }
        };
        this.f1630A = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.m11646k();
                ActionBarOverlayLayout.this.f1654x = C0309ai.m12895l(ActionBarOverlayLayout.this.f1635e).m12701b(-ActionBarOverlayLayout.this.f1635e.getHeight()).m12705a(ActionBarOverlayLayout.this.f1655y);
            }
        };
        m11657a(context);
        this.f1631B = new C0297aa(this);
    }

    /* renamed from: a */
    private void m11657a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1629a);
        this.f1632b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1637g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1637g == null);
        obtainStyledAttributes.recycle();
        this.f1638h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1653w = C0529y.m12157a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11646k();
    }

    public void setActionBarVisibilityCallback(InterfaceC0655a interfaceC0655a) {
        this.f1651u = interfaceC0655a;
        if (getWindowToken() != null) {
            this.f1651u.mo11641a(this.f1633c);
            if (this.f1644n != 0) {
                onWindowSystemUiVisibilityChanged(this.f1644n);
                C0309ai.m12891p(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f1639i = z;
        this.f1638h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    /* renamed from: a */
    public boolean m11659a() {
        return this.f1639i;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1640j = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        m11657a(getContext());
        C0309ai.m12891p(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m11648c();
        int i2 = this.f1644n ^ i;
        this.f1644n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & ItemInfo.APP_VERSION_CODE) != 0;
        if (this.f1651u != null) {
            this.f1651u.mo11640g(z2 ? false : true);
            if (z || !z2) {
                this.f1651u.mo11639l();
            } else {
                this.f1651u.mo11638m();
            }
        }
        if ((i2 & ItemInfo.APP_VERSION_CODE) != 0 && this.f1651u != null) {
            C0309ai.m12891p(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1633c = i;
        if (this.f1651u != null) {
            this.f1651u.mo11641a(i);
        }
    }

    /* renamed from: a */
    private boolean m11651a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z && layoutParams.leftMargin != rect.left) {
            layoutParams.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == rect.bottom) {
            return z5;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        m11648c();
        if ((C0309ai.m12892o(this) & ItemInfo.APP_VERSION_CODE) != 0) {
        }
        boolean m11651a = m11651a(this.f1635e, rect, true, true, false, true);
        this.f1648r.set(rect);
        C0730ad.m11258a(this, this.f1648r, this.f1645o);
        if (!this.f1646p.equals(this.f1645o)) {
            this.f1646p.set(this.f1645o);
            m11651a = true;
        }
        if (m11651a) {
            requestLayout();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: b */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m11648c();
        measureChildWithMargins(this.f1635e, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1635e.getLayoutParams();
        int max = Math.max(0, this.f1635e.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, layoutParams.bottomMargin + this.f1635e.getMeasuredHeight() + layoutParams.topMargin);
        int m11260a = C0730ad.m11260a(0, C0309ai.m12898i(this.f1635e));
        boolean z = (C0309ai.m12892o(this) & ItemInfo.APP_VERSION_CODE) != 0;
        if (z) {
            measuredHeight = this.f1632b;
            if (this.f1640j && this.f1635e.getTabContainer() != null) {
                measuredHeight += this.f1632b;
            }
        } else {
            measuredHeight = this.f1635e.getVisibility() != 8 ? this.f1635e.getMeasuredHeight() : 0;
        }
        this.f1647q.set(this.f1645o);
        this.f1649s.set(this.f1648r);
        if (!this.f1639i && !z) {
            Rect rect = this.f1647q;
            rect.top = measuredHeight + rect.top;
            this.f1647q.bottom += 0;
        } else {
            Rect rect2 = this.f1649s;
            rect2.top = measuredHeight + rect2.top;
            this.f1649s.bottom += 0;
        }
        m11651a(this.f1634d, this.f1647q, true, true, true, true);
        if (!this.f1650t.equals(this.f1649s)) {
            this.f1650t.set(this.f1649s);
            this.f1634d.m11536a(this.f1649s);
        }
        measureChildWithMargins(this.f1634d, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1634d.getLayoutParams();
        int max3 = Math.max(max, this.f1634d.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, layoutParams2.bottomMargin + this.f1634d.getMeasuredHeight() + layoutParams2.topMargin);
        int m11260a2 = C0730ad.m11260a(m11260a, C0309ai.m12898i(this.f1634d));
        setMeasuredDimension(C0309ai.m12932a(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, m11260a2), C0309ai.m12932a(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, m11260a2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1637g != null && !this.f1638h) {
            int bottom = this.f1635e.getVisibility() == 0 ? (int) (this.f1635e.getBottom() + C0309ai.m12897j(this.f1635e) + 0.5f) : 0;
            this.f1637g.setBounds(0, bottom, getWidth(), this.f1637g.getIntrinsicHeight() + bottom);
            this.f1637g.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1635e.getVisibility() != 0) {
            return false;
        }
        return this.f1641k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1631B.m12955a(view, view2, i);
        this.f1643m = getActionBarHideOffset();
        m11646k();
        if (this.f1651u != null) {
            this.f1651u.mo11637n();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1643m += i2;
        setActionBarHideOffset(this.f1643m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onStopNestedScroll(View view) {
        if (this.f1641k && !this.f1642l) {
            if (this.f1643m <= this.f1635e.getHeight()) {
                m11645l();
            } else {
                m11644m();
            }
        }
        if (this.f1651u != null) {
            this.f1651u.mo11636o();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1641k || !z) {
            return false;
        }
        if (m11658a(f, f2)) {
            m11642o();
        } else {
            m11643n();
        }
        this.f1642l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.p002v4.view.InterfaceC0438z
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1631B.m12957a();
    }

    /* renamed from: c */
    void m11648c() {
        if (this.f1634d == null) {
            this.f1634d = (ContentFrameLayout) findViewById(C0535a.C0541f.action_bar_activity_content);
            this.f1635e = (ActionBarContainer) findViewById(C0535a.C0541f.action_bar_container);
            this.f1636f = m11652a(findViewById(C0535a.C0541f.action_bar));
        }
    }

    /* renamed from: a */
    private InterfaceC0754n m11652a(View view) {
        if (view instanceof InterfaceC0754n) {
            return (InterfaceC0754n) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1641k) {
            this.f1641k = z;
            if (!z) {
                m11646k();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        if (this.f1635e != null) {
            return -((int) C0309ai.m12897j(this.f1635e));
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        m11646k();
        C0309ai.m12930a(this.f1635e, -Math.max(0, Math.min(i, this.f1635e.getHeight())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m11646k() {
        removeCallbacks(this.f1656z);
        removeCallbacks(this.f1630A);
        if (this.f1654x != null) {
            this.f1654x.m12702b();
        }
    }

    /* renamed from: l */
    private void m11645l() {
        m11646k();
        postDelayed(this.f1656z, 600L);
    }

    /* renamed from: m */
    private void m11644m() {
        m11646k();
        postDelayed(this.f1630A, 600L);
    }

    /* renamed from: n */
    private void m11643n() {
        m11646k();
        this.f1656z.run();
    }

    /* renamed from: o */
    private void m11642o() {
        m11646k();
        this.f1630A.run();
    }

    /* renamed from: a */
    private boolean m11658a(float f, float f2) {
        this.f1653w.m12159a(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1653w.m12152e() > this.f1635e.getHeight();
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    public void setWindowCallback(Window.Callback callback) {
        m11648c();
        this.f1636f.mo11148a(callback);
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    public void setWindowTitle(CharSequence charSequence) {
        m11648c();
        this.f1636f.mo11147a(charSequence);
    }

    public CharSequence getTitle() {
        m11648c();
        return this.f1636f.mo11139e();
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: a */
    public void mo11164a(int i) {
        m11648c();
        switch (i) {
            case 2:
                this.f1636f.mo11138f();
                return;
            case 5:
                this.f1636f.mo11137g();
                return;
            case 109:
                setOverlayMode(true);
                return;
            default:
                return;
        }
    }

    public void setUiOptions(int i) {
    }

    public void setIcon(int i) {
        m11648c();
        this.f1636f.mo11154a(i);
    }

    public void setIcon(Drawable drawable) {
        m11648c();
        this.f1636f.mo11152a(drawable);
    }

    public void setLogo(int i) {
        m11648c();
        this.f1636f.mo11144b(i);
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: d */
    public boolean mo11162d() {
        m11648c();
        return this.f1636f.mo11136h();
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: e */
    public boolean mo11161e() {
        m11648c();
        return this.f1636f.mo11135i();
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: f */
    public boolean mo11160f() {
        m11648c();
        return this.f1636f.mo11134j();
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: g */
    public boolean mo11159g() {
        m11648c();
        return this.f1636f.mo11133k();
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: h */
    public boolean mo11158h() {
        m11648c();
        return this.f1636f.mo11132l();
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: i */
    public void mo11157i() {
        m11648c();
        this.f1636f.mo11131m();
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: a */
    public void mo11163a(Menu menu, InterfaceC0643l.InterfaceC0644a interfaceC0644a) {
        m11648c();
        this.f1636f.mo11149a(menu, interfaceC0644a);
    }

    @Override // android.support.p013v7.widget.InterfaceC0753m
    /* renamed from: j */
    public void mo11156j() {
        m11648c();
        this.f1636f.mo11130n();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$LayoutParams */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
