package com.censivn.C3DEngine.b.e;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
public class c extends j {
    public static final int a = com.censivn.C3DEngine.b.b.a.b(58.0f);
    public static final TextureElement b = new TextureElement(0, false);
    private d d;
    private com.censivn.C3DEngine.b.b.a.b e;
    private e f;

    public c() {
        h();
    }

    @Override // com.censivn.C3DEngine.b.b.c, com.censivn.C3DEngine.b.f.j
    public void onChildMeasure(com.censivn.C3DEngine.b.f.j jVar) {
        jVar.position().x = (-jVar.maxX()) / 2.0f;
    }

    public void a(d dVar) {
        this.d = dVar;
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.e.i
    public void f() {
        super.f();
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        super.g();
    }

    public int e() {
        return a(this.f);
    }

    public void f(int i) {
        if (i > -1 && i < numChildren()) {
            a((e) this.e.getChildAt(i), false);
        }
    }

    public void a(e eVar, boolean z) {
        if (this.f != null) {
            this.f.b();
        }
        this.f = eVar;
        this.f.a();
        int a2 = a(this.f);
        if (z && this.d != null) {
            this.d.a(a2);
        }
    }

    private int a(e eVar) {
        return this.e.children().indexOf(eVar);
    }

    private void h() {
        this.e = new com.censivn.C3DEngine.b.b.a.b();
        this.e.position().y = (-b()) / 2.0f;
        addChild(this.e);
        this.e.position().x = (-this.e.maxX()) / 2.0f;
    }

    public void g(int i) {
        e eVar = new e(this);
        eVar.a(i);
        this.e.addChild(eVar);
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
    }
}
