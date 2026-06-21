package com.tsf.shell.e.i.c.a.c;

import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

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
        float sin = (float) (Math.sin(radians) * f);
        this.a.i().x = (float) (Math.cos(radians) * f);
        this.a.i().y = sin;
        this.a.h();
    }

    public void a() {
        x xVar = new x() { // from class: com.tsf.shell.e.i.c.a.c.b.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                b.this.a(((float) (30.0d * Math.sin(f * 3.141592653589793d))) + b.this.b, b.this.c);
            }
        };
        w.a(this.a);
        w.a(this.a, 1000, xVar);
    }
}
