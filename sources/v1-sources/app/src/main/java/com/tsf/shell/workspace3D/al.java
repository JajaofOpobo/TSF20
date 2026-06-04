package com.tsf.shell.workspace3D;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.bj;

/* loaded from: classes.dex */
public final class al implements bj {
    private com.censivn.C3DEngine.b.ab a;
    private Object b = new Object();
    private com.censivn.C3DEngine.b.v c;
    private com.censivn.C3DEngine.b.v d;
    private VObject3dContainer e;
    private com.censivn.C3DEngine.e.c f;
    private com.tsf.shell.workspace3D.d.a g;
    private com.censivn.C3DEngine.b.v h;
    private com.tsf.shell.h.m i;
    private FrameLayout j;
    private com.tsf.shell.workspace3D.k.j k;
    private com.censivn.C3DEngine.b.v l;

    public al(com.tsf.shell.h.m mVar) {
        com.tsf.shell.bd.a(this);
        this.i = mVar;
        this.j = new FrameLayout(this.i.getContext());
    }

    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.j.getParent() == null) {
            this.i.addView(this.j);
        }
        this.j.addView(view, layoutParams);
    }

    public final void a(View view) {
        this.j.removeView(view);
        if (this.j.getChildCount() == 0) {
            this.i.removeView(this.j);
        }
    }

    public final void a(com.censivn.C3DEngine.b.ab abVar) {
        this.a = abVar;
        this.c = new com.censivn.C3DEngine.b.v();
        this.l = new am(this);
        this.e = new an(this);
        this.h = new com.censivn.C3DEngine.b.v();
        this.d = (com.censivn.C3DEngine.b.v) this.e.getVirtualTarget();
        this.f = new com.censivn.C3DEngine.e.c();
        this.f.b(-2.1474836E9f, -2.1474836E9f, -2.1474836E9f, 2.1474836E9f, 2.1474836E9f);
        this.f.a(new com.censivn.C3DEngine.b.l(this.f));
        this.c.d(this.f);
        this.c.d(this.d);
    }

    public final com.censivn.C3DEngine.b.v a(com.tsf.shell.workspace3D.d.a aVar) {
        if (aVar == null) {
            return null;
        }
        this.f.b(0.0f);
        bf.j();
        com.tsf.shell.workspace3D.h.l.B();
        com.tsf.shell.aq.a(aVar);
        this.g = aVar;
        this.a.d(this.c);
        return this.d;
    }

    public final void a(Runnable runnable) {
        a(runnable, true);
    }

    public final void a(Runnable runnable, boolean z) {
        if (this.g != null) {
            bf.n().a(new ao(this, runnable), z);
        }
    }

    public final void a() {
        this.a.e(this.c);
        bf.j().C();
        com.tsf.shell.aq.b(this.g);
        this.g = null;
    }

    public final boolean a(com.tsf.shell.workspace3D.k.j jVar, boolean z) {
        if (this.k == null) {
            this.k = jVar;
            Number3d number3d = null;
            if (z) {
                number3d = jVar.c(new Number3d());
            }
            jVar.Q();
            if (number3d != null) {
                jVar.L().setAllFrom(number3d);
            }
            this.h.d(jVar);
            if (this.h.P() == null) {
                this.a.d(this.h);
            }
            return true;
        }
        String str = "add widget error , current widget is not empty:" + this.k;
        return false;
    }

    public final com.censivn.C3DEngine.b.v c() {
        return this.k;
    }

    public final com.tsf.shell.workspace3D.k.j d() {
        if (this.k == null) {
            return null;
        }
        this.h.e(this.k);
        this.h.Q();
        com.tsf.shell.workspace3D.k.j jVar = this.k;
        this.k = null;
        String str = "remove widget and container success :" + jVar;
        return jVar;
    }

    public final void e() {
        if (this.k != null) {
            this.k.a(bf.j().k());
            com.tsf.shell.workspace3D.k.j d = d();
            if (d instanceof com.tsf.shell.workspace3D.k.j) {
                d.bc().g(d);
            }
        }
    }

    public final com.censivn.C3DEngine.b.v f() {
        return this.l;
    }

    public final void a(com.censivn.C3DEngine.b.r rVar) {
        this.l.d(rVar);
        this.l.ax();
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
