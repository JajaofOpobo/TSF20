package com.tsf.shell.e.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends j {
    private b g;
    private a h;
    private d i;
    private com.tsf.shell.e.i.c j;
    private com.tsf.shell.e.e.e.a k;
    private com.tsf.shell.e.i.e l;
    private com.tsf.shell.e.i.c m;
    private com.tsf.shell.e.i.c n;
    private boolean o;
    private boolean p;
    private float q;
    private float r;
    private Number3d s;
    private float[] t;
    private com.censivn.C3DEngine.b.d.a u;
    private int v;
    private boolean w;
    private com.censivn.C3DEngine.b.f.l x;
    private boolean y;
    private Number3d z;

    public c(final com.tsf.shell.e.f.a.m mVar, com.tsf.shell.e.f.a.j jVar) {
        super(mVar, jVar, R.drawable.drawer_multiple_choice, x.c(R.string.text_multi_choice));
        this.m = new com.tsf.shell.e.i.c(null);
        this.n = new com.tsf.shell.e.i.c(null);
        this.o = false;
        this.p = false;
        this.s = new Number3d();
        this.t = new float[]{0.0f, 0.0f};
        this.w = false;
        this.y = false;
        this.z = new Number3d();
        this.g = new b(this, jVar, mVar);
        this.h = new a(this, jVar, mVar);
        this.k = new com.tsf.shell.e.e.e.a() { // from class: com.tsf.shell.e.f.a.c.c.1
            @Override // com.tsf.shell.e.e.e.a
            public void a(int i, Object obj) {
                mVar.au();
                if (i == 0) {
                    mVar.aG();
                } else {
                    mVar.aF();
                }
                a(800);
            }

            @Override // com.tsf.shell.e.e.e.a
            public float a() {
                return com.censivn.C3DEngine.b.b.a.a(com.tsf.shell.e.f.a.m.F);
            }
        };
        addChild(this.g);
        addChild(this.h);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, i2, i3, i4);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public boolean a(boolean z) {
        return z || this.g.b() > 0;
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a() {
        this.b.f();
        if (this.i != null) {
            this.i.g();
        }
        this.i = null;
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b() {
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b(boolean z) {
        this.b.e();
        if (this.g.b() > 0 || z) {
            a(this.g);
        } else {
            a(this.h);
        }
    }

    private void a(d dVar) {
        if (this.i != null) {
            this.i.g();
        }
        this.i = dVar;
        this.i.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.h.b();
    }

    private void r() {
        this.a.ao().c();
    }

    private void a(com.censivn.C3DEngine.b.f.l lVar, int i) {
        com.tsf.shell.e.f.a.a aVar = (com.tsf.shell.e.f.a.a) lVar;
        int numChildren = aVar.numChildren();
        if (numChildren == 1) {
            aVar.addChild(this.n);
        }
        this.m.removeFromParent();
        if (i != -1) {
            lVar.addChildAt(this.m, i);
        } else {
            lVar.addChild(this.m);
        }
        if (numChildren == 1) {
            this.n.removeFromParent();
        }
        r();
    }

    public void a(com.censivn.C3DEngine.b.f.l lVar, com.tsf.shell.e.i.c cVar, int i, float f, float f2) {
        float b;
        float f3;
        int i2;
        int i3;
        com.tsf.shell.e.i.c cVar2 = null;
        if (i > -1 && i < lVar.numChildren()) {
            com.tsf.shell.e.i.c cVar3 = (com.tsf.shell.e.i.c) lVar.getChildAt(i);
            if (cVar3 == this.m) {
                cVar3 = null;
            }
            cVar2 = cVar3;
        } else if (lVar.getChildIndexOf(this.m) == -1) {
            a(lVar, -1);
        }
        if (cVar2 != null) {
            cVar2.setAnimationObjectState(true);
            this.m.setAnimationObjectState(true);
            int numChildren = lVar.numChildren();
            int childIndexOf = lVar.getChildIndexOf(this.m);
            if (childIndexOf == -1) {
                if (cVar2 instanceof com.tsf.shell.e.i.b.d.b) {
                    b = 0.0f;
                    f3 = 1.0f;
                } else {
                    a(lVar, i);
                    return;
                }
            } else {
                Number3d number3d = (Number3d) com.tsf.shell.e.f.a.m.E.get(childIndexOf);
                Number3d number3d2 = (Number3d) com.tsf.shell.e.f.a.m.E.get(i);
                float b2 = x.b(number3d.x, number3d.y, number3d2.x, number3d2.y) + (20.0f * com.censivn.C3DEngine.b.b.a.c);
                b = x.b(f, f2, number3d.x, number3d.y);
                f3 = b2;
            }
            if (b > f3 || (cVar instanceof com.tsf.shell.e.i.b.d.b) || ((cVar2 instanceof com.tsf.shell.e.i.b.e.b) && !com.tsf.shell.e.i.b.e.b.aR() && cVar2 != this.j)) {
                q();
                r();
                lVar.children().remove(this.m);
                lVar.children().add(i, this.m);
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
                    ((com.censivn.C3DEngine.b.f.j) lVar.children().get(i3)).setAnimationObjectState(true);
                    i3++;
                }
                cVar2 = null;
            } else if (((cVar2 instanceof com.tsf.shell.e.i.b.e.b) || (cVar2 instanceof com.tsf.shell.e.i.b.d.b)) && this.j != cVar2) {
                q();
                if (cVar instanceof com.tsf.shell.e.i.b.e.b) {
                    if (cVar2 instanceof com.tsf.shell.e.i.b.e.b) {
                        com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) cVar2;
                        if (iVar.aC() && !iVar.t()) {
                            iVar.a((com.censivn.C3DEngine.b.f.j) cVar);
                        } else {
                            cVar2 = null;
                        }
                    } else if (cVar2 instanceof com.tsf.shell.e.i.b.d.b) {
                        cVar.f(cVar2);
                    }
                }
            }
        }
        a(cVar, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.e.i.c cVar) {
        a(cVar, (com.tsf.shell.e.i.c) null);
    }

    private void a(com.tsf.shell.e.i.c cVar, com.tsf.shell.e.i.c cVar2) {
        if (cVar2 != this.j) {
            if (this.j instanceof com.tsf.shell.e.i.b.e.b) {
                ((com.tsf.shell.e.i.b.e.b) this.j).b((com.censivn.C3DEngine.b.f.j) cVar);
            } else if (this.j instanceof com.tsf.shell.e.i.b.d.b) {
                cVar.p();
            }
            this.j = cVar2;
        }
    }

    public void a(com.censivn.C3DEngine.b.d.a aVar) {
        this.u = aVar;
    }

    public com.tsf.shell.e.i.e c() {
        return this.l;
    }

    public boolean d() {
        return this.o;
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        this.p = false;
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        if (this.u != null) {
            this.u.f(motionEvent);
        }
        this.u = null;
    }

    public void a(com.tsf.shell.e.i.e eVar) {
        ((com.tsf.shell.e.i.a.c) eVar.getMouseEventListener()).a(this.q, this.r);
    }

    public void a(float f, float f2) {
        this.q = this.s.x;
        this.r = this.s.y;
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void c(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        this.w = false;
        this.k.b();
        this.l = eVar;
        this.s.reset();
        eVar.localToGlobal(this.s);
        a(this.s.x, this.s.y);
        this.o = true;
        com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) eVar.parent();
        eVar.position().setAllFrom(this.s);
        if (eVar.parent() instanceof com.tsf.shell.e.f.a.a) {
            this.x = lVar;
            this.v = lVar.getChildIndexOf(eVar);
            lVar.replaceChild(eVar, this.m);
            com.tsf.shell.manager.a.j.a(eVar);
            this.a.c((com.tsf.shell.e.i.c) eVar);
            eVar.setAnimationObjectState(true);
            Number3d.TEMPNUMBER3D.reset();
            Number3d.TEMPNUMBER3D.setAll(1.0f, 1.0f, 1.0f);
            Number3d localScaleToGlobale = eVar.localScaleToGlobale(Number3d.TEMPNUMBER3D);
            eVar.scale().setAll(localScaleToGlobale.x, localScaleToGlobale.y, 1.0f);
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.l(eVar.d);
            xVar.m(eVar.d);
            w.a(eVar);
            w.a(eVar, 250, xVar);
            if (motionEvent == null) {
                this.t[0] = eVar.position().x;
                this.t[1] = eVar.position().y;
            } else {
                x.a(motionEvent, this.t);
            }
            this.a.a((com.tsf.shell.e.i.c) eVar, true, this.t[0], this.t[1]);
            return;
        }
        this.x = null;
        this.g.b(eVar, motionEvent);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void d(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        ArrayList arrayList;
        this.k.c();
        if (this.u != null) {
            this.u.d(motionEvent);
            return;
        }
        this.w = this.a.ao().f();
        this.l = null;
        this.o = false;
        com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) this.m.parent();
        boolean z = lVar == null;
        if (eVar.n() != null && eVar.o()) {
            float[] a = x.a(motionEvent);
            com.tsf.shell.e.e.g a2 = eVar.a((int) a[0], (int) a[1], false);
            if (a2 != null && (a2 instanceof com.tsf.shell.e.e.e.g)) {
                if (eVar.h(a2)) {
                    eVar.g(a2);
                }
                z = true;
            } else {
                eVar.p();
            }
        }
        if (z) {
            b(eVar);
        } else {
            if (lVar instanceof com.tsf.shell.e.f.a.a) {
                Number3d.TEMPNUMBER3D.reset();
                Number3d.TEMPNUMBER3D.setAllFrom(eVar.scale());
                lVar.globalScaleToLocal(Number3d.TEMPNUMBER3D);
                eVar.scale().setAllFrom(Number3d.TEMPNUMBER3D);
            }
            if (this.j != null && (eVar instanceof com.tsf.shell.e.i.b.e.b)) {
                lVar.removeChild(this.m);
                if (this.j instanceof com.tsf.shell.e.i.b.e.b) {
                    com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) this.j;
                    com.tsf.shell.e.i.b.d.b a3 = iVar.a((com.tsf.shell.e.i.b.e.b) eVar, true);
                    r();
                    this.a.a(a3, iVar);
                    a3.setMouseEventListener(this.a.f(a3));
                    a3.setAnimationObjectState(true);
                } else if (this.j instanceof com.tsf.shell.e.i.b.d.b) {
                    eVar.g(this.j);
                }
                this.j = null;
            } else {
                com.tsf.shell.e.f.a.a aVar = (com.tsf.shell.e.f.a.a) lVar;
                if (eVar.as()) {
                    arrayList = eVar.aw();
                } else {
                    arrayList = new ArrayList();
                }
                arrayList.add(eVar);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.e.i.e eVar2 = (com.tsf.shell.e.i.e) it.next();
                    this.s.reset();
                    this.s.setAllFrom(eVar2.position());
                    lVar.globalToLocal(this.s);
                    eVar2.position().setAllFrom(this.s);
                }
                arrayList.remove(eVar);
                com.tsf.shell.manager.a.j.b(eVar);
                int childIndexOf = lVar.getChildIndexOf(this.m);
                lVar.children().set(childIndexOf, eVar);
                eVar.parent(lVar);
                eVar.setAnimationObjectState(true);
                this.m.parent(null);
                this.a.a(eVar, aVar, childIndexOf);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it2.next();
                    lVar.addChildAt(cVar, childIndexOf + 1);
                    this.a.a(cVar, aVar, childIndexOf + 1);
                    cVar.setAnimationObjectState(true);
                }
                com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                xVar.l(1.0f);
                xVar.m(1.0f);
                w.a(eVar);
                w.a(eVar, 250, xVar);
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

    public void b(com.tsf.shell.e.i.e eVar) {
        int e;
        this.o = false;
        if (eVar.n() != null) {
            eVar.p();
        }
        if (this.x == null) {
            this.x = this.a.ap();
        }
        ArrayList arrayList = new ArrayList();
        if (eVar instanceof com.tsf.shell.e.i.b.d.b) {
            com.tsf.shell.e.i.b.d.b bVar = (com.tsf.shell.e.i.b.d.b) eVar;
            if (bVar.L()) {
                r();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = bVar.aX().children().iterator();
                while (it.hasNext()) {
                    arrayList2.add((com.tsf.shell.e.i.b.e.i) ((com.censivn.C3DEngine.b.f.j) it.next()));
                }
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) arrayList2.get((size - i) - 1);
                    ((com.tsf.shell.e.i.b.d.a) iVar.getMouseEventListener()).a();
                    Number3d.TEMPNUMBER3D.reset();
                    iVar.localToGlobal(Number3d.TEMPNUMBER3D);
                    bVar.aX().removeChild(iVar);
                    iVar.position().setAllFrom(Number3d.TEMPNUMBER3D);
                    iVar.mouseEnabled(true);
                    iVar.B();
                    iVar.visible(true);
                    iVar.alpha(255.0f);
                    ((LauncherShortcut3DInfo) iVar.K()).container = -1;
                    iVar.g(1.0f);
                    arrayList.add(iVar);
                }
            } else {
                arrayList.add(eVar);
            }
        } else {
            if ((eVar instanceof com.tsf.shell.e.i.b.e.i) && eVar.L()) {
                com.tsf.shell.manager.a.j.b(eVar);
                com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) this.m.parent();
                if (lVar != null && (lVar instanceof com.tsf.shell.e.f.a.a)) {
                    ((com.tsf.shell.e.f.a.a) lVar).removeChild(this.m);
                    return;
                }
                return;
            }
            ArrayList aw = eVar.as() ? eVar.aw() : arrayList;
            aw.add(eVar);
            arrayList = aw;
        }
        com.tsf.shell.manager.a.j.b(eVar);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it2.next();
            this.s.reset();
            this.s.setAllFrom(cVar.position());
            this.x.globalToLocal(this.s);
            cVar.position().setAllFrom(this.s);
        }
        com.censivn.C3DEngine.b.f.l lVar2 = (com.censivn.C3DEngine.b.f.l) this.m.parent();
        if (lVar2 != null && (lVar2 instanceof com.tsf.shell.e.f.a.a)) {
            e = (((com.tsf.shell.e.f.a.a) lVar2).e() * com.tsf.shell.e.f.a.m.m) + this.v;
        } else {
            e = this.a.ap().e() * com.tsf.shell.e.f.a.m.m;
        }
        this.m.removeFromParent();
        Iterator it3 = arrayList.iterator();
        while (true) {
            int i2 = e;
            if (!it3.hasNext()) {
                break;
            }
            com.tsf.shell.e.i.c cVar2 = (com.tsf.shell.e.i.c) it3.next();
            int i3 = i2 % com.tsf.shell.e.f.a.m.m;
            com.tsf.shell.e.f.a.a e2 = this.a.e(i2);
            e2.addChildAt(cVar2, i3);
            this.a.a(cVar2, e2, i3);
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.l(1.0f);
            xVar.m(1.0f);
            xVar.e(0.0f);
            w.a(cVar2);
            w.a(cVar2, 250, xVar);
            e = i2 + 1;
        }
        a((com.tsf.shell.e.i.c) eVar);
        r();
        if (!this.w) {
            this.a.ao().e();
        }
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a(final com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (this.u != null) {
            this.u.a(motionEvent, motionEvent2);
            return;
        }
        if (this.o) {
            float[] a = x.a(motionEvent2, this.t);
            if (this.p) {
                com.tsf.shell.manager.a.p.a(a[0], a[1]);
                eVar.position().x = this.q + (motionEvent2.getX() - motionEvent.getX());
                eVar.position().y = this.r - (motionEvent2.getY() - motionEvent.getY());
            }
            if (!this.y) {
                this.y = true;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.a.c.c.2
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
                            com.tsf.shell.e.e.g a2 = eVar.a((int) c.this.t[0], (int) c.this.t[1], false);
                            if (a2 != null) {
                                eVar.f(a2);
                                c.this.a((com.tsf.shell.e.i.c) eVar);
                                c.this.q();
                                return;
                            }
                            if (eVar.n() != null && !(eVar.n() instanceof com.tsf.shell.e.i.b.d.b)) {
                                eVar.p();
                            }
                            c.this.z.x = b[0];
                            c.this.z.y = b[1];
                            if (b[1] >= com.censivn.C3DEngine.b.b.a.C + com.tsf.shell.e.f.a.j.a) {
                                c.this.a.ap().globalToLocal(c.this.z);
                                c.this.a(c.this.a.ap(), eVar, c.this.a.ap().a(c.this.z.x + ((com.tsf.shell.manager.o.b.a.T / 2.0f) * com.tsf.shell.e.f.a.m.v), c.this.z.y - ((com.tsf.shell.manager.o.b.a.U / 2.0f) * com.tsf.shell.e.f.a.m.v)), c.this.z.x, c.this.z.y);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.u != null) {
            this.u.a(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void e(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        this.g.a(eVar, motionEvent);
    }
}
