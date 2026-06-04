package com.tsf.shell.workspace3D.k.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.tsf.shell.R;
import com.tsf.shell.bd;
import com.tsf.shell.bj;
import com.tsf.shell.bm;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements com.tsf.shell.at, bj {
    public static float d;
    public static float e;
    private com.censivn.C3DEngine.b.v h;
    private com.censivn.C3DEngine.b.v i;
    private ArrayList j;
    private com.tsf.shell.workspace3D.h.l k;
    private com.censivn.C3DEngine.b.v l;
    private au n;
    private ai o;
    private com.tsf.shell.setting.l p;
    private com.tsf.shell.workspace3D.av q;
    private com.tsf.shell.workspace3D.j r;
    private ArrayList s;
    private y t;
    private a u;
    private float w;
    private TextureElement y;
    private TextureElement z;
    public static final float a = (int) (com.censivn.C3DEngine.a.a * 128.0f);
    public static final int b = (int) (75.0f * com.censivn.C3DEngine.a.a);
    public static final float c = com.censivn.C3DEngine.a.a * 128.0f;
    public static int f = 4;
    private boolean m = false;
    private boolean v = true;
    private boolean x = false;
    private com.tsf.shell.c.a.c g = new com.tsf.shell.c.a.c();

    public k() {
        HashMap hashMap = new HashMap();
        b.a = hashMap;
        hashMap.put("com.tsf.shell.widget.message", 4);
        b.a.put("com.tsf.shell.widget.alarm", 4);
        b.a.put("com.tsf.shell.widget.memo", 4);
        b.a.put("com.tsf.shell.widget.music", 4);
        b.a.put("com.tsf.shell.widget.gallery", 4);
        b.a.put("com.tsf.shell.widget.adornment", 4);
        bd.a(this);
    }

    public final com.tsf.shell.c.a.c a() {
        return this.g;
    }

    public final void a(String str, int i, float f2, float f3, float f4, float f5) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.s sVar = (com.tsf.shell.workspace3D.k.s) it.next();
            if (sVar.a.equals(str) && b.a(sVar, false)) {
                this.o.b(sVar.d, i, 0.0f, f2, f3, 0.0f, f4, f5);
                return;
            }
        }
        Iterator it2 = this.g.a().iterator();
        while (it2.hasNext()) {
            com.tsf.shell.workspace3D.k.s sVar2 = (com.tsf.shell.workspace3D.k.s) it2.next();
            if (sVar2.a.equals(str)) {
                LauncherItem3DInfo a2 = this.o.a(sVar2.d, i, 0.0f, f2, f3, 0.0f, f4, f5);
                a2.internal = true;
                this.o.a(sVar2.d, a2);
                return;
            }
        }
    }

    public final ai c() {
        return this.o;
    }

    public final au d() {
        return this.n;
    }

    public final void e() {
        f();
        if (this.r != this.o) {
            a(this.o);
        }
    }

    public final void f() {
        if (bf.j().x()) {
            if (this.m) {
                o();
                return;
            }
            if (com.tsf.shell.a.t.r()) {
                e(true);
            }
            com.tsf.shell.workspace3D.j jVar = this.r;
            i();
            n();
        }
    }

    public final void g() {
        if (bf.j().x()) {
            if (com.tsf.shell.a.t.r()) {
                com.tsf.shell.a.t.b((Boolean) false);
                c(true);
            } else {
                com.tsf.shell.a.t.b((Boolean) true);
                a(true, ThemeShellDescription.PAGE_PREVIEW_SELECT);
            }
        }
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
        if (this.l != null) {
            if (i == 0) {
                this.l.L().x = com.censivn.C3DEngine.a.e;
            } else {
                this.l.L().x = com.censivn.C3DEngine.a.f;
            }
        }
        if (this.o != null) {
            this.o.a(i);
        }
        if (this.p != null) {
            this.p.a(i);
        }
        if (this.n != null) {
            this.n.a(i);
        }
        if (this.q != null) {
            this.q.a(i);
        }
        if (this.m) {
            this.l.L().x = com.tsf.shell.workspace3D.j.b;
        }
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        float f2 = (this.i.L().y - e) / (d - e);
        d = (com.censivn.C3DEngine.a.g - (c / 2.0f)) - (com.censivn.C3DEngine.a.a * 5.0f);
        e = com.censivn.C3DEngine.a.h + ((f - 1) * b) + (c / 2.0f) + (com.censivn.C3DEngine.a.a * 5.0f);
        this.i.L().y = (f2 * (d - e)) + e;
        b(i, i2, i3, i4);
        b(bd.c());
    }

    private void b(int i, int i2, int i3, int i4) {
        d = (com.censivn.C3DEngine.a.g - (c / 2.0f)) - (com.censivn.C3DEngine.a.a * 5.0f);
        e = com.censivn.C3DEngine.a.h + ((f - 1) * b) + (c / 2.0f) + (com.censivn.C3DEngine.a.a * 5.0f);
        if (this.o != null) {
            this.o.a(i, i2, i3, i4);
        }
        if (this.p != null) {
            this.p.a(i, i2, i3, i4);
        }
        if (this.n != null) {
            this.n.a(i, i2, i3, i4);
        }
        if (this.q != null) {
            this.q.a(i, i2, i3, i4);
        }
    }

    public final void a(com.censivn.C3DEngine.b.v vVar) {
        this.u = new a();
        b(com.censivn.C3DEngine.a.g, com.censivn.C3DEngine.a.h, com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.f);
        this.t = new y(this);
        this.s = new ArrayList();
        this.k = bf.j();
        com.tsf.shell.workspace3D.k.t.a(getClass().getClassLoader());
        this.h = vVar;
        w();
        this.j = new ArrayList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.tsf.shell.workspace3D.k.s sVar = new com.tsf.shell.workspace3D.k.s();
        sVar.g = true;
        sVar.b = com.tsf.shell.workspace3D.k.c.b.c.class.getName();
        sVar.a = "";
        sVar.f = 1;
        Bitmap a2 = z.a(com.censivn.C3DEngine.a.c().getString(R.string.widget_folder), ThemeManager.mix.folder.getTheme().getIconBitmap());
        com.tsf.shell.workspace3D.k.al alVar = new com.tsf.shell.workspace3D.k.al();
        TextureElement a3 = com.censivn.C3DEngine.a.f().a(a2, true);
        this.y = a3;
        alVar.O.z().c(a3);
        sVar.d = alVar;
        sVar.e = a3;
        arrayList.add(alVar);
        alVar.a(sVar);
        this.j.add(sVar);
        com.tsf.shell.workspace3D.k.s sVar2 = new com.tsf.shell.workspace3D.k.s();
        sVar2.g = true;
        sVar2.b = com.tsf.shell.workspace3D.k.aj.class.getName();
        sVar2.a = "";
        sVar2.f = 6;
        Bitmap a4 = z.a(com.censivn.C3DEngine.a.c().getString(R.string.widget_contact), ThemeManager.mix.contact.getTheme().getIconBitmap());
        com.tsf.shell.workspace3D.k.al alVar2 = new com.tsf.shell.workspace3D.k.al();
        TextureElement a5 = com.censivn.C3DEngine.a.f().a(a4, true);
        this.z = a5;
        alVar2.O.z().c(a5);
        sVar2.d = alVar2;
        sVar2.e = a5;
        arrayList.add(alVar2);
        alVar2.a(sVar2);
        this.j.add(sVar2);
        com.tsf.shell.workspace3D.k.s sVar3 = new com.tsf.shell.workspace3D.k.s();
        sVar3.g = true;
        sVar3.b = com.tsf.shell.workspace3D.k.c.c.a.class.getName();
        sVar3.c = "com.tsf.shell.widget.theme.airship";
        sVar3.a = "";
        sVar3.f = 5;
        sVar3.h = true;
        Bitmap a6 = z.a("Airship", com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.widget_boring_airship_icon));
        com.tsf.shell.workspace3D.k.al alVar3 = new com.tsf.shell.workspace3D.k.al();
        TextureElement a7 = com.censivn.C3DEngine.a.f().a(a6, true);
        alVar3.O.z().c(a7);
        sVar3.d = alVar3;
        sVar3.e = a7;
        arrayList2.add(alVar3);
        alVar3.a(sVar3);
        this.j.add(sVar3);
        com.tsf.shell.workspace3D.k.s sVar4 = new com.tsf.shell.workspace3D.k.s();
        sVar4.g = true;
        sVar4.b = com.tsf.shell.workspace3D.k.c.a.a.class.getName();
        sVar4.c = "com.tsf.shell.widget.floating";
        sVar4.a = "";
        sVar4.f = 5;
        Bitmap a8 = z.a("Ha-Ha", com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.widget_boring_cloud_icon));
        com.tsf.shell.workspace3D.k.al alVar4 = new com.tsf.shell.workspace3D.k.al();
        TextureElement a9 = com.censivn.C3DEngine.a.f().a(a8, true);
        alVar4.O.z().c(a9);
        sVar4.d = alVar4;
        sVar4.e = a9;
        arrayList2.add(alVar4);
        alVar4.a(sVar4);
        this.j.add(sVar4);
        this.o.a(arrayList);
        this.n.a(arrayList2);
        if (com.tsf.shell.a.t.r()) {
            d(false);
        }
    }

    public final void a(boolean z) {
        this.x = z;
        this.l.a_(z);
        if (this.x) {
            com.censivn.C3DEngine.g.s.a(this.l);
        }
    }

    public final void a(float f2) {
        this.w = f2;
        this.l.a_(true);
        this.v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.v = true;
        this.l.a_(false);
    }

    public final void h() {
        com.tsf.shell.workspace3D.j.h();
        if (bd.c() == 0) {
            this.l.L().x = com.censivn.C3DEngine.a.e;
        } else {
            this.l.L().x = com.censivn.C3DEngine.a.f;
        }
        this.n.i();
        this.o.i();
        this.p.i();
        this.q.i();
        if (this.m) {
            this.l.L().x = com.tsf.shell.workspace3D.j.b;
        }
    }

    private void w() {
        this.l = new l(this);
        this.h.d(this.l);
        if (bd.c() == 0) {
            this.l.L().x = com.censivn.C3DEngine.a.e;
        } else {
            this.l.L().x = com.censivn.C3DEngine.a.f;
        }
        this.i = new com.censivn.C3DEngine.b.v();
        this.l.d(this.i);
        this.n = new au(this.l, this.i);
        this.n.b(2);
        this.o = new ai(this.l, this.i, 201);
        this.o.b(1);
        this.q = new com.tsf.shell.workspace3D.av(this.l, this.i);
        this.q.b(0);
        this.p = new com.tsf.shell.setting.l(this.l, this.i);
        this.p.b(3);
        com.tsf.shell.a.r P = com.tsf.shell.a.t.P();
        String str = P.a;
        int i = P.b;
        int i2 = P.c;
        for (String str2 : str.split(",")) {
            switch (Integer.parseInt(str2)) {
                case 0:
                    b(this.q);
                    break;
                case 1:
                    b(this.o);
                    break;
                case 2:
                    b(this.n);
                    break;
                case 3:
                    b(this.p);
                    break;
            }
        }
        if (!this.s.contains(this.q)) {
            b(this.q);
        }
        if (!this.s.contains(this.o)) {
            b(this.o);
        }
        if (!this.s.contains(this.n)) {
            b(this.n);
        }
        if (!this.s.contains(this.p)) {
            b(this.p);
        }
        switch (i) {
            case 0:
                this.r = this.q;
                break;
            case 1:
                this.r = this.o;
                break;
            case 2:
                this.r = this.n;
                break;
            case 3:
                this.r = this.p;
                break;
        }
        if (this.r == null) {
            this.r = (com.tsf.shell.workspace3D.j) this.s.get(0);
        }
        this.r.b(true);
        this.r.g();
        b(false);
        p();
        b(i2);
    }

    private void b(com.tsf.shell.workspace3D.j jVar) {
        if (!this.s.contains(jVar)) {
            jVar.c(this.s.size());
            this.s.add(jVar);
            jVar.a(this);
            jVar.a(false);
        }
    }

    public final void i() {
        com.tsf.shell.aq.a(this);
        this.h.ax();
        this.r.a();
        k();
    }

    public final a j() {
        return this.u;
    }

    public final com.tsf.shell.workspace3D.j c(int i) {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.j jVar = (com.tsf.shell.workspace3D.j) it.next();
            if (jVar.e() == i) {
                return jVar;
            }
        }
        return null;
    }

    public final void k() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.workspace3D.j) it.next()).f();
        }
    }

    public final void b(boolean z) {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.workspace3D.j) it.next()).a(this.r, z);
        }
    }

    public final com.tsf.shell.workspace3D.av l() {
        return this.q;
    }

    static /* synthetic */ void e(k kVar) {
        kVar.r.b();
        com.tsf.shell.aq.b(kVar);
        if (kVar.h.P() != null) {
            com.censivn.C3DEngine.b.v vVar = (com.censivn.C3DEngine.b.v) kVar.h.P();
            vVar.e(kVar.h);
            vVar.a(kVar.h, 2);
        }
        kVar.q();
        kVar.b(true);
    }

    public final boolean m() {
        return this.m;
    }

    public final void b(float f2) {
        if (f2 > d) {
            this.i.L().y = d;
        } else if (f2 < e) {
            this.i.L().y = e;
        } else {
            this.i.L().y = f2;
        }
    }

    public final void n() {
        this.r.a();
        v();
        q qVar = new q(this);
        qVar.f(com.tsf.shell.workspace3D.j.b);
        com.censivn.C3DEngine.g.s.a(this.l);
        com.censivn.C3DEngine.g.s.a(this.l, 250, qVar);
        this.m = true;
    }

    public final void o() {
        v();
        r rVar = new r(this);
        rVar.f(com.tsf.shell.workspace3D.j.a);
        com.censivn.C3DEngine.g.s.a(this.l);
        com.censivn.C3DEngine.g.s.a(this.l, 250, rVar);
        this.m = false;
        if (com.tsf.shell.a.t.r()) {
            a(true, ThemeShellDescription.PAGE_PREVIEW_SELECT);
        }
    }

    public final void a(com.tsf.shell.workspace3D.j jVar) {
        i();
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.j jVar2 = (com.tsf.shell.workspace3D.j) it.next();
            if (jVar2 != jVar) {
                jVar2.b();
                jVar2.b(false);
            } else {
                jVar2.a();
                if (this.r != jVar2) {
                    jVar2.b(true);
                    jVar2.g();
                }
                this.r = jVar2;
                if (this.r == this.q) {
                    com.tsf.shell.tips.b.a(6);
                }
            }
        }
        if (!this.m) {
            n();
        }
        p();
    }

    public final void p() {
        c(1);
        int e2 = this.r.e();
        for (int i = 0; i < f && e2 != i; i++) {
            c(i).d().ax();
        }
        for (int i2 = f - 1; i2 >= 0 && e2 != i2; i2--) {
            c(i2).d().ax();
        }
        this.r.d().ax();
    }

    public final void q() {
        String str = "";
        for (int i = 0; i < f; i++) {
            str = String.valueOf(str) + c(i).c();
            if (i != f - 1) {
                str = String.valueOf(str) + ",";
            }
        }
        com.tsf.shell.a.t.a(str, this.r.c(), (int) this.i.L().y);
    }

    public final void r() {
        com.censivn.C3DEngine.a.f().a(this.y, z.a(com.censivn.C3DEngine.a.c().getString(R.string.widget_folder), ThemeManager.mix.folder.getTheme().getIconBitmap()));
    }

    public final void s() {
        com.censivn.C3DEngine.a.f().a(this.z, z.a(com.censivn.C3DEngine.a.c().getString(R.string.widget_contact), ThemeManager.mix.contact.getTheme().getIconBitmap()));
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar) {
        jVar.n();
        LauncherItem3DInfo be = jVar.be();
        if (be != null) {
            c(be);
            com.tsf.shell.workspace3D.k.s a2 = a(be.classname);
            if (a2 != null) {
                a2.b(jVar);
            }
        }
        jVar.H();
    }

    private void c(LauncherItem3DInfo launcherItem3DInfo) {
        if (launcherItem3DInfo.id != -1) {
            com.censivn.C3DEngine.a.a().d(new s(this, launcherItem3DInfo));
        }
    }

    public static void b(com.tsf.shell.workspace3D.k.j jVar) {
        jVar.n();
        jVar.H();
    }

    public static void a(LauncherItem3DInfo launcherItem3DInfo) {
        if (launcherItem3DInfo.id == -1) {
            bm.a(launcherItem3DInfo);
        } else {
            bm.a(com.censivn.C3DEngine.a.c(), launcherItem3DInfo);
        }
    }

    public final void a(LauncherItem3DInfo launcherItem3DInfo, Runnable runnable) {
        com.censivn.C3DEngine.a.a().d(new t(this, launcherItem3DInfo, runnable));
    }

    public final int t() {
        return this.t.a();
    }

    public final void d(int i) {
        this.t.a(Integer.valueOf(i));
    }

    public final void e(int i) {
        this.t.b(Integer.valueOf(i));
    }

    public final void onLoadWidgetComplete(com.tsf.shell.workspace3D.k.j jVar, com.tsf.shell.workspace3D.k.s sVar) {
        LauncherItem3DInfo be = jVar.be();
        switch (jVar.be().itemType) {
            case 6:
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                jVar.a((com.censivn.C3DEngine.b.l) new com.tsf.shell.workspace3D.a.g((com.tsf.shell.workspace3D.k.ab) jVar));
                break;
            default:
                jVar.a((com.censivn.C3DEngine.b.l) new com.tsf.shell.workspace3D.a.d(jVar));
                break;
        }
        if (sVar != null) {
            boolean z = sVar.g;
        }
        switch (be.container) {
            case -4:
                bf.s().a(jVar);
                break;
            case LauncherShortcut3DInfo.CONTAINER_FOLDER /* -3 */:
                break;
            case LauncherShortcut3DInfo.CONTAINER_QUICKLAUNCH /* -2 */:
                bf.l().q.b(jVar);
                break;
            default:
                if (sVar != null) {
                    if (be.internal) {
                        if (sVar.h) {
                            if (sVar.b()) {
                                sVar.a(jVar);
                            } else {
                                a(jVar);
                                com.tsf.shell.au.a(R.string.notic_widget_exists);
                                break;
                            }
                        }
                    } else if (b.a(sVar, true)) {
                        sVar.a(jVar);
                    } else {
                        a(jVar);
                        break;
                    }
                }
                com.tsf.shell.workspace3D.h.a d2 = this.k.d(jVar.be().screen);
                jVar.i_();
                d2.g(jVar);
                break;
        }
    }

    public final void onLoadWidgetError() {
        com.tsf.shell.au.a(com.censivn.C3DEngine.a.c().getString(R.string.notic_load_widget_error_unknow));
    }

    public final void b(LauncherItem3DInfo launcherItem3DInfo) {
        if (launcherItem3DInfo.itemType == 7) {
            com.censivn.C3DEngine.a.a().c(new u(this, launcherItem3DInfo));
            return;
        }
        Iterator it = this.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tsf.shell.workspace3D.k.s sVar = (com.tsf.shell.workspace3D.k.s) it.next();
            if (sVar.b.equals(launcherItem3DInfo.classname)) {
                if (b.a(sVar, false)) {
                    a(sVar, launcherItem3DInfo, true, null);
                    return;
                }
                String str = "bind3dWidget:" + launcherItem3DInfo.packagename + "   not allow";
            } else if (sVar.c != null && sVar.c.equals(launcherItem3DInfo.packagename)) {
                launcherItem3DInfo.classname = sVar.b;
                if (b.a(sVar, false)) {
                    a(sVar, launcherItem3DInfo, true, null);
                    return;
                }
                String str2 = "bind3dWidget:" + launcherItem3DInfo.packagename + "   not allow";
            }
        }
        Iterator it2 = this.g.a().iterator();
        while (it2.hasNext()) {
            com.tsf.shell.workspace3D.k.s sVar2 = (com.tsf.shell.workspace3D.k.s) it2.next();
            if (sVar2.a.equals(launcherItem3DInfo.packagename)) {
                a(sVar2, launcherItem3DInfo, true, null);
                return;
            }
        }
        d(launcherItem3DInfo.appWidgetId);
        bm.b(com.censivn.C3DEngine.a.c(), launcherItem3DInfo);
    }

    public final void a(com.tsf.shell.workspace3D.k.s sVar, LauncherItem3DInfo launcherItem3DInfo, boolean z, com.tsf.shell.workspace3D.k.y yVar) {
        if (launcherItem3DInfo.screen == -1) {
            c(launcherItem3DInfo);
            com.tsf.shell.au.a(R.string.notic_widget_forbid_add);
        } else {
            com.tsf.shell.workspace3D.k.t tVar = new com.tsf.shell.workspace3D.k.t();
            tVar.a(com.tsf.shell.workspace3D.k.t.b, this, "onLoadWidgetError", new Object[0]);
            tVar.a(com.tsf.shell.workspace3D.k.t.a, this, "onLoadWidgetComplete", new Object[0]);
            tVar.a(sVar, launcherItem3DInfo, z, yVar);
        }
    }

    public static void u() {
    }

    public final void a(ArrayList arrayList) {
        boolean z;
        com.tsf.shell.workspace3D.k.s sVar;
        d(arrayList);
        com.tsf.shell.c.a.b[] a2 = this.g.a(com.censivn.C3DEngine.a.c());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (com.tsf.shell.c.a.b bVar : a2) {
            Iterator it = this.j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                } else if (((com.tsf.shell.workspace3D.k.s) it.next()).a.equals(bVar.f)) {
                    z = true;
                }
            }
            if (!z) {
                if (bVar.d.equals("tool")) {
                    sVar = new com.tsf.shell.workspace3D.k.s();
                    sVar.i = 0;
                } else if (bVar.d.equals("theme")) {
                    sVar = new com.tsf.shell.workspace3D.k.s();
                    sVar.i = 1;
                }
                sVar.b = com.tsf.shell.workspace3D.k.c.c.j.class.getName();
                sVar.a = bVar.f;
                sVar.k = bVar;
                sVar.f = 5;
                sVar.g = false;
                this.g.a(sVar);
                com.tsf.shell.workspace3D.k.al alVar = new com.tsf.shell.workspace3D.k.al();
                com.censivn.C3DEngine.a.a().c(new v(this, bVar, alVar, sVar));
                sVar.d = alVar;
                alVar.a(sVar);
                switch (sVar.i) {
                    case 0:
                        arrayList2.add(sVar.d);
                        break;
                    case 1:
                        arrayList3.add(sVar.d);
                        break;
                }
            }
        }
        this.o.a(arrayList2, 2);
        this.n.a(arrayList3, 2);
    }

    public final void a(ArrayList arrayList, boolean z) {
        com.censivn.C3DEngine.a.a().c(new w(this, arrayList, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList arrayList) {
        com.tsf.shell.workspace3D.k.j jVar;
        Context c2 = com.censivn.C3DEngine.a.c();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it.next();
            try {
                String packageName = bVar.c.getPackageName();
                com.tsf.shell.workspace3D.k.s a2 = z.a(c2.createPackageContext(packageName, 3), (String) bVar.a, packageName, bVar.c.getClassName());
                if (a2 != null) {
                    boolean z = false;
                    float f2 = 0.0f;
                    float f3 = 0.0f;
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    float f6 = 0.0f;
                    float f7 = 0.0f;
                    int i = 0;
                    com.tsf.shell.workspace3D.k.s b2 = this.g.b(a2.a);
                    if (b2 != null && b2.l != null && (jVar = b2.l.a) != null) {
                        z = true;
                        LauncherItem3DInfo be = jVar.be();
                        f2 = be.cellX;
                        f3 = be.cellY;
                        f4 = be.cellXH;
                        f5 = be.cellYH;
                        f6 = be.scale;
                        f7 = be.scaleH;
                        i = be.screen;
                    }
                    int c3 = this.g.c(a2.a);
                    switch (a2.i) {
                        case 0:
                            if (c3 == -1) {
                                this.o.b(a2.d);
                                break;
                            } else {
                                this.o.a(a2.d, c3);
                                break;
                            }
                        case 1:
                            if (c3 == -1) {
                                this.n.b(a2.d);
                                break;
                            } else {
                                this.n.a(a2.d, c3);
                                break;
                            }
                        default:
                            if (c3 == -1) {
                                this.o.b(a2.d);
                                break;
                            } else {
                                this.o.a(a2.d, c3);
                                break;
                            }
                    }
                    this.j.add(a2);
                    if (z) {
                        this.o.b(a2.d, i, f2, f3, f4, f5, f6, f7);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        String str = "bind3dWidgetUpdate size:" + arrayList.size();
        com.censivn.C3DEngine.a.a().c(new x(this, arrayList));
    }

    static /* synthetic */ void a(k kVar, com.tsf.shell.workspace3D.k.s sVar, com.tsf.shell.h.b bVar) {
        String str = "onWidgetUpdate info:" + bVar.c.getClassName();
        com.censivn.C3DEngine.a.a().c(new m(kVar, bVar, sVar));
    }

    public final void c(ArrayList arrayList) {
        com.censivn.C3DEngine.a.a().c(new n(this, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.workspace3D.k.s a(String str) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.s sVar = (com.tsf.shell.workspace3D.k.s) it.next();
            if (sVar.b.equals(str)) {
                return sVar;
            }
        }
        return null;
    }

    private void e(boolean z) {
        this.h.a((Boolean) true);
        com.censivn.C3DEngine.g.s.a(this.h);
        if (z) {
            o oVar = new o(this);
            oVar.g(0.0f);
            com.censivn.C3DEngine.g.s.a(this.h, 380, oVar);
        } else {
            this.h.e(true);
            this.h.L().x = 0.0f;
        }
    }

    public final void c(boolean z) {
        if (!com.tsf.shell.a.t.r()) {
            e(z);
        }
    }

    public final void d(boolean z) {
        a(z, 380);
    }

    private void a(boolean z, int i) {
        if (this.m) {
            o();
        }
        if (z) {
            p pVar = new p(this);
            if (bd.c() == 0) {
                pVar.g(-100.0f);
            } else {
                pVar.g(100.0f);
            }
            com.censivn.C3DEngine.g.s.a(this.h);
            this.h.e(false);
            com.censivn.C3DEngine.g.s.a(this.h, i, pVar);
            return;
        }
        this.h.a((Boolean) false);
        this.h.e(false);
        if (bd.c() == 0) {
            this.h.L().x = com.censivn.C3DEngine.a.a * (-100.0f);
        } else {
            this.h.L().x = com.censivn.C3DEngine.a.a * 100.0f;
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            com.tsf.shell.aq.b(this);
            o();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }
}
