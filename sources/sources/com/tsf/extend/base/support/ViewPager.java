package com.tsf.extend.base.support;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ViewPager extends ViewGroup {
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private e U;
    private e V;
    private d W;
    private f aa;
    private Method ab;
    private int ac;
    private ArrayList<View> ad;
    private final Runnable af;
    private int ag;
    private int b;
    private final ArrayList<b> e;
    private final b f;
    private final Rect g;
    private com.tsf.extend.base.support.a h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private g n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;
    private static final int[] a = {R.attr.layout_gravity};
    private static final Comparator<b> c = new Comparator<b>() { // from class: com.tsf.extend.base.support.ViewPager.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.b - bVar2.b;
        }
    };
    private static final Interpolator d = new Interpolator() { // from class: com.tsf.extend.base.support.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private static final h ae = new h();

    interface a {
    }

    interface d {
        void a(com.tsf.extend.base.support.a aVar, com.tsf.extend.base.support.a aVar2);
    }

    public interface e {
        void a(int i);

        void a(int i, float f, int i2);

        void b(int i);
    }

    public interface f {
        void a(View view, float f);
    }

    static class b {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b() {
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.e = new ArrayList<>();
        this.f = new b();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.Q = true;
        this.R = false;
        this.af = new Runnable() { // from class: com.tsf.extend.base.support.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.c();
            }
        };
        this.ag = 0;
        a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList<>();
        this.f = new b();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.Q = true;
        this.R = false;
        this.af = new Runnable() { // from class: com.tsf.extend.base.support.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.c();
            }
        };
        this.ag = 0;
        a();
    }

    void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.E = viewConfiguration.getScaledPagingTouchSlop();
        this.L = (int) (400.0f * f2);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.N = (int) (25.0f * f2);
        this.O = (int) (2.0f * f2);
        this.C = (int) (f2 * 16.0f);
        setAccessibilityDelegate(new c());
        if (d(this)) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.af);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.ag != i) {
            this.ag = i;
            if (this.aa != null) {
                b(i != 0);
            }
            if (this.U != null) {
                this.U.b(i);
            }
        }
    }

    public void setAdapter(com.tsf.extend.base.support.a aVar) {
        if (this.h != null) {
            this.h.b(this.n);
            this.h.a((ViewGroup) this);
            for (int i = 0; i < this.e.size(); i++) {
                b bVar = this.e.get(i);
                this.h.a((ViewGroup) this, bVar.b, bVar.a);
            }
            this.h.b((ViewGroup) this);
            this.e.clear();
            g();
            this.i = 0;
            scrollTo(0, 0);
        }
        com.tsf.extend.base.support.a aVar2 = this.h;
        this.h = aVar;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new g();
            }
            this.h.a((DataSetObserver) this.n);
            this.y = false;
            boolean z = this.Q;
            this.Q = true;
            this.b = this.h.a();
            if (this.j >= 0) {
                this.h.a(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (!z) {
                c();
            } else {
                requestLayout();
            }
        }
        if (this.W != null && aVar2 != aVar) {
            this.W.a(aVar2, aVar);
        }
    }

    private void g() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public com.tsf.extend.base.support.a getAdapter() {
        return this.h;
    }

    void setOnAdapterChangeListener(d dVar) {
        this.W = dVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.y = false;
        a(i, !this.Q, false);
    }

    public void a(int i, boolean z) {
        this.y = false;
        a(i, z, false);
    }

    public int getCurrentItem() {
        return this.i;
    }

    void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    void a(int i, boolean z, boolean z2, int i2) {
        if (this.h == null || this.h.a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.i == i && this.e.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.h.a()) {
            i = this.h.a() - 1;
        }
        int i3 = this.z;
        if (i > this.i + i3 || i < this.i - i3) {
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                this.e.get(i4).c = true;
            }
        }
        boolean z3 = this.i != i;
        if (this.Q) {
            this.i = i;
            if (z3 && this.U != null) {
                this.U.a(i);
            }
            if (z3 && this.V != null) {
                this.V.a(i);
            }
            requestLayout();
            return;
        }
        a(i);
        a(i, z, i2, z3);
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int iMax;
        b bVarB = b(i);
        if (bVarB != null) {
            iMax = (int) (Math.max(this.s, Math.min(bVarB.e, this.t)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            a(iMax, 0, i2);
            if (z2 && this.U != null) {
                this.U.a(i);
            }
            if (z2 && this.V != null) {
                this.V.a(i);
                return;
            }
            return;
        }
        if (z2 && this.U != null) {
            this.U.a(i);
        }
        if (z2 && this.V != null) {
            this.V.a(i);
        }
        a(false);
        scrollTo(iMax, 0);
    }

    public void setOnPageChangeListener(e eVar) {
        this.U = eVar;
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.ab == null) {
                try {
                    this.ab = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e2) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e2);
                }
            }
            try {
                this.ab.invoke(this, Boolean.valueOf(z));
            } catch (Exception e3) {
                Log.e("ViewPager", "Error changing children drawing order", e3);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ac == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.ad.get(i2).getLayoutParams()).f;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.z) {
            this.z = i;
            c();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.o;
        this.o = i;
        int width = getWidth();
        a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.o;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    float a(float f2) {
        return (float) Math.sin((float) (((double) (f2 - 0.5f)) * 0.4712389167638204d));
    }

    void a(int i, int i2, int i3) {
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float fA = (i6 * a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth))) + i6;
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(1000.0f * Math.abs(fA / iAbs2)) * 4;
        } else {
            iAbs = (int) (((Math.abs(i4) / ((clientWidth * this.h.a(this.i)) + this.o)) + 1.0f) * 100.0f);
        }
        this.m.startScroll(scrollX, scrollY, i4, i5, Math.min(iAbs, 600));
        c(this);
    }

    b a(int i, int i2) {
        b bVar = new b();
        bVar.b = i;
        bVar.a = this.h.a((ViewGroup) this, i);
        bVar.d = this.h.a(i);
        if (i2 < 0 || i2 >= this.e.size()) {
            this.e.add(bVar);
        } else {
            this.e.add(i2, bVar);
        }
        return bVar;
    }

    void b() {
        int i;
        boolean z;
        int iMax;
        boolean z2;
        int iA = this.h.a();
        this.b = iA;
        boolean z3 = this.e.size() < (this.z * 2) + 1 && this.e.size() < iA;
        boolean z4 = false;
        int i2 = this.i;
        boolean z5 = z3;
        int i3 = 0;
        while (i3 < this.e.size()) {
            b bVar = this.e.get(i3);
            int iA2 = this.h.a(bVar.a);
            if (iA2 == -1) {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            } else if (iA2 == -2) {
                this.e.remove(i3);
                int i4 = i3 - 1;
                if (!z4) {
                    this.h.a((ViewGroup) this);
                    z4 = true;
                }
                this.h.a((ViewGroup) this, bVar.b, bVar.a);
                if (this.i == bVar.b) {
                    i = i4;
                    z = z4;
                    iMax = Math.max(0, Math.min(this.i, iA - 1));
                    z2 = true;
                } else {
                    i = i4;
                    z = z4;
                    iMax = i2;
                    z2 = true;
                }
            } else if (bVar.b != iA2) {
                if (bVar.b == this.i) {
                    i2 = iA2;
                }
                bVar.b = iA2;
                i = i3;
                z = z4;
                iMax = i2;
                z2 = true;
            } else {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            }
            z5 = z2;
            i2 = iMax;
            z4 = z;
            i3 = i + 1;
        }
        if (z4) {
            this.h.b((ViewGroup) this);
        }
        Collections.sort(this.e, c);
        if (z5) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    void c() {
        a(this.i);
    }

    void a(int i) {
        b bVar;
        int i2;
        String hexString;
        int i3;
        b bVar2;
        b bVarA;
        if (this.i == i) {
            bVar = null;
            i2 = 2;
        } else {
            int i4 = this.i < i ? 66 : 17;
            b bVarB = b(this.i);
            this.i = i;
            bVar = bVarB;
            i2 = i4;
        }
        if (this.h == null) {
            h();
            return;
        }
        if (this.y) {
            h();
            return;
        }
        if (getWindowToken() != null) {
            this.h.a((ViewGroup) this);
            int i5 = this.z;
            int iMax = Math.max(0, this.i - i5);
            int iA = this.h.a();
            int iMin = Math.min(iA - 1, i5 + this.i);
            if (iA != this.b) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException e2) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + iA + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.h.getClass());
            }
            int i6 = 0;
            while (true) {
                i3 = i6;
                if (i3 >= this.e.size()) {
                    break;
                }
                bVar2 = this.e.get(i3);
                if (bVar2.b < this.i) {
                    i6 = i3 + 1;
                } else if (bVar2.b != this.i) {
                    break;
                }
            }
            bVar2 = null;
            b bVarA2 = (bVar2 != null || iA <= 0) ? bVar2 : a(this.i, i3);
            if (bVarA2 != null) {
                int i7 = i3 - 1;
                b bVar3 = i7 >= 0 ? this.e.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - bVarA2.d) + (getPaddingLeft() / clientWidth);
                float f2 = 0.0f;
                int i8 = i3;
                int i9 = i7;
                for (int i10 = this.i - 1; i10 >= 0; i10--) {
                    if (f2 >= paddingLeft && i10 < iMax) {
                        if (bVar3 == null) {
                            break;
                        }
                        if (i10 == bVar3.b && !bVar3.c) {
                            this.e.remove(i9);
                            this.h.a((ViewGroup) this, i10, bVar3.a);
                            i9--;
                            i8--;
                            bVar3 = i9 >= 0 ? this.e.get(i9) : null;
                        }
                    } else if (bVar3 != null && i10 == bVar3.b) {
                        f2 += bVar3.d;
                        i9--;
                        bVar3 = i9 >= 0 ? this.e.get(i9) : null;
                    } else {
                        f2 += a(i10, i9 + 1).d;
                        i8++;
                        bVar3 = i9 >= 0 ? this.e.get(i9) : null;
                    }
                }
                float f3 = bVarA2.d;
                int i11 = i8 + 1;
                if (f3 < 2.0f) {
                    b bVar4 = i11 < this.e.size() ? this.e.get(i11) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    b bVar5 = bVar4;
                    int i12 = i11;
                    int i13 = this.i + 1;
                    while (i13 < iA) {
                        if (f3 >= paddingRight && i13 > iMin) {
                            if (bVar5 == null) {
                                break;
                            }
                            if (i13 == bVar5.b && !bVar5.c) {
                                this.e.remove(i12);
                                this.h.a((ViewGroup) this, i13, bVar5.a);
                                bVar5 = i12 < this.e.size() ? this.e.get(i12) : null;
                            }
                        } else if (bVar5 != null && i13 == bVar5.b) {
                            f3 += bVar5.d;
                            i12++;
                            bVar5 = i12 < this.e.size() ? this.e.get(i12) : null;
                        } else {
                            b bVarA3 = a(i13, i12);
                            i12++;
                            f3 += bVarA3.d;
                            bVar5 = i12 < this.e.size() ? this.e.get(i12) : null;
                        }
                        i13++;
                        bVar5 = bVar5;
                        f3 = f3;
                    }
                }
                a(bVarA2, i8, bVar);
            }
            this.h.b((ViewGroup) this, this.i, bVarA2 != null ? bVarA2.a : null);
            this.h.b((ViewGroup) this);
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f = i14;
                if (!layoutParams.a && layoutParams.c == 0.0f && (bVarA = a(childAt)) != null) {
                    layoutParams.c = bVarA.d;
                    layoutParams.e = bVarA.b;
                }
            }
            h();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                b bVarB2 = viewFindFocus != null ? b(viewFindFocus) : null;
                if (bVarB2 == null || bVarB2.b != this.i) {
                    for (int i15 = 0; i15 < getChildCount(); i15++) {
                        View childAt2 = getChildAt(i15);
                        b bVarA4 = a(childAt2);
                        if (bVarA4 != null && bVarA4.b == this.i && childAt2.requestFocus(i2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void h() {
        if (this.ac != 0) {
            if (this.ad == null) {
                this.ad = new ArrayList<>();
            } else {
                this.ad.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ad.add(getChildAt(i));
            }
            Collections.sort(this.ad, ae);
        }
    }

    private void a(b bVar, int i, b bVar2) {
        b bVar3;
        b bVar4;
        int iA = this.h.a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.o / clientWidth : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.b;
            if (i2 < bVar.b) {
                float fA = bVar2.e + bVar2.d + f2;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.b && i4 < this.e.size()) {
                    b bVar5 = this.e.get(i4);
                    while (true) {
                        bVar4 = bVar5;
                        if (i3 <= bVar4.b || i4 >= this.e.size() - 1) {
                            break;
                        }
                        i4++;
                        bVar5 = this.e.get(i4);
                    }
                    while (i3 < bVar4.b) {
                        fA += this.h.a(i3) + f2;
                        i3++;
                    }
                    bVar4.e = fA;
                    fA += bVar4.d + f2;
                    i3++;
                }
            } else if (i2 > bVar.b) {
                int size = this.e.size() - 1;
                float fA2 = bVar2.e;
                int i5 = i2 - 1;
                while (i5 >= bVar.b && size >= 0) {
                    b bVar6 = this.e.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i5 >= bVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        bVar6 = this.e.get(size);
                    }
                    while (i5 > bVar3.b) {
                        fA2 -= this.h.a(i5) + f2;
                        i5--;
                    }
                    fA2 -= bVar3.d + f2;
                    bVar3.e = fA2;
                    i5--;
                }
            }
        }
        int size2 = this.e.size();
        float f3 = bVar.e;
        int i6 = bVar.b - 1;
        this.s = bVar.b == 0 ? bVar.e : -3.4028235E38f;
        this.t = bVar.b == iA + (-1) ? (bVar.e + bVar.d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            b bVar7 = this.e.get(i7);
            float fA3 = f3;
            while (i6 > bVar7.b) {
                fA3 -= this.h.a(i6) + f2;
                i6--;
            }
            f3 = fA3 - (bVar7.d + f2);
            bVar7.e = f3;
            if (bVar7.b == 0) {
                this.s = f3;
            }
            i6--;
        }
        float f4 = bVar.e + bVar.d + f2;
        int i8 = bVar.b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            b bVar8 = this.e.get(i9);
            float fA4 = f4;
            while (i8 < bVar8.b) {
                fA4 = this.h.a(i8) + f2 + fA4;
                i8++;
            }
            if (bVar8.b == iA - 1) {
                this.t = (bVar8.d + fA4) - 1.0f;
            }
            bVar8.e = fA4;
            f4 = fA4 + bVar8.d + f2;
            i8++;
        }
        this.R = false;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.tsf.extend.base.support.ViewPager.SavedState.1
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
        int a;
        Parcelable b;
        ClassLoader c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.c = getClass().getClassLoader();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.c = getClass().getClassLoader();
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(this.c);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        if (this.h != null) {
            savedState.b = this.h.b();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.h != null) {
            this.h.a(savedState.b, savedState.c);
            a(savedState.a, false, true);
        } else {
            this.j = savedState.a;
            this.k = savedState.b;
            this.l = savedState.c;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) layoutParamsGenerateLayoutParams;
        layoutParams2.a |= view instanceof a;
        if (this.w) {
            if (layoutParams2 != null && layoutParams2.a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.d = true;
            addViewInLayout(view, i, layoutParamsGenerateLayoutParams);
            return;
        }
        super.addView(view, i, layoutParamsGenerateLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    b a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.e.size()) {
                b bVar = this.e.get(i2);
                if (!this.h.a(view, bVar.a)) {
                    i = i2 + 1;
                } else {
                    return bVar;
                }
            } else {
                return null;
            }
        }
    }

    b b(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return a(view);
            }
        }
        return null;
    }

    b b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.e.size()) {
                b bVar = this.e.get(i3);
                if (bVar.b != i) {
                    i2 = i3 + 1;
                } else {
                    return bVar;
                }
            } else {
                return null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010a A[PHI: r1
  0x010a: PHI (r1v18 int) = (r1v17 int), (r1v20 int) binds: [B:28:0x0088, B:30:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.support.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a(i, i3, this.o, this.o);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.e.isEmpty()) {
            int paddingLeft = (int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
            scrollTo(paddingLeft, getScrollY());
            if (!this.m.isFinished()) {
                this.m.startScroll(paddingLeft, 0, (int) (b(this.i).e * i), 0, this.m.getDuration() - this.m.timePassed());
                return;
            }
            return;
        }
        b bVarB = b(this.i);
        int iMin = (int) ((bVarB != null ? Math.min(bVarB.e, this.t) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            a(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.support.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.m.isFinished() && this.m.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!d(currX)) {
                    this.m.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            c(this);
            return;
        }
        a(true);
    }

    private boolean d(int i) {
        if (this.e.size() == 0) {
            this.S = false;
            a(0, 0.0f, 0);
            if (this.S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b bVarI = i();
        int clientWidth = getClientWidth();
        int i2 = this.o + clientWidth;
        int i3 = bVarI.b;
        float f2 = ((i / clientWidth) - bVarI.e) / (bVarI.d + (this.o / clientWidth));
        this.S = false;
        a(i3, f2, (int) (i2 * f2));
        if (!this.S) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    protected void a(int i, float f2, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.T > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    switch (layoutParams.b & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i6 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i6;
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            int i7 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i7;
                            break;
                        case 3:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i8 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i8;
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                } else {
                    int i9 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i9;
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        if (this.U != null) {
            this.U.a(i, f2, i2);
        }
        if (this.V != null) {
            this.V.a(i, f2, i2);
        }
        if (this.aa != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).a) {
                    this.aa.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.S = true;
    }

    private void a(boolean z) {
        boolean z2 = this.ag == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.m.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.y = false;
        boolean z3 = z2;
        for (int i = 0; i < this.e.size(); i++) {
            b bVar = this.e.get(i);
            if (bVar.c) {
                bVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                a(this, this.af);
            } else {
                this.af.run();
            }
        }
    }

    private boolean a(float f2, float f3) {
        return (f2 < ((float) this.D) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.D)) && f3 < 0.0f);
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? 2 : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.A = false;
            this.B = false;
            this.J = -1;
            if (this.K == null) {
                return false;
            }
            this.K.recycle();
            this.K = null;
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.H = x;
                this.F = x;
                float y = motionEvent.getY();
                this.I = y;
                this.G = y;
                this.J = motionEvent.getPointerId(0);
                this.B = false;
                this.m.computeScrollOffset();
                if (this.ag == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
                    this.m.abortAnimation();
                    this.y = false;
                    c();
                    this.A = true;
                    setScrollState(1);
                } else {
                    a(false);
                    this.A = false;
                }
                break;
            case 2:
                int i = this.J;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f2 = x2 - this.F;
                    float fAbs = Math.abs(f2);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.I);
                    if (f2 != 0.0f && !a(this.F, f2) && a(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.F = x2;
                        this.G = y2;
                        this.B = true;
                        return false;
                    }
                    if (fAbs > this.E && 0.5f * fAbs > fAbs2) {
                        this.A = true;
                        setScrollState(1);
                        this.F = f2 > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = y2;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > this.E) {
                        this.B = true;
                    }
                    if (this.A && b(x2)) {
                        c(this);
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.A;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zB = false;
        if (this.P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.h == null || this.h.a() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.m.abortAnimation();
                this.y = false;
                c();
                this.A = true;
                setScrollState(1);
                float x = motionEvent.getX();
                this.H = x;
                this.F = x;
                float y = motionEvent.getY();
                this.I = y;
                this.G = y;
                this.J = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.A) {
                    VelocityTracker velocityTracker = this.K;
                    velocityTracker.computeCurrentVelocity(1000, this.M);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.J);
                    this.y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    b bVarI = i();
                    a(a(bVarI.b, ((scrollX / clientWidth) - bVarI.e) / bVarI.d, xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.J)) - this.H)), true, true, xVelocity);
                    this.J = -1;
                    j();
                }
                break;
            case 2:
                if (!this.A) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.J);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.F);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.G);
                    if (fAbs > this.E && fAbs > fAbs2) {
                        this.A = true;
                        this.F = x2 - this.H > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                    }
                }
                if (this.A) {
                    zB = false | b(motionEvent.getX(motionEvent.findPointerIndex(this.J)));
                }
                break;
            case 3:
                if (this.A) {
                    a(this.i, true, 0, false);
                    this.J = -1;
                    j();
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.F = motionEvent.getX(actionIndex);
                this.J = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                a(motionEvent);
                this.F = motionEvent.getX(motionEvent.findPointerIndex(this.J));
                break;
        }
        if (zB) {
            c(this);
        }
        return true;
    }

    private boolean b(float f2) {
        float f3 = this.F - f2;
        this.F = f2;
        float scrollX = getScrollX() + f3;
        int clientWidth = getClientWidth();
        float f4 = clientWidth * this.s;
        float f5 = clientWidth * this.t;
        b bVar = this.e.get(0);
        b bVar2 = this.e.get(this.e.size() - 1);
        float f6 = bVar.b != 0 ? bVar.e * clientWidth : f4;
        float f7 = bVar2.b != this.h.a() + (-1) ? bVar2.e * clientWidth : f5;
        if (scrollX >= f6) {
            f6 = scrollX > f7 ? f7 : scrollX;
        }
        this.F += f6 - ((int) f6);
        scrollTo((int) f6, getScrollY());
        d((int) f6);
        return false;
    }

    private b i() {
        int i;
        b bVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.o / clientWidth : 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        b bVar2 = null;
        while (i3 < this.e.size()) {
            b bVar3 = this.e.get(i3);
            if (z || bVar3.b == i2 + 1) {
                i = i3;
                bVar = bVar3;
            } else {
                b bVar4 = this.f;
                bVar4.e = f3 + f4 + f2;
                bVar4.b = i2 + 1;
                bVar4.d = this.h.a(bVar4.b);
                i = i3 - 1;
                bVar = bVar4;
            }
            float f5 = bVar.e;
            float f6 = bVar.d + f5 + f2;
            if (!z && scrollX < f5) {
                return bVar2;
            }
            if (scrollX < f6 || i == this.e.size() - 1) {
                return bVar;
            }
            f4 = f5;
            i2 = bVar.b;
            z = false;
            f3 = bVar.d;
            bVar2 = bVar;
            i3 = i + 1;
        }
        return bVar2;
    }

    private int a(int i, float f2, int i2, int i3) {
        if (Math.abs(i3) > this.N && Math.abs(i2) > this.L) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            i = (int) ((i >= this.i ? 0.4f : 0.6f) + i + f2);
        }
        if (this.e.size() > 0) {
            return Math.max(this.e.get(0).b, Math.min(i, this.e.get(this.e.size() - 1).b));
        }
        return i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.e.size() > 0 && this.h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = this.o / width;
            b bVar = this.e.get(0);
            float f4 = bVar.e;
            int size = this.e.size();
            int i = bVar.b;
            int i2 = this.e.get(size - 1).b;
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                while (i4 > bVar.b && i3 < size) {
                    i3++;
                    bVar = this.e.get(i3);
                }
                if (i4 == bVar.b) {
                    f2 = (bVar.e + bVar.d) * width;
                    f4 = bVar.e + bVar.d + f3;
                } else {
                    float fA = this.h.a(i4);
                    f2 = (f4 + fA) * width;
                    f4 += fA + f3;
                }
                if (this.o + f2 > scrollX) {
                    this.p.setBounds((int) f2, this.q, (int) (this.o + f2 + 0.5f), this.r);
                    this.p.draw(canvas);
                }
                if (f2 > scrollX + width) {
                    return;
                }
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.F = motionEvent.getX(i);
            this.J = motionEvent.getPointerId(i);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }

    private void j() {
        this.A = false;
        this.B = false;
        if (this.K != null) {
            this.K.recycle();
            this.K = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.x != z) {
            this.x = z;
        }
    }

    protected boolean a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                break;
            case 22:
                break;
            case 61:
                if (Build.VERSION.SDK_INT >= 11) {
                    if (!keyEvent.hasNoModifiers()) {
                        if (keyEvent.hasModifiers(1)) {
                        }
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.support.ViewPager.c(int):boolean");
    }

    private Rect a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    boolean d() {
        if (this.i <= 0) {
            return false;
        }
        a(this.i - 1, true);
        return true;
    }

    boolean e() {
        if (this.h == null || this.i >= this.h.a() - 1) {
            return false;
        }
        a(this.i + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        b bVarA;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (bVarA = a(childAt)) != null && bVarA.b == this.i) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        b bVarA;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (bVarA = a(childAt)) != null && bVarA.b == this.i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        b bVarA;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (bVarA = a(childAt)) != null && bVarA.b == this.i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b bVarA;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (bVarA = a(childAt)) != null && bVarA.b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecord accessibilityRecordObtain = AccessibilityRecord.obtain();
            accessibilityRecordObtain.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.h != null) {
                accessibilityRecordObtain.setItemCount(ViewPager.this.h.a());
                accessibilityRecordObtain.setFromIndex(ViewPager.this.i);
                accessibilityRecordObtain.setToIndex(ViewPager.this.i);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ViewPager.class.getName());
            accessibilityNodeInfo.setScrollable(a());
            if (b()) {
                accessibilityNodeInfo.addAction(4096);
            }
            if (c()) {
                accessibilityNodeInfo.addAction(ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!b()) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.i + 1);
                    return true;
                case ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES /* 8192 */:
                    if (!c()) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.i - 1);
                    return true;
                default:
                    return false;
            }
        }

        private boolean a() {
            return ViewPager.this.h != null && ViewPager.this.h.a() > 1;
        }

        private boolean b() {
            return ViewPager.this.h != null && ViewPager.this.i >= 0 && ViewPager.this.i < ViewPager.this.h.a() + (-1);
        }

        private boolean c() {
            return ViewPager.this.h != null && ViewPager.this.i > 0 && ViewPager.this.i < ViewPager.this.h.a();
        }
    }

    private class g extends DataSetObserver {
        private g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.b();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.b();
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public LayoutParams() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static void c(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.invalidate();
        }
    }

    static boolean d(View view) {
        return Build.VERSION.SDK_INT >= 16 && view.getImportantForAccessibility() == 0;
    }

    static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 10L);
        }
    }

    static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.a != layoutParams2.a) {
                return layoutParams.a ? 1 : -1;
            }
            return layoutParams.e - layoutParams2.e;
        }
    }
}
