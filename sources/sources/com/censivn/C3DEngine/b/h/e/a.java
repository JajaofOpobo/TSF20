package com.censivn.C3DEngine.b.h.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.b;
import com.tsf.shell.f.e.c;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends j {
    public static float a = 0.15f;
    private j b;
    private j c;
    private j d;
    private com.tsf.shell.f.a.b.b e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private float n;
    private float o;
    private boolean p;
    private int q;
    private int r;
    private float s;
    private k t;
    private k u;
    private TextureElement v;
    private boolean w;
    private boolean x;
    private boolean y;

    public a(float f, float f2, float f3, float f4, float f5) {
        this(null, f, f2, f3, f4, f5);
    }

    public void a(int i) {
    }

    public void b(int i) {
    }

    public void a() {
    }

    public a(i iVar, float f, float f2, float f3, float f4, float f5) {
        this.l = 1;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.q = 1;
        this.r = 0;
        this.f = f;
        this.g = f2;
        this.h = f4;
        this.i = f5;
        this.j = f3;
        this.d = new j();
        this.b = new j();
        this.c = new j() { // from class: com.censivn.C3DEngine.b.h.e.a.1
            private boolean b = false;

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                this.b = false;
                if (getAnimationObjectState()) {
                    if (a.this.x) {
                        this.b = true;
                        com.tsf.shell.manager.a.u.a(a.this.e);
                    }
                    position().x += (a.this.o - position().x) * a.a;
                    if (!a.this.p && Math.abs(position().x - a.this.o) < 0.1f) {
                        position().x = a.this.o;
                        setAnimationObjectState(false);
                        a.this.b(a.this.r);
                    }
                    for (int i = 0; i < numChildren(); i++) {
                        a.this.a(a.this.c.getChildAt(i));
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawEnd() {
                if (this.b) {
                    com.tsf.shell.manager.a.u.a();
                }
            }
        };
        this.e = new com.tsf.shell.f.a.b.b(this.f - (2.0f * f4), this.g, this.c);
        this.b.addChild(this.c);
        super.addChild(this.b);
        super.addChild(this.d);
        iVar = iVar == null ? this.b : iVar;
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.censivn.C3DEngine.b.h.e.a.2
            float a;
            private com.censivn.C3DEngine.b.d.a d;
            private boolean e = false;
            private boolean f = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                float[] fArrA = x.a(motionEvent);
                i hittingTarget = a.this.c.getHittingTarget(fArrA[0], fArrA[1], true);
                if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                    this.d = hittingTarget.getMouseEventListener();
                    this.d.e(motionEvent);
                }
                a aVar = a.this;
                float f6 = a.this.c.position().x;
                this.a = f6;
                aVar.o = f6;
                a.this.c.setAnimationObjectState(true);
                this.f = false;
                this.e = true;
                a.this.p = true;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                this.e = true;
                this.f = false;
                a.this.p = false;
                if (this.d != null) {
                    this.d.f(motionEvent);
                    this.d = null;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                if (this.d != null) {
                    this.d.c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                a.a = 0.15f;
                a.this.m();
                if (this.d != null) {
                    this.d.d(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.d != null) {
                    this.d.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (this.d != null) {
                    this.d.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
                a.a = 0.3f;
                if (this.e) {
                    this.e = false;
                    if (Math.abs(f6) > Math.abs(f7)) {
                        this.f = true;
                        a.this.a();
                    }
                }
                if (this.f) {
                    a.this.o = this.a + (motionEvent2.getX() - motionEvent.getX());
                    a.this.o = c.a(a.this.o, a.this.n, a.this.m);
                    return;
                }
                if (this.d != null) {
                    this.d.a(motionEvent, motionEvent2, f6, f7);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void g(MotionEvent motionEvent) {
                a.a = 0.15f;
                a.this.m();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
                a.a = 0.15f;
                if (!this.f) {
                    a.a = 0.15f;
                    a.this.m();
                    return;
                }
                if (Math.abs(f6) < 100.0f) {
                    a.this.m();
                    return;
                }
                if (f6 > 0.0f && a.this.r > 0) {
                    if (a.this.c.position().x > a.this.s) {
                        a.this.a(a.this.r - 1, true);
                        return;
                    } else {
                        a.this.m();
                        return;
                    }
                }
                if (f6 >= 0.0f || a.this.r >= a.this.q - 1) {
                    a.this.m();
                } else if (a.this.c.position().x < a.this.s) {
                    a.this.a(a.this.r + 1, true);
                } else {
                    a.this.m();
                }
            }
        });
        this.v = x.b(b.d.scrollcontainer_arrow);
        this.t = new k(24.0f * com.censivn.C3DEngine.b.b.a.c, 45.0f * com.censivn.C3DEngine.b.b.a.c, false);
        this.t.rotation().z = 180.0f;
        com.tsf.shell.manager.o.c.a(this.t, com.tsf.shell.manager.o.c.h);
        this.u = new k(24.0f * com.censivn.C3DEngine.b.b.a.c, 45.0f * com.censivn.C3DEngine.b.b.a.c, false);
        com.tsf.shell.manager.o.c.a(this.u, com.tsf.shell.manager.o.c.h);
        this.t.textures().addElement(this.v);
        this.u.textures().addElement(this.v);
        this.t.calAABB(3.0f, 3.0f, 1.0f);
        this.u.calAABB(3.0f, 3.0f, 1.0f);
        this.t.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.censivn.C3DEngine.b.h.e.a.3
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.a = 0.1f;
                a.this.k();
            }
        });
        this.u.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.censivn.C3DEngine.b.h.e.a.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.a = 0.1f;
                a.this.j();
            }
        });
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.r < this.q - 1) {
            a(this.r + 1, true);
        } else {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.r > 0) {
            a(this.r - 1, true);
        } else {
            m();
        }
    }

    public void a(float f) {
        this.j = f;
    }

    public j b() {
        return this.c;
    }

    public j c() {
        return this.b;
    }

    public void d() {
        this.w = true;
    }

    public void e() {
        this.x = true;
    }

    public void f() {
        this.x = false;
    }

    public void g() {
        this.y = false;
        b(this.t);
        b(this.u);
    }

    public void h() {
        this.y = true;
        l();
    }

    private void l() {
        if (this.q > 1) {
            if (this.r > 0) {
                a(this.t);
            } else {
                b(this.t);
            }
            if (this.r < this.q - 1) {
                a(this.u);
                return;
            } else {
                b(this.u);
                return;
            }
        }
        b(this.t);
        b(this.u);
    }

    private void a(k kVar) {
        if (this.y) {
            if (kVar.parent() == null) {
                this.d.addChild(kVar);
            }
            d dVar = new d();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(kVar);
            com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
        }
        kVar.mouseEnabled(true);
    }

    private void b(final k kVar) {
        if (kVar.parent() != null) {
            d dVar = new d() { // from class: com.censivn.C3DEngine.b.h.e.a.5
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.d.removeChild(kVar);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(kVar);
            com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
        }
        kVar.mouseEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        if ((iVar.position().x - (this.j / 2.0f)) + this.c.position().x >= this.f / 2.0f || iVar.position().x + (this.j / 2.0f) + this.c.position().x <= (-this.f) / 2.0f) {
            iVar.visible(false);
        } else {
            iVar.visible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        int i = -((int) ((this.c.position().x - (this.f / 2.0f)) / this.f));
        if (i < 0) {
            i = 0;
        } else if (i > this.q - 1) {
            i = this.q - 1;
        }
        a(i, true);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public i getChildAt(int i) {
        return this.c.getChildAt(i);
    }

    public void a(int i, boolean z) {
        if (this.r < this.c.numChildren()) {
            this.r = i;
            float f = (-this.r) * this.f;
            this.s = f;
            this.o = f;
            this.c.setAnimationObjectState(true);
            l();
            if (!z) {
                this.c.position().x = this.o;
            }
            a(this.r);
        }
    }

    public void a(float f, float f2, float f3, float f4) {
        this.f = f3 - f;
        this.g = f4 - f2;
        i();
    }

    public void i() {
        this.b.setAABBPX((-this.f) / 2.0f, (-this.g) / 2.0f, 0.0f, this.f / 2.0f, this.g / 2.0f, 1.0f);
        this.t.position().x = ((-this.f) / 2.0f) + this.t.b();
        this.u.position().x = (this.f / 2.0f) - this.t.b();
        this.e.a(this.f - (this.h * 2.0f));
        this.e.b(this.g);
        n();
        c(0);
        d(0);
        a(this.r, false);
    }

    private void n() {
        float f = this.f - (this.h * 2.0f);
        this.l = (int) ((this.i + f) / (this.j + this.i));
        this.l = this.l == 0 ? 1 : this.l;
        if (this.l == 1) {
            this.k = 0.0f;
        } else {
            this.k = (f - (this.l * this.j)) / (this.l - 1);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void addChildAt(i iVar, int i) {
        this.c.addChildAt(iVar, i);
        c(i);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        int iNumChildren = this.c.numChildren();
        this.c.addChild(iVar);
        c(iNumChildren);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        int childIndexOf = this.c.getChildIndexOf(iVar);
        if (childIndexOf == -1) {
            return false;
        }
        this.c.removeChildAt(childIndexOf);
        c(childIndexOf);
        return true;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public int numChildren() {
        return this.c.numChildren();
    }

    private void c(int i) {
        this.q = this.c.numChildren() % this.l == 0 ? this.c.numChildren() / this.l : (this.c.numChildren() / this.l) + 1;
        int i2 = i / this.l;
        this.n = 0.0f;
        this.m = ((-this.q) * this.f) + this.f;
        this.m = this.m > 0.0f ? 0.0f : this.m;
        d(i2);
        l();
    }

    private void d(int i) {
        while (i < this.q) {
            e(i);
            i++;
        }
    }

    private void e(int i) {
        int iNumChildren = this.c.numChildren();
        int i2 = i * this.l;
        int i3 = this.l + i2 > iNumChildren + (-1) ? iNumChildren - 1 : this.l + i2;
        float f = this.w ? ((this.f - (((r1 - 1) * this.k) + (((i3 - i2) + 1) * this.j))) / 2.0f) + ((-this.f) / 2.0f) + (i * this.f) + (this.j / 2.0f) : ((-this.f) / 2.0f) + (i * this.f) + this.h + (this.j / 2.0f);
        for (int i4 = i2; i4 < i3 + 1; i4++) {
            i childAt = this.c.getChildAt(i4);
            childAt.position().x = f;
            f += this.k + this.j;
            a(childAt);
        }
    }
}
