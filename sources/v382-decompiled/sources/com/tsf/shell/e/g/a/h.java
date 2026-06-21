package com.tsf.shell.e.g.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.R;
import com.tsf.shell.e.e.n;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class h extends l {
    private static TextureElement b;
    private static TextureElement c;
    private static n d;
    private static TextureElement g;
    private m a;
    public l e;
    private boolean f;

    private static void a() {
        if (b == null) {
            Bitmap a = com.tsf.shell.utils.e.a(true);
            b = com.censivn.C3DEngine.a.g().a(a, false);
            a.recycle();
            Bitmap a2 = com.tsf.shell.utils.e.a(false);
            c = com.censivn.C3DEngine.a.g().a(a2, false);
            a2.recycle();
        }
    }

    public static void b() {
        if (b != null) {
            com.censivn.C3DEngine.a.g().a(b);
            com.censivn.C3DEngine.a.g().a(c);
            b = null;
            c = null;
        }
        if (d != null) {
            d.a();
        }
    }

    public void c() {
        if (d == null) {
            d = new n();
            d.position().x = com.censivn.C3DEngine.b.b.a.a(80.0f);
            d.position().y = com.censivn.C3DEngine.b.b.a.a(80.0f);
        }
        this.f = true;
    }

    public void d() {
        this.f = false;
    }

    public h(l lVar) {
        this.f = false;
        this.e = lVar;
        lVar.calAABB();
        lVar.position().y = 20.0f * com.censivn.C3DEngine.b.b.a.c;
        this.a = new m(com.tsf.shell.manager.g.a.c, com.tsf.shell.manager.g.a.c, false);
        this.a.position().y = (-83.0f) * com.censivn.C3DEngine.b.b.a.c;
        this.a.useVBO(false);
        this.a.textures().addElement(c);
        addChild(lVar);
        addChild(this.a);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this));
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        if (this.f) {
            d.dispatchDraw();
        }
    }

    public static m a(float f) {
        return new m(com.tsf.shell.manager.o.b.c.H * f, com.tsf.shell.manager.o.b.c.I * f, false);
    }

    public static int e() {
        return (int) (com.tsf.shell.manager.o.b.c.H * 0.9f);
    }

    public static int f() {
        return (int) (com.tsf.shell.manager.o.b.c.I * 0.9f);
    }

    public h() {
        this(a(0.8f));
    }

    public h(float f) {
        this(a(f));
    }

    public void g() {
        a();
        this.a.textures().clear();
        this.a.textures().addElement(b);
    }

    public void h() {
        a();
        this.a.textures().clear();
        this.a.textures().addElement(c);
    }

    public static TextureElement i() {
        if (g == null) {
            g = x.b(R.drawable.effect_icon_standard);
        }
        return g;
    }

    public static void j() {
        if (g != null) {
            com.censivn.C3DEngine.a.g().a(g);
            g = null;
        }
    }
}
