package com.tsf.shell.workspace3D;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class r extends com.censivn.C3DEngine.b.aa {
    private com.censivn.C3DEngine.b.v e;
    private com.censivn.C3DEngine.b.v f;
    private com.censivn.C3DEngine.b.v g;
    private com.censivn.C3DEngine.b.v h;
    private com.censivn.C3DEngine.b.v i;
    private com.tsf.shell.workspace3D.e.p j;
    private ShellWallpaperManager k;
    private com.tsf.shell.workspace3D.h.l l;
    private com.tsf.shell.workspace3D.f.c m;
    private com.tsf.shell.workspace3D.k.b.k n;
    private al o;
    private q p;
    private com.tsf.shell.workspace3D.b.a q;
    private com.tsf.shell.workspace3D.g.ah r;
    private ap s;
    private com.tsf.shell.workspace3D.j.n t;
    private com.tsf.shell.workspace3D.h.ba u;
    private com.tsf.shell.e.b v;
    private boolean w;

    public r(GLSurfaceView gLSurfaceView) {
        super(gLSurfaceView);
        this.w = true;
        com.censivn.C3DEngine.a.a(gLSurfaceView);
        com.tsf.shell.workspace3D.k.b.ap.d();
        ThemeManager.initThemeManager();
        ArrayList arrayList = new ArrayList();
        com.tsf.shell.workspace3D.h.d.i.a = arrayList;
        arrayList.add(new com.tsf.shell.workspace3D.h.d.j());
        com.tsf.shell.workspace3D.h.d.i.a.add(new com.tsf.shell.workspace3D.h.d.b());
        com.tsf.shell.workspace3D.h.d.i.a.add(new com.tsf.shell.workspace3D.h.d.k());
        int c = com.tsf.shell.a.t.c();
        if (c < 0) {
            c = 0;
        } else if (c > com.tsf.shell.workspace3D.h.d.i.a.size() - 1) {
            c = com.tsf.shell.workspace3D.h.d.i.a.size() - 1;
        }
        com.tsf.shell.workspace3D.h.d.i.b = (com.tsf.shell.workspace3D.h.d.a) com.tsf.shell.workspace3D.h.d.i.a.get(c);
        com.tsf.shell.action.c.a(com.censivn.C3DEngine.a.c());
        com.tsf.shell.h.m mVar = (com.tsf.shell.h.m) gLSurfaceView.getParent();
        this.t = new com.tsf.shell.workspace3D.j.n();
        this.k = ShellWallpaperManager.a();
        this.s = new ap();
        this.o = new al(mVar);
        this.l = new com.tsf.shell.workspace3D.h.l();
        this.j = new com.tsf.shell.workspace3D.e.p();
        this.m = new com.tsf.shell.workspace3D.f.c();
        this.n = new com.tsf.shell.workspace3D.k.b.k();
        this.p = new q();
        this.q = new com.tsf.shell.workspace3D.b.a();
        this.r = new com.tsf.shell.workspace3D.g.ah();
        this.u = new com.tsf.shell.workspace3D.h.ba();
        this.v = new com.tsf.shell.e.b();
        if (Locale.getDefault().getLanguage().equals("zh")) {
            this.e = new com.censivn.C3DEngine.b.v();
            return;
        }
        try {
            this.e = (com.censivn.C3DEngine.b.v) com.tsf.shell.d.a.a().getVirtualTarget();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.censivn.C3DEngine.b.aa, com.censivn.C3DEngine.d.c
    public final void a() {
        com.tsf.shell.workspace3D.k.b.ap.d();
        com.tsf.shell.workspace3D.k.c.b.c.e();
        new com.tsf.shell.workspace3D.i.a();
        com.censivn.C3DEngine.b.m.d().a(new com.tsf.shell.workspace3D.a.a(new com.censivn.C3DEngine.b.v()));
        this.a.a();
        this.c.b().a.z = 1000.0f * com.censivn.C3DEngine.a.b;
        this.c.b().f = com.censivn.C3DEngine.a.m / this.c.b().a.z;
        this.a.c();
        this.h = new com.censivn.C3DEngine.b.v();
        this.i = new com.censivn.C3DEngine.b.v();
        this.g = new com.censivn.C3DEngine.b.v();
        ah.a = com.censivn.C3DEngine.h.a.b(com.censivn.C3DEngine.a.l);
        ah.b = com.censivn.C3DEngine.h.a.b(com.censivn.C3DEngine.a.m);
        ah.e = false;
        ah.c = ah.a;
        ah.d = ah.b;
        if (ah.c > com.censivn.C3DEngine.a.l) {
            ah.c = com.censivn.C3DEngine.a.l;
        } else {
            ah.e = true;
        }
        if (ah.d > com.censivn.C3DEngine.a.m) {
            ah.d = com.censivn.C3DEngine.a.m;
        } else {
            ah.e = true;
        }
        com.tsf.shell.tips.b.a();
        com.tsf.shell.workspace3D.j.n nVar = this.t;
        this.j.a(this.h);
        this.k.e();
        this.o.a(this.c);
        this.f = this.l.c();
        this.m.a(this.g);
        this.n.a(this.i);
        this.u.a(this.g);
        com.tsf.shell.workspace3D.b.a aVar = this.q;
        this.c.d(this.k.j());
        this.e.d(this.f);
        this.e.d(this.h);
        this.e.d(this.i);
        this.e.d(this.g);
        this.c.d(this.e);
        com.tsf.shell.setting.a.v.a();
        com.tsf.shell.setting.a.g.a();
        ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
        Bitmap bitmap = themeShellDescription.getBitmap(ThemeShellDescription.WIDGET_ANDROID_RESIZE_MATCH_BOX);
        TextureElement a = com.censivn.C3DEngine.a.f().a(bitmap, true);
        com.tsf.shell.workspace3D.g.f.e = a;
        com.tsf.shell.workspace3D.g.f.a = a.id;
        bitmap.recycle();
        Bitmap bitmap2 = themeShellDescription.getBitmap(ThemeShellDescription.WIDGET_ANDROID_RESIZE_UNMATCH_BOX);
        TextureElement a2 = com.censivn.C3DEngine.a.f().a(bitmap2, true);
        com.tsf.shell.workspace3D.g.f.f = a2;
        com.tsf.shell.workspace3D.g.f.b = a2.id;
        bitmap2.recycle();
        Bitmap bitmap3 = themeShellDescription.getBitmap(ThemeShellDescription.WIDGET_TSF_RESIZE_BOX);
        TextureElement a3 = com.censivn.C3DEngine.a.f().a(bitmap3, true);
        com.tsf.shell.workspace3D.g.f.g = a3;
        com.tsf.shell.workspace3D.g.f.c = a3.id;
        bitmap3.recycle();
        Bitmap bitmap4 = themeShellDescription.getBitmap(ThemeShellDescription.WIDGET_BORDER_BOX);
        TextureElement a4 = com.censivn.C3DEngine.a.f().a(bitmap4, true);
        com.tsf.shell.workspace3D.g.f.h = a4;
        com.tsf.shell.workspace3D.g.f.d = a4.id;
        bitmap4.recycle();
        com.tsf.shell.workspace3D.g.ao.j();
        com.tsf.shell.workspace3D.g.aj.k();
        com.tsf.shell.workspace3D.g.a.a();
        u.a(this.c);
        bf.a().b();
    }

    public final boolean d() {
        return this.e.au();
    }

    public final void a(boolean z) {
        this.e.e(z);
    }

    public final q e() {
        return this.p;
    }

    public final com.tsf.shell.workspace3D.k.b.k f() {
        return this.n;
    }

    public final com.tsf.shell.workspace3D.h.ba g() {
        return this.u;
    }

    public final com.tsf.shell.workspace3D.f.c h() {
        return this.m;
    }

    public final com.tsf.shell.workspace3D.h.l i() {
        return this.l;
    }

    public final al j() {
        return this.o;
    }

    public final com.tsf.shell.workspace3D.j.n k() {
        return this.t;
    }

    public final com.tsf.shell.workspace3D.b.a l() {
        return this.q;
    }

    public final ShellWallpaperManager m() {
        return this.k;
    }

    public final ap n() {
        return this.s;
    }

    public final com.tsf.shell.workspace3D.e.p o() {
        return this.j;
    }

    public final boolean p() {
        return this.w;
    }

    public final void a(Runnable runnable) {
        this.w = false;
        this.n.d(true);
        this.j.D();
        this.u.d();
        s sVar = new s(this, runnable);
        com.tsf.shell.workspace3D.h.a k = this.l.k();
        if (k instanceof com.tsf.shell.workspace3D.h.a.x) {
            ((com.tsf.shell.workspace3D.h.a.x) k).bF();
        }
        k.bj();
        com.censivn.C3DEngine.g.s.a(k);
        com.censivn.C3DEngine.g.s.a(k, 250, sVar);
        this.f.e(false);
    }

    public final void a(Runnable runnable, boolean z) {
        this.n.c(z);
        this.j.E();
        this.u.e();
        this.f.a((Boolean) true);
        com.tsf.shell.workspace3D.h.a k = this.l.k();
        t tVar = new t(this, runnable, k);
        com.censivn.C3DEngine.g.s.a(k);
        k.bk();
        int i = z ? 400 : 0;
        tVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.i());
        com.censivn.C3DEngine.g.s.a(k, i, tVar);
    }

    @Override // com.censivn.C3DEngine.b.aa
    public final void b() {
        this.l.I();
        com.tsf.shell.workspace3D.b.a aVar = this.q;
    }

    @Override // com.censivn.C3DEngine.b.aa
    public final void c() {
        this.l.J();
        com.tsf.shell.workspace3D.b.a aVar = this.q;
    }
}
