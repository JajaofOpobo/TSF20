package com.tsf.shell.workspace3D.k.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class am extends com.censivn.C3DEngine.b.v implements com.tsf.shell.workspace3D.g.b.j {
    final /* synthetic */ ai A;
    private ArrayList B;
    private com.tsf.shell.workspace3D.g.b.i E;
    private an F;
    private com.censivn.C3DEngine.b.v a;
    private int C = 0;
    private Number3d D = new Number3d();
    private int G = com.censivn.C3DEngine.a.g;
    private int H = com.censivn.C3DEngine.a.h;
    private int I = com.censivn.C3DEngine.a.e;
    private int J = com.censivn.C3DEngine.a.f;
    private boolean K = false;

    public am(ai aiVar) {
        this.A = aiVar;
        this.F = new an(aiVar, this);
        a((com.censivn.C3DEngine.b.l) this.F);
        this.a = new com.censivn.C3DEngine.b.v();
        d(this.a);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final com.censivn.C3DEngine.b.v a() {
        return this;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        this.E.l();
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(com.tsf.shell.workspace3D.g.b.i iVar) {
        this.E = iVar;
        this.F.a(this);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a_(int i, int i2, int i3, int i4) {
        this.G = i;
        this.H = i2;
        this.I = i3;
        this.J = i4;
        this.K = true;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(ArrayList arrayList) {
        this.B = arrayList;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final com.censivn.C3DEngine.b.v b() {
        return this.a;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            jVar.e(false);
            jVar.h(this.C);
            a(jVar);
            this.a.d(jVar);
            this.C++;
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void c(com.tsf.shell.workspace3D.k.j jVar) {
        jVar.e(false);
        jVar.h(this.C);
        a(jVar);
        this.a.d(jVar);
        this.C++;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        int i2 = i;
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            jVar.e(false);
            jVar.h(i2);
            this.a.a(jVar, i2);
            this.C++;
            i2++;
        }
        a(i);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(com.tsf.shell.workspace3D.k.j jVar, int i) {
        jVar.e(false);
        jVar.h(i);
        this.a.a(jVar, i);
        this.C++;
        a(i);
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final int d(com.tsf.shell.workspace3D.k.j jVar) {
        this.C--;
        this.a.e(jVar);
        int bd = jVar.bd();
        a(bd);
        return bd;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final int j_() {
        return this.C;
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final Number3d d() {
        return this.D;
    }

    private void a(int i) {
        while (i < this.C) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) this.a.aD().get(i);
            jVar.h(i);
            a(jVar);
            i++;
        }
        com.censivn.C3DEngine.a.d().g();
    }

    private void a(com.tsf.shell.workspace3D.k.j jVar) {
        jVar.L().setAllFrom((Number3d) this.B.get(jVar.bd()));
    }

    @Override // com.tsf.shell.workspace3D.g.b.j
    public final void a(int i, int i2) {
        b(-r0, -r5, 0.0f, i / 2, i2 / 2);
    }

    public final com.tsf.shell.workspace3D.g.b.i i() {
        return this.E;
    }

    public final boolean a(float f, float f2) {
        float[] b = com.censivn.C3DEngine.h.a.b(f, f2);
        float f3 = b[0];
        float f4 = b[1];
        float f5 = this.D.x;
        float f6 = this.D.y;
        if (this.K) {
            if (f3 > this.J) {
                return this.E.e(5);
            }
            if (f3 < this.I) {
                return this.E.e(-4);
            }
            if (f4 > this.G) {
                return this.E.e(-2);
            }
            if (f4 < this.H) {
                return this.E.e(-3);
            }
        }
        this.E.e(-1);
        return false;
    }

    public void a(com.tsf.shell.workspace3D.k.j jVar, float f, float f2) {
        this.E.b(jVar);
    }

    public void a(com.tsf.shell.workspace3D.k.al alVar) {
    }

    public final com.censivn.C3DEngine.b.r a(MotionEvent motionEvent) {
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        float f = a[0];
        float f2 = a[1];
        Iterator it = this.a.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar.b(f, f2)) {
                return rVar;
            }
        }
        return null;
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void H() {
        this.B.clear();
        this.E = null;
        this.D = null;
        super.H();
    }
}
