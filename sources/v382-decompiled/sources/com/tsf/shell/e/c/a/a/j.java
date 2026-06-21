package com.tsf.shell.e.c.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j extends a {
    public j() {
        this.c = 0;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public float a(int i, ArrayList arrayList, float f) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) arrayList.get(i2);
            f2 += (jVar.maxY() - jVar.minY()) + f;
        }
        return f2 - f;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public void a(l lVar, l lVar2) {
        float maxY = lVar2.position().y + ((lVar2.maxY() - lVar2.minY()) * 0.5f) + lVar2.minY();
        PositionNumber3d position = lVar.position();
        position.y = ((maxY - lVar.position().y) * 0.15f) + position.y;
        lVar.position().x = 160.0f * com.censivn.C3DEngine.b.b.a.b;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public float a(ArrayList arrayList, int i, float f, float f2, float f3, float f4) {
        if (i == 0) {
            return 1.0f;
        }
        float f5 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) arrayList.get(i2);
            f5 += (jVar.maxY() - jVar.minY()) + f4;
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
            dVar.a = (((-jVar.minX()) * f) - com.tsf.shell.e.c.a.f.p) - 0.0f;
        } else if (z) {
            dVar.a = dVar.g - (jVar.minX() * f);
        } else {
            dVar.a = ((-(jVar.maxX() + jVar.minX())) / 2.0f) * f;
        }
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public Number3d a(com.censivn.C3DEngine.b.f.j jVar) {
        Number3d.TEMPNUMBER3D.y = jVar.position().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.b.b.a.z - com.tsf.shell.e.c.a.f.b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public Number3d b(com.censivn.C3DEngine.b.f.j jVar) {
        Number3d.TEMPNUMBER3D.y = jVar.position().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.b.b.a.z + com.tsf.shell.e.c.a.f.a;
        return Number3d.TEMPNUMBER3D;
    }

    public float a(com.tsf.shell.e.c.a.d dVar, com.censivn.C3DEngine.b.f.j jVar, float f) {
        return dVar.a + (jVar.minX() * f);
    }
}
