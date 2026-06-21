package com.tsf.shell.manager.m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import com.tsf.shell.e.e.e.h;
import com.tsf.shell.e.e.g;

/* loaded from: classes.dex */
public class e extends h {
    private TextureElement b;
    private m d;
    private m e;
    private c f;
    private double h;
    private double g = 0.10471975511965977d;
    private boolean j = false;
    private com.censivn.C3DEngine.b.g.b.b i = new com.censivn.C3DEngine.b.g.b.b();
    private TextureElement a = new TextureElement(0, false);
    private l c = new h();

    public e(c cVar) {
        boolean z = false;
        this.f = cVar;
        this.d = new m(com.censivn.C3DEngine.b.b.a.a(24.0f), com.censivn.C3DEngine.b.b.a.a(45.0f), z) { // from class: com.tsf.shell.manager.m.e.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (e.this.a.id == 0) {
                    com.censivn.C3DEngine.a.g().a(e.this.a, R.drawable.scrollcontainer_arrow);
                }
            }
        };
        this.d.textures().addElement(this.a);
        com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.manager.m.e.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                e.this.f.l();
            }
        };
        this.d.alpha(200.0f);
        this.d.calAABB(8.0f, 8.0f, 1.0f);
        this.d.setMouseEventListener(aVar);
        com.tsf.shell.manager.a.k.b(this);
        this.b = new TextureElement(0, false);
        this.e = new m(com.censivn.C3DEngine.b.b.a.a(70.0f), com.censivn.C3DEngine.b.b.a.a(70.0f), z) { // from class: com.tsf.shell.manager.m.e.3
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (e.this.b.id == 0) {
                    com.censivn.C3DEngine.a.g().a(e.this.b, R.drawable.side_menu_add_button);
                }
                float sin = 0.8f + ((float) (Math.sin(e.this.h) * 0.20000000298023224d));
                e.this.h += e.this.g;
                scale().setAll(sin, sin, 1.0f);
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

    @Override // com.tsf.shell.e.e.e.h, com.tsf.shell.e.e.g
    public boolean b(g gVar) {
        return b(gVar);
    }

    @Override // com.tsf.shell.e.e.e.h, com.tsf.shell.e.e.g
    public boolean a(g gVar, float f, float f2) {
        return a(gVar, f, f2);
    }

    @Override // com.tsf.shell.e.e.e.h, com.tsf.shell.e.e.g
    public void a(g gVar) {
        a(gVar);
    }

    public void a(final float f, boolean z) {
        w.a(this.i);
        if (z) {
            final float f2 = this.d.rotation().z;
            x xVar = new x() { // from class: com.tsf.shell.manager.m.e.4
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f3) {
                    e.this.d.rotation().z = f2 + ((f - f2) * f3);
                }
            };
            xVar.a(com.censivn.C3DEngine.b.g.a.e);
            w.a(this.i, 500, xVar);
            return;
        }
        this.d.rotation().z = f;
    }

    public void b_() {
        if (!this.j) {
            this.j = true;
            if (!this.c.visible()) {
                this.c.alpha(0.0f);
                this.c.scale().setAll(0.0f, 0.0f, 1.0f);
            }
            this.c.visible(true);
            x xVar = new x();
            xVar.a(255);
            xVar.l(1.0f);
            xVar.m(1.0f);
            w.a(this.c);
            w.a(this.c, 300, xVar);
            x xVar2 = new x();
            xVar2.f(com.censivn.C3DEngine.b.b.a.a(100.0f));
            xVar2.a(0);
            w.a(this.d);
            w.a(this.d, 300, xVar2);
        }
    }

    public void b() {
        if (this.j) {
            this.j = false;
            x xVar = new x() { // from class: com.tsf.shell.manager.m.e.5
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    e.this.c.visible(false);
                }
            };
            xVar.a(0);
            xVar.l(0.0f);
            xVar.m(0.0f);
            w.a(this.c);
            w.a(this.c, 300, xVar);
            x xVar2 = new x();
            xVar2.f(0.0f);
            xVar2.a(VEasing.Back.easeIn);
            w.a(this.d);
            w.a(this.d, 300, xVar2);
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
