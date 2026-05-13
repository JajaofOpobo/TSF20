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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d;
import com.tsf.extend.base.widget.pulltorefresh.p081a.C1507b;
import com.tsf.extend.base.widget.pulltorefresh.p081a.C1513e;
import com.tsf.extend.base.widget.pulltorefresh.p081a.C1514f;
/* loaded from: classes.dex */
public abstract class PullToRefreshBase<T extends View> extends LinearLayout {

    /* renamed from: a */
    private int f4666a;

    /* renamed from: b */
    T f4667b;

    /* renamed from: c */
    boolean f4668c;

    /* renamed from: d */
    private float f4669d;

    /* renamed from: e */
    private float f4670e;

    /* renamed from: f */
    private float f4671f;

    /* renamed from: g */
    private float f4672g;

    /* renamed from: h */
    private boolean f4673h;

    /* renamed from: i */
    private EnumC1499j f4674i;

    /* renamed from: j */
    private EnumC1491b f4675j;

    /* renamed from: k */
    private EnumC1491b f4676k;

    /* renamed from: l */
    private FrameLayout f4677l;

    /* renamed from: m */
    private boolean f4678m;

    /* renamed from: n */
    private boolean f4679n;

    /* renamed from: o */
    private boolean f4680o;

    /* renamed from: p */
    private boolean f4681p;

    /* renamed from: q */
    private boolean f4682q;

    /* renamed from: r */
    private Interpolator f4683r;

    /* renamed from: s */
    private EnumC1490a f4684s;

    /* renamed from: t */
    private AbstractC1511d f4685t;

    /* renamed from: u */
    private AbstractC1511d f4686u;

    /* renamed from: v */
    private InterfaceC1494e<T> f4687v;

    /* renamed from: w */
    private InterfaceC1495f<T> f4688w;

    /* renamed from: x */
    private InterfaceC1493d<T> f4689x;

    /* renamed from: y */
    private PullToRefreshBase<T>.RunnableC1498i f4690y;

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1492c {
        /* renamed from: a */
        void mo8385a();
    }

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1493d<V extends View> {
        /* renamed from: a */
        void m8384a(PullToRefreshBase<V> pullToRefreshBase, EnumC1499j enumC1499j, EnumC1491b enumC1491b);
    }

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$e */
    /* loaded from: classes.dex */
    public interface InterfaceC1494e<V extends View> {
        /* renamed from: a */
        void m8383a(PullToRefreshBase<V> pullToRefreshBase);
    }

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1495f<V extends View> {
        /* renamed from: a */
        void mo8382a(PullToRefreshBase<V> pullToRefreshBase);

        /* renamed from: b */
        void mo8381b(PullToRefreshBase<V> pullToRefreshBase);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$g */
    /* loaded from: classes.dex */
    public interface InterfaceC1496g {
        /* renamed from: a */
        void mo8380a();
    }

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$h */
    /* loaded from: classes.dex */
    public enum EnumC1497h {
        VERTICAL,
        HORIZONTAL
    }

    /* renamed from: a */
    protected abstract T mo8374a(Context context, AttributeSet attributeSet);

    /* renamed from: d */
    protected abstract boolean mo8408d();

    /* renamed from: e */
    protected abstract boolean mo8407e();

    public abstract EnumC1497h getPullToRefreshScrollDirection();

    public PullToRefreshBase(Context context) {
        super(context);
        this.f4673h = false;
        this.f4674i = EnumC1499j.RESET;
        this.f4675j = EnumC1491b.m8391a();
        this.f4678m = true;
        this.f4679n = false;
        this.f4680o = true;
        this.f4681p = false;
        this.f4682q = true;
        this.f4684s = EnumC1490a.m8394a();
        this.f4668c = false;
        m8411b(context, (AttributeSet) null);
    }

    public PullToRefreshBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4673h = false;
        this.f4674i = EnumC1499j.RESET;
        this.f4675j = EnumC1491b.m8391a();
        this.f4678m = true;
        this.f4679n = false;
        this.f4680o = true;
        this.f4681p = false;
        this.f4682q = true;
        this.f4684s = EnumC1490a.m8394a();
        this.f4668c = false;
        m8411b(context, attributeSet);
    }

