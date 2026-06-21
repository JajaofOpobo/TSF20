package com.tsf.shell.e.c.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends c implements com.tsf.shell.e.i.b {
    private float A;
    private Runnable B;
    private com.tsf.shell.e.i.b.d.b H;
    private Runnable J;
    float c;
    float d;
    float e;
    private ArrayList l;
    private ArrayList m;
    private f r;
    private m s;
    private com.tsf.shell.e.i.c u;
    private com.tsf.shell.e.i.c v;
    private TextureElement w;
    private float z;
    public float a = 0.15f;
    private float i = 0.0f;
    private float j = 0.0f;
    private float k = 0.0f;
    private boolean n = true;
    boolean b = false;
    private boolean x = false;
    private boolean y = false;
    boolean f = false;
    boolean g = false;
    private Number3d C = new Number3d();
    private Number3d D = new Number3d();
    private float[] E = new float[2];
    private int F = 0;
    private boolean G = false;
    private boolean I = false;
    private TextureElement t = new TextureElement(0, false);
    private b h = this;
    private com.tsf.shell.e.i.a p = new com.tsf.shell.e.i.a(this, this) { // from class: com.tsf.shell.e.c.a.b.1
        @Override // com.tsf.shell.e.i.a
        public void a(com.tsf.shell.e.i.c cVar) {
            cVar.f(b.this.h);
        }
    };
    private float q = 12.0f * com.censivn.C3DEngine.b.b.a.b;
    private j o = new m(128.0f, 128.0f);

    public b(f fVar) {
        this.r = fVar;
        this.o.visible(false);
        this.l = new ArrayList();
        this.m = new ArrayList();
        if (!fVar.a()) {
            com.tsf.shell.manager.a.k.b(this);
        }
        A();
    }

    @Override // com.tsf.shell.e.c.a.c, com.tsf.shell.e.e.g
    public boolean a() {
        return this.r.e() && this.r.r();
    }

    @Override // com.tsf.shell.e.i.b
    public ArrayList b() {
        return children();
    }

    public boolean a(float f, float f2) {
        if (i() >= 1.0f && !this.r.s()) {
            return false;
        }
        if (!this.b) {
            this.z = f;
            this.A = f2;
            this.x = false;
            this.y = false;
            this.b = true;
            if (this.r.r()) {
                this.c = this.k;
                this.d = this.j;
                this.e = this.i;
            } else {
                this.c = this.k;
                this.d = this.j;
                this.e = this.i;
            }
            this.r.n.a(i());
        }
        return true;
    }

    public void b(float f, float f2) {
        if (this.y) {
            com.tsf.shell.manager.a.h.a(f, f2, this.z, this.A);
            return;
        }
        if (this.x) {
            x.a(f, f2, this.E);
            this.D.setAll(this.E[0], this.E[1], 0.0f);
            globalToLocal(this.D);
            if (this.r.a()) {
                this.D.y = 0.0f;
            }
            if (this.r.n.b(this.D.x, this.D.y) == -4) {
                this.x = false;
                com.tsf.shell.manager.a.h.w();
                this.y = true;
                return;
            }
            return;
        }
        if (this.b) {
            x.a(f, f2, this.E);
            this.D.setAll(this.E[0], this.E[1], 0.0f);
            globalToLocal(this.D);
            if (this.B == null) {
                this.B = new Runnable() { // from class: com.tsf.shell.e.c.a.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        int a = b.this.r.n.a(b.this.l, b.this.children(), b.this.children().size(), b.this.c, b.this.e, b.this.d, b.this.q, b.this.D.x, b.this.D.y);
                        if (a != -3 && a != -4) {
                            if (a == -1 || a == -2) {
                                b.this.r.n();
                                b.this.a((com.tsf.shell.e.i.c) null);
                            } else {
                                if (!b.this.r.r()) {
                                    b.this.r.m();
                                }
                                b.this.a((com.tsf.shell.e.i.c) b.this.children().get(a));
                            }
                        } else {
                            b.this.a((com.tsf.shell.e.i.c) null);
                            b.this.c();
                            b.this.x = true;
                        }
                        b.this.n = false;
                        b.this.setAnimationObjectState(true);
                        b.this.invalidate();
                    }
                };
            }
            com.censivn.C3DEngine.a.a().c(this.B);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.e.i.c cVar) {
        if (cVar != null) {
            this.u = cVar;
            boolean z = cVar instanceof com.tsf.shell.e.i.b.e.b;
        } else {
            this.u = null;
        }
        this.v = null;
        this.w = null;
    }

    private void b(final com.tsf.shell.e.i.c cVar) {
        if (cVar != null) {
            if (cVar instanceof com.tsf.shell.e.i.b.e.b) {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.c.a.b.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.tsf.shell.e.i.b.e.b) cVar).l();
                    }
                }, 200L);
            } else if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.c.a.b.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.tsf.shell.e.i.b.d.b) cVar).aR();
                    }
                });
            }
        }
        this.v = null;
        this.w = null;
    }

    public void c() {
        if (this.y) {
            com.tsf.shell.manager.a.h.x();
            return;
        }
        if (!this.x && this.b) {
            this.b = false;
            if (this.p.e()) {
                if (this.u instanceof com.tsf.shell.e.i.e) {
                    ((com.tsf.shell.e.i.e) this.u).ap();
                }
            } else {
                b(this.u);
            }
            this.u = null;
            a((com.tsf.shell.e.i.c) null);
            if (this.r.r()) {
                g();
            } else {
                x();
            }
            this.r.n();
        }
    }

    public void e() {
        y();
        h();
    }

    @Override // com.tsf.shell.e.c.a.c, com.tsf.shell.e.e.f.e
    public void a(final com.tsf.shell.e.i.e eVar) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.c.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.removeChild(eVar);
            }
        };
        if (eVar instanceof com.tsf.shell.e.i.b.d.b) {
            com.tsf.shell.manager.r.c.i.a(eVar, null, runnable);
        } else {
            com.tsf.shell.manager.r.c.i.a(eVar, runnable);
        }
    }

    public void f() {
        int size;
        z();
        if (children().size() < 6) {
            size = 150;
        } else {
            size = 1000 / children().size();
        }
        for (int i = 0; i < children().size(); i++) {
            final j jVar = (j) children().get(i);
            float f = (i * 20) + 10;
            if (f > 150.0f) {
                f = 150.0f;
            }
            jVar.mouseEnabled(false);
            com.censivn.C3DEngine.b.g.c.a.a aVar = new com.censivn.C3DEngine.b.g.c.a.a(jVar, (i / 3) + 1, f) { // from class: com.tsf.shell.e.c.a.b.6
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    jVar.visible(false);
                    jVar.mouseEnabled(true);
                }
            };
            aVar.l(0.0f);
            aVar.m(0.0f);
            aVar.f(0.0f);
            aVar.h(0.0f);
            aVar.b(i % 2 == 0);
            w.a(jVar);
            w.a(jVar, (size * i) + 250, aVar);
        }
    }

    public void a(boolean z) {
        int size;
        z();
        h();
        if (children().size() < 6) {
            size = 150;
        } else {
            size = 1000 / children().size();
        }
        if (z) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < children().size()) {
                    d dVar = (d) this.l.get(i2);
                    final j jVar = (j) children().get(i2);
                    if (!jVar.visible()) {
                        jVar.rotation().z = dVar.c;
                        jVar.position().x = 0.0f;
                        jVar.position().y = 0.0f;
                        jVar.scale().setAll(0.0f, 0.0f, 1.0f);
                    }
                    jVar.visible(true);
                    jVar.mouseEnabled(false);
                    com.censivn.C3DEngine.b.g.c.a.a aVar = new com.censivn.C3DEngine.b.g.c.a.a(jVar, (i2 / 3) + 1, (float) (20.0d + (Math.random() * 120.0d))) { // from class: com.tsf.shell.e.c.a.b.7
                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a() {
                            jVar.mouseEnabled(true);
                        }
                    };
                    aVar.l(dVar.d);
                    aVar.m(dVar.d);
                    aVar.f(dVar.a);
                    aVar.h(dVar.b);
                    aVar.e(dVar.c);
                    aVar.a(255);
                    aVar.b(i2 % 2 == 0);
                    aVar.a(false);
                    w.a(jVar);
                    w.a(jVar, (size * i2) + 250, aVar);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        } else {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < children().size()) {
                    d dVar2 = (d) this.l.get(i4);
                    j jVar2 = (j) children().get(i4);
                    jVar2.rotation().z = dVar2.c;
                    jVar2.position().x = dVar2.a;
                    jVar2.position().y = dVar2.b;
                    jVar2.scale().setAll(dVar2.d, dVar2.d, 1.0f);
                    i3 = i4 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private d w() {
        if (this.m.isEmpty()) {
            return new d();
        }
        d dVar = (d) this.m.remove(0);
        dVar.a();
        return dVar;
    }

    private void a(d dVar) {
        this.m.add(dVar);
    }

    private void x() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.i = 0.0f;
            dVar.d = 0.0f;
            dVar.h = false;
        }
        this.n = false;
        setAnimationObjectState(true);
        mouseEnabled(false);
        invalidate();
    }

    public void g() {
        h();
        this.n = false;
        setAnimationObjectState(true);
        mouseEnabled(false);
        invalidate();
    }

    public void h() {
        this.r.n.a(this.l, children(), children().size(), this.k, this.i, this.j, this.q);
    }

    public float a(float f) {
        return this.r.n.a(children(), children().size(), f, this.i, this.j, this.q);
    }

    public float i() {
        return this.r.n.a(children(), children().size(), this.k, this.i, this.j, this.q);
    }

    public void b(float f) {
        e(f);
    }

    public void j() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((d) it.next()).h = true;
        }
        Iterator it2 = children().iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            jVar.position().x = 0.0f;
            jVar.position().y = 0.0f;
            jVar.rotation().z = 0.0f;
            jVar.scale().setAll(0.0f, 0.0f, 1.0f);
        }
        this.n = true;
        setAnimationObjectState(false);
    }

    public void c(float f) {
        if (this.k != f) {
            this.k = f;
            y();
            g();
        }
    }

    public void d(float f) {
        this.k = f;
        y();
        g();
    }

    public void e(float f) {
        if (this.k != f) {
            this.k = f;
            y();
            h();
        }
    }

    public float k() {
        return this.k;
    }

    private void y() {
        this.r.n.a(this, this.i, this.j, this.k);
    }

    private void z() {
        for (int i = 0; i < children().size(); i++) {
            ((d) this.l.get(i)).h = true;
        }
        this.n = true;
        mouseEnabled(true);
        setAnimationObjectState(false);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.v != null) {
            this.r.n.a(this.s, this.v);
            this.t.id = this.w.id;
            this.s.dispatchDraw();
        }
        if (!this.n) {
            this.n = true;
            for (int i = 0; i < children().size(); i++) {
                j jVar = (j) children().get(i);
                d dVar = (d) this.l.get(i);
                if (!dVar.h) {
                    float f = dVar.a;
                    float f2 = dVar.b;
                    jVar.position().x += (f - jVar.position().x) * this.a;
                    jVar.position().y += (f2 - jVar.position().y) * this.a;
                    jVar.rotation().z += (dVar.c - jVar.rotation().z) * this.a;
                    Number3d scale = jVar.scale();
                    Number3d scale2 = jVar.scale();
                    float f3 = scale2.y + ((dVar.d - jVar.scale().x) * this.a);
                    scale2.y = f3;
                    scale.x = f3;
                    float alpha = jVar.alpha();
                    jVar.alpha(alpha + ((dVar.i - alpha) * this.a));
                    if (Math.abs(jVar.alpha() - dVar.i) < 0.2f && Math.abs(jVar.position().x - f) < 0.2f && Math.abs(jVar.position().y - f2) < 0.2f && Math.abs(jVar.scale().x - dVar.d) < 0.01f && Math.abs(jVar.rotation().z - dVar.c) < 0.2f) {
                        jVar.position().x = f;
                        jVar.position().y = f2;
                        jVar.rotation().z = dVar.c;
                        Number3d scale3 = jVar.scale();
                        Number3d scale4 = jVar.scale();
                        float f4 = dVar.d;
                        scale4.y = f4;
                        scale3.x = f4;
                        dVar.h = true;
                        jVar.alpha(dVar.i);
                    }
                    if (jVar.alpha() == 0.0f) {
                        jVar.visible(false);
                    } else {
                        jVar.visible(true);
                    }
                }
                this.n = dVar.h && this.n;
            }
            if (this.n) {
                mouseEnabled(true);
                setAnimationObjectState(false);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public void addChild(j jVar) {
        this.l.add(w());
        super.addChild(jVar);
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void addChildAt(j jVar, int i) {
        this.l.add(w());
        super.addChildAt(jVar, i);
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public boolean removeChild(j jVar) {
        boolean removeChild = super.removeChild(jVar);
        if (removeChild) {
            a((d) this.l.remove(0));
            g();
            l();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                ((com.tsf.shell.e.i.c) jVar).c = false;
                ((com.tsf.shell.e.i.c) jVar).B();
            }
            if (jVar instanceof com.tsf.shell.e.i.b.e.b) {
                ((com.tsf.shell.e.i.b.e.b) jVar).aM();
            } else if (jVar instanceof com.tsf.shell.e.i.b.d.b) {
                ((com.tsf.shell.e.i.b.d.b) jVar).aM();
                com.tsf.shell.manager.a.k.c((com.tsf.shell.e.i.b.d.b) jVar);
            }
        }
        return removeChild;
    }

    public void c(float f, float f2) {
        this.i = f;
        this.j = f2;
        g();
    }

    private int a(j jVar, Number3d number3d) {
        Number3d.TEMPNUMBER3D.reset();
        jVar.localToGlobal(Number3d.TEMPNUMBER3D);
        return a(Number3d.TEMPNUMBER3D.x, Number3d.TEMPNUMBER3D.y, number3d);
    }

    private int a(float f, float f2, Number3d number3d) {
        number3d.setAll(f, f2, 0.0f);
        globalToLocal(number3d);
        if (children().size() == 0) {
            return 0;
        }
        int a = this.r.n.a(number3d, this.l, children().size());
        if (a >= children().size()) {
            return children().size() - 1;
        }
        return a;
    }

    private void c(com.tsf.shell.e.i.c cVar) {
    }

    private void d(com.tsf.shell.e.i.c cVar) {
    }

    @Override // com.tsf.shell.e.c.a.c, com.tsf.shell.e.e.g
    public boolean a(com.tsf.shell.e.e.g gVar, float f, float f2) {
        int a;
        if ((gVar instanceof com.tsf.shell.e.i.b.e.b) || (gVar instanceof com.tsf.shell.e.i.b.d.b)) {
            if (!this.G && children().size() != 0 && (a = a(f, f2, this.C)) != -1 && a != -2 && (getChildAt(a) instanceof com.tsf.shell.e.i.b.d.b)) {
            }
            return false;
        }
        return true;
    }

    private void i(com.tsf.shell.e.e.g gVar) {
        this.H.d(gVar);
        this.H = null;
        c((com.tsf.shell.e.i.c) gVar);
    }

    private boolean a(int i, Number3d number3d) {
        if (i < 0) {
            return false;
        }
        j childAt = getChildAt(i);
        if (childAt instanceof com.tsf.shell.e.i.b.d.b) {
            return this.r.n.a(number3d, childAt, this.F < i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.e.c.a.c, com.tsf.shell.e.e.g
    public void a(com.tsf.shell.e.e.g gVar) {
        this.G = true;
        com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) gVar;
        c(cVar);
        this.o.setAABBPX(cVar.minX(), cVar.minY(), cVar.minZ(), cVar.maxX(), cVar.maxY(), cVar.maxZ());
        this.F = a((j) gVar, this.C);
        if (this.F == -1) {
            this.F = 0;
        } else if (this.F == -2) {
            this.F = children().size() - 1;
        }
        addChildAt(this.o, this.F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.e.c.a.c, com.tsf.shell.e.e.g
    public void c(com.tsf.shell.e.e.g gVar) {
        int size;
        int a = a((j) gVar, this.C);
        if (a == -1) {
            size = 0;
        } else {
            size = a == -2 ? children().size() - 1 : a;
        }
        if (a(a, this.C)) {
            com.tsf.shell.e.i.b.d.b bVar = (com.tsf.shell.e.i.b.d.b) getChildAt(size);
            if (this.H == null) {
                this.H = bVar;
                d((com.tsf.shell.e.i.c) gVar);
                this.H.a(gVar);
            }
            this.H.f(gVar);
            return;
        }
        if (this.H != null) {
            i(gVar);
        }
        if (this.F != size) {
            this.F = size;
            super.removeChild(this.o);
            super.addChildAt(this.o, size);
            g();
        }
    }

    @Override // com.tsf.shell.e.c.a.c, com.tsf.shell.e.e.g
    public void d(com.tsf.shell.e.e.g gVar) {
        this.G = false;
        if (this.H != null) {
            i(gVar);
        }
        d((com.tsf.shell.e.i.c) gVar);
        removeChild(this.o);
    }

    @Override // com.tsf.shell.e.c.a.c, com.tsf.shell.e.e.g
    public boolean b(com.tsf.shell.e.e.g gVar) {
        return gVar instanceof com.tsf.shell.e.i.e;
    }

    @Override // com.tsf.shell.e.c.a.c, com.tsf.shell.e.e.g
    public void e(com.tsf.shell.e.e.g gVar) {
        boolean z;
        this.G = false;
        com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) gVar;
        if (this.H != null) {
            z = this.H.b(gVar);
            if (z) {
                this.H.e(gVar);
            }
            this.H = null;
            if (z) {
                removeChild(this.o);
            }
        } else {
            z = false;
        }
        if (!z) {
            w.a(cVar);
            globalToLocal(cVar.position());
            cVar.removeFromParent();
            cVar.clearDefaultColor();
            super.removeChild(this.o);
            if (this.F < 0) {
                this.F = 0;
            } else if (this.F > children().size()) {
                this.F = children().size();
                if (this.F < 0) {
                    this.F = 0;
                }
            }
            super.addChildAt(cVar, this.F);
            a(cVar, true);
            if (cVar instanceof com.tsf.shell.e.i.e) {
                com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) cVar;
                if (eVar.as()) {
                    Iterator it = eVar.av().iterator();
                    while (it.hasNext()) {
                        a((com.tsf.shell.e.i.c) it.next(), true);
                    }
                    eVar.ay();
                }
            }
            l();
            g();
        }
    }

    public void a(com.tsf.shell.e.i.c cVar, boolean z) {
        cVar.a(this.p);
        cVar.c = true;
        if (cVar instanceof com.tsf.shell.e.i.b.e.b) {
            w.a(((com.tsf.shell.e.i.b.e.b) cVar).k);
            ((com.tsf.shell.e.i.b.e.b) cVar).aL();
        } else if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
            ((com.tsf.shell.e.i.b.d.b) cVar).aL();
        }
        if (z) {
            cVar.K().onUpdateContainer(-4);
        }
    }

    private void A() {
        this.J = new Runnable() { // from class: com.tsf.shell.e.c.a.b.8
            @Override // java.lang.Runnable
            public void run() {
                b.this.I = false;
                Iterator it = b.this.children().iterator();
                final String str = "";
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar instanceof com.tsf.shell.e.i.c) {
                        str = String.valueOf(str) + ((com.tsf.shell.e.i.c) jVar).K().id + ",";
                    }
                }
                com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.e.c.a.b.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str);
                        contentResolver.update(ContentUris.withAppendedId(com.tsf.shell.x.a, 1L), contentValues, null, null);
                        contentValues.clear();
                    }
                });
            }
        };
    }

    public void l() {
        if (!this.I && !this.r.a()) {
            this.I = true;
            com.censivn.C3DEngine.a.a().c(this.J);
        }
    }
}
