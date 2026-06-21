package com.tsf.shell.e.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends d {
    private com.censivn.C3DEngine.b.h.e.b a;
    private n b;
    private com.tsf.shell.e.f.a.m c;
    private ArrayList d;
    private int e;
    private f f;
    private f g;
    private com.tsf.shell.e.f.a.j h;
    private c i;
    private com.censivn.C3DEngine.b.f.o j;
    private float k;

    public b(c cVar, com.tsf.shell.e.f.a.j jVar, com.tsf.shell.e.f.a.m mVar) {
        this.i = cVar;
        this.c = mVar;
        this.h = jVar;
        h();
    }

    @Override // com.tsf.shell.e.f.a.c.d
    public void d() {
        this.j.a();
        this.g.d();
        this.f.d();
    }

    public void a(int i, int i2, int i3, int i4) {
        this.a.a(i, (-this.k) / 2.0f, i3, this.k / 2.0f);
        this.b.b();
    }

    private void h() {
        int i = 70;
        float f = 0.8f * (com.tsf.shell.manager.o.b.c.U / com.tsf.shell.manager.o.b.a.U);
        this.k = com.tsf.shell.manager.o.b.a.U * f;
        this.j = new com.censivn.C3DEngine.b.f.o();
        this.j.c(R.string.notic_batch_operation);
        this.j.d(39);
        this.j.e(-1);
        com.tsf.shell.manager.o.c.a(this.j, com.tsf.shell.manager.o.c.h);
        addChild(this.j);
        this.b = new n(this.i, 1.0f) { // from class: com.tsf.shell.e.f.a.c.b.1
            @Override // com.tsf.shell.e.f.a.c.n
            public com.censivn.C3DEngine.b.f.l a() {
                return b.this.a.l();
            }

            @Override // com.tsf.shell.e.f.a.c.n
            public com.censivn.C3DEngine.b.f.j a(int i2) {
                return b.this.a.l().getChildAt(i2);
            }
        };
        this.a = new com.censivn.C3DEngine.b.h.e.b(com.censivn.C3DEngine.b.b.a.D, this.k, com.tsf.shell.manager.o.b.a.U * f, 30.0f * com.censivn.C3DEngine.b.b.a.c * f, com.censivn.C3DEngine.b.b.a.c * 10.0f * f, f) { // from class: com.tsf.shell.e.f.a.c.b.2
            @Override // com.censivn.C3DEngine.b.h.e.b
            public void a(int i2) {
                b.this.b(i2);
            }

            @Override // com.censivn.C3DEngine.b.h.e.b
            public void a(com.censivn.C3DEngine.b.f.j jVar) {
                b.this.c.c((com.tsf.shell.e.i.c) jVar);
                b.this.b.a(jVar);
            }

            @Override // com.censivn.C3DEngine.b.h.e.b
            public void b(com.censivn.C3DEngine.b.f.j jVar) {
                b.this.b.b(jVar);
            }

            @Override // com.censivn.C3DEngine.b.h.e.b
            public void k() {
                if (b.this.e == 0) {
                    super.k();
                }
            }

            @Override // com.censivn.C3DEngine.b.h.e.b
            public void h() {
                if (b.this.e != 0) {
                    b.this.b.c();
                } else {
                    super.h();
                }
            }
        };
        this.d = new ArrayList();
        f fVar = new f(R.drawable.drawer_layout_folder, i, x.c(R.string.pop_menu_create_folder)) { // from class: com.tsf.shell.e.f.a.c.b.3
            @Override // com.tsf.shell.e.f.a.c.f
            public void a() {
                ArrayList arrayList = new ArrayList();
                int numChildren = b.this.a.l().numChildren();
                if (numChildren > 0) {
                    int i2 = numChildren - 1;
                    while (true) {
                        int i3 = i2;
                        if (i3 <= -1) {
                            break;
                        }
                        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) b.this.a.l().getChildAt(i3);
                        if (bVar.ao()) {
                            arrayList.add(bVar);
                        }
                        i2 = i3 - 1;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) it.next();
                        bVar2.alpha(255.0f);
                        bVar2.visible(true);
                        bVar2.al();
                        bVar2.an();
                        Number3d localToGlobal = bVar2.localToGlobal(new Number3d());
                        b.this.a.l().removeChild(bVar2);
                        bVar2.position().setAllFrom(localToGlobal);
                    }
                }
                b.this.c.b(arrayList);
            }
        };
        this.f = fVar;
        this.d.add(fVar);
        f fVar2 = new f(R.drawable.drawer_layout_reset, i, x.c(R.string.text_reset)) { // from class: com.tsf.shell.e.f.a.c.b.4
            @Override // com.tsf.shell.e.f.a.c.f
            public void a() {
                b.this.i();
            }
        };
        this.g = fVar2;
        this.d.add(fVar2);
        int size = this.d.size();
        float f2 = com.censivn.C3DEngine.b.b.a.z + (com.censivn.C3DEngine.b.b.a.D / (size + 1));
        float f3 = com.censivn.C3DEngine.b.b.a.D / (size + 1);
        float f4 = f2;
        for (int i2 = 0; i2 < size; i2++) {
            f fVar3 = (f) this.d.get(i2);
            fVar3.position().x = f4;
            fVar3.position().y = ((((-com.tsf.shell.e.f.a.j.a) / 2.0f) + com.tsf.shell.e.f.a.m.F) - com.tsf.shell.e.f.a.j.b) + (com.censivn.C3DEngine.b.b.a.c * 10.0f);
            fVar3.removeFromParent();
            addChild(fVar3);
            f4 += f3;
        }
        addChild(this.a);
        a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        j();
        if (i > 0) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.a.c.b.5
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    b.this.j.visible(false);
                    b.this.j.a();
                }
            };
            xVar.h(com.censivn.C3DEngine.b.b.a.a(-150.0f));
            xVar.a(0);
            w.a(this.j);
            w.a(this.j, 300, xVar);
            com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
            xVar2.a(255);
            w.a(this.g);
            w.a(this.g, 300, xVar2);
            this.g.mouseEnabled(true);
            return;
        }
        if (!this.i.d()) {
            com.censivn.C3DEngine.b.g.x xVar3 = new com.censivn.C3DEngine.b.g.x();
            xVar3.h(0.0f);
            xVar3.a(255);
            w.a(this.j);
            w.a(this.j, 300, xVar3);
            this.j.visible(true);
            com.censivn.C3DEngine.b.g.x xVar4 = new com.censivn.C3DEngine.b.g.x();
            xVar4.a(30);
            w.a(this.g);
            w.a(this.g, 300, xVar4);
            this.g.mouseEnabled(false);
        }
    }

    public void a(int i) {
        int i2 = 0;
        this.e = i;
        if (this.e == 0) {
            this.a.f();
            com.tsf.shell.manager.o.c.a(this.f, com.tsf.shell.manager.o.c.h);
            this.a.l().renderChildren(true);
            this.a.m();
            return;
        }
        this.a.e();
        com.tsf.shell.manager.o.c.a(this.f, com.tsf.shell.manager.o.c.l);
        this.a.l().renderChildren(false);
        while (true) {
            int i3 = i2;
            if (i3 < this.a.l().numChildren()) {
                com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.a.l().getChildAt(i3);
                bVar.ak();
                bVar.am();
                i2 = i3 + 1;
            } else {
                this.b.a(this.a.g() * com.censivn.C3DEngine.b.b.a.D);
                this.b.b();
                return;
            }
        }
    }

    public int b() {
        return this.a.l().numChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ArrayList arrayList = new ArrayList();
        int numChildren = this.a.l().numChildren();
        if (numChildren > 0) {
            while (true) {
                numChildren--;
                if (numChildren <= -1) {
                    break;
                } else {
                    arrayList.add(this.a.l().getChildAt(numChildren));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                if (jVar instanceof com.tsf.shell.e.i.b.e.b) {
                    com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) jVar;
                    bVar.alpha(255.0f);
                    bVar.visible(true);
                    bVar.al();
                    bVar.an();
                    Number3d localToGlobal = bVar.localToGlobal(new Number3d());
                    this.a.l().removeChild(bVar);
                    int b = this.c.b((com.tsf.shell.e.i.c) bVar);
                    int i = b % com.tsf.shell.e.f.a.m.m;
                    com.tsf.shell.e.f.a.a e = this.c.e(b);
                    bVar.position().setAllFrom(e.globalToLocal(localToGlobal));
                    e.addChildAt(bVar, i);
                    this.c.a(bVar, e, i);
                    com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                    xVar.l(1.0f);
                    xVar.m(1.0f);
                    w.a(bVar);
                    w.a(bVar, 250, xVar);
                }
            }
            arrayList.clear();
        }
    }

    @Override // com.tsf.shell.e.f.a.c.d
    public void c() {
        i();
        a(0);
    }

    @Override // com.tsf.shell.e.f.a.c.d
    public void a() {
        b(this.a.l().numChildren());
    }

    public boolean e() {
        return this.a.l().numChildren() == 0;
    }

    private void j() {
        if (k()) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.a(255);
            w.a(this.f);
            w.a(this.f, 300, xVar);
            this.f.mouseEnabled(true);
            return;
        }
        com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
        xVar2.a(30);
        w.a(this.f);
        w.a(this.f, 300, xVar2);
        this.f.mouseEnabled(false);
    }

    private boolean k() {
        int numChildren = this.a.l().numChildren();
        for (int i = 0; i < numChildren; i++) {
            if (((com.tsf.shell.e.i.b.e.b) this.a.l().getChildAt(i)).ao()) {
                return true;
            }
        }
        return false;
    }

    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        if ((eVar.parent() instanceof com.tsf.shell.e.f.a.a) && (eVar instanceof com.tsf.shell.e.i.b.e.b)) {
            eVar.rotation().setAll(0.0f, 0.0f, 0.0f);
            eVar.ak();
            eVar.am();
            if (this.e == 0) {
                this.a.d(eVar);
            } else {
                this.a.l().addChild(eVar);
                this.b.b();
            }
            j();
            return;
        }
        if (eVar.parent() == this.a.l() && (eVar instanceof com.tsf.shell.e.i.b.e.b)) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) eVar;
            if (!bVar.ao()) {
                bVar.ak();
                bVar.am();
            } else {
                bVar.al();
                bVar.an();
            }
            j();
            return;
        }
        if ((eVar.parent() instanceof com.tsf.shell.e.f.a.a) && (eVar instanceof com.tsf.shell.e.i.b.d.b)) {
            ((com.tsf.shell.e.i.b.d.b) eVar).aR();
        }
    }

    public void b(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) eVar.parent();
        ArrayList arrayList = new ArrayList();
        if (lVar == this.a.l()) {
            if (this.e == 0) {
                Iterator it = lVar.children().iterator();
                while (it.hasNext()) {
                    com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) ((com.censivn.C3DEngine.b.f.j) it.next());
                    if (bVar.ao()) {
                        arrayList.add(bVar);
                    }
                }
            } else {
                Iterator it2 = lVar.children().iterator();
                while (it2.hasNext()) {
                    arrayList.add((com.tsf.shell.e.i.b.e.b) ((com.censivn.C3DEngine.b.f.j) it2.next()));
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                com.tsf.shell.e.i.e eVar2 = (com.tsf.shell.e.i.e) it3.next();
                com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                xVar.l(1.0f);
                xVar.m(1.0f);
                w.a(eVar2);
                w.a(eVar2, VEasing.Back.easeIn, xVar);
            }
            arrayList.remove(eVar);
            eVar.b(arrayList);
        }
        eVar.removeFromParent();
        this.i.a(eVar.position().x, eVar.position().y);
        com.tsf.shell.manager.a.j.a(eVar);
    }
}
