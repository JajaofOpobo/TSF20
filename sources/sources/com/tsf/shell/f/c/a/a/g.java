package com.tsf.shell.f.c.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.c.a.a.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends e {
    public g() {
        this.c = 1;
    }

    @Override // com.tsf.shell.f.c.a.a.i, com.tsf.shell.f.c.a.a.a
    public void a(j jVar, j jVar2) {
        float fMaxY = jVar2.position().y + ((jVar2.maxY() - jVar2.minY()) * 0.5f) + jVar2.minY();
        PositionNumber3d positionNumber3dPosition = jVar.position();
        positionNumber3dPosition.y = ((fMaxY - jVar.position().y) * 0.15f) + positionNumber3dPosition.y;
        jVar.position().x = (-160.0f) * com.censivn.C3DEngine.b.b.a.b;
    }

    @Override // com.tsf.shell.f.c.a.a.e, com.tsf.shell.f.c.a.a.a
    public int b(float f, float f2) {
        return b(-f);
    }

    @Override // com.tsf.shell.f.c.a.a.e, com.tsf.shell.f.c.a.a.a
    public void a(com.censivn.C3DEngine.b.f.i iVar, float f, float f2, float f3) {
        iVar.setAABBPX(com.censivn.C3DEngine.b.b.a.b * (-83.0f), (-f3) + f2, 0.0f, 2.1474836E9f, 0.0f - f, 0.0f);
    }

    @Override // com.tsf.shell.f.c.a.a.i
    public float a(com.tsf.shell.f.c.a.d dVar, com.censivn.C3DEngine.b.f.i iVar, float f) {
        return dVar.a + (iVar.maxX() * f);
    }

    @Override // com.tsf.shell.f.c.a.a.i, com.tsf.shell.f.c.a.a.a
    public void a(com.tsf.shell.f.c.a.d dVar, com.censivn.C3DEngine.b.f.i iVar, float f, boolean z) {
        if (iVar instanceof com.tsf.shell.f.i.b.d.b) {
        }
        if (!this.d) {
            dVar.a = 0.0f + ((-iVar.maxX()) * f) + com.tsf.shell.f.c.a.f.q;
        } else if (z) {
            dVar.a = dVar.g - (iVar.maxX() * f);
        } else {
            dVar.a = ((-(iVar.maxX() + iVar.minX())) / 2.0f) * f;
        }
    }

    @Override // com.tsf.shell.f.c.a.a.i, com.tsf.shell.f.c.a.a.a
    public Number3d a(com.censivn.C3DEngine.b.f.i iVar) {
        Number3d.TEMPNUMBER3D.y = iVar.position().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.b.b.a.A + com.tsf.shell.f.c.a.f.b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.f.c.a.a.i, com.tsf.shell.f.c.a.a.a
    public Number3d b(com.censivn.C3DEngine.b.f.i iVar) {
        Number3d.TEMPNUMBER3D.y = iVar.position().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.b.b.a.A - com.tsf.shell.f.c.a.f.a;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.f.c.a.a.e, com.tsf.shell.f.c.a.a.a
    public a.C0080a a(com.censivn.C3DEngine.b.f.i iVar, float f, float f2, float f3, float f4) {
        float fAsin;
        a.C0080a c0080a = a.b;
        if ((com.censivn.C3DEngine.b.b.a.B - com.tsf.shell.f.c.a.f.a) - iVar.position().y > f) {
            fAsin = 180.0f;
        } else {
            fAsin = ((float) (Math.asin(r0 / f) / 0.017453292519943295d)) + 90.0f;
        }
        c0080a.a = f4;
        c0080a.b = ((fAsin - (f4 - f2)) + f2) - f3;
        c0080a.d = ((-180.0f) - (f4 / 2.0f)) + f2;
        c0080a.e = (((-180.0f) - (f4 - f2)) - (c0080a.b / 2.0f)) - f3;
        return c0080a;
    }

    @Override // com.tsf.shell.f.c.a.a.e, com.tsf.shell.f.c.a.a.a
    public int a(float f, float f2, float f3) {
        float f4 = 360.0f + f3;
        return (f <= f2 - 20.0f || f >= f2 + 20.0f) ? 1 : 2;
    }
}
