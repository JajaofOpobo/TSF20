package com.censivn.C3DEngine.b.h.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.b;
import com.tsf.shell.f.e.c;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends j {
    public static float a = 0.15f;
    private k A;
    private com.censivn.C3DEngine.b.d.a B;
    private j b;
    private j c;
    private com.tsf.shell.f.a.b.b d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private int p;
    private int q;
    private float r;
    private k s;
    private k t;
    private TextureElement u;
    private ArrayList<a> v;
    private float w;
    private boolean x;
    private boolean y;
    private boolean z;

    public b(float f, float f2, float f3, float f4, float f5, float f6) {
        this(null, f, f2, f3, f4, f5, f6);
    }

    public void a() {
        this.z = true;
    }

    public void b() {
        this.z = false;
    }

    public b(i iVar, float f, float f2, float f3, float f4, float f5, float f6) {
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = false;
        this.w = 1.0f;
        this.x = false;
        this.y = false;
        this.z = false;
        this.w = f6;
        this.v = new ArrayList<>();
        this.p = 1;
        this.q = 0;
        this.e = f;
        this.f = f2;
        this.A = new k(100.0f, 100.0f, false);
        this.g = f4;
        this.h = f5;
        this.i = f3;
        this.c = new j();
        this.b = new j() { // from class: com.censivn.C3DEngine.b.h.e.b.1
            private boolean b = false;

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildStart() {
                b.this.h();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                b.this.k();
                if (b.this.y && b.this.b.getAnimationObjectState()) {
                    this.b = true;
                    com.tsf.shell.manager.a.u.a(b.this.d);
                } else {
                    this.b = false;
                }
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildEnd(i iVar2) {
                b.this.c(iVar2);
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawEnd() {
                if (this.b) {
                    com.tsf.shell.manager.a.u.a();
                }
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void addChildAt(i iVar2, int i) {
                iVar2.setAnimationObjectState(true);
                b.this.o();
                b.this.h(iVar2);
                super.addChildAt(iVar2, i);
                b.this.a(numChildren());
                b.this.t();
                b.this.c(i);
                b.this.a(iVar2);
            }

            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public void addChild(i iVar2) {
                iVar2.setAnimationObjectState(true);
                b.this.o();
                b.this.h(iVar2);
                super.addChild(iVar2);
                b.this.a(numChildren());
                b.this.t();
                b.this.a(iVar2);
            }

            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public boolean removeChild(i iVar2) {
                int childIndexOf = b.this.b.getChildIndexOf(iVar2);
                if (childIndexOf != -1) {
                    b.this.p();
                    super.removeChildAt(childIndexOf);
                    b.this.a(numChildren());
                    b.this.t();
                    b.this.c(childIndexOf);
                    b.this.r();
                    b.this.b(iVar2);
                    return true;
                }
                return false;
            }
        };
        super.addChild(this.b);
        super.addChild(this.c);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(iVar == null ? this : iVar) { // from class: com.censivn.C3DEngine.b.h.e.b.2
            private float b;
            private com.censivn.C3DEngine.b.d.a g;
            private i h;
            private boolean d = false;
            private boolean e = false;
            private boolean f = false;
            private Number3d i = new Number3d();
            private float[] j = {0.0f, 0.0f};
            private Number3d k = new Number3d();
            private int l = 0;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.e = false;
                b.this.o = true;
                this.d = false;
                this.b = b.this.b.position().x;
                b.this.b.setAnimationObjectState(true);
                b.this.n = this.b;
                this.h = b.this.b.getHittingObjectTarget(motionEvent, true);
                if (b.this.B != null) {
                    this.g = b.this.B;
                    this.g.e(motionEvent);
                    return;
                }
                if (b.this.x && this.h != null && this.h.getMouseEventListener() != null) {
                    this.h = b.this.b.getChildAt(0);
                }
                if (this.h != null && this.h.getMouseEventListener() != null) {
                    this.g = this.h.getMouseEventListener();
                    this.g.e(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (this.g != null) {
                    this.g.f(motionEvent);
                    this.g = null;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                b.a = 0.3f;
                b.this.n = this.b + (motionEvent2.getX() - motionEvent.getX());
                b.this.n = c.a(b.this.n, b.this.m, b.this.l);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
                if (b.this.z) {
                    if (this.h != null && this.d && !this.f) {
                        this.f = true;
                        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.h.e.b.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass2.this.f = false;
                                if (AnonymousClass2.this.d) {
                                    if (!AnonymousClass2.this.e) {
                                        if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                                            AnonymousClass2.this.e = true;
                                            return;
                                        }
                                        return;
                                    }
                                    x.a(motionEvent2, AnonymousClass2.this.j);
                                    AnonymousClass2.this.k.x = AnonymousClass2.this.j[0];
                                    AnonymousClass2.this.k.y = AnonymousClass2.this.j[1];
                                    b.this.b.globalToLocal(AnonymousClass2.this.k);
                                    float f7 = AnonymousClass2.this.k.x + (b.this.e / 2.0f);
                                    int i = (int) (f7 / b.this.e);
                                    float f8 = f7 - (i * b.this.e);
                                    int i2 = ((int) ((f8 - b.this.g) / (b.this.i + (b.this.j / 2.0f)))) + (b.this.k * i);
                                    if (AnonymousClass2.this.k.y <= b.this.f / 2.0f && AnonymousClass2.this.k.y >= (-b.this.f) / 2.0f) {
                                        if (f8 < b.this.g) {
                                            b.this.j();
                                        } else if (f8 <= b.this.e - b.this.g) {
                                            if (!b.this.b.getAnimationObjectState()) {
                                                int iNumChildren = i2 >= 0 ? i2 : 0;
                                                if (iNumChildren > b.this.b.numChildren() - 1) {
                                                    iNumChildren = b.this.b.numChildren() - 1;
                                                }
                                                if (b.this.q == i && AnonymousClass2.this.l != iNumChildren) {
                                                    AnonymousClass2.this.l = iNumChildren;
                                                    b.this.A.removeFromParent();
                                                    b.this.b.addChildAt(b.this.A, AnonymousClass2.this.l);
                                                }
                                            }
                                        } else {
                                            b.this.i();
                                        }
                                    }
                                    AnonymousClass2.this.h.position().x = (motionEvent2.getX() - motionEvent.getX()) + AnonymousClass2.this.i.x;
                                    AnonymousClass2.this.h.position().y = (motionEvent.getY() - motionEvent2.getY()) + AnonymousClass2.this.i.y;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                if (this.g != null) {
                    this.g.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                b.this.o = false;
                b.a = 0.15f;
                if (b.this.z) {
                    if (this.h != null) {
                        w.a();
                        this.l = b.this.b.getChildIndexOf(this.h);
                        this.i.reset();
                        this.i = this.h.localToGlobal(this.i);
                        b.this.b.replaceChild(this.h, b.this.A);
                        this.h.position().setAllFrom(this.i);
                        this.h.setAnimationObjectState(true);
                        com.tsf.shell.manager.a.j.a(this.h);
                        this.d = true;
                        return;
                    }
                    return;
                }
                if (this.g != null) {
                    this.g.c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                b.this.o = false;
                b.a = 0.15f;
                if (b.this.z) {
                    if (this.h != null) {
                        this.d = false;
                        this.i.setAllFrom(this.h.position());
                        com.tsf.shell.manager.a.j.b(this.h);
                        b.this.b.globalToLocal(this.i);
                        b.this.b.replaceChild(b.this.A, this.h);
                        this.h.position().setAllFrom(this.i);
                        return;
                    }
                    return;
                }
                if (this.g != null) {
                    this.g.d(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                b.this.o = false;
                if (this.g != null) {
                    this.g.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void g(MotionEvent motionEvent) {
                b.this.o = false;
                b.a = 0.15f;
                b.this.r();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                b.this.o = false;
                b.a = 0.15f;
                if (Math.abs(f7) < 100.0f) {
                    b.this.r();
                    return;
                }
                if (f7 > 0.0f && b.this.q > 0) {
                    if (b.this.b.position().x > b.this.r) {
                        b.this.b(b.this.q - 1);
                        return;
                    } else {
                        b.this.r();
                        return;
                    }
                }
                if (f7 >= 0.0f || b.this.q >= b.this.p - 1) {
                    b.this.r();
                } else if (b.this.b.position().x < b.this.r) {
                    b.this.b(b.this.q + 1);
                } else {
                    b.this.r();
                }
            }
        });
        this.d = new com.tsf.shell.f.a.b.b(this.e - (2.0f * f4), this.f, this.b);
        this.u = x.b(b.d.scrollcontainer_arrow);
        this.s = new k(com.censivn.C3DEngine.b.b.a.c * 24.0f, com.censivn.C3DEngine.b.b.a.c * 45.0f, false);
        this.s.rotation().z = 180.0f;
        com.tsf.shell.manager.o.c.a(this.s, com.tsf.shell.manager.o.c.h);
        this.t = new k(com.censivn.C3DEngine.b.b.a.c * 24.0f, com.censivn.C3DEngine.b.b.a.c * 45.0f, false);
        com.tsf.shell.manager.o.c.a(this.t, com.tsf.shell.manager.o.c.h);
        this.s.textures().addElement(this.u);
        this.t.textures().addElement(this.u);
        n();
    }

    public void a(com.censivn.C3DEngine.b.d.a aVar) {
        this.B = aVar;
    }

    public i a(MotionEvent motionEvent) {
        return this.b.getHittingObjectTarget(motionEvent, true);
    }

    public j c() {
        return this.b;
    }

    public void d() {
        this.y = true;
    }

    public void e() {
        this.x = true;
    }

    public void f() {
        this.x = false;
    }

    public void a(int i) {
    }

    public int g() {
        return this.q;
    }

    public void a(i iVar) {
    }

    public void b(i iVar) {
    }

    public void h() {
    }

    public void c(i iVar) {
    }

    public void i() {
        if (!this.b.getAnimationObjectState() && this.q < this.p - 1) {
            w.a();
            b(this.q + 1);
        }
    }

    public void j() {
        if (!this.b.getAnimationObjectState() && this.q > 0) {
            w.a();
            b(this.q - 1);
        }
    }

    public void k() {
        if (this.b.getAnimationObjectState()) {
            this.b.position().x += (this.n - this.b.position().x) * a;
            if (!this.o && Math.abs(this.b.position().x - this.n) < 0.1f) {
                this.b.position().x = this.n;
                this.b.setAnimationObjectState(false);
            }
        }
        for (int i = 0; i < this.b.numChildren(); i++) {
            i childAt = this.b.getChildAt(i);
            if (g(childAt)) {
                childAt.visible(true);
            } else {
                childAt.visible(false);
            }
            if (childAt.getAnimationObjectState()) {
                a aVar = this.v.get(i);
                if (childAt.visible() || a(aVar.a)) {
                    boolean z = childAt.getTweenChild() != null;
                    childAt.position().x += (aVar.a - childAt.position().x) * a;
                    childAt.position().y += (aVar.b - childAt.position().y) * a;
                    if (!z) {
                        childAt.scale().x += (this.w - childAt.scale().x) * a;
                        childAt.scale().y = childAt.scale().x;
                    }
                    if (!z && Math.abs(childAt.position().x - aVar.a) < 0.1f && Math.abs(childAt.position().y - aVar.b) < 0.1f && Math.abs(childAt.scale().x - this.w) < 0.1f) {
                        childAt.position().x = aVar.a;
                        childAt.position().y = aVar.b;
                        Number3d number3dScale = childAt.scale();
                        Number3d number3dScale2 = childAt.scale();
                        float f = this.w;
                        number3dScale2.y = f;
                        number3dScale.x = f;
                        childAt.setAnimationObjectState(false);
                    }
                } else {
                    childAt.position().x = aVar.a;
                    childAt.position().y = aVar.b;
                    Number3d number3dScale3 = childAt.scale();
                    Number3d number3dScale4 = childAt.scale();
                    float f2 = this.w;
                    number3dScale4.y = f2;
                    number3dScale3.x = f2;
                    childAt.setAnimationObjectState(false);
                }
            }
        }
    }

    public j l() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int size = this.v.size();
        a aVar = new a();
        aVar.a = d(size);
        aVar.b = 0.0f;
        this.v.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.v.remove(this.v.size() - 1);
    }

    public void m() {
        for (int i = 0; i < this.b.numChildren(); i++) {
            this.b.getChildAt(i).setAnimationObjectState(true);
        }
    }

    private void q() {
        if (this.p > 1) {
            if (this.q > 0) {
                a(this.s);
            } else {
                b(this.s);
            }
            if (this.q < this.p - 1) {
                a(this.t);
                return;
            } else {
                b(this.t);
                return;
            }
        }
        b(this.s);
        b(this.t);
    }

    private void a(k kVar) {
        if (kVar.parent() == null) {
            this.c.addChild(kVar);
        }
        d dVar = new d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(kVar);
        com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
    }

    private void b(final k kVar) {
        if (kVar.parent() != null) {
            d dVar = new d() { // from class: com.censivn.C3DEngine.b.h.e.b.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    b.this.c.removeChild(kVar);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(kVar);
            com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
        }
    }

    private boolean g(i iVar) {
        return a(iVar.position().x);
    }

    private boolean a(float f) {
        return (f - (this.i / 2.0f)) + this.b.position().x <= this.e / 2.0f && ((this.i / 2.0f) + f) + this.b.position().x >= (-this.e) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        int i = -((int) ((this.b.position().x - (this.e / 2.0f)) / this.e));
        if (i > this.p - 1) {
            i = this.p - 1;
        }
        if (i < 0) {
            i = 0;
        }
        b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        this.q = i;
        float f = (-this.q) * this.e;
        this.r = f;
        this.n = f;
        t();
        this.b.setAnimationObjectState(true);
        this.b.invalidate();
    }

    public void a(float f, float f2, float f3, float f4) {
        this.e = f3 - f;
        this.f = f4 - f2;
        n();
    }

    public void n() {
        setAABBPX((-this.e) / 2.0f, (-this.f) / 2.0f, 0.0f, this.e / 2.0f, this.f / 2.0f, 1.0f);
        this.s.position().x = ((-this.e) / 2.0f) + this.s.b();
        this.t.position().x = (this.e / 2.0f) - this.s.b();
        this.d.a(this.e - (this.g * 2.0f));
        this.d.b(this.f);
        s();
        t();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            this.v.get(i).a = d(i);
        }
        int size2 = this.b.children().size();
        for (int i2 = 0; i2 < size2; i2++) {
            i iVar = this.b.children().get(i2);
            iVar.position().x = this.v.get(i2).a;
        }
    }

    private void s() {
        float f = this.e - (this.g * 2.0f);
        this.k = (int) ((this.h + f) / (this.i + this.h));
        this.k = this.k == 0 ? 1 : this.k;
        this.j = (f - (this.k * this.i)) / (this.k - 1);
    }

    public void d(i iVar) {
        this.b.addChildAt(iVar, this.k * this.q);
    }

    public void e(i iVar) {
        int i = this.k * this.q;
        this.b.addChildAt(iVar, i);
        a aVar = this.v.get(i);
        iVar.position().x = aVar.a;
        iVar.position().y = aVar.b;
        iVar.scale().setAll(0.0f, 0.0f, 1.0f);
        d dVar = new d();
        dVar.l(this.w);
        dVar.m(this.w);
        dVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 500, dVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        this.b.addChild(iVar);
    }

    public void f(i iVar) {
        this.b.addChild(iVar);
        a aVar = this.v.get(this.b.numChildren() - 1);
        iVar.position().x = aVar.a;
        iVar.position().y = aVar.b;
        iVar.scale().setAll(0.0f, 0.0f, 1.0f);
        d dVar = new d();
        dVar.l(this.w);
        dVar.m(this.w);
        dVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 500, dVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        return this.b.removeChild(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(i iVar) {
        if (iVar.parent() != null) {
            Number3d.TEMPNUMBER3D.reset();
            iVar.localToGlobal(Number3d.TEMPNUMBER3D);
            this.b.globalToLocal(Number3d.TEMPNUMBER3D);
            iVar.position().setAllFrom(Number3d.TEMPNUMBER3D);
            iVar.removeFromParent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.p = this.b.numChildren() % this.k == 0 ? this.b.numChildren() / this.k : (this.b.numChildren() / this.k) + 1;
        this.m = 0.0f;
        this.l = ((-this.p) * this.e) + this.e;
        this.l = this.l > 0.0f ? 0.0f : this.l;
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        int size = this.b.children().size();
        while (i < size) {
            this.b.children().get(i).setAnimationObjectState(true);
            i++;
        }
    }

    private float d(int i) {
        return ((i / this.k) * this.e) + ((-this.e) / 2.0f) + this.g + (this.i / 2.0f) + ((i % this.k) * (this.j + this.i));
    }

    public class a {
        public float a;
        public float b;

        public a() {
        }
    }
}
