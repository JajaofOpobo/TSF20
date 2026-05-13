package com.censivn.C3DEngine.a;

import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.View;
import com.censivn.C3DEngine.a.b;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.Home;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class d extends b.d {
    private static d h;
    private static boolean p = false;
    private GLSurfaceView a;
    private b b;
    private com.censivn.C3DEngine.b.d.a c;
    private com.censivn.C3DEngine.b.d.a d;
    private com.tsf.shell.f.i.a.a e;
    private MotionEvent f;
    private MotionEvent g;
    private View.OnTouchListener j;
    private com.censivn.C3DEngine.b.d.a n;
    private boolean i = false;
    private boolean k = false;
    private boolean l = true;
    private boolean m = false;
    private boolean o = false;

    public d(GLSurfaceView gLSurfaceView) {
        h = this;
        this.a = gLSurfaceView;
        this.b = new b(this);
        this.j = new View.OnTouchListener() { // from class: com.censivn.C3DEngine.a.d.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!d.this.l) {
                    if (motionEvent.getAction() == 0) {
                        d.this.i = true;
                        return true;
                    } else if (motionEvent.getAction() == 1) {
                        d.this.i = false;
                        if (d.this.m) {
                            d.this.m = false;
                            d.this.l = true;
                            return true;
                        }
                        return true;
                    } else {
                        return true;
                    }
                }
                if (motionEvent.getAction() == 0) {
                    try {
                        float[] a = x.a(motionEvent);
                        i c = com.censivn.C3DEngine.a.e().c(a[0], a[1]);
                        if ((c == null || c.getMouseEventListener() == null) && Home.b().l().a(motionEvent)) {
                            if (com.tsf.shell.manager.a.h.v().mouseEnabled()) {
                                return false;
                            }
                        }
                    } catch (Exception e) {
                    }
                }
                com.tsf.shell.manager.action.f.c(motionEvent);
                if (d.this.i && motionEvent.getAction() == 2) {
                    d.this.n(motionEvent);
                    d.this.b.a(motionEvent);
                    return true;
                }
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.d.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        switch (obtain.getAction()) {
                            case 261:
                                d.this.o(obtain);
                                break;
                            case 262:
                                d.this.p(obtain);
                                break;
                        }
                        d.this.b.a(obtain);
                        obtain.recycle();
                    }
                });
                return true;
            }
        };
    }

    public void a(boolean z) {
        if (!z) {
            this.l = false;
        } else if (this.i) {
            this.m = true;
        } else {
            this.l = true;
        }
    }

    public void a() {
        this.a.setOnTouchListener(this.j);
    }

    public boolean b() {
        return this.i;
    }

    public com.tsf.shell.f.i.a.a c() {
        return this.e;
    }

    public void a(com.tsf.shell.f.i.a.a aVar) {
        this.e = aVar;
        this.c = aVar;
    }

    public static d d() {
        return h;
    }

    public void a(com.censivn.C3DEngine.b.d.a aVar) {
        a(aVar, false);
    }

    public void e() {
        this.o = true;
    }

    private void l(MotionEvent motionEvent) {
        if (this.f != null) {
            this.f.recycle();
        }
        this.f = MotionEvent.obtain(motionEvent);
    }

    private void m(MotionEvent motionEvent) {
        if (this.g != null) {
            this.g.recycle();
        }
        this.g = MotionEvent.obtain(motionEvent);
    }

    public void a(com.censivn.C3DEngine.b.d.a aVar, boolean z) {
        if (!this.i || z) {
            if (aVar == null) {
                this.d = this.e;
                if (this.c.c != null) {
                    this.c.c.onKillFocus();
                }
                this.c = this.e;
                return;
            } else if (this.c != aVar) {
                this.d = aVar;
                if (this.c.c != aVar.c) {
                    this.c.c.onKillFocus();
                }
                this.c = aVar;
                this.c.c.onFocus();
                return;
            } else {
                return;
            }
        }
        this.n = aVar;
    }

    public MotionEvent f() {
        return this.f;
    }

    public MotionEvent g() {
        return this.g;
    }

    public com.censivn.C3DEngine.b.d.a h() {
        return this.c;
    }

    public void i() {
        this.d = this.e;
        if (this.c.c != null) {
            this.c.c.onKillFocus();
        }
        this.c = this.e;
    }

    public void c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent2);
        this.e.a(motionEvent, obtain, f, f2);
        obtain.recycle();
    }

    public void k(final MotionEvent motionEvent) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.d.2
            @Override // java.lang.Runnable
            public void run() {
                d.this.e.f(motionEvent);
            }
        });
    }

    public void d(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float f, final float f2) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.d.3
            @Override // java.lang.Runnable
            public void run() {
                d.this.e.b(motionEvent, motionEvent2, f, f2);
            }
        });
    }

    public static void b(boolean z) {
        p = z;
    }

    public static boolean j() {
        return p;
    }

    public void k() {
        this.k = true;
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public boolean d(MotionEvent motionEvent) {
        this.k = false;
        b(true);
        this.i = true;
        l(motionEvent);
        float[] a = x.a(this.f);
        i c = com.censivn.C3DEngine.a.e().c(a[0], a[1]);
        if (c != null) {
            this.d = c.getMouseEventListener();
            if (this.c.c != c.getMouseEventListener().c) {
                this.c.c.onKillFocus();
            }
            this.c = c.getMouseEventListener();
            this.c.e(this.f);
            this.c.c.onFocus();
        } else {
            i();
            this.c.e(this.f);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.InterfaceC0023b
    public boolean a(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.k(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public boolean f(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.a(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public void e(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public void g(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.c(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public void j(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.d(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.k) {
            this.c.a(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public boolean h(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.g(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public boolean i(MotionEvent motionEvent) {
        m(motionEvent);
        b(false);
        this.c.f(motionEvent);
        this.i = false;
        if (this.n != null) {
            this.b.a();
            a(this.n);
            this.n = null;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(MotionEvent motionEvent) {
        if (!this.k) {
            if (this.o) {
                this.o = false;
                l(motionEvent);
            }
            this.c.a(this.f, motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.c
    public boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.k) {
            this.c.b(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.b.d, com.censivn.C3DEngine.a.b.InterfaceC0023b
    public boolean b(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.h(motionEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.j(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.i(motionEvent);
        }
    }
}
