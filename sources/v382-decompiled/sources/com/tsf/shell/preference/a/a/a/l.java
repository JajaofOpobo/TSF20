package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.b.f.o;

/* loaded from: classes.dex */
public class l extends com.censivn.C3DEngine.b.e.i {
    private o a;

    public l() {
        this(com.censivn.C3DEngine.b.b.a.a(120.0f));
        b(false);
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void f() {
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void g() {
        if (this.a != null) {
            this.a.a();
        }
    }

    public l(float f) {
        d((int) f);
        a(0);
        this.a = new o();
        this.a.b(1);
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(30.0f);
        this.a.setLayoutParams(bVar);
        this.a.d(50);
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        this.a.position().x = (-i) / 2.0f;
    }

    public void a(String str) {
        this.a.a(str);
        this.a.b();
        com.censivn.C3DEngine.b.b.b layoutParams = this.a.getLayoutParams();
        layoutParams.h = this.a.minX();
        layoutParams.j = this.a.maxX();
        layoutParams.i = this.a.minY();
        layoutParams.k = this.a.maxY();
        d();
    }
}
