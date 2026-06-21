package com.tsf.shell.e.c.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends a {
    public e() {
        this.c = 3;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public float a(int i, ArrayList arrayList, float f) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) arrayList.get(i2);
            f2 += (jVar.maxX() - jVar.minX()) + f;
        }
        return f2 - f;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public void a(l lVar, l lVar2) {
        lVar.position().x += (lVar2.position().x - lVar.position().x) * 0.15f;
        lVar.position().y = 138.0f * com.censivn.C3DEngine.b.b.a.b;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public float a(ArrayList arrayList, int i, float f, float f2, float f3, float f4) {
        if (i == 0) {
            return 1.0f;
        }
        float f5 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) arrayList.get(i2);
            f5 += (jVar.maxX() - jVar.minX()) + f4;
        }
        float f6 = ((f - f2) - f3) / (f5 - f4);
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return f6;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public void a(com.tsf.shell.e.c.a.d dVar, com.censivn.C3DEngine.b.f.j jVar, float f, boolean z) {
        boolean z2 = jVar instanceof com.tsf.shell.e.i.b.d.b;
        if (!this.d) {
            dVar.b = (((-jVar.minY()) * f) - com.tsf.shell.e.c.a.f.o) - 0.0f;
        } else if (z) {
            dVar.b = dVar.g - (jVar.minY() * f);
        } else {
            dVar.b = ((-(jVar.maxY() + jVar.minY())) / 2.0f) * f;
        }
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public Number3d a(com.censivn.C3DEngine.b.f.j jVar) {
        Number3d.TEMPNUMBER3D.x = jVar.position().x;
        Number3d.TEMPNUMBER3D.y = (com.censivn.C3DEngine.b.b.a.C - com.tsf.shell.e.c.a.f.b) - com.censivn.C3DEngine.b.b.a.K;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public Number3d b(com.censivn.C3DEngine.b.f.j jVar) {
        Number3d.TEMPNUMBER3D.x = jVar.position().x;
        Number3d.TEMPNUMBER3D.y = com.censivn.C3DEngine.b.b.a.C + com.tsf.shell.e.c.a.f.a;
        return Number3d.TEMPNUMBER3D;
    }

    public float a(com.tsf.shell.e.c.a.d dVar, com.censivn.C3DEngine.b.f.j jVar, float f) {
        return dVar.b + (jVar.minY() * f);
    }
}
