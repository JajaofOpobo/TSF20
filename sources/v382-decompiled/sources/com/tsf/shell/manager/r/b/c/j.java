package com.tsf.shell.manager.r.b.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class j extends l {
    private static m a;
    private static TextureElement b = new TextureElement(0, false);
    private com.censivn.C3DEngine.b.f.e c;
    private com.censivn.C3DEngine.b.f.j d;
    private l e;
    private com.censivn.C3DEngine.b.f.j f;
    private com.tsf.shell.e.i.c.g g;
    private float h;
    private float i;
    private float j;
    private float k = 0.0f * com.censivn.C3DEngine.b.b.a.c;

    public j(float f, float f2, float f3, boolean z) {
        this.i = f;
        this.j = f2;
        this.h = f3;
        this.c = new com.censivn.C3DEngine.b.f.e(f, f2 - this.h);
        this.c.a(553648127, ThemeElementType.PARSER_CONFIG_ALL);
        if (z) {
            addChild(this.c);
        }
        this.e = new l() { // from class: com.tsf.shell.manager.r.b.c.j.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                Number3d.TEMPNUMBER3D.reset();
                Number3d localToGlobal = localToGlobal(Number3d.TEMPNUMBER3D);
                com.censivn.C3DEngine.a.e().b(localToGlobal.x, localToGlobal.y);
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                com.censivn.C3DEngine.a.e().f();
            }
        };
        addChild(this.e);
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        if ((this.g instanceof com.tsf.shell.e.i.c.i) && !((com.tsf.shell.e.i.c.i) this.g).j()) {
            if (b.id == 0) {
                Bitmap a2 = x.a(R.drawable.widget_item_download);
                com.censivn.C3DEngine.a.g().a(b, a2);
                a2.recycle();
            }
            if (a == null) {
                a = new m(com.censivn.C3DEngine.b.b.a.c * 84.0f, com.censivn.C3DEngine.b.b.a.c * 84.0f, false);
                a.textures().addElement(b);
                a.position().x = ((this.i / 2.0f) - (a.b() / 2.0f)) - com.censivn.C3DEngine.b.b.a.a(10.0f);
                a.position().y = (((this.j - this.h) / 2.0f) - (a.c() / 2.0f)) - com.censivn.C3DEngine.b.b.a.a(10.0f);
            }
            a.dispatchDraw();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        jVar.removeFromParent();
        this.e.addChild(jVar);
    }

    public com.censivn.C3DEngine.b.f.j a() {
        return this.f;
    }

    public void a(com.tsf.shell.e.i.c.g gVar, boolean z) {
        com.censivn.C3DEngine.b.f.j a2 = gVar.a((int) this.i, (int) this.j, z);
        if (this.c.b() != this.j) {
            this.c.b(this.j - this.h);
        }
        if (this.f != a2) {
            this.e.removeChild(this.f);
            this.f = a2;
            this.g = gVar;
            if (this.g != null) {
                this.g.h();
            }
            this.f.removeFromParent();
            this.e.addChild(this.f);
            this.f.position().z = this.k;
        } else if (this.g != null) {
            this.g.h();
        }
        com.censivn.C3DEngine.b.f.j b2 = gVar.b((int) (this.i - com.censivn.C3DEngine.b.b.a.a(20.0f)));
        if (this.d != b2) {
            removeChild(this.d);
            this.d = b2;
            this.d.removeFromParent();
            addChild(this.d);
            this.d.position().y = (-this.j) / 2.0f;
        }
    }

    public float b() {
        return this.i;
    }

    public float c() {
        return this.j;
    }

    public void a(float f, float f2) {
        this.i = f;
        this.j = f2;
        this.c.a(f);
        this.c.b(f2 - this.h);
    }

    public void d() {
        if (this.f != null) {
            this.e.removeChild(this.f);
            this.g.g();
            this.f = null;
            this.g = null;
        }
        if (this.d != null) {
            removeChild(this.d);
            this.d = null;
        }
    }
}
