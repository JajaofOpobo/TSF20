package com.tsf.shell.e.f.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j {
    public static final float a = com.censivn.C3DEngine.b.b.a.a(150.0f);
    private f b;
    private l d;
    private ArrayList e;
    private com.tsf.shell.e.e.e f;
    private boolean g = false;
    private int j = -1;
    private int k = -1;
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = 0.0f;
    private l c = new l() { // from class: com.tsf.shell.e.f.a.a.j.1
    };
    private ArrayList i = new ArrayList();
    private com.censivn.C3DEngine.b.f.f h = new com.censivn.C3DEngine.b.f.f(0.0f, 0.0f);

    public j(f fVar) {
        this.b = fVar;
        this.h.alpha(0.0f);
        this.d = new l() { // from class: com.tsf.shell.e.f.a.a.j.2
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                int numChildren = numChildren();
                j.this.j();
                for (int i = 0; i < numChildren; i++) {
                    com.censivn.C3DEngine.b.f.j childAt = getChildAt(i);
                    if (childAt.getAnimationObjectState()) {
                        k kVar = (k) j.this.e.get(i);
                        Number3d number3d = kVar.a;
                        if (!j.this.g) {
                            com.tsf.shell.e.f.a.a.a.c cVar = (com.tsf.shell.e.f.a.a.a.c) childAt.getTag();
                            number3d.x = cVar.t();
                            number3d.y = cVar.s();
                            kVar.d = 1.0f;
                        }
                        childAt.position().x += (number3d.x - childAt.position().x) * 0.26f;
                        childAt.position().y += (number3d.y - childAt.position().y) * 0.26f;
                        childAt.scale().x += (kVar.d - childAt.scale().x) * 0.26f;
                        childAt.scale().y = childAt.scale().x;
                        if (Math.abs(childAt.position().x - number3d.x) < 0.2f && Math.abs(childAt.position().y - number3d.y) < 0.2f && Math.abs(childAt.scale().x - kVar.d) < 0.01f) {
                            childAt.setAnimationObjectState(false);
                            if (!j.this.g) {
                                j.this.i.add((com.tsf.shell.e.f.a.a.a.c) childAt.getTag());
                            }
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                Iterator it = j.this.i.iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.e.f.a.a.a.c) it.next()).n();
                }
                j.this.i.clear();
            }

            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
            public boolean removeChild(com.censivn.C3DEngine.b.f.j jVar) {
                boolean removeChild = super.removeChild(jVar);
                if (numChildren() == 0) {
                    j.this.i();
                }
                return removeChild;
            }
        };
        this.c.addChild(this.h);
        this.c.addChild(this.d);
        this.e = new ArrayList();
        this.f = new com.tsf.shell.e.e.e() { // from class: com.tsf.shell.e.f.a.a.j.3
            @Override // com.tsf.shell.e.e.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k b() {
                return new k(j.this);
            }
        };
    }

    private void g() {
        if (this.b.b() == f.b) {
            this.h.a(-1442840576, 855638016);
        } else {
            this.h.a(855638016, -1442840576);
        }
        this.h.visible(true);
        x xVar = new x();
        xVar.a(255);
        w.a(this.h);
        w.a(this.h, 600, xVar);
    }

    private void h() {
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.a.j.4
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                j.this.h.visible(false);
                j.this.i();
            }
        };
        xVar.a(0);
        w.a(this.h);
        w.a(this.h, 600, xVar);
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
            ArrayList h = this.b.h();
            if (this.k != -1) {
                ((com.tsf.shell.e.f.a.a.a.c) h.get(this.k)).l().setAnimationObjectState(true);
                k kVar = (k) this.e.get(this.k);
                kVar.a = kVar.b;
                kVar.d = 0.5f;
            }
            this.k = this.j;
            if (this.k != -1) {
                com.tsf.shell.e.f.a.a.a.c cVar = (com.tsf.shell.e.f.a.a.a.c) h.get(this.k);
                if (this.k == 0) {
                    this.b.d();
                } else {
                    this.b.b(cVar);
                }
                cVar.l().setAnimationObjectState(true);
                k kVar2 = (k) this.e.get(this.k);
                kVar2.a = kVar2.c;
                kVar2.d = 1.5f;
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
        float a2 = com.censivn.C3DEngine.b.b.a.a(50.0f);
        return (float) (Math.cos((3.141592653589793d - ((size - 1) * (Math.asin((a2 / 2.0f) / r2) * 2.0d))) / 2.0d) * com.censivn.C3DEngine.b.b.a.B * 2);
    }

    public void e() {
        g();
        int b = this.b.b();
        this.g = true;
        this.j = -1;
        this.k = -1;
        this.d.setAnimationObjectState(true);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            this.f.a((k) it.next());
        }
        this.e.clear();
        ArrayList h = this.b.h();
        int size = h.size();
        float a2 = com.censivn.C3DEngine.b.b.a.a(50.0f);
        float f = com.censivn.C3DEngine.b.b.a.B * 2;
        double asin = Math.asin((a2 / 2.0f) / f) * 2.0d;
        double d = (3.141592653589793d - ((size - 1) * asin)) / 2.0d;
        float sin = ((float) (Math.sin(d) * f)) - com.censivn.C3DEngine.b.b.a.a(50.0f);
        this.l = 0.0f;
        this.m = 0.0f;
        double d2 = d;
        for (int i = 0; i < size; i++) {
            com.tsf.shell.e.f.a.a.a.c cVar = (com.tsf.shell.e.f.a.a.a.c) h.get(i);
            com.censivn.C3DEngine.b.f.j m = cVar.m();
            k kVar = (k) this.f.c();
            kVar.b.x = (((float) (Math.sin(d2) * f)) - sin) + com.censivn.C3DEngine.b.b.a.z;
            if (b == f.c) {
                kVar.b.x = -kVar.b.x;
            }
            kVar.b.y = (float) (Math.cos(d2) * f);
            if (b == f.c) {
                kVar.c.x = kVar.b.x - a;
            } else {
                kVar.c.x = kVar.b.x + a;
            }
            kVar.c.y = kVar.b.y;
            if (i == 0) {
                this.l = kVar.b.y;
            } else if (i == size - 1) {
                this.m = kVar.b.y;
            }
            kVar.a = kVar.b;
            kVar.d = 0.5f;
            this.e.add(kVar);
            m.setAnimationObjectState(true);
            d2 += asin;
            this.d.addChild(m);
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
        Iterator it = this.b.h().iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.f.a.a.a.c cVar = (com.tsf.shell.e.f.a.a.a.c) it.next();
            cVar.l().setAnimationObjectState(true);
            cVar.p();
        }
    }
}
