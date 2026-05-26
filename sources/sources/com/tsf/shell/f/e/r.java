package com.tsf.shell.f.e;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class r extends com.censivn.C3DEngine.b.f.j {
    private a d;
    private com.censivn.C3DEngine.b.f.k e;
    private TextureElement a = new TextureElement(0, false);
    private TextureElement b = new TextureElement(0, false);
    private boolean f = false;
    private ArrayList<a> c = new ArrayList<>();

    public void a(int i) {
        if (!this.f) {
            this.f = true;
            if (this.a.id == 0) {
                com.censivn.C3DEngine.a.g().a(this.a, x.a(b.d.shell_number));
            }
            if (this.b.id == 0) {
                com.censivn.C3DEngine.a.g().a(this.b, x.a(b.d.shell_number_bg));
            }
            if (this.e == null) {
                this.e = new com.censivn.C3DEngine.b.f.k(252.0f * com.censivn.C3DEngine.b.b.a.c, 162.0f * com.censivn.C3DEngine.b.b.a.c, false);
                this.e.alpha(0.0f);
                addChild(this.e);
            }
            this.e.textures().clear();
            this.e.textures().addElement(this.b);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.e);
            com.censivn.C3DEngine.b.g.c.a(this.e, VEasing.Back.easeIn, dVar);
            if (parent() == null) {
                com.tsf.shell.manager.a.j.a(this);
            }
            b(i);
        }
    }

    public void a() {
        if (this.f) {
            this.f = false;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.r.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    com.tsf.shell.manager.a.j.b(r.this);
                    if (r.this.a.id != 0) {
                        com.censivn.C3DEngine.a.g().a(r.this.a);
                    }
                    if (r.this.b.id != 0) {
                        com.censivn.C3DEngine.a.g().a(r.this.b);
                    }
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.e);
            com.censivn.C3DEngine.b.g.c.a(this.e, VEasing.Back.easeIn, dVar);
            if (this.d != null) {
                this.d.b(0);
                this.d = null;
            }
        }
    }

    public void b(int i) {
        boolean z;
        if (this.d == null || this.d.h != i) {
            if (this.d != null) {
                this.d.c();
                z = false;
            } else {
                z = true;
            }
            this.d = b();
            this.d.a(z ? 0 : 1, i);
        }
    }

    private a b() {
        a aVarRemove;
        if (this.c.isEmpty()) {
            aVarRemove = new a();
        } else {
            aVarRemove = this.c.remove(0);
        }
        aVarRemove.textures().clear();
        aVarRemove.textures().addElement(this.a);
        return aVarRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        aVar.removeFromParent();
        aVar.textures().clear();
        this.c.add(aVar);
    }

    private class a extends com.censivn.C3DEngine.b.f.a.a {
        private com.censivn.C3DEngine.b.f.a.b c;
        private com.censivn.C3DEngine.b.f.a.b d;
        private float e;
        private float f;
        private int g;
        private int h;

        public a() {
            super(2, 80, VEasing.Linear.easeNone, 160);
            this.g = 0;
            this.c = a(0);
            this.c.a(0, 0, 1, 1, 80.0f * com.censivn.C3DEngine.b.b.a.c, 80.0f * com.censivn.C3DEngine.b.b.a.c);
            this.c.h();
            this.d = a(1);
            this.d.a(0, 0, 1, 1, 80.0f * com.censivn.C3DEngine.b.b.a.c, 80.0f * com.censivn.C3DEngine.b.b.a.c);
            this.d.h();
            this.e = (-200.0f) * com.censivn.C3DEngine.b.b.a.c;
            this.f = 200.0f * com.censivn.C3DEngine.b.b.a.c;
        }

        private void c(int i) {
            if (i < 10) {
                this.d.a((Boolean) false);
                this.c.i().x = 0.0f;
                this.c.a(i % 5, i / 5);
            } else {
                int i2 = i / 10;
                int i3 = i - (i2 * 10);
                this.d.a((Boolean) true);
                this.c.i().x = (-40.0f) * com.censivn.C3DEngine.b.b.a.c;
                this.c.a(i2 % 5, i2 / 5);
                this.d.i().x = 40.0f * com.censivn.C3DEngine.b.b.a.c;
                this.d.a(i3 % 5, i3 / 5);
            }
            this.c.h();
            this.d.h();
        }

        public void a(int i, int i2) {
            this.h = i2;
            this.g = i;
            alpha(0.0f);
            c(i2);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            switch (i) {
                case 0:
                    position().x = 0.0f;
                    break;
                case 1:
                    position().x = this.e;
                    break;
                case 2:
                    position().x = this.f;
                    break;
            }
            dVar.f(0.0f);
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, VEasing.Back.easeIn, dVar);
            r.this.addChild(this);
        }

        public void c() {
            b(this.g);
        }

        public void b(int i) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.r.a.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    r.this.a(a.this);
                }
            };
            switch (i) {
                case 0:
                    dVar.f(0.0f);
                    break;
                case 1:
                    dVar.f(this.f);
                    break;
                case 2:
                    dVar.f(this.e);
                    break;
            }
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, VEasing.Back.easeIn, dVar);
        }
    }
}
