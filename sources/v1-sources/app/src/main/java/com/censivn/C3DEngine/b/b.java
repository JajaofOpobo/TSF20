package com.censivn.C3DEngine.b;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public final class b {
    public static int a;
    public static int b;
    public static int c;
    private int e;
    private int f;
    private int g;
    private int h;
    private final Handler j;
    private final h k;
    private g l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private MotionEvent q;
    private MotionEvent r;
    private boolean s;
    private float t;
    private float u;
    private boolean v;
    private VelocityTracker w;
    private boolean x;
    private boolean y;
    private boolean z;
    private static final int i = ViewConfiguration.getTapTimeout();
    public static int d = 0;

    public b(h hVar) {
        this(hVar, (byte) 0);
    }

    private b(h hVar, byte b2) {
        this.e = 400;
        this.x = false;
        this.y = false;
        this.z = false;
        this.j = new f(this);
        this.k = hVar;
        if (hVar instanceof g) {
            this.l = (g) hVar;
        }
        if (this.k == null) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        this.v = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(com.censivn.C3DEngine.a.c());
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i2 = (int) (50.0f * com.censivn.C3DEngine.a.b);
        this.g = ThemeShellDescription.PAGE_PREVIEW_SELECT;
        int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        a = scaledMaximumFlingVelocity;
        this.h = scaledMaximumFlingVelocity;
        int i3 = scaledTouchSlop * scaledTouchSlop;
        b = i3;
        c = i3;
        this.f = i2 * i2;
    }

    public final void a() {
        if (this.j.hasMessages(3)) {
            this.j.removeMessages(3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        boolean b2;
        boolean z;
        boolean z2;
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        switch (action) {
            case 0:
                d = 250;
                c = b;
                if (this.l != null) {
                    boolean hasMessages = this.j.hasMessages(3);
                    if (hasMessages) {
                        this.j.removeMessages(3);
                    }
                    if (this.q != null && this.r != null && hasMessages) {
                        MotionEvent motionEvent2 = this.q;
                        MotionEvent motionEvent3 = this.r;
                        if (this.p && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 350) {
                            int x2 = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                            int y2 = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                            if ((y2 * y2) + (x2 * x2) < this.f) {
                                z2 = true;
                                if (z2) {
                                    this.s = true;
                                    boolean b3 = this.l.b(this.q) | false;
                                    g gVar = this.l;
                                    z = b3 | false;
                                    this.u = x;
                                    this.t = y;
                                    this.q = MotionEvent.obtain(motionEvent);
                                    this.o = true;
                                    this.p = true;
                                    this.m = true;
                                    this.n = false;
                                    boolean c2 = this.k.c(motionEvent) | z;
                                    if (this.v) {
                                        this.j.removeMessages(2);
                                        this.j.sendEmptyMessageAtTime(2, this.q.getDownTime() + i + d);
                                    }
                                    this.j.sendEmptyMessageAtTime(1, this.q.getDownTime() + i);
                                    return c2;
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                    this.j.sendEmptyMessageDelayed(3, 350L);
                }
                z = false;
                this.u = x;
                this.t = y;
                this.q = MotionEvent.obtain(motionEvent);
                this.o = true;
                this.p = true;
                this.m = true;
                this.n = false;
                boolean c22 = this.k.c(motionEvent) | z;
                if (this.v) {
                }
                this.j.sendEmptyMessageAtTime(1, this.q.getDownTime() + i);
                return c22;
            case 1:
            case 3:
                this.j.removeMessages(1);
                this.j.removeMessages(2);
                if (this.z) {
                    this.z = false;
                    c();
                }
                this.m = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (this.s) {
                    g gVar2 = this.l;
                    if (this.n) {
                        this.j.removeMessages(3);
                        this.n = false;
                        b();
                        this.k.i(motionEvent);
                        b2 = false;
                    } else {
                        b2 = false;
                    }
                } else if (this.n) {
                    this.j.removeMessages(3);
                    this.n = false;
                    b();
                    this.k.i(motionEvent);
                    b2 = false;
                } else if (this.o) {
                    b2 = this.k.e(motionEvent);
                } else {
                    VelocityTracker velocityTracker = this.w;
                    velocityTracker.computeCurrentVelocity(ThemeShellDescription.PICKER_MENU, this.h);
                    float yVelocity = velocityTracker.getYVelocity();
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(yVelocity) > this.g || Math.abs(xVelocity) > this.g) {
                        b2 = this.k.b(this.q, obtain, xVelocity, yVelocity);
                    } else {
                        b2 = this.k.g(motionEvent);
                    }
                }
                this.k.h(motionEvent);
                this.r = MotionEvent.obtain(motionEvent);
                this.w.recycle();
                this.w = null;
                this.s = false;
                break;
            case 2:
                if (this.n) {
                    return false;
                }
                float f = this.u - x;
                float f2 = this.t - y;
                if (this.s) {
                    g gVar3 = this.l;
                    return false;
                }
                if (!this.o) {
                    if (Math.abs(f) < 1.0f && Math.abs(f2) < 1.0f) {
                        return false;
                    }
                    boolean a2 = this.k.a(this.q, motionEvent, f, f2);
                    this.u = x;
                    this.t = y;
                    return a2;
                }
                int x3 = (int) (x - this.q.getX());
                int y3 = (int) (y - this.q.getY());
                int i2 = (x3 * x3) + (y3 * y3);
                if (i2 > c) {
                    b2 = this.k.a(this.q, motionEvent, f, f2);
                    this.u = x;
                    this.t = y;
                    this.o = false;
                    this.j.removeMessages(3);
                    this.j.removeMessages(1);
                    this.j.removeMessages(2);
                } else {
                    b2 = false;
                }
                if (i2 > this.e) {
                    this.p = false;
                    return b2;
                }
                break;
            case 261:
                this.j.removeMessages(2);
                return false;
            default:
                return false;
        }
        return b2;
    }

    static /* synthetic */ void b(b bVar) {
        bVar.j.removeMessages(3);
        bVar.n = true;
        bVar.x = false;
        com.censivn.C3DEngine.a.a().c(new c(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!this.x) {
            this.k.f(this.q);
            this.x = true;
        }
    }

    static /* synthetic */ void a(b bVar) {
        bVar.z = true;
        bVar.y = false;
        com.censivn.C3DEngine.a.a().c(new d(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!this.y) {
            this.k.d(this.q);
            this.y = true;
        }
    }
}
