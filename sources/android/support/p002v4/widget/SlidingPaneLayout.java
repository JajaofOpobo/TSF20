package android.support.p002v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.view.C0249a;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0427t;
import android.support.p002v4.view.p011a.C0261b;
import android.support.p002v4.widget.C0478ac;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* renamed from: android.support.v4.widget.SlidingPaneLayout */
/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    static final InterfaceC0459e f894a;

    /* renamed from: b */
    private int f895b;

    /* renamed from: c */
    private int f896c;

    /* renamed from: d */
    private Drawable f897d;

    /* renamed from: e */
    private Drawable f898e;

    /* renamed from: f */
    private final int f899f;

    /* renamed from: g */
    private boolean f900g;

    /* renamed from: h */
    private View f901h;

    /* renamed from: i */
    private float f902i;

    /* renamed from: j */
    private float f903j;

    /* renamed from: k */
    private int f904k;

    /* renamed from: l */
    private boolean f905l;

    /* renamed from: m */
    private int f906m;

    /* renamed from: n */
    private float f907n;

    /* renamed from: o */
    private float f908o;

    /* renamed from: p */
    private InterfaceC0458d f909p;

    /* renamed from: q */
    private final C0478ac f910q;

    /* renamed from: r */
    private boolean f911r;

    /* renamed from: s */
    private boolean f912s;

    /* renamed from: t */
    private final Rect f913t;

    /* renamed from: u */
    private final ArrayList<RunnableC0456b> f914u;

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0458d {
        /* renamed from: a */
        void m12428a(View view);

        /* renamed from: a */
        void m12427a(View view, float f);

        /* renamed from: b */
        void m12426b(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.widget.SlidingPaneLayout$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0459e {
        /* renamed from: a */
        void mo12425a(SlidingPaneLayout slidingPaneLayout, View view);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            f894a = new C0462h();
        } else if (i >= 16) {
            f894a = new C0461g();
        } else {
            f894a = new C0460f();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f895b = -858993460;
        this.f912s = true;
        this.f913t = new Rect();
        this.f914u = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f899f = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        C0309ai.m12922a(this, new C0455a());
        C0309ai.m12908c((View) this, 1);
        this.f910q = C0478ac.m12326a(this, 0.5f, new C0457c());
        this.f910q.m12340a(f * 400.0f);
    }

    public void setParallaxDistance(int i) {
        this.f906m = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.f906m;
    }

    public void setSliderFadeColor(int i) {
        this.f895b = i;
    }

    public int getSliderFadeColor() {
        return this.f895b;
    }

    public void setCoveredFadeColor(int i) {
        this.f896c = i;
    }

    public int getCoveredFadeColor() {
        return this.f896c;
    }

    public void setPanelSlideListener(InterfaceC0458d interfaceC0458d) {
        this.f909p = interfaceC0458d;
    }

    /* renamed from: a */
    void m12456a(View view) {
        if (this.f909p != null) {
            this.f909p.m12427a(view, this.f902i);
        }
    }

    /* renamed from: b */
    void m12451b(View view) {
        if (this.f909p != null) {
            this.f909p.m12428a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: c */
    void m12447c(View view) {
        if (this.f909p != null) {
            this.f909p.m12426b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: d */
    void m12444d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean m12440f = m12440f();
        int width = m12440f ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = m12440f ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view != null && m12438f(view)) {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                int max = Math.max(m12440f ? paddingLeft : width, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                int min = Math.min(m12440f ? width : paddingLeft, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i4 && max2 >= i2 && min <= i3 && min2 <= i) {
                    i5 = 4;
                } else {
                    i5 = 0;
                }
                childAt.setVisibility(i5);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    void m12464a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: f */
    private static boolean m12438f(View view) {
        Drawable background;
        if (C0309ai.m12900g(view)) {
            return true;
        }
        return Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f912s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f912s = true;
        int size = this.f914u.size();
        for (int i = 0; i < size; i++) {
            this.f914u.get(i).run();
        }
        this.f914u.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int paddingTop;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int makeMeasureSpec3;
        int makeMeasureSpec4;
        int i7;
        int i8;
        boolean z;
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (isInEditMode()) {
                if (mode == Integer.MIN_VALUE) {
                    i3 = mode2;
                    i4 = size;
                    i5 = size2;
                } else {
                    if (mode == 0) {
                        i3 = mode2;
                        i4 = 300;
                        i5 = size2;
                    }
                    i3 = mode2;
                    i4 = size;
                    i5 = size2;
                }
            } else {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
        } else {
            if (mode2 == 0) {
                if (isInEditMode()) {
                    if (mode2 == 0) {
                        i3 = Integer.MIN_VALUE;
                        i4 = size;
                        i5 = 300;
                    }
                } else {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                }
            }
            i3 = mode2;
            i4 = size;
            i5 = size2;
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                i6 = 0;
                paddingTop = (i5 - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                i6 = (i5 - getPaddingTop()) - getPaddingBottom();
                paddingTop = i6;
                break;
            default:
                i6 = 0;
                paddingTop = -1;
                break;
        }
        boolean z2 = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f901h = null;
        int i9 = 0;
        int i10 = paddingLeft;
        int i11 = i6;
        float f2 = 0.0f;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f918c = false;
                i7 = i10;
                f = f2;
                i8 = i11;
                z = z2;
            } else {
                if (layoutParams.f916a > 0.0f) {
                    f2 += layoutParams.f916a;
                    if (layoutParams.width == 0) {
                        i7 = i10;
                        f = f2;
                        i8 = i11;
                        z = z2;
                    }
                }
                int i12 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i12, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i12, 1073741824);
                } else {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE && measuredHeight > i11) {
                    i11 = Math.min(measuredHeight, paddingTop);
                }
                int i13 = i10 - measuredWidth;
                boolean z3 = i13 < 0;
                layoutParams.f917b = z3;
                boolean z4 = z3 | z2;
                if (layoutParams.f917b) {
                    this.f901h = childAt;
                }
                i7 = i13;
                i8 = i11;
                float f3 = f2;
                z = z4;
                f = f3;
            }
            i9++;
            z2 = z;
            i11 = i8;
            f2 = f;
            i10 = i7;
        }
        if (z2 || f2 > 0.0f) {
            int i14 = paddingLeft - this.f899f;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != 8) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        boolean z5 = layoutParams2.width == 0 && layoutParams2.f916a > 0.0f;
                        int measuredWidth2 = z5 ? 0 : childAt2.getMeasuredWidth();
                        if (z2 && childAt2 != this.f901h) {
                            if (layoutParams2.width < 0 && (measuredWidth2 > i14 || layoutParams2.f916a > 0.0f)) {
                                if (z5) {
                                    if (layoutParams2.height == -2) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    } else if (layoutParams2.height == -1) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                    }
                                } else {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), makeMeasureSpec2);
                            }
                        } else if (layoutParams2.f916a > 0.0f) {
                            if (layoutParams2.width == 0) {
                                if (layoutParams2.height == -2) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                } else if (layoutParams2.height == -1) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                            } else {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            if (z2) {
                                int i16 = paddingLeft - (layoutParams2.rightMargin + layoutParams2.leftMargin);
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                if (measuredWidth2 != i16) {
                                    childAt2.measure(makeMeasureSpec5, makeMeasureSpec);
                                }
                            } else {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((int) ((layoutParams2.f916a * Math.max(0, i10)) / f2)) + measuredWidth2, 1073741824), makeMeasureSpec);
                            }
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, getPaddingTop() + i11 + getPaddingBottom());
        this.f900g = z2;
        if (this.f910q.m12341a() != 0 && !z2) {
            this.f910q.m12303f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int width;
        int i9;
        boolean m12440f = m12440f();
        if (m12440f) {
            this.f910q.m12335a(2);
        } else {
            this.f910q.m12335a(1);
        }
        int i10 = i3 - i;
        int paddingRight = m12440f ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = m12440f ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f912s) {
            this.f902i = (this.f900g && this.f911r) ? 1.0f : 0.0f;
        }
        int i11 = 0;
        int i12 = paddingRight;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                width = paddingRight;
                i9 = i12;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f917b) {
                    int min = (Math.min(paddingRight, (i10 - paddingLeft) - this.f899f) - i12) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f904k = min;
                    int i13 = m12440f ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f918c = ((i12 + i13) + min) + (measuredWidth / 2) > i10 - paddingLeft;
                    int i14 = (int) (min * this.f902i);
                    i6 = i12 + i13 + i14;
                    this.f902i = i14 / this.f904k;
                    i5 = 0;
                } else if (!this.f900g || this.f906m == 0) {
                    i5 = 0;
                    i6 = paddingRight;
                } else {
                    i5 = (int) ((1.0f - this.f902i) * this.f906m);
                    i6 = paddingRight;
                }
                if (m12440f) {
                    i8 = (i10 - i6) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i6 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                width = childAt.getWidth() + paddingRight;
                i9 = i6;
            }
            i11++;
            paddingRight = width;
            i12 = i9;
        }
        if (this.f912s) {
            if (this.f900g) {
                if (this.f906m != 0) {
                    m12463a(this.f902i);
                }
                if (((LayoutParams) this.f901h.getLayoutParams()).f918c) {
                    m12455a(this.f901h, this.f902i, this.f895b);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    m12455a(getChildAt(i15), 0.0f, this.f895b);
                }
            }
            m12444d(this.f901h);
        }
        this.f912s = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f912s = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f900g) {
            this.f911r = view == this.f901h;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int m12599a = C0427t.m12599a(motionEvent);
        if (!this.f900g && m12599a == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f911r = !this.f910q.m12314b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f900g || (this.f905l && m12599a != 0)) {
            this.f910q.m12306e();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (m12599a == 3 || m12599a == 1) {
            this.f910q.m12306e();
            return false;
        } else {
            switch (m12599a) {
                case 0:
                    this.f905l = false;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f907n = x;
                    this.f908o = y;
                    if (this.f910q.m12314b(this.f901h, (int) x, (int) y) && m12441e(this.f901h)) {
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 1:
                default:
                    z = false;
                    break;
                case 2:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float abs = Math.abs(x2 - this.f907n);
                    float abs2 = Math.abs(y2 - this.f908o);
                    if (abs > this.f910q.m12309d() && abs2 > abs) {
                        this.f910q.m12306e();
                        this.f905l = true;
                        return false;
                    }
                    z = false;
                    break;
            }
            return this.f910q.m12331a(motionEvent) || z;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f900g) {
            return super.onTouchEvent(motionEvent);
        }
        this.f910q.m12316b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f907n = x;
                this.f908o = y;
                return true;
            case 1:
                if (!m12441e(this.f901h)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.f907n;
                float f2 = y2 - this.f908o;
                int m12309d = this.f910q.m12309d();
                if ((f * f) + (f2 * f2) >= m12309d * m12309d || !this.f910q.m12314b(this.f901h, (int) x2, (int) y2)) {
                    return true;
                }
                m12454a(this.f901h, 0);
                return true;
            default:
                return true;
        }
    }

    /* renamed from: a */
    private boolean m12454a(View view, int i) {
        if (this.f912s || m12462a(0.0f, i)) {
            this.f911r = false;
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m12450b(View view, int i) {
        if (this.f912s || m12462a(1.0f, i)) {
            this.f911r = true;
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m12453b() {
        return m12450b(this.f901h, 0);
    }

    /* renamed from: c */
    public boolean m12449c() {
        return m12454a(this.f901h, 0);
    }

    /* renamed from: d */
    public boolean m12446d() {
        return !this.f900g || this.f902i == 1.0f;
    }

    /* renamed from: e */
    public boolean m12443e() {
        return this.f900g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12461a(int i) {
        if (this.f901h == null) {
            this.f902i = 0.0f;
            return;
        }
        boolean m12440f = m12440f();
        LayoutParams layoutParams = (LayoutParams) this.f901h.getLayoutParams();
        int width = this.f901h.getWidth();
        if (m12440f) {
            i = (getWidth() - i) - width;
        }
        this.f902i = (i - ((m12440f ? layoutParams.rightMargin : layoutParams.leftMargin) + (m12440f ? getPaddingRight() : getPaddingLeft()))) / this.f904k;
        if (this.f906m != 0) {
            m12463a(this.f902i);
        }
        if (layoutParams.f918c) {
            m12455a(this.f901h, this.f902i, this.f895b);
        }
        m12456a(this.f901h);
    }

    /* renamed from: a */
    private void m12455a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (16777215 & i);
            if (layoutParams.f919d == null) {
                layoutParams.f919d = new Paint();
            }
            layoutParams.f919d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (C0309ai.m12907d(view) != 2) {
                C0309ai.m12926a(view, 2, layoutParams.f919d);
            }
            m12436g(view);
        } else if (C0309ai.m12907d(view) != 0) {
            if (layoutParams.f919d != null) {
                layoutParams.f919d.setColorFilter(null);
            }
            RunnableC0456b runnableC0456b = new RunnableC0456b(view);
            this.f914u.add(runnableC0456b);
            C0309ai.m12919a(this, runnableC0456b);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (this.f900g && !layoutParams.f917b && this.f901h != null) {
            canvas.getClipBounds(this.f913t);
            if (m12440f()) {
                this.f913t.left = Math.max(this.f913t.left, this.f901h.getRight());
            } else {
                this.f913t.right = Math.min(this.f913t.right, this.f901h.getLeft());
            }
            canvas.clipRect(this.f913t);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            drawChild = super.drawChild(canvas, view, j);
        } else if (layoutParams.f918c && this.f902i > 0.0f) {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, view.getLeft(), view.getTop(), layoutParams.f919d);
                drawChild = false;
            } else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                drawChild = super.drawChild(canvas, view, j);
            }
        } else {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            drawChild = super.drawChild(canvas, view, j);
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m12436g(View view) {
        f894a.mo12425a(this, view);
    }

    /* renamed from: a */
    boolean m12462a(float f, int i) {
        int paddingLeft;
        if (this.f900g) {
            boolean m12440f = m12440f();
            LayoutParams layoutParams = (LayoutParams) this.f901h.getLayoutParams();
            if (m12440f) {
                paddingLeft = (int) (getWidth() - (((layoutParams.rightMargin + getPaddingRight()) + (this.f904k * f)) + this.f901h.getWidth()));
            } else {
                paddingLeft = (int) (layoutParams.leftMargin + getPaddingLeft() + (this.f904k * f));
            }
            if (this.f910q.m12328a(this.f901h, paddingLeft, this.f901h.getTop())) {
                m12464a();
                C0309ai.m12915b(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f910q.m12324a(true)) {
            if (!this.f900g) {
                this.f910q.m12303f();
            } else {
                C0309ai.m12915b(this);
            }
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f897d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f898e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getResources().getDrawable(i));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        int left;
        int i;
        super.draw(canvas);
        if (m12440f()) {
            drawable = this.f898e;
        } else {
            drawable = this.f897d;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m12440f()) {
                i = childAt.getRight();
                left = i + intrinsicWidth;
            } else {
                left = childAt.getLeft();
                i = left - intrinsicWidth;
            }
            drawable.setBounds(i, top, left, bottom);
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m12463a(float r10) {
        /*
            r9 = this;
            r1 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r9.m12440f()
            android.view.View r0 = r9.f901h
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r0 = (android.support.p002v4.widget.SlidingPaneLayout.LayoutParams) r0
            boolean r2 = r0.f918c
            if (r2 == 0) goto L30
            if (r3 == 0) goto L2d
            int r0 = r0.rightMargin
        L17:
            if (r0 > 0) goto L30
            r0 = 1
        L1a:
            int r4 = r9.getChildCount()
            r2 = r1
        L1f:
            if (r2 >= r4) goto L5d
            android.view.View r5 = r9.getChildAt(r2)
            android.view.View r1 = r9.f901h
            if (r5 != r1) goto L32
        L29:
            int r1 = r2 + 1
            r2 = r1
            goto L1f
        L2d:
            int r0 = r0.leftMargin
            goto L17
        L30:
            r0 = r1
            goto L1a
        L32:
            float r1 = r9.f903j
            float r1 = r8 - r1
            int r6 = r9.f906m
            float r6 = (float) r6
            float r1 = r1 * r6
            int r1 = (int) r1
            r9.f903j = r10
            float r6 = r8 - r10
            int r7 = r9.f906m
            float r7 = (float) r7
            float r6 = r6 * r7
            int r6 = (int) r6
            int r1 = r1 - r6
            if (r3 == 0) goto L48
            int r1 = -r1
        L48:
            r5.offsetLeftAndRight(r1)
            if (r0 == 0) goto L29
            if (r3 == 0) goto L58
            float r1 = r9.f903j
            float r1 = r1 - r8
        L52:
            int r6 = r9.f896c
            r9.m12455a(r5, r1, r6)
            goto L29
        L58:
            float r1 = r9.f903j
            float r1 = r8 - r1
            goto L52
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.widget.SlidingPaneLayout.m12463a(float):void");
    }

    /* renamed from: e */
    boolean m12441e(View view) {
        if (view == null) {
            return false;
        }
        return this.f900g && ((LayoutParams) view.getLayoutParams()).f918c && this.f902i > 0.0f;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f920a = m12443e() ? m12446d() : this.f911r;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f920a) {
            m12453b();
        } else {
            m12449c();
        }
        this.f911r = savedState.f920a;
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$c */
    /* loaded from: classes.dex */
    private class C0457c extends C0478ac.AbstractC0481a {
        private C0457c() {
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public boolean mo12294a(View view, int i) {
            if (SlidingPaneLayout.this.f905l) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f917b;
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public void mo12298a(int i) {
            if (SlidingPaneLayout.this.f910q.m12341a() == 0) {
                if (SlidingPaneLayout.this.f902i == 0.0f) {
                    SlidingPaneLayout.this.m12444d(SlidingPaneLayout.this.f901h);
                    SlidingPaneLayout.this.m12447c(SlidingPaneLayout.this.f901h);
                    SlidingPaneLayout.this.f911r = false;
                    return;
                }
                SlidingPaneLayout.this.m12451b(SlidingPaneLayout.this.f901h);
                SlidingPaneLayout.this.f911r = true;
            }
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: b */
        public void mo12288b(View view, int i) {
            SlidingPaneLayout.this.m12464a();
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public void mo12292a(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.m12461a(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public void mo12295a(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m12440f()) {
                int paddingRight = layoutParams.rightMargin + SlidingPaneLayout.this.getPaddingRight();
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f902i > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f904k;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f901h.getWidth();
            } else {
                paddingLeft = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f902i > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f904k;
                }
            }
            SlidingPaneLayout.this.f910q.m12334a(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public int mo12296a(View view) {
            return SlidingPaneLayout.this.f904k;
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public int mo12293a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f901h.getLayoutParams();
            if (SlidingPaneLayout.this.m12440f()) {
                int width = SlidingPaneLayout.this.getWidth() - ((layoutParams.rightMargin + SlidingPaneLayout.this.getPaddingRight()) + SlidingPaneLayout.this.f901h.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f904k);
            }
            int paddingLeft = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f904k + paddingLeft);
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: b */
        public int mo12287b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: b */
        public void mo12290b(int i, int i2) {
            SlidingPaneLayout.this.f910q.m12329a(SlidingPaneLayout.this.f901h, i2);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$LayoutParams */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f915e = {16843137};

        /* renamed from: a */
        public float f916a;

        /* renamed from: b */
        boolean f917b;

        /* renamed from: c */
        boolean f918c;

        /* renamed from: d */
        Paint f919d;

        public LayoutParams() {
            super(-1, -1);
            this.f916a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f916a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f916a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f916a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f915e);
            this.f916a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.widget.SlidingPaneLayout$SavedState */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v4.widget.SlidingPaneLayout.SavedState.1
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
        boolean f920a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f920a = parcel.readInt() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f920a ? 1 : 0);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$f */
    /* loaded from: classes.dex */
    static class C0460f implements InterfaceC0459e {
        C0460f() {
        }

        @Override // android.support.p002v4.widget.SlidingPaneLayout.InterfaceC0459e
        /* renamed from: a */
        public void mo12425a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0309ai.m12927a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$g */
    /* loaded from: classes.dex */
    static class C0461g extends C0460f {

        /* renamed from: a */
        private Method f926a;

        /* renamed from: b */
        private Field f927b;

        C0461g() {
            try {
                this.f926a = View.class.getDeclaredMethod("getDisplayList", null);
            } catch (NoSuchMethodException e) {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
            }
            try {
                this.f927b = View.class.getDeclaredField("mRecreateDisplayList");
                this.f927b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
            }
        }

        @Override // android.support.p002v4.widget.SlidingPaneLayout.C0460f, android.support.p002v4.widget.SlidingPaneLayout.InterfaceC0459e
        /* renamed from: a */
        public void mo12425a(SlidingPaneLayout slidingPaneLayout, View view) {
            if (this.f926a != null && this.f927b != null) {
                try {
                    this.f927b.setBoolean(view, true);
                    this.f926a.invoke(view, null);
                } catch (Exception e) {
                    Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
                }
                super.mo12425a(slidingPaneLayout, view);
                return;
            }
            view.invalidate();
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$h */
    /* loaded from: classes.dex */
    static class C0462h extends C0460f {
        C0462h() {
        }

        @Override // android.support.p002v4.widget.SlidingPaneLayout.C0460f, android.support.p002v4.widget.SlidingPaneLayout.InterfaceC0459e
        /* renamed from: a */
        public void mo12425a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0309ai.m12924a(view, ((LayoutParams) view.getLayoutParams()).f919d);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$a */
    /* loaded from: classes.dex */
    class C0455a extends C0249a {

        /* renamed from: c */
        private final Rect f922c = new Rect();

        C0455a() {
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public void mo12432a(View view, C0261b c0261b) {
            C0261b m13139a = C0261b.m13139a(c0261b);
            super.mo12432a(view, m13139a);
            m12433a(c0261b, m13139a);
            m13139a.m13099t();
            c0261b.m13130b(SlidingPaneLayout.class.getName());
            c0261b.m13138a(view);
            ViewParent m12901f = C0309ai.m12901f(view);
            if (m12901f instanceof View) {
                c0261b.m13125c((View) m12901f);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!m12430b(childAt) && childAt.getVisibility() == 0) {
                    C0309ai.m12908c(childAt, 1);
                    c0261b.m13131b(childAt);
                }
            }
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: d */
        public void mo12429d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo12429d(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public boolean mo12431a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (m12430b(view)) {
                return false;
            }
            return super.mo12431a(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: b */
        public boolean m12430b(View view) {
            return SlidingPaneLayout.this.m12441e(view);
        }

        /* renamed from: a */
        private void m12433a(C0261b c0261b, C0261b c0261b2) {
            Rect rect = this.f922c;
            c0261b2.m13141a(rect);
            c0261b.m13132b(rect);
            c0261b2.m13126c(rect);
            c0261b.m13121d(rect);
            c0261b.m13123c(c0261b2.m13113h());
            c0261b.m13137a(c0261b2.m13103p());
            c0261b.m13130b(c0261b2.m13102q());
            c0261b.m13124c(c0261b2.m13100s());
            c0261b.m13112h(c0261b2.m13106m());
            c0261b.m13116f(c0261b2.m13108k());
            c0261b.m13135a(c0261b2.m13117f());
            c0261b.m13129b(c0261b2.m13115g());
            c0261b.m13120d(c0261b2.m13111i());
            c0261b.m13118e(c0261b2.m13109j());
            c0261b.m13114g(c0261b2.m13107l());
            c0261b.m13142a(c0261b2.m13134b());
            c0261b.m13133b(c0261b2.m13128c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.SlidingPaneLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC0456b implements Runnable {

        /* renamed from: a */
        final View f923a;

        RunnableC0456b(View view) {
            this.f923a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f923a.getParent() == SlidingPaneLayout.this) {
                C0309ai.m12926a(this.f923a, 0, (Paint) null);
                SlidingPaneLayout.this.m12436g(this.f923a);
            }
            SlidingPaneLayout.this.f914u.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m12440f() {
        return C0309ai.m12904e(this) == 1;
    }
}
