package com.tsf.shell.f.f.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f {
    public static final float a = com.censivn.C3DEngine.b.b.a.a(150.0f);
    private c b;
    private j d;
    private ArrayList<a> e;
    private com.tsf.shell.f.e.d<a> f;
    private boolean g = false;
    private int j = -1;
    private int k = -1;
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = 0.0f;
    private j c = new j() { // from class: com.tsf.shell.f.f.a.a.f.1
    };
    private ArrayList<com.tsf.shell.f.f.a.a.a.c> i = new ArrayList<>();
    private com.censivn.C3DEngine.b.f.e h = new com.censivn.C3DEngine.b.f.e(0.0f, 0.0f);

    class a {
        public Number3d a;
        public Number3d b = new Number3d();
        public Number3d c = new Number3d();
        public float d = 1.0f;

        a() {
        }
    }

    public f(c cVar) {
        this.b = cVar;
        this.h.alpha(0.0f);
        this.d = new j() { // from class: com.tsf.shell.f.f.a.a.f.2
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                int iNumChildren = numChildren();
                f.this.j();
                for (int i = 0; i < iNumChildren; i++) {
                    i childAt = getChildAt(i);
                    if (childAt.getAnimationObjectState()) {
                        a aVar = (a) f.this.e.get(i);
                        Number3d number3d = aVar.a;
                        if (!f.this.g) {
                            com.tsf.shell.f.f.a.a.a.c cVar2 = (com.tsf.shell.f.f.a.a.a.c) childAt.getTag();
                            number3d.x = cVar2.t();
                            number3d.y = cVar2.s();
                            aVar.d = 1.0f;
                        }
                        childAt.position().x += (number3d.x - childAt.position().x) * 0.26f;
                        childAt.position().y += (number3d.y - childAt.position().y) * 0.26f;
                        childAt.scale().x += (aVar.d - childAt.scale().x) * 0.26f;
                        childAt.scale().y = childAt.scale().x;
                        if (Math.abs(childAt.position().x - number3d.x) < 0.2f && Math.abs(childAt.position().y - number3d.y) < 0.2f && Math.abs(childAt.scale().x - aVar.d) < 0.01f) {
                            childAt.setAnimationObjectState(false);
                            if (!f.this.g) {
                                f.this.i.add((com.tsf.shell.f.f.a.a.a.c) childAt.getTag());
                            }
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawEnd() {
                Iterator it = f.this.i.iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.f.f.a.a.a.c) it.next()).n();
                }
                f.this.i.clear();
            }

            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public boolean removeChild(i iVar) {
                boolean zRemoveChild = super.removeChild(iVar);
                if (numChildren() == 0) {
                    f.this.i();
                }
                return zRemoveChild;
            }
        };
        this.c.addChild(this.h);
        this.c.addChild(this.d);
        this.e = new ArrayList<>();
        this.f = new com.tsf.shell.f.e.d<a>() { // from class: com.tsf.shell.f.f.a.a.f.3
            @Override // com.tsf.shell.f.e.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b() {
                return f.this.new a();
            }
        };
    }

    private void g() {
        if (this.b.b() == c.b) {
            this.h.a(-1442840576, 855638016);
        } else {
            this.h.a(855638016, -1442840576);
        }
        this.h.visible(true);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.h);
        com.censivn.C3DEngine.b.g.c.a(this.h, 600, dVar);
    }

    private void h() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.a.f.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                f.this.h.visible(false);
                f.this.i();
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.h);
        com.censivn.C3DEngine.b.g.c.a(this.h, 600, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.h.visible() && this.d.numChildren() == 0) {
            this.c.removeFromParent();
        }
    }

    public void a() {
        this.h.b(com.censivn.C3DEngine.b.b.a.G);
        this.h.a(com.censivn.C3DEngine.b.b.a.F);
    }

    public void a(MotionEvent motionEvent) {
        a(0.0f - (motionEvent.getY() - com.censivn.C3DEngine.b.b.a.I));
    }

    public void a(float f) {
        int size = this.b.h().size();
        this.j = (int) (((this.l - f) + this.n) / this.n);
        if (this.j < 0) {
            this.j = -1;
        } else if (this.j > size - 1) {
            this.j = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.g && this.k != this.j) {
            ArrayList<com.tsf.shell.f.f.a.a.a.c> arrayListH = this.b.h();
            if (this.k != -1) {
                arrayListH.get(this.k).l().setAnimationObjectState(true);
                a aVar = this.e.get(this.k);
                aVar.a = aVar.b;
                aVar.d = 0.5f;
            }
            this.k = this.j;
            if (this.k != -1) {
                com.tsf.shell.f.f.a.a.a.c cVar = arrayListH.get(this.k);
                if (this.k == 0) {
                    this.b.d();
                } else {
                    this.b.b(cVar);
                }
                cVar.l().setAnimationObjectState(true);
                a aVar2 = this.e.get(this.k);
                aVar2.a = aVar2.c;
                aVar2.d = 1.5f;
            }
        }
    }

    public float b() {
        return this.l;
    }

    public float c() {
        return this.m;
    }

    public float d() {
        int size = this.b.h().size();
        float fA = com.censivn.C3DEngine.b.b.a.a(50.0f);
        return (float) (Math.cos((3.141592653589793d - (((double) (size - 1)) * (Math.asin((fA / 2.0f) / r2) * 2.0d))) / 2.0d) * ((double) (com.censivn.C3DEngine.b.b.a.B * 2)));
    }

    public void e() {
        g();
        int iB = this.b.b();
        this.g = true;
        this.j = -1;
        this.k = -1;
        this.d.setAnimationObjectState(true);
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            this.f.a(it.next());
        }
        this.e.clear();
        ArrayList<com.tsf.shell.f.f.a.a.a.c> arrayListH = this.b.h();
        int size = arrayListH.size();
        float fA = com.censivn.C3DEngine.b.b.a.a(50.0f);
        float f = com.censivn.C3DEngine.b.b.a.B * 2;
        double dAsin = Math.asin((fA / 2.0f) / f) * 2.0d;
        double d = (3.141592653589793d - (((double) (size - 1)) * dAsin)) / 2.0d;
        float fSin = ((float) (Math.sin(d) * ((double) f))) - com.censivn.C3DEngine.b.b.a.a(50.0f);
        this.l = 0.0f;
        this.m = 0.0f;
        double d2 = d;
        for (int i = 0; i < size; i++) {
            com.tsf.shell.f.f.a.a.a.c cVar = arrayListH.get(i);
            i iVarM = cVar.m();
            a aVarC = this.f.c();
            aVarC.b.x = (((float) (Math.sin(d2) * ((double) f))) - fSin) + com.censivn.C3DEngine.b.b.a.z;
            if (iB == c.c) {
                aVarC.b.x = -aVarC.b.x;
            }
            aVarC.b.y = (float) (Math.cos(d2) * ((double) f));
            if (iB == c.c) {
                aVarC.c.x = aVarC.b.x - a;
            } else {
                aVarC.c.x = aVarC.b.x + a;
            }
            aVarC.c.y = aVarC.b.y;
            if (i == 0) {
                this.l = aVarC.b.y;
            } else if (i == size - 1) {
                this.m = aVarC.b.y;
            }
            aVarC.a = aVarC.b;
            aVarC.d = 0.5f;
            this.e.add(aVarC);
            iVarM.setAnimationObjectState(true);
            d2 += dAsin;
            this.d.addChild(iVarM);
            cVar.o();
        }
        this.n = (this.l - this.m) / (size - 1);
        this.c.removeFromParent();
        this.b.c().addChild(this.c);
    }

    public void f() {
        h();
        this.g = false;
        this.d.setAnimationObjectState(false);
        for (com.tsf.shell.f.f.a.a.a.c cVar : this.b.h()) {
            cVar.l().setAnimationObjectState(true);
            cVar.p();
        }
    }
}
