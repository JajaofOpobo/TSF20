package com.tsf.shell.f.i.c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends g {
    private j k;
    private com.tsf.shell.f.i.b.d.b l;
    private a m;
    private a n;
    private a o;
    private TextureElement p = new TextureElement(0, false);
    private TextureElement q = new TextureElement(0, false);
    private TextureElement r = new TextureElement(0, false);
    private boolean s = true;
    private boolean t = true;
    private ArrayList<com.tsf.shell.f.i.b.e.b> u;
    private Runnable v;

    public c() {
        b(true);
        this.u = new ArrayList<>();
    }

    @Override // com.tsf.shell.f.i.c.g
    public void c() {
        this.s = true;
    }

    @Override // com.tsf.shell.f.i.c.g
    public void d() {
        this.s = false;
        q();
    }

    @Override // com.tsf.shell.f.i.c.g, com.tsf.shell.f.i.c.e
    public void e() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.c.c.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                float fAlpha = c.this.m.a.alpha();
                c.this.m.a.alpha(fAlpha);
                c.this.n.a.alpha(fAlpha);
                c.this.o.a.alpha(fAlpha);
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.m.a);
        com.censivn.C3DEngine.b.g.c.a(this.m.a, 300, dVar);
    }

    @Override // com.tsf.shell.f.i.c.g, com.tsf.shell.f.i.c.e
    public void f() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.c.c.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                float fAlpha = c.this.m.a.alpha();
                c.this.m.a.alpha(fAlpha);
                c.this.n.a.alpha(fAlpha);
                c.this.o.a.alpha(fAlpha);
            }
        };
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.m.a);
        com.censivn.C3DEngine.b.g.c.a(this.m.a, 300, dVar);
    }

    @Override // com.tsf.shell.f.i.c.g, com.tsf.shell.f.i.c.e
    public void b() {
        com.censivn.C3DEngine.a.g().a(this.p);
        com.censivn.C3DEngine.a.g().a(this.q);
        com.censivn.C3DEngine.a.g().a(this.r);
    }

    private void p() {
        if (this.p.id == 0) {
            int i = com.tsf.shell.manager.o.b.a.H;
            int i2 = com.tsf.shell.manager.o.b.a.I;
            com.censivn.C3DEngine.a.g().a(this.p, LauncherShortcutStandardInfo.createTextureBitmap(null, "", x.a(b.d.widget_item_folder_icon1, i, i2), com.tsf.shell.manager.o.b.a, i, i2, false));
            com.censivn.C3DEngine.a.g().a(this.q, LauncherShortcutStandardInfo.createTextureBitmap(null, "", x.a(b.d.widget_item_folder_icon2, i, i2), com.tsf.shell.manager.o.b.a, i, i2, false));
            com.censivn.C3DEngine.a.g().a(this.r, LauncherShortcutStandardInfo.createTextureBitmap(null, "", x.a(b.d.widget_item_folder_icon3, i, i2), com.tsf.shell.manager.o.b.a, i, i2, false));
        }
    }

    @Override // com.tsf.shell.f.i.c.g
    public i a(boolean z) {
        if (this.k == null) {
            this.k = r();
        } else {
            p();
        }
        return this.k;
    }

    private void q() {
        if (this.v != null) {
            com.censivn.C3DEngine.a.a().g(this.v);
        }
        com.tsf.shell.f.i.b.e.b bVar = this.u.get(0);
        com.censivn.C3DEngine.b.g.c.a(bVar);
        bVar.removeFromParent();
        this.l.aX().addChild(bVar);
        float f = (com.censivn.C3DEngine.b.b.a.c * 60.0f) / 2.0f;
        int size = this.u.size();
        float f2 = f;
        for (int i = 0; i < 2; i++) {
            com.tsf.shell.f.i.b.e.b bVar2 = this.u.get((size - i) - 1);
            bVar2.removeFromParent();
            com.censivn.C3DEngine.b.g.c.a(bVar2);
            this.k.addChild(bVar2);
            bVar2.rotation().z = 0.0f;
            bVar2.scale().setAll(0.4f, 0.4f, 1.0f);
            bVar2.position().x = (-160.0f) * com.censivn.C3DEngine.b.b.a.c;
            bVar2.position().y = f2;
            f2 -= com.censivn.C3DEngine.b.b.a.c * 60.0f;
        }
        this.l.aY();
        this.v = new Runnable() { // from class: com.tsf.shell.f.i.c.c.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.f.i.b.e.b bVar3 = (com.tsf.shell.f.i.b.e.b) c.this.u.get(2);
                Number3d.TEMPNUMBER3D.reset();
                bVar3.localToGlobal(Number3d.TEMPNUMBER3D);
                bVar3.position().setAllFrom(Number3d.TEMPNUMBER3D);
                c.this.l.e(bVar3);
                c.this.v = new Runnable() { // from class: com.tsf.shell.f.i.c.c.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.v = null;
                        com.tsf.shell.f.i.b.e.b bVar4 = (com.tsf.shell.f.i.b.e.b) c.this.u.get(1);
                        Number3d.TEMPNUMBER3D.reset();
                        bVar4.localToGlobal(Number3d.TEMPNUMBER3D);
                        bVar4.position().setAllFrom(Number3d.TEMPNUMBER3D);
                        c.this.l.e(bVar4);
                    }
                };
                com.censivn.C3DEngine.a.a().b(c.this.v, 1000L);
            }
        };
        com.censivn.C3DEngine.a.a().b(this.v, 1000L);
    }

    private j r() {
        p();
        this.k = new j();
        this.l = new com.tsf.shell.f.i.b.d.b(new LauncherDrawerFolder3DInfo(true));
        this.k.addChild(this.l);
        this.m = new a();
        this.m.k.textures().addElement(this.p);
        this.n = new a();
        this.n.k.textures().addElement(this.q);
        this.o = new a();
        this.o.k.textures().addElement(this.r);
        this.u.add(this.m);
        this.u.add(this.n);
        this.u.add(this.o);
        float f = com.censivn.C3DEngine.b.b.a.c * (-60.0f);
        int size = this.u.size();
        float f2 = f;
        for (int i = 0; i < size; i++) {
            com.tsf.shell.f.i.b.e.b bVar = this.u.get((size - i) - 1);
            bVar.position().x = (-160.0f) * com.censivn.C3DEngine.b.b.a.c;
            bVar.position().y = f2;
            Number3d number3dScale = bVar.scale();
            bVar.scale().y = 0.4f;
            number3dScale.x = 0.4f;
            f2 += 60.0f * com.censivn.C3DEngine.b.b.a.c;
            this.k.addChild(bVar);
        }
        return this.k;
    }

    class a extends com.tsf.shell.f.i.b.e.b {
        public j a;

        public a() {
            super(null, com.tsf.shell.manager.o.b.a);
            this.a = new j();
            this.k.visible(true);
            this.k.removeFromParent();
            this.a.addChild(this.k);
            addChild(this.a);
        }

        @Override // com.tsf.shell.f.i.b.e.b
        public void k() {
        }
    }
}
