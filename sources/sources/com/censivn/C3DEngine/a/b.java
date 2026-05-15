package com.censivn.C3DEngine.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.censivn.C3DEngine.api.tween.VEasing;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public static int a;
    public static int b;
    public static int c;
    private int e;
    private int f;
    private int g;
    private int h;
    private final Handler j;
    private final c k;
    private InterfaceC0023b l;
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

    /* JADX INFO: renamed from: com.censivn.C3DEngine.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0023b {
        boolean a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        boolean c(MotionEvent motionEvent);
    }

    public interface c {
        boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        boolean d(MotionEvent motionEvent);

        void e(MotionEvent motionEvent);

        boolean f(MotionEvent motionEvent);

        void g(MotionEvent motionEvent);

        boolean h(MotionEvent motionEvent);

        boolean i(MotionEvent motionEvent);

        void j(MotionEvent motionEvent);
    }

    public static class d implements InterfaceC0023b, c {
        @Override // com.censivn.C3DEngine.a.b.c
        public boolean f(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.c
        public void g(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.a.b.c
        public boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.c
        public boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.c
        public void e(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.a.b.c
        public boolean d(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.c
        public boolean i(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.InterfaceC0023b
        public boolean b(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.InterfaceC0023b
        public boolean c(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.InterfaceC0023b
        public boolean a(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.c
        public boolean h(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.a.b.c
        public void j(MotionEvent motionEvent) {
        }
    }

    private class a extends Handler {
        a() {
        }

        a(Handler handler) {
            super(handler.getLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    b.this.d();
                    return;
                case 2:
                    b.this.b();
                    return;
                case 3:
                    b.this.f();
                    return;
                default:
                    throw new RuntimeException("Unknown message " + message);
            }
        }
    }

    @Deprecated
    public b(c cVar) {
        this(null, cVar, null);
    }

    public b(Context context, c cVar, Handler handler) {
        this.e = VEasing.Linear.easeNone;
        this.x = false;
        this.y = false;
        this.z = false;
        if (handler != null) {
            this.j = new a(handler);
        } else {
            this.j = new a();
        }
        this.k = cVar;
        if (cVar instanceof InterfaceC0023b) {
            a((InterfaceC0023b) cVar);
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

    public void a(InterfaceC0023b interfaceC0023b) {
        this.l = interfaceC0023b;
    }

    public void a() {
        if (this.j.hasMessages(3)) {
            this.j.removeMessages(3);
        }
    }

    public boolean a(MotionEvent motionEvent) {
        boolean zB;
        boolean zA;
        boolean zB2;
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
                if (this.l == null) {
                    zB2 = false;
                } else {
                    boolean zHasMessages = this.j.hasMessages(3);
                    if (zHasMessages) {
                        this.j.removeMessages(3);
                    }
                    if (this.q != null && this.r != null && zHasMessages && a(this.q, this.r, motionEvent)) {
                        this.s = true;
                        zB2 = this.l.b(this.q) | false | this.l.c(motionEvent);
                    } else {
                        this.j.sendEmptyMessageDelayed(3, 350L);
                        zB2 = false;
                    }
                }
                this.u = x;
                this.t = y;
                this.q = MotionEvent.obtain(motionEvent);
                this.o = true;
                this.p = true;
                this.m = true;
                this.n = false;
                boolean zD = this.k.d(motionEvent) | zB2;
                if (this.v) {
                    this.j.removeMessages(2);
                    this.j.sendEmptyMessageAtTime(2, this.q.getDownTime() + ((long) i) + ((long) d));
                }
                this.j.sendEmptyMessageAtTime(1, this.q.getDownTime() + ((long) i));
                break;
            case 1:
            case 3:
                this.j.removeMessages(1);
                this.j.removeMessages(2);
                if (this.z) {
                    this.z = false;
                    e();
                }
                this.m = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.s) {
                    zB = this.l.c(motionEvent) | false;
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
                    zB = false;
                } else if (this.o) {
                    zB = this.k.f(motionEvent);
                } else {
                    VelocityTracker velocityTracker = this.w;
                    velocityTracker.computeCurrentVelocity(1000, this.h);
                    float yVelocity = velocityTracker.getYVelocity();
                    float xVelocity = velocityTracker.getXVelocity();
                    zB = (Math.abs(yVelocity) > ((float) this.g) || Math.abs(xVelocity) > ((float) this.g)) ? this.k.b(this.q, motionEventObtain, xVelocity, yVelocity) : this.k.h(motionEvent);
                }
                this.k.i(motionEvent);
                this.r = MotionEvent.obtain(motionEvent);
                this.w.recycle();
                this.w = null;
                this.s = false;
                break;
            case 2:
                if (!this.n) {
                    float f = this.u - x;
                    float f2 = this.t - y;
                    if (!this.s) {
                        if (this.o) {
                            int x2 = (int) (x - this.q.getX());
                            int y2 = (int) (y - this.q.getY());
                            int i2 = (x2 * x2) + (y2 * y2);
                            if (i2 > c) {
                                zA = this.k.a(this.q, motionEvent, f, f2);
                                this.u = x;
                                this.t = y;
                                this.o = false;
                                this.j.removeMessages(3);
                                this.j.removeMessages(1);
                                this.j.removeMessages(2);
                            } else {
                                zA = false;
                            }
                            if (i2 > this.e) {
                                this.p = false;
                            }
                        } else if (Math.abs(f) >= 1.0f || Math.abs(f2) >= 1.0f) {
                            boolean zA2 = this.k.a(this.q, motionEvent, f, f2);
                            this.u = x;
                            this.t = y;
                        }
                    }
                }
                break;
            case 261:
                this.j.removeMessages(2);
                break;
        }
        return false;
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
