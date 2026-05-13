package com.tsf.shell.f.d.c.a;

import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.e.f.a;
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

    @Override // com.tsf.shell.f.d.c.a.d
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
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            if (i == 3) {
                dVar.a(runnable);
            }
            if (this.d) {
                dVar.b(i * 150);
            }
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.c.a(a4);
            com.censivn.C3DEngine.b.g.c.a(a4, 500, dVar);
        }
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(0.0f);
            dVar.m(0.0f);
            if (i == 3) {
                dVar.a(runnable);
            }
            com.censivn.C3DEngine.b.g.c.a(a2);
            com.censivn.C3DEngine.b.g.c.a(a2, 500, dVar);
        }
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void a(ArrayList<Integer> arrayList, float f, float f2) {
        float f3;
        ArrayList<a.c> c = com.tsf.shell.manager.a.v.e.d().c();
        j d = com.tsf.shell.manager.a.v.e.d().d();
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
            a.c cVar = c.get(i);
            if (this.c) {
                cVar.d.b(1);
            } else {
                cVar.d.b(2);
            }
            a(cVar, i, i * 50, com.censivn.C3DEngine.b.g.a.e);
            cVar.calAABB(2.0f, 1.2f, 1.0f);
        }
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void a() {
        ArrayList<a.c> c = com.tsf.shell.manager.a.v.e.d().c();
        int numChildren = com.tsf.shell.manager.a.v.e.d().d().numChildren();
        int i = 0;
        while (i < numChildren) {
            a(c.get((numChildren - i) - 1), i, i == numChildren + (-1));
            i++;
        }
    }

    private float c(a.c cVar) {
        return this.c ? (80.0f * com.censivn.C3DEngine.b.b.a.c) + (com.censivn.C3DEngine.b.b.a.c * 60.0f) : ((-80.0f) * com.censivn.C3DEngine.b.b.a.c) - (com.censivn.C3DEngine.b.b.a.c * 60.0f);
    }

    private float d(a.c cVar) {
        return this.c ? 80.0f * com.censivn.C3DEngine.b.b.a.c : (-80.0f) * com.censivn.C3DEngine.b.b.a.c;
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void a(a.c cVar) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(c(cVar));
        com.censivn.C3DEngine.b.g.c.a(cVar.d);
        com.censivn.C3DEngine.b.g.c.a(cVar.d, 250, dVar);
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void b(a.c cVar) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(d(cVar));
        com.censivn.C3DEngine.b.g.c.a(cVar.d);
        com.censivn.C3DEngine.b.g.c.a(cVar.d, 250, dVar);
    }

    private void a(a.c cVar, int i, int i2, com.censivn.C3DEngine.b.g.b bVar) {
        cVar.scale().x = 0.0f;
        cVar.scale().y = 0.0f;
        cVar.position().y = (-120.0f) * com.censivn.C3DEngine.b.b.a.c * i;
        cVar.d.position().x = d(cVar);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.c.a.e.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar.l(1.0f);
        dVar.m(1.0f);
        if (this.d && i2 != 0) {
            dVar.b(i2);
        }
        dVar.a(bVar);
        com.censivn.C3DEngine.b.g.c.a(cVar);
        com.censivn.C3DEngine.b.g.c.a(cVar, 300, dVar);
    }

    private void a(a.c cVar, int i, boolean z) {
        com.censivn.C3DEngine.b.g.d dVar;
        if (z) {
            dVar = new com.censivn.C3DEngine.b.g.d();
        } else {
            dVar = new com.censivn.C3DEngine.b.g.d();
        }
        dVar.l(0.0f);
        dVar.m(0.0f);
        com.censivn.C3DEngine.b.g.c.a(cVar);
        com.censivn.C3DEngine.b.g.c.a(cVar, 300, dVar);
    }
}
