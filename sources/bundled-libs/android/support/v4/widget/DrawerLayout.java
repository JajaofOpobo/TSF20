package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.a.b;
import android.support.v4.view.ai;
import android.support.v4.view.ax;
import android.support.v4.widget.ac;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerLayout extends ViewGroup implements j {
    static final c a;
    private static final int[] b = {R.attr.layout_gravity};
    private static final boolean c;
    private static final boolean d;
    private float A;
    private Drawable B;
    private Drawable C;
    private Drawable D;
    private CharSequence E;
    private CharSequence F;
    private Object G;
    private boolean H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private Drawable L;
    private final ArrayList<View> M;
    private final b e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final ac k;
    private final ac l;
    private final g m;
    private final g n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;

    @Deprecated
    private f x;
    private List<f> y;
    private float z;

    interface c {
        int a(Object obj);

        Drawable a(Context context);

        void a(View view);

        void a(View view, Object obj, int i);

        void a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i);
    }

    public interface f {
        void a(int i);

        void a(View view);

        void a(View view, float f);

        void b(View view);
    }

    static {
        c = Build.VERSION.SDK_INT >= 19;
        d = Build.VERSION.SDK_INT >= 21;
        if (Build.VERSION.SDK_INT >= 21) {
            a = new d();
        } else {
            a = new e();
        }
    }

    static class e implements c {
        e() {
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public void a(View view) {
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public void a(View view, Object obj, int i) {
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public int a(Object obj) {
            return 0;
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public Drawable a(Context context) {
            return null;
        }
    }

    static class d implements c {
        d() {
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public void a(View view) {
            i.a(view);
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public void a(View view, Object obj, int i) {
            i.a(view, obj, i);
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
            i.a(marginLayoutParams, obj, i);
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public int a(Object obj) {
            return i.a(obj);
        }

        @Override // android.support.v4.widget.DrawerLayout.c
        public Drawable a(Context context) {
            return i.a(context);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new b();
        this.h = -1728053248;
        this.j = new Paint();
        this.q = true;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.g = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.m = new g(3);
        this.n = new g(5);
        this.k = ac.a(this, 1.0f, this.m);
        this.k.a(1);
        this.k.a(f3);
        this.m.a(this.k);
        this.l = ac.a(this, 1.0f, this.n);
        this.l.a(2);
        this.l.a(f3);
        this.n.a(this.l);
        setFocusableInTouchMode(true);
        ai.c((View) this, 1);
        ai.a(this, new a());
        ax.a(this, false);
        if (ai.q(this)) {
            a.a((View) this);
            this.B = a.a(context);
        }
        this.f = f2 * 10.0f;
        this.M = new ArrayList<>();
    }

    public void setDrawerElevation(float f2) {
        this.f = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (g(childAt)) {
                ai.e(childAt, this.f);
            }
        }
    }

    public float getDrawerElevation() {
        if (d) {
            return this.f;
        }
        return 0.0f;
    }

    @Override // android.support.v4.widget.j
    public void a(Object obj, boolean z) {
        this.G = obj;
        this.H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int i) {
        this.h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(f fVar) {
        if (this.x != null) {
            b(this.x);
        }
        if (fVar != null) {
            a(fVar);
        }
        this.x = fVar;
    }

    public void a(f fVar) {
        if (fVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(fVar);
        }
    }

    public void b(f fVar) {
        if (fVar != null && this.y != null) {
            this.y.remove(fVar);
        }
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void a(int i, int i2) {
        int iA = android.support.v4.view.e.a(i2, ai.e(this));
        switch (i2) {
            case 3:
                this.r = i;
                break;
            case 5:
                this.s = i;
                break;
            case 8388611:
                this.t = i;
                break;
            case 8388613:
                this.u = i;
                break;
        }
        if (i != 0) {
            (iA == 3 ? this.k : this.l).e();
        }
        switch (i) {
            case 1:
                View viewC = c(iA);
                if (viewC != null) {
                    i(viewC);
                }
                break;
            case 2:
                View viewC2 = c(iA);
                if (viewC2 != null) {
                    h(viewC2);
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(int r4) {
        /*
            r3 = this;
            r2 = 3
            int r0 = android.support.v4.view.ai.e(r3)
            switch(r4) {
                case 3: goto La;
                case 5: goto L1b;
                case 8388611: goto L2c;
                case 8388613: goto L3d;
                default: goto L8;
            }
        L8:
            r0 = 0
        L9:
            return r0
        La:
            int r1 = r3.r
            if (r1 == r2) goto L11
            int r0 = r3.r
            goto L9
        L11:
            if (r0 != 0) goto L18
            int r0 = r3.t
        L15:
            if (r0 == r2) goto L8
            goto L9
        L18:
            int r0 = r3.u
            goto L15
        L1b:
            int r1 = r3.s
            if (r1 == r2) goto L22
            int r0 = r3.s
            goto L9
        L22:
            if (r0 != 0) goto L29
            int r0 = r3.u
        L26:
            if (r0 == r2) goto L8
            goto L9
        L29:
            int r0 = r3.t
            goto L26
        L2c:
            int r1 = r3.t
            if (r1 == r2) goto L33
            int r0 = r3.t
            goto L9
        L33:
            if (r0 != 0) goto L3a
            int r0 = r3.r
        L37:
            if (r0 == r2) goto L8
            goto L9
        L3a:
            int r0 = r3.s
            goto L37
        L3d:
            int r1 = r3.u
            if (r1 == r2) goto L44
            int r0 = r3.u
            goto L9
        L44:
            if (r0 != 0) goto L4b
            int r0 = r3.s
        L48:
            if (r0 == r2) goto L8
            goto L9
        L4b:
            int r0 = r3.r
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.a(int):int");
    }

    public int a(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return a(((LayoutParams) view.getLayoutParams()).a);
    }

    public CharSequence b(int i) {
        int iA = android.support.v4.view.e.a(i, ai.e(this));
        if (iA == 3) {
            return this.E;
        }
        if (iA == 5) {
            return this.F;
        }
        return null;
    }

    void a(int i, int i2, View view) {
        int i3;
        int iA = this.k.a();
        int iA2 = this.l.a();
        if (iA == 1 || iA2 == 1) {
            i3 = 1;
        } else {
            i3 = (iA == 2 || iA2 == 2) ? 2 : 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.b == 0.0f) {
                b(view);
            } else if (layoutParams.b == 1.0f) {
                c(view);
            }
        }
        if (i3 != this.o) {
            this.o = i3;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    this.y.get(size).a(i3);
                }
            }
        }
    }

    void b(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.d & 1) != 1) {
            return;
        }
        layoutParams.d = 0;
        if (this.y != null) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).b(view);
            }
        }
        a(view, false);
        if (hasWindowFocus() && (rootView = getRootView()) != null) {
            rootView.sendAccessibilityEvent(32);
        }
    }

    void c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.d & 1) != 0) {
            return;
        }
        layoutParams.d = 1;
        if (this.y != null) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).a(view);
            }
        }
        a(view, true);
        if (hasWindowFocus()) {
            sendAccessibilityEvent(32);
        }
        view.requestFocus();
    }

    private void a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !g(childAt)) || (z && childAt == view)) {
                ai.c(childAt, 1);
            } else {
                ai.c(childAt, 4);
            }
        }
    }

    void a(View view, float f2) {
        if (this.y != null) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).a(view, f2);
            }
        }
    }

    void b(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 == layoutParams.b) {
            return;
        }
        layoutParams.b = f2;
        a(view, f2);
    }

    float d(View view) {
        return ((LayoutParams) view.getLayoutParams()).b;
    }

    int e(View view) {
        return android.support.v4.view.e.a(((LayoutParams) view.getLayoutParams()).a, ai.e(this));
    }

    boolean a(View view, int i) {
        return (e(view) & i) == i;
    }

    View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    View c(int i) {
        int iA = android.support.v4.view.e.a(i, ai.e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == iA) {
                return childAt;
            }
        }
        return null;
    }

    static String d(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0169 A[PHI: r1
  0x0169: PHI (r1v23 int) = (r1v3 int), (r1v0 int) binds: [B:25:0x005a, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    private void f() {
        if (!d) {
            this.C = g();
            this.D = h();
        }
    }

    private Drawable g() {
        int iE = ai.e(this);
        if (iE == 0) {
            if (this.I != null) {
                a(this.I, iE);
                return this.I;
            }
        } else if (this.J != null) {
            a(this.J, iE);
            return this.J;
        }
        return this.K;
    }

    private Drawable h() {
        int iE = ai.e(this);
        if (iE == 0) {
            if (this.J != null) {
                a(this.J, iE);
                return this.J;
            }
        } else if (this.I != null) {
            a(this.I, iE);
            return this.I;
        }
        return this.L;
    }

    private boolean a(Drawable drawable, int i) {
        if (drawable == null || !android.support.v4.a.a.a.b(drawable)) {
            return false;
        }
        android.support.v4.a.a.a.b(drawable, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f2;
        this.p = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        i5 = ((int) (measuredWidth * layoutParams.b)) + (-measuredWidth);
                        f2 = (measuredWidth + i5) / measuredWidth;
                    } else {
                        i5 = i6 - ((int) (measuredWidth * layoutParams.b));
                        f2 = (i6 - i5) / measuredWidth;
                    }
                    boolean z2 = f2 != layoutParams.b;
                    switch (layoutParams.a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < layoutParams.topMargin) {
                                i9 = layoutParams.topMargin;
                            } else if (i9 + measuredHeight > i8 - layoutParams.bottomMargin) {
                                i9 = (i8 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case 80:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (z2) {
                        b(childAt, f2);
                    }
                    int i11 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.p = false;
        this.q = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.p) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.i = fMax;
        if (this.k.a(true) | this.l.a(true)) {
            ai.b(this);
        }
    }

    private static boolean m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.B = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.B;
    }

    public void setStatusBarBackground(int i) {
        this.B = i != 0 ? android.support.v4.content.a.a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.B = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int iA;
        super.onDraw(canvas);
        if (this.H && this.B != null && (iA = a.a(this.G)) > 0) {
            this.B.setBounds(0, 0, getWidth(), iA);
            this.B.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    boolean f(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    boolean g(View view) {
        int iA = android.support.v4.view.e.a(((LayoutParams) view.getLayoutParams()).a, ai.e(view));
        return ((iA & 3) == 0 && (iA & 5) == 0) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 1
            r2 = 0
            int r0 = android.support.v4.view.t.a(r8)
            android.support.v4.widget.ac r3 = r7.k
            boolean r3 = r3.a(r8)
            android.support.v4.widget.ac r4 = r7.l
            boolean r4 = r4.a(r8)
            r3 = r3 | r4
            switch(r0) {
                case 0: goto L27;
                case 1: goto L65;
                case 2: goto L50;
                case 3: goto L65;
                default: goto L16;
            }
        L16:
            r0 = r2
        L17:
            if (r3 != 0) goto L25
            if (r0 != 0) goto L25
            boolean r0 = r7.i()
            if (r0 != 0) goto L25
            boolean r0 = r7.w
            if (r0 == 0) goto L26
        L25:
            r2 = r1
        L26:
            return r2
        L27:
            float r0 = r8.getX()
            float r4 = r8.getY()
            r7.z = r0
            r7.A = r4
            float r5 = r7.i
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L6d
            android.support.v4.widget.ac r5 = r7.k
            int r0 = (int) r0
            int r4 = (int) r4
            android.view.View r0 = r5.d(r0, r4)
            if (r0 == 0) goto L6d
            boolean r0 = r7.f(r0)
            if (r0 == 0) goto L6d
            r0 = r1
        L4b:
            r7.v = r2
            r7.w = r2
            goto L17
        L50:
            android.support.v4.widget.ac r0 = r7.k
            r4 = 3
            boolean r0 = r0.d(r4)
            if (r0 == 0) goto L16
            android.support.v4.widget.DrawerLayout$g r0 = r7.m
            r0.a()
            android.support.v4.widget.DrawerLayout$g r0 = r7.n
            r0.a()
            r0 = r2
            goto L17
        L65:
            r7.a(r1)
            r7.v = r2
            r7.w = r2
            goto L16
        L6d:
            r0 = r2
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewA;
        this.k.b(motionEvent);
        this.l.b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.z = x;
                this.A = y;
                this.v = false;
                this.w = false;
                return true;
            case 1:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View viewD = this.k.d((int) x2, (int) y2);
                if (viewD != null && f(viewD)) {
                    float f2 = x2 - this.z;
                    float f3 = y2 - this.A;
                    int iD = this.k.d();
                    z = (f2 * f2) + (f3 * f3) >= ((float) (iD * iD)) || (viewA = a()) == null || a(viewA) == 2;
                    a(z);
                    this.v = false;
                } else {
                    z = true;
                    a(z);
                    this.v = false;
                }
                return true;
            case 2:
            default:
                return true;
            case 3:
                a(true);
                this.v = false;
                this.w = false;
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.v = z;
        if (z) {
            a(true);
        }
    }

    public void b() {
        a(false);
    }

    void a(boolean z) {
        int childCount = getChildCount();
        boolean zA = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (g(childAt) && (!z || layoutParams.c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    zA |= this.k.a(childAt, -width, childAt.getTop());
                } else {
                    zA |= this.l.a(childAt, getWidth(), childAt.getTop());
                }
                layoutParams.c = false;
            }
        }
        this.m.a();
        this.n.a();
        if (zA) {
            invalidate();
        }
    }

    public void h(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.q) {
            LayoutParams.b(layoutParams, 2);
            if (a(view, 3)) {
                this.k.a(view, 0, view.getTop());
            } else {
                this.l.a(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            layoutParams.b = 1.0f;
            layoutParams.d = 1;
            a(view, true);
        }
        invalidate();
    }

    public void i(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.q) {
            LayoutParams.b(layoutParams, 4);
            if (a(view, 3)) {
                this.k.a(view, -view.getWidth(), view.getTop());
            } else {
                this.l.a(view, getWidth(), view.getTop());
            }
        } else {
            layoutParams.b = 0.0f;
            layoutParams.d = 0;
        }
        invalidate();
    }

    public boolean j(View view) {
        if (g(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean k(View view) {
        if (g(view)) {
            return ((LayoutParams) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (g(childAt)) {
                    if (j(childAt)) {
                        z = true;
                        childAt.addFocusables(arrayList, i, i2);
                    }
                } else {
                    this.M.add(childAt);
                }
            }
            if (!z) {
                int size = this.M.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.M.clear();
        }
    }

    private boolean j() {
        return k() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt) && k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    void c() {
        if (!this.w) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            this.w = true;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !j()) {
            return super.onKeyDown(i, keyEvent);
        }
        android.support.v4.view.g.b(keyEvent);
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View viewK = k();
            if (viewK != null && a(viewK) == 0) {
                b();
            }
            return viewK != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewC;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a != 0 && (viewC = c(savedState.a)) != null) {
            h(viewC);
        }
        if (savedState.b != 3) {
            a(savedState.b, 3);
        }
        if (savedState.c != 3) {
            a(savedState.c, 5);
        }
        if (savedState.d != 3) {
            a(savedState.d, 8388611);
        }
        if (savedState.e != 3) {
            a(savedState.e, 8388613);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z = layoutParams.d == 1;
            boolean z2 = layoutParams.d == 2;
            if (z || z2) {
                savedState.a = layoutParams.a;
                break;
            }
        }
        savedState.b = this.r;
        savedState.c = this.s;
        savedState.d = this.t;
        savedState.e = this.u;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (a() != null || g(view)) {
            ai.c(view, 4);
        } else {
            ai.c(view, 1);
        }
        if (!c) {
            ai.a(view, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(View view) {
        return (ai.c(view) == 4 || ai.c(view) == 2) ? false : true;
    }

    protected static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v4.widget.DrawerLayout.SavedState.1
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
        int b;
        int c;
        int d;
        int e;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = 0;
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.a = 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
        }
    }

    private class g extends ac.a {
        private final int b;
        private ac c;
        private final Runnable d = new Runnable() { // from class: android.support.v4.widget.DrawerLayout.g.1
            @Override // java.lang.Runnable
            public void run() {
                g.this.c();
            }
        };

        public g(int i) {
            this.b = i;
        }

        public void a(ac acVar) {
            this.c = acVar;
        }

        public void a() {
            DrawerLayout.this.removeCallbacks(this.d);
        }

        @Override // android.support.v4.widget.ac.a
        public boolean a(View view, int i) {
            return DrawerLayout.this.g(view) && DrawerLayout.this.a(view, this.b) && DrawerLayout.this.a(view) == 0;
        }

        @Override // android.support.v4.widget.ac.a
        public void a(int i) {
            DrawerLayout.this.a(this.b, i, this.c.c());
        }

        @Override // android.support.v4.widget.ac.a
        public void a(View view, int i, int i2, int i3, int i4) {
            float width;
            int width2 = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                width = (width2 + i) / width2;
            } else {
                width = (DrawerLayout.this.getWidth() - i) / width2;
            }
            DrawerLayout.this.b(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // android.support.v4.widget.ac.a
        public void b(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).c = false;
            b();
        }

        private void b() {
            View viewC = DrawerLayout.this.c(this.b == 3 ? 5 : 3);
            if (viewC != null) {
                DrawerLayout.this.i(viewC);
            }
        }

        @Override // android.support.v4.widget.ac.a
        public void a(View view, float f, float f2) {
            int width;
            float fD = DrawerLayout.this.d(view);
            int width2 = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                width = (f > 0.0f || (f == 0.0f && fD > 0.5f)) ? 0 : -width2;
            } else {
                width = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fD > 0.5f)) {
                    width -= width2;
                }
            }
            this.c.a(width, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // android.support.v4.widget.ac.a
        public void a(int i, int i2) {
            DrawerLayout.this.postDelayed(this.d, 160L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            View view;
            int i;
            int iB = this.c.b();
            boolean z = this.b == 3;
            if (z) {
                View viewC = DrawerLayout.this.c(3);
                int i2 = (viewC != null ? -viewC.getWidth() : 0) + iB;
                view = viewC;
                i = i2;
            } else {
                View viewC2 = DrawerLayout.this.c(5);
                int width = DrawerLayout.this.getWidth() - iB;
                view = viewC2;
                i = width;
            }
            if (view != null) {
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.a(view) == 0) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    this.c.a(view, i, view.getTop());
                    layoutParams.c = true;
                    DrawerLayout.this.invalidate();
                    b();
                    DrawerLayout.this.c();
                }
            }
        }

        @Override // android.support.v4.widget.ac.a
        public boolean b(int i) {
            return false;
        }

        @Override // android.support.v4.widget.ac.a
        public void b(int i, int i2) {
            View viewC;
            if ((i & 1) == 1) {
                viewC = DrawerLayout.this.c(3);
            } else {
                viewC = DrawerLayout.this.c(5);
            }
            if (viewC != null && DrawerLayout.this.a(viewC) == 0) {
                this.c.a(viewC, i2);
            }
        }

        @Override // android.support.v4.widget.ac.a
        public int a(View view) {
            if (DrawerLayout.this.g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // android.support.v4.widget.ac.a
        public int a(View view, int i, int i2) {
            if (DrawerLayout.this.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // android.support.v4.widget.ac.a
        public int b(View view, int i, int i2) {
            return view.getTop();
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;
        private float b;
        private boolean c;
        private int d;

        static /* synthetic */ int b(LayoutParams layoutParams, int i) {
            int i2 = layoutParams.d | i;
            layoutParams.d = i2;
            return i2;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.b);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 0;
            this.a = layoutParams.a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    class a extends android.support.v4.view.a {
        private final Rect c = new Rect();

        a() {
        }

        @Override // android.support.v4.view.a
        public void a(View view, android.support.v4.view.a.b bVar) {
            if (DrawerLayout.c) {
                super.a(view, bVar);
            } else {
                android.support.v4.view.a.b bVarA = android.support.v4.view.a.b.a(bVar);
                super.a(view, bVarA);
                bVar.a(view);
                Object objF = ai.f(view);
                if (objF instanceof View) {
                    bVar.c((View) objF);
                }
                a(bVar, bVarA);
                bVarA.t();
                a(bVar, (ViewGroup) view);
            }
            bVar.b(DrawerLayout.class.getName());
            bVar.a(false);
            bVar.b(false);
            bVar.a(b.a.a);
            bVar.a(b.a.b);
        }

        @Override // android.support.v4.view.a
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // android.support.v4.view.a
        public boolean b(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.b(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewK = DrawerLayout.this.k();
            if (viewK != null) {
                CharSequence charSequenceB = DrawerLayout.this.b(DrawerLayout.this.e(viewK));
                if (charSequenceB != null) {
                    text.add(charSequenceB);
                }
            }
            return true;
        }

        @Override // android.support.v4.view.a
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.c || DrawerLayout.n(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void a(android.support.v4.view.a.b bVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.n(childAt)) {
                    bVar.b(childAt);
                }
            }
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
        }
    }

    final class b extends android.support.v4.view.a {
        b() {
        }

        @Override // android.support.v4.view.a
        public void a(View view, android.support.v4.view.a.b bVar) {
            super.a(view, bVar);
            if (!DrawerLayout.n(view)) {
                bVar.c((View) null);
            }
        }
    }
}
