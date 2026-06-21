package com.tsf.shell.f.e.i;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.VMessageManager;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GridLayoutNode extends BaseRenderable {
    private static TextureElement c = new TextureElement(0, false);
    private static TextureElement d = new TextureElement(0, false);
    private static TextureElement e = new TextureElement(0, false);
    private static TextureElement f = new TextureElement(0, false);
    private c g;
    private c h;
    private int i;
    private GridRenderable b = new GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f), false);
    public GridRenderable a = new GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f), false) { // from class: com.tsf.shell.f.e.i.GridLayoutNode.1
        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            if (a.d.id == 0) {
                com.censivn.C3DEngine.C3DEngine.g().a(a.d, GridLayoutData.d.mark_star_disable);
            }
        }
    };

    public GridLayoutNode() {
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
            com.censivn.C3DEngine.C3DEngine.g().a(GridLayoutRenderer);
        }
        if (GridLayoutParams.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(GridLayoutParams);
        }
        if (e.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(e);
        }
        if (f.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(f);
        }
    }

    private void f() {
        if (GridLayoutRenderer.id == 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(c, GridLayoutData.d.mark_star_enable);
        }
        if (e.id == 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(e, GridLayoutData.d.mark_little_star_w);
        }
        if (f.id == 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(f, GridLayoutData.d.mark_little_star_y);
        }
    }

    public void c() {
        this.b.scale().setAll(0.0f, 0.0f, 1.0f);
        this.g.e();
        this.h.e();
        this.a.visible(true);
    }

    public void b(int i) {
        GridLayoutNode();
        VMessageManager.postGLThreadRunnable(new Runnable() { // from class: com.tsf.shell.f.e.i.GridLayoutNode.2
            @Override // java.lang.Runnable
            public void run() {
                GridLayoutNode.this.b.textures().removeAll();
                GridLayoutNode.this.b.textures().addElement(a.c);
                GridLayoutNode.this.b.scale().setAll(0.0f, 0.0f, 1.0f);
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.i.GridLayoutNode.2.1
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        GridLayoutNode.this.a.visible(false);
                    }
                };
                dVar.l(1.0f);
                dVar.m(1.0f);
                dVar.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(GridLayoutNode.this.b);
                com.censivn.C3DEngine.b.g.TweenUtils.a(GridLayoutNode.this.b, 300, dVar);
                GridLayoutNode.this.g.d();
                GridLayoutNode.this.h.d();
            }
        }, i);
    }
}
