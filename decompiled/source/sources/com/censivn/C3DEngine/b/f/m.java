package com.censivn.C3DEngine.b.f;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class m extends j {
    private boolean d = false;
    private String e = "";
    private int f = 0;
    private int g = 0;
    private float h = 0.0f;
    private float i = 0.0f;
    private float j = 0.0f;
    private float k = 0.0f;
    private k a = new k(0.0f, 0.0f);
    private com.tsf.shell.manager.o.a.a b = new com.tsf.shell.manager.o.a.a();
    private TextureElement c = new TextureElement(0, false);

    public m() {
        this.a.textures().addElement(this.c);
        addChild(this.a);
    }

    private void d() {
        if (this.d) {
            this.d = false;
            Bitmap b = this.b.b(this.e);
            if (b == null) {
                this.a.visible(false);
                com.censivn.C3DEngine.a.g().a(this.c);
            } else {
                com.censivn.C3DEngine.a.g().a(this.c, b);
                this.a.a(this.c.width);
                this.a.b(this.c.height);
                this.a.visible(true);
            }
            e();
            updatePointsVBO();
            calAABB();
        }
    }

    public void a() {
        this.d = true;
        if (this.c.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.c);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        d();
    }

    private void e() {
        switch (this.f) {
            case 0:
                this.a.position().x = 0.0f;
                break;
            case 1:
                this.a.position().x = (this.a.b() / 2.0f) + this.h;
                break;
            case 2:
                this.a.position().x = ((-this.a.b()) / 2.0f) - this.i;
                break;
        }
        switch (this.g) {
            case 0:
                this.a.position().y = 0.0f;
                return;
            case 1:
                this.a.position().y = ((-this.a.c()) / 2.0f) - this.j;
                return;
            case 2:
                this.a.position().x = (this.a.c() / 2.0f) + this.k;
                return;
            default:
                return;
        }
    }

    public void a(float f, float f2, float f3, float f4) {
        this.h = f;
        this.i = f3;
        this.j = f4;
        this.k = f2;
        b();
    }

    public void a(int i) {
        this.g = i;
        e();
    }

    public void b(int i) {
        this.f = i;
        e();
    }

    public void c(int i) {
        a(x.c(i));
    }

    public void a(String str) {
        if (this.e != str) {
            if (str == null) {
                str = "";
            }
            this.e = str;
            this.d = true;
            invalidate();
        }
    }

    public void b() {
        this.b.a(this.e);
        switch (this.f) {
            case 0:
                this.a.position().x = 0.0f;
                minX(((-this.b.s) / 2.0f) - this.h);
                maxX((this.b.s / 2.0f) + this.i);
                break;
            case 1:
                this.a.position().x = (this.a.b() / 2.0f) + this.h;
                minX(0.0f);
                maxX(this.b.s + this.h + this.i);
                break;
            case 2:
                this.a.position().x = ((-this.a.b()) / 2.0f) - this.i;
                minX(((-this.b.s) - this.h) - this.i);
                maxX(0.0f);
                break;
        }
        switch (this.g) {
            case 0:
                this.a.position().y = 0.0f;
                minY(((-this.b.t) / 2.0f) - this.k);
                maxY((this.b.t / 2.0f) + this.j);
                return;
            case 1:
                this.a.position().y = ((-this.a.c()) / 2.0f) - this.j;
                minY(((-this.b.t) - this.j) - this.k);
                maxY(0.0f);
                return;
            case 2:
                this.a.position().y = (this.a.c() / 2.0f) + this.k;
                minY(0.0f);
                maxY(this.b.t + this.k + this.j);
                return;
            default:
                return;
        }
    }

    public void a(boolean z) {
        this.b.c(z);
    }

    public void d(int i) {
        this.b.h(i);
        this.d = true;
    }

    public void e(int i) {
        this.b.i(i);
        this.d = true;
    }

    public void b(boolean z) {
        this.b.d(z);
        this.d = true;
    }

    public void f(int i) {
        this.b.e(i);
        this.d = true;
    }

    public void g(int i) {
        this.b.f(i);
        this.d = true;
    }

    public String c() {
        return this.e;
    }
}
