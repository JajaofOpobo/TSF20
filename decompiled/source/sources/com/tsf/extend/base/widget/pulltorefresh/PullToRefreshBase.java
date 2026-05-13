package com.tsf.extend.base.widget.pulltorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.extend.f;
/* loaded from: classes.dex */
public abstract class PullToRefreshBase<T extends View> extends LinearLayout {
    private int a;
    T b;
    boolean c;
    private float d;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private j i;
    private b j;
    private b k;
    private FrameLayout l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Interpolator r;
    private a s;
    private com.tsf.extend.base.widget.pulltorefresh.a.d t;
    private com.tsf.extend.base.widget.pulltorefresh.a.d u;
    private e<T> v;
    private f<T> w;
    private d<T> x;
    private PullToRefreshBase<T>.i y;

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public interface d<V extends View> {
        void a(PullToRefreshBase<V> pullToRefreshBase, j jVar, b bVar);
    }

    /* loaded from: classes.dex */
    public interface e<V extends View> {
        void a(PullToRefreshBase<V> pullToRefreshBase);
    }

    /* loaded from: classes.dex */
    public interface f<V extends View> {
        void a(PullToRefreshBase<V> pullToRefreshBase);

        void b(PullToRefreshBase<V> pullToRefreshBase);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a();
    }

    /* loaded from: classes.dex */
    public enum h {
        VERTICAL,
        HORIZONTAL
    }

    protected abstract T a(Context context, AttributeSet attributeSet);

    protected abstract boolean d();

    protected abstract boolean e();

    public abstract h getPullToRefreshScrollDirection();

    public PullToRefreshBase(Context context) {
        super(context);
        this.h = false;
        this.i = j.RESET;
        this.j = b.a();
        this.m = true;
        this.n = false;
        this.o = true;
        this.p = false;
        this.q = true;
        this.s = a.a();
        this.c = false;
        b(context, (AttributeSet) null);
    }

