package com.tsf.shell.e.f.a.a.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.f.a.a.f;
import com.tsf.shell.utils.q;

/* loaded from: classes.dex */
public class b extends l {
    private static m d;
    private j e;
    private m f;
    private com.tsf.shell.e.f.a.a.a.c g;
    private float h;
    private static TextureElement b = new TextureElement(0, false);
    public static int a = com.censivn.C3DEngine.b.b.a.b(138.0f);
    private static int c = com.censivn.C3DEngine.b.b.a.b(8.0f);

    public b(com.tsf.shell.e.f.a.a.a.c cVar) {
        this.g = cVar;
        if (d == null) {
            d = new m(a, a, false);
            d.textures().addElement(b);
        }
        this.f = new m(com.censivn.C3DEngine.b.b.a.a(6.0f), 0.0f, false);
        this.f.useVBO(false);
        this.f.position().y = -com.censivn.C3DEngine.b.b.a.a(90.0f);
        this.f.setDefaultColor(new Color4(255, 255, 255, 50));
        addChild(this.f);
    }

    public void a(j jVar) {
        this.e = jVar;
        this.e.setTag(this.g);
        addChild(this.e);
    }

    public j b() {
        return this.e;
    }

    public float c() {
        return this.h;
    }

    public void a(float f) {
        this.h = f;
        this.f.points().setYPX(0, -f);
        this.f.points().setYPX(1, -f);
    }

    public static void a(j jVar, float f, float f2) {
        jVar.position().y = f;
        jVar.alpha(0.0f);
        x xVar = new x();
        xVar.h(f2);
        xVar.a(255);
        xVar.a(com.censivn.C3DEngine.b.g.a.n);
        w.a(jVar);
        w.a(jVar, 750, xVar);
    }

    public void d() {
        a(0.0f);
        a(this.e, -f.a, 0.0f);
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        if (b.id == 0) {
            Bitmap a2 = q.a(a, c, 1442840575);
            com.censivn.C3DEngine.a.g().a(b, a2);
            a2.recycle();
        }
    }
}
