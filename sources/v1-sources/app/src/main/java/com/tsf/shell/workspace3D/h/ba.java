package com.tsf.shell.workspace3D.h;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class ba implements com.tsf.shell.bj {
    private com.censivn.C3DEngine.g.u A;
    private com.censivn.C3DEngine.g.b.b B;
    private float C;
    private Runnable D;
    private com.censivn.C3DEngine.b.l E;
    private TextureElement a;
    private TextureElement b;
    private com.censivn.C3DEngine.e.b c;
    private com.censivn.C3DEngine.b.v d;
    private l e;
    private com.censivn.C3DEngine.g.u f;
    private com.censivn.C3DEngine.g.u g;
    private com.censivn.C3DEngine.c.a j;
    private com.censivn.C3DEngine.c.b.WavePhysicsSystem k;
    private float[] p;
    private float[] q;
    private int r;
    private com.censivn.C3DEngine.g.b.b s;
    private com.censivn.C3DEngine.g.u t;
    private com.censivn.C3DEngine.g.u z;
    private boolean h = false;
    private boolean i = false;
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = 0.0f;
    private float o = 0.0f;
    private boolean u = true;
    private float v = 0.0f;
    private float w = 0.0f;
    private boolean x = false;
    private boolean y = false;

    public ba() {
        com.tsf.shell.bd.a(this);
        this.D = new bb(this);
        this.B = new com.censivn.C3DEngine.g.b.b();
        this.z = new bc(this);
        this.A = new bd(this);
        this.A.a(100);
    }

    public final void a() {
        ThemeShellDescription theme = ThemeManager.mix.page.getTheme();
        Bitmap bitmap = theme.getBitmap(509);
        this.b = com.censivn.C3DEngine.a.f().a(this.b, bitmap);
        bitmap.recycle();
        Bitmap bitmap2 = theme.getBitmap(510);
        this.a = com.censivn.C3DEngine.a.f().a(this.a, bitmap2);
        bitmap2.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        com.censivn.C3DEngine.a.a().f(this.D);
        this.C = this.c.I();
        com.censivn.C3DEngine.g.s.a(this.B);
        com.censivn.C3DEngine.g.s.a(this.B, ThemeShellDescription.PAGE_PREVIEW_SELECT, this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.censivn.C3DEngine.a.a().b(this.D, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.v > com.censivn.C3DEngine.a.f - com.tsf.shell.workspace3D.e.p.a) {
            this.v = com.censivn.C3DEngine.a.f - com.tsf.shell.workspace3D.e.p.a;
        } else if (this.v < com.censivn.C3DEngine.a.e + com.tsf.shell.workspace3D.e.p.a) {
            this.v = com.censivn.C3DEngine.a.e + com.tsf.shell.workspace3D.e.p.a;
        }
        if (this.w > com.censivn.C3DEngine.a.g - com.tsf.shell.workspace3D.e.p.a) {
            this.w = com.censivn.C3DEngine.a.g - com.tsf.shell.workspace3D.e.p.a;
        } else if (this.w < com.censivn.C3DEngine.a.h + com.tsf.shell.workspace3D.e.p.a) {
            this.w = com.censivn.C3DEngine.a.h + com.tsf.shell.workspace3D.e.p.a;
        }
        float abs = Math.abs(this.v - com.censivn.C3DEngine.a.e);
        float abs2 = Math.abs(com.censivn.C3DEngine.a.f - this.v);
        float abs3 = Math.abs(com.censivn.C3DEngine.a.g - this.w);
        float abs4 = Math.abs(this.w - com.censivn.C3DEngine.a.h);
        this.k.c();
        if (abs <= abs2 && abs <= abs3 && abs <= abs4) {
            this.v = com.censivn.C3DEngine.a.e + com.tsf.shell.workspace3D.e.p.a;
            this.k.d();
            this.n = 2.1474836E9f;
            this.o = ((com.censivn.C3DEngine.a.m / 3) * 6) / com.censivn.C3DEngine.a.m;
            return;
        }
        if (abs2 <= abs && abs2 <= abs3 && abs2 <= abs4) {
            this.v = com.censivn.C3DEngine.a.f - com.tsf.shell.workspace3D.e.p.a;
            this.k.e();
            this.n = 2.1474836E9f;
            this.o = ((com.censivn.C3DEngine.a.m / 3) * 6) / com.censivn.C3DEngine.a.m;
            return;
        }
        if (abs3 <= abs && abs3 <= abs2 && abs3 <= abs4) {
            this.w = com.censivn.C3DEngine.a.g - com.tsf.shell.workspace3D.e.p.a;
            this.k.g();
            this.n = ((com.censivn.C3DEngine.a.l / 3) * 6) / com.censivn.C3DEngine.a.l;
            this.o = 2.1474836E9f;
            return;
        }
        this.w = com.censivn.C3DEngine.a.h + com.tsf.shell.workspace3D.e.p.a;
        this.k.f();
        this.n = ((com.censivn.C3DEngine.a.l / 3) * 6) / com.censivn.C3DEngine.a.l;
        this.o = 2.1474836E9f;
    }

    public final void a(com.censivn.C3DEngine.b.v vVar) {
        this.d = vVar;
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(510);
        this.c = new be(this, bitmap.getWidth() * com.censivn.C3DEngine.a.b, bitmap.getHeight() * com.censivn.C3DEngine.a.b);
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(bitmap.getWidth() * com.censivn.C3DEngine.a.b, bitmap.getHeight() * com.censivn.C3DEngine.a.b, 5, 5, false);
        this.r = bVar.E().size() * 3;
        FloatBuffer buffer = bVar.E().buffer();
        buffer.position(0);
        this.p = new float[this.r];
        this.q = new float[this.r];
        for (int i = 0; i < this.r; i++) {
            this.p[i] = buffer.get();
        }
        this.c.c((Boolean) false);
        this.s = new com.censivn.C3DEngine.g.b.b();
        this.t = new bf(this);
        this.t.a(com.censivn.C3DEngine.g.a.g);
        this.j = new com.censivn.C3DEngine.c.a(this.c);
        this.k = new com.censivn.C3DEngine.c.b.WavePhysicsSystem(8.0f, 0.0f);
        this.j.a(this.k);
        this.e = com.tsf.shell.workspace3D.bf.j();
        this.f = new bg(this);
        this.f.j(1.0f);
        this.f.k(1.0f);
        this.f.a(com.censivn.C3DEngine.g.a.g);
        this.g = new bh(this);
        this.g.j(0.0f);
        this.g.k(0.0f);
        l();
        this.c.L().x = this.v;
        this.c.L().y = this.w;
        if (com.tsf.shell.a.t.I()) {
            a(false);
            j();
        }
    }

    private void l() {
        float[] e = com.censivn.C3DEngine.a.q ? com.tsf.shell.a.t.e(com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.g) : com.tsf.shell.a.t.f(com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.g);
        this.v = e[0];
        this.w = e[1];
        k();
    }

    static /* synthetic */ void w(ba baVar) {
        FloatBuffer buffer = baVar.c.E().buffer();
        buffer.position(0);
        for (int i = 0; i < baVar.r; i++) {
            baVar.q[i] = buffer.get();
        }
        com.censivn.C3DEngine.g.s.a(baVar.s);
        com.censivn.C3DEngine.g.s.a(baVar.s, ThemeShellDescription.PICKER_MENU, baVar.t);
    }

    public final boolean c() {
        return this.i;
    }

    public final void d() {
        a((Runnable) null);
    }

    private void a(Runnable runnable) {
        if (this.h) {
            this.h = false;
            this.c.e(false);
            com.censivn.C3DEngine.g.s.a(this.c);
            this.g.a(runnable);
            com.censivn.C3DEngine.g.s.a(this.c, 250, this.g);
        }
    }

    public final void e() {
        if (this.i && !this.h) {
            this.c.Q();
            this.d.d(this.c);
            this.h = true;
            com.censivn.C3DEngine.g.s.a(this.c);
            com.censivn.C3DEngine.g.s.a(this.c, ThemeShellDescription.PAGE_PREVIEW_SELECT, this.f);
        }
    }

    public final void f() {
        this.c.e(false);
        this.c.z().d();
        this.c.z().c(this.a);
    }

    public final void g() {
        this.c.e(true);
        this.c.z().d();
        this.c.z().c(this.b);
    }

    public final void a(boolean z) {
        if (!this.i) {
            this.i = true;
            if (z) {
                com.tsf.shell.a.t.i(true);
                i();
                j();
            }
            m();
            ThemeShellDescription theme = ThemeManager.mix.page.getTheme();
            Bitmap bitmap = theme.getBitmap(509);
            this.b = com.censivn.C3DEngine.a.f().a(bitmap, false);
            bitmap.recycle();
            Bitmap bitmap2 = theme.getBitmap(510);
            this.a = com.censivn.C3DEngine.a.f().a(bitmap2, false);
            bitmap2.recycle();
            this.c.a_(this.a.width * com.censivn.C3DEngine.a.b);
            this.c.h(this.a.height * com.censivn.C3DEngine.a.b);
            this.c.z().d();
            this.c.z().c(this.b);
            this.c.a(2.0f, 2.0f, 2.0f);
            this.c.N().setAll(0.0f, 0.0f, 1.0f);
            this.E = new bi(this, this.c);
            this.c.Q();
            this.c.a(this.E);
            e();
        }
    }

    public final void h() {
        if (this.i) {
            this.i = false;
            a(new bk(this));
            com.tsf.shell.a.t.i(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.a != null) {
            com.censivn.C3DEngine.a.f().a(this.a);
            this.a = null;
        }
        if (this.b != null) {
            com.censivn.C3DEngine.a.f().a(this.b);
            this.b = null;
        }
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        l();
        k();
        this.c.L().x = this.v;
        this.c.L().y = this.w;
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
