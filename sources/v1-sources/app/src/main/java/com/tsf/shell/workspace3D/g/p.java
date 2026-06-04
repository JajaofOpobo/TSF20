package com.tsf.shell.workspace3D.g;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p {
    private static int b = ThemeShellDescription.PUBLIC_BUTTON_CLOSE;
    private static com.censivn.C3DEngine.e.b g;
    private static TextureElement h;
    private com.tsf.shell.workspace3D.k.c.b.c c;
    private com.censivn.C3DEngine.b.v d;
    private com.tsf.shell.workspace3D.k.j e;
    private int j;
    private int k;
    private int l;
    private int m;
    private float n;
    private float o;
    private com.tsf.shell.workspace3D.d.a s;
    private float t;
    private com.censivn.C3DEngine.e.b v;
    private boolean p = false;
    private boolean q = false;
    private boolean r = true;
    private boolean u = false;
    boolean a = false;
    private ArrayList i = new ArrayList();
    private com.censivn.C3DEngine.b.v f = new q(this);

    public p(com.tsf.shell.workspace3D.k.c.b.c cVar) {
        this.c = cVar;
        this.e = this.c.i();
        if (g == null) {
            ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
            g = new com.censivn.C3DEngine.e.b(64.0f, 64.0f, 1, 1, true);
            Bitmap bitmap = themeShellDescription.getBitmap(ThemeShellDescription.PUBLIC_BUTTON_RETURN);
            h = com.censivn.C3DEngine.a.f().a(bitmap, true);
            bitmap.recycle();
            g.z().c(h);
        }
        this.s = new r(this);
    }

    public final void a() {
        this.f.H();
        this.i.clear();
        this.i = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    static /* synthetic */ void h(p pVar) {
        pVar.f.Q();
        pVar.p = false;
        pVar.q = false;
        pVar.r = true;
        pVar.i.clear();
    }

    static /* synthetic */ void i(p pVar) {
        if (pVar.e.be().container == -4) {
            Number3d.TEMPNUMBER3D.reset();
            pVar.e.c(Number3d.TEMPNUMBER3D);
            pVar.v = bf.s().a((com.censivn.C3DEngine.b.r) pVar.e);
            pVar.e.L().setAllFrom(Number3d.TEMPNUMBER3D);
        }
        pVar.t = pVar.e.M().z;
        if (pVar.t != 0.0f) {
            pVar.u = true;
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.e(0.0f);
            uVar.j(1.0f);
            uVar.k(1.0f);
            com.censivn.C3DEngine.g.s.a(pVar.e);
            com.censivn.C3DEngine.g.s.a(pVar.e, 250, uVar);
        } else {
            if (pVar.e.N().x != 1.0f) {
                com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
                uVar2.j(1.0f);
                uVar2.k(1.0f);
                com.censivn.C3DEngine.g.s.a(pVar.e);
                com.censivn.C3DEngine.g.s.a(pVar.e, 250, uVar2);
            }
            pVar.u = false;
        }
        com.tsf.shell.workspace3D.k.c.b.af afVar = com.tsf.shell.workspace3D.k.c.b.c.e;
        com.tsf.shell.workspace3D.k.c.b.af.b(pVar.c);
        com.tsf.shell.i.a().a("LineViewer");
        pVar.c.c(false);
        pVar.e.f(true);
        pVar.e.Q();
        com.censivn.C3DEngine.b.v a = bf.m().a(pVar.s);
        bf.m();
        bf.n().a((Runnable) null);
        a.d(pVar.e);
    }

    public final void a(boolean z) {
        s sVar = new s(this);
        sVar.a(0);
        sVar.e(-540.0f);
        g.e(false);
        if (z) {
            com.censivn.C3DEngine.g.s.a(g, 250, sVar);
        } else {
            com.censivn.C3DEngine.g.s.a(g, 0, sVar);
        }
        Iterator it = this.d.aD().iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.workspace3D.k.ab) ((com.censivn.C3DEngine.b.r) it.next())).e(false);
        }
        if (this.v != null) {
            this.t = this.v.M().z;
        }
        if (!z) {
            this.e.M().z = this.t;
        }
        this.c.a(new t(this, z), z);
        this.a = false;
    }

    public final void b() {
        a(true);
    }

    static /* synthetic */ void a(p pVar) {
        if (pVar.q) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= pVar.j) {
                return;
            }
            com.censivn.C3DEngine.b.r d = pVar.d.d(i2);
            float[] fArr = (float[]) pVar.i.get((int) ((((i2 / pVar.j) * 0.9f) + 0.1f) * pVar.k));
            d.L().x = (float) (r2.x + ((fArr[0] - d.L().x) * 0.2d));
            d.L().y = (float) (r2.y + ((fArr[1] - d.L().y) * 0.2d));
            d.M().z = (float) (r2.z + ((0.0f - d.M().z) * 0.5d));
            if (d.N().x < 1.0f) {
                d.N().x = (float) (r2.x + ((1.0f - d.N().x) * 0.1d));
                d.N().y = d.N().x;
                if (1.0f - d.N().x < 0.05d) {
                    d.N().x = 1.0f;
                    d.N().y = 1.0f;
                }
            }
            if (pVar.p && i2 == 0 && com.censivn.C3DEngine.h.a.b(d.L().x, d.L().y, fArr[0], fArr[1]) < 5.0f) {
                pVar.q = true;
                pVar.f.a_(false);
                Number3d c = pVar.e.c(new Number3d(136.0f, 0.0f, 0.0f));
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                g.b(0.0f);
                g.M().z = -180.0f;
                if (c.x < com.censivn.C3DEngine.a.l / 2) {
                    g.L().x = 65.0f;
                } else {
                    g.L().x = -65.0f;
                }
                uVar.a(255);
                uVar.e(-360.0f);
                com.censivn.C3DEngine.g.s.a(g, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
                g.a((com.censivn.C3DEngine.b.l) new v(pVar, g));
                g.a(-64.0f, -64.0f, 0.0f, 64.0f, 64.0f);
                pVar.e.d(g);
                g.L().y = -30.0f;
                Number3d.TEMPNUMBER3D.reset();
                g.c(Number3d.TEMPNUMBER3D);
                if (Number3d.TEMPNUMBER3D.y + g.am() < com.censivn.C3DEngine.a.h) {
                    g.L().y += com.censivn.C3DEngine.a.h - (Number3d.TEMPNUMBER3D.y + g.am());
                }
            }
            i = i2 + 1;
        }
    }

    public final boolean c() {
        return this.a;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.r) {
            this.a = false;
            this.r = false;
            com.censivn.C3DEngine.a.a().b(new w(this, motionEvent));
        }
        if (this.k <= b && this.a) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int b2 = (int) (com.censivn.C3DEngine.h.a.b(x, y, this.n, this.o) / 5.0f);
            if (b2 > 0) {
                float f = (x - this.n) / b2;
                float f2 = (y - this.o) / b2;
                for (int i = 0; i < b2; i++) {
                    this.i.add(new float[]{(((i + 1) * f) + this.n) - this.l, this.m - (((i + 1) * f2) + this.o)});
                    this.k++;
                }
                this.n = x;
                this.o = y;
            }
        }
    }

    public final void d() {
        this.r = true;
        this.p = true;
    }

    public static void e() {
    }
}
