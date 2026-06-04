package com.tsf.shell.workspace3D.j.b;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.aq;
import com.tsf.shell.at;
import com.tsf.shell.bd;
import com.tsf.shell.bj;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements at, bj {
    private static Paint t;
    private com.censivn.C3DEngine.b.v a;
    private com.censivn.C3DEngine.b.v b;
    private com.censivn.C3DEngine.e.b.a c;
    private com.censivn.C3DEngine.e.b d;
    private com.censivn.C3DEngine.e.b e;
    private TextureElement f;
    private TextureElement g;
    private TextureElement h;
    private TextureElement i;
    private com.censivn.C3DEngine.e.b j;
    private TextureElement k;
    private com.censivn.C3DEngine.e.b l;
    private float m;
    private float n;
    private ArrayList o;
    private com.censivn.C3DEngine.e.c p;
    private com.censivn.C3DEngine.e.c q;
    private boolean r = false;
    private boolean s = true;
    private boolean u = false;

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            a((Runnable) null);
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    static /* synthetic */ void k(d dVar) {
        if (dVar.h != null) {
            dVar.c.z().d();
            com.censivn.C3DEngine.a.f().a(dVar.h);
            dVar.h = null;
        }
        if (dVar.g != null) {
            dVar.d.z().d();
            com.censivn.C3DEngine.a.f().a(dVar.g);
            dVar.g = null;
        }
        if (dVar.f != null) {
            dVar.e.z().d();
            com.censivn.C3DEngine.a.f().a(dVar.f);
            dVar.f = null;
        }
        if (dVar.i != null) {
            dVar.j.z().d();
            com.censivn.C3DEngine.a.f().a(dVar.i);
            dVar.i = null;
        }
        if (dVar.k != null) {
            dVar.j.z().d();
            com.censivn.C3DEngine.a.f().a(dVar.k);
            dVar.k = null;
        }
    }

    public final void a() {
        if (!this.u && bf.j().x()) {
            ThemeManager.getInstance().initSurplus();
            if (this.o == null) {
                this.o = new ArrayList();
                this.a = new e(this);
                this.c = new com.censivn.C3DEngine.e.b.a(420.0f * com.censivn.C3DEngine.a.b, 300.0f * com.censivn.C3DEngine.a.b, new com.censivn.C3DEngine.e.b.b(98.0f, 98.0f, 98.0f, 98.0f, 196.0f, 196.0f));
                this.d = new com.censivn.C3DEngine.e.b(250.0f * com.censivn.C3DEngine.a.b, 60.0f * com.censivn.C3DEngine.a.b, (byte) 0);
                this.d.L().y = 92.0f * com.censivn.C3DEngine.a.b;
                this.e = new com.censivn.C3DEngine.e.b(64.0f * com.censivn.C3DEngine.a.b, 64.0f * com.censivn.C3DEngine.a.b, (byte) 0);
                this.e.L().y = 110.0f * com.censivn.C3DEngine.a.b;
                this.e.L().x = 170.0f * com.censivn.C3DEngine.a.b;
                this.e.a(1.5f, 1.5f, 1.0f);
                z zVar = new z(this, this.c);
                zVar.c = true;
                this.e.a((com.censivn.C3DEngine.b.l) zVar);
                this.q = new com.censivn.C3DEngine.e.c();
                this.j = new com.censivn.C3DEngine.e.b(122.0f * com.censivn.C3DEngine.a.b, 55.0f * com.censivn.C3DEngine.a.b, (byte) 0);
                z zVar2 = new z(this, this.c);
                zVar2.a = new o(this);
                zVar2.c = false;
                this.j.a(1.5f, 2.0f, 1.0f);
                this.q.c(this.j);
                this.q.a((com.censivn.C3DEngine.b.l) zVar2);
                this.p = new com.censivn.C3DEngine.e.c();
                this.l = new com.censivn.C3DEngine.e.b(64.0f * com.censivn.C3DEngine.a.b, 121.0f * com.censivn.C3DEngine.a.b, (byte) 0);
                z zVar3 = new z(this, this.c);
                zVar3.a = new p(this);
                zVar3.c = false;
                this.l.a(1.5f, 1.5f, 1.0f);
                this.p.c(this.l);
                this.p.a((com.censivn.C3DEngine.b.l) zVar3);
                PositionNumber3d L = this.l.L();
                PositionNumber3d L2 = this.p.L();
                float f = (-216.0f) * com.censivn.C3DEngine.a.b;
                L2.x = f;
                L.x = f;
                PositionNumber3d L3 = this.l.L();
                PositionNumber3d L4 = this.p.L();
                float f2 = 30.0f * com.censivn.C3DEngine.a.b;
                L4.y = f2;
                L3.y = f2;
                this.c.b((-this.c.n_()) / 2.0f, (-this.c.o_()) / 2.0f, 0.0f, this.c.n_() / 2.0f, this.c.o_() / 2.0f);
                this.a.d(this.l);
                this.a.d(this.j);
                this.a.d(this.c);
                this.b = new com.censivn.C3DEngine.b.v();
                this.a.d(this.b);
                this.a.d(this.d);
                this.a.d(this.e);
                this.a.d(this.q);
                this.a.d(this.p);
                this.c.a((com.censivn.C3DEngine.b.l) new z(this, this.c));
            }
            f();
            a(false);
            e();
            aq.a(this);
            bd.a(this);
            this.u = true;
            this.a.e(true);
            PositionNumber3d L5 = this.a.L();
            this.m = 0.0f;
            L5.x = 0.0f;
            PositionNumber3d L6 = this.a.L();
            float f3 = (-(this.c.k() - this.c.l())) / 2.0f;
            this.n = f3;
            L6.y = f3;
            if (this.h == null) {
                Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.themes_mix_bg);
                this.h = com.censivn.C3DEngine.a.f().a(a, false);
                a.recycle();
                this.c.z().d();
                this.c.z().c(this.h);
            }
            if (this.g == null) {
                if (t == null) {
                    Paint paint = new Paint();
                    t = paint;
                    paint.setAntiAlias(true);
                    t.setTextAlign(Paint.Align.LEFT);
                    t.setTextSize(40.0f);
                    t.setColor(-6710887);
                }
                Bitmap a2 = com.tsf.shell.setting.a.v.a(com.censivn.C3DEngine.h.a.c(R.string.theme_mix_title), 250, 60, t, true, true, -3);
                this.g = com.censivn.C3DEngine.a.f().a(a2, false);
                a2.recycle();
                this.d.z().d();
                this.d.z().c(this.g);
            }
            if (this.f == null) {
                this.f = com.censivn.C3DEngine.h.a.a(R.drawable.themes_mix_close_button);
                this.e.z().d();
                this.e.z().c(this.f);
            }
            if (this.k == null) {
                this.k = com.censivn.C3DEngine.h.a.a(R.drawable.themes_mix_list_button);
                this.l.z().d();
                this.l.z().c(this.k);
            }
            bf.m().a(this.a);
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.a(255);
            com.censivn.C3DEngine.g.s.a(this.a);
            com.censivn.C3DEngine.g.s.a(this.a, 250, uVar);
        }
    }

    private int c() {
        Iterator it = this.o.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((a) it.next()).i()) {
                i++;
            }
        }
        return i;
    }

    private float d() {
        return ((c() * 117) * com.censivn.C3DEngine.a.b) - (30.0f * com.censivn.C3DEngine.a.b);
    }

    private void a(boolean z) {
        if (this.i != null) {
            this.j.z().d();
            com.censivn.C3DEngine.a.f().a(this.i);
            this.i = null;
        }
        if (this.s) {
            if (this.i == null) {
                this.i = com.censivn.C3DEngine.h.a.a(R.drawable.themes_mix_more_button_up);
                this.j.z().d();
                this.j.z().c(this.i);
            }
        } else if (this.i == null) {
            this.i = com.censivn.C3DEngine.h.a.a(R.drawable.themes_mix_more_button_down);
            this.j.z().d();
            this.j.z().c(this.i);
        }
        if (z) {
            q qVar = new q(this, this.c.l(), d());
            qVar.a(com.censivn.C3DEngine.g.a.a);
            com.censivn.C3DEngine.g.s.a(this.c);
            com.censivn.C3DEngine.g.s.a(this.c, ThemeShellDescription.PAGE_PREVIEW_SELECT, qVar);
        } else {
            this.c.k((0.0f + ((c() * 117) * com.censivn.C3DEngine.a.b)) - (30.0f * com.censivn.C3DEngine.a.b));
            this.c.ar();
            PositionNumber3d L = this.j.L();
            PositionNumber3d L2 = this.q.L();
            float f = -this.c.l();
            L2.y = f;
            L.y = f;
        }
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.o.get(i);
            if (i == 0) {
                if (this.s) {
                    aVar.k();
                } else {
                    aVar.l();
                }
            } else if (i == size - 1) {
                aVar.l();
            }
        }
    }

    public final void a(Runnable runnable) {
        if (this.u) {
            this.u = false;
            aq.b(this);
            bd.b(this);
            this.a.a_(false);
            this.a.e(false);
            r rVar = new r(this, runnable);
            rVar.a(0);
            com.censivn.C3DEngine.g.s.a(this.a);
            com.censivn.C3DEngine.g.s.a(this.a, 250, rVar);
        }
    }

    private void e() {
        int i = 0;
        Iterator it = this.o.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                a aVar = (a) it.next();
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                uVar.a(255);
                uVar.b(i2 * 100);
                com.censivn.C3DEngine.g.s.a(aVar);
                com.censivn.C3DEngine.g.s.a(aVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    private void f() {
        int i = 0;
        if (!this.r) {
            this.r = true;
            com.censivn.C3DEngine.b.r aVar = new a(0);
            z zVar = new z(this, this.c);
            zVar.a = new s(this);
            zVar.c = false;
            aVar.a((com.censivn.C3DEngine.b.l) zVar);
            this.b.d(aVar);
            this.o.add(aVar);
            com.censivn.C3DEngine.b.r aVar2 = new a(2);
            z zVar2 = new z(this, this.c);
            zVar2.a = new t(this);
            zVar2.c = false;
            aVar2.a((com.censivn.C3DEngine.b.l) zVar2);
            this.b.d(aVar2);
            this.o.add(aVar2);
            com.censivn.C3DEngine.b.r aVar3 = new a(3);
            z zVar3 = new z(this, this.c);
            zVar3.a = new w(this);
            zVar3.c = false;
            aVar3.a((com.censivn.C3DEngine.b.l) zVar3);
            this.b.d(aVar3);
            this.o.add(aVar3);
            com.censivn.C3DEngine.b.r aVar4 = new a(1);
            z zVar4 = new z(this, this.c);
            zVar4.a = new f(this);
            zVar4.c = false;
            aVar4.a((com.censivn.C3DEngine.b.l) zVar4);
            this.b.d(aVar4);
            this.o.add(aVar4);
            com.censivn.C3DEngine.b.r aVar5 = new a(4);
            z zVar5 = new z(this, this.c);
            zVar5.a = new i(this);
            zVar5.c = false;
            aVar5.a((com.censivn.C3DEngine.b.l) zVar5);
            this.b.d(aVar5);
            this.o.add(aVar5);
            com.censivn.C3DEngine.b.r aVar6 = new a(5);
            z zVar6 = new z(this, this.c);
            zVar6.a = new l(this);
            zVar6.c = false;
            aVar6.a((com.censivn.C3DEngine.b.l) zVar6);
            this.b.d(aVar6);
            this.o.add(aVar6);
            Iterator it = this.o.iterator();
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    a aVar7 = (a) it.next();
                    aVar7.L().y = 0.0f - ((i2 * 115) * com.censivn.C3DEngine.a.b);
                    aVar7.m();
                    i = i2 + 1;
                } else {
                    aVar6.b(0.0f);
                    return;
                }
            }
        } else {
            Iterator it2 = this.o.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).m();
            }
        }
    }

    static /* synthetic */ void f(d dVar) {
        dVar.s = true;
        int size = dVar.o.size();
        for (int i = 1; i < size; i++) {
            ((a) dVar.o.get(i)).a(i - 1);
        }
        dVar.a(true);
        dVar.a(dVar.c.n(), dVar.c.m(), dVar.c.k(), dVar.d());
    }

    static /* synthetic */ void e(d dVar) {
        dVar.s = false;
        int size = dVar.o.size();
        for (int i = 1; i < size; i++) {
            ((a) dVar.o.get(i)).j();
        }
        dVar.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        a(this.c.n(), this.c.m(), this.c.k(), this.c.l());
    }

    private void a(float f, float f2, float f3, float f4) {
        float f5 = (25.0f * com.censivn.C3DEngine.a.b) + f4;
        float f6 = (33.0f * com.censivn.C3DEngine.a.b) + f;
        if (this.m - f6 < com.censivn.C3DEngine.a.e) {
            this.m = f6 + com.censivn.C3DEngine.a.e;
        } else if (this.m + f2 > com.censivn.C3DEngine.a.f) {
            this.m = com.censivn.C3DEngine.a.f - f2;
        }
        if (this.n + f3 > com.censivn.C3DEngine.a.g) {
            this.n = com.censivn.C3DEngine.a.g - f3;
        } else if (this.n - f5 < com.censivn.C3DEngine.a.h) {
            this.n = f5 + com.censivn.C3DEngine.a.h;
        }
        this.a.a_(true);
        com.censivn.C3DEngine.b.v vVar = this.a;
        com.censivn.C3DEngine.b.v.u();
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        g();
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
