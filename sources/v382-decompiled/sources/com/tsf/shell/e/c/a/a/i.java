package com.tsf.shell.e.c.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.l;

/* loaded from: classes.dex */
public class i extends g {
    public i() {
        this.c = 1;
    }

    @Override // com.tsf.shell.e.c.a.a.j, com.tsf.shell.e.c.a.a.a
    public void a(l lVar, l lVar2) {
        float maxY = lVar2.position().y + ((lVar2.maxY() - lVar2.minY()) * 0.5f) + lVar2.minY();
        PositionNumber3d position = lVar.position();
        position.y = ((maxY - lVar.position().y) * 0.15f) + position.y;
        lVar.position().x = (-160.0f) * com.censivn.C3DEngine.b.b.a.b;
    }

    @Override // com.tsf.shell.e.c.a.a.g, com.tsf.shell.e.c.a.a.a
    public int b(float f, float f2) {
        return b(-f);
    }

    @Override // com.tsf.shell.e.c.a.a.g, com.tsf.shell.e.c.a.a.a
    public void a(com.censivn.C3DEngine.b.f.j jVar, float f, float f2, float f3) {
        jVar.setAABBPX(com.censivn.C3DEngine.b.b.a.b * (-83.0f), 0.0f + f, 0.0f, 2.1474836E9f, f3 - f2, 0.0f);
    }

    @Override // com.tsf.shell.e.c.a.a.j
    public float a(com.tsf.shell.e.c.a.d dVar, com.censivn.C3DEngine.b.f.j jVar, float f) {
        return dVar.a + (jVar.maxX() * f);
    }

    @Override // com.tsf.shell.e.c.a.a.j, com.tsf.shell.e.c.a.a.a
    public void a(com.tsf.shell.e.c.a.d dVar, com.censivn.C3DEngine.b.f.j jVar, float f, boolean z) {
        if (!this.d) {
            dVar.a = 0.0f + ((-jVar.maxX()) * f) + com.tsf.shell.e.c.a.f.q;
        } else if (z) {
            dVar.a = dVar.g - (jVar.maxX() * f);
        } else {
            dVar.a = ((-(jVar.maxX() + jVar.minX())) / 2.0f) * f;
        }
    }

    @Override // com.tsf.shell.e.c.a.a.j, com.tsf.shell.e.c.a.a.a
    public Number3d a(com.censivn.C3DEngine.b.f.j jVar) {
        Number3d.TEMPNUMBER3D.y = jVar.position().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.b.b.a.A + com.tsf.shell.e.c.a.f.b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.e.c.a.a.j, com.tsf.shell.e.c.a.a.a
    public Number3d b(com.censivn.C3DEngine.b.f.j jVar) {
        Number3d.TEMPNUMBER3D.y = jVar.position().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.b.b.a.A - com.tsf.shell.e.c.a.f.a;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.e.c.a.a.g, com.tsf.shell.e.c.a.a.a
    public b a(com.censivn.C3DEngine.b.f.j jVar, float f, float f2, float f3, float f4) {
        float asin;
        b bVar = a.b;
        if (((-com.censivn.C3DEngine.b.b.a.C) - com.tsf.shell.e.c.a.f.a) + jVar.position().y > f) {
            asin = 180.0f;
        } else {
            asin = ((float) (Math.asin(r0 / f) / 0.017453292519943295d)) + 90.0f;
        }
        bVar.a = f4;
        bVar.b = ((asin - (f4 - f2)) + f2) - f3;
        bVar.d = ((f4 / 2.0f) + 0.0f) - f2;
        bVar.e = (f4 - f2) + 0.0f + (bVar.b / 2.0f) + f3;
        return bVar;
    }

    @Override // com.tsf.shell.e.c.a.a.g, com.tsf.shell.e.c.a.a.a
    public int a(float f, float f2, float f3) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        return (f <= f2 - 20.0f || f >= f2 + 20.0f) ? 1 : 2;
    }
}
