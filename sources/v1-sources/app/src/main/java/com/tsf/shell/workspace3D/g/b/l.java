package com.tsf.shell.workspace3D.g.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements i {
    private j a;
    private v b;
    private Number3d c;
    private int h;
    private int k;
    private int m;
    private int n;
    private int o;
    private int p;
    private float q;
    private float r;
    private ArrayList s;
    private int d = 1;
    private int e = 100;
    private int f = 100;
    private boolean g = false;
    private boolean i = false;
    private boolean j = false;
    private int l = 0;

    public l(j jVar) {
        this.a = jVar;
        this.c = this.a.d();
        this.b = this.a.b();
        this.a.a(this);
        this.s = new ArrayList();
        this.a.a(this.s);
        this.q = com.censivn.C3DEngine.a.o + (com.censivn.C3DEngine.a.a * 64.0f);
        this.r = ((-this.q) - (com.censivn.C3DEngine.a.a * 64.0f)) - this.f;
    }

    public final j a() {
        return this.a;
    }

    public final v b() {
        return this.a.a();
    }

    public final void c() {
        PositionNumber3d L = this.b.L();
        int i = com.censivn.C3DEngine.a.g - this.o;
        this.m = i;
        this.k = i;
        L.y = i;
        this.q = com.censivn.C3DEngine.a.o + (com.censivn.C3DEngine.a.a * 64.0f);
        this.r = ((-this.q) - (com.censivn.C3DEngine.a.a * 64.0f)) - this.f;
        this.a.a(com.tsf.shell.workspace3D.j.c, com.censivn.C3DEngine.a.m);
        f();
        e();
    }

    public final void a(int i, int i2, int i3) {
        this.d = 1;
        this.e = 0;
        this.f = i;
        this.o = i2;
        this.p = i3;
        PositionNumber3d L = this.b.L();
        int i4 = com.censivn.C3DEngine.a.g - this.o;
        this.m = i4;
        this.k = i4;
        L.y = i4;
    }

    public final void a(ArrayList arrayList, int i, boolean z) {
        a(arrayList.size());
        this.a.a(arrayList, i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            Number3d number3d = (Number3d) this.s.get(i);
            jVar.e(false);
            if (z) {
                m mVar = new m(this);
                mVar.f(number3d.x);
                mVar.h(number3d.y);
                if (jVar.N().x != 1.0f) {
                    mVar.j(1.0f);
                    mVar.k(1.0f);
                    mVar.e(0.0f);
                }
                s.a(jVar);
                s.a(jVar, 320, mVar);
            } else {
                jVar.L().x = number3d.x;
                jVar.L().y = number3d.y;
                jVar.N().x = 1.0f;
                jVar.N().y = 1.0f;
                jVar.M().z = 0.0f;
            }
            i++;
        }
        f();
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar, int i) {
        a(1);
        this.a.a(jVar, i);
        Number3d number3d = (Number3d) this.s.get(i);
        jVar.e(false);
        jVar.L().x = number3d.x;
        jVar.L().y = number3d.y;
        jVar.M().z = 0.0f;
        f();
    }

    public final void a(ArrayList arrayList, boolean z) {
        int a = a(arrayList.size());
        this.a.b(arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            int i = a;
            if (it.hasNext()) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
                Number3d number3d = (Number3d) this.s.get(i);
                jVar.e(false);
                if (z) {
                    u uVar = new u();
                    uVar.f(number3d.x);
                    uVar.h(number3d.y);
                    uVar.e(0.0f);
                    s.a(jVar);
                    s.a(jVar, 320, uVar);
                } else {
                    jVar.L().x = number3d.x;
                    jVar.L().y = number3d.y;
                    jVar.M().z = 0.0f;
                }
                a = i + 1;
            } else {
                f();
                return;
            }
        }
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar, boolean z) {
        int a = a(1);
        this.a.c(jVar);
        Number3d number3d = (Number3d) this.s.get(a);
        jVar.e(false);
        if (z) {
            u uVar = new u();
            uVar.f(number3d.x);
            uVar.h(number3d.y);
            uVar.e(0.0f);
            s.a(jVar);
            s.a(jVar, 320, uVar);
        } else {
            jVar.L().x = number3d.x;
            jVar.L().y = number3d.y;
            jVar.M().z = 0.0f;
        }
        f();
    }

    public final int a(com.tsf.shell.workspace3D.k.j jVar) {
        int d = this.a.d(jVar);
        d();
        f();
        return d;
    }

    private int a(int i) {
        int size = this.s.size();
        int i2 = size;
        for (int i3 = 0; i3 < i; i3++) {
            Number3d number3d = new Number3d();
            number3d.x = (i2 % this.d) * this.e;
            number3d.y = 0 - ((i2 / this.d) * this.f);
            number3d.z = 0.0f;
            this.s.add(number3d);
            i2++;
        }
        return size;
    }

    private void d() {
        this.s.remove(this.s.size() - 1);
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void l() {
        if ((!this.g || this.h != -1) && !this.j) {
            if (!this.j) {
                e();
            }
            if (this.h == -3) {
                if (this.k + 6 < this.l) {
                    this.k += 6;
                }
            } else if (this.h == -2 && this.k - 6 > this.m) {
                this.k -= 6;
            }
            if (this.i) {
                this.b.L().y += (this.k - this.b.L().y) * 0.5f;
                this.c.y = this.b.L().y;
                return;
            }
            this.b.L().y += (this.k - this.b.L().y) * 0.1f;
            this.c.y = this.b.L().y;
            if (this.b.L().y > this.l && this.k > this.l) {
                this.k = (int) (this.k + ((this.l - this.k) * 0.2f));
            } else if (this.b.L().y < this.m && this.k < this.m) {
                this.k = (int) (this.k + ((this.m - this.k) * 0.2f));
            }
            if (Math.abs(this.b.L().y - this.k) < 0.1d) {
                this.j = true;
                this.b.a_(false);
                this.b.L().y = this.k;
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void o() {
        this.g = true;
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void p() {
        this.g = false;
        this.h = -1;
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void m() {
        this.i = false;
        this.h = -1;
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void n() {
        this.i = false;
        this.h = -1;
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void a(MotionEvent motionEvent) {
        this.i = true;
        this.j = false;
        int i = (int) this.b.L().y;
        this.k = i;
        this.n = i;
        v vVar = this.b;
        v.u();
        this.b.a_(true);
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.k = (int) (this.n + (motionEvent.getY() - motionEvent2.getY()));
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void g(float f) {
        this.i = false;
        this.k = (int) (this.k - f);
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void a(com.tsf.shell.workspace3D.k.j jVar, Number3d number3d) {
        float f = number3d.y + this.a.b().L().y;
        if (f <= this.q && f >= this.r) {
            jVar.a((Boolean) true);
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void q() {
        a(1);
        f();
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void b(com.tsf.shell.workspace3D.k.j jVar) {
        jVar.a((Boolean) true);
        d();
        f();
    }

    private void e() {
        float f = this.b.L().y;
        Iterator it = this.b.aD().iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            float f2 = rVar.L().y + f;
            if (f2 > this.q || f2 < this.r) {
                rVar.a((Boolean) false);
            } else {
                rVar.a((Boolean) true);
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final boolean e(int i) {
        this.h = i;
        return this.h == 5 || this.h == -4;
    }

    private void f() {
        this.l = ((((this.a.j_() - 1) / this.d) * this.f) + this.p) - (com.censivn.C3DEngine.a.k / 2);
        if (this.l < this.m) {
            this.l = this.m;
        }
    }
}
