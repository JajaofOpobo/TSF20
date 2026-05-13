package com.tsf.shell.f.c.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.f.i.a;
import com.tsf.shell.g;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b extends c implements a.InterfaceC0113a {
    private float A;
    private Runnable B;
    private com.tsf.shell.f.i.b.d.b H;
    private Runnable J;
    float c;
    float d;
    float e;
    private ArrayList<d> l;
    private ArrayList<d> m;
    private f r;
    private k s;
    private com.tsf.shell.f.i.b u;
    private com.tsf.shell.f.i.b v;
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
    private com.tsf.shell.f.i.a p = new com.tsf.shell.f.i.a(this, this) { // from class: com.tsf.shell.f.c.a.b.1
        @Override // com.tsf.shell.f.i.a
        public void a(com.tsf.shell.f.i.b bVar) {
            bVar.f(b.this.h);
        }
    };
    private float q = 12.0f * com.censivn.C3DEngine.b.b.a.b;
    private i o = new k(128.0f, 128.0f);

    public b(f fVar) {
        this.r = fVar;
        this.o.visible(false);
        this.l = new ArrayList<>();
        this.m = new ArrayList<>();
        if (!fVar.a()) {
            com.tsf.shell.manager.a.k.b(this);
        }
        A();
    }

    @Override // com.tsf.shell.f.c.a.c, com.tsf.shell.f.e.f
    public boolean a() {
        return this.r.e() && this.r.r();
    }

    @Override // com.tsf.shell.f.i.a.InterfaceC0113a
    public ArrayList<i> b() {
        return children();
    }

    public boolean a(float f, float f2) {
        if (i() < 1.0f || this.r.s()) {
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
        return false;
    }

    public void b(float f, float f2) {
        if (this.y) {
            com.tsf.shell.manager.a.h.a(f, f2, this.z, this.A);
        } else if (this.x) {
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
            }
        } else if (this.b) {
            x.a(f, f2, this.E);
            this.D.setAll(this.E[0], this.E[1], 0.0f);
            globalToLocal(this.D);
            if (this.B == null) {
                this.B = new Runnable() { // from class: com.tsf.shell.f.c.a.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        int a = b.this.r.n.a(b.this.l, b.this.children(), b.this.children().size(), b.this.c, b.this.e, b.this.d, b.this.q, b.this.D.x, b.this.D.y);
                        if (a == -3 || a == -4) {
                            b.this.a((com.tsf.shell.f.i.b) null);
                            b.this.c();
                            b.this.x = true;
                        } else if (a == -1 || a == -2) {
                            b.this.r.n();
                            b.this.a((com.tsf.shell.f.i.b) null);
                        } else {
                            if (!b.this.r.r()) {
                                b.this.r.m();
                            }
                            b.this.a((com.tsf.shell.f.i.b) b.this.children().get(a));
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
    public void a(com.tsf.shell.f.i.b bVar) {
        if (bVar != null) {
            this.u = bVar;
            if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
            }
        } else {
            this.u = null;
        }
        this.v = null;
        this.w = null;
    }

    private void b(final com.tsf.shell.f.i.b bVar) {
        if (bVar != null) {
            if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.c.a.b.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.tsf.shell.f.i.b.e.b) bVar).l();
                    }
                }, 200L);
            } else if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.c.a.b.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.tsf.shell.f.i.b.d.b) bVar).aR();
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
        } else if (!this.x && this.b) {
            this.b = false;
            if (this.p.e()) {
                if (this.u instanceof com.tsf.shell.f.i.c) {
                    ((com.tsf.shell.f.i.c) this.u).ap();
                }
            } else {
                b(this.u);
            }
            this.u = null;
            a((com.tsf.shell.f.i.b) null);
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

    @Override // com.tsf.shell.f.c.a.c, com.tsf.shell.f.e.f.b
    public void a(final com.tsf.shell.f.i.c cVar) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.c.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.removeChild(cVar);
            }
        };
        if (cVar instanceof com.tsf.shell.f.i.b.d.b) {
            com.tsf.shell.manager.r.c.g.a(cVar, null, runnable);
        } else {
            com.tsf.shell.manager.r.c.g.a(cVar, runnable);
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
            final i iVar = children().get(i);
            float f = (i * 20) + 10;
            if (f > 150.0f) {
                f = 150.0f;
            }
            iVar.mouseEnabled(false);
            com.censivn.C3DEngine.b.g.c.a.a aVar = new com.censivn.C3DEngine.b.g.c.a.a(iVar, (i / 3) + 1, f) { // from class: com.tsf.shell.f.c.a.b.6
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    iVar.visible(false);
                    iVar.mouseEnabled(true);
                }
            };
            aVar.l(0.0f);
            aVar.m(0.0f);
            aVar.f(0.0f);
            aVar.h(0.0f);
            aVar.b(i % 2 == 0);
            com.censivn.C3DEngine.b.g.c.a(iVar);
            com.censivn.C3DEngine.b.g.c.a(iVar, (size * i) + 250, aVar);
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
                    d dVar = this.l.get(i2);
                    final i iVar = children().get(i2);
                    if (!iVar.visible()) {
                        iVar.rotation().z = dVar.c;
                        iVar.position().x = 0.0f;
                        iVar.position().y = 0.0f;
                        iVar.scale().setAll(0.0f, 0.0f, 1.0f);
                    }
                    iVar.visible(true);
                    iVar.mouseEnabled(false);
                    com.censivn.C3DEngine.b.g.c.a.a aVar = new com.censivn.C3DEngine.b.g.c.a.a(iVar, (i2 / 3) + 1, (float) (20.0d + (Math.random() * 120.0d))) { // from class: com.tsf.shell.f.c.a.b.7
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            iVar.mouseEnabled(true);
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
                    com.censivn.C3DEngine.b.g.c.a(iVar);
                    com.censivn.C3DEngine.b.g.c.a(iVar, (size * i2) + 250, aVar);
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
                    d dVar2 = this.l.get(i4);
                    i iVar2 = children().get(i4);
                    iVar2.rotation().z = dVar2.c;
                    iVar2.position().x = dVar2.a;
                    iVar2.position().y = dVar2.b;
                    iVar2.scale().setAll(dVar2.d, dVar2.d, 1.0f);
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
        d remove = this.m.remove(0);
        remove.a();
        return remove;
    }

    private void a(d dVar) {
        this.m.add(dVar);
    }

    private void x() {
        Iterator<d> it = this.l.iterator();
        while (it.hasNext()) {
            d next = it.next();
            next.i = 0.0f;
            next.d = 0.0f;
            next.h = false;
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
        Iterator<d> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().h = true;
        }
        Iterator<i> it2 = children().iterator();
        while (it2.hasNext()) {
            i next = it2.next();
            next.position().x = 0.0f;
            next.position().y = 0.0f;
            next.rotation().z = 0.0f;
            next.scale().setAll(0.0f, 0.0f, 1.0f);
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
            this.l.get(i).h = true;
        }
        this.n = true;
        mouseEnabled(true);
        setAnimationObjectState(false);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.v != null) {
            this.r.n.a(this.s, this.v);
            this.t.id = this.w.id;
            this.s.dispatchDraw();
        }
        if (!this.n) {
            this.n = true;
            for (int i = 0; i < children().size(); i++) {
                i iVar = children().get(i);
                d dVar = this.l.get(i);
                if (!dVar.h) {
                    float f = dVar.a;
                    float f2 = dVar.b;
                    iVar.position().x += (f - iVar.position().x) * this.a;
                    iVar.position().y += (f2 - iVar.position().y) * this.a;
                    iVar.rotation().z += (dVar.c - iVar.rotation().z) * this.a;
                    Number3d scale = iVar.scale();
                    Number3d scale2 = iVar.scale();
                    float f3 = scale2.y + ((dVar.d - iVar.scale().x) * this.a);
                    scale2.y = f3;
                    scale.x = f3;
                    float alpha = iVar.alpha();
                    iVar.alpha(alpha + ((dVar.i - alpha) * this.a));
                    if (Math.abs(iVar.alpha() - dVar.i) < 0.2f && Math.abs(iVar.position().x - f) < 0.2f && Math.abs(iVar.position().y - f2) < 0.2f && Math.abs(iVar.scale().x - dVar.d) < 0.01f && Math.abs(iVar.rotation().z - dVar.c) < 0.2f) {
                        iVar.position().x = f;
                        iVar.position().y = f2;
                        iVar.rotation().z = dVar.c;
                        Number3d scale3 = iVar.scale();
                        Number3d scale4 = iVar.scale();
                        float f4 = dVar.d;
                        scale4.y = f4;
                        scale3.x = f4;
                        dVar.h = true;
                        iVar.alpha(dVar.i);
                    }
                    if (iVar.alpha() == 0.0f) {
                        iVar.visible(false);
                    } else {
                        iVar.visible(true);
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

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        this.l.add(w());
        super.addChild(iVar);
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void addChildAt(i iVar, int i) {
        this.l.add(w());
        super.addChildAt(iVar, i);
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        boolean removeChild = super.removeChild(iVar);
        if (removeChild) {
            a(this.l.remove(0));
            g();
            l();
            if (iVar instanceof com.tsf.shell.f.i.b) {
                ((com.tsf.shell.f.i.b) iVar).c = false;
                ((com.tsf.shell.f.i.b) iVar).B();
            }
            if (iVar instanceof com.tsf.shell.f.i.b.e.b) {
                ((com.tsf.shell.f.i.b.e.b) iVar).aM();
            } else if (iVar instanceof com.tsf.shell.f.i.b.d.b) {
                ((com.tsf.shell.f.i.b.d.b) iVar).aM();
                com.tsf.shell.manager.a.k.c((com.tsf.shell.f.i.b.d.b) iVar);
            }
        }
        return removeChild;
    }

    public void c(float f, float f2) {
        this.i = f;
        this.j = f2;
        g();
    }

    private int a(i iVar, Number3d number3d) {
        Number3d.TEMPNUMBER3D.reset();
        iVar.localToGlobal(Number3d.TEMPNUMBER3D);
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

    private void c(com.tsf.shell.f.i.b bVar) {
    }

    private void d(com.tsf.shell.f.i.b bVar) {
    }

    @Override // com.tsf.shell.f.c.a.c, com.tsf.shell.f.e.f
    public boolean a(com.tsf.shell.f.e.f fVar, float f, float f2) {
        int a;
        if ((fVar instanceof com.tsf.shell.f.i.b.e.b) || (fVar instanceof com.tsf.shell.f.i.b.d.b)) {
            if (!this.G && children().size() != 0 && (a = a(f, f2, this.C)) != -1 && a != -2 && (getChildAt(a) instanceof com.tsf.shell.f.i.b.d.b)) {
            }
            return false;
        }
        return true;
    }

    private void i(com.tsf.shell.f.e.f fVar) {
        this.H.d(fVar);
        this.H = null;
        c((com.tsf.shell.f.i.b) fVar);
    }

    private boolean a(int i, Number3d number3d) {
        if (i < 0) {
            return false;
        }
        i childAt = getChildAt(i);
        if (childAt instanceof com.tsf.shell.f.i.b.d.b) {
            return this.r.n.a(number3d, childAt, this.F < i);
        }
        return false;
    }

    @Override // com.tsf.shell.f.c.a.c, com.tsf.shell.f.e.f
    public void a(com.tsf.shell.f.e.f fVar) {
        this.G = true;
        com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) fVar;
        c(bVar);
        this.o.setAABBPX(bVar.minX(), bVar.minY(), bVar.minZ(), bVar.maxX(), bVar.maxY(), bVar.maxZ());
        this.F = a((i) fVar, this.C);
        if (this.F == -1) {
            this.F = 0;
        } else if (this.F == -2) {
            this.F = children().size() - 1;
        }
        addChildAt(this.o, this.F);
    }

    @Override // com.tsf.shell.f.c.a.c, com.tsf.shell.f.e.f
    public void c(com.tsf.shell.f.e.f fVar) {
        int i;
        int a = a((i) fVar, this.C);
        if (a == -1) {
            i = 0;
        } else {
            i = a == -2 ? children().size() - 1 : a;
        }
        if (a(a, this.C)) {
            com.tsf.shell.f.i.b.d.b bVar = (com.tsf.shell.f.i.b.d.b) getChildAt(i);
            if (this.H == null) {
                this.H = bVar;
                d((com.tsf.shell.f.i.b) fVar);
                this.H.a(fVar);
            }
            this.H.f(fVar);
            return;
        }
        if (this.H != null) {
            i(fVar);
        }
        if (this.F != i) {
            this.F = i;
            super.removeChild(this.o);
            super.addChildAt(this.o, i);
            g();
        }
    }

    @Override // com.tsf.shell.f.c.a.c, com.tsf.shell.f.e.f
    public void d(com.tsf.shell.f.e.f fVar) {
        this.G = false;
        if (this.H != null) {
            i(fVar);
        }
        d((com.tsf.shell.f.i.b) fVar);
        removeChild(this.o);
    }

    @Override // com.tsf.shell.f.c.a.c, com.tsf.shell.f.e.f
    public boolean b(com.tsf.shell.f.e.f fVar) {
        return fVar instanceof com.tsf.shell.f.i.c;
    }

    @Override // com.tsf.shell.f.c.a.c, com.tsf.shell.f.e.f
    public void e(com.tsf.shell.f.e.f fVar) {
        boolean z;
        this.G = false;
        com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) fVar;
        if (this.H != null) {
            z = this.H.b(fVar);
            if (z) {
                this.H.e(fVar);
            }
            this.H = null;
            if (z) {
                removeChild(this.o);
            }
        } else {
            z = false;
        }
        if (!z) {
            com.censivn.C3DEngine.b.g.c.a(bVar);
            globalToLocal(bVar.position());
            bVar.removeFromParent();
            bVar.clearDefaultColor();
            super.removeChild(this.o);
            if (this.F < 0) {
                this.F = 0;
            } else if (this.F > children().size()) {
                this.F = children().size();
                if (this.F < 0) {
                    this.F = 0;
                }
            }
            super.addChildAt(bVar, this.F);
            a(bVar, true);
            if (bVar instanceof com.tsf.shell.f.i.c) {
                com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) bVar;
                if (cVar.as()) {
                    Iterator<com.tsf.shell.f.i.c> it = cVar.av().iterator();
                    while (it.hasNext()) {
                        a(it.next(), true);
                    }
                    cVar.ay();
                }
            }
            l();
            g();
        }
    }

    public void a(com.tsf.shell.f.i.b bVar, boolean z) {
        bVar.a(this.p);
        bVar.c = true;
        if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
            com.censivn.C3DEngine.b.g.c.a(((com.tsf.shell.f.i.b.e.b) bVar).k);
            ((com.tsf.shell.f.i.b.e.b) bVar).aL();
        } else if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
            ((com.tsf.shell.f.i.b.d.b) bVar).aL();
        }
        if (z) {
            bVar.K().onUpdateContainer(-4);
        }
    }

    private void A() {
        this.J = new Runnable() { // from class: com.tsf.shell.f.c.a.b.8
            @Override // java.lang.Runnable
            public void run() {
                i next;
                String str;
                b.this.I = false;
                final String str2 = "";
                Iterator<i> it = b.this.children().iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof com.tsf.shell.f.i.b) {
                        str = str2 + ((com.tsf.shell.f.i.b) next).K().id + ",";
                    } else {
                        str = str2;
                    }
                    str2 = str;
                }
                com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.f.c.a.b.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str2);
                        contentResolver.update(ContentUris.withAppendedId(g.h.a, 1L), contentValues, null, null);
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
