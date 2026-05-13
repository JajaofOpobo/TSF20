package android.support.v4.widget;

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
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements j {
    static final c a;
    private static final int[] b = {16842931};
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

    /* loaded from: classes.dex */
    interface c {
        int a(Object obj);

        Drawable a(Context context);

        void a(View view);

        void a(View view, Object obj, int i);

        void a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i);
    }

    /* loaded from: classes.dex */
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

    /* loaded from: classes.dex */
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

    /* loaded from: classes.dex */
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
        int a2 = android.support.v4.view.e.a(i2, ai.e(this));
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
            (a2 == 3 ? this.k : this.l).e();
        }
        switch (i) {
            case 1:
                View c2 = c(a2);
                if (c2 != null) {
                    i(c2);
                    return;
                }
                return;
            case 2:
                View c3 = c(a2);
                if (c3 != null) {
                    h(c3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public int a(int i) {
        int e2 = ai.e(this);
        switch (i) {
            case 3:
                if (this.r != 3) {
                    return this.r;
                }
                int i2 = e2 == 0 ? this.t : this.u;
                if (i2 != 3) {
                    return i2;
                }
                break;
            case 5:
                if (this.s != 3) {
                    return this.s;
                }
                int i3 = e2 == 0 ? this.u : this.t;
                if (i3 != 3) {
                    return i3;
                }
                break;
            case 8388611:
                if (this.t != 3) {
                    return this.t;
                }
                int i4 = e2 == 0 ? this.r : this.s;
                if (i4 != 3) {
                    return i4;
                }
                break;
            case 8388613:
                if (this.u != 3) {
                    return this.u;
                }
                int i5 = e2 == 0 ? this.s : this.r;
                if (i5 != 3) {
                    return i5;
                }
                break;
        }
        return 0;
    }

    public int a(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return a(((LayoutParams) view.getLayoutParams()).a);
    }

    public CharSequence b(int i) {
        int a2 = android.support.v4.view.e.a(i, ai.e(this));
        if (a2 == 3) {
            return this.E;
        }
        if (a2 == 5) {
            return this.F;
        }
        return null;
    }

    void a(int i, int i2, View view) {
        int i3;
        int a2 = this.k.a();
        int a3 = this.l.a();
        if (a2 == 1 || a3 == 1) {
            i3 = 1;
        } else {
            i3 = (a2 == 2 || a3 == 2) ? 2 : 0;
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
        int a2 = android.support.v4.view.e.a(i, ai.e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == a2) {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 365
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
        int e2 = ai.e(this);
        if (e2 == 0) {
            if (this.I != null) {
                a(this.I, e2);
                return this.I;
            }
        } else if (this.J != null) {
            a(this.J, e2);
            return this.J;
        }
        return this.K;
    }

    private Drawable h() {
        int e2 = ai.e(this);
        if (e2 == 0) {
            if (this.J != null) {
                a(this.J, e2);
                return this.J;
            }
        } else if (this.I != null) {
            a(this.I, e2);
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
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.i = f2;
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
        int a2;
        super.onDraw(canvas);
        if (this.H && this.B != null && (a2 = a.a(this.G)) > 0) {
            this.B.setBounds(0, 0, getWidth(), a2);
            this.B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean f2 = f(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f2) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m(childAt) && g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i = width;
                    } else if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right <= i2) {
                            right = i2;
                        }
                        i2 = right;
                        i = width;
                    } else {
                        i = childAt.getLeft();
                        if (i < width) {
                        }
                    }
                    i3++;
                    width = i;
                }
                i = width;
                i3++;
                width = i;
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        int i4 = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.i > 0.0f && f2) {
            this.j.setColor((((int) (((this.h & (-16777216)) >>> 24) * this.i)) << 24) | (this.h & ThemeElementType.PARSER_CONFIG_ALL));
            canvas.drawRect(i2, 0.0f, i4, getHeight(), this.j);
        } else if (this.C != null && a(view, 3)) {
            int intrinsicWidth = this.C.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.k.b(), 1.0f));
            this.C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.C.setAlpha((int) (255.0f * max));
            this.C.draw(canvas);
        } else if (this.D != null && a(view, 5)) {
            int intrinsicWidth2 = this.D.getIntrinsicWidth();
            int left = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left) / this.l.b(), 1.0f));
            this.D.setBounds(left - intrinsicWidth2, view.getTop(), left, view.getBottom());
            this.D.setAlpha((int) (255.0f * max2));
            this.D.draw(canvas);
        }
        return drawChild;
    }

    boolean f(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    boolean g(View view) {
        int a2 = android.support.v4.view.e.a(((LayoutParams) view.getLayoutParams()).a, ai.e(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View d2;
        int a2 = android.support.v4.view.t.a(motionEvent);
        boolean a3 = this.k.a(motionEvent) | this.l.a(motionEvent);
        switch (a2) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.z = x;
                this.A = y;
                z = this.i > 0.0f && (d2 = this.k.d((int) x, (int) y)) != null && f(d2);
                this.v = false;
                this.w = false;
                break;
            case 1:
            case 3:
                a(true);
                this.v = false;
                this.w = false;
                z = false;
                break;
            case 2:
                if (this.k.d(3)) {
                    this.m.a();
                    this.n.a();
                    z = false;
                    break;
                }
                z = false;
                break;
            default:
                z = false;
                break;
        }
        return a3 || z || i() || this.w;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View a2;
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
                break;
            case 1:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View d2 = this.k.d((int) x2, (int) y2);
                if (d2 != null && f(d2)) {
                    float f2 = x2 - this.z;
                    float f3 = y2 - this.A;
                    int d3 = this.k.d();
                    if ((f2 * f2) + (f3 * f3) < d3 * d3 && (a2 = a()) != null) {
                        z = a(a2) == 2;
                        a(z);
                        this.v = false;
                        break;
                    }
                }
                z = true;
                a(z);
                this.v = false;
                break;
            case 3:
                a(true);
                this.v = false;
                this.w = false;
                break;
        }
        return true;
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
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (g(childAt) && (!z || layoutParams.c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    z2 |= this.k.a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.l.a(childAt, getWidth(), childAt.getTop());
                }
                layoutParams.c = false;
            }
        }
        this.m.a();
        this.n.a();
        if (z2) {
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
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.w = true;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && j()) {
            android.support.v4.view.g.b(keyEvent);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View k = k();
            if (k != null && a(k) == 0) {
                b();
            }
            return k != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View c2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a != 0 && (c2 = c(savedState.a)) != null) {
            h(c2);
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v4.widget.DrawerLayout.SavedState.1
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends ac.a {
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
            View c = DrawerLayout.this.c(this.b == 3 ? 5 : 3);
            if (c != null) {
                DrawerLayout.this.i(c);
            }
        }

        @Override // android.support.v4.widget.ac.a
        public void a(View view, float f, float f2) {
            int width;
            float d = DrawerLayout.this.d(view);
            int width2 = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                width = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width2;
            } else {
                width = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
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
            int b = this.c.b();
            boolean z = this.b == 3;
            if (z) {
                View c = DrawerLayout.this.c(3);
                int i2 = (c != null ? -c.getWidth() : 0) + b;
                view = c;
                i = i2;
            } else {
                View c2 = DrawerLayout.this.c(5);
                int width = DrawerLayout.this.getWidth() - b;
                view = c2;
                i = width;
            }
            if (view != null) {
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.a(view) == 0) {
                    this.c.a(view, i, view.getTop());
                    ((LayoutParams) view.getLayoutParams()).c = true;
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
            View c;
            if ((i & 1) == 1) {
                c = DrawerLayout.this.c(3);
            } else {
                c = DrawerLayout.this.c(5);
            }
            if (c != null && DrawerLayout.this.a(c) == 0) {
                this.c.a(c, i2);
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

    /* loaded from: classes.dex */
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
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

    /* loaded from: classes.dex */
    class a extends android.support.v4.view.a {
        private final Rect c = new Rect();

        a() {
        }

        @Override // android.support.v4.view.a
        public void a(View view, android.support.v4.view.a.b bVar) {
            if (DrawerLayout.c) {
                super.a(view, bVar);
            } else {
                android.support.v4.view.a.b a = android.support.v4.view.a.b.a(bVar);
                super.a(view, a);
                bVar.a(view);
                ViewParent f = ai.f(view);
                if (f instanceof View) {
                    bVar.c((View) f);
                }
                a(bVar, a);
                a.t();
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
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View k = DrawerLayout.this.k();
                if (k != null) {
                    CharSequence b = DrawerLayout.this.b(DrawerLayout.this.e(k));
                    if (b != null) {
                        text.add(b);
                    }
                }
                return true;
            }
            return super.b(view, accessibilityEvent);
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

    /* loaded from: classes.dex */
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
