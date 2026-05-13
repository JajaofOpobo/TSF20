package com.tsf.shell.e;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.tsf.shell.Home;
import com.tsf.shell.e.d;
import com.tsf.shell.f.f.n;
import com.tsf.shell.utils.g;
/* loaded from: classes.dex */
public class f extends ViewGroup {
    private static boolean p = true;
    private boolean a;
    private float b;
    private float c;
    private int d;
    private View.OnLongClickListener e;
    private boolean f;
    private boolean g;
    private MotionEvent h;
    private n i;
    private VelocityTracker j;
    private int k;
    private int l;
    private boolean m;
    private Runnable n;
    private boolean o;

    public f(Context context) {
        super(context);
        this.a = true;
        this.d = 0;
        this.f = true;
        this.g = false;
        this.m = false;
        this.o = false;
        setHapticFeedbackEnabled(false);
        g.a(this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public void setPageManager(n nVar) {
        this.i = nVar;
    }

    public d getCurrentScreenLayout() {
        return this.i.n().s();
    }

    public void a(View view, d dVar, int i, int i2, int i3, int i4, boolean z) {
        d.b bVar;
        if (dVar != null) {
            d.b bVar2 = (d.b) view.getLayoutParams();
            if (bVar2 == null) {
                bVar = new d.b(i, i2, i3, i4);
            } else {
                bVar2.a = i;
                bVar2.b = i2;
                bVar2.d = i3;
                bVar2.e = i4;
                bVar = bVar2;
            }
            dVar.a(view, z ? 0 : -1, bVar);
            if (view instanceof b) {
                b bVar3 = (b) view;
                bVar3.a(i3, i4);
                bVar3.a.setHapticFeedbackEnabled(false);
                bVar3.a.setOnLongClickListener(this.e);
            }
        }
    }

    public void a(b bVar) {
        bVar.a.setHapticFeedbackEnabled(false);
        bVar.a.setOnLongClickListener(this.e);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e = onLongClickListener;
    }

    public void setVisibilityCallbacks(Runnable runnable) {
        this.n = runnable;
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
        if (this.a) {
            setHorizontalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(true);
            this.a = false;
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
        if (com.censivn.C3DEngine.a.d.d().b() || !p) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.d == 1) {
            return true;
        }
        switch (action & 255) {
            case 0:
                this.o = false;
                Home.b().a(motionEvent.getX(), motionEvent.getY());
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.censivn.C3DEngine.a.d.d().i();
                    }
                });
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
                if ((abs * abs) + (abs2 * abs2) > com.censivn.C3DEngine.a.b.b) {
                    z2 = abs > abs2;
                    z = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (!this.o) {
                    if (z2 || z) {
                        if (z2) {
                            this.d = 1;
                        } else {
                            this.o = true;
                            com.tsf.shell.manager.action.f.a(motionEvent);
                        }
                        if (this.f) {
                            this.f = false;
                            if (getCurrentScreenLayout() != null) {
                                getCurrentScreenLayout().cancelLongPress();
                                break;
                            }
                        }
                    }
                } else {
                    com.tsf.shell.manager.action.f.c(motionEvent);
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

    public boolean a(MotionEvent motionEvent) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((d) getChildAt(i)).a(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public static void setMouseEnabled(boolean z) {
        p = z;
    }

    public static boolean getMouseEnabled() {
        return p;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
        this.j.addMovement(motionEvent);
        if (this.m) {
            com.tsf.shell.manager.action.f.c(motionEvent);
            return false;
        }
        switch (motionEvent.getAction()) {
            case 1:
                if (this.d == 1) {
                    VelocityTracker velocityTracker = this.j;
                    velocityTracker.computeCurrentVelocity(1000, this.l);
                    float yVelocity = velocityTracker.getYVelocity();
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(yVelocity) > this.k || Math.abs(xVelocity) > this.k) {
                        com.censivn.C3DEngine.a.d.d().d(this.h, motionEvent, xVelocity, yVelocity);
                    }
                    if (this.j != null) {
                        this.j.recycle();
                        this.j = null;
                    }
                }
                com.censivn.C3DEngine.a.d.d().k(motionEvent);
                return false;
            case 2:
                if (this.d == 1 && !this.g) {
                    com.censivn.C3DEngine.a.d.d().c(this.h, motionEvent, 0.0f, 0.0f);
                    return false;
                }
                return false;
            default:
                return false;
        }
    }

    public boolean a() {
        return this.f;
    }

    public void setAllowLongPress(boolean z) {
        this.g = !z;
        this.f = z;
    }

    public d.a getCurrentCellInfo() {
        d s = com.tsf.shell.manager.a.h.n().s();
        if (s == null) {
            return null;
        }
        return s.getTag();
    }
}
