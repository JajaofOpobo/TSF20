package com.censivn.C3DEngine.b.g.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends c {
    private com.censivn.C3DEngine.b.g.d c;
    private com.censivn.C3DEngine.b.g.b.a d;
    private int e;
    private long f;
    private long g;
    private Runnable h;
    private com.censivn.C3DEngine.b.g.b i;

    public d(com.censivn.C3DEngine.b.g.b.a aVar, int i, com.censivn.C3DEngine.b.g.d dVar) {
        this.d = aVar;
        dVar.a(aVar);
        aVar.setTweenChild(this);
        this.e = i;
        this.c = dVar;
        this.i = dVar.e();
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public com.censivn.C3DEngine.b.g.d a() {
        return this.c;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void c() {
        if (this.a == 0 || this.a == 2) {
            if (this.a == 2) {
                this.f = System.currentTimeMillis() - this.g;
                this.a = 0;
            }
            if (this.f == 0) {
                this.f = System.currentTimeMillis();
                this.c.b();
            }
            this.g = (int) (System.currentTimeMillis() - this.f);
            if (this.g >= this.e) {
                this.g = this.e;
                com.censivn.C3DEngine.b.g.c.b(this);
                this.c.b(1.0f);
                this.c.a(1.0f);
                this.d.setTweenChild(null);
                this.c.a();
                if (this.c.g() != null) {
                    this.c.g().run();
                    return;
                }
                return;
            }
            float f = this.g / this.e;
            float fA = this.i.a(f);
            this.c.b(f);
            this.c.a(fA);
        }
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void a(Runnable runnable) {
        this.h = runnable;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public Runnable d() {
        return this.h;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void e() {
        this.a = 1;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void f() {
        this.a = 2;
    }
}
