package com.tsf.shell.f.f.d.a;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.shell.f.f.g;
import com.tsf.shell.f.f.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a implements b {
    public int a;
    public int b;
    private n c;
    private com.tsf.shell.f.f.d.a d;
    private j e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;

    @Override // com.tsf.shell.f.f.d.a.b
    public void a() {
        if (this.e.position().x != this.i) {
            c.a(this.e);
            PositionNumber3d position = this.e.position();
            position.x = (float) (position.x + ((this.i - this.e.position().x) * 0.1d));
            this.e.setAnimationObjectState(true);
            if (Math.abs(this.i - this.e.position().x) < 0.01d) {
                this.e.position().x = this.i;
                this.e.setAnimationObjectState(false);
            }
        }
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(final g gVar, com.censivn.C3DEngine.b.g.b.a aVar) {
        c.a(aVar);
        final float f = gVar.rotation().y;
        c.a(aVar, 500, new d() { // from class: com.tsf.shell.f.f.d.a.a.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                gVar.rotation().y = f + ((0.0f - f) * f2);
            }
        });
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void b(final g gVar, com.censivn.C3DEngine.b.g.b.a aVar) {
        final float f = gVar.rotation().y;
        d dVar = new d() { // from class: com.tsf.shell.f.f.d.a.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                gVar.rotation().y = f + ((50.0f - f) * f2);
            }
        };
        c.a(aVar);
        c.a(aVar, 500, dVar);
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(int i, int i2) {
        this.a = (int) ((n.a - (100.0f * com.censivn.C3DEngine.b.b.a.b)) / 2.0f);
        a(this.l);
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(int i) {
        this.l = i;
        this.b = (int) (60.0f * com.censivn.C3DEngine.b.b.a.a);
        this.k = (int) ((i - 1) * n.c);
        if (this.k + n.a + (20.0f * com.censivn.C3DEngine.b.b.a.a) > com.censivn.C3DEngine.b.b.a.D) {
            this.j = true;
            this.f = (int) (com.censivn.C3DEngine.b.b.a.z + (n.a / 2) + (com.censivn.C3DEngine.b.b.a.a * 10.0f));
            this.g = (int) ((((0 - this.k) + com.censivn.C3DEngine.b.b.a.A) - (n.a / 2)) - (com.censivn.C3DEngine.b.b.a.a * 10.0f));
        } else {
            this.j = false;
            this.i = (-this.k) / 2;
            this.f = this.i;
            this.g = this.i;
        }
        if (((int) ((this.b * (i - 1)) + n.b + (com.censivn.C3DEngine.b.b.a.a * 10.0f * 2.0f))) > com.censivn.C3DEngine.b.b.a.E) {
            this.b = (int) (((com.censivn.C3DEngine.b.b.a.E - n.b) - ((com.censivn.C3DEngine.b.b.a.a * 10.0f) * 2.0f)) / (i - 1));
        }
        this.h = 0 - ((this.b * (i - 1)) / 2);
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(g gVar) {
        if (this.k > com.censivn.C3DEngine.b.b.a.D) {
            this.i = (int) this.c.c(gVar.r());
        } else {
            this.i = (-this.k) / 2;
        }
        this.e.position().x = this.i;
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(d dVar, g gVar) {
        dVar.f(gVar.r() * n.c);
        dVar.h(this.h + (gVar.r() * this.b));
        dVar.j(0.0f);
        dVar.d(0.0f);
        dVar.c(0.0f);
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(int i, ArrayList<g> arrayList, g gVar, boolean z) {
        d dVar;
        if (this.i > this.f) {
            this.i = this.f;
        } else if (this.i < this.g) {
            this.i = this.g;
        }
        int i2 = 0;
        for (int i3 = z ? 1 : 0; i3 < i; i3++) {
            g gVar2 = arrayList.get(i3);
            gVar2.o();
            gVar2.position().x = n.c * i2;
            if (gVar2 != gVar) {
                gVar2.O();
                if (gVar2.parent() == null) {
                    gVar2.rotation().y = 50.0f;
                    gVar2.d(false);
                    gVar2.removeFromParent();
                    this.e.addChild(gVar2);
                }
                dVar = new d();
                dVar.h(this.h + (this.b * i2));
            } else {
                dVar = new d() { // from class: com.tsf.shell.f.f.d.a.a.3
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        a.this.d.b();
                    }
                };
                dVar.d(0.0f);
                dVar.h(this.h + (this.b * i2));
            }
            i2++;
            c.a(gVar2);
            c.a(gVar2, 500, dVar);
        }
        if (z) {
            if (gVar.t() != -1) {
                gVar.E();
                return;
            }
            d dVar2 = new d() { // from class: com.tsf.shell.f.f.d.a.a.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    g gVar3 = (g) d();
                    gVar3.position().y = 0.0f;
                    gVar3.rotation().y = 0.0f;
                    a.this.e.removeChild(gVar3);
                }
            };
            dVar2.h((com.censivn.C3DEngine.b.b.a.C - (n.b / 2)) - (100.0f * com.censivn.C3DEngine.b.b.a.b));
            c.a(gVar);
            this.c.a(this.c.o(), true, true);
            c.a(gVar, 500, dVar2);
            return;
        }
        gVar.E();
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(ArrayList<g> arrayList, g gVar, boolean z) {
        int size = arrayList.size();
        for (int i = z ? 1 : 0; i < size; i++) {
            g gVar2 = arrayList.get(i);
            if (gVar2 != gVar) {
                d dVar = new d() { // from class: com.tsf.shell.f.f.d.a.a.5
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        g gVar3 = (g) d();
                        gVar3.position().y = 0.0f;
                        gVar3.rotation().y = 0.0f;
                        a.this.e.removeChild(gVar3);
                    }
                };
                dVar.h((com.censivn.C3DEngine.b.b.a.C - (n.b / 2)) - (100.0f * com.censivn.C3DEngine.b.b.a.b));
                c.a(gVar2);
                c.a(gVar2, 500, dVar);
            }
        }
        d dVar2 = new d() { // from class: com.tsf.shell.f.f.d.a.a.6
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.d.c();
            }
        };
        gVar.G();
        gVar.F();
        dVar2.h(0.0f);
        dVar2.d(0.0f);
        c.a(gVar);
        c.a(gVar, 500, dVar2);
        d dVar3 = new d();
        if (z) {
            dVar3.f(this.c.c(gVar.r() - 1));
        } else {
            dVar3.f(this.c.c(gVar.r()));
        }
        c.a(this.e);
        c.a(this.e, VEasing.Linear.easeNone, dVar3);
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(float f, float f2, float f3, float f4, boolean z) {
        if (this.j) {
            if (z && this.f != this.g) {
                this.i = (int) (this.f + (((this.g + this.a) - this.f) * (f / com.censivn.C3DEngine.b.b.a.D)));
            } else {
                this.i = (int) (this.f + ((this.g - this.f) * (f / com.censivn.C3DEngine.b.b.a.D)));
            }
        }
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public float b(int i) {
        return ((i + 1) * this.a) + (this.a / 2.0f);
    }

    @Override // com.tsf.shell.f.f.d.a.b
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

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(n nVar) {
        this.c = nVar;
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(com.tsf.shell.f.f.d.a aVar) {
        this.d = aVar;
    }

    @Override // com.tsf.shell.f.f.d.a.b
    public void a(j jVar) {
        this.e = jVar;
    }
}
