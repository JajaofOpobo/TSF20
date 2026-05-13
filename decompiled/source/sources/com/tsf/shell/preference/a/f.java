package com.tsf.shell.preference.a;

import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.e.i;
import com.tsf.shell.preference.a.c;
/* loaded from: classes.dex */
public class f extends b {
    private c.a a;
    private com.tsf.shell.f.c.b.e b;
    private j d;
    private i e;
    private com.tsf.shell.f.c.b.f f;

    public f(float f) {
        super(f);
        this.d = new j();
        e().addChild(this.d);
        this.e = new i();
        this.d.addChild(this.e);
        this.e.a(0.0f, f);
        this.e.b(0);
        n();
    }

    @Override // com.tsf.shell.preference.a.b, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        this.a.b();
        this.e.removeChild(this.b.a());
        this.e.addChild(this.b.a());
        this.f.d();
        this.f.j();
    }

    @Override // com.tsf.shell.preference.a.b, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        if (this.b != null) {
            this.b.g();
        }
        if (this.e != null) {
            this.e.a(i);
        }
    }

    @Override // com.tsf.shell.preference.a.b, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        this.a.c();
        this.e.removeChild(this.b.a());
        this.f.e();
        this.f.i();
    }

    private void n() {
        this.a = com.tsf.shell.manager.a.B.a.a();
        this.b = this.a.a();
        this.f = new com.tsf.shell.f.c.b.f(this.b, this.b.a());
    }

    public void h() {
        this.b.c();
    }

    public void m() {
        this.b.d();
    }

    public void f(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }
}
