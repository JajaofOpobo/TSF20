package com.tsf.shell.h;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.tsf.shell.Home;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public final class r extends ViewGroup {
    private static boolean o = true;
    private boolean a;
    private float b;
    private float c;
    private int d;
    private View.OnLongClickListener e;
    private boolean f;
    private boolean g;
    private MotionEvent h;
    private com.tsf.shell.workspace3D.h.l i;
    private VelocityTracker j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;

    public r(Context context) {
        super(context);
        this.a = true;
        this.d = 0;
        this.f = true;
        this.g = false;
        this.m = false;
        this.n = false;
        setHapticFeedbackEnabled(false);
        com.tsf.shell.g.c.a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void a(com.tsf.shell.workspace3D.h.l lVar) {
        this.i = lVar;
    }

    public final j a() {
        return this.i.k().q();
    }

    public final void a(View view, j jVar, int i, int i2, int i3, int i4, boolean z) {
        l lVar;
        if (jVar != null) {
            l lVar2 = (l) view.getLayoutParams();
            if (lVar2 == null) {
                lVar = new l(i, i2, i3, i4);
            } else {
                lVar2.a = i;
                lVar2.b = i2;
                lVar2.d = i3;
                lVar2.e = i4;
                lVar = lVar2;
            }
            jVar.a(view, z ? 0 : -1, lVar);
            if (view instanceof d) {
                d dVar = (d) view;
                dVar.a(i3, i4);
                dVar.a.setHapticFeedbackEnabled(false);
                dVar.a.setOnLongClickListener(this.e);
            }
        }
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e = onLongClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        computeScroll();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
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
        if (this.a) {
            setHorizontalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(true);
            this.a = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (com.censivn.C3DEngine.b.m.d().b() || !o) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.d == 1) {
            return true;
        }
        switch (action & 255) {
            case 0:
                this.n = false;
                Home.d().a(motionEvent.getX(), motionEvent.getY());
                com.censivn.C3DEngine.a.a().c(new s(this));
                this.h = MotionEvent.obtain(motionEvent);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.b = x;
                this.c = y;
                this.f = true;
                this.g = false;
                this.m = false;
                this.d = 0;
                return false;
            case 1:
            case 3:
                this.d = 0;
                this.f = false;
                break;
            case 2:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                int abs = (int) Math.abs(x2 - this.b);
                int abs2 = (int) Math.abs(y2 - this.c);
                if ((abs * abs) + (abs2 * abs2) > com.censivn.C3DEngine.b.b.TouchState) {
                    z2 = abs > abs2;
                    z = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (!this.n) {
                    if (z2 || z) {
                        if (z2) {
                            this.d = 1;
                        } else {
                            this.n = true;
                            com.tsf.shell.action.c.a(motionEvent);
                        }
                        if (this.f) {
                            this.f = false;
                            if (a() != null) {
                                a().cancelLongPress();
                                break;
                            }
                        }
                    }
                } else {
                    com.tsf.shell.action.c.b(motionEvent);
                    break;
                }
                break;
            case 5:
                if (this.d == 0) {
                    this.m = true;
                    this.d = 1;
                    break;
                }
                break;
        }
        return this.d != 0;
    }

    public final boolean a(MotionEvent motionEvent) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((j) getChildAt(i)).a(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public static void a(boolean z) {
        o = z;
    }

    public static boolean b() {
        return o;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
        this.j.addMovement(motionEvent);
        if (this.m) {
            com.tsf.shell.action.c.b(motionEvent);
            return false;
        }
        switch (motionEvent.getAction()) {
            case 1:
                if (this.d == 1) {
                    VelocityTracker velocityTracker = this.j;
                    velocityTracker.computeCurrentVelocity(ThemeShellDescription.PICKER_MENU, this.l);
                    float yVelocity = velocityTracker.getYVelocity();
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(yVelocity) > this.k || Math.abs(xVelocity) > this.k) {
                        com.censivn.C3DEngine.b.m.d().c(this.h, motionEvent, xVelocity, yVelocity);
                    }
                    if (this.j != null) {
                        this.j.recycle();
                        this.j = null;
                    }
                }
                com.censivn.C3DEngine.b.m.d().j(motionEvent);
                break;
            case 2:
                if (this.d == 1 && !this.g) {
                    com.censivn.C3DEngine.b.m.d().a(this.h, motionEvent);
                    break;
                }
                break;
        }
        return false;
    }

    public final boolean c() {
        return this.f;
    }

    public final void d() {
        this.g = true;
        this.f = false;
    }

    public static k e() {
        j q = bf.j().k().q();
        if (q == null) {
            return null;
        }
        return q.c();
    }
}
