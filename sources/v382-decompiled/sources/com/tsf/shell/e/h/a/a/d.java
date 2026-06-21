package com.tsf.shell.e.h.a.a;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
public class d implements com.censivn.C3DEngine.b.c.d, com.tsf.shell.e.h.a.d {
    public static int a;
    public static int b;
    public static int c;
    private com.tsf.shell.e.h.a.c d;
    private com.censivn.C3DEngine.b.b.a.b e;
    private e f;
    private a g;
    private f h;
    private com.tsf.shell.e.h.a.a.a.c i;
    private int k;
    private boolean j = false;
    private TextureElement l = new TextureElement(0, false);
    private TextureElement m = new TextureElement(0, false);

    public d(com.tsf.shell.e.h.a.c cVar) {
        this.d = cVar;
        a = (int) com.censivn.C3DEngine.b.b.a.a(170.0f);
        int a2 = (int) com.censivn.C3DEngine.b.b.a.a(550.0f);
        c = a2;
        b = a2;
        this.f = new e(this) { // from class: com.tsf.shell.e.h.a.a.d.1
            @Override // com.tsf.shell.e.h.a.a.e, com.censivn.C3DEngine.b.e.f
            public void g() {
                super.g();
                d.this.d.u();
            }
        };
        this.e = new com.censivn.C3DEngine.b.b.a.b();
        this.i = new com.tsf.shell.e.h.a.a.a.c(this, cVar.c());
        this.g = new a();
        this.h = new f();
        this.e.addChild(this.g);
        this.e.addChild(this.h);
        this.e.setAABBPX(0.0f, com.censivn.C3DEngine.b.b.a.a(180.0f));
    }

    public void a(int i) {
        this.k = i;
    }

    @Override // com.tsf.shell.e.h.a.d
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
        com.censivn.C3DEngine.b.c.c.a(this);
    }

    public void l() {
        if (this.j && this.i.c()) {
            this.d.g();
            this.j = false;
            com.tsf.shell.manager.a.o.g();
            com.censivn.C3DEngine.b.c.c.b(this);
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

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4 && this.j) {
            l();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.tsf.shell.e.h.a.d
    public void b() {
        l();
    }

    @Override // com.tsf.shell.e.h.a.d
    public void c() {
        this.g.a();
        this.h.a();
    }

    @Override // com.tsf.shell.e.h.a.d
    public void d() {
        this.g.b();
        this.h.b();
    }

    @Override // com.tsf.shell.e.h.a.d
    public void e() {
        this.g.d();
        this.h.d();
        this.i.d();
    }

    @Override // com.tsf.shell.e.h.a.d
    public void f() {
        this.g.e();
        this.h.e();
    }

    @Override // com.tsf.shell.e.h.a.d
    public void g() {
        com.censivn.C3DEngine.a.g().a(this.l);
        com.censivn.C3DEngine.a.g().a(this.m);
    }

    @Override // com.tsf.shell.e.h.a.d
    public void h() {
        if (this.i != null) {
            this.i.e();
        }
    }

    @Override // com.tsf.shell.e.h.a.d
    public void i() {
        this.f.d();
    }

    @Override // com.tsf.shell.e.h.a.d
    public l a() {
        return this.e;
    }

    @Override // com.tsf.shell.e.h.a.d
    public void a(boolean z) {
        if (z) {
            x xVar = new x() { // from class: com.tsf.shell.e.h.a.a.d.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    d.this.e.removeFromParent();
                }
            };
            xVar.a(0);
            w.a(this.e);
            w.a(this.e, 300, xVar);
            return;
        }
        w.a(this.e);
        this.e.alpha(0.0f);
        this.e.removeFromParent();
    }

    @Override // com.tsf.shell.e.h.a.d
    public void b(boolean z) {
        if (z) {
            x xVar = new x();
            xVar.a(255);
            w.a(this.e);
            w.a(this.e, 300, xVar);
            return;
        }
        w.a(this.e);
        this.e.alpha(255.0f);
    }
}
