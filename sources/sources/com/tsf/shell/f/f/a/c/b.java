package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.f.f.a.c.c;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends c.a {
    private com.censivn.C3DEngine.b.h.e.b a;
    private l b;
    private com.tsf.shell.f.f.a.h c;
    private ArrayList<e> d;
    private int e;
    private e f;
    private e g;
    private com.tsf.shell.f.f.a.f h;
    private c i;
    private com.censivn.C3DEngine.b.f.m j;
    private float k;

    public b(c cVar, com.tsf.shell.f.f.a.f fVar, com.tsf.shell.f.f.a.h hVar) {
        this.i = cVar;
        this.c = hVar;
        this.h = fVar;
        h();
    }

    @Override // com.tsf.shell.f.f.a.c.c.a
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
        this.j = new com.censivn.C3DEngine.b.f.m();
        this.j.c(b.i.notic_batch_operation);
        this.j.d(39);
        this.j.e(-1);
        com.tsf.shell.manager.o.c.a(this.j, com.tsf.shell.manager.o.c.h);
        addChild(this.j);
        this.b = new l(this.i, 1.0f) { // from class: com.tsf.shell.f.f.a.c.b.1
            @Override // com.tsf.shell.f.f.a.c.l
            public com.censivn.C3DEngine.b.f.j a() {
                return b.this.a.l();
            }

            @Override // com.tsf.shell.f.f.a.c.l
            public com.censivn.C3DEngine.b.f.i a(int i2) {
                return b.this.a.l().getChildAt(i2);
            }
        };
        this.a = new com.censivn.C3DEngine.b.h.e.b(com.censivn.C3DEngine.b.b.a.D, this.k, com.tsf.shell.manager.o.b.a.U * f, 30.0f * com.censivn.C3DEngine.b.b.a.c * f, com.censivn.C3DEngine.b.b.a.c * 10.0f * f, f) { // from class: com.tsf.shell.f.f.a.c.b.2
            @Override // com.censivn.C3DEngine.b.h.e.b
            public void a(int i2) {
                b.this.b(i2);
            }

            @Override // com.censivn.C3DEngine.b.h.e.b
            public void a(com.censivn.C3DEngine.b.f.i iVar) {
                b.this.c.c((com.tsf.shell.f.i.b) iVar);
                b.this.b.a(iVar);
            }

            @Override // com.censivn.C3DEngine.b.h.e.b
            public void b(com.censivn.C3DEngine.b.f.i iVar) {
                b.this.b.b(iVar);
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
        this.d = new ArrayList<>();
        e eVar = new e(b.d.drawer_layout_folder, i, x.c(b.i.pop_menu_create_folder)) { // from class: com.tsf.shell.f.f.a.c.b.3
            @Override // com.tsf.shell.f.f.a.c.e
            public void a() {
                ArrayList<com.tsf.shell.f.i.b.e.b> arrayList = new ArrayList<>();
                int iNumChildren = b.this.a.l().numChildren();
                if (iNumChildren > 0) {
                    int i2 = iNumChildren - 1;
                    while (true) {
                        int i3 = i2;
                        if (i3 <= -1) {
                            break;
                        }
                        com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) b.this.a.l().getChildAt(i3);
                        if (bVar.ao()) {
                            arrayList.add(bVar);
                        }
                        i2 = i3 - 1;
                    }
                    for (com.tsf.shell.f.i.b.e.b bVar2 : arrayList) {
                        bVar2.alpha(255.0f);
                        bVar2.visible(true);
                        bVar2.al();
                        bVar2.an();
                        Number3d number3dLocalToGlobal = bVar2.localToGlobal(new Number3d());
                        b.this.a.l().removeChild(bVar2);
                        bVar2.position().setAllFrom(number3dLocalToGlobal);
                    }
                }
                b.this.c.b(arrayList);
            }
        };
        this.f = eVar;
        this.d.add(eVar);
        e eVar2 = new e(b.d.drawer_layout_reset, i, x.c(b.i.text_reset)) { // from class: com.tsf.shell.f.f.a.c.b.4
            @Override // com.tsf.shell.f.f.a.c.e
            public void a() {
                b.this.i();
            }
        };
        this.g = eVar2;
        this.d.add(eVar2);
        int size = this.d.size();
        float f2 = com.censivn.C3DEngine.b.b.a.z + (com.censivn.C3DEngine.b.b.a.D / (size + 1));
        float f3 = com.censivn.C3DEngine.b.b.a.D / (size + 1);
        float f4 = f2;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar3 = this.d.get(i2);
            eVar3.position().x = f4;
            eVar3.position().y = ((((-com.tsf.shell.f.f.a.f.a) / 2.0f) + com.tsf.shell.f.f.a.h.F) - com.tsf.shell.f.f.a.f.b) + (com.censivn.C3DEngine.b.b.a.c * 10.0f);
            eVar3.removeFromParent();
            addChild(eVar3);
            f4 += f3;
        }
        addChild(this.a);
        a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        j();
        if (i > 0) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.c.b.5
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    b.this.j.visible(false);
                    b.this.j.a();
                }
            };
            dVar.h(com.censivn.C3DEngine.b.b.a.a(-150.0f));
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.j);
            com.censivn.C3DEngine.b.g.c.a(this.j, 300, dVar);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.g);
            com.censivn.C3DEngine.b.g.c.a(this.g, 300, dVar2);
            this.g.mouseEnabled(true);
            return;
        }
        if (!this.i.d()) {
            com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d();
            dVar3.h(0.0f);
            dVar3.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.j);
            com.censivn.C3DEngine.b.g.c.a(this.j, 300, dVar3);
            this.j.visible(true);
            com.censivn.C3DEngine.b.g.d dVar4 = new com.censivn.C3DEngine.b.g.d();
            dVar4.a(30);
            com.censivn.C3DEngine.b.g.c.a(this.g);
            com.censivn.C3DEngine.b.g.c.a(this.g, 300, dVar4);
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
                com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) this.a.l().getChildAt(i3);
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
        ArrayList<com.censivn.C3DEngine.b.f.i> arrayList = new ArrayList();
        int iNumChildren = this.a.l().numChildren();
        if (iNumChildren > 0) {
            while (true) {
                iNumChildren--;
                if (iNumChildren <= -1) {
                    break;
                } else {
                    arrayList.add(this.a.l().getChildAt(iNumChildren));
                }
            }
            for (com.censivn.C3DEngine.b.f.i iVar : arrayList) {
                if (iVar instanceof com.tsf.shell.f.i.b.e.b) {
                    com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) iVar;
                    bVar.alpha(255.0f);
                    bVar.visible(true);
                    bVar.al();
                    bVar.an();
                    Number3d number3dLocalToGlobal = bVar.localToGlobal(new Number3d());
                    this.a.l().removeChild(bVar);
                    int iB = this.c.b((com.tsf.shell.f.i.b) bVar);
                    int i = iB % com.tsf.shell.f.f.a.h.m;
                    com.tsf.shell.f.f.a.a aVarE = this.c.e(iB);
                    bVar.position().setAllFrom(aVarE.globalToLocal(number3dLocalToGlobal));
                    aVarE.addChildAt(bVar, i);
                    this.c.a(bVar, aVarE, i);
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                    dVar.l(1.0f);
                    dVar.m(1.0f);
                    com.censivn.C3DEngine.b.g.c.a(bVar);
                    com.censivn.C3DEngine.b.g.c.a(bVar, 250, dVar);
                }
            }
            arrayList.clear();
        }
    }

    @Override // com.tsf.shell.f.f.a.c.c.a
    public void c() {
        i();
        a(0);
    }

    @Override // com.tsf.shell.f.f.a.c.c.a
    public void a() {
        b(this.a.l().numChildren());
    }

    public boolean e() {
        return this.a.l().numChildren() == 0;
    }

    private void j() {
        if (k()) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.f);
            com.censivn.C3DEngine.b.g.c.a(this.f, 300, dVar);
            this.f.mouseEnabled(true);
            return;
        }
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(30);
        com.censivn.C3DEngine.b.g.c.a(this.f);
        com.censivn.C3DEngine.b.g.c.a(this.f, 300, dVar2);
        this.f.mouseEnabled(false);
    }

    private boolean k() {
        int iNumChildren = this.a.l().numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            if (((com.tsf.shell.f.i.b.e.b) this.a.l().getChildAt(i)).ao()) {
                return true;
            }
        }
        return false;
    }

    public void a(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        if ((cVar.parent() instanceof com.tsf.shell.f.f.a.a) && (cVar instanceof com.tsf.shell.f.i.b.e.b)) {
            cVar.rotation().setAll(0.0f, 0.0f, 0.0f);
            cVar.ak();
            cVar.am();
            if (this.e == 0) {
                this.a.d(cVar);
            } else {
                this.a.l().addChild(cVar);
                this.b.b();
            }
            j();
            return;
        }
        if (cVar.parent() == this.a.l() && (cVar instanceof com.tsf.shell.f.i.b.e.b)) {
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) cVar;
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
        if ((cVar.parent() instanceof com.tsf.shell.f.f.a.a) && (cVar instanceof com.tsf.shell.f.i.b.d.b)) {
            ((com.tsf.shell.f.i.b.d.b) cVar).aR();
        }
    }

    public void b(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) cVar.parent();
        ArrayList<com.tsf.shell.f.i.c> arrayList = new ArrayList<>();
        if (jVar == this.a.l()) {
            if (this.e == 0) {
                Iterator<com.censivn.C3DEngine.b.f.i> it = jVar.children().iterator();
                while (it.hasNext()) {
                    com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) it.next();
                    if (bVar.ao()) {
                        arrayList.add(bVar);
                    }
                }
            } else {
                Iterator<com.censivn.C3DEngine.b.f.i> it2 = jVar.children().iterator();
                while (it2.hasNext()) {
                    arrayList.add((com.tsf.shell.f.i.b.e.b) it2.next());
                }
            }
            for (com.tsf.shell.f.i.c cVar2 : arrayList) {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(1.0f);
                dVar.m(1.0f);
                com.censivn.C3DEngine.b.g.c.a(cVar2);
                com.censivn.C3DEngine.b.g.c.a(cVar2, VEasing.Back.easeIn, dVar);
            }
            arrayList.remove(cVar);
            cVar.b(arrayList);
        }
        cVar.removeFromParent();
        this.i.a(cVar.position().x, cVar.position().y);
        com.tsf.shell.manager.a.j.a(cVar);
    }
}
