package com.censivn.C3DEngine.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
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

    /* renamed from: com.censivn.C3DEngine.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0023b {
        boolean a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        boolean c(MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
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

    /* loaded from: classes.dex */
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

    /* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.censivn.C3DEngine.a.b.a(android.view.MotionEvent):boolean");
    }

    private boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (this.p && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= 350) {
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f;
        }
        return false;
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
