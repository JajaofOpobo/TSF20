package com.tsf.shell.workspace3D;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public final class d {
    private TextureElement a;
    private com.censivn.C3DEngine.e.a.c b;
    private com.censivn.C3DEngine.e.a.a c;
    private Runnable d;
    private Runnable e;
    private Runnable f;
    private int g = 0;
    private int h = ThemeShellDescription.PAGE_PREVIEW_SELECT;
    private int i = 0;

    public final void a() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_SELECT_COUNT_DOWN);
        this.a = com.censivn.C3DEngine.a.f().a(this.a, bitmap);
        bitmap.recycle();
    }

    public d() {
        a();
        this.c = new com.censivn.C3DEngine.e.a.a(1, 64, 128, 64);
        this.c.z().c(this.a);
        this.b = this.c.a(0);
        this.b.c(1, 1);
        this.b.a(0, 0);
        this.b.e();
        this.d = new e(this);
        this.f = new f(this);
        this.e = new g(this);
    }

    public final com.censivn.C3DEngine.e.a.a b() {
        return this.c;
    }

    public final void c() {
        if (d()) {
            com.censivn.C3DEngine.a.a().f(this.e);
            a(this.f);
        }
    }

    public final boolean d() {
        return this.c.P() != null;
    }

    public final void e() {
        if (this.c.P() == null) {
            this.c.N().setAll(0.0f, 0.0f, 1.0f);
        }
        a(1);
        f();
        this.i = 1;
        this.h = 600;
        com.censivn.C3DEngine.a.a().f(this.e);
        com.censivn.C3DEngine.a.a().b(this.e, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.b.a(i, 0);
        this.b.d();
    }

    static /* synthetic */ void c(d dVar, int i) {
        dVar.g = i;
        dVar.a(dVar.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        h hVar = new h(this, runnable);
        hVar.j(0.0f);
        hVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(this.c);
        com.censivn.C3DEngine.g.s.a(this.c, 150, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        i iVar = new i(this);
        iVar.j(1.0f);
        iVar.k(1.0f);
        com.censivn.C3DEngine.g.s.a(this.c);
        com.censivn.C3DEngine.g.s.a(this.c, 150, iVar);
    }
}
