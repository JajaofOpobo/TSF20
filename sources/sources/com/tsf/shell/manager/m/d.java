package com.tsf.shell.manager.m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.f.e.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends com.tsf.shell.f.e.e.d {
    private TextureElement b;
    private k d;
    private k e;
    private b f;
    private double h;
    private double g = 0.10471975511965977d;
    private boolean j = false;
    private com.censivn.C3DEngine.b.g.b.b i = new com.censivn.C3DEngine.b.g.b.b();
    private TextureElement a = new TextureElement(0, false);
    private j c = new com.tsf.shell.f.e.e.d();

    public d(b bVar) {
        boolean z = false;
        this.f = bVar;
        this.d = new k(com.censivn.C3DEngine.b.b.a.a(24.0f), com.censivn.C3DEngine.b.b.a.a(45.0f), z) { // from class: com.tsf.shell.manager.m.d.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (d.this.a.id == 0) {
                    com.censivn.C3DEngine.a.g().a(d.this.a, b.d.scrollcontainer_arrow);
                }
            }
        };
        this.d.textures().addElement(this.a);
        com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.manager.m.d.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                d.this.f.l();
            }
        };
        this.d.alpha(200.0f);
        this.d.calAABB(8.0f, 8.0f, 1.0f);
        this.d.setMouseEventListener(aVar);
        com.tsf.shell.manager.a.k.b(this);
        this.b = new TextureElement(0, false);
        this.e = new k(com.censivn.C3DEngine.b.b.a.a(70.0f), com.censivn.C3DEngine.b.b.a.a(70.0f), z) { // from class: com.tsf.shell.manager.m.d.3
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (d.this.b.id == 0) {
                    com.censivn.C3DEngine.a.g().a(d.this.b, b.d.side_menu_add_button);
                }
                float fSin = 0.8f + ((float) (Math.sin(d.this.h) * 0.20000000298023224d));
                d.this.h += d.this.g;
                scale().setAll(fSin, fSin, 1.0f);
            }
        };
        this.e.textures().addElement(this.b);
        this.c.position().x = com.censivn.C3DEngine.b.b.a.a(28.0f);
        addChild(this.d);
        addChild(this.c);
        this.c.addChild(this.e);
        this.c.visible(false);
        calAABB();
    }

    @Override // com.tsf.shell.f.e.e.d, com.tsf.shell.f.e.f
    public boolean b(f fVar) {
        return b(fVar);
    }

    @Override // com.tsf.shell.f.e.e.d, com.tsf.shell.f.e.f
    public boolean a(f fVar, float f, float f2) {
        return a(fVar, f, f2);
    }

    @Override // com.tsf.shell.f.e.e.d, com.tsf.shell.f.e.f
    public void a(f fVar) {
        a(fVar);
    }

    public void a(final float f, boolean z) {
        com.censivn.C3DEngine.b.g.c.a(this.i);
        if (z) {
            final float f2 = this.d.rotation().z;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.m.d.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f3) {
                    d.this.d.rotation().z = f2 + ((f - f2) * f3);
                }
            };
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.c.a(this.i, 500, dVar);
            return;
        }
        this.d.rotation().z = f;
    }

    public void d_() {
        if (!this.j) {
            this.j = true;
            if (!this.c.visible()) {
                this.c.alpha(0.0f);
                this.c.scale().setAll(0.0f, 0.0f, 1.0f);
            }
            this.c.visible(true);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(this.c);
            com.censivn.C3DEngine.b.g.c.a(this.c, 300, dVar);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.f(com.censivn.C3DEngine.b.b.a.a(100.0f));
            dVar2.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 300, dVar2);
        }
    }

    public void b() {
        if (this.j) {
            this.j = false;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.m.d.5
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    d.this.c.visible(false);
                }
            };
            dVar.a(0);
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.c);
            com.censivn.C3DEngine.b.g.c.a(this.c, 300, dVar);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.f(0.0f);
            dVar2.a(VEasing.Back.easeIn);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 300, dVar2);
        }
    }

    public void c() {
        if (this.a.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.a);
        }
        if (this.b.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.b);
        }
    }
}
