package com.tsf.shell.workspace3D;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j {
    public static int a;
    public static int b;
    public static int c = 0;
    public static int d = 96;
    private static TextureElement h;
    private static ThemeShellDescription i;
    public com.censivn.C3DEngine.b.v e;
    public com.tsf.shell.workspace3D.g.b.l f;
    public com.censivn.C3DEngine.b.v g;
    private int j;
    private TextureElement l;
    private com.censivn.C3DEngine.b.v m;
    private com.censivn.C3DEngine.e.b o;
    private com.censivn.C3DEngine.e.b p;
    private com.tsf.shell.workspace3D.k.b.k q;
    private int s;
    private int t;
    private float x;
    private boolean k = false;
    private int r = -1;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private j n = this;
    private int y = com.tsf.shell.bd.c();

    public j(com.censivn.C3DEngine.b.v vVar, com.censivn.C3DEngine.b.v vVar2, int i2) {
        this.e = vVar;
        this.m = vVar2;
        this.s = i2;
        if (i == null) {
            i = ThemeManager.mix.menu.getTheme();
        }
        if (c == 0) {
            c = (int) ((i.menuWidthOffset + 123) * com.censivn.C3DEngine.a.a);
        }
    }

    public final void a(int i2) {
        this.y = i2;
        j();
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.p.h(com.censivn.C3DEngine.a.m);
        this.f.c();
    }

    public final void b(int i2) {
        this.j = i2;
    }

    public final int c() {
        return this.j;
    }

    public final void a(com.tsf.shell.workspace3D.g.b.l lVar) {
        this.f = lVar;
        a = (int) this.e.L().x;
        Bitmap bitmap = ThemeManager.mix.menu.getTheme().getBitmap(this.s);
        this.l = com.censivn.C3DEngine.a.f().a(bitmap, true);
        bitmap.recycle();
        this.o = new com.censivn.C3DEngine.e.b(64.0f, 128.0f, 1, 1);
        this.o.a(this);
        this.o.z().c(this.l);
        this.o.a((com.censivn.C3DEngine.b.l) new n(this, this.o));
        this.m.d(this.o);
        this.g = new com.censivn.C3DEngine.b.v();
        b();
        this.p = new com.censivn.C3DEngine.e.b(307.2f * com.censivn.C3DEngine.a.b, com.censivn.C3DEngine.a.m, 1, 1, false);
        if (h == null) {
            Bitmap bitmap2 = i.getBitmap(300);
            h = com.censivn.C3DEngine.a.f().a(bitmap2, true);
            bitmap2.recycle();
        }
        this.p.z().c(h);
        this.g.d(this.p);
        this.g.d(this.f.b());
        this.e.d(this.g);
        j();
    }

    public final void a(com.tsf.shell.workspace3D.k.b.k kVar) {
        this.q = kVar;
    }

    public final void c(int i2) {
        if (this.r != i2) {
            this.r = i2;
            this.t = 0 - (com.tsf.shell.workspace3D.k.b.k.b * i2);
        }
    }

    public final void a(boolean z) {
        if (z) {
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.h(this.t);
            uVar.a(255);
            com.censivn.C3DEngine.g.s.a(this.o);
            com.censivn.C3DEngine.g.s.a(this.o, 250, uVar);
            return;
        }
        this.o.L().y = this.t;
    }

    public final com.censivn.C3DEngine.b.r d() {
        return this.o;
    }

    public final int e() {
        return this.r;
    }

    public final void f() {
        if (!this.v && !this.w) {
            this.v = true;
            this.u = false;
            this.o.a((Boolean) true);
            k kVar = new k(this);
            kVar.h(this.t);
            kVar.a(255);
            com.censivn.C3DEngine.g.s.a(this.o);
            com.censivn.C3DEngine.g.s.a(this.o, 250, kVar);
        }
    }

    public final void a(j jVar, boolean z) {
        if (!this.u && !this.w) {
            this.v = false;
            this.u = true;
            if (jVar != this) {
                if (z) {
                    l lVar = new l(this);
                    lVar.h(jVar.t);
                    lVar.a(150);
                    com.censivn.C3DEngine.g.s.a(this.o);
                    com.censivn.C3DEngine.g.s.a(this.o, 250, lVar);
                    return;
                }
                this.o.a((Boolean) false);
                this.u = false;
                this.o.b(150.0f);
                this.o.L().y = jVar.t;
                return;
            }
            if (z) {
                m mVar = new m(this);
                mVar.h(jVar.t);
                com.censivn.C3DEngine.g.s.a(this.o);
                com.censivn.C3DEngine.g.s.a(this.o, 250, mVar);
                return;
            }
            this.u = false;
            this.o.L().y = jVar.t;
        }
    }

    public void a() {
        this.g.a((Boolean) true);
    }

    public void b() {
        this.g.a((Boolean) false);
    }

    public final void b(boolean z) {
        this.k = z;
        if (z) {
            if (this.y == 0) {
                this.o.F().setU(0, 0.984375f);
                this.o.F().setU(1, 0.5f);
                this.o.F().setU(2, 0.984375f);
                this.o.F().setU(3, 0.5f);
            } else {
                this.o.F().setU(1, 0.984375f);
                this.o.F().setU(0, 0.5f);
                this.o.F().setU(3, 0.984375f);
                this.o.F().setU(2, 0.5f);
            }
            this.o.ah();
            return;
        }
        if (this.y == 0) {
            this.o.F().setU(0, 0.4921875f);
            this.o.F().setU(1, 0.0f);
            this.o.F().setU(2, 0.4921875f);
            this.o.F().setU(3, 0.0f);
        } else {
            this.o.F().setU(1, 0.4921875f);
            this.o.F().setU(0, 0.0f);
            this.o.F().setU(3, 0.4921875f);
            this.o.F().setU(2, 0.0f);
        }
        this.o.ah();
    }

    public final void g() {
        this.o.ax();
    }

    public static void h() {
        i = ThemeManager.mix.menu.getTheme();
        if (h != null) {
            Bitmap bitmap = i.getBitmap(300);
            com.censivn.C3DEngine.a.f();
            com.censivn.C3DEngine.b.ad.c(h, bitmap);
            bitmap.recycle();
        }
    }

    public final void i() {
        Bitmap bitmap = ThemeManager.mix.menu.getTheme().getBitmap(this.s);
        com.censivn.C3DEngine.a.f();
        com.censivn.C3DEngine.b.ad.c(this.l, bitmap);
        bitmap.recycle();
        j();
    }

    private void j() {
        com.censivn.C3DEngine.b.v b2 = this.f.b();
        a = (int) this.e.L().x;
        if (this.y == 0) {
            b = a + c;
            this.o.L().x = (this.o.n_() / 2.0f) - (this.o.n_() % 2.0f);
            this.o.E().spX(0, 31.0f);
            this.o.E().spX(2, 31.0f);
            this.o.E().spX(1, -32.0f);
            this.o.E().spX(3, -32.0f);
            this.p.L().x = i.menuBgOffsetX * com.censivn.C3DEngine.a.a;
            this.g.L().x = ((this.o.L().x - (this.p.n_() / 2.0f)) - (this.o.n_() / 2.0f)) + 1.0f;
            b2.L().x = ((c / 2) - (c - com.tsf.shell.workspace3D.k.b.k.a)) + i.menuItemsOffsetX;
            this.p.E().spX(1, -128.0f);
            this.p.E().spX(3, -128.0f);
            this.p.E().spX(0, 127.0f);
            this.p.E().spX(2, 127.0f);
            this.p.F().set(0, 0.99609375f, 1.0f);
            this.p.F().set(1, 0.0f, 1.0f);
            this.p.F().set(2, 0.99609375f, 0.0f);
            this.p.F().set(3, 0.0f, 0.0f);
            this.f.a().a_(com.censivn.C3DEngine.a.o - ((int) (60.0f * com.censivn.C3DEngine.a.b)), (-com.censivn.C3DEngine.a.o) + ((int) (60.0f * com.censivn.C3DEngine.a.b)), -com.censivn.C3DEngine.a.n, (-com.censivn.C3DEngine.a.n) + ((int) (240.0f * com.censivn.C3DEngine.a.b)));
            this.o.a(-64.0f, -80.0f, 0.0f, 40.0f, 80.0f);
            this.o.e(54.0f * com.censivn.C3DEngine.a.b);
        } else {
            b = a - c;
            this.o.L().x = ((-this.o.n_()) / 2.0f) + (this.o.n_() % 2.0f);
            this.o.E().spX(1, -31.0f);
            this.o.E().spX(3, -31.0f);
            this.o.E().spX(0, 32.0f);
            this.o.E().spX(2, 32.0f);
            this.p.L().x = (-i.menuBgOffsetX) * com.censivn.C3DEngine.a.a;
            this.g.L().x = ((this.o.L().x + (this.p.n_() / 2.0f)) + (this.o.n_() / 2.0f)) - 1.0f;
            b2.L().x = (-(c / 2)) + (c - com.tsf.shell.workspace3D.k.b.k.a);
            this.p.E().spX(1, -127.0f);
            this.p.E().spX(3, -127.0f);
            this.p.E().spX(0, 128.0f);
            this.p.E().spX(2, 128.0f);
            this.p.F().set(1, 0.99609375f, 1.0f);
            this.p.F().set(0, 0.0f, 1.0f);
            this.p.F().set(3, 0.99609375f, 0.0f);
            this.p.F().set(2, 0.0f, 0.0f);
            this.f.a().a_(com.censivn.C3DEngine.a.o - ((int) (60.0f * com.censivn.C3DEngine.a.b)), (-com.censivn.C3DEngine.a.o) + ((int) (60.0f * com.censivn.C3DEngine.a.b)), com.censivn.C3DEngine.a.n - ((int) (240.0f * com.censivn.C3DEngine.a.b)), com.censivn.C3DEngine.a.n);
            this.o.a(-40.0f, -80.0f, 0.0f, 64.0f, 80.0f);
            this.o.c((-54.0f) * com.censivn.C3DEngine.a.b);
        }
        this.o.ag();
        this.p.ag();
        this.p.ah();
        b(this.k);
    }

    static /* synthetic */ void a(j jVar, float f) {
        j c2;
        jVar.o.L().y = f;
        int i2 = (com.tsf.shell.workspace3D.k.b.k.b * (com.tsf.shell.workspace3D.k.b.k.f - 1)) / com.tsf.shell.workspace3D.k.b.k.f;
        int i3 = (-com.tsf.shell.workspace3D.k.b.k.b) * (com.tsf.shell.workspace3D.k.b.k.f - 1);
        if (f <= 0.0f && f >= i3) {
            int i4 = (int) ((-f) / i2);
            if (i4 == jVar.r || (c2 = jVar.q.c(i4)) == null) {
                return;
            }
            c2.c(jVar.r);
            c2.a(true);
            jVar.c(i4);
            jVar.q.p();
            return;
        }
        if (jVar.o.L().y > 0.0f) {
            float f2 = jVar.o.L().y;
            jVar.o.L().y = 0.0f;
            jVar.q.b(jVar.m.L().y + f2);
            jVar.x -= f2;
            return;
        }
        float f3 = i3 - jVar.o.L().y;
        jVar.o.L().y = i3;
        jVar.q.b(jVar.m.L().y - f3);
        jVar.x -= -f3;
    }

    public void a(ArrayList arrayList) {
        this.f.a(arrayList, true);
    }

    public void a(ArrayList arrayList, int i2) {
        this.f.a(arrayList, i2, true);
    }

    public int a(com.tsf.shell.workspace3D.k.j jVar) {
        return this.f.a(jVar);
    }
}
