package com.tsf.shell.f.i.c.a.c;
/* loaded from: classes.dex */
public class b {
    private com.censivn.C3DEngine.b.f.a.b a;
    private float b;
    private float c;

    public b(com.censivn.C3DEngine.b.f.a.b bVar, float f, float f2) {
        this.a = bVar;
        this.b = f;
        this.c = f2;
        a(f, f2);
    }

    public void a(float f, float f2) {
        double radians = Math.toRadians(f2);
        this.a.i().x = (float) (Math.cos(radians) * f);
        this.a.i().y = (float) (Math.sin(radians) * f);
        this.a.h();
    }

    public void a() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.c.a.c.b.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                b.this.a(((float) (30.0d * Math.sin(f * 3.141592653589793d))) + b.this.b, b.this.c);
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 1000, dVar);
    }
}
