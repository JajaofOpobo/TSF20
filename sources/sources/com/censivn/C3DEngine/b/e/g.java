package com.censivn.C3DEngine.b.e;

import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends f {
    private m a;
    private m b;

    public g() {
        this(com.censivn.C3DEngine.b.b.a.a(180.0f));
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        if (this.a != null) {
            this.a.a();
        }
        if (this.b != null) {
            this.b.a();
        }
    }

    public g(float f) {
        d((int) f);
        a(0);
        this.a = new m();
        this.a.b(1);
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(15.0f);
        this.a.setLayoutParams(bVar);
        this.a.d(50);
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        this.a.position().x = (-i) / 2.0f;
        if (this.b != null) {
            this.b.f(i);
            this.b.position().x = (-i) / 2.0f;
            e();
        }
    }

    private void e() {
        this.b.b();
        com.censivn.C3DEngine.b.b.b layoutParams = this.b.getLayoutParams();
        layoutParams.h = this.b.minX();
        layoutParams.j = this.b.maxX();
        layoutParams.i = this.b.minY();
        layoutParams.k = this.b.maxY();
    }

    public void h(int i) {
        a(x.c(i));
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

    public void i(int i) {
        b(x.c(i));
    }

    public void b(String str) {
        if (this.b == null) {
            this.b = new m();
            this.b.b(1);
            this.b.a(true);
            com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
            bVar.b = com.censivn.C3DEngine.b.b.a.a(15.0f);
            this.b.setLayoutParams(bVar);
            this.b.d(38);
            this.b.position().x = (-a()) / 2.0f;
            this.b.e(-5592406);
            addChild(this.b);
            d();
        }
        this.b.a(str);
        this.b.b();
        com.censivn.C3DEngine.b.b.b layoutParams = this.b.getLayoutParams();
        layoutParams.h = this.b.minX();
        layoutParams.j = this.b.maxX();
        layoutParams.i = this.b.minY();
        layoutParams.k = this.b.maxY();
        d();
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void i() {
        super.i();
        this.a.alpha(100.0f);
        if (this.b != null) {
            this.b.alpha(100.0f);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void j() {
        super.j();
        this.a.alpha(255.0f);
        if (this.b != null) {
            this.b.alpha(255.0f);
        }
    }
}
