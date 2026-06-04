package com.tsf.shell.workspace3D.g.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class k extends v implements j {
    private ArrayList A;
    private i C;
    private v a;
    private Number3d B = new Number3d();
    private int E = com.censivn.C3DEngine.a.g;
    private int F = com.censivn.C3DEngine.a.h;
    private int G = com.censivn.C3DEngine.a.e;
    private int H = com.censivn.C3DEngine.a.f;
    private boolean I = false;
    private a D = new a(this);

    public boolean h(boolean z) {
        return true;
    }

    public k(com.tsf.shell.workspace3D.g.c.o oVar) {
        a((com.censivn.C3DEngine.b.l) this.D);
        this.a = oVar;
        d(this.a);
    }

    public k() {
        a((com.censivn.C3DEngine.b.l) this.D);
        this.a = new v();
        d(this.a);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        this.C.l();
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(i iVar) {
        this.C = iVar;
        this.D.a(this);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final v a() {
        return this;
    }

    public final i i() {
        return this.C;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final v b() {
        return this.a;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a_(int i, int i2, int i3, int i4) {
        this.E = i;
        this.F = i2;
        this.G = i3;
        this.H = i4;
        this.I = true;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(int i, int i2) {
        b(-r0, -r5, 0.0f, i / 2, i2 / 2);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(ArrayList arrayList) {
        this.A = arrayList;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.aD().iterator();
        while (it.hasNext()) {
            arrayList.add((r) it.next());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void H() {
        if (this.A != null) {
            this.A.clear();
        }
        this.C = null;
        this.B = null;
        super.H();
    }

    public final void b(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        int i2 = i;
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            jVar.e(false);
            jVar.Q();
            this.a.a(jVar, i2);
            jVar.h(i2);
            this.C.q();
            i2++;
        }
        e(i);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        int i2 = i;
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            jVar.e(false);
            this.a.d(jVar.L());
            jVar.Q();
            this.a.a(jVar, i2);
            jVar.h(i2);
            i2++;
        }
        e(i);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(com.tsf.shell.workspace3D.k.j jVar, int i) {
        jVar.e(false);
        this.a.d(jVar.L());
        jVar.Q();
        this.a.a(jVar, i);
        jVar.h(i);
        e(i);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c((com.tsf.shell.workspace3D.k.j) it.next());
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void c(com.tsf.shell.workspace3D.k.j jVar) {
        jVar.e(false);
        if (jVar.P() != null) {
            this.a.d(jVar.L());
            jVar.Q();
        }
        this.a.d(jVar);
        jVar.h(this.a.aB() - 1);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final int d(com.tsf.shell.workspace3D.k.j jVar) {
        int bd = jVar.bd();
        this.a.e(jVar);
        e(bd);
        return bd;
    }

    public final Number3d a(int i) {
        return (Number3d) this.A.get(i);
    }

    public final boolean a(com.tsf.shell.workspace3D.k.j jVar, float f, float f2) {
        return a(jVar, f, f2, false);
    }

    public final boolean a(com.tsf.shell.workspace3D.k.j jVar, float f, float f2, boolean z) {
        int bd = jVar.bd();
        float[] b = com.censivn.C3DEngine.h.a.b(f, f2);
        float f3 = b[0];
        float f4 = b[1];
        float f5 = f3 - this.B.x;
        float f6 = f4 - this.B.y;
        if (this.I) {
            if (f3 > this.H) {
                return this.C.e(5);
            }
            if (f3 < this.G) {
                return this.C.e(-4);
            }
            if (!z) {
                if (f4 > this.E) {
                    return this.C.e(-2);
                }
                if (f4 < this.F) {
                    return this.C.e(-3);
                }
            }
        }
        int size = this.a.aD().size() + 1;
        for (int i = 0; i < size; i++) {
            Number3d number3d = (Number3d) this.A.get(i);
            if (f5 > number3d.x - 64.0f && f5 < number3d.x + 64.0f && f6 > number3d.y - 64.0f && f6 < number3d.y + 64.0f && bd != i) {
                b(jVar, i);
                return false;
            }
        }
        this.C.e(-1);
        return false;
    }

    public int a(float f, float f2) {
        float f3 = f - this.B.x;
        float f4 = f2 - this.B.y;
        int size = this.a.aD().size();
        for (int i = 0; i < size; i++) {
            Number3d number3d = (Number3d) this.A.get(i);
            if (f3 > number3d.x - 64.0f && f3 < number3d.x + 64.0f && f4 > number3d.y - 64.0f && f4 < number3d.y + 64.0f) {
                return i;
            }
        }
        return -1;
    }

    public final void b(com.tsf.shell.workspace3D.k.j jVar, int i) {
        int bd = jVar.bd();
        int min = Math.min(bd, i);
        int abs = Math.abs(bd - i);
        jVar.h(i);
        int i2 = bd > i ? 1 : 0;
        for (int i3 = min; i3 < min + abs; i3++) {
            com.tsf.shell.workspace3D.k.j jVar2 = (com.tsf.shell.workspace3D.k.j) this.a.aD().get(i3);
            jVar2.h(i3 + i2);
            e(jVar2);
        }
    }

    static void k() {
    }

    final void a(int i, r rVar) {
        int size = this.a.aD().size();
        while (i < size) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) this.a.aD().get(i);
            jVar.h(i);
            if (rVar != jVar) {
                e(jVar);
            }
            i++;
        }
    }

    private void e(int i) {
        int size = this.a.aD().size();
        while (i < size) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) this.a.aD().get(i);
            jVar.h(i);
            e(jVar);
            i++;
        }
    }

    private void e(com.tsf.shell.workspace3D.k.j jVar) {
        Number3d a = a(jVar.bd());
        this.C.a(jVar, a);
        if (jVar.A()) {
            u uVar = new u();
            uVar.f(a.x);
            uVar.h(a.y);
            s.a(jVar);
            s.a(jVar, 300, uVar);
            return;
        }
        jVar.L().x = a.x;
        jVar.L().y = a.y;
    }

    public final void l() {
        m();
        this.C.o();
    }

    public final void m() {
        this.B.x = 0.0f;
        this.B.y = 0.0f;
        this.B.z = 0.0f;
        this.a.c(this.B);
    }

    public void b(MotionEvent motionEvent) {
    }

    public void a(MotionEvent motionEvent) {
    }

    public void d(MotionEvent motionEvent) {
    }

    public void c(MotionEvent motionEvent) {
    }

    public void b(com.tsf.shell.workspace3D.k.j jVar) {
        this.C.p();
    }

    public boolean a(com.tsf.shell.workspace3D.k.j jVar) {
        d(jVar);
        this.C.b(jVar);
        return true;
    }

    public final com.tsf.shell.workspace3D.k.j e(MotionEvent motionEvent) {
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        float f = a[0];
        float f2 = a[1];
        Iterator it = this.a.aD().iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar.b(f, f2)) {
                return (com.tsf.shell.workspace3D.k.j) rVar;
            }
        }
        return null;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final int j_() {
        return this.a.aD().size();
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final Number3d d() {
        return this.B;
    }
}
