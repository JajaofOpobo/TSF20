package com.censivn.C3DEngine.a;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.censivn.C3DEngine.api.tween.VEasing;

/* loaded from: classes.dex */
public class b {
    public static int a;
    public static int b;
    public static int c;
    private int e;
    private int f;
    private int g;
    private int h;
    private final Handler j;
    private final e k;
    private d l;
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

    @Deprecated
    public b(e eVar) {
        this(null, eVar, null);
    }

    public b(Context context, e eVar, Handler handler) {
        this.e = VEasing.Linear.easeNone;
        this.x = false;
        this.y = false;
        this.z = false;
        if (handler != null) {
            this.j = new c(this, handler);
        } else {
            this.j = new c(this);
        }
        this.k = eVar;
        if (eVar instanceof d) {
            a((d) eVar);
        }
        a(context);
    }

    private void a(Context context) {
        if (this.k == null) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        this.v = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(com.censivn.C3DEngine.a.d());
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i2 = (int) (50.0f * com.censivn.C3DEngine.b.b.a.b);
        this.g = 500;
        int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        a = scaledMaximumFlingVelocity;
        this.h = scaledMaximumFlingVelocity;
        int i3 = scaledTouchSlop * scaledTouchSlop;
        b = i3;
        c = i3;
        this.f = i2 * i2;
    }

    public void a(d dVar) {
        this.l = dVar;
    }

    public void a() {
        if (this.j.hasMessages(3)) {
            this.j.removeMessages(3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(MotionEvent motionEvent) {
        boolean b2;
        boolean z;
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
                    if (this.q != null && this.r != null && hasMessages && a(this.q, this.r, motionEvent)) {
                        this.s = true;
                        z = this.l.b(this.q) | false | this.l.c(motionEvent);
                        this.u = x;
                        this.t = y;
                        this.q = MotionEvent.obtain(motionEvent);
                        this.o = true;
                        this.p = true;
                        this.m = true;
                        this.n = false;
                        boolean d2 = this.k.d(motionEvent) | z;
                        if (this.v) {
                            this.j.removeMessages(2);
                            this.j.sendEmptyMessageAtTime(2, this.q.getDownTime() + i + d);
                        }
                        this.j.sendEmptyMessageAtTime(1, this.q.getDownTime() + i);
                        return d2;
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
                boolean d22 = this.k.d(motionEvent) | z;
                if (this.v) {
                }
                this.j.sendEmptyMessageAtTime(1, this.q.getDownTime() + i);
                return d22;
            case 1:
            case 3:
                this.j.removeMessages(1);
                this.j.removeMessages(2);
                if (this.z) {
                    this.z = false;
                    e();
                }
                this.m = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (this.s) {
                    b2 = this.l.c(motionEvent) | false;
                    if (this.n) {
                        this.j.removeMessages(3);
                        this.n = false;
                        c();
                        this.k.j(motionEvent);
                    }
                } else if (this.n) {
                    this.j.removeMessages(3);
                    this.n = false;
                    c();
                    this.k.j(motionEvent);
                    b2 = false;
                } else if (this.o) {
                    b2 = this.k.f(motionEvent);
                } else {
                    VelocityTracker velocityTracker = this.w;
                    velocityTracker.computeCurrentVelocity(1000, this.h);
                    float yVelocity = velocityTracker.getYVelocity();
                    float xVelocity = velocityTracker.getXVelocity();
                    b2 = (Math.abs(yVelocity) > ((float) this.g) || Math.abs(xVelocity) > ((float) this.g)) ? this.k.b(this.q, obtain, xVelocity, yVelocity) : this.k.h(motionEvent);
                }
                this.k.i(motionEvent);
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
                    return false | this.l.c(motionEvent);
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
                int x2 = (int) (x - this.q.getX());
                int y2 = (int) (y - this.q.getY());
                int i2 = (x2 * x2) + (y2 * y2);
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

    private boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (!this.p || motionEvent3.getEventTime() - motionEvent2.getEventTime() > 350) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
        int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
        return (x * x) + (y * y) < this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.j.removeMessages(3);
        this.n = true;
        this.x = false;
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!this.x) {
            this.k.g(this.q);
            this.x = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.z = true;
        this.y = false;
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!this.y) {
            this.k.e(this.q);
            this.y = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.l != null && !b.this.m) {
                    b.this.l.a(b.this.q);
                }
            }
        });
    }
}
