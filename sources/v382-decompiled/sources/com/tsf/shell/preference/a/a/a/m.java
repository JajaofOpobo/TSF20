package com.tsf.shell.preference.a.a.a;

/* loaded from: classes.dex */
public class m extends j {
    private com.censivn.C3DEngine.b.f.l a;
    private com.tsf.shell.e.i.c.a.c.a b;

    public m(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(300.0f));
        this.b = com.tsf.shell.e.i.c.a.c.a.e();
        this.a = new com.censivn.C3DEngine.b.f.l() { // from class: com.tsf.shell.preference.a.a.a.m.1
            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildStart() {
                m.this.b.dispatchDraw();
            }
        };
        e().addChild(this.a);
        this.a.scale().setAll(0.55f, 0.55f, 1.0f);
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void f() {
        super.f();
        h();
        this.b.d();
        this.b.b();
    }

    private void h() {
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        h();
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        super.g();
        this.b.c();
    }
}
