package com.tsf.shell.f.i.b.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.manager.action.b;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class j extends b {
    private com.tsf.shell.manager.action.toggle.b a;
    private k b;
    private TextureElement p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private int u;
    private com.censivn.C3DEngine.b.f.a.b v;
    private com.censivn.C3DEngine.b.f.a.b w;
    private String x;

    public j(com.tsf.shell.manager.action.toggle.b bVar) {
        super(null, com.tsf.shell.manager.o.b.b);
        this.q = 0;
        this.r = -1;
        this.s = false;
        this.t = 0;
        this.u = 0;
        this.a = bVar;
        this.p = new TextureElement(0, false);
        this.b = new k(this.n.H, this.n.I, false) { // from class: com.tsf.shell.f.i.b.e.j.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (j.this.q == 1) {
                    rotation().z += 5.0f;
                }
            }
        };
        float a = com.censivn.C3DEngine.b.b.a.a(4.0f);
        this.b.position().y = this.n.Y - a;
        addChild(this.b);
        this.b.visible(false);
        this.v = this.k.a(0);
        this.v.i().y -= a;
        this.v.h();
        this.w = this.k.a(1);
        this.k.visible(false);
        this.k.textures().addElement(this.p);
        b.a b = com.tsf.shell.manager.action.toggle.a.b(this.a.a);
        this.x = b.b;
        int i = b.c;
        this.u = i;
        this.t = i;
    }

    public TextureElement q() {
        return this.p;
    }

    @Override // com.tsf.shell.f.i.b
    public void j() {
    }

    @Override // com.tsf.shell.f.i.b
    public void q_() {
    }

    public void aV() {
        this.a.c();
    }

    public void b(int i) {
        this.t = i;
    }

    private void aY() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.e.j.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.a.g().a(j.this.p);
                j.this.aW();
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.e.j.2.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                    }
                };
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.c.a(j.this.v);
                com.censivn.C3DEngine.b.g.c.a(j.this.v, 300, dVar2);
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.v);
        com.censivn.C3DEngine.b.g.c.a(this.v, 300, dVar);
    }

    public void c(int i) {
        this.q = i;
        invalidate();
    }

    @Override // com.tsf.shell.f.i.b.e.b, com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.r != this.q) {
            this.r = this.q;
            switch (this.q) {
                case 0:
                    com.tsf.shell.manager.o.c.a(this.k, com.tsf.shell.manager.o.c.g);
                    com.tsf.shell.manager.o.c.a(this.b, com.tsf.shell.manager.o.c.g);
                    this.b.setAnimationObjectState(false);
                    this.b.textures().clear();
                    this.b.textures().addElement(com.tsf.shell.manager.a.d.c.b());
                    break;
                case 1:
                    this.b.textures().clear();
                    this.b.textures().addElement(com.tsf.shell.manager.a.d.c.c());
                    this.b.setAnimationObjectState(true);
                    break;
                case 2:
                    com.tsf.shell.manager.o.c.a(this.k, com.tsf.shell.manager.o.c.e);
                    com.tsf.shell.manager.o.c.a(this.b, com.tsf.shell.manager.o.c.e);
                    this.b.setAnimationObjectState(false);
                    this.b.textures().clear();
                    this.b.textures().addElement(com.tsf.shell.manager.a.d.c.b());
                    break;
            }
        }
        if (this.u != this.t) {
            this.u = this.t;
            aY();
        }
    }

    public void aW() {
        if (this.p.id == 0) {
            Bitmap createBitmap = Bitmap.createBitmap(this.n.H, this.n.I, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Bitmap a = x.a(this.u, com.censivn.C3DEngine.b.b.a.a(96.0f), com.censivn.C3DEngine.b.b.a.a(96.0f));
            canvas.drawBitmap(a, (createBitmap.getWidth() - a.getWidth()) / 2, (createBitmap.getHeight() - a.getHeight()) / 2, (Paint) null);
            a.recycle();
            Bitmap createTextureBitmap = LauncherShortcutStandardInfo.createTextureBitmap(this.x, createBitmap, this.n, false);
            createBitmap.recycle();
            com.censivn.C3DEngine.a.g().a(this.p, createTextureBitmap);
            createTextureBitmap.recycle();
        }
        if (this.b.textures().size() == 0) {
            this.b.textures().addElement(com.tsf.shell.manager.a.d.c.b());
        }
        this.b.visible(true);
        this.k.visible(true);
    }

    public void aX() {
        if (this.p.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.p);
        }
    }

    @Override // com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void g() {
        this.b.textures().clear();
        super.g();
    }

    @Override // com.tsf.shell.f.i.b.e.b
    protected void k() {
    }
}
