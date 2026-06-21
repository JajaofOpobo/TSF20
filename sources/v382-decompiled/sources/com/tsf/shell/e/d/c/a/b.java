package com.tsf.shell.e.d.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends d {
    private static float c = 50.0f * com.censivn.C3DEngine.b.b.a.c;
    float a;
    private boolean d;
    private boolean e;

    public b(int i, boolean z, boolean z2) {
        super(i, z2);
        this.e = false;
        this.e = z;
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        float a = com.censivn.C3DEngine.b.b.a.a(70.0f);
        float a2 = com.censivn.C3DEngine.b.b.a.a(110.0f);
        float f = a2 / 3.0f;
        float f2 = a2 / 2.0f;
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b a3 = aVar.a(i);
            x xVar = new x();
            if (i == 3) {
                xVar.a(runnable);
            }
            if (this.e) {
                xVar.b(i * 150);
            }
            xVar.l(1.0f);
            xVar.m(1.0f);
            xVar.f(a);
            xVar.h(f2);
            xVar.a(com.censivn.C3DEngine.b.g.a.e);
            w.a(a3);
            w.a(a3, 500, xVar);
            f2 -= f;
        }
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b a = aVar.a(i);
            x xVar = new x();
            xVar.l(0.0f);
            xVar.m(0.0f);
            xVar.f(0.0f);
            xVar.h(0.0f);
            if (i == 3) {
                xVar.a(runnable);
            }
            w.a(a);
            w.a(a, 500, xVar);
        }
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void a(ArrayList arrayList, float f, float f2) {
        float f3;
        ArrayList c2 = com.tsf.shell.manager.a.v.e.d().c();
        l d = com.tsf.shell.manager.a.v.e.d().d();
        int size = arrayList.size();
        float f4 = 120.0f * com.censivn.C3DEngine.b.b.a.c * (size - 1);
        if ((f4 / 2.0f) + f2 + (com.tsf.shell.manager.g.a.h / 2.0f) + c > com.censivn.C3DEngine.b.b.a.B) {
            f3 = ((com.censivn.C3DEngine.b.b.a.B - c) - (com.tsf.shell.manager.g.a.h / 2.0f)) - f2;
        } else if (((f2 - (f4 / 2.0f)) - (com.tsf.shell.manager.g.a.h / 2.0f)) - c < com.censivn.C3DEngine.b.b.a.C) {
            f3 = f4 + (((com.censivn.C3DEngine.b.b.a.C + c) + (com.tsf.shell.manager.g.a.h / 2.0f)) - f2);
        } else {
            f3 = f4 / 2.0f;
        }
        this.d = f < 0.0f;
        d.position().y = f3;
        Number3d number3d = new Number3d(f, f2, 0.0f);
        d.globalToLocal(number3d);
        this.a = number3d.y;
        for (int i = 0; i < size; i++) {
            com.tsf.shell.e.e.f.d dVar = (com.tsf.shell.e.e.f.d) c2.get(i);
            dVar.position().y = this.a;
            if (this.d) {
                dVar.d.b(1);
            } else {
                dVar.d.b(2);
            }
            a(dVar, i, i * 50, com.censivn.C3DEngine.b.g.a.e);
            dVar.calAABB(2.0f, 1.2f, 1.0f);
        }
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void a() {
        ArrayList c2 = com.tsf.shell.manager.a.v.e.d().c();
        int numChildren = com.tsf.shell.manager.a.v.e.d().d().numChildren();
        for (int i = 0; i < numChildren; i++) {
            a((com.tsf.shell.e.e.f.d) c2.get((numChildren - i) - 1), i, this.a);
        }
    }

    private float c(com.tsf.shell.e.e.f.d dVar) {
        return this.d ? (80.0f * com.censivn.C3DEngine.b.b.a.c) + (com.censivn.C3DEngine.b.b.a.c * 60.0f) : ((-80.0f) * com.censivn.C3DEngine.b.b.a.c) - (com.censivn.C3DEngine.b.b.a.c * 60.0f);
    }

    private float d(com.tsf.shell.e.e.f.d dVar) {
        return this.d ? 80.0f * com.censivn.C3DEngine.b.b.a.c : (-80.0f) * com.censivn.C3DEngine.b.b.a.c;
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void a(com.tsf.shell.e.e.f.d dVar) {
        x xVar = new x();
        xVar.f(c(dVar));
        w.a(dVar.d);
        w.a(dVar.d, 250, xVar);
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void b(com.tsf.shell.e.e.f.d dVar) {
        x xVar = new x();
        xVar.f(d(dVar));
        w.a(dVar.d);
        w.a(dVar.d, 250, xVar);
    }

    private void a(com.tsf.shell.e.e.f.d dVar, int i, int i2, v vVar) {
        dVar.scale().x = 0.0f;
        dVar.scale().y = 0.0f;
        dVar.d.position().x = d(dVar);
        x xVar = new x();
        xVar.l(1.0f);
        xVar.m(1.0f);
        if (this.d) {
            xVar.f(190.0f * com.censivn.C3DEngine.b.b.a.c);
        } else {
            xVar.f((-190.0f) * com.censivn.C3DEngine.b.b.a.c);
        }
        xVar.h((-120.0f) * com.censivn.C3DEngine.b.b.a.c * i);
        if (this.e && i2 != 0) {
            xVar.b(i2);
        }
        xVar.a(vVar);
        w.a(dVar);
        w.a(dVar, 300, xVar);
    }

    private void a(com.tsf.shell.e.e.f.d dVar, int i, float f) {
        x xVar = new x();
        xVar.l(0.0f);
        xVar.m(0.0f);
        xVar.f(0.0f);
        xVar.h(f);
        w.a(dVar);
        w.a(dVar, 300, xVar);
    }
}