    public PullToRefreshBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        this.i = j.RESET;
        this.j = b.a();
        this.m = true;
        this.n = false;
        this.o = true;
        this.p = false;
        this.q = true;
        this.s = a.a();
        this.c = false;
        b(context, attributeSet);
    }

    public PullToRefreshBase(Context context, b bVar) {
        super(context);
        this.h = false;
        this.i = j.RESET;
        this.j = b.a();
        this.m = true;
        this.n = false;
        this.o = true;
        this.p = false;
        this.q = true;
        this.s = a.a();
        this.c = false;
        this.j = bVar;
        b(context, (AttributeSet) null);
    }

    public PullToRefreshBase(Context context, b bVar, a aVar) {
        super(context);
        this.h = false;
        this.i = j.RESET;
        this.j = b.a();
        this.m = true;
        this.n = false;
        this.o = true;
        this.p = false;
        this.q = true;
        this.s = a.a();
        this.c = false;
        this.j = bVar;
        this.s = aVar;
        b(context, (AttributeSet) null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        T refreshableView = getRefreshableView();
        if (refreshableView instanceof ViewGroup) {
            ((ViewGroup) refreshableView).addView(view, i2, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
    }

    public final b getCurrentMode() {
        return this.k;
    }

    public final boolean getFilterTouchEvents() {
        return this.o;
    }

    public final com.tsf.extend.base.widget.pulltorefresh.a getLoadingLayoutProxy() {
        return a(true, true);
    }

    public final com.tsf.extend.base.widget.pulltorefresh.a a(boolean z, boolean z2) {
        return b(z, z2);
    }

    public final b getMode() {
        return this.j;
    }

    public final T getRefreshableView() {
        return this.b;
    }

    public final boolean getShowViewWhileRefreshing() {
        return this.m;
    }

    public final j getState() {
        return this.i;
    }

    public final boolean g() {
        return this.j.b();
    }

    public final boolean h() {
        return Build.VERSION.SDK_INT >= 9 && this.p && com.tsf.extend.base.widget.pulltorefresh.c.a(this.b);
    }

    public final boolean i() {
        return this.i == j.REFRESHING || this.i == j.MANUAL_REFRESHING;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (g()) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.h = false;
                return false;
            } else if (action == 0 || !this.h) {
                switch (action) {
                    case 0:
                        if (p()) {
                            float y = motionEvent.getY();
                            this.g = y;
                            this.e = y;
                            float x = motionEvent.getX();
                            this.f = x;
                            this.d = x;
                            this.h = false;
                            break;
                        }
                        break;
                    case 2:
                        if (!this.n && i()) {
                            return true;
                        }
                        if (p()) {
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            switch (getPullToRefreshScrollDirection()) {
                                case HORIZONTAL:
                                    f2 = x2 - this.d;
                                    f3 = y2 - this.e;
                                    break;
                                default:
                                    f2 = y2 - this.e;
                                    f3 = x2 - this.d;
                                    break;
                            }
                            float abs = Math.abs(f2);
                            if (abs > this.a && (!this.o || abs > Math.abs(f3))) {
                                if (this.j.c() && f2 >= 1.0f && d()) {
                                    this.e = y2;
                                    this.d = x2;
                                    this.h = true;
                                    if (this.j == b.BOTH) {
                                        this.k = b.PULL_FROM_START;
                                        break;
                                    }
                                } else if (this.j.d() && f2 <= -1.0f && e()) {
                                    this.e = y2;
                                    this.d = x2;
                                    this.h = true;
                                    if (this.j == b.BOTH) {
                                        this.k = b.PULL_FROM_END;
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
                return this.h;
            } else {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        if (i()) {
            a(j.RESET, new boolean[0]);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g()) {
            if (this.n || !i()) {
                if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            if (p()) {
                                float y = motionEvent.getY();
                                this.g = y;
                                this.e = y;
                                float x = motionEvent.getX();
                                this.f = x;
                                this.d = x;
                                return true;
                            }
                            return false;
                        case 1:
                        case 3:
                            if (this.h) {
                                this.h = false;
                                if (this.i == j.RELEASE_TO_REFRESH && (this.v != null || this.w != null)) {
                                    a(j.REFRESHING, true);
                                    return true;
                                } else if (i()) {
                                    a(0);
                                    return true;
                                } else {
                                    a(j.RESET, new boolean[0]);
                                    return true;
                                }
                            }
                            return false;
                        case 2:
                            if (this.h) {
                                this.e = motionEvent.getY();
                                this.d = motionEvent.getX();
                                q();
                                return true;
                            }
                            return false;
                        default:
                            return false;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void setScrollingWhileRefreshingEnabled(boolean z) {
        this.n = z;
    }

    public void setDisableScrollingWhileRefreshing(boolean z) {
        setScrollingWhileRefreshingEnabled(!z);
    }

    public final void setFilterTouchEvents(boolean z) {
        this.o = z;
    }

    public void setLastUpdatedLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setLastUpdatedLabel(charSequence);
    }

    public void setLoadingDrawable(Drawable drawable) {
        getLoadingLayoutProxy().setLoadingDrawable(drawable);
    }

    @Override // android.view.View
    public void setLongClickable(boolean z) {
        getRefreshableView().setLongClickable(z);
    }

    public final void setMode(b bVar) {
        if (bVar != this.j) {
            this.j = bVar;
            f();
        }
    }

    public void setOnPullEventListener(d<T> dVar) {
        this.x = dVar;
    }

    public final void setOnRefreshListener(e<T> eVar) {
        this.v = eVar;
        this.w = null;
    }

    public final void setOnRefreshListener(f<T> fVar) {
        this.w = fVar;
        this.v = null;
    }

    public void setPullLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setPullLabel(charSequence);
    }

    public final void setPullToRefreshEnabled(boolean z) {
        setMode(z ? b.a() : b.DISABLED);
    }

    public final void setPullToRefreshOverScrollEnabled(boolean z) {
        this.p = z;
    }

    public final void k() {
        if (!this.c) {
            if (getWidth() == 0) {
                this.c = true;
            } else {
                setRefreshing(true);
            }
        }
    }

    public final void setRefreshing(boolean z) {
        if (!i()) {
            a(j.MANUAL_REFRESHING, z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.c && getHeaderLayout().getContentSize() > 0 && this.b.getScrollY() == 0) {
            this.c = false;
            setRefreshing(true);
        }
    }

    public void setRefreshingLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setRefreshingLabel(charSequence);
    }

    public void setReleaseLabel(CharSequence charSequence) {
        a(charSequence, b.BOTH);
    }

    public void a(CharSequence charSequence, b bVar) {
        a(bVar.c(), bVar.d()).setReleaseLabel(charSequence);
    }

    public void setScrollAnimationInterpolator(Interpolator interpolator) {
        this.r = interpolator;
    }

    public final void setShowViewWhileRefreshing(boolean z) {
        this.m = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(j jVar, boolean... zArr) {
        this.i = jVar;
        switch (this.i) {
            case RESET:
                c();
                break;
            case PULL_TO_REFRESH:
                a();
                break;
            case RELEASE_TO_REFRESH:
                b();
                break;
            case REFRESHING:
            case MANUAL_REFRESHING:
                a(zArr[0]);
                break;
        }
        if (this.x != null) {
            this.x.a(this, this.i, this.k);
        }
    }

    protected final void a(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    protected final void a(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, -1, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.tsf.extend.base.widget.pulltorefresh.a.d a(Context context, b bVar, TypedArray typedArray) {
        com.tsf.extend.base.widget.pulltorefresh.a.d a2 = this.s.a(context, bVar, getPullToRefreshScrollDirection(), typedArray);
        a2.setVisibility(4);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.tsf.extend.base.widget.pulltorefresh.b b(boolean z, boolean z2) {
        com.tsf.extend.base.widget.pulltorefresh.b bVar = new com.tsf.extend.base.widget.pulltorefresh.b();
        if (z && this.j.c()) {
            bVar.a(this.t);
        }
        if (z2 && this.j.d()) {
            bVar.a(this.u);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        this.q = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.tsf.extend.base.widget.pulltorefresh.a.d getFooterLayout() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getFooterSize() {
        return this.u.getContentSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.tsf.extend.base.widget.pulltorefresh.a.d getHeaderLayout() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getHeaderSize() {
        return this.t.getContentSize();
    }

    protected int getPullToRefreshScrollDuration() {
        return VEasing.Back.easeIn;
    }

    protected int getPullToRefreshScrollDurationLonger() {
        return 325;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FrameLayout getRefreshableViewWrapper() {
        return this.l;
    }

    protected void a(TypedArray typedArray) {
    }

    protected void a(Bundle bundle) {
    }

    protected void b(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        switch (this.k) {
            case PULL_FROM_END:
                this.u.f();
                return;
            case PULL_FROM_START:
                this.t.f();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        if (this.j.c()) {
            this.t.g();
        }
        if (this.j.d()) {
            this.u.g();
        }
        if (z) {
            if (this.m) {
                g gVar = new g() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.1
                    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.g
                    public void a() {
                        PullToRefreshBase.this.o();
                    }
                };
                switch (this.k) {
                    case PULL_FROM_END:
                    case MANUAL_REFRESH_ONLY:
                        a(getFooterSize(), gVar);
                        return;
                    case PULL_FROM_START:
                    default:
                        a(-getHeaderSize(), gVar);
                        return;
                }
            }
            a(0);
            return;
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        switch (this.k) {
            case PULL_FROM_END:
                this.u.h();
                return;
            case PULL_FROM_START:
                this.t.h();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.h = false;
        this.q = true;
        this.t.i();
        this.u.i();
        a(0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setMode(b.a(bundle.getInt("ptr_mode", 0)));
            this.k = b.a(bundle.getInt("ptr_current_mode", 0));
            this.n = bundle.getBoolean("ptr_disable_scrolling", false);
            this.m = bundle.getBoolean("ptr_show_refreshing_view", true);
            super.onRestoreInstanceState(bundle.getParcelable("ptr_super"));
            j a2 = j.a(bundle.getInt("ptr_state", 0));
            if (a2 == j.REFRESHING || a2 == j.MANUAL_REFRESHING) {
                a(a2, true);
            }
            a(bundle);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        b(bundle);
        bundle.putInt("ptr_state", this.i.a());
        bundle.putInt("ptr_mode", this.j.e());
        bundle.putInt("ptr_current_mode", this.k.e());
        bundle.putBoolean("ptr_disable_scrolling", this.n);
        bundle.putBoolean("ptr_show_refreshing_view", this.m);
        bundle.putParcelable("ptr_super", super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        m();
        a(i2, i3);
        post(new Runnable() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.2
            @Override // java.lang.Runnable
            public void run() {
                PullToRefreshBase.this.requestLayout();
            }
        });
    }

    protected final void m() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int maximumPullScroll = (int) (getMaximumPullScroll() * 1.2f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                if (this.j.c()) {
                    this.t.setWidth(maximumPullScroll);
                    i6 = -maximumPullScroll;
                } else {
                    i6 = 0;
                }
                if (!this.j.d()) {
                    i5 = i6;
                    i4 = 0;
                    i7 = paddingBottom;
                    i3 = paddingTop;
                    break;
                } else {
                    this.u.setWidth(maximumPullScroll);
                    i5 = i6;
                    i4 = -maximumPullScroll;
                    i7 = paddingBottom;
                    i3 = paddingTop;
                    break;
                }
            case VERTICAL:
                if (this.j.c()) {
                    this.t.setHeight(maximumPullScroll);
                    i2 = -maximumPullScroll;
                } else {
                    i2 = 0;
                }
                if (!this.j.d()) {
                    i3 = i2;
                    i4 = paddingRight;
                    i5 = paddingLeft;
                    break;
                } else {
                    this.u.setHeight(maximumPullScroll);
                    i7 = -maximumPullScroll;
                    i3 = i2;
                    i4 = paddingRight;
                    i5 = paddingLeft;
                    break;
                }
            default:
                i7 = paddingBottom;
                i4 = paddingRight;
                i3 = paddingTop;
                i5 = paddingLeft;
                break;
        }
        setPadding(i5, i3, i4, i7);
    }

    protected final void a(int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                if (layoutParams.width != i2) {
                    layoutParams.width = i2;
                    this.l.requestLayout();
                    return;
                }
                return;
            case VERTICAL:
                if (layoutParams.height != i3) {
                    layoutParams.height = i3;
                    this.l.requestLayout();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setHeaderScroll(int i2) {
        int maximumPullScroll = getMaximumPullScroll();
        int min = Math.min(maximumPullScroll, Math.max(-maximumPullScroll, i2));
        if (this.q) {
            if (min < 0) {
                this.t.setVisibility(0);
            } else if (min > 0) {
                this.u.setVisibility(0);
            } else {
                this.t.setVisibility(4);
                this.u.setVisibility(4);
            }
        }
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                scrollTo(min, 0);
                return;
            case VERTICAL:
                scrollTo(0, min);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i2) {
        a(i2, getPullToRefreshScrollDuration());
    }

    protected final void a(int i2, g gVar) {
        a(i2, getPullToRefreshScrollDuration(), 0L, gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        LinearLayout.LayoutParams loadingLayoutLayoutParams = getLoadingLayoutLayoutParams();
        if (this == this.t.getParent()) {
            removeView(this.t);
        }
        if (this.j.c()) {
            a(this.t, 0, loadingLayoutLayoutParams);
        }
        if (this == this.u.getParent()) {
            removeView(this.u);
        }
        if (this.j.d()) {
            a(this.u, loadingLayoutLayoutParams);
        }
        m();
        this.k = this.j != b.BOTH ? this.j : b.PULL_FROM_START;
    }

    private void a(Context context, T t) {
        this.l = new FrameLayout(context);
        this.l.addView(t, -1, -1);
        a(this.l, new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.v != null) {
            this.v.a(this);
        } else if (this.w != null) {
            if (this.k == b.PULL_FROM_START) {
                this.w.a(this);
            } else if (this.k == b.PULL_FROM_END) {
                this.w.b(this);
            }
        }
    }

    private void b(Context context, AttributeSet attributeSet) {
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                setOrientation(0);
                break;
            default:
                setOrientation(1);
                break;
        }
        setGravity(17);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.i.PullToRefresh);
        if (obtainStyledAttributes.hasValue(f.i.PullToRefresh_ptrMode)) {
            this.j = b.a(obtainStyledAttributes.getInteger(f.i.PullToRefresh_ptrMode, 0));
        }
        if (obtainStyledAttributes.hasValue(f.i.PullToRefresh_ptrAnimationStyle)) {
            this.s = a.a(obtainStyledAttributes.getInteger(f.i.PullToRefresh_ptrAnimationStyle, 0));
        }
        this.b = a(context, attributeSet);
        a(context, (Context) this.b);
        this.t = a(context, b.PULL_FROM_START, obtainStyledAttributes);
        this.u = a(context, b.PULL_FROM_END, obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(f.i.PullToRefresh_ptrRefreshableViewBackground)) {
            Drawable drawable = obtainStyledAttributes.getDrawable(f.i.PullToRefresh_ptrRefreshableViewBackground);
            if (drawable != null) {
                this.b.setBackgroundDrawable(drawable);
            }
        } else if (obtainStyledAttributes.hasValue(f.i.PullToRefresh_ptrAdapterViewBackground)) {
            com.tsf.extend.base.widget.pulltorefresh.a.f.a("ptrAdapterViewBackground", "ptrRefreshableViewBackground");
            Drawable drawable2 = obtainStyledAttributes.getDrawable(f.i.PullToRefresh_ptrAdapterViewBackground);
            if (drawable2 != null) {
                this.b.setBackgroundDrawable(drawable2);
            }
        }
        if (obtainStyledAttributes.hasValue(f.i.PullToRefresh_ptrOverScroll)) {
            this.p = obtainStyledAttributes.getBoolean(f.i.PullToRefresh_ptrOverScroll, true);
        }
        if (obtainStyledAttributes.hasValue(f.i.PullToRefresh_ptrScrollingWhileRefreshingEnabled)) {
            this.n = obtainStyledAttributes.getBoolean(f.i.PullToRefresh_ptrScrollingWhileRefreshingEnabled, false);
        }
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        f();
    }

    private boolean p() {
        switch (this.j) {
            case PULL_FROM_END:
                return e();
            case PULL_FROM_START:
                return d();
            case MANUAL_REFRESH_ONLY:
            default:
                return false;
            case BOTH:
                return e() || d();
        }
    }

    private void q() {
        float f2;
        float f3;
        int round;
        int footerSize;
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                f2 = this.f;
                f3 = this.d;
                break;
            default:
                f2 = this.g;
                f3 = this.e;
                break;
        }
        switch (this.k) {
            case PULL_FROM_END:
                round = Math.round(Math.max(f2 - f3, 0.0f) / 2.0f);
                footerSize = getFooterSize();
                break;
            default:
                round = Math.round(Math.min(f2 - f3, 0.0f) / 2.0f);
                footerSize = getHeaderSize();
                break;
        }
        setHeaderScroll(round);
        if (round != 0 && !i()) {
            float abs = Math.abs(round) / footerSize;
            switch (this.k) {
                case PULL_FROM_END:
                    this.u.b(abs);
                    break;
                default:
                    this.t.b(abs);
                    break;
            }
            if (this.i != j.PULL_TO_REFRESH && footerSize >= Math.abs(round)) {
                a(j.PULL_TO_REFRESH, new boolean[0]);
            } else if (this.i == j.PULL_TO_REFRESH && footerSize < Math.abs(round)) {
                a(j.RELEASE_TO_REFRESH, new boolean[0]);
            }
        }
    }

    private LinearLayout.LayoutParams getLoadingLayoutLayoutParams() {
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                return new LinearLayout.LayoutParams(-2, -1);
            default:
                return new LinearLayout.LayoutParams(-1, -2);
        }
    }

    private int getMaximumPullScroll() {
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                return Math.round(getWidth() / 2.0f);
            default:
                return Math.round(getHeight() / 2.0f);
        }
    }

    private final void a(int i2, long j2) {
        a(i2, j2, 0L, null);
    }

    private final void a(int i2, long j2, long j3, g gVar) {
        int scrollX;
        if (this.y != null) {
            this.y.a();
            removeCallbacks(this.y);
        }
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                scrollX = getScrollX();
                break;
            default:
                scrollX = getScrollY();
                break;
        }
        if (scrollX != i2) {
            if (this.r == null) {
                this.r = new DecelerateInterpolator();
            }
            this.y = new i(scrollX, i2, j2, gVar);
            if (j3 > 0) {
                postDelayed(this.y, j3);
            } else {
                post(this.y);
            }
        }
    }

    public void n() {
        if (this.y != null) {
            this.y.a();
        }
    }

    /* loaded from: classes.dex */
    public enum a {
        ROTATE,
        FLIP;

        static a a() {
            return ROTATE;
        }

        static a a(int i) {
            switch (i) {
                case 1:
                    return FLIP;
                default:
                    return ROTATE;
            }
        }

        com.tsf.extend.base.widget.pulltorefresh.a.d a(Context context, b bVar, h hVar, TypedArray typedArray) {
            switch (this) {
                case FLIP:
                    return new com.tsf.extend.base.widget.pulltorefresh.a.b(context, bVar, hVar, typedArray);
                default:
                    return new com.tsf.extend.base.widget.pulltorefresh.a.e(context, bVar, hVar, typedArray);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_FROM_END(2),
        BOTH(3),
        MANUAL_REFRESH_ONLY(4);
        
        private int h;
        public static b f = PULL_FROM_START;
        public static b g = PULL_FROM_END;

        static b a(int i2) {
            b[] values;
            for (b bVar : values()) {
                if (i2 == bVar.e()) {
                    return bVar;
                }
            }
            return a();
        }

        static b a() {
            return PULL_FROM_START;
        }

        b(int i2) {
            this.h = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return (this == DISABLED || this == MANUAL_REFRESH_ONLY) ? false : true;
        }

        public boolean c() {
            return this == PULL_FROM_START || this == BOTH;
        }

        public boolean d() {
            return this == PULL_FROM_END || this == BOTH || this == MANUAL_REFRESH_ONLY;
        }

        int e() {
            return this.h;
        }
    }

    /* loaded from: classes.dex */
    public enum j {
        RESET(0),
        PULL_TO_REFRESH(1),
        RELEASE_TO_REFRESH(2),
        REFRESHING(8),
        MANUAL_REFRESHING(9),
        OVERSCROLLING(16);
        
        private int g;

        static j a(int i) {
            j[] values;
            for (j jVar : values()) {
                if (i == jVar.a()) {
                    return jVar;
                }
            }
            return RESET;
        }

        j(int i) {
            this.g = i;
        }

        int a() {
            return this.g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class i implements Runnable {
        private final Interpolator b;
        private final int c;
        private final int d;
        private final long e;
        private g f;
        private boolean g = true;
        private long h = -1;
        private int i = -1;

        public i(int i, int i2, long j, g gVar) {
            this.d = i;
            this.c = i2;
            this.b = PullToRefreshBase.this.r;
            this.e = j;
            this.f = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.h == -1) {
                this.h = System.currentTimeMillis();
            } else {
                this.i = this.d - Math.round(this.b.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.h) * 1000) / this.e, 1000L), 0L)) / 1000.0f) * (this.d - this.c));
                PullToRefreshBase.this.setHeaderScroll(this.i);
            }
            if (this.g && this.c != this.i) {
                com.tsf.extend.base.widget.pulltorefresh.f.a(PullToRefreshBase.this, this);
            } else if (this.f != null) {
                this.f.a();
            }
        }

        public void a() {
            this.g = false;
            PullToRefreshBase.this.removeCallbacks(this);
        }
    }
}
