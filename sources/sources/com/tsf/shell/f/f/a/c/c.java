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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        int iNumChildren = aVar.numChildren();
        if (iNumChildren == 1) {
            aVar.addChild(this.n);
        }
        this.m.removeFromParent();
        if (i != -1) {
            jVar.addChildAt(this.m, i);
        } else {
            jVar.addChild(this.m);
        }
        if (iNumChildren == 1) {
            this.n.removeFromParent();
        }
        r();
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar, com.tsf.shell.f.i.b bVar, int i, float f, float f2) {
        float fB;
        float f3;
        int i2;
        int i3;
        com.tsf.shell.f.i.b bVar2 = null;
        if (i > -1 && i < jVar.numChildren()) {
            com.tsf.shell.f.i.b bVar3 = (com.tsf.shell.f.i.b) jVar.getChildAt(i);
            if (bVar3 == this.m) {
                bVar3 = null;
            }
            bVar2 = bVar3;
        } else if (jVar.getChildIndexOf(this.m) == -1) {
            a(jVar, -1);
        }
        if (bVar2 != null) {
            bVar2.setAnimationObjectState(true);
            this.m.setAnimationObjectState(true);
            int iNumChildren = jVar.numChildren();
            int childIndexOf = jVar.getChildIndexOf(this.m);
            if (childIndexOf == -1) {
                if (bVar2 instanceof com.tsf.shell.f.i.b.d.b) {
                    fB = 0.0f;
                    f3 = 1.0f;
                } else {
                    a(jVar, i);
                    return;
                }
            } else {
                Number3d number3d = com.tsf.shell.f.f.a.h.E.get(childIndexOf);
                Number3d number3d2 = com.tsf.shell.f.f.a.h.E.get(i);
                float fB2 = x.b(number3d.x, number3d.y, number3d2.x, number3d2.y) + (20.0f * com.censivn.C3DEngine.b.b.a.c);
                fB = x.b(f, f2, number3d.x, number3d.y);
                f3 = fB2;
            }
            if (fB > f3 || (bVar instanceof com.tsf.shell.f.i.b.d.b) || ((bVar2 instanceof com.tsf.shell.f.i.b.e.b) && !com.tsf.shell.f.i.b.e.b.aR() && bVar2 != this.j)) {
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
                if (i3 > iNumChildren - 1) {
                    i3 = iNumChildren - 1;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = i2 > iNumChildren + (-1) ? iNumChildren - 1 : i2;
                while (i3 < i4 + 1) {
                    jVar.children().get(i3).setAnimationObjectState(true);
                    i3++;
                }
                bVar2 = null;
            } else if (((bVar2 instanceof com.tsf.shell.f.i.b.e.b) || (bVar2 instanceof com.tsf.shell.f.i.b.d.b)) && this.j != bVar2) {
                q();
                if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
                    if (bVar2 instanceof com.tsf.shell.f.i.b.e.b) {
                        com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) bVar2;
                        if (gVar.aC() && !gVar.t()) {
                            gVar.a((com.censivn.C3DEngine.b.f.i) bVar);
                        } else {
                            bVar2 = null;
                        }
                    } else if (bVar2 instanceof com.tsf.shell.f.i.b.d.b) {
                        bVar.f(bVar2);
                    }
                }
            }
        }
        a(bVar, bVar2);
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
            Number3d number3dLocalScaleToGlobale = cVar.localScaleToGlobale(Number3d.TEMPNUMBER3D);
            cVar.scale().setAll(number3dLocalScaleToGlobale.x, number3dLocalScaleToGlobale.y, 1.0f);
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
            float[] fArrA = x.a(motionEvent);
            com.tsf.shell.f.e.f fVarA = cVar.a((int) fArrA[0], (int) fArrA[1], false);
            if (fVarA != null && (fVarA instanceof c.b)) {
                if (cVar.h(fVarA)) {
                    cVar.g(fVarA);
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
                    com.tsf.shell.f.i.b.d.b bVarA = gVar.a((com.tsf.shell.f.i.b.e.b) cVar, true);
                    r();
                    this.a.a(bVarA, gVar);
                    bVarA.setMouseEventListener(this.a.f(bVarA));
                    bVarA.setAnimationObjectState(true);
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
                for (com.tsf.shell.f.i.c cVar2 : arrayList) {
                    this.s.reset();
                    this.s.setAllFrom(cVar2.position());
                    jVar.globalToLocal(this.s);
                    cVar2.position().setAllFrom(this.s);
                }
                arrayList.remove(cVar);
                com.tsf.shell.manager.a.j.b(cVar);
                int childIndexOf = jVar.getChildIndexOf(this.m);
                jVar.children().set(childIndexOf, cVar);
                cVar.parent(jVar);
                cVar.setAnimationObjectState(true);
                this.m.parent(null);
                this.a.a(cVar, aVar, childIndexOf);
                for (com.tsf.shell.f.i.c cVar3 : arrayList) {
                    jVar.addChildAt(cVar3, childIndexOf + 1);
                    this.a.a(cVar3, aVar, childIndexOf + 1);
                    cVar3.setAnimationObjectState(true);
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
        int iE;
        this.o = false;
        if (cVar.n() != null) {
            cVar.p();
        }
        if (this.x == null) {
            this.x = this.a.ap();
        }
        ArrayList<com.tsf.shell.f.i.b> arrayList = new ArrayList();
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
        } else {
            if ((cVar instanceof com.tsf.shell.f.i.b.e.g) && cVar.L()) {
                com.tsf.shell.manager.a.j.b(cVar);
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) this.m.parent();
                if (jVar != null && (jVar instanceof com.tsf.shell.f.f.a.a)) {
                    ((com.tsf.shell.f.f.a.a) jVar).removeChild(this.m);
                    return;
                }
                return;
            }
            ArrayList arrayListAw = cVar.as() ? cVar.aw() : arrayList;
            arrayListAw.add(cVar);
            arrayList = arrayListAw;
        }
        com.tsf.shell.manager.a.j.b(cVar);
        for (com.tsf.shell.f.i.b bVar2 : arrayList) {
            this.s.reset();
            this.s.setAllFrom(bVar2.position());
            this.x.globalToLocal(this.s);
            bVar2.position().setAllFrom(this.s);
        }
        com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) this.m.parent();
        if (jVar2 != null && (jVar2 instanceof com.tsf.shell.f.f.a.a)) {
            iE = (((com.tsf.shell.f.f.a.a) jVar2).e() * com.tsf.shell.f.f.a.h.m) + this.v;
        } else {
            iE = this.a.ap().e() * com.tsf.shell.f.f.a.h.m;
        }
        this.m.removeFromParent();
        Iterator it2 = arrayList.iterator();
        while (true) {
            int i2 = iE;
            if (!it2.hasNext()) {
                break;
            }
            com.tsf.shell.f.i.b bVar3 = (com.tsf.shell.f.i.b) it2.next();
            int i3 = i2 % com.tsf.shell.f.f.a.h.m;
            com.tsf.shell.f.f.a.a aVarE = this.a.e(i2);
            aVarE.addChildAt(bVar3, i3);
            this.a.a(bVar3, aVarE, i3);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.e(0.0f);
            com.censivn.C3DEngine.b.g.c.a(bVar3);
            com.censivn.C3DEngine.b.g.c.a(bVar3, 250, dVar);
            iE = i2 + 1;
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
            return;
        }
        if (this.o) {
            float[] fArrA = x.a(motionEvent2, this.t);
            if (this.p) {
                com.tsf.shell.manager.a.p.a(fArrA[0], fArrA[1]);
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
                            float[] fArrB = x.b(motionEvent2.getX(), motionEvent2.getY());
                            com.tsf.shell.f.e.f fVarA = cVar.a((int) c.this.t[0], (int) c.this.t[1], false);
                            if (fVarA != null) {
                                cVar.f(fVarA);
                                c.this.a((com.tsf.shell.f.i.b) cVar);
                                c.this.q();
                                return;
                            }
                            if (cVar.n() != null && !(cVar.n() instanceof com.tsf.shell.f.i.b.d.b)) {
                                cVar.p();
                            }
                            c.this.z.x = fArrB[0];
                            c.this.z.y = fArrB[1];
                            if (fArrB[1] >= com.censivn.C3DEngine.b.b.a.C + com.tsf.shell.f.f.a.f.a) {
                                c.this.a.ap().globalToLocal(c.this.z);
                                c.this.a(c.this.a.ap(), cVar, c.this.a.ap().a(c.this.z.x + ((com.tsf.shell.manager.o.b.a.T / 2.0f) * com.tsf.shell.f.f.a.h.v), c.this.z.y - ((com.tsf.shell.manager.o.b.a.U / 2.0f) * com.tsf.shell.f.f.a.h.v)), c.this.z.x, c.this.z.y);
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
