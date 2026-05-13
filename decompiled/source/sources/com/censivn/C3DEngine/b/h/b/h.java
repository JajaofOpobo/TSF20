package com.censivn.C3DEngine.b.h.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h extends j {
    public static float a = 0.15f;
    private b D;
    private f E;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private int p;
    private int q;
    private int r;
    private k s;
    private k t;
    private TextureElement u;
    private int z;
    private int e = 0;
    private float v = 0.0f;
    private float w = 0.0f;
    private float x = 0.0f;
    private int y = -1;
    private boolean A = false;
    private boolean F = false;
    private Number3d G = new Number3d();
    private ArrayList<i> H = new ArrayList<>();
    private ArrayList<Integer> I = new ArrayList<>();
    private ArrayList<Integer> J = new ArrayList<>();
    private ArrayList<i> K = new ArrayList<>();
    private ArrayList<a> B = new ArrayList<>();
    private ArrayList<a> C = new ArrayList<>();
    private j d = new j();
    private j b = new j();
    private j c = new j() { // from class: com.censivn.C3DEngine.b.h.b.h.2
        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            h.this.f();
        }
    };

    public void a(final float f, final float f2, final float f3, final float f4) {
        if (com.censivn.C3DEngine.a.e.l()) {
            c(f3 - f, f4 - f2);
            return;
        }
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.h.b.h.1
            @Override // java.lang.Runnable
            public void run() {
                h.this.c(f3 - f, f4 - f2);
            }
        });
    }

    public j a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f, float f2) {
        this.f = f;
        this.g = f2;
        this.b.setAABBPX((-this.f) / 2.0f, (-this.g) / 2.0f, 0.0f, this.f / 2.0f, this.g / 2.0f, 1.0f);
        this.s.position().x = ((-this.f) / 2.0f) + this.s.b();
        this.t.position().x = (this.f / 2.0f) - this.s.b();
        this.h = this.f - (this.j * 2.0f);
        this.i = this.g - (this.k * 2.0f);
        this.p = (int) (this.h / this.l);
        this.q = (int) (this.i / this.m);
        this.p = this.p < 1 ? 1 : this.p;
        this.q = this.q < 1 ? 1 : this.q;
        this.r = this.p * this.q;
        this.n = this.p == 1 ? 0.0f : (this.h - (this.p * this.l)) / (this.p - 1);
        this.o = this.q != 1 ? (this.i - (this.q * this.m)) / (this.q - 1) : 0.0f;
        g();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.B.size()) {
                a(i2, this.B.get(i2));
                i = i2 + 1;
            } else {
                d();
                return;
            }
        }
    }

    public void a(float f, float f2) {
        this.l = f;
        this.m = f2;
    }

    private void g() {
        int size = this.B.size();
        this.z = size % this.r == 0 ? size / this.r : (size / this.r) + 1;
        this.w = 0.0f;
        this.v = ((-this.z) * this.f) + this.f;
        this.v = this.v > 0.0f ? 0.0f : this.v;
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int i = -((int) ((this.c.position().x - (this.f / 2.0f)) / this.f));
        if (i > this.z - 1) {
            i = this.z - 1;
        }
        if (i < 0) {
            i = 0;
        }
        a(i);
    }

    private void a(int i) {
        if (i != this.y) {
            this.y = i;
        }
        p();
        this.x = (-this.y) * this.f;
        this.c.setAnimationObjectState(true);
    }

    public void b(float f, float f2) {
        PositionNumber3d position = this.c.position();
        this.d.position().x = f;
        position.x = f;
        PositionNumber3d position2 = this.c.position();
        this.d.position().y = f2;
        position2.y = f2;
    }

    public void a(b bVar) {
        this.D = bVar;
        d();
    }

    public void b() {
        this.e = 0;
        e();
        c();
    }

    public void c() {
        while (!this.c.children().isEmpty()) {
            i removeChildAt = this.c.removeChildAt(0);
            this.H.add(removeChildAt);
            this.K.add(removeChildAt);
        }
    }

    public void a(f fVar) {
        this.E = fVar;
    }

    public void d() {
        this.F = true;
        if (this.D != null) {
            Iterator<i> it = this.c.children().iterator();
            while (it.hasNext()) {
                it.next().setDisplayTag(-1);
            }
            Iterator<i> it2 = this.H.iterator();
            while (it2.hasNext()) {
                it2.next().setDisplayTag(-1);
            }
        }
    }

    public void e() {
        a(0);
        this.c.position().x = this.x;
    }

    private void i() {
        int i = 0;
        if (this.F) {
            this.F = false;
            this.e = this.D.a();
            if (this.B.size() < this.e) {
                int size = this.e - this.B.size();
                while (i < size) {
                    j();
                    i++;
                }
            } else if (this.B.size() > this.e) {
                int size2 = this.B.size() - this.e;
                while (i < size2) {
                    k();
                    i++;
                }
            }
            g();
            this.c.setAnimationObjectState(true);
        }
    }

    private void j() {
        a remove;
        int size = this.B.size();
        if (this.C.isEmpty()) {
            remove = new a();
        } else {
            remove = this.C.remove(0);
        }
        a(size, remove);
        this.B.add(remove);
    }

    private void k() {
        this.C.add(this.B.remove(this.B.size() - 1));
    }

    private void a(int i, a aVar) {
        float f;
        int i2 = i / this.r;
        int i3 = i - (this.r * i2);
        int i4 = i3 % this.p;
        int i5 = i3 / this.p;
        if (this.p == 1) {
            f = i2 * this.f;
        } else {
            f = (i2 * this.f) + ((-this.h) / 2.0f) + (this.l / 2.0f) + (i4 * (this.n + this.l));
        }
        aVar.a(f, ((this.i / 2.0f) - (this.q < 2 ? this.i / 2.0f : this.m / 2.0f)) - ((this.o + this.m) * i5));
    }

    private void a(int i, i iVar) {
        a aVar = this.B.get(i);
        iVar.position().x = aVar.a;
        iVar.position().y = aVar.b;
    }

    private void b(int i, i iVar) {
        iVar.setDisplayTag(i);
        this.c.addChild(iVar);
        a(i, iVar);
    }

    public h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.j = 0.0f;
        this.k = 0.0f;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.b.addChild(this.c);
        super.addChild(this.b);
        super.addChild(this.d);
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.censivn.C3DEngine.b.h.b.h.3
            float a;
            private i d = null;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                h.this.A = true;
                this.a = h.this.c.position().x;
                h.this.c.setAnimationObjectState(true);
                h.this.x = this.a;
                float[] a2 = x.a(motionEvent);
                h.this.G.reset();
                h.this.G.x = a2[0];
                h.this.G.y = a2[1];
                h.this.G = h.this.c.globalToLocal(h.this.G);
                int d = h.this.d(h.this.G.x, h.this.G.y);
                this.d = null;
                if (d != -1) {
                    Iterator<i> it = h.this.c.children().iterator();
                    while (it.hasNext()) {
                        i next = it.next();
                        if (next.getDisplayTag() == d) {
                            this.d = next;
                            return;
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                h.this.A = false;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                h.a = 0.3f;
                h.this.x = this.a + (motionEvent2.getX() - motionEvent.getX());
                h.this.x = com.tsf.shell.f.e.c.a(h.this.x, h.this.w, h.this.v);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (h.this.E != null && this.d != null) {
                    h.this.E.a(this.d, this.d.getDisplayTag(), motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                h.this.A = false;
                h.a = 0.15f;
                if (h.this.E != null && this.d != null) {
                    h.this.E.b(this.d, this.d.getDisplayTag(), motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                h.this.A = false;
                h.a = 0.15f;
                if (h.this.E != null && this.d != null) {
                    h.this.E.c(this.d, this.d.getDisplayTag(), motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (h.this.E != null && this.d != null) {
                    h.this.E.a(this.d, this.d.getDisplayTag(), motionEvent);
                }
                h.this.A = false;
                h.a = 0.15f;
                h.this.h();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void g(MotionEvent motionEvent) {
                h.this.A = false;
                h.a = 0.15f;
                h.this.h();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                h.this.A = false;
                h.a = 0.15f;
                if (Math.abs(f7) < 100.0f) {
                    h.this.h();
                } else if (f7 > 0.0f && h.this.y > 0) {
                    h.this.m();
                } else if (f7 >= 0.0f || h.this.y >= h.this.z - 1) {
                    h.this.h();
                } else {
                    h.this.l();
                }
            }
        });
        n();
        c(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.y < this.z - 1) {
            a(this.y + 1);
        } else {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.y > 0) {
            a(this.y - 1);
        } else {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(float f, float f2) {
        float f3 = f + com.censivn.C3DEngine.b.b.a.H;
        float f4 = f2 - (this.g / 2.0f);
        int i = (int) (((f3 % this.f) - this.j) / (this.l + this.n));
        int i2 = -((int) ((f4 - this.k) / (this.m + this.o)));
        if (i > this.p - 1) {
            i = this.p - 1;
        } else if (i < 0) {
            i = 0;
        }
        if (i2 > this.q - 1) {
            i2 = this.q - 1;
        } else if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.e - 1;
        int i4 = (int) (f3 / this.f);
        int i5 = i + ((i4 >= 0 ? i4 : 0) * this.r) + (i2 * this.p);
        if (i5 <= i3 && i5 >= 0) {
            return i5;
        }
        return -1;
    }

    private void n() {
        if (com.censivn.C3DEngine.a.e.l()) {
            this.u = x.b(b.d.scrollcontainer_arrow);
            this.s = new k(com.censivn.C3DEngine.b.b.a.c * 24.0f, 45.0f * com.censivn.C3DEngine.b.b.a.c, false);
            this.s.rotation().z = 180.0f;
            this.s.textures().addElement(this.u);
            com.tsf.shell.manager.o.c.a(this.s, com.tsf.shell.manager.o.c.h);
            this.t = new k(com.censivn.C3DEngine.b.b.a.c * 24.0f, 45.0f * com.censivn.C3DEngine.b.b.a.c, false);
            this.t.textures().addElement(this.u);
            com.tsf.shell.manager.o.c.a(this.t, com.tsf.shell.manager.o.c.h);
            this.s.calAABB(3.0f, 3.0f, 1.0f);
            this.t.calAABB(3.0f, 3.0f, 1.0f);
        } else {
            this.s = new k(0.0f, 0.0f, false);
            this.s.rotation().z = 180.0f;
            com.tsf.shell.manager.o.c.a(this.s, com.tsf.shell.manager.o.c.h);
            this.t = new k(0.0f, 0.0f, false);
            com.tsf.shell.manager.o.c.a(this.t, com.tsf.shell.manager.o.c.h);
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.h.b.h.4
                @Override // java.lang.Runnable
                public void run() {
                    h.this.u = x.b(b.d.scrollcontainer_arrow);
                    h.this.s.a(com.censivn.C3DEngine.b.b.a.c * 24.0f);
                    h.this.t.a(com.censivn.C3DEngine.b.b.a.c * 24.0f);
                    h.this.s.b(com.censivn.C3DEngine.b.b.a.c * 45.0f);
                    h.this.t.b(com.censivn.C3DEngine.b.b.a.c * 45.0f);
                    h.this.s.textures().addElement(h.this.u);
                    h.this.t.textures().addElement(h.this.u);
                    h.this.s.calAABB(3.0f, 3.0f, 1.0f);
                    h.this.t.calAABB(3.0f, 3.0f, 1.0f);
                }
            });
        }
        this.s.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.s) { // from class: com.censivn.C3DEngine.b.h.b.h.5
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                h.a = 0.1f;
                h.this.m();
            }
        });
        this.t.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.t) { // from class: com.censivn.C3DEngine.b.h.b.h.6
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                h.a = 0.1f;
                h.this.l();
            }
        });
    }

    private void o() {
        if (this.D != null) {
            Iterator<i> it = this.K.iterator();
            while (it.hasNext()) {
                i next = it.next();
                next.setDisplayTag(-1);
                this.D.a(next);
            }
        }
        this.K.clear();
    }

    public void f() {
        i iVar;
        i();
        if (this.c.getAnimationObjectState()) {
            this.K.clear();
            this.c.position().x += (this.x - this.c.position().x) * a;
            if (!this.A && Math.abs(this.c.position().x - this.x) < 0.1f) {
                this.c.position().x = this.x;
                this.c.setAnimationObjectState(false);
            }
            c();
            if (this.D == null || this.e <= 0) {
                o();
                return;
            }
            float f = this.c.position().x;
            int i = this.e - 1;
            int i2 = (int) ((-f) / this.f);
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = (int) ((((-f) % this.f) - this.j) / (this.l + this.n));
            if ((this.r * i2) + i3 <= i) {
                if (i3 < 0) {
                    i3 = 0;
                } else if (i3 > this.p - 1) {
                    i3 = this.p - 1;
                }
                int i4 = i2 * this.r;
                if (!a(i3, this.p, i4, i)) {
                    a(0, (this.p - (this.p - i3)) + 1, i4 + this.r, i);
                }
                Iterator<Integer> it = this.J.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    Iterator<i> it2 = this.H.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            iVar = null;
                            break;
                        }
                        iVar = it2.next();
                        if (iVar.getDisplayTag() == intValue) {
                            break;
                        }
                    }
                    if (iVar != null) {
                        b(intValue, iVar);
                        this.K.remove(iVar);
                        this.H.remove(iVar);
                    } else {
                        this.I.add(Integer.valueOf(intValue));
                    }
                }
                o();
                Iterator<Integer> it3 = this.I.iterator();
                while (it3.hasNext()) {
                    int intValue2 = it3.next().intValue();
                    if (!this.H.isEmpty()) {
                        b(intValue2, this.D.a(intValue2, this.H.remove(0)));
                    } else {
                        b(intValue2, this.D.a(intValue2, null));
                    }
                }
                this.I.clear();
                this.J.clear();
            }
        }
    }

    private boolean a(int i, int i2, int i3, int i4) {
        while (i < i2) {
            for (int i5 = 0; i5 < this.q; i5++) {
                int i6 = (this.p * i5) + i3 + i;
                if (i6 > i4) {
                    if (i5 == 0) {
                        return true;
                    }
                } else {
                    float f = this.B.get(i6).a + this.c.position().x;
                    if (f - (this.l / 2.0f) < this.f / 2.0f && f + (this.l / 2.0f) > (-this.f) / 2.0f) {
                        this.J.add(Integer.valueOf(i6));
                    }
                }
            }
            i++;
        }
        return false;
    }

    private void p() {
        if (this.z > 1) {
            if (this.y > 0) {
                a(this.s);
            } else {
                b(this.s);
            }
            if (this.y < this.z - 1) {
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
            this.d.addChild(kVar);
        }
        if (kVar.alpha() != 255.0f) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(kVar);
            com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
        }
        kVar.mouseEnabled(true);
    }

    private void b(final k kVar) {
        if (kVar.parent() != null) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.h.b.h.7
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    h.this.d.removeChild(kVar);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(kVar);
            com.censivn.C3DEngine.b.g.c.a(kVar, 250, dVar);
        }
        kVar.mouseEnabled(false);
    }

    /* loaded from: classes.dex */
    public class a {
        public float a;
        public float b;
        public float c;
        public float d;

        public a() {
        }

        public void a(float f, float f2) {
            this.c = f;
            this.a = f;
            this.d = f2;
            this.b = f2;
        }
    }
}
