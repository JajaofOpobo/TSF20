package com.tsf.shell.e.e.d.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.o;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class e extends l {
    int a;
    private o b;
    private m c;
    private TextureElement d = new TextureElement(0, false);
    private float e;

    public e(int i, int i2, f fVar) {
        this.a = i2;
        this.c = new m(fVar.c, fVar.c, false);
        this.c.position().x = (this.c.b() / 2.0f) + fVar.d;
        this.c.textures().addElement(this.d);
        addChild(this.c);
        this.b = new o();
        this.b.c(i);
        this.b.d(fVar.e);
        this.b.b(1);
        this.b.position().x = this.c.position().x + fVar.f;
        this.b.b();
        addChild(this.b);
        this.e = this.b.position().x + this.b.maxX();
        if (fVar.g == 1) {
            setAABBPX(0.0f, (-fVar.b) / 2.0f, 0.0f, this.e, fVar.b / 2.0f, 0.0f);
        } else {
            this.c.position().x -= this.e / 2.0f;
            this.b.position().x -= this.e / 2.0f;
            setAABBPX((-this.e) / 2.0f, (-fVar.b) / 2.0f, 0.0f, this.e / 2.0f, fVar.b / 2.0f, 0.0f);
        }
        com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.h);
    }

    public float a() {
        return this.e;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.d.id == 0) {
            Bitmap a = x.a(this.a);
            com.censivn.C3DEngine.a.g().a(this.d, a);
            a.recycle();
        }
    }

    public void b() {
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
        this.b.a();
    }
}
