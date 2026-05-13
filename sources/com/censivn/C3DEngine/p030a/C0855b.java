package com.censivn.C3DEngine.p030a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
/* renamed from: com.censivn.C3DEngine.a.b */
/* loaded from: classes.dex */
public class C0855b {

    /* renamed from: a */
    public static int f2415a;

    /* renamed from: b */
    public static int f2416b;

    /* renamed from: c */
    public static int f2417c;

    /* renamed from: e */
    private int f2420e;

    /* renamed from: f */
    private int f2421f;

    /* renamed from: g */
    private int f2422g;

    /* renamed from: h */
    private int f2423h;

    /* renamed from: j */
    private final Handler f2424j;

    /* renamed from: k */
    private final InterfaceC0861c f2425k;

    /* renamed from: l */
    private InterfaceC0860b f2426l;

    /* renamed from: m */
    private boolean f2427m;

    /* renamed from: n */
    private boolean f2428n;

    /* renamed from: o */
    private boolean f2429o;

    /* renamed from: p */
    private boolean f2430p;

    /* renamed from: q */
    private MotionEvent f2431q;

    /* renamed from: r */
    private MotionEvent f2432r;

    /* renamed from: s */
    private boolean f2433s;

    /* renamed from: t */
    private float f2434t;

    /* renamed from: u */
    private float f2435u;

    /* renamed from: v */
    private boolean f2436v;

    /* renamed from: w */
    private VelocityTracker f2437w;

    /* renamed from: x */
    private boolean f2438x;

    /* renamed from: y */
    private boolean f2439y;

    /* renamed from: z */
    private boolean f2440z;

    /* renamed from: i */
    private static final int f2419i = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    public static int f2418d = 0;

    /* renamed from: com.censivn.C3DEngine.a.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0860b {
        /* renamed from: a */
        boolean mo10826a(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo10816b(MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo10834c(MotionEvent motionEvent);
    }

    /* renamed from: com.censivn.C3DEngine.a.b$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0861c {
        /* renamed from: a */
        boolean mo10825a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: b */
        boolean mo10815b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: d */
        boolean mo10804d(MotionEvent motionEvent);

        /* renamed from: e */
        void mo10800e(MotionEvent motionEvent);

        /* renamed from: f */
        boolean mo10797f(MotionEvent motionEvent);

        /* renamed from: g */
        void mo10795g(MotionEvent motionEvent);

        /* renamed from: h */
        boolean mo10793h(MotionEvent motionEvent);

        /* renamed from: i */
        boolean mo10791i(MotionEvent motionEvent);

        /* renamed from: j */
        void mo10789j(MotionEvent motionEvent);
    }

    /* renamed from: com.censivn.C3DEngine.a.b$d */
    /* loaded from: classes.dex */
    public static class C0862d implements InterfaceC0860b, InterfaceC0861c {
        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: f */
        public boolean mo10797f(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: g */
        public void mo10795g(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: a */
        public boolean mo10825a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: b */
        public boolean mo10815b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: e */
        public void mo10800e(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: d */
        public boolean mo10804d(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: i */
        public boolean mo10791i(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0860b
        /* renamed from: b */
        public boolean mo10816b(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0860b
        /* renamed from: c */
        public boolean mo10834c(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0860b
        /* renamed from: a */
        public boolean mo10826a(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: h */
        public boolean mo10793h(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
        /* renamed from: j */
        public void mo10789j(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.censivn.C3DEngine.a.b$a */
    /* loaded from: classes.dex */
    private class HandlerC0859a extends Handler {
        HandlerC0859a() {
        }

        HandlerC0859a(Handler handler) {
            super(handler.getLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C0855b.this.m10842d();
                    return;
                case 2:
                    C0855b.this.m10846b();
                    return;
                case 3:
                    C0855b.this.m10838f();
                    return;
                default:
                    throw new RuntimeException("Unknown message " + message);
            }
        }
    }

    @Deprecated
    public C0855b(InterfaceC0861c interfaceC0861c) {
        this(null, interfaceC0861c, null);
    }

    public C0855b(Context context, InterfaceC0861c interfaceC0861c, Handler handler) {
        this.f2420e = VEasing.Linear.easeNone;
        this.f2438x = false;
        this.f2439y = false;
        this.f2440z = false;
        if (handler != null) {
            this.f2424j = new HandlerC0859a(handler);
        } else {
            this.f2424j = new HandlerC0859a();
        }
        this.f2425k = interfaceC0861c;
        if (interfaceC0861c instanceof InterfaceC0860b) {
            m10848a((InterfaceC0860b) interfaceC0861c);
        }
        m10851a(context);
    }

    /* renamed from: a */
    private void m10851a(Context context) {
        if (this.f2425k == null) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        this.f2436v = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(C0853a.m10856d());
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i = (int) (50.0f * C0892a.f2566b);
        this.f2422g = 500;
        int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        f2415a = scaledMaximumFlingVelocity;
        this.f2423h = scaledMaximumFlingVelocity;
        int i2 = scaledTouchSlop * scaledTouchSlop;
        f2416b = i2;
        f2417c = i2;
        this.f2421f = i * i;
    }

    /* renamed from: a */
    public void m10848a(InterfaceC0860b interfaceC0860b) {
        this.f2426l = interfaceC0860b;
    }

    /* renamed from: a */
    public void m10852a() {
        if (this.f2424j.hasMessages(3)) {
            this.f2424j.removeMessages(3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m10850a(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.censivn.C3DEngine.p030a.C0855b.m10850a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private boolean m10849a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (this.f2430p && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= 350) {
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f2421f;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10846b() {
        this.f2424j.removeMessages(3);
        this.f2428n = true;
        this.f2438x = false;
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                C0855b.this.m10844c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m10844c() {
        if (!this.f2438x) {
            this.f2425k.mo10795g(this.f2431q);
            this.f2438x = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m10842d() {
        this.f2440z = true;
        this.f2439y = false;
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                C0855b.this.m10840e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m10840e() {
        if (!this.f2439y) {
            this.f2425k.mo10800e(this.f2431q);
            this.f2439y = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m10838f() {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (C0855b.this.f2426l != null && !C0855b.this.f2427m) {
                    C0855b.this.f2426l.mo10826a(C0855b.this.f2431q);
                }
            }
        });
    }
}
