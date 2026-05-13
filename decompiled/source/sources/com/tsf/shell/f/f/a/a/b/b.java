package com.tsf.shell.f.f.a.a.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.shell.utils.p;
/* loaded from: classes.dex */
public class b extends j {
    private static k d;
    private i e;
    private k f;
    private com.tsf.shell.f.f.a.a.a.c g;
    private float h;
    private static TextureElement b = new TextureElement(0, false);
    public static int a = com.censivn.C3DEngine.b.b.a.b(138.0f);
    private static int c = com.censivn.C3DEngine.b.b.a.b(8.0f);

    public b(com.tsf.shell.f.f.a.a.a.c cVar) {
        this.g = cVar;
        if (d == null) {
            d = new k(a, a, false);
            d.textures().addElement(b);
        }
        this.f = new k(com.censivn.C3DEngine.b.b.a.a(6.0f), 0.0f, false);
        this.f.useVBO(false);
        this.f.position().y = -com.censivn.C3DEngine.b.b.a.a(90.0f);
        this.f.setDefaultColor(new Color4(255, 255, 255, 50));
        addChild(this.f);
    }

    public void a(i iVar) {
        this.e = iVar;
        this.e.setTag(this.g);
        addChild(this.e);
    }

    public i b() {
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

    public static void a(i iVar, float f, float f2) {
        iVar.position().y = f;
        iVar.alpha(0.0f);
        d dVar = new d();
        dVar.h(f2);
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.a.n);
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 750, dVar);
    }

    public void d() {
        a(0.0f);
        a(this.e, -com.tsf.shell.f.f.a.a.c.a, 0.0f);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        if (b.id == 0) {
            Bitmap a2 = p.a(a, c, 1442840575);
            com.censivn.C3DEngine.a.g().a(b, a2);
            a2.recycle();
        }
    }
}
