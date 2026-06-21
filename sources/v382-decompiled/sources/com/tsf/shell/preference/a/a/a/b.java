package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.TextureList;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.o;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
class b extends com.censivn.C3DEngine.b.f.m {
    final /* synthetic */ a a;
    private o d;
    private float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str) {
        super(com.censivn.C3DEngine.b.b.a.a(167.0f), com.censivn.C3DEngine.b.b.a.a(164.0f), false);
        TextureElement textureElement;
        this.a = aVar;
        this.e = ((-com.censivn.C3DEngine.b.b.a.a(164.0f)) / 2.0f) - com.censivn.C3DEngine.b.b.a.a(20.0f);
        TextureList textures = textures();
        textureElement = aVar.f;
        textures.addElement(textureElement);
        this.d = new o();
        this.d.d(30);
        this.d.a(str);
        addChild(this.d);
        this.d.alpha(0.0f);
    }

    public void a(int i) {
        x xVar = new x();
        xVar.a(255);
        xVar.b(i);
        w.a(this);
        w.a(this, 500, xVar);
        x xVar2 = new x();
        xVar2.a(255);
        xVar2.h(this.e);
        xVar2.b(i + VEasing.Linear.easeNone);
        xVar2.a(com.censivn.C3DEngine.b.g.a.a);
        w.a(this.d);
        w.a(this.d, 500, xVar2);
    }

    public void b(int i) {
        x xVar = new x();
        xVar.a(0);
        xVar.b(i + VEasing.Linear.easeNone);
        w.a(this);
        w.a(this, 500, xVar);
        x xVar2 = new x();
        xVar2.a(0);
        xVar2.h(0.0f);
        xVar2.b(i);
        w.a(this.d);
        w.a(this.d, 500, xVar2);
    }

    public void a() {
        this.d.a();
    }
}
