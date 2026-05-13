package com.censivn.C3DEngine.p030a;

import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.View;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0855b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.p096f.p153i.p154a.C3107a;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.a.d */
/* loaded from: classes.dex */
public class C0864d extends C0855b.C0862d {

    /* renamed from: h */
    private static C0864d f2446h;

    /* renamed from: p */
    private static boolean f2447p = false;

    /* renamed from: a */
    private GLSurfaceView f2448a;

    /* renamed from: b */
    private C0855b f2449b;

    /* renamed from: c */
    private C0937a f2450c;

    /* renamed from: d */
    private C0937a f2451d;

    /* renamed from: e */
    private C3107a f2452e;

    /* renamed from: f */
    private MotionEvent f2453f;

    /* renamed from: g */
    private MotionEvent f2454g;

    /* renamed from: j */
    private View.OnTouchListener f2456j;

    /* renamed from: n */
    private C0937a f2460n;

    /* renamed from: i */
    private boolean f2455i = false;

    /* renamed from: k */
    private boolean f2457k = false;

    /* renamed from: l */
    private boolean f2458l = true;

    /* renamed from: m */
    private boolean f2459m = false;

    /* renamed from: o */
    private boolean f2461o = false;

    public C0864d(GLSurfaceView gLSurfaceView) {
        f2446h = this;
        this.f2448a = gLSurfaceView;
        this.f2449b = new C0855b(this);
        this.f2456j = new View.OnTouchListener() { // from class: com.censivn.C3DEngine.a.d.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!C0864d.this.f2458l) {
                    if (motionEvent.getAction() == 0) {
                        C0864d.this.f2455i = true;
                        return true;
                    } else if (motionEvent.getAction() == 1) {
                        C0864d.this.f2455i = false;
                        if (C0864d.this.f2459m) {
                            C0864d.this.f2459m = false;
                            C0864d.this.f2458l = true;
                            return true;
                        }
                        return true;
                    } else {
                        return true;
                    }
                }
                if (motionEvent.getAction() == 0) {
                    try {
                        float[] m601a = C4189x.m601a(motionEvent);
                        C0975i m10767c = C0853a.m10855e().m10767c(m601a[0], m601a[1]);
                        if ((m10767c == null || m10767c.getMouseEventListener() == null) && Home.m6177b().m6164l().m5983a(motionEvent)) {
                            if (C3359a.f11094h.m4015v().mouseEnabled()) {
                                return false;
                            }
                        }
                    } catch (Exception e) {
                    }
                }
                C3398f.m2636c(motionEvent);
                if (C0864d.this.f2455i && motionEvent.getAction() == 2) {
                    C0864d.this.m10784n(motionEvent);
                    C0864d.this.f2449b.m10850a(motionEvent);
                    return true;
                }
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.a.d.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        switch (obtain.getAction()) {
                            case 261:
                                C0864d.this.m10783o(obtain);
                                break;
                            case 262:
                                C0864d.this.m10782p(obtain);
                                break;
                        }
                        C0864d.this.f2449b.m10850a(obtain);
                        obtain.recycle();
                    }
                });
                return true;
            }
        };
    }

    /* renamed from: a */
    public void m10818a(boolean z) {
        if (!z) {
            this.f2458l = false;
        } else if (this.f2455i) {
            this.f2459m = true;
        } else {
            this.f2458l = true;
        }
    }

    /* renamed from: a */
    public void m10827a() {
        this.f2448a.setOnTouchListener(this.f2456j);
    }

    /* renamed from: b */
    public boolean m10817b() {
        return this.f2455i;
    }

    /* renamed from: c */
    public C3107a m10810c() {
        return this.f2452e;
    }

    /* renamed from: a */
    public void m10819a(C3107a c3107a) {
        this.f2452e = c3107a;
        this.f2450c = c3107a;
    }

    /* renamed from: d */
    public static C0864d m10805d() {
        return f2446h;
    }

    /* renamed from: a */
    public void m10821a(C0937a c0937a) {
        m10820a(c0937a, false);
    }

    /* renamed from: e */
    public void m10801e() {
        this.f2461o = true;
    }

    /* renamed from: l */
    private void m10786l(MotionEvent motionEvent) {
        if (this.f2453f != null) {
            this.f2453f.recycle();
        }
        this.f2453f = MotionEvent.obtain(motionEvent);
    }

    /* renamed from: m */
    private void m10785m(MotionEvent motionEvent) {
        if (this.f2454g != null) {
            this.f2454g.recycle();
        }
        this.f2454g = MotionEvent.obtain(motionEvent);
    }

    /* renamed from: a */
    public void m10820a(C0937a c0937a, boolean z) {
        if (!this.f2455i || z) {
            if (c0937a == null) {
                this.f2451d = this.f2452e;
                if (this.f2450c.f2740c != null) {
                    this.f2450c.f2740c.onKillFocus();
                }
                this.f2450c = this.f2452e;
                return;
            } else if (this.f2450c != c0937a) {
                this.f2451d = c0937a;
                if (this.f2450c.f2740c != c0937a.f2740c) {
                    this.f2450c.f2740c.onKillFocus();
                }
                this.f2450c = c0937a;
                this.f2450c.f2740c.onFocus();
                return;
            } else {
                return;
            }
        }
        this.f2460n = c0937a;
    }

    /* renamed from: f */
    public MotionEvent m10798f() {
        return this.f2453f;
    }

    /* renamed from: g */
    public MotionEvent m10796g() {
        return this.f2454g;
    }

    /* renamed from: h */
    public C0937a m10794h() {
        return this.f2450c;
    }

    /* renamed from: i */
    public void m10792i() {
        this.f2451d = this.f2452e;
        if (this.f2450c.f2740c != null) {
            this.f2450c.f2740c.onKillFocus();
        }
        this.f2450c = this.f2452e;
    }

    /* renamed from: c */
    public void m10809c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent2);
        this.f2452e.mo527a(motionEvent, obtain, f, f2);
        obtain.recycle();
    }

    /* renamed from: k */
    public void m10787k(final MotionEvent motionEvent) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.a.d.2
            @Override // java.lang.Runnable
            public void run() {
                C0864d.this.f2452e.mo1653f(motionEvent);
            }
        });
    }

    /* renamed from: d */
    public void m10803d(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float f, final float f2) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.a.d.3
            @Override // java.lang.Runnable
            public void run() {
                C0864d.this.f2452e.mo3209b(motionEvent, motionEvent2, f, f2);
            }
        });
    }

    /* renamed from: b */
    public static void m10811b(boolean z) {
        f2447p = z;
    }

    /* renamed from: j */
    public static boolean m10790j() {
        return f2447p;
    }

    /* renamed from: k */
    public void m10788k() {
        this.f2457k = true;
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: d */
    public boolean mo10804d(MotionEvent motionEvent) {
        this.f2457k = false;
        m10811b(true);
        this.f2455i = true;
        m10786l(motionEvent);
        float[] m601a = C4189x.m601a(this.f2453f);
        C0975i m10767c = C0853a.m10855e().m10767c(m601a[0], m601a[1]);
        if (m10767c != null) {
            this.f2451d = m10767c.getMouseEventListener();
            if (this.f2450c.f2740c != m10767c.getMouseEventListener().f2740c) {
                this.f2450c.f2740c.onKillFocus();
            }
            this.f2450c = m10767c.getMouseEventListener();
            this.f2450c.mo1654e(this.f2453f);
            this.f2450c.f2740c.onFocus();
        } else {
            m10792i();
            this.f2450c.mo1654e(this.f2453f);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0860b
    /* renamed from: a */
    public boolean mo10826a(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo10267k(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: f */
    public boolean mo10797f(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo502a(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: e */
    public void mo10800e(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo3548b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: g */
    public void mo10795g(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo2122c(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: j */
    public void mo10789j(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo2119d(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: a */
    public boolean mo10825a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f2457k) {
            this.f2450c.mo527a(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: h */
    public boolean mo10793h(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo3208g(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: i */
    public boolean mo10791i(MotionEvent motionEvent) {
        m10785m(motionEvent);
        m10811b(false);
        this.f2450c.mo1653f(motionEvent);
        this.f2455i = false;
        if (this.f2460n != null) {
            this.f2449b.m10852a();
            m10821a(this.f2460n);
            this.f2460n = null;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m10784n(MotionEvent motionEvent) {
        if (!this.f2457k) {
            if (this.f2461o) {
                this.f2461o = false;
                m10786l(motionEvent);
            }
            this.f2450c.mo2129a(this.f2453f, motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0861c
    /* renamed from: b */
    public boolean mo10815b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f2457k) {
            this.f2450c.mo3209b(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.p030a.C0855b.C0862d, com.censivn.C3DEngine.p030a.C0855b.InterfaceC0860b
    /* renamed from: b */
    public boolean mo10816b(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo3555h(motionEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m10783o(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo3543j(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m10782p(MotionEvent motionEvent) {
        if (!this.f2457k) {
            this.f2450c.mo3544i(motionEvent);
        }
    }
}
