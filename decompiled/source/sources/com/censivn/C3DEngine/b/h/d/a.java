package com.censivn.C3DEngine.b.h.d;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class a extends j {
    private b a;
    private k b;
    private int c;
    private TextureElement d;

    public a(float f, int i, float f2) {
        this.a = new b(f, i);
        addChild(this.a);
        com.tsf.shell.manager.o.c.a(this.a, com.tsf.shell.manager.o.c.h);
        this.b = new k(f2, f2, false);
        this.d = new TextureElement(0, false);
        com.tsf.shell.manager.o.c.a(this.b, com.tsf.shell.manager.o.c.h);
        this.b.textures().addElement(this.d);
        addChild(this.b);
    }

    public float a() {
        return this.a.d();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void transferCanvas(float f, float f2, float f3, float f4) {
    }

    public void a(int i) {
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
        this.c = i;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.d != null && this.d.id == 0) {
            Bitmap a = x.a(this.c);
            com.censivn.C3DEngine.a.g().a(this.d, a);
            a.recycle();
        }
    }

    public void b() {
        this.a.c();
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }

    public void a(float f) {
        if (this.b != null) {
            this.b.rotation().z = (180.0f * f) + 180.0f;
            this.b.scale().setAll(f, f, 1.0f);
        }
        this.a.b(360.0f * f);
    }
}
