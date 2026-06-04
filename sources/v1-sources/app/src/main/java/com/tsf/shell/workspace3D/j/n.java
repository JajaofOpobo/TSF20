package com.tsf.shell.workspace3D.j;

import android.graphics.Bitmap;
import android.view.KeyEvent;
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
public final class n implements at, bj {
    private com.censivn.C3DEngine.b.v b;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private com.censivn.C3DEngine.b.l g;
    private float h;
    private float i;
    private com.tsf.shell.setting.e j;
    private com.tsf.shell.setting.e k;
    private com.tsf.shell.setting.e l;
    private com.tsf.shell.setting.e m;
    private com.tsf.shell.setting.e n;
    private h o;
    private i p;
    private com.tsf.shell.setting.e q;
    private com.tsf.shell.setting.e r;
    private com.tsf.shell.setting.e s;
    private f t;
    private com.censivn.C3DEngine.e.b u;
    private com.tsf.shell.setting.e v;
    private boolean y = false;
    private boolean z = false;
    private a w = new a();
    private ArrayList x = new ArrayList();
    private com.censivn.C3DEngine.b.v a = new o(this);
    private com.censivn.C3DEngine.e.b.a c = new z(this, 650.0f * com.censivn.C3DEngine.a.b, 600.0f * com.censivn.C3DEngine.a.b, new com.censivn.C3DEngine.e.b.b(118.0f, 138.0f, 118.0f, 138.0f, 257.0f, 257.0f));

