package com.tsf.shell.e.e.f;

import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.o;
import com.censivn.C3DEngine.b.g.w;

/* loaded from: classes.dex */
public class d extends l {
    public b b;
    public int e;
    final /* synthetic */ a f;
    public boolean a = false;
    public m c = new m(com.tsf.shell.manager.g.a.h, com.tsf.shell.manager.g.a.h, false);
    public o d = new o();

    public d(a aVar, int i) {
        this.f = aVar;
        this.e = i;
        this.d.d(36);
        this.d.e(-855638017);
        addChild(this.c);
        addChild(this.d);
    }

    public void a(b bVar) {
        String str;
        this.b = bVar;
        o oVar = this.d;
        str = bVar.f;
        oVar.a(str);
        a(false);
    }

    public void a() {
        this.c.textures().clear();
        if (this.b != null) {
            this.c.textures().addElement(this.b.b());
        }
        ((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.h()).a(this);
    }

    public void a(boolean z) {
        this.c.textures().clear();
        if (this.b != null) {
            this.c.textures().addElement(this.b.a());
        }
        if (z) {
            ((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.h()).b(this);
        }
    }

    public void b() {
        w.a(this.c);
        w.a(this.d);
        w.a(this);
        removeFromParent();
        this.a = false;
        this.c.textures().clear();
        this.c.rotation().setAll(0.0f, 0.0f, 0.0f);
        this.c.position().setAll(0.0f, 0.0f, 0.0f);
        this.c.scale().setAll(1.0f, 1.0f, 1.0f);
        this.c.alpha(255.0f);
        position().setAll(0.0f, 0.0f, 0.0f);
        rotation().setAll(0.0f, 0.0f, 0.0f);
        scale().setAll(1.0f, 1.0f, 1.0f);
        alpha(255.0f);
        this.d.position().setAll(0.0f, 0.0f, 0.0f);
        this.d.rotation().setAll(0.0f, 0.0f, 0.0f);
        this.d.scale().setAll(1.0f, 1.0f, 1.0f);
        this.d.b(1);
        this.d.alpha(255.0f);
        removeFromParent();
        this.d.a();
        if (this.b != null) {
            this.b.c();
            this.b = null;
        }
    }
}
