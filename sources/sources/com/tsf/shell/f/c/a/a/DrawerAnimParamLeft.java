package com.tsf.shell.f.c.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerAnimParamLeft extends DrawerAnimConfig {
    public DrawerAnimParamLeft() {
        this.c = 3;
    }

    @Override // com.tsf.shell.f.c.a.a.DrawerAnimConfig
    public float a(int i, ArrayList<com.censivn.C3DEngine.b.f.IRenderable> arrayList, float f) {
        float fMaxX = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.IRenderable iVar = arrayList.get(i2);
            fMaxX += (iVar.maxX() - iVar.minX()) + f;
        }
        return fMaxX - f;
    }

    @Override // com.tsf.shell.f.c.a.a.DrawerAnimConfig
    public void a(j jVar, j jVar2) {
        jVar.position().x += (jVar2.position().x - jVar.position().x) * 0.15f;
        jVar.position().y = 138.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b;
    }

    @Override // com.tsf.shell.f.c.a.a.DrawerAnimConfig
    public float a(ArrayList<com.censivn.C3DEngine.b.f.IRenderable> arrayList, int i, float f, float f2, float f3, float f4) {
        if (i == 0) {
            return 1.0f;
        }
        float fMaxX = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.IRenderable iVar = arrayList.get(i2);
            fMaxX += (iVar.maxX() - iVar.minX()) + f4;
        }
        float f5 = ((f - f2) - f3) / (fMaxX - f4);
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        return f5;
    }

    @Override // com.tsf.shell.f.c.a.a.DrawerAnimConfig
    public void a(com.tsf.shell.f.c.a.DrawerState dVar, com.censivn.C3DEngine.b.f.IRenderable iVar, float f, boolean z) {
        if (iVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
        }
        if (!this.d) {
            dVar.b = (((-iVar.minY()) * f) - com.tsf.shell.f.c.a.DrawerContentPanel.o) - 0.0f;
        } else if (z) {
            dVar.b = dVar.g - (iVar.minY() * f);
        } else {
            dVar.b = ((-(iVar.maxY() + iVar.minY())) / 2.0f) * f;
        }
    }

    @Override // com.tsf.shell.f.c.a.a.DrawerAnimConfig
    public Number3d c() {
        Number3d.TEMPNUMBER3D.x = iVar.position().x;
        Number3d.TEMPNUMBER3D.y = (com.censivn.C3DEngine.b.b.ScreenConstants.C - com.tsf.shell.f.c.a.DrawerContentPanel.b) - com.censivn.C3DEngine.b.b.ScreenConstants.K;
        return Number3d.TEMPNUMBER3D;
    }

    @Override // com.tsf.shell.f.c.a.a.DrawerAnimConfig
    public Number3d d() {
        Number3d.TEMPNUMBER3D.x = iVar.position().x;
        Number3d.TEMPNUMBER3D.y = com.censivn.C3DEngine.b.b.ScreenConstants.C + com.tsf.shell.f.c.a.DrawerContentPanel.a;
        return Number3d.TEMPNUMBER3D;
    }

    public float a(com.tsf.shell.f.c.a.DrawerState dVar, com.censivn.C3DEngine.b.f.IRenderable iVar, float f) {
        return dVar.b + (iVar.minY() * f);
    }
}