    public PullToRefreshBase(Context context, EnumC1491b enumC1491b) {
        super(context);
        this.f4673h = false;
        this.f4674i = EnumC1499j.RESET;
        this.f4675j = EnumC1491b.m8391a();
        this.f4678m = true;
        this.f4679n = false;
        this.f4680o = true;
        this.f4681p = false;
        this.f4682q = true;
        this.f4684s = EnumC1490a.m8394a();
        this.f4668c = false;
        this.f4675j = enumC1491b;
        m8411b(context, (AttributeSet) null);
    }

    public PullToRefreshBase(Context context, EnumC1491b enumC1491b, EnumC1490a enumC1490a) {
        super(context);
        this.f4673h = false;
        this.f4674i = EnumC1499j.RESET;
        this.f4675j = EnumC1491b.m8391a();
        this.f4678m = true;
        this.f4679n = false;
        this.f4680o = true;
        this.f4681p = false;
        this.f4682q = true;
        this.f4684s = EnumC1490a.m8394a();
        this.f4668c = false;
        this.f4675j = enumC1491b;
        this.f4684s = enumC1490a;
        m8411b(context, (AttributeSet) null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        T refreshableView = getRefreshableView();
        if (refreshableView instanceof ViewGroup) {
            ((ViewGroup) refreshableView).addView(view, i, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
    }

    public final EnumC1491b getCurrentMode() {
        return this.f4676k;
    }

    public final boolean getFilterTouchEvents() {
        return this.f4680o;
    }

    public final InterfaceC1505a getLoadingLayoutProxy() {
        return m8412a(true, true);
    }

    /* renamed from: a */
    public final InterfaceC1505a m8412a(boolean z, boolean z2) {
        return mo8369b(z, z2);
    }

    public final EnumC1491b getMode() {
        return this.f4675j;
    }

    public final T getRefreshableView() {
        return this.f4667b;
    }

    public final boolean getShowViewWhileRefreshing() {
        return this.f4678m;
    }

    public final EnumC1499j getState() {
        return this.f4674i;
    }

    /* renamed from: g */
    public final boolean m8405g() {
        return this.f4675j.m8389b();
    }

    /* renamed from: h */
    public final boolean m8404h() {
        return Build.VERSION.SDK_INT >= 9 && this.f4681p && C1516c.m8345a(this.f4667b);
    }

    /* renamed from: i */
    public final boolean m8403i() {
        return this.f4674i == EnumC1499j.REFRESHING || this.f4674i == EnumC1499j.MANUAL_REFRESHING;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (m8405g()) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f4673h = false;
                return false;
            } else if (action == 0 || !this.f4673h) {
                switch (action) {
                    case 0:
                        if (m8396p()) {
                            float y = motionEvent.getY();
                            this.f4672g = y;
                            this.f4670e = y;
                            float x = motionEvent.getX();
                            this.f4671f = x;
                            this.f4669d = x;
                            this.f4673h = false;
                            break;
                        }
                        break;
                    case 2:
                        if (!this.f4679n && m8403i()) {
                            return true;
                        }
                        if (m8396p()) {
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            switch (getPullToRefreshScrollDirection()) {
                                case HORIZONTAL:
                                    f = x2 - this.f4669d;
                                    f2 = y2 - this.f4670e;
                                    break;
                                default:
                                    f = y2 - this.f4670e;
                                    f2 = x2 - this.f4669d;
                                    break;
                            }
                            float abs = Math.abs(f);
                            if (abs > this.f4666a && (!this.f4680o || abs > Math.abs(f2))) {
                                if (this.f4675j.m8388c() && f >= 1.0f && mo8408d()) {
                                    this.f4670e = y2;
                                    this.f4669d = x2;
                                    this.f4673h = true;
                                    if (this.f4675j == EnumC1491b.BOTH) {
                                        this.f4676k = EnumC1491b.PULL_FROM_START;
                                        break;
                                    }
                                } else if (this.f4675j.m8387d() && f <= -1.0f && mo8407e()) {
                                    this.f4670e = y2;
                                    this.f4669d = x2;
                                    this.f4673h = true;
                                    if (this.f4675j == EnumC1491b.BOTH) {
                                        this.f4676k = EnumC1491b.PULL_FROM_END;
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
                return this.f4673h;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void m8402j() {
        if (m8403i()) {
            m8415a(EnumC1499j.RESET, new boolean[0]);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m8405g()) {
            if (this.f4679n || !m8403i()) {
                if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            if (m8396p()) {
                                float y = motionEvent.getY();
                                this.f4672g = y;
                                this.f4670e = y;
                                float x = motionEvent.getX();
                                this.f4671f = x;
                                this.f4669d = x;
                                return true;
                            }
                            return false;
                        case 1:
                        case 3:
                            if (this.f4673h) {
                                this.f4673h = false;
                                if (this.f4674i == EnumC1499j.RELEASE_TO_REFRESH && (this.f4687v != null || this.f4688w != null)) {
                                    m8415a(EnumC1499j.REFRESHING, true);
                                    return true;
                                } else if (m8403i()) {
                                    m8425a(0);
                                    return true;
                                } else {
                                    m8415a(EnumC1499j.RESET, new boolean[0]);
                                    return true;
                                }
                            }
                            return false;
                        case 2:
                            if (this.f4673h) {
                                this.f4670e = motionEvent.getY();
                                this.f4669d = motionEvent.getX();
                                m8395q();
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
        this.f4679n = z;
    }

    public void setDisableScrollingWhileRefreshing(boolean z) {
        setScrollingWhileRefreshingEnabled(!z);
    }

    public final void setFilterTouchEvents(boolean z) {
        this.f4680o = z;
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

    public final void setMode(EnumC1491b enumC1491b) {
        if (enumC1491b != this.f4675j) {
            this.f4675j = enumC1491b;
            mo8406f();
        }
    }

    public void setOnPullEventListener(InterfaceC1493d<T> interfaceC1493d) {
        this.f4689x = interfaceC1493d;
    }

    public final void setOnRefreshListener(InterfaceC1494e<T> interfaceC1494e) {
        this.f4687v = interfaceC1494e;
        this.f4688w = null;
    }

    public final void setOnRefreshListener(InterfaceC1495f<T> interfaceC1495f) {
        this.f4688w = interfaceC1495f;
        this.f4687v = null;
    }

    public void setPullLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setPullLabel(charSequence);
    }

    public final void setPullToRefreshEnabled(boolean z) {
        setMode(z ? EnumC1491b.m8391a() : EnumC1491b.DISABLED);
    }

    public final void setPullToRefreshOverScrollEnabled(boolean z) {
        this.f4681p = z;
    }

    /* renamed from: k */
    public final void m8401k() {
        if (!this.f4668c) {
            if (getWidth() == 0) {
                this.f4668c = true;
            } else {
                setRefreshing(true);
            }
        }
    }

    public final void setRefreshing(boolean z) {
        if (!m8403i()) {
            m8415a(EnumC1499j.MANUAL_REFRESHING, z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f4668c && getHeaderLayout().getContentSize() > 0 && this.f4667b.getScrollY() == 0) {
            this.f4668c = false;
            setRefreshing(true);
        }
    }

    public void setRefreshingLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setRefreshingLabel(charSequence);
    }

    public void setReleaseLabel(CharSequence charSequence) {
        m8413a(charSequence, EnumC1491b.BOTH);
    }

    /* renamed from: a */
    public void m8413a(CharSequence charSequence, EnumC1491b enumC1491b) {
        m8412a(enumC1491b.m8388c(), enumC1491b.m8387d()).setReleaseLabel(charSequence);
    }

    public void setScrollAnimationInterpolator(Interpolator interpolator) {
        this.f4683r = interpolator;
    }

    public final void setShowViewWhileRefreshing(boolean z) {
        this.f4678m = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m8415a(EnumC1499j enumC1499j, boolean... zArr) {
        this.f4674i = enumC1499j;
        switch (this.f4674i) {
            case RESET:
                mo8368c();
                break;
            case PULL_TO_REFRESH:
                mo8375a();
                break;
            case RELEASE_TO_REFRESH:
                mo8370b();
                break;
            case REFRESHING:
            case MANUAL_REFRESHING:
                mo8371a(zArr[0]);
                break;
        }
        if (this.f4689x != null) {
            this.f4689x.m8384a(this, this.f4674i, this.f4676k);
        }
    }

    /* renamed from: a */
    protected final void m8417a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    protected final void m8416a(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, -1, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC1511d m8419a(Context context, EnumC1491b enumC1491b, TypedArray typedArray) {
        AbstractC1511d m8392a = this.f4684s.m8392a(context, enumC1491b, getPullToRefreshScrollDirection(), typedArray);
        m8392a.setVisibility(4);
        return m8392a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C1515b mo8369b(boolean z, boolean z2) {
        C1515b c1515b = new C1515b();
        if (z && this.f4675j.m8388c()) {
            c1515b.m8346a(this.f4685t);
        }
        if (z2 && this.f4675j.m8387d()) {
            c1515b.m8346a(this.f4686u);
        }
        return c1515b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m8400l() {
        this.f4682q = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC1511d getFooterLayout() {
        return this.f4686u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getFooterSize() {
        return this.f4686u.getContentSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC1511d getHeaderLayout() {
        return this.f4685t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getHeaderSize() {
        return this.f4685t.getContentSize();
    }

    protected int getPullToRefreshScrollDuration() {
        return VEasing.Back.easeIn;
    }

    protected int getPullToRefreshScrollDurationLonger() {
        return 325;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FrameLayout getRefreshableViewWrapper() {
        return this.f4677l;
    }

    /* renamed from: a */
    protected void mo8373a(TypedArray typedArray) {
    }

    /* renamed from: a */
    protected void m8418a(Bundle bundle) {
    }

    /* renamed from: b */
    protected void m8410b(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8375a() {
        switch (this.f4676k) {
            case PULL_FROM_END:
                this.f4686u.m8359f();
                return;
            case PULL_FROM_START:
                this.f4685t.m8359f();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8371a(boolean z) {
        if (this.f4675j.m8388c()) {
            this.f4685t.m8358g();
        }
        if (this.f4675j.m8387d()) {
            this.f4686u.m8358g();
        }
        if (z) {
            if (this.f4678m) {
                InterfaceC1496g interfaceC1496g = new InterfaceC1496g() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.1
                    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.InterfaceC1496g
                    /* renamed from: a */
                    public void mo8380a() {
                        PullToRefreshBase.this.m8397o();
                    }
                };
                switch (this.f4676k) {
                    case PULL_FROM_END:
                    case MANUAL_REFRESH_ONLY:
                        m8421a(getFooterSize(), interfaceC1496g);
                        return;
                    case PULL_FROM_START:
                    default:
                        m8421a(-getHeaderSize(), interfaceC1496g);
                        return;
                }
            }
            m8425a(0);
            return;
        }
        m8397o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8370b() {
        switch (this.f4676k) {
            case PULL_FROM_END:
                this.f4686u.m8357h();
                return;
            case PULL_FROM_START:
                this.f4685t.m8357h();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8368c() {
        this.f4673h = false;
        this.f4682q = true;
        this.f4685t.m8356i();
        this.f4686u.m8356i();
        m8425a(0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setMode(EnumC1491b.m8390a(bundle.getInt("ptr_mode", 0)));
            this.f4676k = EnumC1491b.m8390a(bundle.getInt("ptr_current_mode", 0));
            this.f4679n = bundle.getBoolean("ptr_disable_scrolling", false);
            this.f4678m = bundle.getBoolean("ptr_show_refreshing_view", true);
            super.onRestoreInstanceState(bundle.getParcelable("ptr_super"));
            EnumC1499j m8377a = EnumC1499j.m8377a(bundle.getInt("ptr_state", 0));
            if (m8377a == EnumC1499j.REFRESHING || m8377a == EnumC1499j.MANUAL_REFRESHING) {
                m8415a(m8377a, true);
            }
            m8418a(bundle);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        m8410b(bundle);
        bundle.putInt("ptr_state", this.f4674i.m8378a());
        bundle.putInt("ptr_mode", this.f4675j.m8386e());
        bundle.putInt("ptr_current_mode", this.f4676k.m8386e());
        bundle.putBoolean("ptr_disable_scrolling", this.f4679n);
        bundle.putBoolean("ptr_show_refreshing_view", this.f4678m);
        bundle.putParcelable("ptr_super", super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m8399m();
        m8424a(i, i2);
        post(new Runnable() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.2
            @Override // java.lang.Runnable
            public void run() {
                PullToRefreshBase.this.requestLayout();
            }
        });
    }

    /* renamed from: m */
    protected final void m8399m() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int maximumPullScroll = (int) (getMaximumPullScroll() * 1.2f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                if (this.f4675j.m8388c()) {
                    this.f4685t.setWidth(maximumPullScroll);
                    i5 = -maximumPullScroll;
                } else {
                    i5 = 0;
                }
                if (!this.f4675j.m8387d()) {
                    i4 = i5;
                    i3 = 0;
                    i6 = paddingBottom;
                    i2 = paddingTop;
                    break;
                } else {
                    this.f4686u.setWidth(maximumPullScroll);
                    i4 = i5;
                    i3 = -maximumPullScroll;
                    i6 = paddingBottom;
                    i2 = paddingTop;
                    break;
                }
            case VERTICAL:
                if (this.f4675j.m8388c()) {
                    this.f4685t.setHeight(maximumPullScroll);
                    i = -maximumPullScroll;
                } else {
                    i = 0;
                }
                if (!this.f4675j.m8387d()) {
                    i2 = i;
                    i3 = paddingRight;
                    i4 = paddingLeft;
                    break;
                } else {
                    this.f4686u.setHeight(maximumPullScroll);
                    i6 = -maximumPullScroll;
                    i2 = i;
                    i3 = paddingRight;
                    i4 = paddingLeft;
                    break;
                }
            default:
                i6 = paddingBottom;
                i3 = paddingRight;
                i2 = paddingTop;
                i4 = paddingLeft;
                break;
        }
        setPadding(i4, i2, i3, i6);
    }

    /* renamed from: a */
    protected final void m8424a(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4677l.getLayoutParams();
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                if (layoutParams.width != i) {
                    layoutParams.width = i;
                    this.f4677l.requestLayout();
                    return;
                }
                return;
            case VERTICAL:
                if (layoutParams.height != i2) {
                    layoutParams.height = i2;
                    this.f4677l.requestLayout();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setHeaderScroll(int i) {
        int maximumPullScroll = getMaximumPullScroll();
        int min = Math.min(maximumPullScroll, Math.max(-maximumPullScroll, i));
        if (this.f4682q) {
            if (min < 0) {
                this.f4685t.setVisibility(0);
            } else if (min > 0) {
                this.f4686u.setVisibility(0);
            } else {
                this.f4685t.setVisibility(4);
                this.f4686u.setVisibility(4);
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
    /* renamed from: a */
    public final void m8425a(int i) {
        m8423a(i, getPullToRefreshScrollDuration());
    }

    /* renamed from: a */
    protected final void m8421a(int i, InterfaceC1496g interfaceC1496g) {
        m8422a(i, getPullToRefreshScrollDuration(), 0L, interfaceC1496g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void mo8406f() {
        LinearLayout.LayoutParams loadingLayoutLayoutParams = getLoadingLayoutLayoutParams();
        if (this == this.f4685t.getParent()) {
            removeView(this.f4685t);
        }
        if (this.f4675j.m8388c()) {
            m8417a(this.f4685t, 0, loadingLayoutLayoutParams);
        }
        if (this == this.f4686u.getParent()) {
            removeView(this.f4686u);
        }
        if (this.f4675j.m8387d()) {
            m8416a(this.f4686u, loadingLayoutLayoutParams);
        }
        m8399m();
        this.f4676k = this.f4675j != EnumC1491b.BOTH ? this.f4675j : EnumC1491b.PULL_FROM_START;
    }

    /* renamed from: a */
    private void m8420a(Context context, T t) {
        this.f4677l = new FrameLayout(context);
        this.f4677l.addView(t, -1, -1);
        m8416a(this.f4677l, new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m8397o() {
        if (this.f4687v != null) {
            this.f4687v.m8383a(this);
        } else if (this.f4688w != null) {
            if (this.f4676k == EnumC1491b.PULL_FROM_START) {
                this.f4688w.mo8382a(this);
            } else if (this.f4676k == EnumC1491b.PULL_FROM_END) {
                this.f4688w.mo8381b(this);
            }
        }
    }

    /* renamed from: b */
    private void m8411b(Context context, AttributeSet attributeSet) {
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                setOrientation(0);
                break;
            default:
                setOrientation(1);
                break;
        }
        setGravity(17);
        this.f4666a = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1536f.C1545i.PullToRefresh);
        if (obtainStyledAttributes.hasValue(C1536f.C1545i.PullToRefresh_ptrMode)) {
            this.f4675j = EnumC1491b.m8390a(obtainStyledAttributes.getInteger(C1536f.C1545i.PullToRefresh_ptrMode, 0));
        }
        if (obtainStyledAttributes.hasValue(C1536f.C1545i.PullToRefresh_ptrAnimationStyle)) {
            this.f4684s = EnumC1490a.m8393a(obtainStyledAttributes.getInteger(C1536f.C1545i.PullToRefresh_ptrAnimationStyle, 0));
        }
        this.f4667b = mo8374a(context, attributeSet);
        m8420a(context, (Context) this.f4667b);
        this.f4685t = m8419a(context, EnumC1491b.PULL_FROM_START, obtainStyledAttributes);
        this.f4686u = m8419a(context, EnumC1491b.PULL_FROM_END, obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(C1536f.C1545i.PullToRefresh_ptrRefreshableViewBackground)) {
            Drawable drawable = obtainStyledAttributes.getDrawable(C1536f.C1545i.PullToRefresh_ptrRefreshableViewBackground);
            if (drawable != null) {
                this.f4667b.setBackgroundDrawable(drawable);
            }
        } else if (obtainStyledAttributes.hasValue(C1536f.C1545i.PullToRefresh_ptrAdapterViewBackground)) {
            C1514f.m8347a("ptrAdapterViewBackground", "ptrRefreshableViewBackground");
            Drawable drawable2 = obtainStyledAttributes.getDrawable(C1536f.C1545i.PullToRefresh_ptrAdapterViewBackground);
            if (drawable2 != null) {
                this.f4667b.setBackgroundDrawable(drawable2);
            }
        }
        if (obtainStyledAttributes.hasValue(C1536f.C1545i.PullToRefresh_ptrOverScroll)) {
            this.f4681p = obtainStyledAttributes.getBoolean(C1536f.C1545i.PullToRefresh_ptrOverScroll, true);
        }
        if (obtainStyledAttributes.hasValue(C1536f.C1545i.PullToRefresh_ptrScrollingWhileRefreshingEnabled)) {
            this.f4679n = obtainStyledAttributes.getBoolean(C1536f.C1545i.PullToRefresh_ptrScrollingWhileRefreshingEnabled, false);
        }
        mo8373a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        mo8406f();
    }

    /* renamed from: p */
    private boolean m8396p() {
        switch (this.f4675j) {
            case PULL_FROM_END:
                return mo8407e();
            case PULL_FROM_START:
                return mo8408d();
            case MANUAL_REFRESH_ONLY:
            default:
                return false;
            case BOTH:
                return mo8407e() || mo8408d();
        }
    }

    /* renamed from: q */
    private void m8395q() {
        float f;
        float f2;
        int round;
        int footerSize;
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                f = this.f4671f;
                f2 = this.f4669d;
                break;
            default:
                f = this.f4672g;
                f2 = this.f4670e;
                break;
        }
        switch (this.f4676k) {
            case PULL_FROM_END:
                round = Math.round(Math.max(f - f2, 0.0f) / 2.0f);
                footerSize = getFooterSize();
                break;
            default:
                round = Math.round(Math.min(f - f2, 0.0f) / 2.0f);
                footerSize = getHeaderSize();
                break;
        }
        setHeaderScroll(round);
        if (round != 0 && !m8403i()) {
            float abs = Math.abs(round) / footerSize;
            switch (this.f4676k) {
                case PULL_FROM_END:
                    this.f4686u.m8361b(abs);
                    break;
                default:
                    this.f4685t.m8361b(abs);
                    break;
            }
            if (this.f4674i != EnumC1499j.PULL_TO_REFRESH && footerSize >= Math.abs(round)) {
                m8415a(EnumC1499j.PULL_TO_REFRESH, new boolean[0]);
            } else if (this.f4674i == EnumC1499j.PULL_TO_REFRESH && footerSize < Math.abs(round)) {
                m8415a(EnumC1499j.RELEASE_TO_REFRESH, new boolean[0]);
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

    /* renamed from: a */
    private final void m8423a(int i, long j) {
        m8422a(i, j, 0L, null);
    }

    /* renamed from: a */
    private final void m8422a(int i, long j, long j2, InterfaceC1496g interfaceC1496g) {
        int scrollX;
        if (this.f4690y != null) {
            this.f4690y.m8379a();
            removeCallbacks(this.f4690y);
        }
        switch (getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                scrollX = getScrollX();
                break;
            default:
                scrollX = getScrollY();
                break;
        }
        if (scrollX != i) {
            if (this.f4683r == null) {
                this.f4683r = new DecelerateInterpolator();
            }
            this.f4690y = new RunnableC1498i(scrollX, i, j, interfaceC1496g);
            if (j2 > 0) {
                postDelayed(this.f4690y, j2);
            } else {
                post(this.f4690y);
            }
        }
    }

    /* renamed from: n */
    public void m8398n() {
        if (this.f4690y != null) {
            this.f4690y.m8379a();
        }
    }

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$a */
    /* loaded from: classes.dex */
    public enum EnumC1490a {
        ROTATE,
        FLIP;

        /* renamed from: a */
        static EnumC1490a m8394a() {
            return ROTATE;
        }

        /* renamed from: a */
        static EnumC1490a m8393a(int i) {
            switch (i) {
                case 1:
                    return FLIP;
                default:
                    return ROTATE;
            }
        }

        /* renamed from: a */
        AbstractC1511d m8392a(Context context, EnumC1491b enumC1491b, EnumC1497h enumC1497h, TypedArray typedArray) {
            switch (this) {
                case FLIP:
                    return new C1507b(context, enumC1491b, enumC1497h, typedArray);
                default:
                    return new C1513e(context, enumC1491b, enumC1497h, typedArray);
            }
        }
    }

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$b */
    /* loaded from: classes.dex */
    public enum EnumC1491b {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_FROM_END(2),
        BOTH(3),
        MANUAL_REFRESH_ONLY(4);
        

        /* renamed from: h */
        private int f4708h;

        /* renamed from: f */
        public static EnumC1491b f4705f = PULL_FROM_START;

        /* renamed from: g */
        public static EnumC1491b f4706g = PULL_FROM_END;

        /* renamed from: a */
        static EnumC1491b m8390a(int i) {
            EnumC1491b[] values;
            for (EnumC1491b enumC1491b : values()) {
                if (i == enumC1491b.m8386e()) {
                    return enumC1491b;
                }
            }
            return m8391a();
        }

        /* renamed from: a */
        static EnumC1491b m8391a() {
            return PULL_FROM_START;
        }

        EnumC1491b(int i) {
            this.f4708h = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m8389b() {
            return (this == DISABLED || this == MANUAL_REFRESH_ONLY) ? false : true;
        }

        /* renamed from: c */
        public boolean m8388c() {
            return this == PULL_FROM_START || this == BOTH;
        }

        /* renamed from: d */
        public boolean m8387d() {
            return this == PULL_FROM_END || this == BOTH || this == MANUAL_REFRESH_ONLY;
        }

        /* renamed from: e */
        int m8386e() {
            return this.f4708h;
        }
    }

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$j */
    /* loaded from: classes.dex */
    public enum EnumC1499j {
        RESET(0),
        PULL_TO_REFRESH(1),
        RELEASE_TO_REFRESH(2),
        REFRESHING(8),
        MANUAL_REFRESHING(9),
        OVERSCROLLING(16);
        

        /* renamed from: g */
        private int f4728g;

        /* renamed from: a */
        static EnumC1499j m8377a(int i) {
            EnumC1499j[] values;
            for (EnumC1499j enumC1499j : values()) {
                if (i == enumC1499j.m8378a()) {
                    return enumC1499j;
                }
            }
            return RESET;
        }

        EnumC1499j(int i) {
            this.f4728g = i;
        }

        /* renamed from: a */
        int m8378a() {
            return this.f4728g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase$i */
    /* loaded from: classes.dex */
    public final class RunnableC1498i implements Runnable {

        /* renamed from: b */
        private final Interpolator f4713b;

        /* renamed from: c */
        private final int f4714c;

        /* renamed from: d */
        private final int f4715d;

        /* renamed from: e */
        private final long f4716e;

        /* renamed from: f */
        private InterfaceC1496g f4717f;

        /* renamed from: g */
        private boolean f4718g = true;

        /* renamed from: h */
        private long f4719h = -1;

        /* renamed from: i */
        private int f4720i = -1;

        public RunnableC1498i(int i, int i2, long j, InterfaceC1496g interfaceC1496g) {
            this.f4715d = i;
            this.f4714c = i2;
            this.f4713b = PullToRefreshBase.this.f4683r;
            this.f4716e = j;
            this.f4717f = interfaceC1496g;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4719h == -1) {
                this.f4719h = System.currentTimeMillis();
            } else {
                this.f4720i = this.f4715d - Math.round(this.f4713b.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.f4719h) * 1000) / this.f4716e, 1000L), 0L)) / 1000.0f) * (this.f4715d - this.f4714c));
                PullToRefreshBase.this.setHeaderScroll(this.f4720i);
            }
            if (this.f4718g && this.f4714c != this.f4720i) {
                C1520f.m8338a(PullToRefreshBase.this, this);
            } else if (this.f4717f != null) {
                this.f4717f.mo8380a();
            }
        }

        /* renamed from: a */
        public void m8379a() {
            this.f4718g = false;
            PullToRefreshBase.this.removeCallbacks(this);
        }
    }
}
