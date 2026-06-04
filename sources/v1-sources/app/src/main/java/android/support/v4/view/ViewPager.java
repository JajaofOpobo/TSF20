package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
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
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private VelocityTracker J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private android.support.v4.d.a P;
    private android.support.v4.d.a Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private bb V;
    private bb W;
    private ba Z;
    private bc aa;
    private int ab;
    private ArrayList ac;
    private final Runnable ae;
    private int af;
    private final ArrayList d;
    private final ay e;
    private final Rect f;
    private v g;
    private int h;
    private int i;
    private Parcelable j;
    private ClassLoader k;
    private Scroller l;
    private bd m;
    private int n;
    private Drawable o;
    private int p;
    private int q;
    private float r;
    private float s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;
    private static final int[] a = {R.attr.layout_gravity};
    private static final Comparator b = new au();
    private static final Interpolator c = new av();
    private static final bf ad = new bf();

    public ViewPager(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new ay();
        this.f = new Rect();
        this.i = -1;
        this.j = null;
        this.k = null;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.y = 1;
        this.I = -1;
        this.R = true;
        this.S = false;
        this.ae = new aw(this);
        this.af = 0;
        f();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList();
        this.e = new ay();
        this.f = new Rect();
        this.i = -1;
        this.j = null;
        this.k = null;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.y = 1;
        this.I = -1;
        this.R = true;
        this.S = false;
        this.ae = new aw(this);
        this.af = 0;
        f();
    }

    private void f() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.l = new Scroller(context, c);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.D = aq.a(viewConfiguration);
        this.K = (int) (400.0f * f);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new android.support.v4.d.a(context);
        this.Q = new android.support.v4.d.a(context);
        this.M = (int) (25.0f * f);
        this.N = (int) (2.0f * f);
        this.B = (int) (16.0f * f);
        ai.a(this, new az(this));
        if (ai.c(this) == 0) {
            ai.d(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.ae);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (this.af != i) {
            this.af = i;
            if (this.aa != null) {
                boolean z = i != 0;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ai.b(getChildAt(i2), z ? 2 : 0);
                }
            }
            if (this.V != null) {
                this.V.b(i);
            }
        }
    }

    public final void a(v vVar) {
        if (this.g != null) {
            this.g.b(this.m);
            v vVar2 = this.g;
            for (int i = 0; i < this.d.size(); i++) {
                ay ayVar = (ay) this.d.get(i);
                this.g.a(this, ayVar.b, ayVar.a);
            }
            this.g.a();
            this.d.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.h = 0;
            scrollTo(0, 0);
        }
        v vVar3 = this.g;
        this.g = vVar;
        if (this.g != null) {
            if (this.m == null) {
                this.m = new bd(this, (byte) 0);
            }
            this.g.a((DataSetObserver) this.m);
            this.x = false;
            this.R = true;
            if (this.i >= 0) {
                this.g.a(this.j, this.k);
                a(this.i, false, true);
                this.i = -1;
                this.j = null;
                this.k = null;
            } else {
                d();
            }
        }
        if (this.Z != null && vVar3 != vVar) {
            this.Z.a(vVar3, vVar);
        }
    }

    public final v a() {
        return this.g;
    }

    final void a(ba baVar) {
        this.Z = baVar;
    }

    public final void a(int i) {
        this.x = false;
        a(i, !this.R, false);
    }

    private void c(int i) {
        this.x = false;
        a(i, true, false);
    }

    public final int b() {
        return this.h;
    }

    private void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    private void a(int i, boolean z, boolean z2, int i2) {
        if (this.g == null || this.g.c() <= 0) {
            b(false);
            return;
        }
        if (!z2 && this.h == i && this.d.size() != 0) {
            b(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.g.c()) {
            i = this.g.c() - 1;
        }
        int i3 = this.y;
        if (i > this.h + i3 || i < this.h - i3) {
            for (int i4 = 0; i4 < this.d.size(); i4++) {
                ((ay) this.d.get(i4)).c = true;
            }
        }
        boolean z3 = this.h != i;
        d(i);
        a(i, z, i2, z3);
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int abs;
        ay e = e(i);
        int i3 = 0;
        if (e != null) {
            i3 = (int) (getWidth() * Math.max(this.r, Math.min(e.e, this.s)));
        }
        if (z) {
            if (getChildCount() == 0) {
                b(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    a(false);
                    d();
                    b(0);
                } else {
                    b(true);
                    b(2);
                    int width = getWidth();
                    int i6 = width / 2;
                    float sin = (i6 * ((float) Math.sin((float) ((Math.min(1.0f, (1.0f * Math.abs(i4)) / width) - 0.5f) * 0.4712389167638204d)))) + i6;
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        abs = Math.round(1000.0f * Math.abs(sin / abs2)) * 4;
                    } else {
                        v vVar = this.g;
                        int i7 = this.h;
                        abs = (int) (((Math.abs(i4) / ((width * 1.0f) + this.n)) + 1.0f) * 100.0f);
                    }
                    this.l.startScroll(scrollX, scrollY, i4, i5, Math.min(abs, 600));
                    ai.b(this);
                }
            }
            if (z2 && this.V != null) {
                this.V.a_(i);
            }
            if (z2 && this.W != null) {
                this.W.a_(i);
                return;
            }
            return;
        }
        if (z2 && this.V != null) {
            this.V.a_(i);
        }
        if (z2 && this.W != null) {
            this.W.a_(i);
        }
        a(false);
        scrollTo(i3, 0);
    }

    public final void a(bb bbVar) {
        this.V = bbVar;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ab == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.ac.get(i2)).getLayoutParams()).f;
    }

    final bb b(bb bbVar) {
        bb bbVar2 = this.W;
        this.W = bbVar;
        return bbVar2;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    private ay a(int i, int i2) {
        ay ayVar = new ay();
        ayVar.b = i;
        ayVar.a = this.g.a(this, i);
        v vVar = this.g;
        ayVar.d = 1.0f;
        if (i2 < 0 || i2 >= this.d.size()) {
            this.d.add(ayVar);
        } else {
            this.d.add(i2, ayVar);
        }
        return ayVar;
    }

    final void c() {
        boolean z = this.d.size() < (this.y * 2) + 1 && this.d.size() < this.g.c();
        int i = this.h;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            ay ayVar = (ay) this.d.get(i2);
            v vVar = this.g;
            Object obj = ayVar.a;
        }
        Collections.sort(this.d, b);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            a(i, false, true);
            requestLayout();
        }
    }

    final void d() {
        d(this.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0.b == r14.h) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d(int i) {
        ay ayVar;
        int i2;
        ay ayVar2;
        ay a2;
        ay ayVar3;
        ay ayVar4;
        if (this.h == i) {
            ayVar = null;
        } else {
            ay e = e(this.h);
            this.h = i;
            ayVar = e;
        }
        if (this.g != null && !this.x && getWindowToken() != null) {
            v vVar = this.g;
            int i3 = this.y;
            int max = Math.max(0, this.h - i3);
            int c2 = this.g.c();
            int min = Math.min(c2 - 1, i3 + this.h);
            int i4 = 0;
            while (true) {
                i2 = i4;
                if (i2 >= this.d.size()) {
                    break;
                }
                ayVar2 = (ay) this.d.get(i2);
                if (ayVar2.b < this.h) {
                    i4 = i2 + 1;
                }
            }
            ayVar2 = null;
            ay a3 = (ayVar2 != null || c2 <= 0) ? ayVar2 : a(this.h, i2);
            if (a3 != null) {
                int i5 = i2 - 1;
                ay ayVar5 = i5 >= 0 ? (ay) this.d.get(i5) : null;
                float f = 2.0f - a3.d;
                float f2 = 0.0f;
                int i6 = i2;
                int i7 = i5;
                for (int i8 = this.h - 1; i8 >= 0; i8--) {
                    if (f2 >= f && i8 < max) {
                        if (ayVar5 == null) {
                            break;
                        }
                        if (i8 == ayVar5.b && !ayVar5.c) {
                            this.d.remove(i7);
                            this.g.a(this, i8, ayVar5.a);
                            i7--;
                            i6--;
                            ayVar5 = i7 >= 0 ? (ay) this.d.get(i7) : null;
                        }
                    } else if (ayVar5 != null && i8 == ayVar5.b) {
                        f2 += ayVar5.d;
                        i7--;
                        ayVar5 = i7 >= 0 ? (ay) this.d.get(i7) : null;
                    } else {
                        f2 += a(i8, i7 + 1).d;
                        i6++;
                        ayVar5 = i7 >= 0 ? (ay) this.d.get(i7) : null;
                    }
                }
                float f3 = a3.d;
                int i9 = i6 + 1;
                if (f3 < 2.0f) {
                    ay ayVar6 = i9 < this.d.size() ? (ay) this.d.get(i9) : null;
                    int i10 = this.h + 1;
                    while (i10 < c2) {
                        if (f3 >= 2.0f && i10 > min) {
                            if (ayVar6 == null) {
                                break;
                            }
                            if (i10 == ayVar6.b && !ayVar6.c) {
                                this.d.remove(i9);
                                this.g.a(this, i10, ayVar6.a);
                                ayVar6 = i9 < this.d.size() ? (ay) this.d.get(i9) : null;
                            }
                        } else if (ayVar6 != null && i10 == ayVar6.b) {
                            f3 += ayVar6.d;
                            i9++;
                            ayVar6 = i9 < this.d.size() ? (ay) this.d.get(i9) : null;
                        } else {
                            ay a4 = a(i10, i9);
                            i9++;
                            f3 += a4.d;
                            ayVar6 = i9 < this.d.size() ? (ay) this.d.get(i9) : null;
                        }
                        i10++;
                        ayVar6 = ayVar6;
                        f3 = f3;
                    }
                }
                int c3 = this.g.c();
                int width = getWidth();
                float f4 = width > 0 ? this.n / width : 0.0f;
                if (ayVar != null) {
                    int i11 = ayVar.b;
                    if (i11 < a3.b) {
                        float f5 = ayVar.d + ayVar.e + f4;
                        int i12 = i11 + 1;
                        int i13 = 0;
                        while (i12 <= a3.b && i13 < this.d.size()) {
                            Object obj = this.d.get(i13);
                            while (true) {
                                ayVar4 = (ay) obj;
                                if (i12 <= ayVar4.b || i13 >= this.d.size() - 1) {
                                    break;
                                }
                                i13++;
                                obj = this.d.get(i13);
                            }
                            while (i12 < ayVar4.b) {
                                v vVar2 = this.g;
                                f5 += 1.0f + f4;
                                i12++;
                            }
                            ayVar4.e = f5;
                            f5 += ayVar4.d + f4;
                            i12++;
                        }
                    } else if (i11 > a3.b) {
                        int size = this.d.size() - 1;
                        float f6 = ayVar.e;
                        int i14 = i11 - 1;
                        int i15 = size;
                        while (i14 >= a3.b && i15 >= 0) {
                            Object obj2 = this.d.get(i15);
                            while (true) {
                                ayVar3 = (ay) obj2;
                                if (i14 >= ayVar3.b || i15 <= 0) {
                                    break;
                                }
                                i15--;
                                obj2 = this.d.get(i15);
                            }
                            while (i14 > ayVar3.b) {
                                v vVar3 = this.g;
                                f6 -= 1.0f + f4;
                                i14--;
                            }
                            f6 -= ayVar3.d + f4;
                            ayVar3.e = f6;
                            i14--;
                        }
                    }
                }
                int size2 = this.d.size();
                float f7 = a3.e;
                int i16 = a3.b - 1;
                this.r = a3.b == 0 ? a3.e : -3.4028235E38f;
                this.s = a3.b == c3 + (-1) ? (a3.e + a3.d) - 1.0f : Float.MAX_VALUE;
                for (int i17 = i6 - 1; i17 >= 0; i17--) {
                    ay ayVar7 = (ay) this.d.get(i17);
                    while (i16 > ayVar7.b) {
                        v vVar4 = this.g;
                        i16--;
                        f7 -= 1.0f + f4;
                    }
                    f7 -= ayVar7.d + f4;
                    ayVar7.e = f7;
                    if (ayVar7.b == 0) {
                        this.r = f7;
                    }
                    i16--;
                }
                float f8 = a3.e + a3.d + f4;
                int i18 = a3.b + 1;
                for (int i19 = i6 + 1; i19 < size2; i19++) {
                    ay ayVar8 = (ay) this.d.get(i19);
                    while (i18 < ayVar8.b) {
                        v vVar5 = this.g;
                        i18++;
                        f8 += 1.0f + f4;
                    }
                    if (ayVar8.b == c3 - 1) {
                        this.s = (ayVar8.d + f8) - 1.0f;
                    }
                    ayVar8.e = f8;
                    f8 += ayVar8.d + f4;
                    i18++;
                }
                this.S = false;
            }
            v vVar6 = this.g;
            int i20 = this.h;
            vVar6.a(a3 != null ? a3.a : null);
            this.g.a();
            boolean z = this.ab != 0;
            if (z) {
                if (this.ac == null) {
                    this.ac = new ArrayList();
                } else {
                    this.ac.clear();
                }
            }
            int childCount = getChildCount();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt = getChildAt(i21);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f = i21;
                if (!layoutParams.a && layoutParams.c == 0.0f && (a2 = a(childAt)) != null) {
                    layoutParams.c = a2.d;
                    layoutParams.e = a2.b;
                }
                if (z) {
                    this.ac.add(childAt);
                }
            }
            if (z) {
                Collections.sort(this.ac, ad);
            }
            if (hasFocus()) {
                View findFocus = findFocus();
                ay b2 = findFocus != null ? b(findFocus) : null;
                if (b2 == null || b2.b != this.h) {
                    for (int i22 = 0; i22 < getChildCount(); i22++) {
                        View childAt2 = getChildAt(i22);
                        ay a5 = a(childAt2);
                        if (a5 != null && a5.b == this.h && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = android.support.v4.b.a.a(new be());
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
        savedState.a = this.h;
        if (this.g != null) {
            savedState.b = this.g.b();
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
        if (this.g != null) {
            this.g.a(savedState.b, savedState.c);
            a(savedState.a, false, true);
        } else {
            this.i = savedState.a;
            this.j = savedState.b;
            this.k = savedState.c;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.a |= view instanceof ax;
        if (this.v) {
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
        if (this.v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private ay a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.d.size()) {
                ay ayVar = (ay) this.d.get(i2);
                if (!this.g.a(view, ayVar.a)) {
                    i = i2 + 1;
                } else {
                    return ayVar;
                }
            } else {
                return null;
            }
        }
    }

    private ay b(View view) {
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

    private ay e(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.d.size()) {
                ay ayVar = (ay) this.d.get(i3);
                if (ayVar.b != i) {
                    i2 = i3 + 1;
                } else {
                    return ayVar;
                }
            } else {
                return null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
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
        this.C = Math.min(measuredWidth / 10, this.B);
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
        this.t = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.u = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.v = true;
        d();
        this.v = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams.c * paddingLeft), 1073741824), this.u);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.n;
            int i6 = this.n;
            if (i3 > 0 && !this.d.isEmpty()) {
                int scrollX = (int) ((i5 + i) * (getScrollX() / (i6 + i3)));
                scrollTo(scrollX, getScrollY());
                if (!this.l.isFinished()) {
                    this.l.startScroll(scrollX, 0, (int) (e(this.h).e * i), 0, this.l.getDuration() - this.l.timePassed());
                    return;
                }
                return;
            }
            ay e = e(this.h);
            int min = (int) ((e != null ? Math.min(e.e, this.s) : 0.0f) * i);
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ay a2;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int i8;
        int i9;
        this.v = true;
        d();
        this.v = false;
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
                        case ThemeParser.TYPE_CONTACT /* 16 */:
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
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.a && (a2 = a(childAt2)) != null) {
                    int i21 = ((int) (a2.e * i10)) + paddingLeft;
                    if (layoutParams2.d) {
                        layoutParams2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams2.c * ((i10 - paddingLeft) - paddingRight)), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.p = paddingTop;
        this.q = i11 - paddingBottom;
        this.U = i12;
        this.R = false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.l.isFinished() && this.l.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.l.getCurrX();
            int currY = this.l.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!f(currX)) {
                    this.l.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            ai.b(this);
            return;
        }
        a(true);
    }

    private boolean f(int i) {
        if (this.d.size() == 0) {
            this.T = false;
            a(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ay g = g();
        int width = getWidth();
        int i2 = this.n + width;
        int i3 = g.b;
        float f = ((i / width) - g.e) / (g.d + (this.n / width));
        this.T = false;
        a(i3, f, (int) (i2 * f));
        if (!this.T) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    private void a(int i, float f, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        if (this.U > 0) {
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
        if (this.V != null) {
            this.V.a(i, f, i2);
        }
        if (this.W != null) {
            this.W.a(i, f, i2);
        }
        if (this.aa != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).a) {
                    childAt2.getLeft();
                    getWidth();
                    bc bcVar = this.aa;
                }
            }
        }
        this.T = true;
    }

    private void a(boolean z) {
        boolean z2 = this.af == 2;
        if (z2) {
            b(false);
            this.l.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.l.getCurrX();
            int currY = this.l.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.x = false;
        boolean z3 = z2;
        for (int i = 0; i < this.d.size(); i++) {
            ay ayVar = (ay) this.d.get(i);
            if (ayVar.c) {
                ayVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                ai.a(this, this.ae);
            } else {
                this.ae.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.z = false;
            this.A = false;
            this.I = -1;
            if (this.J == null) {
                return false;
            }
            this.J.recycle();
            this.J = null;
            return false;
        }
        if (action != 0) {
            if (this.z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.G = x;
                this.E = x;
                float y = motionEvent.getY();
                this.H = y;
                this.F = y;
                this.I = r.b(motionEvent, 0);
                this.A = false;
                this.l.computeScrollOffset();
                if (this.af == 2 && Math.abs(this.l.getFinalX() - this.l.getCurrX()) > this.N) {
                    this.l.abortAnimation();
                    this.x = false;
                    d();
                    this.z = true;
                    b(1);
                    break;
                } else {
                    a(false);
                    this.z = false;
                    break;
                }
            case 2:
                int i = this.I;
                if (i != -1) {
                    int a2 = r.a(motionEvent, i);
                    float c2 = r.c(motionEvent, a2);
                    float f = c2 - this.E;
                    float abs = Math.abs(f);
                    float d = r.d(motionEvent, a2);
                    float abs2 = Math.abs(d - this.H);
                    if (f != 0.0f) {
                        float f2 = this.E;
                        if (!((f2 < ((float) this.C) && f > 0.0f) || (f2 > ((float) (getWidth() - this.C)) && f < 0.0f)) && a(this, false, (int) f, (int) c2, (int) d)) {
                            this.E = c2;
                            this.F = d;
                            this.A = true;
                            return false;
                        }
                    }
                    if (abs > this.D && 0.5f * abs > abs2) {
                        this.z = true;
                        b(1);
                        this.E = f > 0.0f ? this.G + this.D : this.G - this.D;
                        this.F = d;
                        b(true);
                    } else if (abs2 > this.D) {
                        this.A = true;
                    }
                    if (this.z && a(c2)) {
                        ai.b(this);
                        break;
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.z;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z = false;
        if (this.O) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.g == null || this.g.c() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.l.abortAnimation();
                this.x = false;
                d();
                this.z = true;
                b(1);
                float x = motionEvent.getX();
                this.G = x;
                this.E = x;
                float y = motionEvent.getY();
                this.H = y;
                this.F = y;
                this.I = r.b(motionEvent, 0);
                break;
            case 1:
                if (this.z) {
                    VelocityTracker velocityTracker = this.J;
                    velocityTracker.computeCurrentVelocity(ThemeShellDescription.PICKER_MENU, this.L);
                    int a2 = (int) ae.a(velocityTracker, this.I);
                    this.x = true;
                    int width = getWidth();
                    int scrollX = getScrollX();
                    ay g = g();
                    int i2 = g.b;
                    float f = ((scrollX / width) - g.e) / g.d;
                    if (Math.abs((int) (r.c(motionEvent, r.a(motionEvent, this.I)) - this.G)) <= this.M || Math.abs(a2) <= this.K) {
                        i = (int) (i2 + f + (i2 >= this.h ? 0.4f : 0.6f));
                    } else {
                        if (a2 <= 0) {
                            i2++;
                        }
                        i = i2;
                    }
                    if (this.d.size() > 0) {
                        i = Math.max(((ay) this.d.get(0)).b, Math.min(i, ((ay) this.d.get(this.d.size() - 1)).b));
                    }
                    a(i, true, true, a2);
                    this.I = -1;
                    h();
                    z = this.P.c() | this.Q.c();
                    break;
                }
                break;
            case 2:
                if (!this.z) {
                    int a3 = r.a(motionEvent, this.I);
                    float c2 = r.c(motionEvent, a3);
                    float abs = Math.abs(c2 - this.E);
                    float d = r.d(motionEvent, a3);
                    float abs2 = Math.abs(d - this.F);
                    if (abs > this.D && abs > abs2) {
                        this.z = true;
                        this.E = c2 - this.G > 0.0f ? this.G + this.D : this.G - this.D;
                        this.F = d;
                        b(1);
                        b(true);
                    }
                }
                if (this.z) {
                    z = a(r.c(motionEvent, r.a(motionEvent, this.I))) | false;
                    break;
                }
                break;
            case 3:
                if (this.z) {
                    a(this.h, true, 0, false);
                    this.I = -1;
                    h();
                    z = this.P.c() | this.Q.c();
                    break;
                }
                break;
            case 5:
                int a4 = r.a(motionEvent);
                this.E = r.c(motionEvent, a4);
                this.I = r.b(motionEvent, a4);
                break;
            case 6:
                a(motionEvent);
                this.E = r.c(motionEvent, r.a(motionEvent, this.I));
                break;
        }
        if (z) {
            ai.b(this);
        }
        return true;
    }

    private boolean a(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        float f3 = this.E - f;
        this.E = f;
        float scrollX = getScrollX() + f3;
        int width = getWidth();
        float f4 = width * this.r;
        float f5 = width * this.s;
        ay ayVar = (ay) this.d.get(0);
        ay ayVar2 = (ay) this.d.get(this.d.size() - 1);
        if (ayVar.b != 0) {
            f4 = ayVar.e * width;
            z = false;
        } else {
            z = true;
        }
        if (ayVar2.b != this.g.c() - 1) {
            f2 = ayVar2.e * width;
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                r2 = this.P.a(Math.abs(f4 - scrollX) / width);
            }
        } else if (scrollX > f2) {
            r2 = z2 ? this.Q.a(Math.abs(scrollX - f2) / width) : false;
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.E += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        f((int) f4);
        return r2;
    }

    private ay g() {
        int i;
        ay ayVar;
        int width = getWidth();
        float scrollX = width > 0 ? getScrollX() / width : 0.0f;
        float f = width > 0 ? this.n / width : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        ay ayVar2 = null;
        while (i3 < this.d.size()) {
            ay ayVar3 = (ay) this.d.get(i3);
            if (z || ayVar3.b == i2 + 1) {
                i = i3;
                ayVar = ayVar3;
            } else {
                ay ayVar4 = this.e;
                ayVar4.e = f2 + f3 + f;
                ayVar4.b = i2 + 1;
                v vVar = this.g;
                int i4 = ayVar4.b;
                ayVar4.d = 1.0f;
                i = i3 - 1;
                ayVar = ayVar4;
            }
            float f4 = ayVar.e;
            float f5 = ayVar.d + f4 + f;
            if (!z && scrollX < f4) {
                return ayVar2;
            }
            if (scrollX < f5 || i == this.d.size() - 1) {
                return ayVar;
            }
            f3 = f4;
            i2 = ayVar.b;
            z = false;
            f2 = ayVar.d;
            ayVar2 = ayVar;
            i3 = i + 1;
        }
        return ayVar2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int a2 = ai.a(this);
        if (a2 == 0 || (a2 == 1 && this.g != null && this.g.c() > 1)) {
            if (!this.P.a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.r * width);
                this.P.a(height, width);
                z = this.P.a(canvas) | false;
                canvas.restoreToCount(save);
            }
            if (!this.Q.a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.s + 1.0f)) * width2);
                this.Q.a(height2, width2);
                z |= this.Q.a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.P.b();
            this.Q.b();
        }
        if (z) {
            ai.b(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.n > 0 && this.o != null && this.d.size() > 0 && this.g != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = this.n / width;
            ay ayVar = (ay) this.d.get(0);
            float f3 = ayVar.e;
            int size = this.d.size();
            int i = ayVar.b;
            int i2 = ((ay) this.d.get(size - 1)).b;
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                while (i4 > ayVar.b && i3 < size) {
                    i3++;
                    ayVar = (ay) this.d.get(i3);
                }
                if (i4 == ayVar.b) {
                    f = (ayVar.e + ayVar.d) * width;
                    f3 = ayVar.e + ayVar.d + f2;
                } else {
                    v vVar = this.g;
                    f = (1.0f + f3) * width;
                    f3 += 1.0f + f2;
                }
                if (this.n + f > scrollX) {
                    this.o.setBounds((int) f, this.p, (int) (this.n + f + 0.5f), this.q);
                    this.o.draw(canvas);
                }
                if (f > scrollX + width) {
                    return;
                }
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int a2 = r.a(motionEvent);
        if (r.b(motionEvent, a2) == this.I) {
            int i = a2 == 0 ? 1 : 0;
            this.E = r.c(motionEvent, i);
            this.I = r.b(motionEvent, i);
            if (this.J != null) {
                this.J.clear();
            }
        }
    }

    private void h() {
        this.z = false;
        this.A = false;
        if (this.J != null) {
            this.J.recycle();
            this.J = null;
        }
    }

    private void b(boolean z) {
        if (this.w != z) {
            this.w = z;
        }
    }

    private boolean a(View view, boolean z, int i, int i2, int i3) {
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

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case 21:
                        z = g(17);
                        break;
                    case 22:
                        z = g(66);
                        break;
                    case 61:
                        if (Build.VERSION.SDK_INT >= 11) {
                            if (!n.b(keyEvent)) {
                                if (n.a(keyEvent)) {
                                    z = g(1);
                                    break;
                                }
                            } else {
                                z = g(2);
                                break;
                            }
                        }
                    default:
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
            }
            z = false;
            if (!z) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r7 != 2) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g(int i) {
        boolean i2;
        boolean z = false;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null && findNextFocus != findFocus) {
            if (i == 17) {
                int i3 = a(this.f, findNextFocus).left;
                int i4 = a(this.f, findFocus).left;
                if (findFocus != null && i3 >= i4) {
                    i2 = i();
                } else {
                    i2 = findNextFocus.requestFocus();
                }
            } else if (i == 66) {
                int i5 = a(this.f, findNextFocus).left;
                int i6 = a(this.f, findFocus).left;
                if (findFocus == null || i5 > i6) {
                    i2 = findNextFocus.requestFocus();
                }
                if (this.g != null) {
                }
                i2 = false;
            }
            z = i2;
        } else if (i == 17 || i == 1) {
            i2 = i();
            z = i2;
        } else {
            if (i != 66) {
            }
            if (this.g != null || this.h >= this.g.c() - 1) {
                i2 = false;
            } else {
                c(this.h + 1);
                i2 = true;
            }
            z = i2;
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z;
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

    private boolean i() {
        if (this.h <= 0) {
            return false;
        }
        c(this.h - 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        ay a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.h) {
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
        ay a2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.h) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        ay a2;
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
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.h && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ay a2;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.h && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
