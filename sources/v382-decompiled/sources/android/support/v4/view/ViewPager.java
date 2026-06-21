package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
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

/* loaded from: classes.dex */
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
    private long Q;
    private android.support.v4.g.a R;
    private android.support.v4.g.a S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private bn aa;
    private bn ab;
    private bm ac;
    private bo ad;
    private Method ae;
    private int af;
    private ArrayList ag;
    private final Runnable ai;
    private int aj;
    private int b;
    private final ArrayList e;
    private final bk f;
    private final Rect g;
    private ad h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private bp n;
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
    private static final Comparator c = new Comparator() { // from class: android.support.v4.view.ViewPager.1
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(bk bkVar, bk bkVar2) {
            return bkVar.b - bkVar2.b;
        }
    };
    private static final Interpolator d = new Interpolator() { // from class: android.support.v4.view.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final bq ah = new bq();

    public ViewPager(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f = new bk();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.T = true;
        this.U = false;
        this.ai = new Runnable() { // from class: android.support.v4.view.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.c();
            }
        };
        this.aj = 0;
        a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList();
        this.f = new bk();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.T = true;
        this.U = false;
        this.ai = new Runnable() { // from class: android.support.v4.view.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.c();
            }
        };
        this.aj = 0;
        a();
    }

    void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.E = bc.a(viewConfiguration);
        this.L = (int) (400.0f * f);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.R = new android.support.v4.g.a(context);
        this.S = new android.support.v4.g.a(context);
        this.N = (int) (25.0f * f);
        this.O = (int) (2.0f * f);
        this.C = (int) (16.0f * f);
        ak.a(this, new bl(this));
        if (ak.c(this) == 0) {
            ak.b(this, 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.ai);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.aj != i) {
            this.aj = i;
            if (this.ad != null) {
                b(i != 0);
            }
            if (this.aa != null) {
                this.aa.b_(i);
            }
        }
    }

    public void setAdapter(ad adVar) {
        if (this.h != null) {
            this.h.b(this.n);
            this.h.a((ViewGroup) this);
            for (int i = 0; i < this.e.size(); i++) {
                bk bkVar = (bk) this.e.get(i);
                this.h.a((ViewGroup) this, bkVar.b, bkVar.a);
            }
            this.h.b((ViewGroup) this);
            this.e.clear();
            j();
            this.i = 0;
            scrollTo(0, 0);
        }
        ad adVar2 = this.h;
        this.h = adVar;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new bp(this, null);
            }
            this.h.a((DataSetObserver) this.n);
            this.y = false;
            boolean z = this.T;
            this.T = true;
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
        if (this.ac != null && adVar2 != adVar) {
            this.ac.a(adVar2, adVar);
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

    public ad getAdapter() {
        return this.h;
    }

    void setOnAdapterChangeListener(bm bmVar) {
        this.ac = bmVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.y = false;
        a(i, !this.T, false);
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
        int i3 = this.z;
        if (i > this.i + i3 || i < this.i - i3) {
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                ((bk) this.e.get(i4)).c = true;
            }
        }
        boolean z3 = this.i != i;
        if (this.T) {
            this.i = i;
            if (z3 && this.aa != null) {
                this.aa.a_(i);
            }
            if (z3 && this.ab != null) {
                this.ab.a_(i);
            }
            requestLayout();
            return;
        }
        a(i);
        a(i, z, i2, z3);
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int i3;
        bk b = b(i);
        if (b != null) {
            i3 = (int) (Math.max(this.s, Math.min(b.e, this.t)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            a(i3, 0, i2);
            if (z2 && this.aa != null) {
                this.aa.a_(i);
            }
            if (z2 && this.ab != null) {
                this.ab.a_(i);
                return;
            }
            return;
        }
        if (z2 && this.aa != null) {
            this.aa.a_(i);
        }
        if (z2 && this.ab != null) {
            this.ab.a_(i);
        }
        a(false);
        scrollTo(i3, 0);
        d(i3);
    }

    public void setOnPageChangeListener(bn bnVar) {
        this.aa = bnVar;
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.ae == null) {
                try {
                    this.ae = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ae.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.af == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.ag.get(i2)).getLayoutParams()).f;
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

    float a(float f) {
        return (float) Math.sin((float) ((f - 0.5f) * 0.4712389167638204d));
    }

    void a(int i, int i2, int i3) {
        int abs;
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
        float a2 = (i6 * a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth))) + i6;
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(1000.0f * Math.abs(a2 / abs2)) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / ((clientWidth * this.h.d(this.i)) + this.o)) + 1.0f) * 100.0f);
        }
        this.m.startScroll(scrollX, scrollY, i4, i5, Math.min(abs, 600));
        ak.b(this);
    }

    bk a(int i, int i2) {
        bk bkVar = new bk();
        bkVar.b = i;
        bkVar.a = this.h.a((ViewGroup) this, i);
        bkVar.d = this.h.d(i);
        if (i2 < 0 || i2 >= this.e.size()) {
            this.e.add(bkVar);
        } else {
            this.e.add(i2, bkVar);
        }
        return bkVar;
    }

    void b() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int b = this.h.b();
        this.b = b;
        boolean z3 = this.e.size() < (this.z * 2) + 1 && this.e.size() < b;
        boolean z4 = false;
        int i3 = this.i;
        boolean z5 = z3;
        int i4 = 0;
        while (i4 < this.e.size()) {
            bk bkVar = (bk) this.e.get(i4);
            int a2 = this.h.a(bkVar.a);
            if (a2 == -1) {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            } else if (a2 == -2) {
                this.e.remove(i4);
                int i5 = i4 - 1;
                if (!z4) {
                    this.h.a((ViewGroup) this);
                    z4 = true;
                }
                this.h.a((ViewGroup) this, bkVar.b, bkVar.a);
                if (this.i == bkVar.b) {
                    i = i5;
                    z = z4;
                    i2 = Math.max(0, Math.min(this.i, b - 1));
                    z2 = true;
                } else {
                    i = i5;
                    z = z4;
                    i2 = i3;
                    z2 = true;
                }
            } else if (bkVar.b != a2) {
                if (bkVar.b == this.i) {
                    i3 = a2;
                }
                bkVar.b = a2;
                i = i4;
                z = z4;
                i2 = i3;
                z2 = true;
            } else {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            }
            z5 = z2;
            i3 = i2;
            z4 = z;
            i4 = i + 1;
        }
        if (z4) {
            this.h.b((ViewGroup) this);
        }
        Collections.sort(this.e, c);
        if (z5) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            a(i3, false, true);
            requestLayout();
        }
    }

    void c() {
        a(this.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d2, code lost:
    
        if (r2.b == r18.i) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void a(int i) {
        bk bkVar;
        int i2;
        String hexString;
        int i3;
        bk bkVar2;
        bk a2;
        if (this.i == i) {
            bkVar = null;
            i2 = 2;
        } else {
            int i4 = this.i < i ? 66 : 17;
            bk b = b(this.i);
            this.i = i;
            bkVar = b;
            i2 = i4;
        }
        if (this.h == null) {
            k();
            return;
        }
        if (this.y) {
            k();
            return;
        }
        if (getWindowToken() != null) {
            this.h.a((ViewGroup) this);
            int i5 = this.z;
            int max = Math.max(0, this.i - i5);
            int b2 = this.h.b();
            int min = Math.min(b2 - 1, i5 + this.i);
            if (b2 != this.b) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException e) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + b2 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.h.getClass());
            }
            int i6 = 0;
            while (true) {
                i3 = i6;
                if (i3 >= this.e.size()) {
                    break;
                }
                bkVar2 = (bk) this.e.get(i3);
                if (bkVar2.b < this.i) {
                    i6 = i3 + 1;
                }
            }
            bk a3 = (bkVar2 != null || b2 <= 0) ? bkVar2 : a(this.i, i3);
            if (a3 != null) {
                int i7 = i3 - 1;
                bk bkVar3 = i7 >= 0 ? (bk) this.e.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - a3.d) + (getPaddingLeft() / clientWidth);
                float f = 0.0f;
                int i8 = i3;
                int i9 = i7;
                for (int i10 = this.i - 1; i10 >= 0; i10--) {
                    if (f >= paddingLeft && i10 < max) {
                        if (bkVar3 == null) {
                            break;
                        }
                        if (i10 == bkVar3.b && !bkVar3.c) {
                            this.e.remove(i9);
                            this.h.a((ViewGroup) this, i10, bkVar3.a);
                            i9--;
                            i8--;
                            bkVar3 = i9 >= 0 ? (bk) this.e.get(i9) : null;
                        }
                    } else if (bkVar3 != null && i10 == bkVar3.b) {
                        f += bkVar3.d;
                        i9--;
                        bkVar3 = i9 >= 0 ? (bk) this.e.get(i9) : null;
                    } else {
                        f += a(i10, i9 + 1).d;
                        i8++;
                        bkVar3 = i9 >= 0 ? (bk) this.e.get(i9) : null;
                    }
                }
                float f2 = a3.d;
                int i11 = i8 + 1;
                if (f2 < 2.0f) {
                    bk bkVar4 = i11 < this.e.size() ? (bk) this.e.get(i11) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    bk bkVar5 = bkVar4;
                    int i12 = i11;
                    int i13 = this.i + 1;
                    while (i13 < b2) {
                        if (f2 >= paddingRight && i13 > min) {
                            if (bkVar5 == null) {
                                break;
                            }
                            if (i13 == bkVar5.b && !bkVar5.c) {
                                this.e.remove(i12);
                                this.h.a((ViewGroup) this, i13, bkVar5.a);
                                bkVar5 = i12 < this.e.size() ? (bk) this.e.get(i12) : null;
                            }
                        } else if (bkVar5 != null && i13 == bkVar5.b) {
                            f2 += bkVar5.d;
                            i12++;
                            bkVar5 = i12 < this.e.size() ? (bk) this.e.get(i12) : null;
                        } else {
                            bk a4 = a(i13, i12);
                            i12++;
                            f2 += a4.d;
                            bkVar5 = i12 < this.e.size() ? (bk) this.e.get(i12) : null;
                        }
                        i13++;
                        bkVar5 = bkVar5;
                        f2 = f2;
                    }
                }
                a(a3, i8, bkVar);
            }
            this.h.b((ViewGroup) this, this.i, a3 != null ? a3.a : null);
            this.h.b((ViewGroup) this);
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f = i14;
                if (!layoutParams.a && layoutParams.c == 0.0f && (a2 = a(childAt)) != null) {
                    layoutParams.c = a2.d;
                    layoutParams.e = a2.b;
                }
            }
            k();
            if (hasFocus()) {
                View findFocus = findFocus();
                bk b3 = findFocus != null ? b(findFocus) : null;
                if (b3 == null || b3.b != this.i) {
                    for (int i15 = 0; i15 < getChildCount(); i15++) {
                        View childAt2 = getChildAt(i15);
                        bk a5 = a(childAt2);
                        if (a5 != null && a5.b == this.i && childAt2.requestFocus(i2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void k() {
        if (this.af != 0) {
            if (this.ag == null) {
                this.ag = new ArrayList();
            } else {
                this.ag.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ag.add(getChildAt(i));
            }
            Collections.sort(this.ag, ah);
        }
    }

    private void a(bk bkVar, int i, bk bkVar2) {
        bk bkVar3;
        bk bkVar4;
        int b = this.h.b();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.o / clientWidth : 0.0f;
        if (bkVar2 != null) {
            int i2 = bkVar2.b;
            if (i2 < bkVar.b) {
                float f2 = bkVar2.e + bkVar2.d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bkVar.b && i4 < this.e.size()) {
                    Object obj = this.e.get(i4);
                    while (true) {
                        bkVar4 = (bk) obj;
                        if (i3 <= bkVar4.b || i4 >= this.e.size() - 1) {
                            break;
                        }
                        i4++;
                        obj = this.e.get(i4);
                    }
                    while (i3 < bkVar4.b) {
                        f2 += this.h.d(i3) + f;
                        i3++;
                    }
                    bkVar4.e = f2;
                    f2 += bkVar4.d + f;
                    i3++;
                }
            } else if (i2 > bkVar.b) {
                int size = this.e.size() - 1;
                float f3 = bkVar2.e;
                int i5 = i2 - 1;
                while (i5 >= bkVar.b && size >= 0) {
                    Object obj2 = this.e.get(size);
                    while (true) {
                        bkVar3 = (bk) obj2;
                        if (i5 >= bkVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.e.get(size);
                    }
                    while (i5 > bkVar3.b) {
                        f3 -= this.h.d(i5) + f;
                        i5--;
                    }
                    f3 -= bkVar3.d + f;
                    bkVar3.e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.e.size();
        float f4 = bkVar.e;
        int i6 = bkVar.b - 1;
        this.s = bkVar.b == 0 ? bkVar.e : -3.4028235E38f;
        this.t = bkVar.b == b + (-1) ? (bkVar.e + bkVar.d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            bk bkVar5 = (bk) this.e.get(i7);
            float f5 = f4;
            while (i6 > bkVar5.b) {
                f5 -= this.h.d(i6) + f;
                i6--;
            }
            f4 = f5 - (bkVar5.d + f);
            bkVar5.e = f4;
            if (bkVar5.b == 0) {
                this.s = f4;
            }
            i6--;
        }
        float f6 = bkVar.e + bkVar.d + f;
        int i8 = bkVar.b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            bk bkVar6 = (bk) this.e.get(i9);
            float f7 = f6;
            while (i8 < bkVar6.b) {
                f7 = this.h.d(i8) + f + f7;
                i8++;
            }
            if (bkVar6.b == b - 1) {
                this.t = (bkVar6.d + f7) - 1.0f;
            }
            bkVar6.e = f7;
            f6 = f7 + bkVar6.d + f;
            i8++;
        }
        this.U = false;
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = android.support.v4.d.a.a(new android.support.v4.d.c() { // from class: android.support.v4.view.ViewPager.SavedState.1
            @Override // android.support.v4.d.c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.support.v4.d.c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
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
        ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.a |= view instanceof bj;
        if (this.w) {
            if (layoutParams2 != null && layoutParams2.a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.d = true;
            addViewInLayout(view, i, generateLayoutParams);
            return;
        }
        super.addView(view, i, generateLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    bk a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.e.size()) {
                bk bkVar = (bk) this.e.get(i2);
                if (this.h.a(view, bkVar.a)) {
                    return bkVar;
                }
                i = i2 + 1;
            } else {
                return null;
            }
        }
    }

    bk b(View view) {
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

    bk b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.e.size()) {
                bk bkVar = (bk) this.e.get(i3);
                if (bkVar.b == i) {
                    return bkVar;
                }
                i2 = i3 + 1;
            } else {
                return null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.D = Math.min(measuredWidth / 10, this.C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.a) {
                int i7 = layoutParams2.b & 7;
                int i8 = layoutParams2.b & 112;
                int i9 = Integer.MIN_VALUE;
                int i10 = Integer.MIN_VALUE;
                boolean z = i8 == 48 || i8 == 80;
                boolean z2 = i7 == 3 || i7 == 5;
                if (z) {
                    i9 = 1073741824;
                } else if (z2) {
                    i10 = 1073741824;
                }
                if (layoutParams2.width != -2) {
                    i3 = 1073741824;
                    i4 = layoutParams2.width != -1 ? layoutParams2.width : paddingLeft;
                } else {
                    i3 = i9;
                    i4 = paddingLeft;
                }
                if (layoutParams2.height != -2) {
                    i10 = 1073741824;
                    if (layoutParams2.height != -1) {
                        i5 = layoutParams2.height;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i3), View.MeasureSpec.makeMeasureSpec(i5, i10));
                        if (!z) {
                            measuredHeight -= childAt.getMeasuredHeight();
                        } else if (z2) {
                            paddingLeft -= childAt.getMeasuredWidth();
                        }
                    }
                }
                i5 = measuredHeight;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i3), View.MeasureSpec.makeMeasureSpec(i5, i10));
                if (!z) {
                }
            }
        }
        this.u = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.v = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.w = true;
        c();
        this.w = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams.c * paddingLeft), 1073741824), this.v);
            }
        }
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
        bk b = b(this.i);
        int min = (int) ((b != null ? Math.min(b.e, this.t) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            a(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bk a2;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i3 - i;
        int i11 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    int i14 = layoutParams.b & 7;
                    int i15 = layoutParams.b & 112;
                    switch (i14) {
                        case 1:
                            i7 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            i7 = paddingLeft;
                            break;
                        case 3:
                            i7 = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (i10 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            i7 = measuredWidth;
                            break;
                    }
                    switch (i15) {
                        case 16:
                            measuredHeight = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i16 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i16;
                            break;
                        case 48:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i17 = paddingTop;
                            i9 = paddingBottom;
                            i8 = measuredHeight2;
                            measuredHeight = i17;
                            break;
                        case 80:
                            measuredHeight = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i8 = paddingTop;
                            i9 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i18 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i18;
                            break;
                    }
                    int i19 = i7 + scrollX;
                    childAt.layout(i19, measuredHeight, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + measuredHeight);
                    i5 = i12 + 1;
                    i6 = i8;
                    paddingBottom = i9;
                    i13++;
                    paddingLeft = paddingLeft;
                    paddingRight = paddingRight;
                    paddingTop = i6;
                    i12 = i5;
                }
            }
            i5 = i12;
            i6 = paddingTop;
            i13++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i6;
            i12 = i5;
        }
        int i20 = (i10 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.a && (a2 = a(childAt2)) != null) {
                    int i22 = ((int) (a2.e * i20)) + paddingLeft;
                    if (layoutParams2.d) {
                        layoutParams2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams2.c * i20), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.q = paddingTop;
        this.r = i11 - paddingBottom;
        this.W = i12;
        if (this.T) {
            a(this.i, false, 0, false);
        }
        this.T = false;
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
            ak.b(this);
            return;
        }
        a(true);
    }

    private boolean d(int i) {
        if (this.e.size() == 0) {
            this.V = false;
            a(0, 0.0f, 0);
            if (this.V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        bk l = l();
        int clientWidth = getClientWidth();
        int i2 = this.o + clientWidth;
        int i3 = l.b;
        float f = ((i / clientWidth) - l.e) / (l.d + (this.o / clientWidth));
        this.V = false;
        a(i3, f, (int) (i2 * f));
        if (!this.V) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    protected void a(int i, float f, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.W > 0) {
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
        if (this.aa != null) {
            this.aa.a(i, f, i2);
        }
        if (this.ab != null) {
            this.ab.a(i, f, i2);
        }
        if (this.ad != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).a) {
                    this.ad.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.V = true;
    }

    private void a(boolean z) {
        boolean z2 = this.aj == 2;
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
            bk bkVar = (bk) this.e.get(i);
            if (bkVar.c) {
                bkVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                ak.a(this, this.ai);
            } else {
                this.ai.run();
            }
        }
    }

    private boolean a(float f, float f2) {
        return (f < ((float) this.D) && f2 > 0.0f) || (f > ((float) (getWidth() - this.D)) && f2 < 0.0f);
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ak.a(getChildAt(i), z ? 2 : 0, null);
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
                this.J = w.b(motionEvent, 0);
                this.B = false;
                this.m.computeScrollOffset();
                if (this.aj == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
                    this.m.abortAnimation();
                    this.y = false;
                    c();
                    this.A = true;
                    c(true);
                    setScrollState(1);
                    break;
                } else {
                    a(false);
                    this.A = false;
                    break;
                }
                break;
            case 2:
                int i = this.J;
                if (i != -1) {
                    int a2 = w.a(motionEvent, i);
                    float c2 = w.c(motionEvent, a2);
                    float f = c2 - this.F;
                    float abs = Math.abs(f);
                    float d2 = w.d(motionEvent, a2);
                    float abs2 = Math.abs(d2 - this.I);
                    if (f != 0.0f && !a(this.F, f) && a(this, false, (int) f, (int) c2, (int) d2)) {
                        this.F = c2;
                        this.G = d2;
                        this.B = true;
                        return false;
                    }
                    if (abs > this.E && 0.5f * abs > abs2) {
                        this.A = true;
                        c(true);
                        setScrollState(1);
                        this.F = f > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = d2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > this.E) {
                        this.B = true;
                    }
                    if (this.A && c(c2)) {
                        ak.b(this);
                        break;
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
        boolean z = false;
        if (this.P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.h == null || this.h.b() == 0) {
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
                float x = motionEvent.getX();
                this.H = x;
                this.F = x;
                float y = motionEvent.getY();
                this.I = y;
                this.G = y;
                this.J = w.b(motionEvent, 0);
                break;
            case 1:
                if (this.A) {
                    VelocityTracker velocityTracker = this.K;
                    velocityTracker.computeCurrentVelocity(1000, this.M);
                    int a2 = (int) af.a(velocityTracker, this.J);
                    this.y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    bk l = l();
                    a(a(l.b, ((scrollX / clientWidth) - l.e) / l.d, a2, (int) (w.c(motionEvent, w.a(motionEvent, this.J)) - this.H)), true, true, a2);
                    this.J = -1;
                    m();
                    z = this.S.c() | this.R.c();
                    break;
                }
                break;
            case 2:
                if (!this.A) {
                    int a3 = w.a(motionEvent, this.J);
                    float c2 = w.c(motionEvent, a3);
                    float abs = Math.abs(c2 - this.F);
                    float d2 = w.d(motionEvent, a3);
                    float abs2 = Math.abs(d2 - this.G);
                    if (abs > this.E && abs > abs2) {
                        this.A = true;
                        c(true);
                        this.F = c2 - this.H > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = d2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.A) {
                    z = false | c(w.c(motionEvent, w.a(motionEvent, this.J)));
                    break;
                }
                break;
            case 3:
                if (this.A) {
                    a(this.i, true, 0, false);
                    this.J = -1;
                    m();
                    z = this.S.c() | this.R.c();
                    break;
                }
                break;
            case 5:
                int b = w.b(motionEvent);
                this.F = w.c(motionEvent, b);
                this.J = w.b(motionEvent, b);
                break;
            case 6:
                a(motionEvent);
                this.F = w.c(motionEvent, w.a(motionEvent, this.J));
                break;
        }
        if (z) {
            ak.b(this);
        }
        return true;
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean c(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        float f3 = this.F - f;
        this.F = f;
        float scrollX = getScrollX() + f3;
        int clientWidth = getClientWidth();
        float f4 = clientWidth * this.s;
        float f5 = clientWidth * this.t;
        bk bkVar = (bk) this.e.get(0);
        bk bkVar2 = (bk) this.e.get(this.e.size() - 1);
        if (bkVar.b != 0) {
            f4 = bkVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bkVar2.b != this.h.b() - 1) {
            f2 = bkVar2.e * clientWidth;
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                r2 = this.R.a(Math.abs(f4 - scrollX) / clientWidth);
            }
        } else if (scrollX > f2) {
            r2 = z2 ? this.S.a(Math.abs(scrollX - f2) / clientWidth) : false;
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.F += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        d((int) f4);
        return r2;
    }

    private bk l() {
        int i;
        bk bkVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.o / clientWidth : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        bk bkVar2 = null;
        while (i3 < this.e.size()) {
            bk bkVar3 = (bk) this.e.get(i3);
            if (z || bkVar3.b == i2 + 1) {
                i = i3;
                bkVar = bkVar3;
            } else {
                bk bkVar4 = this.f;
                bkVar4.e = f2 + f3 + f;
                bkVar4.b = i2 + 1;
                bkVar4.d = this.h.d(bkVar4.b);
                i = i3 - 1;
                bkVar = bkVar4;
            }
            float f4 = bkVar.e;
            float f5 = bkVar.d + f4 + f;
            if (!z && scrollX < f4) {
                return bkVar2;
            }
            if (scrollX < f5 || i == this.e.size() - 1) {
                return bkVar;
            }
            f3 = f4;
            i2 = bkVar.b;
            z = false;
            f2 = bkVar.d;
            bkVar2 = bkVar;
            i3 = i + 1;
        }
        return bkVar2;
    }

    private int a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.N && Math.abs(i2) > this.L) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            i = (int) ((i >= this.i ? 0.4f : 0.6f) + i + f);
        }
        if (this.e.size() > 0) {
            return Math.max(((bk) this.e.get(0)).b, Math.min(i, ((bk) this.e.get(this.e.size() - 1)).b));
        }
        return i;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int a2 = ak.a(this);
        if (a2 == 0 || (a2 == 1 && this.h != null && this.h.b() > 1)) {
            if (!this.R.a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.s * width);
                this.R.a(height, width);
                z = false | this.R.a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.S.a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.t + 1.0f)) * width2);
                this.S.a(height2, width2);
                z |= this.S.a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.R.b();
            this.S.b();
        }
        if (z) {
            ak.b(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.e.size() > 0 && this.h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = this.o / width;
            bk bkVar = (bk) this.e.get(0);
            float f3 = bkVar.e;
            int size = this.e.size();
            int i = bkVar.b;
            int i2 = ((bk) this.e.get(size - 1)).b;
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                while (i4 > bkVar.b && i3 < size) {
                    i3++;
                    bkVar = (bk) this.e.get(i3);
                }
                if (i4 == bkVar.b) {
                    f = (bkVar.e + bkVar.d) * width;
                    f3 = bkVar.e + bkVar.d + f2;
                } else {
                    float d2 = this.h.d(i4);
                    f = (f3 + d2) * width;
                    f3 += d2 + f2;
                }
                if (this.o + f > scrollX) {
                    this.p.setBounds((int) f, this.q, (int) (this.o + f + 0.5f), this.r);
                    this.p.draw(canvas);
                }
                if (f > scrollX + width) {
                    return;
                }
            }
        }
    }

    public boolean d() {
        if (this.A) {
            return false;
        }
        this.P = true;
        setScrollState(1);
        this.F = 0.0f;
        this.H = 0.0f;
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        } else {
            this.K.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.K.addMovement(obtain);
        obtain.recycle();
        this.Q = uptimeMillis;
        return true;
    }

    public void e() {
        if (!this.P) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        VelocityTracker velocityTracker = this.K;
        velocityTracker.computeCurrentVelocity(1000, this.M);
        int a2 = (int) af.a(velocityTracker, this.J);
        this.y = true;
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        bk l = l();
        a(a(l.b, ((scrollX / clientWidth) - l.e) / l.d, a2, (int) (this.F - this.H)), true, true, a2);
        m();
        this.P = false;
    }

    public void b(float f) {
        if (!this.P) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        this.F += f;
        float scrollX = getScrollX() - f;
        int clientWidth = getClientWidth();
        float f2 = clientWidth * this.s;
        float f3 = clientWidth * this.t;
        bk bkVar = (bk) this.e.get(0);
        bk bkVar2 = (bk) this.e.get(this.e.size() - 1);
        float f4 = bkVar.b != 0 ? bkVar.e * clientWidth : f2;
        float f5 = bkVar2.b != this.h.b() + (-1) ? bkVar2.e * clientWidth : f3;
        if (scrollX >= f4) {
            f4 = scrollX > f5 ? f5 : scrollX;
        }
        this.F += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        d((int) f4);
        MotionEvent obtain = MotionEvent.obtain(this.Q, SystemClock.uptimeMillis(), 2, this.F, 0.0f, 0);
        this.K.addMovement(obtain);
        obtain.recycle();
    }

    public boolean f() {
        return this.P;
    }

    private void a(MotionEvent motionEvent) {
        int b = w.b(motionEvent);
        if (w.b(motionEvent, b) == this.J) {
            int i = b == 0 ? 1 : 0;
            this.F = w.c(motionEvent, i);
            this.J = w.b(motionEvent, i);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }

    private void m() {
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

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.s)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.t));
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
        return z && ak.a(view, -i);
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
                    if (!k.a(keyEvent)) {
                        if (k.a(keyEvent, 1)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public boolean c(int i) {
        View view;
        boolean z;
        boolean g;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    }
                    if (parent == this) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = a(this.g, findNextFocus).left;
                int i3 = a(this.g, view).left;
                if (view != null && i2 >= i3) {
                    g = g();
                } else {
                    g = findNextFocus.requestFocus();
                }
            } else {
                if (i == 66) {
                    int i4 = a(this.g, findNextFocus).left;
                    int i5 = a(this.g, view).left;
                    if (view != null && i4 <= i5) {
                        g = h();
                    } else {
                        g = findNextFocus.requestFocus();
                    }
                }
                g = false;
            }
        } else if (i == 17 || i == 1) {
            g = g();
        } else {
            if (i == 66 || i == 2) {
                g = h();
            }
            g = false;
        }
        if (g) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return g;
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
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        bk a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i) {
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
    public void addTouchables(ArrayList arrayList) {
        bk a2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        bk a2;
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
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        bk a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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

    public class LayoutParams extends ViewGroup.LayoutParams {
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }
}
