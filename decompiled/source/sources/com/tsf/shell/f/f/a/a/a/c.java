package com.tsf.shell.f.f.a.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.shell.f.i.b.e.g;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends com.censivn.C3DEngine.b.b.c {
    private com.tsf.shell.f.f.a.a.c a;
    private com.tsf.shell.f.f.a.a.b.b b;
    private float f;
    private float g;
    private float h;
    private int k;
    private float n;
    private float i = com.censivn.C3DEngine.b.b.a.a(20.0f);
    private float j = com.censivn.C3DEngine.b.b.a.a(20.0f);
    private boolean l = false;
    private boolean m = false;
    private float e = com.censivn.C3DEngine.b.b.a.a(50.0f);
    private j c = new j();
    private com.tsf.shell.f.f.a.a.a d = new com.tsf.shell.f.f.a.a.a();

    public c(com.tsf.shell.f.f.a.a.c cVar) {
        this.a = cVar;
        this.d.position().y = -this.e;
        this.d.a(com.tsf.shell.manager.o.b.a.T, com.tsf.shell.manager.o.b.a.U);
        this.c.addChild(this.d);
        addChild(this.c);
    }

    public com.tsf.shell.f.f.a.a.c h() {
        return this.a;
    }

    public j i() {
        return this.c;
    }

    public void a(com.tsf.shell.f.f.a.a.b.b bVar) {
        this.b = bVar;
        PositionNumber3d position = bVar.position();
        float f = (((-com.tsf.shell.f.f.a.a.b.b.a) / 2) - this.i) - this.e;
        this.f = f;
        position.y = f;
        this.c.addChild(bVar);
    }

    private void g() {
        a(a(), 0);
        if (b() != b() && parent() != null && (parent() instanceof com.censivn.C3DEngine.b.b.c)) {
            ((com.censivn.C3DEngine.b.b.c) parent()).d();
        }
    }

    public void a(g gVar) {
        this.d.addChild(gVar);
        g();
    }

    public void a(ArrayList<g> arrayList) {
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            this.d.addChild(it.next());
        }
        g();
    }

    public void b(g gVar) {
        this.d.removeChild(gVar);
        g();
        if (this.d.numChildren() == 0) {
            this.a.a(this);
            this.b.b().removeFromParent();
        }
    }

    public boolean c(g gVar) {
        return this.d.children().contains(gVar);
    }

    public void j() {
        while (!this.d.children().isEmpty()) {
            this.d.removeChildAt(this.d.numChildren() - 1);
        }
    }

    public int k() {
        return this.d.a();
    }

    public i l() {
        return this.b.b();
    }

    public i m() {
        Number3d.TEMPNUMBER3D.reset();
        i b = this.b.b();
        if (b.parent() == this.b) {
            b.localToGlobal(Number3d.TEMPNUMBER3D);
            b.removeFromParent();
            b.position().setAllFrom(Number3d.TEMPNUMBER3D);
        } else {
            b.removeFromParent();
        }
        return b;
    }

    public void n() {
        i b = this.b.b();
        Number3d.TEMPNUMBER3D.setAllFrom(b.position());
        this.b.globalToLocal(Number3d.TEMPNUMBER3D);
        b.removeFromParent();
        this.b.addChild(b);
        b.position().setAllFrom(Number3d.TEMPNUMBER3D);
    }

    public void o() {
        this.l = true;
        this.m = true;
    }

    public void p() {
        this.l = false;
    }

    public void e() {
        this.m = true;
        this.b.d();
        this.d.alpha(0.0f);
        this.d.position().y = (-this.e) - com.tsf.shell.f.f.a.a.c.a;
        d dVar = new d();
        dVar.a(255);
        dVar.h(-this.e);
        dVar.a(com.censivn.C3DEngine.b.g.a.n);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 750, dVar);
    }

    public void a(int i, boolean z) {
        this.k = i;
        if (this.b != null) {
            float r = r();
            com.censivn.C3DEngine.b.g.c.a(this.b);
            if (z) {
                d dVar = new d();
                dVar.f(r);
                dVar.a(com.censivn.C3DEngine.b.g.a.n);
                com.censivn.C3DEngine.b.g.c.a(this.b, 500, dVar);
            } else {
                this.b.position().x = r;
            }
        }
        float v = v();
        com.censivn.C3DEngine.b.g.c.a(this.d);
        if (z) {
            d dVar2 = new d();
            dVar2.f(v);
            dVar2.a(com.censivn.C3DEngine.b.g.a.n);
            com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar2);
            return;
        }
        this.d.position().x = v;
    }

    public int q() {
        return this.k;
    }

    public float r() {
        float a = a();
        if (this.k == com.tsf.shell.f.f.a.a.c.b) {
            return ((-a) / 2.0f) + (com.tsf.shell.f.f.a.a.b.b.a / 2);
        }
        return (a / 2.0f) - (com.tsf.shell.f.f.a.a.b.b.a / 2);
    }

    private float v() {
        float a = a();
        if (this.k == com.tsf.shell.f.f.a.a.c.b) {
            return ((-a) / 2.0f) + com.tsf.shell.f.f.a.a.b.b.a + this.j;
        }
        return ((-a) / 2.0f) + this.j;
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        this.b.position().x = r();
        this.d.position().x = v();
        this.d.onMeasure((int) ((i - com.tsf.shell.f.f.a.a.b.b.a) - this.j), 0);
        int maxY = (int) ((this.d.maxY() - this.d.minY()) + this.e + this.e);
        this.g = (-maxY) + this.e;
        this.h = this.f - this.g;
        d(maxY);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        float f;
        super.onDrawStart();
        float u = u();
        if (this.m) {
            float c = this.b.c();
            if (this.l) {
                f = 0.0f;
            } else {
                f = this.h + u;
            }
            if (Math.abs(f - c) < 0.1f) {
                this.b.a(f);
                if (!this.l) {
                    this.m = false;
                }
            } else {
                this.b.a(((f - c) * 0.2f) + c);
            }
        } else {
            this.b.a(this.h + u);
        }
        this.b.position().y = u + this.f;
        if (this.b.position().y < this.g) {
            this.b.position().y = this.g;
        }
    }

    public float s() {
        Number3d.TEMPNUMBER3D.reset();
        localToGlobal(Number3d.TEMPNUMBER3D);
        this.n = Number3d.TEMPNUMBER3D.y;
        return this.b.position().y + this.n;
    }

    public float t() {
        return this.b.position().x;
    }

    public float u() {
        Number3d.TEMPNUMBER3D.reset();
        localToGlobal(Number3d.TEMPNUMBER3D);
        this.n = Number3d.TEMPNUMBER3D.y;
        float f = Number3d.TEMPNUMBER3D.y + this.f + (com.tsf.shell.f.f.a.a.b.b.a / 2);
        if (f <= com.censivn.C3DEngine.b.b.a.B) {
            return 0.0f;
        }
        return com.censivn.C3DEngine.b.b.a.B - f;
    }

    public void f() {
        this.b.position().y = this.f;
    }
}
