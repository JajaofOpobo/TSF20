package com.tsf.shell.f.h.a.a;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.h.a.c;
import com.tsf.shell.theme.inside.ThemeManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d implements b.a, c.a {
    public static int a;
    public static int b;
    public static int c;
    private com.tsf.shell.f.h.a.c d;
    private com.censivn.C3DEngine.b.b.a.b e;
    private e f;
    private a g;
    private f h;
    private com.tsf.shell.f.h.a.a.a.c i;
    private int k;
    private boolean j = false;
    private TextureElement l = new TextureElement(0, false);
    private TextureElement m = new TextureElement(0, false);

    public d(com.tsf.shell.f.h.a.c cVar) {
        this.d = cVar;
        a = (int) com.censivn.C3DEngine.b.b.a.a(170.0f);
        int iA = (int) com.censivn.C3DEngine.b.b.a.a(550.0f);
        c = iA;
        b = iA;
        this.f = new e(this) { // from class: com.tsf.shell.f.h.a.a.d.1
            @Override // com.tsf.shell.f.h.a.a.e, com.censivn.C3DEngine.b.e.c
            public void g() {
                super.g();
                d.this.d.u();
            }
        };
        this.e = new com.censivn.C3DEngine.b.b.a.b();
        this.i = new com.tsf.shell.f.h.a.a.a.c(this, cVar.c());
        this.g = new a();
        this.h = new f();
        this.e.setAABBPX(0.0f, com.censivn.C3DEngine.b.b.a.a(180.0f));
    }

    public void a(int i) {
        this.k = i;
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public int j() {
        return this.k;
    }

    public f k() {
        return this.h;
    }

    public void a(b bVar) {
        this.d.f();
        this.j = true;
        this.i.a(bVar);
        com.tsf.shell.manager.a.o.f();
        com.censivn.C3DEngine.b.c.b.a(this);
    }

    public void l() {
        if (this.j && this.i.c()) {
            this.d.g();
            this.j = false;
            com.tsf.shell.manager.a.o.g();
            com.censivn.C3DEngine.b.c.b.b(this);
        }
    }

    public TextureElement c(boolean z) {
        if (z) {
            if (this.m.id == 0) {
                Bitmap defaultBitmap = ThemeManager.mix.contact.getDefaultBitmap(b, b, true);
                com.censivn.C3DEngine.a.g().a(this.m, defaultBitmap);
                defaultBitmap.recycle();
            }
            return this.m;
        }
        if (this.l.id == 0) {
            Bitmap defaultBitmap2 = ThemeManager.mix.contact.getDefaultBitmap(a, a, false);
            com.censivn.C3DEngine.a.g().a(this.l, defaultBitmap2);
            defaultBitmap2.recycle();
        }
        return this.l;
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4 && this.j) {
            l();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void b() {
        l();
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void c() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void d() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void e() {
        this.i.d();
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void f() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void g() {
        com.censivn.C3DEngine.a.g().a(this.l);
        com.censivn.C3DEngine.a.g().a(this.m);
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void h() {
        if (this.i != null) {
            this.i.e();
        }
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void i() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public j a() {
        return this.e;
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void a(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.d.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    d.this.e.removeFromParent();
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.e);
            com.censivn.C3DEngine.b.g.c.a(this.e, 300, dVar);
            return;
        }
        com.censivn.C3DEngine.b.g.c.a(this.e);
        this.e.alpha(0.0f);
        this.e.removeFromParent();
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void b(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.e);
            com.censivn.C3DEngine.b.g.c.a(this.e, 300, dVar);
            return;
        }
        com.censivn.C3DEngine.b.g.c.a(this.e);
        this.e.alpha(255.0f);
    }
}
