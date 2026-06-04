package com.tsf.shell.workspace3D.h.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements l {
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static ArrayList e;
    private static double f;
    private static double g;
    private static float h;
    private static float i;
    private static double j = 3.141592653589793d;
    private static ArrayList k;
    private static e l;
    private com.tsf.shell.workspace3D.h.a.e m;
    private boolean n = false;
    private int o = 1;
    private int p = 2;
    private int q = 3;
    private int r = this.q;
    private int s = this.p;
    private boolean u = true;
    private ArrayList t = new ArrayList();

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(int i2, int i3, int i4, ArrayList arrayList) {
        d dVar;
        if (l == null) {
            l = new e(this);
        }
        a = i2;
        k = arrayList;
        b = arrayList.size();
        c = i4;
        if (e == null) {
            e = new ArrayList();
        }
        d = a / 2;
        f = 3.141592653589793d / c;
        h = 180 / c;
        g = f / 2.0d;
        i = h / 2.0f;
        int size = e.size();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < b) {
                if (i6 < size) {
                    dVar = (d) e.get(i6);
                } else {
                    dVar = new d(this);
                    e.add(dVar);
                }
                int i7 = (c - 1) - (i6 % c);
                dVar.a = (float) (Math.cos((i7 * f) + g) * d);
                dVar.b = (float) (Math.sin((i7 * f) + g) * d);
                dVar.c = 90.0f - ((i7 * h) + i);
                i5 = i6 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(com.tsf.shell.workspace3D.h.a.e eVar) {
        this.m = eVar;
        this.m.g(false);
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final l a() {
        return new a();
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void b() {
        int aB = this.m.aB();
        this.m.g(true);
        for (int i2 = 0; i2 < aB; i2++) {
            v vVar = (v) this.m.d(i2);
            Number3d number3d = (Number3d) k.get(i2);
            vVar.L().x = number3d.x;
            vVar.L().z = number3d.z;
            vVar.M().y = 0.0f;
            vVar.d(0).b(false);
        }
        this.m.L().z = 0.0f;
        this.m.M().y = 0.0f;
        this.m = null;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(float f2) {
        float abs = Math.abs(f2);
        int aB = this.m.aB();
        this.m.M().y = f2 * 180.0f;
        if (aB == 0) {
            return;
        }
        if (f2 == 0.0f && !this.m.m()) {
            this.u = true;
            this.r = this.q;
            this.s = this.p;
            int aB2 = this.m.aB();
            if (aB2 != 0) {
                int i2 = 0;
                while (i2 < aB2) {
                    v vVar = (v) this.m.d(i2);
                    Number3d number3d = (Number3d) (i2 >= b ? k.get(b - 1) : k.get(i2));
                    vVar.L().x = number3d.x;
                    vVar.L().z = number3d.z;
                    vVar.M().y = 0.0f;
                    vVar.d(0).b(255.0f);
                    i2++;
                }
                this.m.L().z = 0.0f;
                return;
            }
            return;
        }
        if (this.s == this.p && !this.m.m()) {
            this.u = false;
            this.r = this.q;
            this.s = this.o;
            int aB3 = this.m.aB();
            int i3 = 0;
            while (i3 < aB3) {
                v vVar2 = (v) this.m.d(i3);
                d dVar = (d) (i3 >= b ? e.get(b - 1) : e.get(i3));
                vVar2.L().x = dVar.a;
                vVar2.L().z = dVar.b;
                vVar2.M().y = dVar.c;
                i3++;
            }
            this.m.L().z = -d;
        }
        if (abs < 0.01d && this.n) {
            this.n = false;
            int aB4 = this.m.aB();
            if ((this.m.d(0).M().y != 0.0f || this.r == this.o) && this.r != this.p) {
                this.r = this.p;
                this.s = this.p;
                int i4 = 0;
                while (i4 < aB4) {
                    v vVar3 = (v) this.m.d(i4);
                    Number3d number3d2 = (Number3d) (i4 >= b ? k.get(b - 1) : k.get(i4));
                    u uVar = new u();
                    uVar.f(number3d2.x);
                    uVar.h(number3d2.y);
                    uVar.i(number3d2.z);
                    uVar.d(0.0f);
                    s.a(vVar3);
                    s.a(vVar3, 150, uVar);
                    i4++;
                }
                c cVar = new c(this);
                cVar.i(0.0f);
                s.a(this.m);
                s.a(this.m, 150, cVar);
            }
        }
        for (int i5 = 0; i5 < aB; i5++) {
            v vVar4 = (v) this.m.d(i5);
            vVar4.d(0).b(true);
            float f3 = ((double) abs) > 0.8d ? (1.0f - abs) / 0.2f : 1.0f;
            float f4 = this.m.M().y + vVar4.M().y;
            if (f4 < -180.0f) {
                f4 += 360.0f;
            } else if (f4 > 180.0f) {
                f4 -= 360.0f;
            }
            float abs2 = Math.abs(f4);
            vVar4.a(Float.valueOf(abs2));
            vVar4.d(0).b((int) (f3 * (((abs2 > 90.0f ? (180.0f - abs2) / 90.0f : 1.0f) * 0.5f) + 0.5f) * 255.0f));
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void c() {
        h();
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void d() {
        this.n = true;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void e() {
        h();
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(v vVar) {
        Iterator it = vVar.aD().iterator();
        while (it.hasNext()) {
            v vVar2 = (v) ((r) it.next());
            if (vVar2.A()) {
                ArrayList aD = vVar2.aD();
                float f2 = vVar2.M().y;
                Iterator it2 = aD.iterator();
                while (it2.hasNext()) {
                    this.t.add((r) it2.next());
                }
            }
        }
        if (!this.u) {
            Collections.sort(this.t, l);
        }
        v bB = bf.j().p().bB();
        MatrixStack.glPushMatrix();
        MatrixStack.glTranslatef(0.0f, 0.0f, -d);
        MatrixStack.glRotatef(bB.M().x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glTranslatef(0.0f, 0.0f, d);
        Iterator it3 = this.t.iterator();
        while (it3.hasNext()) {
            r rVar = (r) it3.next();
            r rVar2 = (r) rVar.P();
            MatrixStack.glPushMatrix();
            MatrixStack.glTranslatef(rVar2.L().x, rVar2.L().y, rVar2.L().z);
            MatrixStack.glRotatef(rVar2.M().y, 0.0f, 1.0f, 0.0f);
            rVar.f();
            MatrixStack.glPopMatrix();
        }
        MatrixStack.glPopMatrix();
        this.t.clear();
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void f() {
        if (this.r != this.q) {
            int aB = this.m.aB();
            for (int i2 = 0; i2 < aB; i2++) {
                s.b((v) this.m.d(i2));
            }
            s.b(this.m);
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void g() {
        if (this.r != this.q) {
            int aB = this.m.aB();
            for (int i2 = 0; i2 < aB; i2++) {
                s.c((v) this.m.d(i2));
            }
            s.c(this.m);
        }
    }

    private void h() {
        Object obj;
        this.u = false;
        this.n = false;
        int aB = this.m.aB();
        if (aB == 0) {
            return;
        }
        if ((this.m.d(0).M().y != ((d) e.get(0)).c || this.r == this.p) && this.r != this.o) {
            this.r = this.o;
            this.s = this.o;
            for (int i2 = 0; i2 < aB; i2++) {
                v vVar = (v) this.m.d(i2);
                if (i2 >= b) {
                    obj = e.get(b - 1);
                } else {
                    obj = e.get(i2);
                }
                d dVar = (d) obj;
                u uVar = new u();
                uVar.f(dVar.a);
                uVar.i(dVar.b);
                uVar.d(dVar.c);
                s.a(vVar);
                s.a(vVar, 150, uVar);
            }
            b bVar = new b(this);
            bVar.i(-d);
            s.a(this.m);
            s.a(this.m, 150, bVar);
        }
    }
}
