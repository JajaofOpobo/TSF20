package com.tsf.shell.preference.a.a.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.q;
/* loaded from: classes.dex */
public class h extends com.censivn.C3DEngine.b.e.f {
    private m a;
    private com.censivn.C3DEngine.b.f.k b;
    private TextureElement d;
    private com.censivn.C3DEngine.b.f.j e;
    private com.censivn.C3DEngine.b.f.j f;

    public h(String str, float f) {
        this(str, f, com.censivn.C3DEngine.b.b.a.a(50.0f), com.censivn.C3DEngine.b.b.a.a(50.0f));
    }

    public h(String str, float f, float f2, float f3) {
        a(1);
        this.e = new com.censivn.C3DEngine.b.f.j();
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(10.0f);
        bVar.b = com.censivn.C3DEngine.b.b.a.a(10.0f);
        bVar.i = -com.censivn.C3DEngine.b.b.a.a(30.0f);
        bVar.k = com.censivn.C3DEngine.b.b.a.a(50.0f);
        this.e.setLayoutParams(bVar);
        this.b = com.censivn.C3DEngine.b.b.a.a(28.0f, 28.0f);
        this.d = new TextureElement(0, false);
        this.b.textures().addElement(this.d);
        this.e.addChild(this.b);
        this.a = new m();
        this.a.b(1);
        this.a.a(str);
        this.a.d(47);
        this.e.addChild(this.a);
        addChild(this.e);
        this.f = new com.censivn.C3DEngine.b.f.j();
        com.censivn.C3DEngine.b.b.b bVar2 = new com.censivn.C3DEngine.b.b.b();
        bVar2.a = f2;
        bVar2.b = f3;
        this.f.setLayoutParams(bVar2);
        this.f.mouseEnabled(false);
        a(f);
        addChild(this.f);
    }

    public void a(float f) {
        com.censivn.C3DEngine.b.b.b layoutParams = this.f.getLayoutParams();
        layoutParams.i = (-f) / 2.0f;
        layoutParams.k = f / 2.0f;
        d((int) f);
    }

    public com.censivn.C3DEngine.b.f.j e() {
        return this.f;
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        this.b.position().x = ((-i) / 2.0f) + (com.censivn.C3DEngine.b.b.a.a(28.0f) / 2.0f);
        this.a.position().x = ((-i) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(48.0f);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        Bitmap b = q.b(28.0f, -1118482);
        com.censivn.C3DEngine.a.g().a(this.d, b);
        b.recycle();
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        this.a.a();
        com.censivn.C3DEngine.a.g().a(this.d);
    }
}
