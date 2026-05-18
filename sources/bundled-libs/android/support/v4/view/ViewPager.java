package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
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
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ViewPager extends ViewGroup {
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private android.support.v4.widget.k S;
    private android.support.v4.widget.k T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int aa;
    private List<e> ab;
    private e ac;
    private e ad;
    private d ae;
    private f af;
    private Method ag;
    private int ah;
    private ArrayList<View> ai;
    private final Runnable ak;
    private int al;
    private int b;
    private final ArrayList<b> e;
    private final b f;
    private final Rect g;
    private ac h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private boolean n;
    private g o;
    private int p;
    private Drawable q;
    private int r;
    private int s;
    private float t;
    private float u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;
    private static final int[] a = {R.attr.layout_gravity};
    private static final Comparator<b> c = new Comparator<b>() { // from class: android.support.v4.view.ViewPager.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.b - bVar2.b;
        }
    };
    private static final Interpolator d = new Interpolator() { // from class: android.support.v4.view.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private static final h aj = new h();

    interface a {
    }

    interface d {
        void a(ac acVar, ac acVar2);
    }

    public interface e {
        void a(int i, float f, int i2);

        void b_(int i);

        void c_(int i);
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
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.U = true;
        this.V = false;
        this.ak = new Runnable() { // from class: android.support.v4.view.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.c();
            }
        };
        this.al = 0;
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
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.U = true;
        this.V = false;
        this.ak = new Runnable() { // from class: android.support.v4.view.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.c();
            }
        };
        this.al = 0;
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
        this.F = au.a(viewConfiguration);
        this.M = (int) (400.0f * f2);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.S = new android.support.v4.widget.k(context);
        this.T = new android.support.v4.widget.k(context);
        this.O = (int) (25.0f * f2);
        this.P = (int) (2.0f * f2);
        this.D = (int) (16.0f * f2);
        ai.a(this, new c());
        if (ai.c(this) == 0) {
            ai.c((View) this, 1);
        }
        ai.a(this, new ab() { // from class: android.support.v4.view.ViewPager.4
            private final Rect b = new Rect();

            @Override // android.support.v4.view.ab
            public bi a(View view, bi biVar) {
                bi biVarA = ai.a(view, biVar);
                if (!biVarA.e()) {
                    Rect rect = this.b;
                    rect.left = biVarA.a();
                    rect.top = biVarA.b();
                    rect.right = biVarA.c();
                    rect.bottom = biVarA.d();
                    int childCount = ViewPager.this.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        bi biVarB = ai.b(ViewPager.this.getChildAt(i), biVarA);
                        rect.left = Math.min(biVarB.a(), rect.left);
                        rect.top = Math.min(biVarB.b(), rect.top);
                        rect.right = Math.min(biVarB.c(), rect.right);
                        rect.bottom = Math.min(biVarB.d(), rect.bottom);
                    }
                    return biVarA.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return biVarA;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.ak);
        if (this.m != null && !this.m.isFinished()) {
            this.m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.al != i) {
            this.al = i;
            if (this.af != null) {
                b(i != 0);
            }
            f(i);
        }
    }

    public void setAdapter(ac acVar) {
        if (this.h != null) {
            this.h.c((DataSetObserver) null);
            this.h.a((ViewGroup) this);
            for (int i = 0; i < this.e.size(); i++) {
                b bVar = this.e.get(i);
                this.h.a((ViewGroup) this, bVar.b, bVar.a);
            }
            this.h.b((ViewGroup) this);
            this.e.clear();
            j();
            this.i = 0;
            scrollTo(0, 0);
        }
        ac acVar2 = this.h;
        this.h = acVar;
        this.b = 0;
        if (this.h != null) {
            if (this.o == null) {
                this.o = new g();
            }
            this.h.c(this.o);
            this.z = false;
            boolean z = this.U;
            this.U = true;
            this.b = this.h.b();
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
        if (this.ae != null && acVar2 != acVar) {
            this.ae.a(acVar2, acVar);
        }
    }

    private void j() {
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

    public ac getAdapter() {
        return this.h;
    }

    void setOnAdapterChangeListener(d dVar) {
        this.ae = dVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.z = false;
        a(i, !this.U, false);
    }

    public void a(int i, boolean z) {
        this.z = false;
        a(i, z, false);
    }

    public int getCurrentItem() {
        return this.i;
    }

    void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    void a(int i, boolean z, boolean z2, int i2) {
        if (this.h == null || this.h.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.i == i && this.e.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.h.b()) {
            i = this.h.b() - 1;
        }
        int i3 = this.A;
        if (i > this.i + i3 || i < this.i - i3) {
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                this.e.get(i4).c = true;
            }
        }
        boolean z3 = this.i != i;
        if (this.U) {
            this.i = i;
            if (z3) {
                e(i);
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
            iMax = (int) (Math.max(this.t, Math.min(bVarB.e, this.u)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            a(iMax, 0, i2);
            if (z2) {
                e(i);
                return;
            }
            return;
        }
        if (z2) {
            e(i);
        }
        a(false);
        scrollTo(iMax, 0);
        d(iMax);
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.ac = eVar;
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.ag == null) {
                try {
                    this.ag = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e2) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e2);
                }
            }
            try {
                this.ag.invoke(this, Boolean.valueOf(z));
            } catch (Exception e3) {
                Log.e("ViewPager", "Error changing children drawing order", e3);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ah == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.ai.get(i2).getLayoutParams()).f;
    }

    e a(e eVar) {
        e eVar2 = this.ad;
        this.ad = eVar;
        return eVar2;
    }

    public int getOffscreenPageLimit() {
        return this.A;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.A) {
            this.A = i;
            c();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.p;
        this.p = i;
        int width = getWidth();
        a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.p;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.q = drawable;
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
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    float a(float f2) {
        return (float) Math.sin((float) (((double) (f2 - 0.5f)) * 0.4712389167638204d));
    }

    void a(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.m == null || this.m.isFinished()) ? false : true) {
            int currX = this.n ? this.m.getCurrX() : this.m.getStartX();
            this.m.abortAnimation();
            setScrollingCacheEnabled(false);
            scrollX = currX;
        } else {
            scrollX = getScrollX();
        }
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
            iAbs = (int) (((Math.abs(i4) / ((clientWidth * this.h.d(this.i)) + this.p)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.n = false;
        this.m.startScroll(scrollX, scrollY, i4, i5, iMin);
        ai.b(this);
    }

    b a(int i, int i2) {
        b bVar = new b();
        bVar.b = i;
        bVar.a = this.h.a((ViewGroup) this, i);
        bVar.d = this.h.d(i);
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
        int iB = this.h.b();
        this.b = iB;
        boolean z3 = this.e.size() < (this.A * 2) + 1 && this.e.size() < iB;
        boolean z4 = false;
        int i2 = this.i;
        boolean z5 = z3;
        int i3 = 0;
        while (i3 < this.e.size()) {
            b bVar = this.e.get(i3);
            int iA = this.h.a(bVar.a);
            if (iA == -1) {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            } else if (iA == -2) {
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
                    iMax = Math.max(0, Math.min(this.i, iB - 1));
                    z2 = true;
                } else {
                    i = i4;
                    z = z4;
                    iMax = i2;
                    z2 = true;
                }
            } else if (bVar.b != iA) {
                if (bVar.b == this.i) {
                    i2 = iA;
                }
                bVar.b = iA;
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
        String hexString;
        int i2;
        b bVar2;
        b bVarA;
        if (this.i == i) {
            bVar = null;
        } else {
            b bVarB = b(this.i);
            this.i = i;
            bVar = bVarB;
        }
        if (this.h == null) {
            k();
            return;
        }
        if (this.z) {
            k();
            return;
        }
        if (getWindowToken() != null) {
            this.h.a((ViewGroup) this);
            int i3 = this.A;
            int iMax = Math.max(0, this.i - i3);
            int iB = this.h.b();
            int iMin = Math.min(iB - 1, i3 + this.i);
            if (iB != this.b) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException e2) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + iB + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.h.getClass());
            }
            int i4 = 0;
            while (true) {
                i2 = i4;
                if (i2 >= this.e.size()) {
                    break;
                }
                bVar2 = this.e.get(i2);
                if (bVar2.b < this.i) {
                    i4 = i2 + 1;
                } else if (bVar2.b != this.i) {
                    break;
                }
            }
            bVar2 = null;
            b bVarA2 = (bVar2 != null || iB <= 0) ? bVar2 : a(this.i, i2);
            if (bVarA2 != null) {
                int i5 = i2 - 1;
                b bVar3 = i5 >= 0 ? this.e.get(i5) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - bVarA2.d) + (getPaddingLeft() / clientWidth);
                float f2 = 0.0f;
                int i6 = i2;
                int i7 = i5;
                for (int i8 = this.i - 1; i8 >= 0; i8--) {
                    if (f2 >= paddingLeft && i8 < iMax) {
                        if (bVar3 == null) {
                            break;
                        }
                        if (i8 == bVar3.b && !bVar3.c) {
                            this.e.remove(i7);
                            this.h.a((ViewGroup) this, i8, bVar3.a);
                            i7--;
                            i6--;
                            bVar3 = i7 >= 0 ? this.e.get(i7) : null;
                        }
                    } else if (bVar3 != null && i8 == bVar3.b) {
                        f2 += bVar3.d;
                        i7--;
                        bVar3 = i7 >= 0 ? this.e.get(i7) : null;
                    } else {
                        f2 += a(i8, i7 + 1).d;
                        i6++;
                        bVar3 = i7 >= 0 ? this.e.get(i7) : null;
                    }
                }
                float f3 = bVarA2.d;
                int i9 = i6 + 1;
                if (f3 < 2.0f) {
                    b bVar4 = i9 < this.e.size() ? this.e.get(i9) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    b bVar5 = bVar4;
                    int i10 = i9;
                    int i11 = this.i + 1;
                    while (i11 < iB) {
                        if (f3 >= paddingRight && i11 > iMin) {
                            if (bVar5 == null) {
                                break;
                            }
                            if (i11 == bVar5.b && !bVar5.c) {
                                this.e.remove(i10);
                                this.h.a((ViewGroup) this, i11, bVar5.a);
                                bVar5 = i10 < this.e.size() ? this.e.get(i10) : null;
                            }
                        } else if (bVar5 != null && i11 == bVar5.b) {
                            f3 += bVar5.d;
                            i10++;
                            bVar5 = i10 < this.e.size() ? this.e.get(i10) : null;
                        } else {
                            b bVarA3 = a(i11, i10);
                            i10++;
                            f3 += bVarA3.d;
                            bVar5 = i10 < this.e.size() ? this.e.get(i10) : null;
                        }
                        i11++;
                        bVar5 = bVar5;
                        f3 = f3;
                    }
                }
                a(bVarA2, i6, bVar);
            }
            this.h.b((ViewGroup) this, this.i, bVarA2 != null ? bVarA2.a : null);
            this.h.b((ViewGroup) this);
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f = i12;
                if (!layoutParams.a && layoutParams.c == 0.0f && (bVarA = a(childAt)) != null) {
                    layoutParams.c = bVarA.d;
                    layoutParams.e = bVarA.b;
                }
            }
            k();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                b bVarB2 = viewFindFocus != null ? b(viewFindFocus) : null;
                if (bVarB2 == null || bVarB2.b != this.i) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt2 = getChildAt(i13);
                        b bVarA4 = a(childAt2);
                        if (bVarA4 != null && bVarA4.b == this.i && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void k() {
        if (this.ah != 0) {
            if (this.ai == null) {
                this.ai = new ArrayList<>();
            } else {
                this.ai.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ai.add(getChildAt(i));
            }
            Collections.sort(this.ai, aj);
        }
    }

    private void a(b bVar, int i, b bVar2) {
        b bVar3;
        b bVar4;
        int iB = this.h.b();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.p / clientWidth : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.b;
            if (i2 < bVar.b) {
                float fD = bVar2.e + bVar2.d + f2;
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
                        fD += this.h.d(i3) + f2;
                        i3++;
                    }
                    bVar4.e = fD;
                    fD += bVar4.d + f2;
                    i3++;
                }
            } else if (i2 > bVar.b) {
                int size = this.e.size() - 1;
                float fD2 = bVar2.e;
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
                        fD2 -= this.h.d(i5) + f2;
                        i5--;
                    }
                    fD2 -= bVar3.d + f2;
                    bVar3.e = fD2;
                    i5--;
                }
            }
        }
        int size2 = this.e.size();
        float f3 = bVar.e;
        int i6 = bVar.b - 1;
        this.t = bVar.b == 0 ? bVar.e : -3.4028235E38f;
        this.u = bVar.b == iB + (-1) ? (bVar.e + bVar.d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            b bVar7 = this.e.get(i7);
            float fD3 = f3;
            while (i6 > bVar7.b) {
                fD3 -= this.h.d(i6) + f2;
                i6--;
            }
            f3 = fD3 - (bVar7.d + f2);
            bVar7.e = f3;
            if (bVar7.b == 0) {
                this.t = f3;
            }
            i6--;
        }
        float f4 = bVar.e + bVar.d + f2;
        int i8 = bVar.b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            b bVar8 = this.e.get(i9);
            float fD4 = f4;
            while (i8 < bVar8.b) {
                fD4 = this.h.d(i8) + f2 + fD4;
                i8++;
            }
            if (bVar8.b == iB - 1) {
                this.u = (bVar8.d + fD4) - 1.0f;
            }
            bVar8.e = fD4;
            f4 = fD4 + bVar8.d + f2;
            i8++;
        }
        this.V = false;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = android.support.v4.os.d.a(new android.support.v4.os.e<SavedState>() { // from class: android.support.v4.view.ViewPager.SavedState.1
            @Override // android.support.v4.os.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.support.v4.os.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] a(int i) {
                return new SavedState[i];
            }
        });
        int a;
        Parcelable b;
        ClassLoader c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        if (this.h != null) {
            savedState.b = this.h.a();
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
        if (this.x) {
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
        if (this.x) {
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
        this.U = true;
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a(i, i3, this.p, this.p);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.e.isEmpty()) {
            if (!this.m.isFinished()) {
                this.m.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
            return;
        }
        b bVarB = b(this.i);
        int iMin = (int) ((bVarB != null ? Math.min(bVarB.e, this.u) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        this.n = true;
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
            ai.b(this);
            return;
        }
        a(true);
    }

    private boolean d(int i) {
        if (this.e.size() == 0) {
            if (this.U) {
                return false;
            }
            this.W = false;
            a(0, 0.0f, 0);
            if (this.W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b bVarM = m();
        int clientWidth = getClientWidth();
        int i2 = this.p + clientWidth;
        int i3 = bVarM.b;
        float f2 = ((i / clientWidth) - bVarM.e) / (bVarM.d + (this.p / clientWidth));
        this.W = false;
        a(i3, f2, (int) (i2 * f2));
        if (!this.W) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    protected void a(int i, float f2, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.aa > 0) {
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
        b(i, f2, i2);
        if (this.af != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).a) {
                    this.af.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.W = true;
    }

    private void b(int i, float f2, int i2) {
        if (this.ac != null) {
            this.ac.a(i, f2, i2);
        }
        if (this.ab != null) {
            int size = this.ab.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar = this.ab.get(i3);
                if (eVar != null) {
                    eVar.a(i, f2, i2);
                }
            }
        }
        if (this.ad != null) {
            this.ad.a(i, f2, i2);
        }
    }

    private void e(int i) {
        if (this.ac != null) {
            this.ac.b_(i);
        }
        if (this.ab != null) {
            int size = this.ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.ab.get(i2);
                if (eVar != null) {
                    eVar.b_(i);
                }
            }
        }
        if (this.ad != null) {
            this.ad.b_(i);
        }
    }

    private void f(int i) {
        if (this.ac != null) {
            this.ac.c_(i);
        }
        if (this.ab != null) {
            int size = this.ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.ab.get(i2);
                if (eVar != null) {
                    eVar.c_(i);
                }
            }
        }
        if (this.ad != null) {
            this.ad.c_(i);
        }
    }

    private void a(boolean z) {
        boolean z2 = this.al == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.m.isFinished()) {
                this.m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.m.getCurrX();
                int currY = this.m.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        d(currX);
                    }
                }
            }
        }
        this.z = false;
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
                ai.a(this, this.ak);
            } else {
                this.ak.run();
            }
        }
    }

    private boolean a(float f2, float f3) {
        return (f2 < ((float) this.E) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.E)) && f3 < 0.0f);
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ai.a(getChildAt(i), z ? 2 : 0, (Paint) null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            l();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.I = x;
                this.G = x;
                float y = motionEvent.getY();
                this.J = y;
                this.H = y;
                this.K = t.b(motionEvent, 0);
                this.C = false;
                this.n = true;
                this.m.computeScrollOffset();
                if (this.al == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.P) {
                    this.m.abortAnimation();
                    this.z = false;
                    c();
                    this.B = true;
                    c(true);
                    setScrollState(1);
                } else {
                    a(false);
                    this.B = false;
                }
                break;
            case 2:
                int i = this.K;
                if (i != -1) {
                    int iA = t.a(motionEvent, i);
                    float fC = t.c(motionEvent, iA);
                    float f2 = fC - this.G;
                    float fAbs = Math.abs(f2);
                    float fD = t.d(motionEvent, iA);
                    float fAbs2 = Math.abs(fD - this.J);
                    if (f2 != 0.0f && !a(this.G, f2) && a(this, false, (int) f2, (int) fC, (int) fD)) {
                        this.G = fC;
                        this.H = fD;
                        this.C = true;
                        return false;
                    }
                    if (fAbs > this.F && 0.5f * fAbs > fAbs2) {
                        this.B = true;
                        c(true);
                        setScrollState(1);
                        this.G = f2 > 0.0f ? this.I + this.F : this.I - this.F;
                        this.H = fD;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > this.F) {
                        this.C = true;
                    }
                    if (this.B && c(fC)) {
                        ai.b(this);
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean l() {
        this.K = -1;
        n();
        return this.S.c() | this.T.c();
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean c(float f2) {
        boolean z;
        float f3;
        boolean z2 = true;
        float f4 = this.G - f2;
        this.G = f2;
        float scrollX = getScrollX() + f4;
        int clientWidth = getClientWidth();
        float f5 = clientWidth * this.t;
        float f6 = clientWidth * this.u;
        b bVar = this.e.get(0);
        b bVar2 = this.e.get(this.e.size() - 1);
        if (bVar.b != 0) {
            f5 = bVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.b != this.h.b() - 1) {
            f3 = bVar2.e * clientWidth;
            z2 = false;
        } else {
            f3 = f6;
        }
        if (scrollX < f5) {
            if (z) {
                zA = this.S.a(Math.abs(f5 - scrollX) / clientWidth);
            }
        } else if (scrollX > f3) {
            zA = z2 ? this.T.a(Math.abs(scrollX - f3) / clientWidth) : false;
            f5 = f3;
        } else {
            f5 = scrollX;
        }
        this.G += f5 - ((int) f5);
        scrollTo((int) f5, getScrollY());
        d((int) f5);
        return zA;
    }

    private b m() {
        int i;
        b bVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.p / clientWidth : 0.0f;
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
                bVar4.d = this.h.d(bVar4.b);
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
        if (Math.abs(i3) > this.O && Math.abs(i2) > this.M) {
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
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zA = false;
        int iA = ai.a(this);
        if (iA == 0 || (iA == 1 && this.h != null && this.h.b() > 1)) {
            if (!this.S.a()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.t * width);
                this.S.a(height, width);
                zA = false | this.S.a(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.T.a()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.u + 1.0f)) * width2);
                this.T.a(height2, width2);
                zA |= this.T.a(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.S.b();
            this.T.b();
        }
        if (zA) {
            ai.b(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (this.p > 0 && this.q != null && this.e.size() > 0 && this.h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = this.p / width;
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
                    float fD = this.h.d(i4);
                    f2 = (f4 + fD) * width;
                    f4 += fD + f3;
                }
                if (this.p + f2 > scrollX) {
                    this.q.setBounds(Math.round(f2), this.r, Math.round(this.p + f2), this.s);
                    this.q.draw(canvas);
                }
                if (f2 > scrollX + width) {
                    return;
                }
            }
        }
    }

    public boolean d() {
        if (this.B) {
            return false;
        }
        this.Q = true;
        setScrollState(1);
        this.G = 0.0f;
        this.I = 0.0f;
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        } else {
            this.L.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.L.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.R = jUptimeMillis;
        return true;
    }

    public void e() {
        if (!this.Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.h != null) {
            VelocityTracker velocityTracker = this.L;
            velocityTracker.computeCurrentVelocity(1000, this.N);
            int iA = (int) ag.a(velocityTracker, this.K);
            this.z = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            b bVarM = m();
            a(a(bVarM.b, ((scrollX / clientWidth) - bVarM.e) / bVarM.d, iA, (int) (this.G - this.I)), true, true, iA);
        }
        n();
        this.Q = false;
    }

    public void b(float f2) {
        if (!this.Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.h != null) {
            this.G += f2;
            float scrollX = getScrollX() - f2;
            int clientWidth = getClientWidth();
            float f3 = clientWidth * this.t;
            float f4 = clientWidth * this.u;
            b bVar = this.e.get(0);
            b bVar2 = this.e.get(this.e.size() - 1);
            float f5 = bVar.b != 0 ? bVar.e * clientWidth : f3;
            float f6 = bVar2.b != this.h.b() + (-1) ? bVar2.e * clientWidth : f4;
            if (scrollX >= f5) {
                f5 = scrollX > f6 ? f6 : scrollX;
            }
            this.G += f5 - ((int) f5);
            scrollTo((int) f5, getScrollY());
            d((int) f5);
            MotionEvent motionEventObtain = MotionEvent.obtain(this.R, SystemClock.uptimeMillis(), 2, this.G, 0.0f, 0);
            this.L.addMovement(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    public boolean f() {
        return this.Q;
    }

    private void a(MotionEvent motionEvent) {
        int iB = t.b(motionEvent);
        if (t.b(motionEvent, iB) == this.K) {
            int i = iB == 0 ? 1 : 0;
            this.G = t.c(motionEvent, i);
            this.K = t.b(motionEvent, i);
            if (this.L != null) {
                this.L.clear();
            }
        }
    }

    private void n() {
        this.B = false;
        this.C = false;
        if (this.L != null) {
            this.L.recycle();
            this.L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.t));
        }
        if (i > 0) {
            return scrollX < ((int) (((float) clientWidth) * this.u));
        }
        return false;
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
        return z && ai.a(view, -i);
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
                    if (!android.support.v4.view.g.a(keyEvent)) {
                        if (android.support.v4.view.g.a(keyEvent, 1)) {
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.c(int):boolean");
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

    boolean g() {
        if (this.i <= 0) {
            return false;
        }
        a(this.i - 1, true);
        return true;
    }

    boolean h() {
        if (this.h == null || this.i >= this.h.b() - 1) {
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

    class c extends android.support.v4.view.a {
        c() {
        }

        @Override // android.support.v4.view.a
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            android.support.v4.view.a.j jVarA = android.support.v4.view.a.a.a(accessibilityEvent);
            jVarA.a(b());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.h != null) {
                jVarA.a(ViewPager.this.h.b());
                jVarA.b(ViewPager.this.i);
                jVarA.c(ViewPager.this.i);
            }
        }

        @Override // android.support.v4.view.a
        public void a(View view, android.support.v4.view.a.b bVar) {
            super.a(view, bVar);
            bVar.b(ViewPager.class.getName());
            bVar.i(b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                bVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                bVar.a(ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
            }
        }

        @Override // android.support.v4.view.a
        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!ViewPager.this.canScrollHorizontally(1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.i + 1);
                    return true;
                case ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES /* 8192 */:
                    if (!ViewPager.this.canScrollHorizontally(-1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.i - 1);
                    return true;
                default:
                    return false;
            }
        }

        private boolean b() {
            return ViewPager.this.h != null && ViewPager.this.h.b() > 1;
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
