package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.f.e.e.c;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends i {
    private b g;
    private com.tsf.shell.f.f.a.c.a h;
    private a i;
    private com.tsf.shell.f.i.b j;
    private com.tsf.shell.f.e.e.a k;
    private com.tsf.shell.f.i.c l;
    private com.tsf.shell.f.i.b m;
    private com.tsf.shell.f.i.b n;
    private boolean o;
    private boolean p;
    private float q;
    private float r;
    private Number3d s;
    private float[] t;
    private com.censivn.C3DEngine.b.d.a u;
    private int v;
    private boolean w;
    private com.censivn.C3DEngine.b.f.j x;
    private boolean y;
    private Number3d z;

    /* loaded from: classes.dex */
    public static class a extends com.censivn.C3DEngine.b.f.j {
        public a() {
            visible(false);
            position().y = -com.censivn.C3DEngine.b.b.a.a(150.0f);
            alpha(0.0f);
        }

        public void f() {
            visible(true);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            dVar.h(0.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, VEasing.Linear.easeNone, dVar);
            a();
        }

        public void g() {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.c.c.a.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.visible(false);
                    a.this.d();
                }
            };
            dVar.a(0);
            dVar.h(-com.censivn.C3DEngine.b.b.a.a(150.0f));
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, 350, dVar);
            c();
        }

        public void a() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public c(final com.tsf.shell.f.f.a.h hVar, com.tsf.shell.f.f.a.f fVar) {
        super(hVar, fVar, b.d.drawer_multiple_choice, x.c(b.i.text_multi_choice));
        this.m = new com.tsf.shell.f.i.b(null);
        this.n = new com.tsf.shell.f.i.b(null);
        this.o = false;
        this.p = false;
        this.s = new Number3d();
        this.t = new float[]{0.0f, 0.0f};
        this.w = false;
        this.y = false;
        this.z = new Number3d();
        this.g = new b(this, fVar, hVar);
        this.h = new com.tsf.shell.f.f.a.c.a(this, fVar, hVar);
        this.k = new com.tsf.shell.f.e.e.a() { // from class: com.tsf.shell.f.f.a.c.c.1
            @Override // com.tsf.shell.f.e.e.a
            public void a(int i, Object obj) {
                hVar.au();
                if (i == 0) {
                    hVar.aG();
                } else {
                    hVar.aF();
                }
                a(800);
            }

            @Override // com.tsf.shell.f.e.e.a
            public float a() {
                return com.censivn.C3DEngine.b.b.a.a(com.tsf.shell.f.f.a.h.F);
            }
        };
        addChild(this.g);
        addChild(this.h);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, i2, i3, i4);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public boolean a(boolean z) {
        return z || this.g.b() > 0;
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a() {
        this.b.f();
        if (this.i != null) {
            this.i.g();
        }
        this.i = null;
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b() {
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b(boolean z) {
        this.b.e();
        if (this.g.b() > 0 || z) {
            a(this.g);
        } else {
            a(this.h);
        }
    }

    private void a(a aVar) {
        if (this.i != null) {
            this.i.g();
        }
        this.i = aVar;
        this.i.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.h.b();
    }

    private void r() {
        this.a.ao().c();
    }

    private void a(com.censivn.C3DEngine.b.f.j jVar, int i) {
        com.tsf.shell.f.f.a.a aVar = (com.tsf.shell.f.f.a.a) jVar;
        int numChildren = aVar.numChildren();
        if (numChildren == 1) {
            aVar.addChild(this.n);
        }
        this.m.removeFromParent();
        if (i != -1) {
            jVar.addChildAt(this.m, i);
        } else {
            jVar.addChild(this.m);
        }
        if (numChildren == 1) {
            this.n.removeFromParent();
        }
        r();
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar, com.tsf.shell.f.i.b bVar, int i, float f, float f2) {
        float b;
        float f3;
        int i2;
        int i3;
        com.tsf.shell.f.i.b.e.g gVar = null;
        if (i > -1 && i < jVar.numChildren()) {
            com.tsf.shell.f.i.b bVar2 = (com.tsf.shell.f.i.b) jVar.getChildAt(i);
            if (bVar2 == this.m) {
                bVar2 = null;
            }
            gVar = bVar2;
        } else if (jVar.getChildIndexOf(this.m) == -1) {
            a(jVar, -1);
        }
        if (gVar != null) {
            gVar.setAnimationObjectState(true);
            this.m.setAnimationObjectState(true);
            int numChildren = jVar.numChildren();
            int childIndexOf = jVar.getChildIndexOf(this.m);
            if (childIndexOf == -1) {
                if (gVar instanceof com.tsf.shell.f.i.b.d.b) {
                    b = 0.0f;
                    f3 = 1.0f;
                } else {
                    a(jVar, i);
                    return;
                }
            } else {
                Number3d number3d = com.tsf.shell.f.f.a.h.E.get(childIndexOf);
                Number3d number3d2 = com.tsf.shell.f.f.a.h.E.get(i);
                float b2 = x.b(number3d.x, number3d.y, number3d2.x, number3d2.y) + (20.0f * com.censivn.C3DEngine.b.b.a.c);
                b = x.b(f, f2, number3d.x, number3d.y);
                f3 = b2;
            }
            if (b > f3 || (bVar instanceof com.tsf.shell.f.i.b.d.b) || ((gVar instanceof com.tsf.shell.f.i.b.e.b) && !com.tsf.shell.f.i.b.e.b.aR() && gVar != this.j)) {
                q();
                r();
                jVar.children().remove(this.m);
                jVar.children().add(i, this.m);
                if (childIndexOf > i) {
                    i2 = childIndexOf;
                    i3 = i;
                } else {
                    i2 = i;
                    i3 = childIndexOf;
                }
                if (i3 > numChildren - 1) {
                    i3 = numChildren - 1;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = i2 > numChildren + (-1) ? numChildren - 1 : i2;
                while (i3 < i4 + 1) {
                    jVar.children().get(i3).setAnimationObjectState(true);
                    i3++;
                }
                gVar = null;
            } else if (((gVar instanceof com.tsf.shell.f.i.b.e.b) || (gVar instanceof com.tsf.shell.f.i.b.d.b)) && this.j != gVar) {
                q();
                if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
                    if (gVar instanceof com.tsf.shell.f.i.b.e.b) {
                        com.tsf.shell.f.i.b.e.g gVar2 = gVar;
                        if (gVar2.aC() && !gVar2.t()) {
                            gVar2.a((com.censivn.C3DEngine.b.f.i) bVar);
                        } else {
                            gVar = null;
                        }
                    } else if (gVar instanceof com.tsf.shell.f.i.b.d.b) {
                        bVar.f(gVar);
                    }
                }
            }
        }
        a(bVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.f.i.b bVar) {
        a(bVar, (com.tsf.shell.f.i.b) null);
    }

    private void a(com.tsf.shell.f.i.b bVar, com.tsf.shell.f.i.b bVar2) {
        if (bVar2 != this.j) {
            if (this.j instanceof com.tsf.shell.f.i.b.e.b) {
                ((com.tsf.shell.f.i.b.e.b) this.j).b((com.censivn.C3DEngine.b.f.i) bVar);
            } else if (this.j instanceof com.tsf.shell.f.i.b.d.b) {
                bVar.p();
            }
            this.j = bVar2;
        }
    }

    public void a(com.censivn.C3DEngine.b.d.a aVar) {
        this.u = aVar;
    }

    public com.tsf.shell.f.i.c c() {
        return this.l;
    }

    public boolean d() {
        return this.o;
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        this.p = false;
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        if (this.u != null) {
            this.u.f(motionEvent);
        }
        this.u = null;
    }

    public void a(com.tsf.shell.f.i.c cVar) {
        ((com.tsf.shell.f.i.a.c) cVar.getMouseEventListener()).a(this.q, this.r);
    }

    public void a(float f, float f2) {
        this.q = this.s.x;
        this.r = this.s.y;
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void c(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        this.w = false;
        this.k.b();
        this.l = cVar;
        this.s.reset();
        cVar.localToGlobal(this.s);
        a(this.s.x, this.s.y);
        this.o = true;
        com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) cVar.parent();
        cVar.position().setAllFrom(this.s);
        if (cVar.parent() instanceof com.tsf.shell.f.f.a.a) {
            this.x = jVar;
            this.v = jVar.getChildIndexOf(cVar);
            jVar.replaceChild(cVar, this.m);
            com.tsf.shell.manager.a.j.a(cVar);
            this.a.c((com.tsf.shell.f.i.b) cVar);
            cVar.setAnimationObjectState(true);
            Number3d.TEMPNUMBER3D.reset();
            Number3d.TEMPNUMBER3D.setAll(1.0f, 1.0f, 1.0f);
            Number3d localScaleToGlobale = cVar.localScaleToGlobale(Number3d.TEMPNUMBER3D);
            cVar.scale().setAll(localScaleToGlobale.x, localScaleToGlobale.y, 1.0f);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(cVar.d);
            dVar.m(cVar.d);
            com.censivn.C3DEngine.b.g.c.a(cVar);
            com.censivn.C3DEngine.b.g.c.a(cVar, 250, dVar);
            if (motionEvent == null) {
                this.t[0] = cVar.position().x;
                this.t[1] = cVar.position().y;
            } else {
                x.a(motionEvent, this.t);
            }
            this.a.a((com.tsf.shell.f.i.b) cVar, true, this.t[0], this.t[1]);
            return;
        }
        this.x = null;
        this.g.b(cVar, motionEvent);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void d(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        ArrayList<com.tsf.shell.f.i.c> arrayList;
        this.k.c();
        if (this.u != null) {
            this.u.d(motionEvent);
            return;
        }
        this.w = this.a.ao().f();
        this.l = null;
        this.o = false;
        com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) this.m.parent();
        boolean z = jVar == null;
        if (cVar.n() != null && cVar.o()) {
            float[] a2 = x.a(motionEvent);
            com.tsf.shell.f.e.f a3 = cVar.a((int) a2[0], (int) a2[1], false);
            if (a3 != null && (a3 instanceof c.b)) {
                if (cVar.h(a3)) {
                    cVar.g(a3);
                }
                z = true;
            } else {
                cVar.p();
            }
        }
        if (z) {
            b(cVar);
        } else {
            if (jVar instanceof com.tsf.shell.f.f.a.a) {
                Number3d.TEMPNUMBER3D.reset();
                Number3d.TEMPNUMBER3D.setAllFrom(cVar.scale());
                jVar.globalScaleToLocal(Number3d.TEMPNUMBER3D);
                cVar.scale().setAllFrom(Number3d.TEMPNUMBER3D);
            }
            if (this.j != null && (cVar instanceof com.tsf.shell.f.i.b.e.b)) {
                jVar.removeChild(this.m);
                if (this.j instanceof com.tsf.shell.f.i.b.e.b) {
                    com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) this.j;
                    com.tsf.shell.f.i.b.d.b a4 = gVar.a((com.tsf.shell.f.i.b.e.b) cVar, true);
                    r();
                    this.a.a(a4, gVar);
                    a4.setMouseEventListener(this.a.f(a4));
                    a4.setAnimationObjectState(true);
                } else if (this.j instanceof com.tsf.shell.f.i.b.d.b) {
                    cVar.g(this.j);
                }
                this.j = null;
            } else {
                com.tsf.shell.f.f.a.a aVar = (com.tsf.shell.f.f.a.a) jVar;
                if (cVar.as()) {
                    arrayList = cVar.aw();
                } else {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(cVar);
                Iterator<com.tsf.shell.f.i.c> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.f.i.c next = it.next();
                    this.s.reset();
                    this.s.setAllFrom(next.position());
                    jVar.globalToLocal(this.s);
                    next.position().setAllFrom(this.s);
                }
                arrayList.remove(cVar);
                com.tsf.shell.manager.a.j.b(cVar);
                int childIndexOf = jVar.getChildIndexOf(this.m);
                jVar.children().set(childIndexOf, cVar);
                cVar.parent(jVar);
                cVar.setAnimationObjectState(true);
                this.m.parent(null);
                this.a.a(cVar, aVar, childIndexOf);
                Iterator<com.tsf.shell.f.i.c> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.tsf.shell.f.i.c next2 = it2.next();
                    jVar.addChildAt(next2, childIndexOf + 1);
                    this.a.a(next2, aVar, childIndexOf + 1);
                    next2.setAnimationObjectState(true);
                }
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(1.0f);
                dVar.m(1.0f);
                com.censivn.C3DEngine.b.g.c.a(cVar);
                com.censivn.C3DEngine.b.g.c.a(cVar, 250, dVar);
            }
        }
        if (this.b.c() == this) {
            s();
        }
        com.tsf.shell.manager.a.p.c();
    }

    private void s() {
        if (this.g.e()) {
            if (this.a.ao().f()) {
                a(this.g);
            } else {
                this.b.m();
            }
        }
    }

    public void b(com.tsf.shell.f.i.c cVar) {
        int e;
        this.o = false;
        if (cVar.n() != null) {
            cVar.p();
        }
        if (this.x == null) {
            this.x = this.a.ap();
        }
        ArrayList<com.tsf.shell.f.i.c> arrayList = new ArrayList<>();
        if (cVar instanceof com.tsf.shell.f.i.b.d.b) {
            com.tsf.shell.f.i.b.d.b bVar = (com.tsf.shell.f.i.b.d.b) cVar;
            if (bVar.L()) {
                r();
                ArrayList arrayList2 = new ArrayList();
                Iterator<com.censivn.C3DEngine.b.f.i> it = bVar.aX().children().iterator();
                while (it.hasNext()) {
                    arrayList2.add((com.tsf.shell.f.i.b.e.g) it.next());
                }
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) arrayList2.get((size - i) - 1);
                    ((com.tsf.shell.f.i.b.d.a) gVar.getMouseEventListener()).a();
                    Number3d.TEMPNUMBER3D.reset();
                    gVar.localToGlobal(Number3d.TEMPNUMBER3D);
                    bVar.aX().removeChild(gVar);
                    gVar.position().setAllFrom(Number3d.TEMPNUMBER3D);
                    gVar.mouseEnabled(true);
                    gVar.B();
                    gVar.visible(true);
                    gVar.alpha(255.0f);
                    ((LauncherShortcut3DInfo) gVar.K()).container = -1;
                    gVar.g(1.0f);
                    arrayList.add(gVar);
                }
            } else {
                arrayList.add(cVar);
            }
        } else if ((cVar instanceof com.tsf.shell.f.i.b.e.g) && cVar.L()) {
            com.tsf.shell.manager.a.j.b(cVar);
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) this.m.parent();
            if (jVar != null && (jVar instanceof com.tsf.shell.f.f.a.a)) {
                ((com.tsf.shell.f.f.a.a) jVar).removeChild(this.m);
                return;
            }
            return;
        } else {
            ArrayList<com.tsf.shell.f.i.c> aw = cVar.as() ? cVar.aw() : arrayList;
            aw.add(cVar);
            arrayList = aw;
        }
        com.tsf.shell.manager.a.j.b(cVar);
        Iterator<com.tsf.shell.f.i.c> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.f.i.c next = it2.next();
            this.s.reset();
            this.s.setAllFrom(next.position());
            this.x.globalToLocal(this.s);
            next.position().setAllFrom(this.s);
        }
        com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) this.m.parent();
        if (jVar2 != null && (jVar2 instanceof com.tsf.shell.f.f.a.a)) {
            e = (((com.tsf.shell.f.f.a.a) jVar2).e() * com.tsf.shell.f.f.a.h.m) + this.v;
        } else {
            e = this.a.ap().e() * com.tsf.shell.f.f.a.h.m;
        }
        this.m.removeFromParent();
        Iterator<com.tsf.shell.f.i.c> it3 = arrayList.iterator();
        while (true) {
            int i2 = e;
            if (!it3.hasNext()) {
                break;
            }
            com.tsf.shell.f.i.c next2 = it3.next();
            int i3 = i2 % com.tsf.shell.f.f.a.h.m;
            com.tsf.shell.f.f.a.a e2 = this.a.e(i2);
            e2.addChildAt(next2, i3);
            this.a.a(next2, e2, i3);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.e(0.0f);
            com.censivn.C3DEngine.b.g.c.a(next2);
            com.censivn.C3DEngine.b.g.c.a(next2, 250, dVar);
            e = i2 + 1;
        }
        a((com.tsf.shell.f.i.b) cVar);
        r();
        if (!this.w) {
            this.a.ao().e();
        }
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a(final com.tsf.shell.f.i.c cVar, MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (this.u != null) {
            this.u.a(motionEvent, motionEvent2);
        } else if (this.o) {
            float[] a2 = x.a(motionEvent2, this.t);
            if (this.p) {
                com.tsf.shell.manager.a.p.a(a2[0], a2[1]);
                cVar.position().x = this.q + (motionEvent2.getX() - motionEvent.getX());
                cVar.position().y = this.r - (motionEvent2.getY() - motionEvent.getY());
            }
            if (!this.y) {
                this.y = true;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.c.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.y = false;
                        if (c.this.o) {
                            if (!c.this.p) {
                                if (x.b(c.this.q, c.this.r, motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                                    c.this.p = true;
                                    return;
                                }
                                return;
                            }
                            float[] b = x.b(motionEvent2.getX(), motionEvent2.getY());
                            com.tsf.shell.f.e.f a3 = cVar.a((int) c.this.t[0], (int) c.this.t[1], false);
                            if (a3 != null) {
                                cVar.f(a3);
                                c.this.a((com.tsf.shell.f.i.b) cVar);
                                c.this.q();
                                return;
                            }
                            if (cVar.n() != null && !(cVar.n() instanceof com.tsf.shell.f.i.b.d.b)) {
                                cVar.p();
                            }
                            c.this.z.x = b[0];
                            c.this.z.y = b[1];
                            if (b[1] >= com.censivn.C3DEngine.b.b.a.C + com.tsf.shell.f.f.a.f.a) {
                                c.this.a.ap().globalToLocal(c.this.z);
                                float f = c.this.z.x;
                                float f2 = c.this.z.y;
                                c.this.a(c.this.a.ap(), cVar, c.this.a.ap().a(c.this.z.x + ((com.tsf.shell.manager.o.b.a.T / 2.0f) * com.tsf.shell.f.f.a.h.v), c.this.z.y - ((com.tsf.shell.manager.o.b.a.U / 2.0f) * com.tsf.shell.f.f.a.h.v)), f, f2);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.u != null) {
            this.u.a(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void e(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        this.g.a(cVar, motionEvent);
    }
}
