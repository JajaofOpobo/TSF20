package com.tsf.shell.e.e.i;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.VMessageManager;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class a extends l {
    private static TextureElement c = new TextureElement(0, false);
    private static TextureElement d = new TextureElement(0, false);
    private static TextureElement e = new TextureElement(0, false);
    private static TextureElement f = new TextureElement(0, false);
    private c g;
    private c h;
    private int i;
    private m b = new m(com.censivn.C3DEngine.b.b.a.a(200.0f), com.censivn.C3DEngine.b.b.a.a(200.0f), false);
    public m a = new m(com.censivn.C3DEngine.b.b.a.a(200.0f), com.censivn.C3DEngine.b.b.a.a(200.0f), false) { // from class: com.tsf.shell.e.e.i.a.1
        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawStart() {
            if (a.d.id == 0) {
                com.censivn.C3DEngine.a.g().a(a.d, R.drawable.mark_star_disable);
            }
        }
    };

    public a() {
        this.a.textures().addElement(d);
        addChild(this.b);
        this.g = new c();
        this.g.textures().addElement(e);
        addChild(this.g);
        this.h = new c();
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
        if (c.id != 0) {
            com.censivn.C3DEngine.a.g().a(c);
        }
        if (d.id != 0) {
            com.censivn.C3DEngine.a.g().a(d);
        }
        if (e.id != 0) {
            com.censivn.C3DEngine.a.g().a(e);
        }
        if (f.id != 0) {
            com.censivn.C3DEngine.a.g().a(f);
        }
    }

    private void f() {
        if (c.id == 0) {
            com.censivn.C3DEngine.a.g().a(c, R.drawable.mark_star_enable);
        }
        if (e.id == 0) {
            com.censivn.C3DEngine.a.g().a(e, R.drawable.mark_little_star_w);
        }
        if (f.id == 0) {
            com.censivn.C3DEngine.a.g().a(f, R.drawable.mark_little_star_y);
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
        VMessageManager.postGLThreadRunnable(new Runnable() { // from class: com.tsf.shell.e.e.i.a.2
            @Override // java.lang.Runnable
            public void run() {
                a.this.b.textures().removeAll();
                a.this.b.textures().addElement(a.c);
                a.this.b.scale().setAll(0.0f, 0.0f, 1.0f);
                x xVar = new x() { // from class: com.tsf.shell.e.e.i.a.2.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        a.this.a.visible(false);
                    }
                };
                xVar.l(1.0f);
                xVar.m(1.0f);
                xVar.a(com.censivn.C3DEngine.b.g.a.e);
                w.a(a.this.b);
                w.a(a.this.b, 300, xVar);
                a.this.g.d();
                a.this.h.d();
            }
        }, i);
    }
}
