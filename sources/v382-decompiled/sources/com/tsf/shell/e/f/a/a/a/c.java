package com.tsf.shell.e.f.a.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.f.a.a.f;
import com.tsf.shell.e.i.b.e.i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends com.censivn.C3DEngine.b.b.c {
    private f a;
    private com.tsf.shell.e.f.a.a.b.b b;
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
    private l c = new l();
    private com.tsf.shell.e.f.a.a.a d = new com.tsf.shell.e.f.a.a.a();

    public c(f fVar) {
        this.a = fVar;
        this.d.position().y = -this.e;
        this.d.a(com.tsf.shell.manager.o.b.a.T, com.tsf.shell.manager.o.b.a.U);
        this.c.addChild(this.d);
        addChild(this.c);
    }

    public f h() {
        return this.a;
    }

    public l i() {
        return this.c;
    }

    public void a(com.tsf.shell.e.f.a.a.b.b bVar) {
        this.b = bVar;
        PositionNumber3d position = bVar.position();
        float f = (((-com.tsf.shell.e.f.a.a.b.b.a) / 2) - this.i) - this.e;
        this.f = f;
        position.y = f;
        this.c.addChild(bVar);
    }

    private void g() {
        float b = b();
        a(a(), 0);
        if (b != b() && parent() != null && (parent() instanceof com.censivn.C3DEngine.b.b.c)) {
            ((com.censivn.C3DEngine.b.b.c) parent()).d();
        }
    }

    public void a(i iVar) {
        this.d.addChild(iVar);
        g();
    }

    public void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.d.addChild((i) it.next());
        }
        g();
    }

    public void b(i iVar) {
        this.d.removeChild(iVar);
        g();
        if (this.d.numChildren() == 0) {
            this.a.a(this);
            this.b.b().removeFromParent();
        }
    }

    public boolean c(i iVar) {
        return this.d.children().contains(iVar);
    }

    public void j() {
        while (!this.d.children().isEmpty()) {
            this.d.removeChildAt(this.d.numChildren() - 1);
        }
    }

    public int k() {
        return this.d.a();
    }

    public j l() {
        return this.b.b();
    }

    public j m() {
        Number3d.TEMPNUMBER3D.reset();
        j b = this.b.b();
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
        j b = this.b.b();
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
        this.d.position().y = (-this.e) - f.a;
        x xVar = new x();
        xVar.a(255);
        xVar.h(-this.e);
        xVar.a(com.censivn.C3DEngine.b.g.a.n);
        w.a(this.d);
        w.a(this.d, 750, xVar);
    }

    public void a(int i, boolean z) {
        this.k = i;
        if (this.b != null) {
            float r = r();
            w.a(this.b);
            if (z) {
                x xVar = new x();
                xVar.f(r);
                xVar.a(com.censivn.C3DEngine.b.g.a.n);
                w.a(this.b, 500, xVar);
            } else {
                this.b.position().x = r;
            }
        }
        float v = v();
        w.a(this.d);
        if (z) {
            x xVar2 = new x();
            xVar2.f(v);
            xVar2.a(com.censivn.C3DEngine.b.g.a.n);
            w.a(this.d, 500, xVar2);
            return;
        }
        this.d.position().x = v;
    }

    public int q() {
        return this.k;
    }

    public float r() {
        float a = a();
        if (this.k == f.b) {
            return ((-a) / 2.0f) + (com.tsf.shell.e.f.a.a.b.b.a / 2);
        }
        return (a / 2.0f) - (com.tsf.shell.e.f.a.a.b.b.a / 2);
    }

    private float v() {
        float a = a();
        if (this.k == f.b) {
            return ((-a) / 2.0f) + com.tsf.shell.e.f.a.a.b.b.a + this.j;
        }
        return ((-a) / 2.0f) + this.j;
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        this.b.position().x = r();
        this.d.position().x = v();
        this.d.onMeasure((int) ((i - com.tsf.shell.e.f.a.a.b.b.a) - this.j), 0);
        int maxY = (int) ((this.d.maxY() - this.d.minY()) + this.e + this.e);
        this.g = (-maxY) + this.e;
        this.h = this.f - this.g;
        d(maxY);
    }

    @Override // com.censivn.C3DEngine.b.f.j
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
        float f = Number3d.TEMPNUMBER3D.y + this.f + (com.tsf.shell.e.f.a.a.b.b.a / 2);
        if (f <= com.censivn.C3DEngine.b.b.a.B) {
            return 0.0f;
        }
        return com.censivn.C3DEngine.b.b.a.B - f;
    }

    public void f() {
        this.b.position().y = this.f;
    }
}
