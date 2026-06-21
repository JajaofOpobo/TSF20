package com.tsf.shell.e.f.c;

/* loaded from: classes.dex */
public class b {
    public com.censivn.C3DEngine.b.f.a.a a;
    public float b;
    public float c;
    public float d;
    final /* synthetic */ a e;
    private float f;
    private float g;
    private int h;
    private int i;
    private int j;
    private int k;

    public b(a aVar) {
        this.e = aVar;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.d = com.censivn.C3DEngine.b.b.a.a(160.0f);
        this.j = (int) (f / f3);
        this.k = (int) (f2 / f4);
        this.h = this.j * 2;
        this.i = this.k * 2;
        this.b = f / this.j;
        this.c = f2 / this.k;
        this.f = f / this.h;
        this.g = f2 / this.i;
        int i = (this.h + 1) * (this.i + 1);
        this.a = new com.censivn.C3DEngine.b.f.a.a(i, 26, 26, true);
        for (int i2 = 0; i2 < i; i2++) {
            this.a.a(i2).a(0, 0, 1, 1, 26.0f * com.censivn.C3DEngine.b.b.a.c, 26.0f * com.censivn.C3DEngine.b.b.a.c);
        }
        float f5 = ((-f) / 2.0f) + com.censivn.C3DEngine.b.b.a.k;
        float f6 = (f2 / 2.0f) - com.censivn.C3DEngine.b.b.a.m;
        for (int i3 = 0; i3 < this.i + 1; i3++) {
            for (int i4 = 0; i4 < this.h + 1; i4++) {
                float f7 = com.censivn.C3DEngine.b.b.a.r + (this.f * i4);
                float f8 = com.censivn.C3DEngine.b.b.a.s - (this.g * i3);
                com.censivn.C3DEngine.b.f.a.b a = this.a.a(((this.h + 1) * i3) + i4);
                c cVar = new c();
                cVar.a = i4;
                cVar.b = i3;
                a.a(cVar);
                a.i().x = f7;
                a.i().y = f8;
                a.I = 0.0f;
                a.h();
            }
        }
        this.a.textures().addElement(this.e.b);
    }
}
