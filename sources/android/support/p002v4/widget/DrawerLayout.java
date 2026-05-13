package android.support.p002v4.widget;

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
import android.support.p002v4.content.C0144a;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.view.C0249a;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0343ax;
import android.support.p002v4.view.C0391e;
import android.support.p002v4.view.C0396g;
import android.support.p002v4.view.C0427t;
import android.support.p002v4.view.p011a.C0261b;
import android.support.p002v4.widget.C0478ac;
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
/* renamed from: android.support.v4.widget.DrawerLayout */
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements InterfaceC0500j {

    /* renamed from: a */
    static final InterfaceC0444c f810a;

    /* renamed from: b */
    private static final int[] f811b = {16842931};

    /* renamed from: c */
    private static final boolean f812c;

    /* renamed from: d */
    private static final boolean f813d;

    /* renamed from: A */
    private float f814A;

    /* renamed from: B */
    private Drawable f815B;

    /* renamed from: C */
    private Drawable f816C;

    /* renamed from: D */
    private Drawable f817D;

    /* renamed from: E */
    private CharSequence f818E;

    /* renamed from: F */
    private CharSequence f819F;

    /* renamed from: G */
    private Object f820G;

    /* renamed from: H */
    private boolean f821H;

    /* renamed from: I */
    private Drawable f822I;

    /* renamed from: J */
    private Drawable f823J;

    /* renamed from: K */
    private Drawable f824K;

    /* renamed from: L */
    private Drawable f825L;

    /* renamed from: M */
    private final ArrayList<View> f826M;

    /* renamed from: e */
    private final C0443b f827e;

    /* renamed from: f */
    private float f828f;

    /* renamed from: g */
    private int f829g;

    /* renamed from: h */
    private int f830h;

    /* renamed from: i */
    private float f831i;

    /* renamed from: j */
    private Paint f832j;

    /* renamed from: k */
    private final C0478ac f833k;

    /* renamed from: l */
    private final C0478ac f834l;

    /* renamed from: m */
    private final C0448g f835m;

    /* renamed from: n */
    private final C0448g f836n;

    /* renamed from: o */
    private int f837o;

    /* renamed from: p */
    private boolean f838p;

    /* renamed from: q */
    private boolean f839q;

    /* renamed from: r */
    private int f840r;

    /* renamed from: s */
    private int f841s;

    /* renamed from: t */
    private int f842t;

    /* renamed from: u */
    private int f843u;

    /* renamed from: v */
    private boolean f844v;

    /* renamed from: w */
    private boolean f845w;
    @Deprecated

    /* renamed from: x */
    private InterfaceC0447f f846x;

    /* renamed from: y */
    private List<InterfaceC0447f> f847y;

    /* renamed from: z */
    private float f848z;

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    /* loaded from: classes.dex */
    interface InterfaceC0444c {
        /* renamed from: a */
        int mo12506a(Object obj);

        /* renamed from: a */
        Drawable mo12510a(Context context);

        /* renamed from: a */
        void mo12509a(View view);

        /* renamed from: a */
        void mo12508a(View view, Object obj, int i);

        /* renamed from: a */
        void mo12507a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0447f {
        /* renamed from: a */
        void m12505a(int i);

        /* renamed from: a */
        void m12504a(View view);

        /* renamed from: a */
        void m12503a(View view, float f);

        /* renamed from: b */
        void m12502b(View view);
    }

    static {
        f812c = Build.VERSION.SDK_INT >= 19;
        f813d = Build.VERSION.SDK_INT >= 21;
        if (Build.VERSION.SDK_INT >= 21) {
            f810a = new C0445d();
        } else {
            f810a = new C0446e();
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$e */
    /* loaded from: classes.dex */
    static class C0446e implements InterfaceC0444c {
        C0446e() {
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public void mo12509a(View view) {
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public void mo12508a(View view, Object obj, int i) {
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public void mo12507a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public int mo12506a(Object obj) {
            return 0;
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public Drawable mo12510a(Context context) {
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    /* loaded from: classes.dex */
    static class C0445d implements InterfaceC0444c {
        C0445d() {
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public void mo12509a(View view) {
            C0498i.m12264a(view);
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public void mo12508a(View view, Object obj, int i) {
            C0498i.m12263a(view, obj, i);
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public void mo12507a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
            C0498i.m12262a(marginLayoutParams, obj, i);
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public int mo12506a(Object obj) {
            return C0498i.m12261a(obj);
        }

        @Override // android.support.p002v4.widget.DrawerLayout.InterfaceC0444c
        /* renamed from: a */
        public Drawable mo12510a(Context context) {
            return C0498i.m12265a(context);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f827e = new C0443b();
        this.f830h = -1728053248;
        this.f832j = new Paint();
        this.f839q = true;
        this.f840r = 3;
        this.f841s = 3;
        this.f842t = 3;
        this.f843u = 3;
        this.f822I = null;
        this.f823J = null;
        this.f824K = null;
        this.f825L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f829g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f835m = new C0448g(3);
        this.f836n = new C0448g(5);
        this.f833k = C0478ac.m12326a(this, 1.0f, this.f835m);
        this.f833k.m12335a(1);
        this.f833k.m12340a(f2);
        this.f835m.m12499a(this.f833k);
        this.f834l = C0478ac.m12326a(this, 1.0f, this.f836n);
        this.f834l.m12335a(2);
        this.f834l.m12340a(f2);
        this.f836n.m12499a(this.f834l);
        setFocusableInTouchMode(true);
        C0309ai.m12908c((View) this, 1);
        C0309ai.m12922a(this, new C0442a());
        C0343ax.m12751a(this, false);
        if (C0309ai.m12890q(this)) {
            f810a.mo12509a((View) this);
            this.f815B = f810a.mo12510a(context);
        }
        this.f828f = f * 10.0f;
        this.f826M = new ArrayList<>();
    }

    public void setDrawerElevation(float f) {
        this.f828f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m12534g(childAt)) {
                C0309ai.m12903e(childAt, this.f828f);
            }
        }
    }

    public float getDrawerElevation() {
        if (f813d) {
            return this.f828f;
        }
        return 0.0f;
    }

    @Override // android.support.p002v4.widget.InterfaceC0500j
    /* renamed from: a */
    public void mo12260a(Object obj, boolean z) {
        this.f820G = obj;
        this.f821H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int i) {
        this.f830h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0447f interfaceC0447f) {
        if (this.f846x != null) {
            m12548b(this.f846x);
        }
        if (interfaceC0447f != null) {
            m12557a(interfaceC0447f);
        }
        this.f846x = interfaceC0447f;
    }

    /* renamed from: a */
    public void m12557a(InterfaceC0447f interfaceC0447f) {
        if (interfaceC0447f != null) {
            if (this.f847y == null) {
                this.f847y = new ArrayList();
            }
            this.f847y.add(interfaceC0447f);
        }
    }

    /* renamed from: b */
    public void m12548b(InterfaceC0447f interfaceC0447f) {
        if (interfaceC0447f != null && this.f847y != null) {
            this.f847y.remove(interfaceC0447f);
        }
    }

    public void setDrawerLockMode(int i) {
        m12560a(i, 3);
        m12560a(i, 5);
    }

    /* renamed from: a */
    public void m12560a(int i, int i2) {
        int m12648a = C0391e.m12648a(i2, C0309ai.m12904e(this));
        switch (i2) {
            case 3:
                this.f840r = i;
                break;
            case 5:
                this.f841s = i;
                break;
            case 8388611:
                this.f842t = i;
                break;
            case 8388613:
                this.f843u = i;
                break;
        }
        if (i != 0) {
            (m12648a == 3 ? this.f833k : this.f834l).m12306e();
        }
        switch (i) {
            case 1:
                View m12544c = m12544c(m12648a);
                if (m12544c != null) {
                    m12530i(m12544c);
                    return;
                }
                return;
            case 2:
                View m12544c2 = m12544c(m12648a);
                if (m12544c2 != null) {
                    m12532h(m12544c2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public int m12561a(int i) {
        int m12904e = C0309ai.m12904e(this);
        switch (i) {
            case 3:
                if (this.f840r != 3) {
                    return this.f840r;
                }
                int i2 = m12904e == 0 ? this.f842t : this.f843u;
                if (i2 != 3) {
                    return i2;
                }
                break;
            case 5:
                if (this.f841s != 3) {
                    return this.f841s;
                }
                int i3 = m12904e == 0 ? this.f843u : this.f842t;
                if (i3 != 3) {
                    return i3;
                }
                break;
            case 8388611:
                if (this.f842t != 3) {
                    return this.f842t;
                }
                int i4 = m12904e == 0 ? this.f840r : this.f841s;
                if (i4 != 3) {
                    return i4;
                }
                break;
            case 8388613:
                if (this.f843u != 3) {
                    return this.f843u;
                }
                int i5 = m12904e == 0 ? this.f841s : this.f840r;
                if (i5 != 3) {
                    return i5;
                }
                break;
        }
        return 0;
    }

    /* renamed from: a */
    public int m12555a(View view) {
        if (!m12534g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return m12561a(((LayoutParams) view.getLayoutParams()).f849a);
    }

    /* renamed from: b */
    public CharSequence m12549b(int i) {
        int m12648a = C0391e.m12648a(i, C0309ai.m12904e(this));
        if (m12648a == 3) {
            return this.f818E;
        }
        if (m12648a == 5) {
            return this.f819F;
        }
        return null;
    }

    /* renamed from: a */
    void m12559a(int i, int i2, View view) {
        int i3;
        int m12341a = this.f833k.m12341a();
        int m12341a2 = this.f834l.m12341a();
        if (m12341a == 1 || m12341a2 == 1) {
            i3 = 1;
        } else {
            i3 = (m12341a == 2 || m12341a2 == 2) ? 2 : 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f850b == 0.0f) {
                m12547b(view);
            } else if (layoutParams.f850b == 1.0f) {
                m12543c(view);
            }
        }
        if (i3 != this.f837o) {
            this.f837o = i3;
            if (this.f847y != null) {
                for (int size = this.f847y.size() - 1; size >= 0; size--) {
                    this.f847y.get(size).m12505a(i3);
                }
            }
        }
    }

    /* renamed from: b */
    void m12547b(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f852d & 1) != 1) {
            return;
        }
        layoutParams.f852d = 0;
        if (this.f847y != null) {
            for (int size = this.f847y.size() - 1; size >= 0; size--) {
                this.f847y.get(size).m12502b(view);
            }
        }
        m12552a(view, false);
        if (hasWindowFocus() && (rootView = getRootView()) != null) {
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: c */
    void m12543c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f852d & 1) != 0) {
            return;
        }
        layoutParams.f852d = 1;
        if (this.f847y != null) {
            for (int size = this.f847y.size() - 1; size >= 0; size--) {
                this.f847y.get(size).m12504a(view);
            }
        }
        m12552a(view, true);
        if (hasWindowFocus()) {
            sendAccessibilityEvent(32);
        }
        view.requestFocus();
    }

    /* renamed from: a */
    private void m12552a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !m12534g(childAt)) || (z && childAt == view)) {
                C0309ai.m12908c(childAt, 1);
            } else {
                C0309ai.m12908c(childAt, 4);
            }
        }
    }

    /* renamed from: a */
    void m12554a(View view, float f) {
        if (this.f847y != null) {
            for (int size = this.f847y.size() - 1; size >= 0; size--) {
                this.f847y.get(size).m12503a(view, f);
            }
        }
    }

    /* renamed from: b */
    void m12546b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f850b) {
            return;
        }
        layoutParams.f850b = f;
        m12554a(view, f);
    }

    /* renamed from: d */
    float m12540d(View view) {
        return ((LayoutParams) view.getLayoutParams()).f850b;
    }

    /* renamed from: e */
    int m12538e(View view) {
        return C0391e.m12648a(((LayoutParams) view.getLayoutParams()).f849a, C0309ai.m12904e(this));
    }

    /* renamed from: a */
    boolean m12553a(View view, int i) {
        return (m12538e(view) & i) == i;
    }

    /* renamed from: a */
    View m12562a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f852d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    View m12544c(int i) {
        int m12648a = C0391e.m12648a(i, C0309ai.m12904e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m12538e(childAt) & 7) == m12648a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    static String m12541d(int i) {
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
        this.f839q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f839q = true;
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    /* renamed from: f */
    private void m12537f() {
        if (!f813d) {
            this.f816C = m12535g();
            this.f817D = m12533h();
        }
    }

    /* renamed from: g */
    private Drawable m12535g() {
        int m12904e = C0309ai.m12904e(this);
        if (m12904e == 0) {
            if (this.f822I != null) {
                m12558a(this.f822I, m12904e);
                return this.f822I;
            }
        } else if (this.f823J != null) {
            m12558a(this.f823J, m12904e);
            return this.f823J;
        }
        return this.f824K;
    }

    /* renamed from: h */
    private Drawable m12533h() {
        int m12904e = C0309ai.m12904e(this);
        if (m12904e == 0) {
            if (this.f823J != null) {
                m12558a(this.f823J, m12904e);
                return this.f823J;
            }
        } else if (this.f822I != null) {
            m12558a(this.f822I, m12904e);
            return this.f822I;
        }
        return this.f825L;
    }

    /* renamed from: a */
    private boolean m12558a(Drawable drawable, int i) {
        if (drawable == null || !C0021a.m13855b(drawable)) {
            return false;
        }
        C0021a.m13854b(drawable, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.f838p = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m12536f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m12553a(childAt, 3)) {
                        i5 = ((int) (measuredWidth * layoutParams.f850b)) + (-measuredWidth);
                        f = (measuredWidth + i5) / measuredWidth;
                    } else {
                        i5 = i6 - ((int) (measuredWidth * layoutParams.f850b));
                        f = (i6 - i5) / measuredWidth;
                    }
                    boolean z2 = f != layoutParams.f850b;
                    switch (layoutParams.f849a & 112) {
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
                        m12546b(childAt, f);
                    }
                    int i11 = layoutParams.f850b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.f838p = false;
        this.f839q = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f838p) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f850b);
        }
        this.f831i = f;
        if (this.f833k.m12324a(true) | this.f834l.m12324a(true)) {
            C0309ai.m12915b(this);
        }
    }

    /* renamed from: m */
    private static boolean m12524m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f815B = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f815B;
    }

    public void setStatusBarBackground(int i) {
        this.f815B = i != 0 ? C0144a.m13403a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f815B = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m12537f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int mo12506a;
        super.onDraw(canvas);
        if (this.f821H && this.f815B != null && (mo12506a = f810a.mo12506a(this.f820G)) > 0) {
            this.f815B.setBounds(0, 0, getWidth(), mo12506a);
            this.f815B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean m12536f = m12536f(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (m12536f) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m12524m(childAt) && m12534g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i = width;
                    } else if (m12553a(childAt, 3)) {
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
        if (this.f831i > 0.0f && m12536f) {
            this.f832j.setColor((((int) (((this.f830h & (-16777216)) >>> 24) * this.f831i)) << 24) | (this.f830h & ThemeElementType.PARSER_CONFIG_ALL));
            canvas.drawRect(i2, 0.0f, i4, getHeight(), this.f832j);
        } else if (this.f816C != null && m12553a(view, 3)) {
            int intrinsicWidth = this.f816C.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f833k.m12323b(), 1.0f));
            this.f816C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f816C.setAlpha((int) (255.0f * max));
            this.f816C.draw(canvas);
        } else if (this.f817D != null && m12553a(view, 5)) {
            int intrinsicWidth2 = this.f817D.getIntrinsicWidth();
            int left = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left) / this.f834l.m12323b(), 1.0f));
            this.f817D.setBounds(left - intrinsicWidth2, view.getTop(), left, view.getBottom());
            this.f817D.setAlpha((int) (255.0f * max2));
            this.f817D.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: f */
    boolean m12536f(View view) {
        return ((LayoutParams) view.getLayoutParams()).f849a == 0;
    }

    /* renamed from: g */
    boolean m12534g(View view) {
        int m12648a = C0391e.m12648a(((LayoutParams) view.getLayoutParams()).f849a, C0309ai.m12904e(view));
        return ((m12648a & 3) == 0 && (m12648a & 5) == 0) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m12307d;
        int m12599a = C0427t.m12599a(motionEvent);
        boolean m12331a = this.f833k.m12331a(motionEvent) | this.f834l.m12331a(motionEvent);
        switch (m12599a) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f848z = x;
                this.f814A = y;
                z = this.f831i > 0.0f && (m12307d = this.f833k.m12307d((int) x, (int) y)) != null && m12536f(m12307d);
                this.f844v = false;
                this.f845w = false;
                break;
            case 1:
            case 3:
                m12551a(true);
                this.f844v = false;
                this.f845w = false;
                z = false;
                break;
            case 2:
                if (this.f833k.m12308d(3)) {
                    this.f835m.m12501a();
                    this.f836n.m12501a();
                    z = false;
                    break;
                }
                z = false;
                break;
            default:
                z = false;
                break;
        }
        return m12331a || z || m12531i() || this.f845w;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m12562a;
        this.f833k.m12316b(motionEvent);
        this.f834l.m12316b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f848z = x;
                this.f814A = y;
                this.f844v = false;
                this.f845w = false;
                break;
            case 1:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View m12307d = this.f833k.m12307d((int) x2, (int) y2);
                if (m12307d != null && m12536f(m12307d)) {
                    float f = x2 - this.f848z;
                    float f2 = y2 - this.f814A;
                    int m12309d = this.f833k.m12309d();
                    if ((f * f) + (f2 * f2) < m12309d * m12309d && (m12562a = m12562a()) != null) {
                        z = m12555a(m12562a) == 2;
                        m12551a(z);
                        this.f844v = false;
                        break;
                    }
                }
                z = true;
                m12551a(z);
                this.f844v = false;
                break;
            case 3:
                m12551a(true);
                this.f844v = false;
                this.f845w = false;
                break;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f844v = z;
        if (z) {
            m12551a(true);
        }
    }

    /* renamed from: b */
    public void m12550b() {
        m12551a(false);
    }

    /* renamed from: a */
    void m12551a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m12534g(childAt) && (!z || layoutParams.f851c)) {
                int width = childAt.getWidth();
                if (m12553a(childAt, 3)) {
                    z2 |= this.f833k.m12328a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.f834l.m12328a(childAt, getWidth(), childAt.getTop());
                }
                layoutParams.f851c = false;
            }
        }
        this.f835m.m12501a();
        this.f836n.m12501a();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: h */
    public void m12532h(View view) {
        if (!m12534g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f839q) {
            LayoutParams.m12517b(layoutParams, 2);
            if (m12553a(view, 3)) {
                this.f833k.m12328a(view, 0, view.getTop());
            } else {
                this.f834l.m12328a(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            layoutParams.f850b = 1.0f;
            layoutParams.f852d = 1;
            m12552a(view, true);
        }
        invalidate();
    }

    /* renamed from: i */
    public void m12530i(View view) {
        if (!m12534g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f839q) {
            LayoutParams.m12517b(layoutParams, 4);
            if (m12553a(view, 3)) {
                this.f833k.m12328a(view, -view.getWidth(), view.getTop());
            } else {
                this.f834l.m12328a(view, getWidth(), view.getTop());
            }
        } else {
            layoutParams.f850b = 0.0f;
            layoutParams.f852d = 0;
        }
        invalidate();
    }

    /* renamed from: j */
    public boolean m12528j(View view) {
        if (m12534g(view)) {
            return (((LayoutParams) view.getLayoutParams()).f852d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: k */
    public boolean m12526k(View view) {
        if (m12534g(view)) {
            return ((LayoutParams) view.getLayoutParams()).f850b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: i */
    private boolean m12531i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f851c) {
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
                if (m12534g(childAt)) {
                    if (m12528j(childAt)) {
                        z = true;
                        childAt.addFocusables(arrayList, i, i2);
                    }
                } else {
                    this.f826M.add(childAt);
                }
            }
            if (!z) {
                int size = this.f826M.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f826M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f826M.clear();
        }
    }

    /* renamed from: j */
    private boolean m12529j() {
        return m12527k() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public View m12527k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m12534g(childAt) && m12526k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    void m12545c() {
        if (!this.f845w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f845w = true;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m12529j()) {
            C0396g.m12643b(keyEvent);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m12527k = m12527k();
            if (m12527k != null && m12555a(m12527k) == 0) {
                m12550b();
            }
            return m12527k != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View m12544c;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f853a != 0 && (m12544c = m12544c(savedState.f853a)) != null) {
            m12532h(m12544c);
        }
        if (savedState.f854b != 3) {
            m12560a(savedState.f854b, 3);
        }
        if (savedState.f855c != 3) {
            m12560a(savedState.f855c, 5);
        }
        if (savedState.f856d != 3) {
            m12560a(savedState.f856d, 8388611);
        }
        if (savedState.f857e != 3) {
            m12560a(savedState.f857e, 8388613);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z = layoutParams.f852d == 1;
            boolean z2 = layoutParams.f852d == 2;
            if (z || z2) {
                savedState.f853a = layoutParams.f849a;
                break;
            }
        }
        savedState.f854b = this.f840r;
        savedState.f855c = this.f841s;
        savedState.f856d = this.f842t;
        savedState.f857e = this.f843u;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m12562a() != null || m12534g(view)) {
            C0309ai.m12908c(view, 4);
        } else {
            C0309ai.m12908c(view, 1);
        }
        if (!f812c) {
            C0309ai.m12922a(view, this.f827e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m12523n(View view) {
        return (C0309ai.m12910c(view) == 4 || C0309ai.m12910c(view) == 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: android.support.v4.widget.DrawerLayout$SavedState */
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

        /* renamed from: a */
        int f853a;

        /* renamed from: b */
        int f854b;

        /* renamed from: c */
        int f855c;

        /* renamed from: d */
        int f856d;

        /* renamed from: e */
        int f857e;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f853a = 0;
            this.f853a = parcel.readInt();
            this.f854b = parcel.readInt();
            this.f855c = parcel.readInt();
            this.f856d = parcel.readInt();
            this.f857e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f853a = 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f853a);
            parcel.writeInt(this.f854b);
            parcel.writeInt(this.f855c);
            parcel.writeInt(this.f856d);
            parcel.writeInt(this.f857e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.DrawerLayout$g */
    /* loaded from: classes.dex */
    public class C0448g extends C0478ac.AbstractC0481a {

        /* renamed from: b */
        private final int f862b;

        /* renamed from: c */
        private C0478ac f863c;

        /* renamed from: d */
        private final Runnable f864d = new Runnable() { // from class: android.support.v4.widget.DrawerLayout.g.1
            @Override // java.lang.Runnable
            public void run() {
                C0448g.this.m12497c();
            }
        };

        public C0448g(int i) {
            this.f862b = i;
        }

        /* renamed from: a */
        public void m12499a(C0478ac c0478ac) {
            this.f863c = c0478ac;
        }

        /* renamed from: a */
        public void m12501a() {
            DrawerLayout.this.removeCallbacks(this.f864d);
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public boolean mo12294a(View view, int i) {
            return DrawerLayout.this.m12534g(view) && DrawerLayout.this.m12553a(view, this.f862b) && DrawerLayout.this.m12555a(view) == 0;
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public void mo12298a(int i) {
            DrawerLayout.this.m12559a(this.f862b, i, this.f863c.m12313c());
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public void mo12292a(View view, int i, int i2, int i3, int i4) {
            float width;
            int width2 = view.getWidth();
            if (DrawerLayout.this.m12553a(view, 3)) {
                width = (width2 + i) / width2;
            } else {
                width = (DrawerLayout.this.getWidth() - i) / width2;
            }
            DrawerLayout.this.m12546b(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: b */
        public void mo12288b(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f851c = false;
            m12498b();
        }

        /* renamed from: b */
        private void m12498b() {
            View m12544c = DrawerLayout.this.m12544c(this.f862b == 3 ? 5 : 3);
            if (m12544c != null) {
                DrawerLayout.this.m12530i(m12544c);
            }
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public void mo12295a(View view, float f, float f2) {
            int width;
            float m12540d = DrawerLayout.this.m12540d(view);
            int width2 = view.getWidth();
            if (DrawerLayout.this.m12553a(view, 3)) {
                width = (f > 0.0f || (f == 0.0f && m12540d > 0.5f)) ? 0 : -width2;
            } else {
                width = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && m12540d > 0.5f)) {
                    width -= width2;
                }
            }
            this.f863c.m12334a(width, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public void mo12297a(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f864d, 160L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m12497c() {
            View view;
            int i;
            int m12323b = this.f863c.m12323b();
            boolean z = this.f862b == 3;
            if (z) {
                View m12544c = DrawerLayout.this.m12544c(3);
                int i2 = (m12544c != null ? -m12544c.getWidth() : 0) + m12323b;
                view = m12544c;
                i = i2;
            } else {
                View m12544c2 = DrawerLayout.this.m12544c(5);
                int width = DrawerLayout.this.getWidth() - m12323b;
                view = m12544c2;
                i = width;
            }
            if (view != null) {
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.m12555a(view) == 0) {
                    this.f863c.m12328a(view, i, view.getTop());
                    ((LayoutParams) view.getLayoutParams()).f851c = true;
                    DrawerLayout.this.invalidate();
                    m12498b();
                    DrawerLayout.this.m12545c();
                }
            }
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: b */
        public boolean mo12291b(int i) {
            return false;
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: b */
        public void mo12290b(int i, int i2) {
            View m12544c;
            if ((i & 1) == 1) {
                m12544c = DrawerLayout.this.m12544c(3);
            } else {
                m12544c = DrawerLayout.this.m12544c(5);
            }
            if (m12544c != null && DrawerLayout.this.m12555a(m12544c) == 0) {
                this.f863c.m12329a(m12544c, i2);
            }
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public int mo12296a(View view) {
            if (DrawerLayout.this.m12534g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: a */
        public int mo12293a(View view, int i, int i2) {
            if (DrawerLayout.this.m12553a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // android.support.p002v4.widget.C0478ac.AbstractC0481a
        /* renamed from: b */
        public int mo12287b(View view, int i, int i2) {
            return view.getTop();
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$LayoutParams */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f849a;

        /* renamed from: b */
        private float f850b;

        /* renamed from: c */
        private boolean f851c;

        /* renamed from: d */
        private int f852d;

        /* renamed from: b */
        static /* synthetic */ int m12517b(LayoutParams layoutParams, int i) {
            int i2 = layoutParams.f852d | i;
            layoutParams.f852d = i2;
            return i2;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f849a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f811b);
            this.f849a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f849a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f849a = 0;
            this.f849a = layoutParams.f849a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f849a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f849a = 0;
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    /* loaded from: classes.dex */
    class C0442a extends C0249a {

        /* renamed from: c */
        private final Rect f859c = new Rect();

        C0442a() {
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public void mo12432a(View view, C0261b c0261b) {
            if (DrawerLayout.f812c) {
                super.mo12432a(view, c0261b);
            } else {
                C0261b m13139a = C0261b.m13139a(c0261b);
                super.mo12432a(view, m13139a);
                c0261b.m13138a(view);
                ViewParent m12901f = C0309ai.m12901f(view);
                if (m12901f instanceof View) {
                    c0261b.m13125c((View) m12901f);
                }
                m12513a(c0261b, m13139a);
                m13139a.m13099t();
                m12512a(c0261b, (ViewGroup) view);
            }
            c0261b.m13130b(DrawerLayout.class.getName());
            c0261b.m13135a(false);
            c0261b.m13129b(false);
            c0261b.m13140a(C0261b.C0262a.f712a);
            c0261b.m13140a(C0261b.C0262a.f713b);
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: d */
        public void mo12429d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo12429d(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: b */
        public boolean mo12511b(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View m12527k = DrawerLayout.this.m12527k();
                if (m12527k != null) {
                    CharSequence m12549b = DrawerLayout.this.m12549b(DrawerLayout.this.m12538e(m12527k));
                    if (m12549b != null) {
                        text.add(m12549b);
                    }
                }
                return true;
            }
            return super.mo12511b(view, accessibilityEvent);
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public boolean mo12431a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f812c || DrawerLayout.m12523n(view)) {
                return super.mo12431a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: a */
        private void m12512a(C0261b c0261b, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m12523n(childAt)) {
                    c0261b.m13131b(childAt);
                }
            }
        }

        /* renamed from: a */
        private void m12513a(C0261b c0261b, C0261b c0261b2) {
            Rect rect = this.f859c;
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
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    /* loaded from: classes.dex */
    final class C0443b extends C0249a {
        C0443b() {
        }

        @Override // android.support.p002v4.view.C0249a
        /* renamed from: a */
        public void mo12432a(View view, C0261b c0261b) {
            super.mo12432a(view, c0261b);
            if (!DrawerLayout.m12523n(view)) {
                c0261b.m13125c((View) null);
            }
        }
    }
}
