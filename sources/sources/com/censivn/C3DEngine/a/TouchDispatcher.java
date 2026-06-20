package com.censivn.C3DEngine.a;

import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.View;
import com.censivn.C3DEngine.a.GestureDetector;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.tsf.shell.Home;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TouchDispatcher extends GestureDetector.DefaultOnGestureListener {
    private static TouchDispatcher h;
    private static boolean p = false;
    private GLSurfaceView a;
    private GestureDetector b;
    private com.censivn.C3DEngine.b.d.a c;
    private com.censivn.C3DEngine.b.d.a d;
    private com.tsf.shell.f.i.a.WallpaperTouchHandler e;
    private MotionEvent f;
    private MotionEvent g;
    private View.OnTouchListener j;
    private com.censivn.C3DEngine.b.d.a n;
    private boolean i = false;
    private boolean k = false;
    private boolean l = true;
    private boolean m = false;
    private boolean o = false;

    public TouchDispatcher(GLSurfaceView gLSurfaceView) {
        h = this;
        this.a = gLSurfaceView;
        this.b = new GestureDetector(this);
        this.j = new View.OnTouchListener() { // from class: com.censivn.C3DEngine.a.TouchDispatcher.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!TouchDispatcher.this.l) {
                    if (motionEvent.getAction() == 0) {
                        TouchDispatcher.this.i = true;
                        return true;
                    }
                    if (motionEvent.getAction() != 1) {
                        return true;
                    }
                    TouchDispatcher.this.i = false;
                    if (!TouchDispatcher.this.m) {
                        return true;
                    }
                    TouchDispatcher.this.m = false;
                    TouchDispatcher.this.l = true;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    try {
                        float[] fArrA = x.a(motionEvent);
                        i iVarC = com.censivn.C3DEngine.C3DEngine.e().c(fArrA[0], fArrA[1]);
                        if ((iVarC == null || iVarC.getMouseEventListener() == null) && Home.b().l().a(motionEvent)) {
                            if (com.tsf.shell.manager.A.h.v().mouseEnabled()) {
                                return false;
                            }
                        }
                    } catch (Exception e) {
                    }
                }
                com.tsf.shell.manager.action.GestureHandler.c(motionEvent);
                if (TouchDispatcher.this.i && motionEvent.getAction() == 2) {
                    TouchDispatcher.this.n(motionEvent);
                    TouchDispatcher.this.b.a(motionEvent);
                    return true;
                }
                final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.TouchDispatcher.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        switch (motionEventObtain.getAction()) {
                            case 261:
                                TouchDispatcher.this.o(motionEventObtain);
                                break;
                            case 262:
                                TouchDispatcher.this.p(motionEventObtain);
                                break;
                        }
                        TouchDispatcher.this.b.a(motionEventObtain);
                        motionEventObtain.recycle();
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

    public com.tsf.shell.f.i.a.WallpaperTouchHandler c() {
        return this.e;
    }

    public void a(com.tsf.shell.f.i.a.WallpaperTouchHandler aVar) {
        this.e = aVar;
        this.c = aVar;
    }

    public static TouchDispatcher d() {
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
            }
            if (this.c != aVar) {
                this.d = aVar;
                if (this.c.c != aVar.c) {
                    this.c.c.onKillFocus();
                }
                this.c = aVar;
                this.c.c.onFocus();
                return;
            }
            return;
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
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent2);
        this.e.a(motionEvent, motionEventObtain, f, f2);
        motionEventObtain.recycle();
    }

    public void k(final MotionEvent motionEvent) {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.TouchDispatcher.2
            @Override // java.lang.Runnable
            public void run() {
                TouchDispatcher.this.e.f(motionEvent);
            }
        });
    }

    public void d(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float f, final float f2) {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.censivn.C3DEngine.a.TouchDispatcher.3
            @Override // java.lang.Runnable
            public void run() {
                TouchDispatcher.this.e.b(motionEvent, motionEvent2, f, f2);
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

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
    public boolean d(MotionEvent motionEvent) {
        this.k = false;
        b(true);
        this.i = true;
        l(motionEvent);
        float[] fArrA = x.a(this.f);
        i iVarC = com.censivn.C3DEngine.C3DEngine.e().c(fArrA[0], fArrA[1]);
        if (iVarC != null) {
            this.d = iVarC.getMouseEventListener();
            if (this.c.c != iVarC.getMouseEventListener().c) {
                this.c.c.onKillFocus();
            }
            this.c = iVarC.getMouseEventListener();
            this.c.e(this.f);
            this.c.c.onFocus();
        } else {
            i();
            this.c.e(this.f);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnDoubleTapListener
    public boolean a(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.k(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
    public boolean f(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.a(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
    public void e(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
    public void g(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.c(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
    public void j(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.d(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
    public boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.k) {
            this.c.a(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
    public boolean h(MotionEvent motionEvent) {
        if (!this.k) {
            this.c.g(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
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

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnGestureListener
    public boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.k) {
            this.c.b(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.a.GestureDetector.DefaultOnGestureListener, com.censivn.C3DEngine.a.GestureDetector.OnDoubleTapListener
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
