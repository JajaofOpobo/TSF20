package com.tsf.shell.f.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l extends f {
    private float a;
    private float b;

    public l(int i, int i2, boolean z) {
        super(i, i2, z);
        this.a = com.censivn.C3DEngine.b.b.a.F;
        this.b = com.censivn.C3DEngine.b.b.a.G;
    }

    public void b(float f, float f2) {
    }

    public boolean b() {
        return true;
    }

    public void a(g gVar, float f) {
    }

    public void b(g gVar, float f) {
        gVar.dispatchDraw();
    }

    public void c() {
    }

    public void d() {
        if (com.censivn.C3DEngine.b.b.a.F != this.a || com.censivn.C3DEngine.b.b.a.G != this.b) {
            this.a = com.censivn.C3DEngine.b.b.a.F;
            this.b = com.censivn.C3DEngine.b.b.a.G;
            a(this.a, this.b);
        }
        e();
    }

    public void e() {
    }

    public void a(float f, float f2) {
    }

    public boolean a() {
        return false;
    }

    public boolean a(g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        float fAbs = Math.abs(gVar.g * 700.0f);
        aVar.alpha(fAbs <= 255.0f ? fAbs : 255.0f);
        return true;
    }

    public void a(g gVar, boolean z) {
    }

    public void b(g gVar, boolean z) {
    }
}
