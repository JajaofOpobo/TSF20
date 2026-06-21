package com.tsf.shell.e.e.e;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class d extends l {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public i h;
    private boolean i = false;
    private boolean j = false;
    private float k;
    private float l;
    private m m;

    public d() {
        com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.b);
        this.k = com.censivn.C3DEngine.b.b.a.a(170.0f);
        this.l = com.censivn.C3DEngine.b.b.a.a(280.0f);
        this.m = com.censivn.C3DEngine.b.b.a.a(100.0f, 100.0f);
        this.m.alpha(0.0f);
        this.m.scale().setAll(0.0f, 0.0f, 1.0f);
    }

    @Override // com.censivn.C3DEngine.b.f.j
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
            x xVar = new x();
            xVar.a(38);
            xVar.l(1.0f);
            xVar.m(1.0f);
            w.a(this.m);
            w.a(this.m, VEasing.Linear.easeNone, xVar);
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
            x xVar = new x() { // from class: com.tsf.shell.e.e.e.d.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    d.this.m.textures().clear();
                    d.this.m.removeFromParent();
                }
            };
            xVar.a(0);
            xVar.l(0.0f);
            xVar.m(0.0f);
            w.a(this.m);
            w.a(this.m, VEasing.Linear.easeNone, xVar);
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
        float b = com.tsf.shell.utils.x.b(f2, f3, this.c, this.d);
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
            x xVar = new x();
            xVar.l(1.0f);
            xVar.m(1.0f);
            xVar.a(255);
            xVar.a(com.censivn.C3DEngine.b.g.a.e);
            xVar.b(150);
            w.a(this.h);
            w.a(this.h, 300, xVar);
            com.tsf.shell.manager.a.k.a(this.h);
        }
    }

    public void c() {
        if (this.i) {
            this.i = false;
            a();
            final Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.e.e.d.2
                @Override // java.lang.Runnable
                public void run() {
                    d.this.removeFromParent();
                }
            };
            x xVar = new x() { // from class: com.tsf.shell.e.e.e.d.3
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    runnable.run();
                }
            };
            xVar.l(0.0f);
            xVar.m(0.0f);
            xVar.a(0);
            w.a(this.h);
            w.a(this.h, 300, xVar);
            com.tsf.shell.manager.a.k.c(this.h);
        }
    }
}
