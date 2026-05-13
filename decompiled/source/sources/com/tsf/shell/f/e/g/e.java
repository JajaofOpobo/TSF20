package com.tsf.shell.f.e.g;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class e extends j {
    private static com.tsf.shell.manager.o.a.a e;
    private static final float g = 24.0f * com.censivn.C3DEngine.b.b.a.c;
    private k a;
    private String b;
    private TextureElement d;
    private com.tsf.shell.f.e.k f;
    private int h;
    private boolean c = false;
    private int i = (int) com.censivn.C3DEngine.b.b.a.a(30.0f);
    private int j = (int) com.censivn.C3DEngine.b.b.a.a(10.0f);

    public e(int i) {
        this.h = 0;
        this.h = i;
        if (e == null) {
            e = new com.tsf.shell.manager.o.a.a();
            e.i(-1);
            e.h(42);
        }
        this.d = new TextureElement(0, false);
        this.a = new k(0.0f, 0.0f, false);
        this.a.textures().addElement(this.d);
        addChild(this.a);
        h();
    }

    public void a() {
        if (this.f == null) {
            this.f = new com.tsf.shell.f.e.k();
        }
        addChild(this.f);
    }

    public void b() {
        this.f.a();
        this.f.removeFromParent();
    }

    public void a(String str) {
        this.b = str;
        e.a(str);
        float f = this.h == 0 ? e.s : e.s + this.j + this.i;
        minX(((-f) / 2.0f) - g);
        maxX((f / 2.0f) + g);
        minY((-e.t) / 2.0f);
        maxY(e.t / 2.0f);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void visible(Boolean bool) {
        super.visible(bool);
        notifLayoutRefresh();
    }

    public void c() {
        visible(true);
        mouseEnabled(true);
    }

    public void d() {
        visible(false);
        mouseEnabled(false);
    }

    public boolean e() {
        return visible();
    }

    public void f() {
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }

    public void g() {
        this.c = true;
        com.tsf.shell.manager.o.c.a(this.a, com.tsf.shell.manager.o.c.m);
    }

    public void h() {
        this.c = false;
        com.tsf.shell.manager.o.c.a(this.a, com.tsf.shell.manager.o.c.n);
    }

    public void i() {
        if (this.d.id == 0) {
            int i = (int) (80.0f * com.censivn.C3DEngine.b.b.a.c);
            Bitmap b = e.b(this.b);
            Bitmap createBitmap = Bitmap.createBitmap(this.h == 0 ? (int) ((g * 2.0f) + b.getWidth()) : (int) ((g * 2.0f) + this.j + b.getWidth() + this.i), i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i2 = (int) g;
            if (this.h != 0) {
                Bitmap a = x.a(this.h, this.i, this.i);
                canvas.drawBitmap(a, g, (i - a.getHeight()) / 2, (Paint) null);
                a.recycle();
                i2 += this.j + this.i;
            }
            canvas.drawBitmap(b, i2, (i - b.getHeight()) / 2, (Paint) null);
            b.recycle();
            com.censivn.C3DEngine.a.g().a(this.d, createBitmap);
            createBitmap.recycle();
            this.a.a(this.d.width);
            this.a.b(this.d.height);
            calAABB(1.0f, 2.0f, 1.0f);
            if (this.f != null) {
                this.f.position().y = com.censivn.C3DEngine.b.b.a.a(17.0f);
                this.f.position().x = (this.d.width / 2) - com.censivn.C3DEngine.b.b.a.a(10.0f);
            }
        }
    }
}
