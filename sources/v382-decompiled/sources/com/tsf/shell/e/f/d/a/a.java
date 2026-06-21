package com.tsf.shell.e.f.d.a;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.f.g;
import com.tsf.shell.e.f.r;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a implements b {
    public int a;
    public int b;
    private r c;
    private com.tsf.shell.e.f.d.a d;
    private l e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;

    @Override // com.tsf.shell.e.f.d.a.b
    public void a() {
        if (this.e.position().x != this.i) {
            w.a(this.e);
            this.e.position().x = (float) (r0.x + ((this.i - this.e.position().x) * 0.1d));
            this.e.setAnimationObjectState(true);
            if (Math.abs(this.i - this.e.position().x) < 0.01d) {
                this.e.position().x = this.i;
                this.e.setAnimationObjectState(false);
            }
        }
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(final g gVar, com.censivn.C3DEngine.b.g.b.a aVar) {
        w.a(aVar);
        final float f = gVar.rotation().y;
        w.a(aVar, 500, new x() { // from class: com.tsf.shell.e.f.d.a.a.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                gVar.rotation().y = f + ((0.0f - f) * f2);
            }
        });
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void b(final g gVar, com.censivn.C3DEngine.b.g.b.a aVar) {
        final float f = gVar.rotation().y;
        x xVar = new x() { // from class: com.tsf.shell.e.f.d.a.a.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                gVar.rotation().y = f + ((50.0f - f) * f2);
            }
        };
        w.a(aVar);
        w.a(aVar, 500, xVar);
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(int i, int i2) {
        this.a = (int) ((r.a - (100.0f * com.censivn.C3DEngine.b.b.a.b)) / 2.0f);
        a(this.l);
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(int i) {
        this.l = i;
        this.b = (int) (60.0f * com.censivn.C3DEngine.b.b.a.a);
        this.k = (int) ((i - 1) * r.c);
        if (this.k + r.a + (20.0f * com.censivn.C3DEngine.b.b.a.a) > com.censivn.C3DEngine.b.b.a.D) {
            this.j = true;
            this.f = (int) (com.censivn.C3DEngine.b.b.a.z + (r.a / 2) + (com.censivn.C3DEngine.b.b.a.a * 10.0f));
            this.g = (int) ((((0 - this.k) + com.censivn.C3DEngine.b.b.a.A) - (r.a / 2)) - (com.censivn.C3DEngine.b.b.a.a * 10.0f));
        } else {
            this.j = false;
            this.i = (-this.k) / 2;
            this.f = this.i;
            this.g = this.i;
        }
        if (((int) ((this.b * (i - 1)) + r.b + (com.censivn.C3DEngine.b.b.a.a * 10.0f * 2.0f))) > com.censivn.C3DEngine.b.b.a.E) {
            this.b = (int) (((com.censivn.C3DEngine.b.b.a.E - r.b) - ((com.censivn.C3DEngine.b.b.a.a * 10.0f) * 2.0f)) / (i - 1));
        }
        this.h = 0 - ((this.b * (i - 1)) / 2);
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(g gVar) {
        if (this.k > com.censivn.C3DEngine.b.b.a.D) {
            this.i = (int) this.c.c(gVar.r());
        } else {
            this.i = (-this.k) / 2;
        }
        this.e.position().x = this.i;
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(x xVar, g gVar) {
        xVar.f(gVar.r() * r.c);
        xVar.h(this.h + (gVar.r() * this.b));
        xVar.j(0.0f);
        xVar.d(0.0f);
        xVar.c(0.0f);
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(int i, ArrayList arrayList, g gVar, boolean z) {
        x xVar;
        if (this.i > this.f) {
            this.i = this.f;
        } else if (this.i < this.g) {
            this.i = this.g;
        }
        int i2 = 0;
        for (int i3 = z ? 1 : 0; i3 < i; i3++) {
            g gVar2 = (g) arrayList.get(i3);
            gVar2.o();
            gVar2.position().x = r.c * i2;
            if (gVar2 != gVar) {
                gVar2.O();
                if (gVar2.parent() == null) {
                    gVar2.rotation().y = 50.0f;
                    gVar2.d(false);
                    gVar2.removeFromParent();
                    this.e.addChild(gVar2);
                }
                xVar = new x();
                xVar.h(this.h + (this.b * i2));
            } else {
                xVar = new x() { // from class: com.tsf.shell.e.f.d.a.a.3
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        a.this.d.b();
                    }
                };
                xVar.d(0.0f);
                xVar.h(this.h + (this.b * i2));
            }
            i2++;
            w.a(gVar2);
            w.a(gVar2, 500, xVar);
        }
        if (z) {
            if (gVar.t() != -1) {
                gVar.E();
                return;
            }
            x xVar2 = new x() { // from class: com.tsf.shell.e.f.d.a.a.4
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    g gVar3 = (g) d();
                    gVar3.position().y = 0.0f;
                    gVar3.rotation().y = 0.0f;
                    a.this.e.removeChild(gVar3);
                }
            };
            xVar2.h((com.censivn.C3DEngine.b.b.a.C - (r.b / 2)) - (100.0f * com.censivn.C3DEngine.b.b.a.b));
            w.a(gVar);
            this.c.a(this.c.o(), true, true);
            w.a(gVar, 500, xVar2);
            return;
        }
        gVar.E();
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(ArrayList arrayList, g gVar, boolean z) {
        int size = arrayList.size();
        for (int i = z ? 1 : 0; i < size; i++) {
            g gVar2 = (g) arrayList.get(i);
            if (gVar2 != gVar) {
                x xVar = new x() { // from class: com.tsf.shell.e.f.d.a.a.5
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        g gVar3 = (g) d();
                        gVar3.position().y = 0.0f;
                        gVar3.rotation().y = 0.0f;
                        a.this.e.removeChild(gVar3);
                    }
                };
                xVar.h((com.censivn.C3DEngine.b.b.a.C - (r.b / 2)) - (100.0f * com.censivn.C3DEngine.b.b.a.b));
                w.a(gVar2);
                w.a(gVar2, 500, xVar);
            }
        }
        x xVar2 = new x() { // from class: com.tsf.shell.e.f.d.a.a.6
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.d.c();
            }
        };
        gVar.G();
        gVar.F();
        xVar2.h(0.0f);
        xVar2.d(0.0f);
        w.a(gVar);
        w.a(gVar, 500, xVar2);
        x xVar3 = new x();
        if (z) {
            xVar3.f(this.c.c(gVar.r() - 1));
        } else {
            xVar3.f(this.c.c(gVar.r()));
        }
        w.a(this.e);
        w.a(this.e, VEasing.Linear.easeNone, xVar3);
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(float f, float f2, float f3, float f4, boolean z) {
        if (this.j) {
            if (z && this.f != this.g) {
                this.i = (int) (this.f + (((this.g + this.a) - this.f) * (f / com.censivn.C3DEngine.b.b.a.D)));
            } else {
                this.i = (int) (this.f + ((this.g - this.f) * (f / com.censivn.C3DEngine.b.b.a.D)));
            }
        }
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public float b(int i) {
        return ((i + 1) * this.a) + (this.a / 2.0f);
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public int a(int i, float f, float f2, float f3, float f4, boolean z) {
        if (z) {
            int i2 = ((int) (((f - (com.censivn.C3DEngine.b.b.a.D / 2)) - this.e.position().x) / this.a)) + 1;
            if (i2 < 1) {
                return 1;
            }
            return i2 >= i ? i - 1 : i2;
        }
        int i3 = (int) (((f - (com.censivn.C3DEngine.b.b.a.D / 2)) - this.e.position().x) / this.a);
        if (i3 < 0) {
            return 0;
        }
        if (i3 >= i) {
            return i - 1;
        }
        return i3;
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(r rVar) {
        this.c = rVar;
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(com.tsf.shell.e.f.d.a aVar) {
        this.d = aVar;
    }

    @Override // com.tsf.shell.e.f.d.a.b
    public void a(l lVar) {
        this.e = lVar;
    }
}
