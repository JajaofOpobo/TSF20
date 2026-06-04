package com.tsf.shell.workspace3D.k.c.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;

/* loaded from: classes.dex */
public final class af {
    private static Number3d s = new Number3d();
    private static Number3d t = new Number3d();
    private static Number3d u = new Number3d();
    private static float v;
    public SystemFolderTheme a;
    public com.tsf.shell.workspace3D.c.a b;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    private com.censivn.C3DEngine.e.b w;

    public af() {
        a();
    }

    public final void a() {
        this.a = ThemeManager.mix.folder.getTheme();
        this.c = this.a.borderLeft;
        this.d = this.a.borderRight;
        this.e = this.a.borderTop;
        this.f = this.a.borderBottom;
        this.g = (-(this.c + this.d)) / 2.0f;
        this.h = (-(this.e + this.f)) / 2.0f;
        this.q = this.a.borderRight - this.a.borderLeft;
        this.r = this.a.borderTop - this.a.borderBottom;
        if (this.b != null) {
            com.tsf.shell.workspace3D.c.b.a(this.b);
        } else {
            this.b = com.tsf.shell.workspace3D.c.b.a(this.q, this.r);
        }
        if (this.w == null) {
            this.w = new com.censivn.C3DEngine.e.b(1.0f, 1.0f, 1, 1, false);
        }
        this.w.E().setPX(0, this.d, this.f, 0.0f);
        this.w.E().setPX(1, this.c, this.f, 0.0f);
        this.w.E().setPX(2, this.d, this.e, 0.0f);
        this.w.E().setPX(3, this.c, this.e, 0.0f);
        this.i = this.w.E().pxX(0);
        this.j = this.w.E().pxX(1);
        this.k = this.w.E().pxX(2);
        this.l = this.w.E().pxX(3);
        this.m = this.w.E().pxY(0);
        this.n = this.w.E().pxY(1);
        this.o = this.w.E().pxY(2);
        this.p = this.w.E().pxY(3);
    }

    public final void a(c cVar) {
        boolean z = cVar.q;
        if (z) {
            b(cVar);
        }
        if (cVar.r) {
            cVar.k.a((Boolean) false);
        }
        Color4 m1clone = cVar.g.J().m1clone();
        cVar.g.K();
        s.setAllFrom(cVar.g.L());
        t.setAllFrom(cVar.g.M());
        u.setAllFrom(cVar.g.N());
        v = cVar.g.I();
        boolean A = cVar.g.A();
        cVar.g.L().setAll(this.g, this.h, 0.0f);
        cVar.g.M().setAll(0.0f, 0.0f, 0.0f);
        cVar.g.N().setAll(1.0f, 1.0f, 1.0f);
        cVar.g.b(255.0f);
        cVar.g.a((Boolean) true);
        com.tsf.shell.workspace3D.c.b.a(this.b, cVar.n);
        GLES20.glBindFramebuffer(36160, this.b.a);
        GLES20.glViewport(0, 0, this.q, this.r);
        com.censivn.C3DEngine.a.d().b(this.q, this.r);
        GLES20.glClear(ThemeParser.TYPE_WALLPAPER);
        if (cVar.g.A()) {
            MatrixStack.glPushMatrix();
            cVar.g.e();
            if (cVar.g.aC()) {
                int size = cVar.g.aD().size();
                for (int i = 0; i < size; i++) {
                    com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) cVar.g.aD().get(i);
                    if (!(rVar instanceof com.tsf.shell.workspace3D.k.j)) {
                        rVar.f();
                    }
                }
            }
            MatrixStack.glPopMatrix();
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m);
        com.censivn.C3DEngine.a.d().b(com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m);
        cVar.g.L().setAllFrom(s);
        cVar.g.M().setAllFrom(t);
        cVar.g.N().setAllFrom(u);
        cVar.g.a(m1clone);
        cVar.g.b(v);
        cVar.g.a(Boolean.valueOf(A));
        if (z) {
            c(cVar);
        }
    }

    public static void b(c cVar) {
        if (cVar.q) {
            cVar.q = false;
            d(cVar);
        }
    }

    public static void c(c cVar) {
        if (!cVar.q) {
            cVar.q = true;
            e(cVar);
        }
    }

    public static void d(c cVar) {
        cVar.h.a((Boolean) true);
        if (cVar.j != null) {
            cVar.j.a((Boolean) true);
        }
        if (cVar.i != null) {
            cVar.i.a((Boolean) true);
        }
        if (cVar.l != null) {
            cVar.l.a((Boolean) true);
        }
        if (!cVar.r) {
            cVar.k.a((Boolean) true);
        }
        cVar.m.a((Boolean) false);
    }

    public static void e(c cVar) {
        cVar.h.a((Boolean) false);
        if (cVar.j != null) {
            cVar.j.a((Boolean) false);
        }
        if (cVar.i != null) {
            cVar.i.a((Boolean) false);
        }
        if (cVar.l != null) {
            cVar.l.a((Boolean) false);
        }
        cVar.k.a((Boolean) false);
        cVar.m.a((Boolean) true);
    }
}
