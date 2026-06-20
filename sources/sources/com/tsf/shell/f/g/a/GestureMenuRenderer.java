package com.tsf.shell.f.g.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.b;
import com.tsf.shell.f.e.CircleDotNode;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GestureMenuRenderer extends BaseRenderable {
    private static TextureElement b;
    private static TextureElement c;
    private static k d;
    private static TextureElement g;
    private com.censivn.C3DEngine.b.f.GridRenderable a;
    public BaseRenderable e;
    private boolean f;

    private static void a() {
        if (b == null) {
            Bitmap bitmapA = com.tsf.shell.utils.SelectionDotRenderer.a(true);
            b = com.censivn.C3DEngine.C3DEngine.g().a(bitmapA, false);
            bitmapA.recycle();
            Bitmap bitmapA2 = com.tsf.shell.utils.SelectionDotRenderer.a(false);
            c = com.censivn.C3DEngine.C3DEngine.g().a(bitmapA2, false);
            bitmapA2.recycle();
        }
    }

    public static void b() {
        if (b != null) {
            com.censivn.C3DEngine.C3DEngine.g().a(b);
            com.censivn.C3DEngine.C3DEngine.g().a(c);
            b = null;
            c = null;
        }
        if (d != null) {
            GestureMenuDrawerItem.a();
        }
    }

    public void c() {
        if (d == null) {
            d = new k();
            GestureMenuDrawerItem.position().x = com.censivn.C3DEngine.b.b.A.a(80.0f);
            GestureMenuDrawerItem.position().y = com.censivn.C3DEngine.b.b.A.a(80.0f);
        }
        this.f = true;
    }

    public void d() {
        this.f = false;
    }

    public GestureMenuRenderer(j jVar) {
        this.f = false;
        this.e = jVar;
        jVar.calAABB();
        jVar.position().y = 20.0f * com.censivn.C3DEngine.b.b.A.c;
        this.a = new com.censivn.C3DEngine.b.f.GridRenderable(com.tsf.shell.manager.g.LayoutDimensionConstants.c, com.tsf.shell.manager.g.LayoutDimensionConstants.c, false);
        this.a.position().y = (-83.0f) * com.censivn.C3DEngine.b.b.A.c;
        this.a.useVBO(false);
        this.a.textures().addElement(c);
        addChild(jVar);
        addChild(this.a);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this));
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildEnd() {
        if (this.f) {
            GestureMenuDrawerItem.dispatchDraw();
        }
    }

    public static com.censivn.C3DEngine.b.f.GridRenderable a(float f) {
        return new com.censivn.C3DEngine.b.f.GridRenderable(com.tsf.shell.manager.o.ButtonPresetManager.c.H * f, com.tsf.shell.manager.o.ButtonPresetManager.c.I * f, false);
    }

    public static int e() {
        return (int) (com.tsf.shell.manager.o.ButtonPresetManager.c.H * 0.9f);
    }

    public static int f() {
        return (int) (com.tsf.shell.manager.o.ButtonPresetManager.c.I * 0.9f);
    }

    public GestureMenuRenderer() {
        this(a(0.8f));
    }

    public GestureMenuRenderer(float f) {
        this(a(f));
    }

    public void g() {
        GestureMenuRenderer();
        this.a.textures().clear();
        this.a.textures().addElement(b);
    }

    public void h() {
        GestureMenuRenderer();
        this.a.textures().clear();
        this.a.textures().addElement(c);
    }

    public static TextureElement i() {
        if (g == null) {
            g = x.b(GestureMenuOverlay.d.effect_icon_standard);
        }
        return g;
    }

    public static void j() {
        if (g != null) {
            com.censivn.C3DEngine.C3DEngine.g().a(g);
            g = null;
        }
    }
}
