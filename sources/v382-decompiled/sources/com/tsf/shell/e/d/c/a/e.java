package com.tsf.shell.e.d.c.a;

import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends d {
    private static float a = 50.0f * com.censivn.C3DEngine.b.b.a.c;
    private boolean c;
    private boolean d;

    public e(int i, boolean z, boolean z2) {
        super(i, z2);
        this.d = false;
        this.d = z;
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        float a2 = com.censivn.C3DEngine.b.b.a.a(70.0f);
        float a3 = com.censivn.C3DEngine.b.b.a.a(110.0f);
        float f = a3 / 3.0f;
        float f2 = a3 / 2.0f;
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b a4 = aVar.a(i);
            a4.i().x = a2;
            a4.i().y = f2;
            f2 -= f;
            x xVar = new x();
            if (i == 3) {
                xVar.a(runnable);
            }
            if (this.d) {
                xVar.b(i * 150);
            }
            xVar.l(1.0f);
            xVar.m(1.0f);
            xVar.a(com.censivn.C3DEngine.b.g.a.e);
            w.a(a4);
            w.a(a4, 500, xVar);
        }
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i);
            x xVar = new x();
            xVar.l(0.0f);
            xVar.m(0.0f);
            if (i == 3) {
                xVar.a(runnable);
            }
            w.a(a2);
            w.a(a2, 500, xVar);
        }
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void a(ArrayList arrayList, float f, float f2) {
        float f3;
        ArrayList c = com.tsf.shell.manager.a.v.e.d().c();
        l d = com.tsf.shell.manager.a.v.e.d().d();
        int size = arrayList.size();
        float f4 = 120.0f * com.censivn.C3DEngine.b.b.a.c * (size - 1);
        if ((f4 / 2.0f) + f2 + (com.tsf.shell.manager.g.a.h / 2.0f) + a > com.censivn.C3DEngine.b.b.a.B) {
            f3 = ((com.censivn.C3DEngine.b.b.a.B - a) - (com.tsf.shell.manager.g.a.h / 2.0f)) - f2;
        } else if (((f2 - (f4 / 2.0f)) - (com.tsf.shell.manager.g.a.h / 2.0f)) - a < com.censivn.C3DEngine.b.b.a.C) {
            f3 = f4 + (((com.censivn.C3DEngine.b.b.a.C + a) + (com.tsf.shell.manager.g.a.h / 2.0f)) - f2);
        } else {
            f3 = f4 / 2.0f;
        }
        this.c = f < 0.0f;
        if (this.c) {
            d.position().x = 190.0f * com.censivn.C3DEngine.b.b.a.c;
        } else {
            d.position().x = (-190.0f) * com.censivn.C3DEngine.b.b.a.c;
        }
        d.position().y = f3;
        for (int i = 0; i < size; i++) {
            com.tsf.shell.e.e.f.d dVar = (com.tsf.shell.e.e.f.d) c.get(i);
            if (this.c) {
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
        ArrayList c = com.tsf.shell.manager.a.v.e.d().c();
        int numChildren = com.tsf.shell.manager.a.v.e.d().d().numChildren();
        int i = 0;
        while (i < numChildren) {
            a((com.tsf.shell.e.e.f.d) c.get((numChildren - i) - 1), i, i == numChildren + (-1));
            i++;
        }
    }

    private float c(com.tsf.shell.e.e.f.d dVar) {
        return this.c ? (80.0f * com.censivn.C3DEngine.b.b.a.c) + (com.censivn.C3DEngine.b.b.a.c * 60.0f) : ((-80.0f) * com.censivn.C3DEngine.b.b.a.c) - (com.censivn.C3DEngine.b.b.a.c * 60.0f);
    }

    private float d(com.tsf.shell.e.e.f.d dVar) {
        return this.c ? 80.0f * com.censivn.C3DEngine.b.b.a.c : (-80.0f) * com.censivn.C3DEngine.b.b.a.c;
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
        dVar.position().y = (-120.0f) * com.censivn.C3DEngine.b.b.a.c * i;
        dVar.d.position().x = d(dVar);
        x xVar = new x() { // from class: com.tsf.shell.e.d.c.a.e.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar.l(1.0f);
        xVar.m(1.0f);
        if (this.d && i2 != 0) {
            xVar.b(i2);
        }
        xVar.a(vVar);
        w.a(dVar);
        w.a(dVar, 300, xVar);
    }

    private void a(com.tsf.shell.e.e.f.d dVar, int i, boolean z) {
        x xVar;
        if (z) {
            xVar = new x();
        } else {
            xVar = new x();
        }
        xVar.l(0.0f);
        xVar.m(0.0f);
        w.a(dVar);
        w.a(dVar, 300, xVar);
    }
}
