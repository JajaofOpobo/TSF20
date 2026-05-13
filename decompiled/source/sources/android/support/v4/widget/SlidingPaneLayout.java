package android.support.v4.widget;

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
import android.support.v4.view.ai;
import android.support.v4.widget.ac;
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
/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    static final e a;
    private int b;
    private int c;
    private Drawable d;
    private Drawable e;
    private final int f;
    private boolean g;
    private View h;
    private float i;
    private float j;
    private int k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private d p;
    private final ac q;
    private boolean r;
    private boolean s;
    private final Rect t;
    private final ArrayList<b> u;

    /* loaded from: classes.dex */
    public interface d {
        void a(View view);

        void a(View view, float f);

        void b(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        void a(SlidingPaneLayout slidingPaneLayout, View view);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            a = new h();
        } else if (i >= 16) {
            a = new g();
        } else {
            a = new f();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -858993460;
        this.s = true;
        this.t = new Rect();
        this.u = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f = (int) ((32.0f * f2) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        ai.a(this, new a());
        ai.c((View) this, 1);
        this.q = ac.a(this, 0.5f, new c());
        this.q.a(f2 * 400.0f);
    }

    public void setParallaxDistance(int i) {
        this.m = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.m;
    }

    public void setSliderFadeColor(int i) {
        this.b = i;
    }

    public int getSliderFadeColor() {
        return this.b;
    }

    public void setCoveredFadeColor(int i) {
        this.c = i;
    }

    public int getCoveredFadeColor() {
        return this.c;
    }

    public void setPanelSlideListener(d dVar) {
        this.p = dVar;
    }

    void a(View view) {
        if (this.p != null) {
            this.p.a(view, this.i);
        }
    }

    void b(View view) {
        if (this.p != null) {
            this.p.a(view);
        }
        sendAccessibilityEvent(32);
    }

    void c(View view) {
        if (this.p != null) {
            this.p.b(view);
        }
        sendAccessibilityEvent(32);
    }

    void d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean f2 = f();
        int width = f2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = f2 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view != null && f(view)) {
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
                int max = Math.max(f2 ? paddingLeft : width, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                int min = Math.min(f2 ? width : paddingLeft, childAt.getRight());
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

    void a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    private static boolean f(View view) {
        Drawable background;
        if (ai.g(view)) {
            return true;
        }
        return Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = true;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            this.u.get(i).run();
        }
        this.u.clear();
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
        float f2;
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
        this.h = null;
        int i9 = 0;
        int i10 = paddingLeft;
        int i11 = i6;
        float f3 = 0.0f;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.c = false;
                i7 = i10;
                f2 = f3;
                i8 = i11;
                z = z2;
            } else {
                if (layoutParams.a > 0.0f) {
                    f3 += layoutParams.a;
                    if (layoutParams.width == 0) {
                        i7 = i10;
                        f2 = f3;
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
                layoutParams.b = z3;
                boolean z4 = z3 | z2;
                if (layoutParams.b) {
                    this.h = childAt;
                }
                i7 = i13;
                i8 = i11;
                float f4 = f3;
                z = z4;
                f2 = f4;
            }
            i9++;
            z2 = z;
            i11 = i8;
            f3 = f2;
            i10 = i7;
        }
        if (z2 || f3 > 0.0f) {
            int i14 = paddingLeft - this.f;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != 8) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        boolean z5 = layoutParams2.width == 0 && layoutParams2.a > 0.0f;
                        int measuredWidth2 = z5 ? 0 : childAt2.getMeasuredWidth();
                        if (z2 && childAt2 != this.h) {
                            if (layoutParams2.width < 0 && (measuredWidth2 > i14 || layoutParams2.a > 0.0f)) {
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
                        } else if (layoutParams2.a > 0.0f) {
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
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((int) ((layoutParams2.a * Math.max(0, i10)) / f3)) + measuredWidth2, 1073741824), makeMeasureSpec);
                            }
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, getPaddingTop() + i11 + getPaddingBottom());
        this.g = z2;
        if (this.q.a() != 0 && !z2) {
            this.q.f();
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
        boolean f2 = f();
        if (f2) {
            this.q.a(2);
        } else {
            this.q.a(1);
        }
        int i10 = i3 - i;
        int paddingRight = f2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = f2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.s) {
            this.i = (this.g && this.r) ? 1.0f : 0.0f;
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
                if (layoutParams.b) {
                    int min = (Math.min(paddingRight, (i10 - paddingLeft) - this.f) - i12) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.k = min;
                    int i13 = f2 ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.c = ((i12 + i13) + min) + (measuredWidth / 2) > i10 - paddingLeft;
                    int i14 = (int) (min * this.i);
                    i6 = i12 + i13 + i14;
                    this.i = i14 / this.k;
                    i5 = 0;
                } else if (!this.g || this.m == 0) {
                    i5 = 0;
                    i6 = paddingRight;
                } else {
                    i5 = (int) ((1.0f - this.i) * this.m);
                    i6 = paddingRight;
                }
                if (f2) {
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
        if (this.s) {
            if (this.g) {
                if (this.m != 0) {
                    a(this.i);
                }
                if (((LayoutParams) this.h.getLayoutParams()).c) {
                    a(this.h, this.i, this.b);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    a(getChildAt(i15), 0.0f, this.b);
                }
            }
            d(this.h);
        }
        this.s = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.s = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.g) {
            this.r = view == this.h;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int a2 = android.support.v4.view.t.a(motionEvent);
        if (!this.g && a2 == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.r = !this.q.b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.g || (this.l && a2 != 0)) {
            this.q.e();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (a2 == 3 || a2 == 1) {
            this.q.e();
            return false;
        } else {
            switch (a2) {
                case 0:
                    this.l = false;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.n = x;
                    this.o = y;
                    if (this.q.b(this.h, (int) x, (int) y) && e(this.h)) {
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
                    float abs = Math.abs(x2 - this.n);
                    float abs2 = Math.abs(y2 - this.o);
                    if (abs > this.q.d() && abs2 > abs) {
                        this.q.e();
                        this.l = true;
                        return false;
                    }
                    z = false;
                    break;
            }
            return this.q.a(motionEvent) || z;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g) {
            return super.onTouchEvent(motionEvent);
        }
        this.q.b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.n = x;
                this.o = y;
                return true;
            case 1:
                if (!e(this.h)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f2 = x2 - this.n;
                float f3 = y2 - this.o;
                int d2 = this.q.d();
                if ((f2 * f2) + (f3 * f3) >= d2 * d2 || !this.q.b(this.h, (int) x2, (int) y2)) {
                    return true;
                }
                a(this.h, 0);
                return true;
            default:
                return true;
        }
    }

    private boolean a(View view, int i) {
        if (this.s || a(0.0f, i)) {
            this.r = false;
            return true;
        }
        return false;
    }

    private boolean b(View view, int i) {
        if (this.s || a(1.0f, i)) {
            this.r = true;
            return true;
        }
        return false;
    }

    public boolean b() {
        return b(this.h, 0);
    }

    public boolean c() {
        return a(this.h, 0);
    }

    public boolean d() {
        return !this.g || this.i == 1.0f;
    }

    public boolean e() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.h == null) {
            this.i = 0.0f;
            return;
        }
        boolean f2 = f();
        LayoutParams layoutParams = (LayoutParams) this.h.getLayoutParams();
        int width = this.h.getWidth();
        if (f2) {
            i = (getWidth() - i) - width;
        }
        this.i = (i - ((f2 ? layoutParams.rightMargin : layoutParams.leftMargin) + (f2 ? getPaddingRight() : getPaddingLeft()))) / this.k;
        if (this.m != 0) {
            a(this.i);
        }
        if (layoutParams.c) {
            a(this.h, this.i, this.b);
        }
        a(this.h);
    }

    private void a(View view, float f2, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f2)) << 24) | (16777215 & i);
            if (layoutParams.d == null) {
                layoutParams.d = new Paint();
            }
            layoutParams.d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (ai.d(view) != 2) {
                ai.a(view, 2, layoutParams.d);
            }
            g(view);
        } else if (ai.d(view) != 0) {
            if (layoutParams.d != null) {
                layoutParams.d.setColorFilter(null);
            }
            b bVar = new b(view);
            this.u.add(bVar);
            ai.a(this, bVar);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (this.g && !layoutParams.b && this.h != null) {
            canvas.getClipBounds(this.t);
            if (f()) {
                this.t.left = Math.max(this.t.left, this.h.getRight());
            } else {
                this.t.right = Math.min(this.t.right, this.h.getLeft());
            }
            canvas.clipRect(this.t);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            drawChild = super.drawChild(canvas, view, j);
        } else if (layoutParams.c && this.i > 0.0f) {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, view.getLeft(), view.getTop(), layoutParams.d);
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
    public void g(View view) {
        a.a(this, view);
    }

    boolean a(float f2, int i) {
        int paddingLeft;
        if (this.g) {
            boolean f3 = f();
            LayoutParams layoutParams = (LayoutParams) this.h.getLayoutParams();
            if (f3) {
                paddingLeft = (int) (getWidth() - (((layoutParams.rightMargin + getPaddingRight()) + (this.k * f2)) + this.h.getWidth()));
            } else {
                paddingLeft = (int) (layoutParams.leftMargin + getPaddingLeft() + (this.k * f2));
            }
            if (this.q.a(this.h, paddingLeft, this.h.getTop())) {
                a();
                ai.b(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.q.a(true)) {
            if (!this.g) {
                this.q.f();
            } else {
                ai.b(this);
            }
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.e = drawable;
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
        if (f()) {
            drawable = this.e;
        } else {
            drawable = this.d;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (f()) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(float r10) {
        /*
            r9 = this;
            r1 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r9.f()
            android.view.View r0 = r9.h
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r0 = (android.support.v4.widget.SlidingPaneLayout.LayoutParams) r0
            boolean r2 = r0.c
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
            android.view.View r1 = r9.h
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
            float r1 = r9.j
            float r1 = r8 - r1
            int r6 = r9.m
            float r6 = (float) r6
            float r1 = r1 * r6
            int r1 = (int) r1
            r9.j = r10
            float r6 = r8 - r10
            int r7 = r9.m
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
            float r1 = r9.j
            float r1 = r1 - r8
        L52:
            int r6 = r9.c
            r9.a(r5, r1, r6)
            goto L29
        L58:
            float r1 = r9.j
            float r1 = r8 - r1
            goto L52
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.a(float):void");
    }

    boolean e(View view) {
        if (view == null) {
            return false;
        }
        return this.g && ((LayoutParams) view.getLayoutParams()).c && this.i > 0.0f;
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
        savedState.a = e() ? d() : this.r;
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
        if (savedState.a) {
            b();
        } else {
            c();
        }
        this.r = savedState.a;
    }

    /* loaded from: classes.dex */
    private class c extends ac.a {
        private c() {
        }

        @Override // android.support.v4.widget.ac.a
        public boolean a(View view, int i) {
            if (SlidingPaneLayout.this.l) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).b;
        }

        @Override // android.support.v4.widget.ac.a
        public void a(int i) {
            if (SlidingPaneLayout.this.q.a() == 0) {
                if (SlidingPaneLayout.this.i == 0.0f) {
                    SlidingPaneLayout.this.d(SlidingPaneLayout.this.h);
                    SlidingPaneLayout.this.c(SlidingPaneLayout.this.h);
                    SlidingPaneLayout.this.r = false;
                    return;
                }
                SlidingPaneLayout.this.b(SlidingPaneLayout.this.h);
                SlidingPaneLayout.this.r = true;
            }
        }

        @Override // android.support.v4.widget.ac.a
        public void b(View view, int i) {
            SlidingPaneLayout.this.a();
        }

        @Override // android.support.v4.widget.ac.a
        public void a(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.a(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // android.support.v4.widget.ac.a
        public void a(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.f()) {
                int paddingRight = layoutParams.rightMargin + SlidingPaneLayout.this.getPaddingRight();
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.i > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.k;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.h.getWidth();
            } else {
                paddingLeft = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.i > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.k;
                }
            }
            SlidingPaneLayout.this.q.a(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // android.support.v4.widget.ac.a
        public int a(View view) {
            return SlidingPaneLayout.this.k;
        }

        @Override // android.support.v4.widget.ac.a
        public int a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.h.getLayoutParams();
            if (SlidingPaneLayout.this.f()) {
                int width = SlidingPaneLayout.this.getWidth() - ((layoutParams.rightMargin + SlidingPaneLayout.this.getPaddingRight()) + SlidingPaneLayout.this.h.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.k);
            }
            int paddingLeft = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.k + paddingLeft);
        }

        @Override // android.support.v4.widget.ac.a
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // android.support.v4.widget.ac.a
        public void b(int i, int i2) {
            SlidingPaneLayout.this.q.a(SlidingPaneLayout.this.h, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] e = {16843137};
        public float a;
        boolean b;
        boolean c;
        Paint d;

        public LayoutParams() {
            super(-1, -1);
            this.a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
        boolean a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    static class f implements e {
        f() {
        }

        @Override // android.support.v4.widget.SlidingPaneLayout.e
        public void a(SlidingPaneLayout slidingPaneLayout, View view) {
            ai.a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    static class g extends f {
        private Method a;
        private Field b;

        g() {
            try {
                this.a = View.class.getDeclaredMethod("getDisplayList", null);
            } catch (NoSuchMethodException e) {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
            }
            try {
                this.b = View.class.getDeclaredField("mRecreateDisplayList");
                this.b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
            }
        }

        @Override // android.support.v4.widget.SlidingPaneLayout.f, android.support.v4.widget.SlidingPaneLayout.e
        public void a(SlidingPaneLayout slidingPaneLayout, View view) {
            if (this.a != null && this.b != null) {
                try {
                    this.b.setBoolean(view, true);
                    this.a.invoke(view, null);
                } catch (Exception e) {
                    Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
                }
                super.a(slidingPaneLayout, view);
                return;
            }
            view.invalidate();
        }
    }

    /* loaded from: classes.dex */
    static class h extends f {
        h() {
        }

        @Override // android.support.v4.widget.SlidingPaneLayout.f, android.support.v4.widget.SlidingPaneLayout.e
        public void a(SlidingPaneLayout slidingPaneLayout, View view) {
            ai.a(view, ((LayoutParams) view.getLayoutParams()).d);
        }
    }

    /* loaded from: classes.dex */
    class a extends android.support.v4.view.a {
        private final Rect c = new Rect();

        a() {
        }

        @Override // android.support.v4.view.a
        public void a(View view, android.support.v4.view.a.b bVar) {
            android.support.v4.view.a.b a = android.support.v4.view.a.b.a(bVar);
            super.a(view, a);
            a(bVar, a);
            a.t();
            bVar.b(SlidingPaneLayout.class.getName());
            bVar.a(view);
            ViewParent f = ai.f(view);
            if (f instanceof View) {
                bVar.c((View) f);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!b(childAt) && childAt.getVisibility() == 0) {
                    ai.c(childAt, 1);
                    bVar.b(childAt);
                }
            }
        }

        @Override // android.support.v4.view.a
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // android.support.v4.view.a
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (b(view)) {
                return false;
            }
            return super.a(viewGroup, view, accessibilityEvent);
        }

        public boolean b(View view) {
            return SlidingPaneLayout.this.e(view);
        }

        private void a(android.support.v4.view.a.b bVar, android.support.v4.view.a.b bVar2) {
            Rect rect = this.c;
            bVar2.a(rect);
            bVar.b(rect);
            bVar2.c(rect);
            bVar.d(rect);
            bVar.c(bVar2.h());
            bVar.a(bVar2.p());
            bVar.b(bVar2.q());
            bVar.c(bVar2.s());
            bVar.h(bVar2.m());
            bVar.f(bVar2.k());
            bVar.a(bVar2.f());
            bVar.b(bVar2.g());
            bVar.d(bVar2.i());
            bVar.e(bVar2.j());
            bVar.g(bVar2.l());
            bVar.a(bVar2.b());
            bVar.b(bVar2.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final View a;

        b(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getParent() == SlidingPaneLayout.this) {
                ai.a(this.a, 0, (Paint) null);
                SlidingPaneLayout.this.g(this.a);
            }
            SlidingPaneLayout.this.u.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return ai.e(this) == 1;
    }
}
