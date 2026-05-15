package android.support.v4.widget;

import android.R;
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
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    public interface d {
        void a(View view);

        void a(View view, float f);

        void b(View view);
    }

    interface e {
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
        int bottom;
        int top;
        int right;
        int left;
        int i;
        boolean zF = f();
        int width = zF ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zF ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view != null && f(view)) {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        } else {
            bottom = 0;
            top = 0;
            right = 0;
            left = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != view) {
                int iMax = Math.max(zF ? paddingLeft : width, childAt.getLeft());
                int iMax2 = Math.max(paddingTop, childAt.getTop());
                int iMin = Math.min(zF ? width : paddingLeft, childAt.getRight());
                int iMin2 = Math.min(height, childAt.getBottom());
                if (iMax >= left && iMax2 >= top && iMin <= right && iMin2 <= bottom) {
                    i = 4;
                } else {
                    i = 0;
                }
                childAt.setVisibility(i);
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

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3 A[PHI: r3
  0x00d3: PHI (r3v12 float) = (r3v11 float), (r3v14 float) binds: [B:35:0x00c5, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int width;
        int i9;
        boolean zF = f();
        if (zF) {
            this.q.a(2);
        } else {
            this.q.a(1);
        }
        int i10 = i3 - i;
        int paddingRight = zF ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zF ? getPaddingLeft() : getPaddingRight();
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
                    int iMin = (Math.min(paddingRight, (i10 - paddingLeft) - this.f) - i12) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.k = iMin;
                    int i13 = zF ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.c = ((i12 + i13) + iMin) + (measuredWidth / 2) > i10 - paddingLeft;
                    int i14 = (int) (iMin * this.i);
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
                if (zF) {
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

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int iA = android.support.v4.view.t.a(motionEvent);
        if (!this.g && iA == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.r = !this.q.b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.g || (this.l && iA != 0)) {
            this.q.e();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iA == 3 || iA == 1) {
            this.q.e();
            return false;
        }
        switch (iA) {
            case 0:
                this.l = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.n = x;
                this.o = y;
                z = this.q.b(this.h, (int) x, (int) y) && e(this.h);
                break;
            case 1:
            default:
                z = false;
                break;
            case 2:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float fAbs = Math.abs(x2 - this.n);
                float fAbs2 = Math.abs(y2 - this.o);
                if (fAbs > this.q.d() && fAbs2 > fAbs) {
                    this.q.e();
                    this.l = true;
                    return false;
                }
                z = false;
                break;
                break;
        }
        return this.q.a(motionEvent) || z;
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
                int iD = this.q.d();
                if ((f2 * f2) + (f3 * f3) >= iD * iD || !this.q.b(this.h, (int) x2, (int) y2)) {
                    return true;
                }
                a(this.h, 0);
                return true;
            default:
                return true;
        }
    }

    private boolean a(View view, int i) {
        if (!this.s && !a(0.0f, i)) {
            return false;
        }
        this.r = false;
        return true;
    }

    private boolean b(View view, int i) {
        if (!this.s && !a(1.0f, i)) {
            return false;
        }
        this.r = true;
        return true;
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
        boolean zF = f();
        LayoutParams layoutParams = (LayoutParams) this.h.getLayoutParams();
        int width = this.h.getWidth();
        if (zF) {
            i = (getWidth() - i) - width;
        }
        this.i = (i - ((zF ? layoutParams.rightMargin : layoutParams.leftMargin) + (zF ? getPaddingRight() : getPaddingLeft()))) / this.k;
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
            return;
        }
        if (ai.d(view) != 0) {
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
        boolean zDrawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save(2);
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
            zDrawChild = super.drawChild(canvas, view, j);
        } else if (layoutParams.c && this.i > 0.0f) {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, view.getLeft(), view.getTop(), layoutParams.d);
                zDrawChild = false;
            } else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                zDrawChild = super.drawChild(canvas, view, j);
            }
        } else {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            zDrawChild = super.drawChild(canvas, view, j);
        }
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(View view) {
        a.a(this, view);
    }

    boolean a(float f2, int i) {
        int paddingLeft;
        if (!this.g) {
            return false;
        }
        boolean zF = f();
        LayoutParams layoutParams = (LayoutParams) this.h.getLayoutParams();
        if (zF) {
            paddingLeft = (int) (getWidth() - (((layoutParams.rightMargin + getPaddingRight()) + (this.k * f2)) + this.h.getWidth()));
        } else {
            paddingLeft = (int) (layoutParams.leftMargin + getPaddingLeft() + (this.k * f2));
        }
        if (!this.q.a(this.h, paddingLeft, this.h.getTop())) {
            return false;
        }
        a();
        ai.b(this);
        return true;
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
        int right;
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
                right = childAt.getRight();
                left = right + intrinsicWidth;
            } else {
                left = childAt.getLeft();
                right = left - intrinsicWidth;
            }
            drawable.setBounds(right, top, left, bottom);
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
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
                } else {
                    SlidingPaneLayout.this.b(SlidingPaneLayout.this.h);
                    SlidingPaneLayout.this.r = true;
                }
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

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] e = {R.attr.layout_weight};
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
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v4.widget.SlidingPaneLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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

    static class f implements e {
        f() {
        }

        @Override // android.support.v4.widget.SlidingPaneLayout.e
        public void a(SlidingPaneLayout slidingPaneLayout, View view) {
            ai.a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    static class g extends f {
        private Method a;
        private Field b;

        g() {
            try {
                this.a = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
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
                    this.a.invoke(view, (Object[]) null);
                } catch (Exception e) {
                    Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
                }
                super.a(slidingPaneLayout, view);
                return;
            }
            view.invalidate();
        }
    }

    static class h extends f {
        h() {
        }

        @Override // android.support.v4.widget.SlidingPaneLayout.f, android.support.v4.widget.SlidingPaneLayout.e
        public void a(SlidingPaneLayout slidingPaneLayout, View view) {
            ai.a(view, ((LayoutParams) view.getLayoutParams()).d);
        }
    }

    class a extends android.support.v4.view.a {
        private final Rect c = new Rect();

        a() {
        }

        @Override // android.support.v4.view.a
        public void a(View view, android.support.v4.view.a.b bVar) {
            android.support.v4.view.a.b bVarA = android.support.v4.view.a.b.a(bVar);
            super.a(view, bVarA);
            a(bVar, bVarA);
            bVarA.t();
            bVar.b(SlidingPaneLayout.class.getName());
            bVar.a(view);
            Object objF = ai.f(view);
            if (objF instanceof View) {
                bVar.c((View) objF);
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

    private class b implements Runnable {
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
