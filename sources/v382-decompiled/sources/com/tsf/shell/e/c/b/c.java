package com.tsf.shell.e.c.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public abstract class c {
    private TextureElement b;
    private m c;
    private TextureElement d;
    private l e;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private m a = com.censivn.C3DEngine.b.b.a.a(103.0f, 149.0f);

    public abstract l a();

    public abstract void b();

    public c() {
        this.a.position().y = (-this.a.c()) / 2.0f;
        this.b = new TextureElement(0, false);
        this.a.textures().addElement(this.b);
        this.a.alpha(0.0f);
        this.c = com.censivn.C3DEngine.b.b.a.a(69.0f, 69.0f);
        this.c.alpha(0.0f);
        this.d = new TextureElement(0, false);
        this.c.textures().addElement(this.d);
        this.e = new l();
        this.e.addChild(this.c);
        this.e.addChild(this.a);
    }

    public l c() {
        return this.e;
    }

    public void d() {
        if (!this.h) {
            this.h = true;
            a().addChild(this.e);
            Bitmap a = x.a(R.drawable.tips_gesture_finger, this.a.b(), this.a.c());
            com.censivn.C3DEngine.a.g().a(this.b, a);
            a.recycle();
            Bitmap a2 = x.a(R.drawable.tips_finger_point, this.a.b(), this.a.c());
            com.censivn.C3DEngine.a.g().a(this.d, a2);
            a2.recycle();
        }
    }

    public void e() {
        this.h = false;
        this.e.removeFromParent();
        com.censivn.C3DEngine.a.g().a(this.b);
    }

    public void f() {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.a(0);
        w.a(this.a);
        w.a(this.a, 300, xVar);
    }

    public void a(float f, float f2) {
        this.e.position().x = f;
        this.e.position().y = f2;
        h();
    }

    public void a(boolean z) {
        this.c.scale().x = 0.0f;
        this.c.scale().y = 0.0f;
        this.c.alpha(255.0f);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        if (z) {
            xVar.l(1.0f);
            xVar.m(1.0f);
            w.a(this.c);
            w.a(this.c, 450, xVar);
            return;
        }
        xVar.l(2.0f);
        xVar.m(2.0f);
        xVar.a(0);
        w.a(this.c);
        w.a(this.c, 700, xVar);
    }

    public void g() {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.l(2.0f);
        xVar.m(2.0f);
        xVar.a(0);
        w.a(this.c);
        w.a(this.c, 350, xVar);
    }

    public void h() {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.a(255);
        w.a(this.a);
        w.a(this.a, 300, xVar);
    }

    public void i() {
        this.f = false;
    }

    public void j() {
        this.f = true;
        l();
    }

    public void k() {
        this.g = false;
    }

    public void l() {
        if (!this.g && this.f) {
            this.g = true;
            b();
        }
    }
}
