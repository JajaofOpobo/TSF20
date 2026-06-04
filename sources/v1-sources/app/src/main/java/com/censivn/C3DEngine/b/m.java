package com.censivn.C3DEngine.b;

import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends i {
    private static m g;
    private static boolean l = false;
    private GLSurfaceView a;
    private b b;
    private l c;
    private l d;
    private com.tsf.shell.workspace3D.a.a e;
    private MotionEvent f;
    private View.OnTouchListener i;
    private l k;
    private boolean h = false;
    private boolean j = false;

    public m(GLSurfaceView gLSurfaceView) {
        g = this;
        this.a = gLSurfaceView;
        this.b = new b(this);
        this.i = new n(this);
    }

    public final void a() {
        this.a.setOnTouchListener(this.i);
    }

    public final boolean b() {
        return this.h;
    }

    public final com.tsf.shell.workspace3D.a.a c() {
        return this.e;
    }

    public final void a(com.tsf.shell.workspace3D.a.a aVar) {
        this.e = aVar;
        this.c = aVar;
    }

    public static m d() {
        return g;
    }

    public final void a(l lVar) {
        a(lVar, false);
    }

    public final void a(l lVar, boolean z) {
        if (!this.h || z) {
            if (lVar == null) {
                this.d = this.e;
                if (this.c.b != null) {
                    this.c.b.l_();
                }
                this.c = this.e;
                return;
            }
            if (this.c != lVar) {
                this.d = lVar;
                if (this.c.b != lVar.b) {
                    this.c.b.l_();
                }
                this.c = lVar;
                this.c.b.k_();
                return;
            }
            return;
        }
        this.k = lVar;
    }

    public final r e() {
        if (this.d == null) {
            return null;
        }
        return this.d.b;
    }

    public final l f() {
        return this.c;
    }

    public final void g() {
        this.d = this.e;
        if (this.c.b != null) {
            this.c.b.l_();
        }
        this.c = this.e;
    }

    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.e.a(motionEvent, MotionEvent.obtain(motionEvent2), 0.0f, 0.0f);
    }

    public final void j(MotionEvent motionEvent) {
        com.censivn.C3DEngine.a.a().c(new p(this, motionEvent));
    }

    public final void c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        com.censivn.C3DEngine.a.a().c(new q(this, motionEvent, motionEvent2, f, f2));
    }

    public static void a(boolean z) {
        l = z;
    }

    public static boolean h() {
        return l;
    }

    public final void i() {
        this.j = true;
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final boolean c(MotionEvent motionEvent) {
        this.j = false;
        l = true;
        this.h = true;
        this.f = MotionEvent.obtain(motionEvent);
        float[] a = com.censivn.C3DEngine.h.a.a(this.f);
        r b = com.censivn.C3DEngine.a.d().b(a[0], a[1]);
        if (b != null) {
            this.d = b.aw();
            if (this.c.b != b.aw().b) {
                this.c.b.l_();
            }
            this.c = b.aw();
            this.c.e(this.f);
            this.c.b.k_();
        } else {
            g();
            this.c.e(this.f);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.g
    public final boolean a(MotionEvent motionEvent) {
        if (!this.j) {
            this.c.k(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final boolean e(MotionEvent motionEvent) {
        if (!this.j) {
            this.c.a(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final void d(MotionEvent motionEvent) {
        if (!this.j) {
            this.c.b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final void f(MotionEvent motionEvent) {
        if (!this.j) {
            this.c.c(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final void i(MotionEvent motionEvent) {
        if (!this.j) {
            this.c.d(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.j) {
            this.c.a(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final boolean g(MotionEvent motionEvent) {
        if (!this.j) {
            this.c.g(motionEvent);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final boolean h(MotionEvent motionEvent) {
        l = false;
        this.c.f(motionEvent);
        this.h = false;
        if (this.k != null) {
            this.b.a();
            a(this.k, false);
            this.k = null;
            return true;
        }
        return true;
    }

    static /* synthetic */ void a(m mVar, MotionEvent motionEvent) {
        if (mVar.j) {
            return;
        }
        mVar.c.a(mVar.f, motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.h
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.j) {
            this.c.b(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // com.censivn.C3DEngine.b.i, com.censivn.C3DEngine.b.g
    public final boolean b(MotionEvent motionEvent) {
        if (!this.j) {
            this.c.h(motionEvent);
        }
        return true;
    }

    static /* synthetic */ void b(m mVar, MotionEvent motionEvent) {
        if (mVar.j) {
            return;
        }
        mVar.c.j(motionEvent);
    }

    static /* synthetic */ void c(m mVar, MotionEvent motionEvent) {
        if (mVar.j) {
            return;
        }
        mVar.c.i(motionEvent);
    }
}
