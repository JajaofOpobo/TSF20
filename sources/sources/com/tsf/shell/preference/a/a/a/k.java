package com.tsf.shell.preference.a.a.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class k extends h {
    private com.censivn.C3DEngine.b.f.j a;
    private com.tsf.shell.f.i.c.a.c.a b;

    public k(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(300.0f));
        this.b = com.tsf.shell.f.i.c.a.c.a.e();
        this.a = new com.censivn.C3DEngine.b.f.j() { // from class: com.tsf.shell.preference.a.a.a.k.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildStart() {
                k.this.b.dispatchDraw();
            }
        };
        e().addChild(this.a);
        this.a.scale().setAll(0.55f, 0.55f, 1.0f);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        h();
        this.b.d();
        this.b.b();
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
        this.b.c();
    }
}
