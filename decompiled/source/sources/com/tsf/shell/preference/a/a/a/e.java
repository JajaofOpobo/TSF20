package com.tsf.shell.preference.a.a.a;
/* loaded from: classes.dex */
public class e extends h {
    private com.censivn.C3DEngine.b.f.j a;
    private float b;
    private float d;
    private float e;

    public e(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(238.0f));
        this.a = new com.censivn.C3DEngine.b.f.j();
        e().addChild(this.a);
        this.b = com.censivn.C3DEngine.b.b.a.a(150.0f);
        this.e = com.censivn.C3DEngine.b.b.a.a(20.0f);
        this.d = (this.b * 5.0f) + (this.e * 4.0f);
        this.a.position().x = ((-this.d) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(20.0f);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                com.tsf.shell.f.d.c.a.c b = com.tsf.shell.manager.a.v.e.a(i2).b();
                if (i2 == 2) {
                    b.g();
                } else {
                    b.h();
                }
                b.removeFromParent();
                b.position().x = this.e + ((this.b + this.e) * i2);
                this.a.addChild(b);
                i = i2 + 1;
            } else {
                h();
                return;
            }
        }
    }

    private void h() {
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        h();
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        int i = com.tsf.shell.manager.a.v.e.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.a.v.e.a(i2).b().removeFromParent();
        }
        com.tsf.shell.f.d.c.a.c.a();
        com.tsf.shell.f.d.c.a.c.j();
    }
}
