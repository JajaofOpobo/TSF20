package com.tsf.shell.f.e.i;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.VMessageManager;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GridLayoutNode extends j {
    private static TextureElement c = new TextureElement(0, false);
    private static TextureElement d = new TextureElement(0, false);
    private static TextureElement e = new TextureElement(0, false);
    private static TextureElement f = new TextureElement(0, false);
    private c g;
    private c h;
    private int i;
    private k b = new k(com.censivn.C3DEngine.b.b.A.a(200.0f), com.censivn.C3DEngine.b.b.A.a(200.0f), false);
    public k a = new k(com.censivn.C3DEngine.b.b.A.a(200.0f), com.censivn.C3DEngine.b.b.A.a(200.0f), false) { // from class: com.tsf.shell.f.e.i.GridLayoutNode.1
        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (a.d.id == 0) {
                com.censivn.C3DEngine.A.g().a(a.d, GridLayoutData.d.mark_star_disable);
            }
        }
    };

    public a() {
        this.a.textures().addElement(GridLayoutParams);
        addChild(this.b);
        this.g = new GridLayoutRenderer();
        this.g.textures().addElement(e);
        addChild(this.g);
        this.h = new GridLayoutRenderer();
        this.h.textures().addElement(f);
        addChild(this.h);
    }

    public void a(float f2) {
        this.a.rotation().z = f2;
        this.b.rotation().z = f2;
    }

    public void a(int i) {
        this.i = i;
    }

    public int a() {
        return this.i;
    }

    public static void b() {
        if (GridLayoutRenderer.id != 0) {
            com.censivn.C3DEngine.A.g().a(GridLayoutRenderer);
        }
        if (GridLayoutParams.id != 0) {
            com.censivn.C3DEngine.A.g().a(GridLayoutParams);
        }
        if (e.id != 0) {
            com.censivn.C3DEngine.A.g().a(e);
        }
        if (f.id != 0) {
            com.censivn.C3DEngine.A.g().a(f);
        }
    }

    private void f() {
        if (GridLayoutRenderer.id == 0) {
            com.censivn.C3DEngine.A.g().a(c, GridLayoutData.d.mark_star_enable);
        }
        if (e.id == 0) {
            com.censivn.C3DEngine.A.g().a(e, GridLayoutData.d.mark_little_star_w);
        }
        if (f.id == 0) {
            com.censivn.C3DEngine.A.g().a(f, GridLayoutData.d.mark_little_star_y);
        }
    }

    public void c() {
        this.b.scale().setAll(0.0f, 0.0f, 1.0f);
        this.g.e();
        this.h.e();
        this.a.visible(true);
    }

    public void b(int i) {
        f();
        VMessageManager.postGLThreadRunnable(new Runnable() { // from class: com.tsf.shell.f.e.i.GridLayoutNode.2
            @Override // java.lang.Runnable
            public void run() {
                a.this.b.textures().removeAll();
                a.this.b.textures().addElement(a.c);
                a.this.b.scale().setAll(0.0f, 0.0f, 1.0f);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.i.GridLayoutNode.2.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        a.this.a.visible(false);
                    }
                };
                dVar.l(1.0f);
                dVar.m(1.0f);
                dVar.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(a.this.b);
                com.censivn.C3DEngine.b.g.c.a(a.this.b, 300, dVar);
                a.this.g.d();
                a.this.h.d();
            }
        }, i);
    }
}
