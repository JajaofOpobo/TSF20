package com.tsf.shell.p095e;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0855b;
import com.censivn.C3DEngine.p030a.C0864d;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.p095e.C2262d;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.utils.C4170g;
/* renamed from: com.tsf.shell.e.f */
/* loaded from: classes.dex */
public class C2269f extends ViewGroup {

    /* renamed from: p */
    private static boolean f7407p = true;

    /* renamed from: a */
    private boolean f7408a;

    /* renamed from: b */
    private float f7409b;

    /* renamed from: c */
    private float f7410c;

    /* renamed from: d */
    private int f7411d;

    /* renamed from: e */
    private View.OnLongClickListener f7412e;

    /* renamed from: f */
    private boolean f7413f;

    /* renamed from: g */
    private boolean f7414g;

    /* renamed from: h */
    private MotionEvent f7415h;

    /* renamed from: i */
    private C2951n f7416i;

    /* renamed from: j */
    private VelocityTracker f7417j;

    /* renamed from: k */
    private int f7418k;

    /* renamed from: l */
    private int f7419l;

    /* renamed from: m */
    private boolean f7420m;

    /* renamed from: n */
    private Runnable f7421n;

    /* renamed from: o */
    private boolean f7422o;

    public C2269f(Context context) {
        super(context);
        this.f7408a = true;
        this.f7411d = 0;
        this.f7413f = true;
        this.f7414g = false;
        this.f7420m = false;
        this.f7422o = false;
        setHapticFeedbackEnabled(false);
        C4170g.m687a(this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f7418k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7419l = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public void setPageManager(C2951n c2951n) {
        this.f7416i = c2951n;
    }

    public C2262d getCurrentScreenLayout() {
        return this.f7416i.m4031n().m4182s();
    }

    /* renamed from: a */
    public void m5982a(View view, C2262d c2262d, int i, int i2, int i3, int i4, boolean z) {
        C2262d.C2264b c2264b;
        if (c2262d != null) {
            C2262d.C2264b c2264b2 = (C2262d.C2264b) view.getLayoutParams();
            if (c2264b2 == null) {
                c2264b = new C2262d.C2264b(i, i2, i3, i4);
            } else {
                c2264b2.f7390a = i;
                c2264b2.f7391b = i2;
                c2264b2.f7393d = i3;
                c2264b2.f7394e = i4;
                c2264b = c2264b2;
            }
            c2262d.m5991a(view, z ? 0 : -1, c2264b);
            if (view instanceof C2255b) {
                C2255b c2255b = (C2255b) view;
                c2255b.m6009a(i3, i4);
                c2255b.f7360a.setHapticFeedbackEnabled(false);
                c2255b.f7360a.setOnLongClickListener(this.f7412e);
            }
        }
    }

    /* renamed from: a */
    public void m5981a(C2255b c2255b) {
        c2255b.f7360a.setHapticFeedbackEnabled(false);
        c2255b.f7360a.setOnLongClickListener(this.f7412e);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7412e = onLongClickListener;
    }

    public void setVisibilityCallbacks(Runnable runnable) {
        this.f7421n = runnable;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        computeScroll();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Workspace3D can only be used in EXACTLY mode.");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException("Workspace3D can only be used in EXACTLY mode.");
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
        if (this.f7408a) {
            setHorizontalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(true);
            this.f7408a = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (C0864d.m10805d().m10817b() || !f7407p) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.f7411d == 1) {
            return true;
        }
        switch (action & 255) {
            case 0:
                this.f7422o = false;
                Home.m6177b().m6187a(motionEvent.getX(), motionEvent.getY());
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.e.f.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0864d.m10805d().m10792i();
                    }
                });
                this.f7415h = MotionEvent.obtain(motionEvent);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f7409b = x;
                this.f7410c = y;
                this.f7413f = true;
                this.f7414g = false;
                this.f7420m = false;
                this.f7411d = 0;
                return false;
            case 1:
            case 3:
                this.f7411d = 0;
                this.f7413f = false;
                break;
            case 2:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                int abs = (int) Math.abs(x2 - this.f7409b);
                int abs2 = (int) Math.abs(y2 - this.f7410c);
                if ((abs * abs) + (abs2 * abs2) > C0855b.f2416b) {
                    z2 = abs > abs2;
                    z = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (!this.f7422o) {
                    if (z2 || z) {
                        if (z2) {
                            this.f7411d = 1;
                        } else {
                            this.f7422o = true;
                            C3398f.m2644a(motionEvent);
                        }
                        if (this.f7413f) {
                            this.f7413f = false;
                            if (getCurrentScreenLayout() != null) {
                                getCurrentScreenLayout().cancelLongPress();
                                break;
                            }
                        }
                    }
                } else {
                    C3398f.m2636c(motionEvent);
                    break;
                }
                break;
            case 5:
                if (this.f7411d == 0) {
                    this.f7420m = true;
                    this.f7411d = 1;
                    break;
                }
                break;
        }
        return this.f7411d != 0;
    }

    /* renamed from: a */
    public boolean m5983a(MotionEvent motionEvent) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C2262d) getChildAt(i)).m5993a(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public static void setMouseEnabled(boolean z) {
        f7407p = z;
    }

    public static boolean getMouseEnabled() {
        return f7407p;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f7417j == null) {
            this.f7417j = VelocityTracker.obtain();
        }
        this.f7417j.addMovement(motionEvent);
        if (this.f7420m) {
            C3398f.m2636c(motionEvent);
            return false;
        }
        switch (motionEvent.getAction()) {
            case 1:
                if (this.f7411d == 1) {
                    VelocityTracker velocityTracker = this.f7417j;
                    velocityTracker.computeCurrentVelocity(1000, this.f7419l);
                    float yVelocity = velocityTracker.getYVelocity();
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(yVelocity) > this.f7418k || Math.abs(xVelocity) > this.f7418k) {
                        C0864d.m10805d().m10803d(this.f7415h, motionEvent, xVelocity, yVelocity);
                    }
                    if (this.f7417j != null) {
                        this.f7417j.recycle();
                        this.f7417j = null;
                    }
                }
                C0864d.m10805d().m10787k(motionEvent);
                return false;
            case 2:
                if (this.f7411d == 1 && !this.f7414g) {
                    C0864d.m10805d().m10809c(this.f7415h, motionEvent, 0.0f, 0.0f);
                    return false;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public boolean m5984a() {
        return this.f7413f;
    }

    public void setAllowLongPress(boolean z) {
        this.f7414g = !z;
        this.f7413f = z;
    }

    public C2262d.ContextMenu$ContextMenuInfoC2263a getCurrentCellInfo() {
        C2262d m4182s = C3359a.f11094h.m4031n().m4182s();
        if (m4182s == null) {
            return null;
        }
        return m4182s.getTag();
    }
}
