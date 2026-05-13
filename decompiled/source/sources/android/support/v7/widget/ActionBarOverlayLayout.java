package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ai;
import android.support.v4.view.bb;
import android.support.v4.view.bf;
import android.support.v4.view.bg;
import android.support.v7.a.a;
import android.support.v7.view.menu.l;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements android.support.v4.view.z, m {
    static final int[] a = {a.C0012a.actionBarSize, 16842841};
    private final Runnable A;
    private final android.support.v4.view.aa B;
    private int b;
    private int c;
    private ContentFrameLayout d;
    private ActionBarContainer e;
    private n f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private a u;
    private final int v;
    private android.support.v4.widget.y w;
    private bb x;
    private final bf y;
    private final Runnable z;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);

        void g(boolean z);

        void l();

        void m();

        void n();

        void o();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.v = 600;
        this.y = new bg() { // from class: android.support.v7.widget.ActionBarOverlayLayout.1
            @Override // android.support.v4.view.bg, android.support.v4.view.bf
            public void b(View view) {
                ActionBarOverlayLayout.this.x = null;
                ActionBarOverlayLayout.this.l = false;
            }

            @Override // android.support.v4.view.bg, android.support.v4.view.bf
            public void c(View view) {
                ActionBarOverlayLayout.this.x = null;
                ActionBarOverlayLayout.this.l = false;
            }
        };
        this.z = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.k();
                ActionBarOverlayLayout.this.x = ai.l(ActionBarOverlayLayout.this.e).b(0.0f).a(ActionBarOverlayLayout.this.y);
            }
        };
        this.A = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.k();
                ActionBarOverlayLayout.this.x = ai.l(ActionBarOverlayLayout.this.e).b(-ActionBarOverlayLayout.this.e.getHeight()).a(ActionBarOverlayLayout.this.y);
            }
        };
        a(context);
        this.B = new android.support.v4.view.aa(this);
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.g == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.w = android.support.v4.widget.y.a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.u = aVar;
        if (getWindowToken() != null) {
            this.u.a(this.c);
            if (this.n != 0) {
                onWindowSystemUiVisibilityChanged(this.n);
                ai.p(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
        this.h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public boolean a() {
        return this.i;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        ai.p(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        c();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & ItemInfo.APP_VERSION_CODE) != 0;
        if (this.u != null) {
            this.u.g(z2 ? false : true);
            if (z || !z2) {
                this.u.l();
            } else {
                this.u.m();
            }
        }
        if ((i2 & ItemInfo.APP_VERSION_CODE) != 0 && this.u != null) {
            ai.p(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.c = i;
        if (this.u != null) {
            this.u.a(i);
        }
    }

    private boolean a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
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
        c();
        if ((ai.o(this) & ItemInfo.APP_VERSION_CODE) != 0) {
        }
        boolean a2 = a(this.e, rect, true, true, false, true);
        this.r.set(rect);
        ad.a(this, this.r, this.o);
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a2 = true;
        }
        if (a2) {
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
        c();
        measureChildWithMargins(this.e, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.e.getLayoutParams();
        int max = Math.max(0, this.e.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, layoutParams.bottomMargin + this.e.getMeasuredHeight() + layoutParams.topMargin);
        int a2 = ad.a(0, ai.i(this.e));
        boolean z = (ai.o(this) & ItemInfo.APP_VERSION_CODE) != 0;
        if (z) {
            measuredHeight = this.b;
            if (this.j && this.e.getTabContainer() != null) {
                measuredHeight += this.b;
            }
        } else {
            measuredHeight = this.e.getVisibility() != 8 ? this.e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.s.set(this.r);
        if (!this.i && !z) {
            Rect rect = this.q;
            rect.top = measuredHeight + rect.top;
            this.q.bottom += 0;
        } else {
            Rect rect2 = this.s;
            rect2.top = measuredHeight + rect2.top;
            this.s.bottom += 0;
        }
        a(this.d, this.q, true, true, true, true);
        if (!this.t.equals(this.s)) {
            this.t.set(this.s);
            this.d.a(this.s);
        }
        measureChildWithMargins(this.d, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.d.getLayoutParams();
        int max3 = Math.max(max, this.d.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, layoutParams2.bottomMargin + this.d.getMeasuredHeight() + layoutParams2.topMargin);
        int a3 = ad.a(a2, ai.i(this.d));
        setMeasuredDimension(ai.a(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, a3), ai.a(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, a3 << 16));
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
        if (this.g != null && !this.h) {
            int bottom = this.e.getVisibility() == 0 ? (int) (this.e.getBottom() + ai.j(this.e) + 0.5f) : 0;
            this.g.setBounds(0, bottom, getWidth(), this.g.getIntrinsicHeight() + bottom);
            this.g.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.a(view, view2, i);
        this.m = getActionBarHideOffset();
        k();
        if (this.u != null) {
            this.u.n();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.m += i2;
        setActionBarHideOffset(this.m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.e.getHeight()) {
                l();
            } else {
                m();
            }
        }
        if (this.u != null) {
            this.u.o();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        if (a(f, f2)) {
            o();
        } else {
            n();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.z
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    void c() {
        if (this.d == null) {
            this.d = (ContentFrameLayout) findViewById(a.f.action_bar_activity_content);
            this.e = (ActionBarContainer) findViewById(a.f.action_bar_container);
            this.f = a(findViewById(a.f.action_bar));
        }
    }

    private n a(View view) {
        if (view instanceof n) {
            return (n) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (!z) {
                k();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        if (this.e != null) {
            return -((int) ai.j(this.e));
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        k();
        ai.a(this.e, -Math.max(0, Math.min(i, this.e.getHeight())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        if (this.x != null) {
            this.x.b();
        }
    }

    private void l() {
        k();
        postDelayed(this.z, 600L);
    }

    private void m() {
        k();
        postDelayed(this.A, 600L);
    }

    private void n() {
        k();
        this.z.run();
    }

    private void o() {
        k();
        this.A.run();
    }

    private boolean a(float f, float f2) {
        this.w.a(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.w.e() > this.e.getHeight();
    }

    @Override // android.support.v7.widget.m
    public void setWindowCallback(Window.Callback callback) {
        c();
        this.f.a(callback);
    }

    @Override // android.support.v7.widget.m
    public void setWindowTitle(CharSequence charSequence) {
        c();
        this.f.a(charSequence);
    }

    public CharSequence getTitle() {
        c();
        return this.f.e();
    }

    @Override // android.support.v7.widget.m
    public void a(int i) {
        c();
        switch (i) {
            case 2:
                this.f.f();
                return;
            case 5:
                this.f.g();
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
        c();
        this.f.a(i);
    }

    public void setIcon(Drawable drawable) {
        c();
        this.f.a(drawable);
    }

    public void setLogo(int i) {
        c();
        this.f.b(i);
    }

    @Override // android.support.v7.widget.m
    public boolean d() {
        c();
        return this.f.h();
    }

    @Override // android.support.v7.widget.m
    public boolean e() {
        c();
        return this.f.i();
    }

    @Override // android.support.v7.widget.m
    public boolean f() {
        c();
        return this.f.j();
    }

    @Override // android.support.v7.widget.m
    public boolean g() {
        c();
        return this.f.k();
    }

    @Override // android.support.v7.widget.m
    public boolean h() {
        c();
        return this.f.l();
    }

    @Override // android.support.v7.widget.m
    public void i() {
        c();
        this.f.m();
    }

    @Override // android.support.v7.widget.m
    public void a(Menu menu, l.a aVar) {
        c();
        this.f.a(menu, aVar);
    }

    @Override // android.support.v7.widget.m
    public void j() {
        c();
        this.f.n();
    }

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
