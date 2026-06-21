package com.tsf.shell.preference.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.e.i;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.o;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class b extends i {
    private o a;
    private m b;
    private TextureElement d;
    private l e;
    private l f;

    public b(float f) {
        d((int) f);
        a(1);
        this.e = new l();
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(10.0f);
        bVar.b = com.censivn.C3DEngine.b.b.a.a(20.0f);
        bVar.i = -28.5f;
        bVar.k = 28.5f;
        this.e.setLayoutParams(bVar);
        this.b = com.censivn.C3DEngine.b.b.a.a(57.0f, 57.0f);
        this.d = new TextureElement(0, false);
        this.b.textures().addElement(this.d);
        this.e.addChild(this.b);
        this.a = new o();
        this.a.b(1);
        this.a.c(R.string.text_demo);
        this.a.d(50);
        this.e.addChild(this.a);
        addChild(this.e);
        this.f = new l();
        com.censivn.C3DEngine.b.b.b bVar2 = new com.censivn.C3DEngine.b.b.b();
        bVar2.a = com.censivn.C3DEngine.b.b.a.a(20.0f);
        bVar2.b = com.censivn.C3DEngine.b.b.a.a(20.0f);
        bVar2.i = -com.censivn.C3DEngine.b.b.a.a(f / 2.0f);
        bVar2.k = com.censivn.C3DEngine.b.b.a.a(f / 2.0f);
        this.f.setLayoutParams(bVar2);
        this.f.mouseEnabled(false);
        addChild(this.f);
    }

    public l e() {
        return this.f;
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        this.b.position().x = ((-i) / 2.0f) + (com.censivn.C3DEngine.b.b.a.a(57.0f) / 2.0f);
        this.a.position().x = ((-i) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(77.0f);
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void f() {
        Bitmap a = x.a(R.drawable.preference_video_ico, com.censivn.C3DEngine.b.b.a.a(57.0f), com.censivn.C3DEngine.b.b.a.a(57.0f));
        com.censivn.C3DEngine.a.g().a(this.d, a);
        a.recycle();
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void g() {
        this.a.a();
        com.censivn.C3DEngine.a.g().a(this.d);
    }
}
