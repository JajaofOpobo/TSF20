package com.tsf.shell.setting.a;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.ad;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.R;
import com.tsf.shell.bj;
import com.tsf.shell.theme.inside.DefaultIconItem;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements bj {
    public static int a = 0;
    private static g s;
    private com.tsf.shell.workspace3D.d.a b;
    private com.censivn.C3DEngine.b.v c;
    private com.censivn.C3DEngine.b.v d;
    private TextureElement e;
    private TextureElement f;
    private TextureElement g;
    private TextureElement h;
    private TextureElement i;
    private com.censivn.C3DEngine.e.b j;
    private com.censivn.C3DEngine.e.b k;
    private com.censivn.C3DEngine.e.b l;
    private com.censivn.C3DEngine.e.b m;
    private com.censivn.C3DEngine.e.b n;
    private d o;
    private d p;
    private ProgressDialog r;
    private b u;
    private b v;
    private boolean q = false;
    private ArrayList t = new ArrayList();

    public g() {
        this.t.add(0);
        this.d = new com.censivn.C3DEngine.b.v();
        this.n = new com.censivn.C3DEngine.e.b(com.censivn.C3DEngine.a.j + 10, 50.0f * com.censivn.C3DEngine.a.a, (byte) 0);
        this.n.c((Boolean) false);
        this.k = new com.censivn.C3DEngine.e.b(128.0f, 128.0f);
        this.k.c((Boolean) false);
        this.k.ar();
        this.k.L().y = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 80.0f);
        this.n.L().y = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 80.0f);
        this.l = new com.censivn.C3DEngine.e.b(64.0f, 64.0f);
        this.l.c((Boolean) false);
        this.l.ar();
        this.l.L().y = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 80.0f);
        this.l.L().x = com.censivn.C3DEngine.a.a * 128.0f;
        this.m = new com.censivn.C3DEngine.e.b(64.0f, 64.0f);
        this.m.c((Boolean) false);
        this.m.ar();
        this.m.L().y = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 80.0f);
        this.m.L().x = (-com.censivn.C3DEngine.a.a) * 128.0f;
        this.j = new com.censivn.C3DEngine.e.b(450.0f, 113.0f);
        this.j.c((Boolean) false);
        this.k.a((com.censivn.C3DEngine.b.l) new h(this, this.k));
        this.m.a((com.censivn.C3DEngine.b.l) new m(this, this.m));
        this.l.a((com.censivn.C3DEngine.b.l) new n(this, this.l));
        this.b = new o(this);
    }

    public static void a() {
        com.tsf.shell.a.t.X();
        int i = a;
        a = 0;
    }

    public static g c() {
        if (s == null) {
            s = new g();
        }
        return s;
    }

    public static void d() {
        int i = a;
    }

    public static void e() {
    }

    public final void f() {
        p pVar = new p(this);
        com.censivn.C3DEngine.a.a();
        w.a(pVar);
    }

    public final void g() {
        q qVar = new q(this);
        com.censivn.C3DEngine.a.a();
        w.a(qVar);
    }

    public final void h() {
        int i = a;
        if (a != 0) {
            a = 0;
            com.tsf.shell.a.t.Y();
            ArrayList arrayList = new ArrayList();
            Iterator it = ThemeManager.getInstance().getThemeDescriptionList().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ThemeDescription) it.next()).icon.iconUponItems.iterator();
                while (it2.hasNext()) {
                    arrayList.add((DefaultIconItem) it2.next());
                }
            }
            int size = arrayList.size();
            Bitmap a2 = ap.a();
            for (int i2 = 0; i2 < size; i2++) {
                Bitmap a3 = a(a2, (DefaultIconItem) arrayList.get(i2), 0, false, true);
                if (a3 != null) {
                    try {
                        com.censivn.C3DEngine.a.f();
                        ad.b(((f) this.o.i().get(i2 + 1)).c, a3);
                    } catch (Exception e) {
                    }
                }
            }
            a2.recycle();
            m();
            b bVar = this.u;
            b.u();
        }
    }

    private d l() {
        String str = ThemeManager.getInstance().getConfig().i;
        String str2 = ThemeManager.getInstance().getConfig().j;
        String str3 = str == null ? "" : str;
        String str4 = str2 == null ? "" : str2;
        ArrayList arrayList = new ArrayList();
        ArrayList themeDescriptionList = ThemeManager.getInstance().getThemeDescriptionList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new DefaultIconItem(null, null, null, 1.0f));
        Iterator it = themeDescriptionList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ThemeDescription) it.next()).icon.iconUponItems.iterator();
            while (it2.hasNext()) {
                arrayList2.add((DefaultIconItem) it2.next());
            }
        }
        Bitmap a2 = ap.a();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            DefaultIconItem defaultIconItem = (DefaultIconItem) it3.next();
            Bitmap a3 = a(a2, defaultIconItem, 0, true, true);
            if (a3 != null) {
                TextureElement a4 = com.censivn.C3DEngine.a.f().a(a3, true);
                String str5 = "";
                if (defaultIconItem.description != null && defaultIconItem.description.packagename != null) {
                    str5 = defaultIconItem.description.packagename;
                }
                arrayList.add(new f(a4, str5, defaultIconItem.drawable, defaultIconItem.scale));
            }
        }
        a2.recycle();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            f fVar = (f) arrayList.get(i);
            int i3 = (fVar.a.equals(str3) && fVar.b != null && fVar.b.equals(str4)) ? i : i2;
            i++;
            i2 = i3;
        }
        d dVar = new d(false, arrayList, new r(this));
        dVar.L().y = (18.0f * com.censivn.C3DEngine.a.b) / 2.0f;
        dVar.L().x = com.censivn.C3DEngine.a.q ? com.censivn.C3DEngine.a.e : com.censivn.C3DEngine.a.h;
        dVar.e(i2);
        dVar.a(i2);
        return dVar;
    }

    private static Bitmap a(Bitmap bitmap, DefaultIconItem defaultIconItem, int i, boolean z, boolean z2) {
        Bitmap bitmap2 = defaultIconItem.getBitmap();
        if (bitmap2 == null && defaultIconItem.description != null && z) {
            return null;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (ap.A - bitmap2.getWidth()) / 2, i + 0, (Paint) null);
            bitmap2.recycle();
        }
        if (z2) {
            u.a(6, 50, canvas);
        } else {
            u.a(122, 50, canvas);
        }
        int i2 = a;
        return bitmap;
    }

    private void m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ThemeManager.getInstance().getThemeDescriptionList().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ThemeDescription) it.next()).icon.iconBackItems.iterator();
            while (it2.hasNext()) {
                arrayList.add((DefaultIconItem) it2.next());
            }
        }
        int size = arrayList.size();
        Bitmap a2 = ap.a();
        for (int i = 0; i < size; i++) {
            Bitmap a3 = a(a2, (DefaultIconItem) arrayList.get(i), 1, false, false);
            if (a3 != null) {
                try {
                    com.censivn.C3DEngine.a.f();
                    ad.b(((f) this.p.i().get(i + 1)).c, a3);
                } catch (Exception e) {
                }
            }
        }
        a2.recycle();
    }

    public final void i() {
        ThemeManager.getInstance().initSurplus();
        this.c = bf.m().a(this.b);
        t tVar = new t(this);
        this.q = true;
        bf.m();
        bf.n().a(tVar);
    }

    public final void j() {
        if (!this.q) {
            this.q = true;
            i iVar = new i(this);
            iVar.j(0.0f);
            iVar.k(0.0f);
            com.censivn.C3DEngine.g.s.a(this.d, 250, iVar);
        }
    }

    static /* synthetic */ void e(g gVar) {
        gVar.o.m();
        gVar.p.m();
        gVar.u.k();
        gVar.v.k();
    }

    static /* synthetic */ void k(g gVar) {
        if (gVar.o != null) {
            gVar.o.j();
            gVar.o = null;
        }
        if (gVar.p != null) {
            gVar.p.j();
            gVar.p = null;
        }
        if (gVar.i != null) {
            com.censivn.C3DEngine.a.f().a(gVar.i);
            gVar.i = null;
        }
        if (gVar.h != null) {
            com.censivn.C3DEngine.a.f().a(gVar.h);
            gVar.h = null;
        }
        if (gVar.e != null) {
            com.censivn.C3DEngine.a.f().a(gVar.e);
            gVar.e = null;
        }
        if (gVar.f != null) {
            com.censivn.C3DEngine.a.f().a(gVar.f);
            gVar.f = null;
        }
        if (gVar.g != null) {
            com.censivn.C3DEngine.a.f().a(gVar.g);
            gVar.g = null;
        }
        if (gVar.u != null) {
            gVar.u.H();
            gVar.u = null;
        }
        if (gVar.v != null) {
            gVar.v.H();
            gVar.v = null;
        }
        gVar.n.Q();
        gVar.k.Q();
        gVar.j.Q();
        gVar.l.Q();
        gVar.m.Q();
    }

    static /* synthetic */ void j(g gVar) {
        if (gVar.i != null) {
            com.censivn.C3DEngine.a.f().a(gVar.i);
        }
        if (gVar.h != null) {
            com.censivn.C3DEngine.a.f().a(gVar.h);
        }
        if (gVar.e != null) {
            com.censivn.C3DEngine.a.f().a(gVar.e);
        }
        if (gVar.f != null) {
            com.censivn.C3DEngine.a.f().a(gVar.f);
        }
        if (gVar.g != null) {
            com.censivn.C3DEngine.a.f().a(gVar.g);
        }
        gVar.v = new k(gVar, com.censivn.C3DEngine.a.e, (int) ((-100.0f) * com.censivn.C3DEngine.a.a), com.censivn.C3DEngine.a.f, (int) (32.0f * com.censivn.C3DEngine.a.a));
        gVar.v.a(v.b(), v.a);
        PositionNumber3d L = gVar.v.L();
        PositionNumber3d L2 = gVar.v.j().L();
        float f = (-73.0f) * com.censivn.C3DEngine.a.b;
        L2.y = f;
        L.y = f;
        gVar.u = new l(gVar, com.censivn.C3DEngine.a.e, (int) ((-16.0f) * com.censivn.C3DEngine.a.a), com.censivn.C3DEngine.a.f, (int) (64.0f * com.censivn.C3DEngine.a.a));
        gVar.u.a(gVar.t.size(), a);
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.PUBLIC_BUTTON_CONFIRM);
        gVar.f = com.censivn.C3DEngine.a.f().a(bitmap, true);
        bitmap.recycle();
        Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.tsf_icon_desinger_logo);
        gVar.e = com.censivn.C3DEngine.a.f().a(a2, true);
        a2.recycle();
        Bitmap a3 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.tsf_icon_desinger_bar);
        gVar.g = com.censivn.C3DEngine.a.f().a(a3, true);
        a3.recycle();
        Bitmap bitmap2 = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.PUBLIC_BUTTON_CLOSE);
        gVar.h = com.censivn.C3DEngine.a.f().a(bitmap2, true);
        bitmap2.recycle();
        Bitmap bitmap3 = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.PUBLIC_BUTTON_RETURN);
        gVar.i = com.censivn.C3DEngine.a.f().a(bitmap3, true);
        bitmap3.recycle();
        gVar.m.z().b();
        gVar.m.z().c(gVar.i);
        gVar.m.N().setAll(0.0f, 0.0f, 1.0f);
        gVar.l.z().b();
        gVar.l.z().c(gVar.h);
        gVar.l.N().setAll(0.0f, 0.0f, 1.0f);
        gVar.n.z().b();
        gVar.n.z().c(gVar.g);
        gVar.k.z().b();
        gVar.k.z().c(gVar.f);
        gVar.k.N().setAll(0.0f, 0.0f, 1.0f);
        gVar.j.z().b();
        gVar.j.z().c(gVar.e);
        gVar.j.L().y = com.censivn.C3DEngine.a.g + (128.0f * com.censivn.C3DEngine.a.a);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.h(com.censivn.C3DEngine.a.g - (64.0f * com.censivn.C3DEngine.a.a));
        com.censivn.C3DEngine.g.s.a(gVar.j, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        gVar.u.N().setAll(0.0f, 0.0f, 1.0f);
        com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
        uVar2.j(1.0f);
        uVar2.k(1.0f);
        uVar2.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(gVar.u, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar2);
        gVar.v.N().setAll(0.0f, 0.0f, 1.0f);
        com.censivn.C3DEngine.g.u uVar3 = new com.censivn.C3DEngine.g.u();
        uVar3.j(1.0f);
        uVar3.k(1.0f);
        uVar3.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(gVar.v, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar3);
        com.censivn.C3DEngine.g.u uVar4 = new com.censivn.C3DEngine.g.u();
        uVar4.j(1.0f);
        uVar4.k(1.0f);
        uVar4.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(gVar.k, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar4);
        com.censivn.C3DEngine.g.u uVar5 = new com.censivn.C3DEngine.g.u();
        uVar5.j(1.0f);
        uVar5.k(1.0f);
        uVar5.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(gVar.l, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar5);
        com.censivn.C3DEngine.g.u uVar6 = new com.censivn.C3DEngine.g.u();
        uVar6.j(1.0f);
        uVar6.k(1.0f);
        uVar6.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(gVar.m, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar6);
        gVar.d.N().setAll(1.0f, 1.0f, 1.0f);
        String str = ThemeManager.getInstance().getConfig().k;
        String str2 = ThemeManager.getInstance().getConfig().l;
        String str3 = str == null ? "" : str;
        String str4 = str2 == null ? "" : str2;
        ArrayList arrayList = new ArrayList();
        ArrayList themeDescriptionList = ThemeManager.getInstance().getThemeDescriptionList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new DefaultIconItem(null, null, null, 1.0f));
        Iterator it = themeDescriptionList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ThemeDescription) it.next()).icon.iconBackItems.iterator();
            while (it2.hasNext()) {
                arrayList2.add((DefaultIconItem) it2.next());
            }
        }
        Bitmap a4 = ap.a();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            DefaultIconItem defaultIconItem = (DefaultIconItem) it3.next();
            Bitmap a5 = a(a4, defaultIconItem, 0, true, false);
            if (a5 != null) {
                TextureElement a6 = com.censivn.C3DEngine.a.f().a(a5, true);
                String str5 = "";
                if (defaultIconItem.description != null && defaultIconItem.description.packagename != null) {
                    str5 = defaultIconItem.description.packagename;
                }
                arrayList.add(new f(a6, str5, defaultIconItem.drawable, defaultIconItem.scale));
            }
        }
        a4.recycle();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            f fVar = (f) arrayList.get(i);
            int i3 = (fVar.a.equals(str3) && fVar.b != null && fVar.b.equals(str4)) ? i : i2;
            i++;
            i2 = i3;
        }
        d dVar = new d(true, arrayList, new s(gVar));
        dVar.L().y = (18.0f * com.censivn.C3DEngine.a.b) / 2.0f;
        dVar.L().x = com.censivn.C3DEngine.a.q ? com.censivn.C3DEngine.a.f : com.censivn.C3DEngine.a.o;
        dVar.e(i2);
        dVar.a(i2);
        gVar.p = dVar;
        gVar.o = gVar.l();
        gVar.d.d(gVar.p);
        gVar.d.d(gVar.u);
        gVar.d.d(gVar.v);
        gVar.d.d(gVar.o);
        gVar.d.d(gVar.j);
        gVar.d.d(gVar.n);
        gVar.d.d(gVar.k);
        gVar.d.d(gVar.l);
        gVar.d.d(gVar.m);
        gVar.d.d(gVar.u.j());
        gVar.d.d(gVar.v.j());
        gVar.p.N().setAll(0.0f, 0.0f, 1.0f);
        gVar.o.N().setAll(0.0f, 0.0f, 1.0f);
        com.censivn.C3DEngine.g.u uVar7 = new com.censivn.C3DEngine.g.u();
        uVar7.j(1.0f);
        uVar7.k(1.0f);
        com.censivn.C3DEngine.g.s.a(gVar.p, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar7);
        com.censivn.C3DEngine.g.u uVar8 = new com.censivn.C3DEngine.g.u();
        uVar8.j(1.0f);
        uVar8.k(1.0f);
        com.censivn.C3DEngine.g.s.a(gVar.o, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar8);
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        this.n.L().y = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 80.0f);
        this.n.a_(com.censivn.C3DEngine.a.j + 10);
        this.j.L().y = com.censivn.C3DEngine.a.g - (64.0f * com.censivn.C3DEngine.a.a);
        this.k.L().y = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 80.0f);
        this.l.L().y = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 80.0f);
        this.m.L().y = com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 80.0f);
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
