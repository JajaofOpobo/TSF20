package com.tsf.shell.f.c.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i extends a {
    public i() {
        this.c = 0;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public float a(int i, ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, float f) {
        float fMaxY = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.i iVar = arrayList.get(i2);
            fMaxY += (iVar.maxY() - iVar.minY()) + f;
        }
        return fMaxY - f;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public void a(j jVar, j jVar2) {
        float fMaxY = jVar2.position().y + ((jVar2.maxY() - jVar2.minY()) * 0.5f) + jVar2.minY();
        PositionNumber3d positionNumber3dPosition = jVar.position();
        positionNumber3dPosition.y = ((fMaxY - jVar.position().y) * 0.15f) + positionNumber3dPosition.y;
        jVar.position().x = 160.0f * com.censivn.C3DEngine.b.b.a.b;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public float a(ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, int i, float f, float f2, float f3, float f4) {
        if (i == 0) {
            return 1.0f;
        }
        float fMaxY = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.i iVar = arrayList.get(i2);
            fMaxY += (iVar.maxY() - iVar.minY()) + f4;
        }
        float f5 = ((f - f2) - f3) / (fMaxY - f4);
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        return f5;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public void a(com.tsf.shell.f.c.a.d dVar, com.censivn.C3DEngine.b.f.i iVar, float f, boolean z) {
        if (iVar instanceof com.tsf.shell.f.i.b.d.b) {
        }
        if (!this.d) {
            dVar.a = (((-iVar.minX()) * f) - com.tsf.shell.f.c.a.f.p) - 0.0f;
        } else if (z) {
            dVar.a = dVar.g - (iVar.minX() * f);
        } else {
            dVar.a = ((-(iVar.maxX() + iVar.minX())) / 2.0f) * f;
        }
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public Number3d a(com.censivn.C3DEngine.b.f.i iVar) {
        Number3d.TEMPNUMBER3D.y = iVar.position().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.b.b.a.z - com.tsf.shell.f.c.a.f.b;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public Number3d b(com.censivn.C3DEngine.b.f.i iVar) {
        Number3d.TEMPNUMBER3D.y = iVar.position().y;
        Number3d.TEMPNUMBER3D.x = com.censivn.C3DEngine.b.b.a.z + com.tsf.shell.f.c.a.f.a;
        return Number3d.TEMPNUMBER3D;
    }

    public float a(com.tsf.shell.f.c.a.d dVar, com.censivn.C3DEngine.b.f.i iVar, float f) {
        return dVar.a + (iVar.minX() * f);
    }
}
