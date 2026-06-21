package com.tsf.shell.e.i.c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends i {
    private l k;
    private com.tsf.shell.e.i.b.d.b l;
    private d m;
    private d n;
    private d o;
    private TextureElement p = new TextureElement(0, false);
    private TextureElement q = new TextureElement(0, false);
    private TextureElement r = new TextureElement(0, false);
    private boolean s = true;
    private boolean t = true;
    private ArrayList u;
    private Runnable v;

    public c() {
        b(true);
        this.u = new ArrayList();
    }

    @Override // com.tsf.shell.e.i.c.i
    public void c() {
        this.s = true;
    }

    @Override // com.tsf.shell.e.i.c.i
    public void d() {
        this.s = false;
        q();
    }

    @Override // com.tsf.shell.e.i.c.i, com.tsf.shell.e.i.c.g
    public void e() {
        x xVar = new x() { // from class: com.tsf.shell.e.i.c.c.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                float alpha = c.this.m.a.alpha();
                c.this.m.a.alpha(alpha);
                c.this.n.a.alpha(alpha);
                c.this.o.a.alpha(alpha);
            }
        };
        xVar.a(0);
        w.a(this.m.a);
        w.a(this.m.a, 300, xVar);
    }

    @Override // com.tsf.shell.e.i.c.i, com.tsf.shell.e.i.c.g
    public void f() {
        x xVar = new x() { // from class: com.tsf.shell.e.i.c.c.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                float alpha = c.this.m.a.alpha();
                c.this.m.a.alpha(alpha);
                c.this.n.a.alpha(alpha);
                c.this.o.a.alpha(alpha);
            }
        };
        xVar.a(255);
        w.a(this.m.a);
        w.a(this.m.a, 300, xVar);
    }

    @Override // com.tsf.shell.e.i.c.i, com.tsf.shell.e.i.c.g
    public void b() {
        com.censivn.C3DEngine.a.g().a(this.p);
        com.censivn.C3DEngine.a.g().a(this.q);
        com.censivn.C3DEngine.a.g().a(this.r);
    }

    private void p() {
        if (this.p.id == 0) {
            int i = com.tsf.shell.manager.o.b.a.H;
            int i2 = com.tsf.shell.manager.o.b.a.I;
            com.censivn.C3DEngine.a.g().a(this.p, LauncherShortcutStandardInfo.createTextureBitmap(null, "", com.tsf.shell.utils.x.a(R.drawable.widget_item_folder_icon1, i, i2), com.tsf.shell.manager.o.b.a, i, i2, false));
            com.censivn.C3DEngine.a.g().a(this.q, LauncherShortcutStandardInfo.createTextureBitmap(null, "", com.tsf.shell.utils.x.a(R.drawable.widget_item_folder_icon2, i, i2), com.tsf.shell.manager.o.b.a, i, i2, false));
            com.censivn.C3DEngine.a.g().a(this.r, LauncherShortcutStandardInfo.createTextureBitmap(null, "", com.tsf.shell.utils.x.a(R.drawable.widget_item_folder_icon3, i, i2), com.tsf.shell.manager.o.b.a, i, i2, false));
        }
    }

    @Override // com.tsf.shell.e.i.c.i
    public j a(boolean z) {
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
        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.u.get(0);
        w.a(bVar);
        bVar.removeFromParent();
        this.l.aX().addChild(bVar);
        float f = (com.censivn.C3DEngine.b.b.a.c * 60.0f) / 2.0f;
        int size = this.u.size();
        float f2 = f;
        for (int i = 0; i < 2; i++) {
            com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) this.u.get((size - i) - 1);
            bVar2.removeFromParent();
            w.a(bVar2);
            this.k.addChild(bVar2);
            bVar2.rotation().z = 0.0f;
            bVar2.scale().setAll(0.4f, 0.4f, 1.0f);
            bVar2.position().x = (-160.0f) * com.censivn.C3DEngine.b.b.a.c;
            bVar2.position().y = f2;
            f2 -= com.censivn.C3DEngine.b.b.a.c * 60.0f;
        }
        this.l.aY();
        this.v = new Runnable() { // from class: com.tsf.shell.e.i.c.c.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.e.i.b.e.b bVar3 = (com.tsf.shell.e.i.b.e.b) c.this.u.get(2);
                Number3d.TEMPNUMBER3D.reset();
                bVar3.localToGlobal(Number3d.TEMPNUMBER3D);
                bVar3.position().setAllFrom(Number3d.TEMPNUMBER3D);
                c.this.l.e(bVar3);
                c.this.v = new Runnable() { // from class: com.tsf.shell.e.i.c.c.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.v = null;
                        com.tsf.shell.e.i.b.e.b bVar4 = (com.tsf.shell.e.i.b.e.b) c.this.u.get(1);
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

    private l r() {
        p();
        this.k = new l();
        this.l = new com.tsf.shell.e.i.b.d.b(new LauncherDrawerFolder3DInfo(true));
        this.k.addChild(this.l);
        this.m = new d(this);
        this.m.k.textures().addElement(this.p);
        this.n = new d(this);
        this.n.k.textures().addElement(this.q);
        this.o = new d(this);
        this.o.k.textures().addElement(this.r);
        this.u.add(this.m);
        this.u.add(this.n);
        this.u.add(this.o);
        float f = com.censivn.C3DEngine.b.b.a.c * (-60.0f);
        int size = this.u.size();
        float f2 = f;
        for (int i = 0; i < size; i++) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.u.get((size - i) - 1);
            bVar.position().x = (-160.0f) * com.censivn.C3DEngine.b.b.a.c;
            bVar.position().y = f2;
            Number3d scale = bVar.scale();
            bVar.scale().y = 0.4f;
            scale.x = 0.4f;
            f2 += 60.0f * com.censivn.C3DEngine.b.b.a.c;
            this.k.addChild(bVar);
        }
        return this.k;
    }
}
