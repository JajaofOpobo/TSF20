package com.tsf.shell.f.e.e;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class b extends j {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public e h;
    private boolean i = false;
    private boolean j = false;
    private float k;
    private float l;
    private k m;

    public b() {
        com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.b);
        this.k = com.censivn.C3DEngine.b.b.a.a(170.0f);
        this.l = com.censivn.C3DEngine.b.b.a.a(280.0f);
        this.m = com.censivn.C3DEngine.b.b.a.a(100.0f, 100.0f);
        this.m.alpha(0.0f);
        this.m.scale().setAll(0.0f, 0.0f, 1.0f);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        position().x += (this.f - position().x) * 0.15f;
        position().y += (this.g - position().y) * 0.15f;
    }

    public void a(float f, float f2) {
        if (!this.j) {
            this.f = f;
            this.c = f;
            this.g = f2;
            this.d = f2;
            this.j = true;
            this.m.alpha(0.0f);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(38);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(this.m);
            com.censivn.C3DEngine.b.g.c.a(this.m, VEasing.Linear.easeNone, dVar);
            this.m.textures().clear();
            this.m.textures().addElement(com.tsf.shell.manager.a.p.b());
            this.m.removeFromParent();
            addChildAt(this.m, 0);
        }
    }

    public void a() {
        if (this.j) {
            this.j = false;
            float f = this.a;
            this.f = f;
            this.c = f;
            float f2 = this.b;
            this.g = f2;
            this.d = f2;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.e.b.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    b.this.m.textures().clear();
                    b.this.m.removeFromParent();
                }
            };
            dVar.a(0);
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.m);
            com.censivn.C3DEngine.b.g.c.a(this.m, VEasing.Linear.easeNone, dVar);
        }
    }

    public void a(float f, float f2, float f3) {
        float f4 = 0.0f;
        if (f > this.l) {
            a();
        } else if (f <= this.k) {
            f4 = this.k - f;
        }
        if (f4 > this.e) {
            f4 = this.e;
        }
        float b = x.b(f2, f3, this.c, this.d);
        float abs = (Math.abs(f2 - this.c) * f4) / b;
        this.f = f2 > this.c ? abs + this.c : this.c - abs;
        float abs2 = (f4 * Math.abs(f3 - this.d)) / b;
        this.g = f3 > this.d ? abs2 + this.d : this.d - abs2;
    }

    public void a(float f, float f2, boolean z) {
        this.f = f;
        this.c = f;
        this.a = f;
        this.g = f2;
        this.d = f2;
        this.b = f2;
        if (!this.i && z) {
            position().x = this.c;
            position().y = this.d;
        }
    }

    public void b() {
        if (!this.i) {
            this.i = true;
            this.e = 80.0f * com.censivn.C3DEngine.b.b.a.c;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.a(255);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            dVar.b(150);
            com.censivn.C3DEngine.b.g.c.a(this.h);
            com.censivn.C3DEngine.b.g.c.a(this.h, 300, dVar);
            com.tsf.shell.manager.a.k.a(this.h);
        }
    }

    public void c() {
        if (this.i) {
            this.i = false;
            a();
            final Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.e.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.removeFromParent();
                }
            };
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.e.b.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    runnable.run();
                }
            };
            dVar.l(0.0f);
            dVar.m(0.0f);
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.h);
            com.censivn.C3DEngine.b.g.c.a(this.h, 300, dVar);
            com.tsf.shell.manager.a.k.c(this.h);
        }
    }
}