    public n() {
        this.c.b((-this.c.n_()) / 2.0f, (-this.c.o_()) / 2.0f, 0.0f, this.c.n_() / 2.0f, this.c.o_() / 2.0f);
        this.a.d(this.c);
        this.u = new com.censivn.C3DEngine.e.b(43.0f * com.censivn.C3DEngine.a.b, 11.0f * com.censivn.C3DEngine.a.b, (byte) 0);
        this.u.a(16.0f, 8.0f, 0.0f);
        ad adVar = new ad(this, this.c);
        adVar.c = new ae(this);
        adVar.d = true;
        this.u.a((com.censivn.C3DEngine.b.l) adVar);
        this.b = new com.censivn.C3DEngine.b.v();
        this.a.d(this.b);
        this.b.d(this.u);
        this.g = new ak(this, this.c);
        this.c.a(this.g);
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            a((Runnable) null);
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    static /* synthetic */ void g(n nVar) {
        if (nVar.d != null) {
            nVar.c.z().d();
            com.censivn.C3DEngine.a.f().a(nVar.d);
            nVar.d = null;
            com.censivn.C3DEngine.a.f().a(nVar.e);
            nVar.e = null;
        }
        if (nVar.f != null) {
            nVar.u.z().d();
            com.censivn.C3DEngine.a.f().a(nVar.f);
            nVar.f = null;
        }
    }

    public final void a() {
        com.censivn.C3DEngine.a.a().c(new af(this));
    }

    public final void c() {
        if (!this.z && bf.j().x()) {
            if (this.y) {
                Iterator it = this.x.iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.setting.e) it.next()).aK();
                }
            } else {
                this.y = true;
                com.tsf.shell.setting.e eVar = new com.tsf.shell.setting.e(com.censivn.C3DEngine.h.a.c(R.string.menu_theme), R.drawable.setting_theme_icon);
                this.k = eVar;
                if (com.tsf.shell.a.x.b() != ThemeManager.VERSION_CODE) {
                    eVar.c(com.censivn.C3DEngine.a.b * 20.0f, 50.0f * com.censivn.C3DEngine.a.b);
                }
                ak akVar = new ak(this, this.c);
                akVar.c = new aj(this);
                eVar.a((com.censivn.C3DEngine.b.l) akVar);
                this.b.d(eVar);
                this.x.add(eVar);
                com.tsf.shell.setting.e eVar2 = new com.tsf.shell.setting.e(com.censivn.C3DEngine.h.a.c(R.string.menu_setting_icon), R.drawable.setting_icon_designer_icon);
                this.l = eVar2;
                ak akVar2 = new ak(this, this.c);
                akVar2.c = new p(this);
                eVar2.a((com.censivn.C3DEngine.b.l) akVar2);
                this.b.d(eVar2);
                this.x.add(eVar2);
                com.tsf.shell.setting.e eVar3 = new com.tsf.shell.setting.e(com.censivn.C3DEngine.h.a.c(R.string.menu_setting_density), R.drawable.setting_density_icon);
                this.j = eVar3;
                ak akVar3 = new ak(this, this.c);
                akVar3.c = new q(this);
                eVar3.a((com.censivn.C3DEngine.b.l) akVar3);
                this.b.d(eVar3);
                this.x.add(eVar3);
                com.tsf.shell.setting.e eVar4 = new com.tsf.shell.setting.e(com.censivn.C3DEngine.h.a.c(R.string.mn_gesture), R.drawable.setting_gesture_icon);
                this.m = eVar4;
                ak akVar4 = new ak(this, this.c);
                akVar4.c = new r(this);
                eVar4.a((com.censivn.C3DEngine.b.l) akVar4);
                this.b.d(eVar4);
                this.x.add(eVar4);
                com.tsf.shell.setting.e eVar5 = new com.tsf.shell.setting.e(com.censivn.C3DEngine.h.a.c(R.string.mn_dock), R.drawable.setting_dock_icon);
                this.n = eVar5;
                ak akVar5 = new ak(this, this.c);
                akVar5.c = new s(this);
                eVar5.a((com.censivn.C3DEngine.b.l) akVar5);
                this.b.d(eVar5);
                this.x.add(eVar5);
                h hVar = new h(com.censivn.C3DEngine.h.a.c(R.string.mn_preference_direction));
                this.o = hVar;
                ak akVar6 = new ak(this, this.c);
                akVar6.d = false;
                this.o.h(false);
                akVar6.c = new t(this);
                hVar.a((com.censivn.C3DEngine.b.l) akVar6);
                this.b.d(hVar);
                this.x.add(hVar);
                i iVar = new i(com.censivn.C3DEngine.h.a.c(R.string.mn_lock_desktop));
                this.p = iVar;
                ak akVar7 = new ak(this, this.c);
                akVar7.c = new u(this);
                akVar7.d = false;
                iVar.a((com.censivn.C3DEngine.b.l) akVar7);
                this.b.d(iVar);
                this.x.add(iVar);
                com.tsf.shell.setting.e eVar6 = new com.tsf.shell.setting.e(com.censivn.C3DEngine.h.a.c(R.string.mn_drawer), R.drawable.setting_drawer_icon);
                this.q = eVar6;
                ak akVar8 = new ak(this, this.c);
                akVar8.c = new v(this);
                eVar6.a((com.censivn.C3DEngine.b.l) akVar8);
                this.b.d(eVar6);
                this.x.add(eVar6);
                w wVar = new w(this, com.censivn.C3DEngine.h.a.c(R.string.menu_setting_tips));
                this.r = wVar;
                com.tsf.shell.tips.b.a(wVar);
                ak akVar9 = new ak(this, this.c);
                akVar9.d = false;
                akVar9.c = new x(this);
                wVar.a((com.censivn.C3DEngine.b.l) akVar9);
                this.b.d(wVar);
                this.x.add(wVar);
                com.tsf.shell.setting.e eVar7 = new com.tsf.shell.setting.e(com.censivn.C3DEngine.h.a.c(R.string.menu_setting_effect), R.drawable.setting_desktop_effect_icon);
                this.s = eVar7;
                if (com.tsf.shell.a.x.a() != 1) {
                    eVar7.c(com.censivn.C3DEngine.a.b * 20.0f, 50.0f * com.censivn.C3DEngine.a.b);
                }
                ak akVar10 = new ak(this, this.c);
                akVar10.c = new y(this);
                eVar7.a((com.censivn.C3DEngine.b.l) akVar10);
                this.b.d(eVar7);
                this.x.add(eVar7);
                f fVar = new f(com.censivn.C3DEngine.h.a.c(R.string.menu_setting_menu));
                this.t = fVar;
                ak akVar11 = new ak(this, this.c);
                akVar11.d = false;
                com.tsf.shell.a.t.a(this.t);
                this.t.h(false);
                akVar11.c = new aa(this);
                fVar.a((com.censivn.C3DEngine.b.l) akVar11);
                this.b.d(fVar);
                this.x.add(fVar);
                ab abVar = new ab(this, "360°");
                this.v = abVar;
                ak akVar12 = new ak(this, this.c);
                akVar12.d = false;
                akVar12.c = new ac(this);
                abVar.a((com.censivn.C3DEngine.b.l) akVar12);
                this.b.d(abVar);
                this.x.add(abVar);
                float f = 140.0f * com.censivn.C3DEngine.a.b;
                float f2 = 150.0f * com.censivn.C3DEngine.a.b;
                float f3 = (-f) - (f / 2.0f);
                float f4 = 182.0f * com.censivn.C3DEngine.a.b;
                Iterator it2 = this.x.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    com.tsf.shell.setting.e eVar8 = (com.tsf.shell.setting.e) it2.next();
                    eVar8.L().x = ((i % 4) * f) + f3;
                    eVar8.L().y = f4 - ((i / 4) * f2);
                    eVar8.N().setAll(0.0f, 0.0f, 1.0f);
                    i++;
                }
                this.u.L().y = (-230.0f) * com.censivn.C3DEngine.a.b;
                this.a.b(0.0f);
            }
            Iterator it3 = this.x.iterator();
            while (it3.hasNext()) {
                com.tsf.shell.setting.e eVar9 = (com.tsf.shell.setting.e) it3.next();
                ai aiVar = new ai(this);
                aiVar.j(1.0f);
                aiVar.k(1.0f);
                aiVar.a(com.censivn.C3DEngine.g.a.e);
                aiVar.b(((int) (Math.random() * 250.0d)) + 100);
                com.censivn.C3DEngine.g.s.a(eVar9);
                com.censivn.C3DEngine.g.s.a(eVar9, ThemeShellDescription.PAGE_PREVIEW_SELECT, aiVar);
            }
            aq.a(this);
            bd.a(this);
            this.z = true;
            this.a.e(true);
            if (this.d == null) {
                Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_bg_normal);
                this.d = com.censivn.C3DEngine.a.f().a(a, false);
                a.recycle();
                Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_bg_focus);
                this.e = com.censivn.C3DEngine.a.f().a(a2, false);
                a2.recycle();
                this.c.z().d();
                this.c.z().c(this.d);
            }
            if (this.f == null) {
                Bitmap a3 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_more);
                this.f = com.censivn.C3DEngine.a.f().a(a3, false);
                a3.recycle();
                this.u.z().d();
                this.u.z().c(this.f);
            }
            bf.m().a(this.a);
            ag agVar = new ag(this);
            agVar.a(255);
            com.censivn.C3DEngine.g.s.a(this.a);
            com.censivn.C3DEngine.g.s.a(this.a, 250, agVar);
            this.c.az();
        }
    }

    public final void a(Runnable runnable) {
        if (this.z) {
            this.z = false;
            aq.b(this);
            bd.b(this);
            this.a.a_(false);
            this.a.e(false);
            ah ahVar = new ah(this, runnable);
            ahVar.a(0);
            com.censivn.C3DEngine.g.s.a(this.a);
            com.censivn.C3DEngine.g.s.a(this.a, 250, ahVar);
        }
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        this.h = 0.0f;
        this.i = 0.0f;
        this.a.L().x = this.h;
        this.a.L().y = this.i;
        this.a.a_(false);
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
